package life.majiang.community.dto;



import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:吴玉魁
 * @date:2019/10/10_9:58
 */
@Data
public class PaginationDTO<T> {
    private List<T> data;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;
        pages.add(page);
        for (int i = 1; i <=3; i++) {
            if(page - i > 0 ){
                pages.add(0,page - i );
            }
            if(page + i <= totalPage){
                pages.add(page + i);
            }
        }

        showPrevious = (page == 1)? false: true;
        showNext = (page == totalPage)?false: true;
        showFirstPage = (pages.contains(1))? false: true;
        showEndPage = (pages.contains(totalPage))? false: true;
    }
}

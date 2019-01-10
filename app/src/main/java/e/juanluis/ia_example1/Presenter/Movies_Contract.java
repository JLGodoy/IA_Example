package e.juanluis.ia_example1.Presenter;

import java.util.List;

import e.juanluis.ia_example1.Model.MoviesModel;

public interface Movies_Contract {

    interface IView_MoviesList{

        void _MoviesList(List<MoviesModel> moviesModel);
    }

    interface IPresenter_MoviesList{

    }


}

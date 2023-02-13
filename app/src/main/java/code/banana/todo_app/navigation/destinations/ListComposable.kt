package code.banana.todo_app.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import code.banana.todo_app.util.Constants.LIST_ARGUMENT_KEY
import code.banana.todo_app.util.Constants.LIST_SCREEN

/**
 * Created by Maksym Kovalchuk on 2/13/2023.
 */
fun NavGraphBuilder.listComposable(){
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){

    }
}
package seedu.parser;

import seedu.commands.AddMealCommand;
import seedu.commands.Command;
import seedu.commands.DeleteMealCommand;
import seedu.commands.ExitCommand;
import seedu.commands.UpdateUserCommand;
import seedu.commands.ViewUserCommand;
import seedu.commands.ListCommand;
import seedu.commands.NutritionCommand;
import seedu.commands.TrackCalorieCommand;
import seedu.commands.AddExerciseCommand;
import seedu.commands.FilterCaloriesCommand;
import seedu.exceptions.InvalidCommandException;
import seedu.exceptions.LifeTrackerException;

public class CommandParser {
    public static Command parse(String userInput) throws LifeTrackerException {
        String[] userInputArray = userInput.split(" ");
        String commandWord = userInputArray[0];
        Command command;

        switch(commandWord) {
        case "add":
            command = new AddMealCommand(commandWord, userInput);
            break;
        case "delete":
            command = new DeleteMealCommand(commandWord, userInput);
            break;
        case "bye":
            command = new ExitCommand();
            break;
        case "update":
            command = new UpdateUserCommand();
            break;
        case "view":
            command = new ViewUserCommand();
            break;
        case "list":
            command = new ListCommand(commandWord, userInput);
            break;
        case "filter":
            command = new FilterCaloriesCommand();
            break;
        case "nutrition":
            command = new NutritionCommand();
            break;
        case "exercise":
            command = new AddExerciseCommand(commandWord, userInput);
            break;
        case "track":
            command = new TrackCalorieCommand();
            break;
        default:
            throw new InvalidCommandException();
        }
        return command;
    }
}

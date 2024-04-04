package by.itstep.javatraining.revision.task;

/*	Task 03. Rectangular World (1) [прямоугольный мир]
 *
 *	В прямоугольном мире свинья, раскормленная до размеров параллелепипеда,
 *	лежит в квадратной луже грязи. Определите, полностью ли основание свиньи помещается
 *	в данную лужу или нет.
 *
 *	Примечание
 *  1) Не забудьте про "защиту от дурака": все входные данные должны быть больше нуля.
 *  В случае неверных данных необходимо возвратить значение false.
 *  2) Для решения задачи рекомендуется использовать только встроенные в язык Java операции.
 *
 *	Формат входных данных [input]
 *	Метод получает на вход три целых числа в диапазоне типа int: W (width), L (length),
 *  S (side) - ширину и длину прямоугольной свиньи, а также сторону квадратной лужи.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить одно из булевских значений: true или false.
 *
 *	[sample method input  1]: 4 6 5
 *	[sample method output 1]: false
 *
 *	[input  2]: 3 5 5
 *	[output 2]: true
 */

public class Task03 {
    public static boolean start(int width, int length, int side) {
    	if(width <= 0 || length <= 0 || side <= 0){
    		return false;
    	}
    	
    	boolean flag = true;
    	
    	flag = width > side && length > side;
    	
        return flag;
    }
}
package ListHomework;

/**
 *
 */
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * ���������� � ���������� ArrayList(�� ������ �������) � LinkedList(������ ������� ������)
 * ����������� � �������������� ���������� ��������� ���������� � ����������� ������ �� ���������� ������
 * */
public interface List<E> {



    /**
     * ��������� ������� � ����� ������
     * @param element ����������� �������
     * */

    void add(E element);

    /**
     * ��������� ������� � ������ �� ���������� �������
     * @param <b>element</b> ����������� �������
     * @param idx ������ �� �������� ���������� �������
     * @throws IndexOutOfBoundsException ���� ������ ������� �� ���������� �������
     *         (idx &lt; 0 || idx &gt; size())
     */

    void add(int idx, E element);

    /**
     * ���������� ������� �� ���������� �������
     *
     * @param idx ������ ������������� ��������
     * @return ������� �� ���������� �������
     * @throws IndexOutOfBoundsException ���� ������ ������� �� ���������� �������
     *         (idx &lt; 0 || idx &gt;= size())
     *
     */

    E get(int idx);

    /**
     * �������� ������� � ������ �� ���������� ������� ����� ���������
     *
     * @param idx ������ ����������� ��������
     * @param element ����� �������
     * @return ������� ������� ��������� �� ���������� ������� �� ���������
     * @throws IndexOutOfBoundsException ���� ������ ������� �� ���������� �������
     *         (idx &lt; 0 || idx &gt;= size())
     */

    E set(int idx, E element);

    /**
     * ������� ������� � ������ �� ���������� �������, ���������� ��������� �������
     *
     * @param idx ������ ���������� ��������
     * @return ��������� �������
     * @throws IndexOutOfBoundsException ���� ������ ������� �� ���������� �������
     *         (idx &lt; 0 || idx &gt;= size())
     */
    E remove(int idx);

    boolean remove(Object o);

    void removeIf(Predicate<E> prd);

    void forEach(Consumer<E> cons);

    //<T> List<T> map(Function<E, T> func);

    //E reduce(BiFunction<E, E, E> func, E initial);

    /**
     * ���������� ������ ������� ��������� �������� � ������ ���� -1 - ���� ������ �������� � ������ ���,
     * (��� c�������� ������������ ����� equals), ������� ������� ����� ���� null
     * @param o ������� �������, ����� ���� null
     * @return ������ ������� ��������� �������� � ������ ���� -1 - ���� ������ �������� � ������ ���
     */

    int indexOf(Object o);

    /**
     * ���������� ������ ���������� ��������� �������� � ������ ���� -1 - ���� ������ �������� � ������ ���,
     * (��� c�������� ������������ ����� equals), ������� ������� ����� ���� null
     * @param o ������� �������, ����� ���� null
     * @return ������ ������� ��������� �������� � ������ ���� -1 - ���� ������ �������� � ������ ���
     */

    int lastIndexOf(Object o);

    /**
     * ���������� true, ���� ���� ������ �������� ������� �������
     * @param o ������� �������
     *
     * @return true ���� ���� ������ �������� ������� �������
     */

    boolean contains(Object o);

    /**
     * ���������� ������ ���������� ���������� �������
     *
     * @param fromIdx ������ �������, ���������� � ���������
     * @param toIdx ������� �������, �� ���������� � ���������
     * @return ������ ���������� ���������� �������
     * @throws IndexOutOfBoundsException ��� ����� ������������ ��������� ��������
     *         (fromIdx &lt; 0 || toIdx &gt; size ||
     *         fromIdx &gt; toIdx)
     */

    //List<E> subList(int fromIdx, int toIdx);

    /**
     * ������� ��� �������� � ������
     */
    void clear();

    /**
     * ��������� ��� �������� � ����� ����� ������ �� ����������� ������
     *
     * @param list ������ ���������� ����������� � ���� ������ ��������
     * @return true ���� ���� ������ ��������� ����� ���������� ��������
     */

    //boolean addAll(List<? extends E> list);

    /**
     * ��������� ��� �������� � ���� ������ �� ����������� ������ �� ���������� �������
     *
     * @param list ������ ���������� ����������� � ���� ������ ��������
     * @param idx ������ � ������� ���������� �������
     * @return true ���� ���� ������ ��������� ����� ���������� ��������
     * @throws IndexOutOfBoundsException ���� ������ ������� �� ���������� �������
     *         (idx &lt; 0 || idx &gt;= size())
     */

    //boolean addAll(int idx, List<? extends E> c);

    /**
     * ���������� ���������� ��������� � ���� ������
     *
     * @return ���������� ��������� � ���� ������
     */
    int size();

    /**
     * ���������� true ���� � ���� ������ ��� ���������
     *
     * @return true ���� � ���� ������ ��� ���������
     */
    boolean isEmpty();

}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bec8c..0x1becc4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bec8c_0 {
    uint128_t field_0;
    char field_10;
} st_1bec8c_0;


st_1bec8c_0 * sub_1bec8c(unsigned long a0, st_1bec8c_0 *i, st_1bec8c_0 *a2, st_1bec8c_0 *iter)
{
    if (i == a2)
        return i;
    do
    {
        iter->field_0 = i->field_0;
        iter->field_10 = i->field_10;
        iter = (char *)&iter[1].field_0 + 7;
        i = (char *)&i[1].field_0 + 7;
    } while (i != a2);
    return a2;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c3d60..0x1c3da0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c3d60_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
} st_1c3d60_0;


st_1c3d60_0 * sub_1c3d60(unsigned long a0, st_1c3d60_0 *i, st_1c3d60_0 *a2, st_1c3d60_0 *iter)
{
    if (i == a2)
        return i;
    do
    {
        iter->field_0 = i->field_0;
        iter->field_8 = i->field_8;
        iter->field_10 = i->field_10;
        iter = (char *)&iter[1].field_0 + 7;
        i = (char *)&i[1].field_0 + 7;
    } while (i != a2);
    return a2;
}

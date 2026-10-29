/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18018..0x18050 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18018_0 {
    unsigned long long field_0;
    uint128_t field_8;
} st_18018_0;


st_18018_0 * sub_18018(unsigned long a0, st_18018_0 *i, st_18018_0 *a2, st_18018_0 *iter)
{
    if (i == a2)
        return i;
    do
    {
        iter->field_0 = i->field_0;
        *(int128_t *)&(&iter->field_0)[1] = *(int128_t *)&(&i->field_0)[1];
        iter = (char *)&iter->field_8 + 8;
        i = (char *)&i->field_8 + 8;
    } while (i != a2);
    return a2;
}

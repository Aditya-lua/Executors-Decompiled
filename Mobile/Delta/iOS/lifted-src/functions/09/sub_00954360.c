/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954360..0x9543a4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954360_0 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_954360_0 *field_10;
} st_954360_0;


st_954360_0 * sub_954360(st_954360_0 **a0, unsigned long long *a1)
{
    st_954360_0 *iter;  // x9
    st_954360_0 *v1;  // x8

    iter = *a0;
    if (!*a0)
        return 0;
    while (1)
    {
        v1 = iter;
        iter = iter->field_10;
        if (!iter)
            break;
        if (v1->field_0 == *a1)
        {
            iter = v1;
            break;
        }
    }
    if (v1->field_0 == *a1)
        return v1;
    return iter;
}

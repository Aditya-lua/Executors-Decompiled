/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954298..0x954340 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954298_0 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_954298_0 *field_10;
} st_954298_0;


st_954298_0 * sub_954298(st_954298_0 **a0, st_954298_0 *a1)
{
    st_954298_0 *v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10
    st_954298_0 *i;  // w10
    st_954298_0 *v4;  // x11
    unsigned long long v5;  // x10
    unsigned long long v6;  // x11

    v0 = *a0;
    if (v0)
    {
        v1 = __builtin_bswap64(v0->field_0);
        v2 = __builtin_bswap64(a1->field_0);
        i = (st_954298_0 *)(unsigned int)((v1 > v2) - (v2 > v1));
        if (i > 0)
        {
            v4 = 0;
        }
        else
        {
            v0 = v0;
            do
            {
                v4 = v0;
                if (!i)
                    return 0;
                v0 = v4->field_10;
                if (!v0)
                {
                    a1->field_10 = 0;
                    v4->field_10 = a1;
                    return a1;
                }
                v5 = __builtin_bswap64(v0->field_0);
                v6 = __builtin_bswap64(a1->field_0);
                i = (st_954298_0 *)(unsigned int)((v5 > v6) - (v6 > v5));
            } while (i < 1);
        }
        a1->field_10 = v0;
        if (!v4)
            a0 = a0;
        else
            a0 = &v4->field_10;
    }
    *a0 = a1;
    return a1;
}

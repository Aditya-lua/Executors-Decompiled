/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67e98..0x67ee8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_67e98_0 {
    char padding_0[8];
    long long field_8;
} st_67e98_0;


st_67e98_0 * sub_67e98(st_67e98_0 *a0, unsigned long a1)
{
    unsigned long i;  // x21
    st_67e98_0 *v3;  // x0
    st_67e98_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a0->field_8;
    v3 = a0;
    if (v3->field_8 != a1)
    {
        do
        {
            i -= 8;
            v3 = sub_687d8(i, 0);
        } while (i != a1);
    }
    v4 = v3;
    a0->field_8 = a1;
    return v4;
}

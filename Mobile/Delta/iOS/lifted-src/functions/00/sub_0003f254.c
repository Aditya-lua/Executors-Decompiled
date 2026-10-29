/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f254..0x3f298 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f254_0 {
    char padding_0[16];
    long long field_10;
} st_3f254_0;


st_3f254_0 * sub_3f254(st_3f254_0 *a0, unsigned long a1)
{
    unsigned long v2;  // x20
    st_3f254_0 *v3;  // x0
    unsigned long long v4;  // x21
    st_3f254_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    v3 = a0;
    if (a1)
    {
        v4 = a1 * 16;
        v3 = _bzero(v2, v4);
        v2 += v4;
    }
    v5 = v3;
    a0->field_10 = v2;
    return v5;
}

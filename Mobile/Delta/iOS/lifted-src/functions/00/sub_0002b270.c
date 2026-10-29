/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b270..0x2b2b4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2b270_0 {
    char padding_0[8];
    long long field_8;
} st_2b270_0;


st_2b270_0 * sub_2b270(st_2b270_0 *a0, unsigned long a1)
{
    unsigned long v2;  // x20
    st_2b270_0 *v3;  // x0
    unsigned long long v4;  // x21
    st_2b270_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0;
    if (a1)
    {
        v4 = a1 * 4;
        v3 = _bzero(v2, v4);
        v2 += v4;
    }
    v5 = v3;
    a0->field_8 = v2;
    return v5;
}

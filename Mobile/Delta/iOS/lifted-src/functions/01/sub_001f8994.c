/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f8994..0x1f89d0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f8994_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_1f8994_0;


st_1f8994_0 * sub_1f8994(st_1f8994_0 *a0, unsigned long a1)
{
    st_1f8994_0 *v2;  // x0
    st_1f8994_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1 > (unsigned long long)v2->field_10)
        v2 = sub_1eea50(a0, a1);
    v3 = v2;
    a0->field_8 = a1;
    return v3;
}

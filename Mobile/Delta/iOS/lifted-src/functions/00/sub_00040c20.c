/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40c20..0x40c6c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40c20_0 {
    char padding_0[40];
    long long field_28;
} st_40c20_0;


st_40c20_0 * sub_40c20(st_40c20_0 *a0)
{
    st_40c20_0 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_43360(&a0->padding_0[24], a0->field_28);
    sub_2219c(&a0->padding_0[24], 0);
    v0 = a0;
    sub_17470(&v0);
    return a0;
}

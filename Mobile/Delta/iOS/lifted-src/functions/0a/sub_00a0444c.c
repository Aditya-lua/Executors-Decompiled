/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0444c..0xa04518 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0444c_0 {
    struct st_a0444c_0 *field_0;
    char padding_8[12];
    unsigned int field_14;
    char padding_18[8];
    struct st_a0444c_0 *field_20;
} st_a0444c_0;


st_a0444c_0 * sub_a0444c(st_a0444c_0 *a0, unsigned int a1, unsigned int a2)
{
    st_a0444c_0 *v2;  // x8
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_lib.c", 190, "DSO_ctrl");
        v3 = 786690;
    }
    else if (a1 == 3)
    {
        a0->field_14 = a0->field_14 | a2;
        return 0;
    }
    else if (a1 != 2)
    {
        if (a1 == 1)
            return a0->field_14;
        v2 = a0->field_0;
        if (v2 && v2->field_20)
            goto *((void *)(v2->field_20));
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_lib.c", 210, "DSO_ctrl");
        v3 = 108;
    }
    else
    {
        a0->field_14 = a2;
        return 0;
    }
    sub_a36abc(37, v3, 0);
    return 0xffffffffffffffff;
}

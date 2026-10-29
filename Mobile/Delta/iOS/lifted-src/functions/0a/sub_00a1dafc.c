/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1dafc..0xa1dbcc (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1dafc_1 {
    struct st_a1dafc_0 *field_0;
    char padding_8[24];
    unsigned int field_20;
} st_a1dafc_1;

typedef struct st_a1dafc_0 {
    char field_0;
    char padding_1[3];
    unsigned int field_4;
} st_a1dafc_0;


char sub_a1dafc(st_a1dafc_1 *a0, st_a1dafc_0 **a1)
{
    st_a1dafc_0 *v2;  // x8
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!*(long long *)&v2[19] && !(v2->field_0 & 1))
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_oct.c", 114, "EC_POINT_oct2point");
        v3 = 786689;
    }
    else
    {
        if (v2 == *a1 && (!a0->field_20 || !(int)a1[1] || a0->field_20 == (int)a1[1]) && !(v2->field_0 & 1))
            goto *((void *)(*(long long *)&v2[19]));
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_oct.c", 118, "EC_POINT_oct2point");
        v3 = 101;
    }
    sub_a36abc(16, v3, 0);
    return 0;
}

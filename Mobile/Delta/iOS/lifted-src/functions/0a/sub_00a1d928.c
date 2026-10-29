/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1d928..0xa1d9f8 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1d928_1 {
    struct st_a1d928_0 *field_0;
    char padding_8[24];
    unsigned int field_20;
} st_a1d928_1;

typedef struct st_a1d928_0 {
    char field_0;
    char padding_1[3];
    unsigned int field_4;
} st_a1d928_0;


char sub_a1d928(st_a1d928_1 *a0, st_a1d928_0 **a1)
{
    st_a1d928_0 *v2;  // x8
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!*(long long *)&v2[0x11] && !(v2->field_0 & 1))
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_oct.c", 29, "EC_POINT_set_compressed_coordinates");
        v3 = 786689;
    }
    else
    {
        if (v2 == *a1 && (!a0->field_20 || !(int)a1[1] || a0->field_20 == (int)a1[1]) && !(v2->field_0 & 1))
            goto *((void *)(*(long long *)&v2[0x11]));
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_oct.c", 33, "EC_POINT_set_compressed_coordinates");
        v3 = 101;
    }
    sub_a36abc(16, v3, 0);
    return 0;
}

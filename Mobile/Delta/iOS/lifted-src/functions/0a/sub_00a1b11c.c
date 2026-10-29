/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b11c..0xa1b1a8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b11c_0 {
    char padding_0[112];
    long long field_70;
} st_a1b11c_0;


long long sub_a1b11c(st_a1b11c_0 **a0, st_a1b11c_0 **a1)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0->field_70)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 817, "EC_POINT_set_to_infinity");
        v2 = 786689;
    }
    else if (*a0 != *a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 821, "EC_POINT_set_to_infinity");
        v2 = 101;
    }
    else
    {
        goto *((void *)(*a0->field_70));
    }
    sub_a36abc(16, v2, 0);
    return 0;
}

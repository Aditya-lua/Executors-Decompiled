/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ac74..0xa1acc8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ac74_0 {
    char padding_0[40];
    long long field_28;
} st_a1ac74_0;


long long sub_a1ac74(st_a1ac74_0 **a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a0->field_28)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 563, "EC_GROUP_set_curve");
        sub_a36abc(16, 0xc0101, 0);
        return 0;
    }
    goto *((void *)(*a0->field_28));
}

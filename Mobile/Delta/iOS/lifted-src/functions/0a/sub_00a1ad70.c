/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ad70..0xa1adc4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ad70_0 {
    char padding_0[72];
    long long field_48;
} st_a1ad70_0;


long long sub_a1ad70(st_a1ad70_0 **a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a0->field_48)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 619, "EC_GROUP_check_discriminant");
        sub_a36abc(16, 0xc0101, 0);
        return 0;
    }
    goto *((void *)(*a0->field_48));
}

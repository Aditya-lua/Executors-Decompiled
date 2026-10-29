/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa145e8..0xa14638 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a145e8_1 {
    char padding_0[32];
    struct st_a145e8_0 *field_20;
} st_a145e8_1;

typedef struct st_a145e8_0 {
    char padding_0[40];
    long long field_28;
} st_a145e8_0;


long long sub_a145e8(st_a145e8_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_20->field_28)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8(a0->field_20);
        sub_a369bc("crypto/ec/ec_ameth.c", 430, "ec_pkey_check");
        sub_a36abc(16, 125, 0);
        return 0;
    }
}

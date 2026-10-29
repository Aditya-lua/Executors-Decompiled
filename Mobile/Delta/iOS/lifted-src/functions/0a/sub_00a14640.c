/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14640..0xa14694 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14640_0 {
    char padding_0[24];
    long long field_18;
} st_a14640_0;

typedef struct st_a14640_1 {
    char padding_0[32];
    struct st_a14640_0 *field_20;
} st_a14640_1;


long long sub_a14640(st_a14640_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_20->field_18)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8(0);
        sub_a369bc("crypto/ec/ec_ameth.c", 459, "ec_pkey_param_check");
        sub_a36abc(16, 124, 0);
        return 0;
    }
}

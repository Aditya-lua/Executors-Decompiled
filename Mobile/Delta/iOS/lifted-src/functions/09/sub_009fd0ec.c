/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd0ec..0x9fd13c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd0ec_1 {
    char padding_0[32];
    struct st_9fd0ec_0 *field_20;
} st_9fd0ec_1;

typedef struct st_9fd0ec_0 {
    char padding_0[112];
    long long field_70;
} st_9fd0ec_0;


long long sub_9fd0ec(st_9fd0ec_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_20->field_70)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8(a0->field_20, 0);
        sub_a369bc("crypto/dh/dh_ameth.c", 433, "dh_pkey_public_check");
        sub_a36abc(5, 125, 0);
        return 0;
    }
}

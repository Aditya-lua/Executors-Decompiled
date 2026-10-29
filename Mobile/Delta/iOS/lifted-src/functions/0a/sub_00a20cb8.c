/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20cb8..0xa20d10 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a20cb8_0 {
    char padding_0[120];
    long long field_78;
} st_a20cb8_0;


long long sub_a20cb8(st_a20cb8_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_78)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_mont.c", 282, "ossl_ec_GFp_mont_field_decode");
        sub_a36abc(16, 111, 0);
        return 0;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20c60..0xa20cb8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a20c60_0 {
    char padding_0[120];
    long long field_78;
} st_a20c60_0;


long long sub_a20c60(st_a20c60_0 *a0, unsigned long a1, unsigned long a2)
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
        sub_a369bc("crypto/ec/ecp_mont.c", 271, "ossl_ec_GFp_mont_field_encode");
        sub_a36abc(16, 111, 0);
        return 0;
    }
}

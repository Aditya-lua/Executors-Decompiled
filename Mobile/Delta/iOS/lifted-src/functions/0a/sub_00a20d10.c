/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20d10..0xa20d80 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a20d10_0 {
    char padding_0[128];
    long long field_80;
} st_a20d10_0;


long long sub_a20d10(st_a20d10_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_80)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_mont.c", 293, "ossl_ec_GFp_mont_field_set_to_one");
        sub_a36abc(16, 111, 0);
        return 0;
    }
    return sub_9e4c34(a1, a0->field_80) != 0;
}

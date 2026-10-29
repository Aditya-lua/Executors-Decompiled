/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa715c0..0xa71618 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a715c0_0 {
    char padding_0[32];
    struct st_a715c0_0 *field_20;
} st_a715c0_0;


st_a715c0_0 * sub_a715c0(st_a715c0_0 *a0, st_a715c0_0 *a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 && a1)
        a0->field_20 = 0;
    v0 = &v2;
    v1 = v3;
    sub_a368c8();
    sub_a369bc("crypto/params.c", 1453, "OSSL_PARAM_set_octet_string");
    sub_a36abc(15, 0xc0102, 0);
    return 0;
}

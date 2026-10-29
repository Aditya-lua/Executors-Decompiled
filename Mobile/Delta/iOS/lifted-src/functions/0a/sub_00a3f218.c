/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f218..0xa3f2ec (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3f218_0 {
    char padding_0[1];
    char field_1;
} st_a3f218_0;

extern char g_10002b0;

unsigned long long sub_a3f218(st_a3f218_0 *a0, unsigned int a1)
{
    unsigned long long v12;  // x0
    uint128_t v0;  // [bp-0xa8]
    uint128_t v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x7c]
    char v4;  // [bp-0x78]
    uint128_t v5;  // [bp-0x50]
    uint128_t v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x30]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v3 = a1;
    if (!a0 || !(a0->field_1 >> 3 & 1))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/dh_ctrl.c", 166, "EVP_PKEY_CTX_set_dh_pad");
        sub_a36abc(6, 147, 0);
        v12 = 0xfffffffe;
    }
    else
    {
        sub_a71bbc(sub_a70404("pad", &v3), &v3);
        v5 = v0;
        v6 = v1;
        v7 = v2;
        v12 = sub_a5df54(a0, &v4);
    }
    if (*(long long *)&g_10002b0 == v8)
        return v12;
    ___stack_chk_fail();
}

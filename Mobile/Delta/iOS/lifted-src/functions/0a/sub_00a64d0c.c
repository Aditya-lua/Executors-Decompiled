/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64d0c..0xa64e6c (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a64d0c_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_a64d0c_0;

extern char g_10002b0;

long long sub_a64d0c(long long a0, long long a1, long long a2, long long a3)
{
    long long v11;  // x0
    long long v12;  // x19
    st_a64d0c_0 *v13;  // x22
    uint128_t v0;  // [bp-0xe8]
    uint128_t v1;  // [bp-0xd8]
    unsigned long long v2;  // [bp-0xc8]
    char v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0x98]
    uint128_t v5;  // [bp-0x88]
    unsigned long long v6;  // [bp-0x78]
    uint128_t v7;  // [bp-0x70]
    unsigned long v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = sub_a537e4(a2, a0, a3);
    if (v11)
    {
        v12 = sub_a53488();
        sub_a53b90(v11);
        if (a1 && v12)
        {
            v13 = &v4;
            sub_a71618("digest", a1, 0);
            if (a3)
            {
                sub_a71618("properties", a3, 0);
                v4 = v0;
                v5 = v1;
                v6 = v2;
                v13 = &v7;
            }
            sub_a71bbc();
            v13->field_0 = v0;
            v13->field_10 = v1;
            v13->field_20 = v2;
            if (0 >= (int)sub_a537c8(v12, &v3))
            {
                sub_a53588(v12);
LABEL_a64e30:
                v12 = 0;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/hpke/hpke_util.c", 401, "ossl_kdf_ctx_create");
        sub_a36abc(15, 0x8010d, 0);
        goto LABEL_a64e30;
    }
    if (*(long long *)&g_10002b0 == v8)
        return v12;
    ___stack_chk_fail();
}

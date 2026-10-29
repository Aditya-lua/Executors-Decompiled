/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5e05c..0xa5e1f4 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned short sub_a5e05c(unsigned short a0, unsigned short *a1)
{
    unsigned short v16;  // x0
    uint128_t v0;  // [bp-0x108]
    uint128_t v1;  // [bp-0xf8]
    unsigned long long v2;  // [bp-0xe8]
    unsigned short v3;  // [bp-0xe0]
    unsigned short v4;  // [bp-0xd0]
    unsigned short v5;  // [bp-0xc0]
    unsigned short v6;  // [bp-0xb0]
    unsigned short v7;  // [bp-0xa0]
    char v8;  // [bp-0x88]
    uint128_t v9;  // [bp-0x60]
    uint128_t v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x40]
    unsigned long v12;  // [bp-0x38]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v3 = 0;
    if (a0 && *(short *)a0 & 49648)
    {
        if (*(long long *)(a0 + 48))
        {
            sub_a71bbc(sub_a71618("digest", &v3, 80), &v3, 80);
            v9 = v0;
            v10 = v1;
            v11 = v2;
            v16 = sub_a5dc18(a0, &v8);
            if (v16)
            {
                v16 = sub_a58d6c(*(long long *)(a0 + 8), &v3);
                if (v16)
                {
                    *(unsigned long long *)a1 = v16;
                    v16 = 1;
                }
            }
LABEL_a5e14c:
            if (*(long long *)&g_10002b0 == v12)
                return v16;
        }
        else
        {
            sub_a368c8(sub_a36c8c());
            sub_a369bc("crypto/evp/pmeth_lib.c", 1460, "evp_pkey_ctx_store_cached_data");
            sub_a36cd4(sub_a36abc(6, 147, 0), 147, 0);
        }
        ___stack_chk_fail();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_lib.c", 916, "EVP_PKEY_CTX_get_signature_md");
        sub_a36abc(6, 147, 0);
        v16 = 0xfffffffe;
        goto LABEL_a5e14c;
    }
}

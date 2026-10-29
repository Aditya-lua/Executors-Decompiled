/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0c6ec..0xb0c7c8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0c6ec_0 {
    struct st_b0c6ec_0 *field_0;
} st_b0c6ec_0;


st_b0c6ec_0 ** sub_b0c6ec(st_b0c6ec_0 **a0, st_b0c6ec_0 **a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v9;  // 4113
    long long v10;  // x1
    unsigned long long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (a0)
    {
        if (a1 && *a1)
        {
            v1 = v6;
            v2 = v7;
            v3 = &v5;
            v4 = v8;
            if (!sub_a6fbc4(a1, "size"))
                return 1;
            if (sub_a70ef8())
            {
                v9 = arm64g_calculate_condition(130, v0 - 65, 65, 0);
                if (v9 & 1)
                {
                    sub_b0c9b0(a0 + 30, (unsigned int)v0 & 0xff);
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("providers/implementations/digests/blake2_prov.c", 198, "ossl_blake2b_set_ctx_params");
                v10 = 218;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/digests/blake2_prov.c", 198, "ossl_blake2b_set_ctx_params");
                v10 = 103;
            }
            sub_a36abc(57, v10, 0);
            return 0;
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}

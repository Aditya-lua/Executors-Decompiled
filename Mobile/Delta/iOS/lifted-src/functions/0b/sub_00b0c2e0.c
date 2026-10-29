/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0c2e0..0xb0c370 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0c2e0_0 {
    struct st_b0c2e0_0 *field_0;
} st_b0c2e0_0;


st_b0c2e0_0 ** sub_b0c2e0(st_b0c2e0_0 **a0, st_b0c2e0_0 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        if (a1 && *a1)
        {
            v0 = v5;
            v1 = v6;
            v2 = &v4;
            v3 = v7;
            if (!sub_a6fbc4(a1, "size") || sub_a70210())
                return 1;
            sub_a368c8();
            sub_a369bc("providers/implementations/digests/blake2_prov.c", 197, "ossl_blake2s_get_ctx_params");
            sub_a36abc(57, 104, 0);
            return 0;
            return 1;
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}

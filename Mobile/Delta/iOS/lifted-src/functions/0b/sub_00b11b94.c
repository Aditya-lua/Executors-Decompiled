/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb11b94..0xb11c28 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b11b94_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b11b94_1;

typedef struct st_b11b94_0 {
    char padding_0[376];
    unsigned long long field_178;
    char padding_180[16];
    uint128_t field_190;
    unsigned long long field_1a0;
} st_b11b94_0;

extern st_b11b94_1 g_ed4dc8;
extern st_b11b94_1 g_ed4de0;
extern char g_f0d569;

double sub_b11b94(void)
{
    unsigned long v2;  // x0
    st_b11b94_0 *v3;  // x0
    st_b11b94_1 *v4;  // x8
    uint128_t v5;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(432, "providers/implementations/digests/sha3_prov.c", 686);
        if (v2)
        {
            sub_ac0974();
            v3 = v2;
            v3->field_178 = 0xffffffffffffffff;
            if ((char)g_f0d569 >= 0)
                v4 = &g_ed4de0.field_0;
            else
                v4 = &g_ed4dc8.field_0;
            v5 = v4->field_0;
            v3->field_190 = v5;
            v3->field_1a0 = v4->field_10;
        }
    }
    return (unsigned long long)v5;
}

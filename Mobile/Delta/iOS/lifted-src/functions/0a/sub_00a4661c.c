/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4661c..0xa466e8 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4661c_0 {
    char padding_0[280];
    unsigned long long field_118;
    unsigned long long field_120;
} st_a4661c_0;

extern unsigned long long g_9ed050;
extern unsigned long long g_9ed0d0;
extern unsigned long long g_9ed0e0;

unsigned long long sub_a4661c(long long a0, long long a1, unsigned long a2, unsigned long long a3)
{
    st_a4661c_0 *v2;  // x19
    unsigned int v3;  // w0
    unsigned long long v4;  // x8
    unsigned long long v5;  // 4118
    unsigned long long v6;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (sub_9ed06c(a1, sub_a50904(a0) * 8, v2) >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/e_camellia.c", 205, "camellia_init_key");
        sub_a36abc(6, 157, 0);
        return 0;
    }
    v3 = sub_a4fdf4(sub_a2d030(a0));
    v4 = &g_9ed050;
    if (v3 != 2)
        v4 = 0;
    if (!a3 && !(v5 = arm64g_calculate_condition(49, v3 - 3, 2, 0), v5 & 1))
        v6 = &g_9ed0e0;
    else
        v6 = &g_9ed0d0;
    v2->field_118 = v6;
    v2->field_120 = v4;
    return 1;
}

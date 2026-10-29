/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0799c..0xb07a50 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0799c_0 {
    char padding_0[48];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned int field_40;
    char padding_44[40];
    char field_6c;
    char padding_6d[67];
    long long field_b0;
} st_b0799c_0;

extern unsigned long long g_9ed050;
extern unsigned long long g_9ed0d0;
extern unsigned long long g_9ed0e0;

unsigned long long sub_b0799c(st_b0799c_0 *a0, long long a1, unsigned int a2)
{
    unsigned int v2;  // w20
    unsigned long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v5;  // 4118
    unsigned long long v6;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_40;
    v3 = &a0[1].padding_0[8];
    a0->field_b0 = v3;
    if (sub_9ed06c(a1, a2 * 8, v3) >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_camellia_hw.c", 30, "cipher_hw_camellia_initkey");
        sub_a36abc(57, 101, 0);
        return 0;
    }
    v4 = &g_9ed050;
    if (v2 != 2)
        v4 = 0;
    if (!(a0->field_6c >> 1 & 1) && !(v5 = arm64g_calculate_condition(145, v2 - 3, 3, 0), v5 & 1))
        v6 = &g_9ed0e0;
    else
        v6 = &g_9ed0d0;
    a0->field_30 = v6;
    a0->field_38 = v4;
    return 1;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa95f6c..0xa96014 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a95f6c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_a95f6c_0;

extern st_a95f6c_0 g_deff38;

void* sub_a95f6c(void* a0, unsigned long a1)
{
    unsigned long v0;  // x9
    unsigned long long *v1;  // x8
    unsigned long long *v10;  // x11
    unsigned long long v11;  // 4199
    unsigned long long v12;  // x8
    unsigned long long v13;  // x9
    unsigned long long *v2;  // x9
    unsigned long long v3;  // x10
    unsigned long long v4;  // x11
    unsigned long long v5;  // x9
    unsigned long v6;  // x12
    unsigned long long *v7;  // x13
    unsigned long long v8;  // x10
    unsigned long long v9;  // x11

    v0 = (char)a0[15];
    v1 = a1 + (v0 & 15) * 16;
    v2 = a1 + (v0 & 240);
    v3 = (&g_deff38.field_0)[v1[1] & 15] ^ *v1 >> 4 ^ *v2;
    v4 = v2[1] ^ (*v1 * 0x1000000000000000 | v1[1] >> 4);
    v5 = 14;
    do
    {
        v6 = *((char *)a0 + v5);
        v7 = a1 + (v6 & 15) * 16;
        v8 = (&g_deff38.field_0)[v4 & 15] ^ v3 >> 4 ^ *v7;
        v9 = v7[1] ^ (v3 * 0x1000000000000000 | v4 >> 4);
        v10 = a1 + (v6 & 240);
        v3 = (&g_deff38.field_0)[v9 & 15] ^ v8 >> 4 ^ *v10;
        v4 = v10[1] ^ (v8 * 0x1000000000000000 | v9 >> 4);
        v5 -= 1;
        v11 = arm64g_calculate_condition(50, v5, 2, 0);
    } while (v11 & 1);
    v12 = __builtin_bswap64(v3);
    v13 = __builtin_bswap64(v4);
    *(unsigned long long *)a0 = v12;
    *(unsigned long long *)&a0[8] = v13;
    return a0;
}

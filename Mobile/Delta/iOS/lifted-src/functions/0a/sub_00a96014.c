/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96014..0xa960e0 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a96014_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_a96014_0;

extern st_a96014_0 g_deff38;

void* sub_a96014(void* a0, unsigned long a1, char *a2, unsigned long long i)
{
    unsigned int v0;  // w9
    unsigned long long v1;  // x3
    unsigned long long v10;  // x10
    unsigned long long v11;  // x11
    unsigned long long *v12;  // x11
    unsigned long long v13;  // 4214
    unsigned long long v14;  // x9
    unsigned long long v15;  // x10
    unsigned long v2;  // x9
    unsigned long long *v3;  // x10
    unsigned long long *v4;  // x9
    unsigned long long v5;  // x10
    unsigned long long v6;  // x11
    unsigned long long v7;  // x9
    unsigned long v8;  // x12
    unsigned long long *v9;  // x13

    v0 = (char)a0[15];
    do
    {
        v1 = i;
        v2 = a2[15] ^ v0;
        v3 = a1 + (v2 & 15) * 16;
        v4 = a1 + (v2 & 240);
        v5 = (&g_deff38.field_0)[v3[1] & 15] ^ *v3 >> 4 ^ *v4;
        v6 = v4[1] ^ (*v3 * 0x1000000000000000 | v3[1] >> 4);
        v7 = 14;
        do
        {
            v8 = a2[v7] ^ *((char *)a0 + v7);
            v9 = a1 + (v8 & 15) * 16;
            v10 = (&g_deff38.field_0)[v6 & 15] ^ v5 >> 4 ^ *v9;
            v11 = v9[1] ^ (v5 * 0x1000000000000000 | v6 >> 4);
            v12 = a1 + (v8 & 240);
            v5 = (&g_deff38.field_0)[v11 & 15] ^ v10 >> 4 ^ *v12;
            v6 = v12[1] ^ (v10 * 0x1000000000000000 | v11 >> 4);
            v7 -= 1;
            v13 = arm64g_calculate_condition(50, v7, 2, 0);
        } while (v13 & 1);
        v14 = __builtin_bswap64(v5);
        v15 = __builtin_bswap64(v6);
        *(unsigned long long *)a0 = v14;
        *(unsigned long long *)&a0[8] = v15;
        a2 += 16;
        v0 = v15 >> 56;
        i = v1 - 16;
    } while (i);
    return a0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb04f74..0xb050d4 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b04f74_1 {
    char padding_0[248];
    unsigned long long field_f8;
} st_b04f74_1;

typedef struct st_b04f74_0 {
    char padding_0[48];
    unsigned long long field_30;
    char padding_38[16];
    unsigned long long field_48;
    char padding_50[28];
    char field_6c;
    char padding_6d[83];
    char field_c0;
    char padding_c1[247];
    unsigned long long field_1b8;
} st_b04f74_0;

extern unsigned long long g_9b8de4;
extern unsigned long long g_9b9120;
extern unsigned long long g_a98010;
extern unsigned long long g_a98184;
extern unsigned long long g_a98330;
extern unsigned long long g_a98544;

unsigned int sub_b04f74(st_b04f74_0 *a0, unsigned int a1, unsigned long long a2, unsigned int a3, long long a4, unsigned long a5, unsigned int a6)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // x9
    unsigned long long v4;  // x10
    unsigned long long v5;  // 4111
    unsigned long long v6;  // x8
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    long long v9;  // x1
    st_b04f74_1 *v10;  // x2
    unsigned long long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = a0->field_6c;
    a0->field_6c = (char)v2 & 253 | ((char)a6 * 2 | (char)(a6 >> 31)) & 2 & 3;
    v3 = &g_a98010;
    if (!a6)
        v3 = &g_a98184;
    v4 = &g_a98330;
    v5 = arm64g_calculate_condition(3, a6, 0, 0);
    if (v5 & 1)
        v4 = &g_a98544;
    if (!(v2 & 1))
        v6 = v3;
    else
        v6 = v4;
    a0->field_1b8 = v6;
    if (a3 && !sub_b5c520(a0, a3, a4))
        return 0;
    if (a1)
    {
        if (a0->field_48 == a2)
        {
            v7 = a0->field_6c;
            if (v7 & 64)
                v8 = !(v7 & 2);
            else
                v8 = (v7 * 0x80000000 | v7 >> 1) & 0x80000001 & 1;
            v9 = (unsigned int)a2 * 8;
            v10 = &a0->field_c0;
            if (v8)
            {
                sub_9b8880(a1, v9, v10);
                v11 = &g_9b8de4;
            }
            else
            {
                sub_9b8ba4(a1, v9, v10);
                v11 = &g_9b9120;
            }
            a0->field_30 = v11;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_wrp.c", 123, "aes_wrap_init");
            sub_a36abc(57, 105, 0);
            return 0;
        }
    }
}

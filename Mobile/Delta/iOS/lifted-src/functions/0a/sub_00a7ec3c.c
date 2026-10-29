/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7ec3c..0xa7edb4 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7ec3c_0 {
    struct st_a7ec3c_1 *field_0;
    unsigned long long field_8;
} st_a7ec3c_0;

typedef struct st_a7ec3c_1 {
    unsigned int field_0;
} st_a7ec3c_1;

extern char g_7fe005;
extern char _NSHomeDirectory;

unsigned int sub_a7ec3c(unsigned long a0, st_a7ec3c_0 *a1)
{
    unsigned int v0;  // x8
    unsigned long long v1;  // x10
    unsigned int v10;  // w15
    unsigned int v11;  // w14
    unsigned long v2;  // x10
    unsigned int *v3;  // x12
    unsigned int v4;  // w13
    unsigned int *v5;  // x12
    unsigned int v6;  // w15
    unsigned int v7;  // w14
    unsigned int v8;  // w15
    unsigned int v9;  // w14

    v0 = 0;
    v1 = a1->field_8;
    while (1)
    {
        v2 = v1 - 4;
        if (v1 < 4)
            return 0;
        v3 = a1->field_0;
        a1->field_0 = v3 + 1;
        a1->field_8 = v2;
        v4 = *v3;
        if (((v4 & 0x88888888) >> 1 | (v4 & 0x88888888) >> 2 | (v4 & 0x88888888) >> 3) & v4)
            return 0;
        v5 = a0 + v0;
        v6 = (v4 * 0x10000000 | v4 >> 4) & 4026531855 & 15;
        *v5 = ~((int)((unsigned int)(4 - (v4 & 15))) >> 31) & (unsigned int)(4 - (v4 & 15)) | (int)((unsigned int)(4 - (v4 & 15))) >> 31 & (unsigned int)&(&g_7fe005)[-1 * (v4 & 15)];
        v5[1] = ~((int)((unsigned int)(4 - v6)) >> 31) & (unsigned int)(4 - v6) | (int)((unsigned int)(4 - v6)) >> 31 & (unsigned int)&(&g_7fe005)[-1 * v6];
        v7 = (v4 * &_NSHomeDirectory | v4 >> 8) & 0xff00000f & 15;
        v8 = (v4 * 0x100000 | v4 >> 12) & 0xfff0000f & 15;
        v5[2] = ~((int)((unsigned int)(4 - v7)) >> 31) & (unsigned int)(4 - v7) | (int)((unsigned int)(4 - v7)) >> 31 & (unsigned int)&(&g_7fe005)[-1 * v7];
        v5[3] = ~((int)((unsigned int)(4 - v8)) >> 31) & (unsigned int)(4 - v8) | (int)((unsigned int)(4 - v8)) >> 31 & (unsigned int)&(&g_7fe005)[-1 * v8];
        v9 = (v4 * 0x10000 | v4 >> 16) & 0xffff000f & 15;
        v10 = (v4 * 0x1000 | v4 >> 20) & 0xfffff00f & 15;
        v5[4] = ~((int)((unsigned int)(4 - v9)) >> 31) & (unsigned int)(4 - v9) | (int)((unsigned int)(4 - v9)) >> 31 & (unsigned int)&(&g_7fe005)[-1 * v9];
        v5[5] = ~((int)((unsigned int)(4 - v10)) >> 31) & (unsigned int)(4 - v10) | (int)((unsigned int)(4 - v10)) >> 31 & (unsigned int)&(&g_7fe005)[-1 * v10];
        v11 = (v4 * 0x100 | v4 >> 24) & 0xffffff0f & 15;
        v5[6] = ~((int)((unsigned int)(4 - v11)) >> 31) & (unsigned int)(4 - v11) | (int)((unsigned int)(4 - v11)) >> 31 & (unsigned int)&(&g_7fe005)[-1 * v11];
        v5[7] = ~((int)((unsigned int)(4 - (v4 >> 28))) >> 31) & (unsigned int)(4 - (v4 >> 28)) | (int)((unsigned int)(4 - (v4 >> 28))) >> 31 & (unsigned int)&(&g_7fe005)[-1 * (v4 >> 28)];
        v0 += 32;
        v1 = v2;
        if (v0 == 0x400)
            return 1;
    }
}

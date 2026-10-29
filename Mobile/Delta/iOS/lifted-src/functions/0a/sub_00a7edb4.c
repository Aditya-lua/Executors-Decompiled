/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7edb4..0xa7ef38 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7edb4_1 {
    struct st_a7edb4_0 *field_0;
    unsigned long long field_8;
} st_a7edb4_1;

typedef struct st_a7edb4_0 {
    unsigned short field_0;
    char field_2;
} st_a7edb4_0;

extern char g_7fe003;

unsigned int sub_a7edb4(unsigned long a0, st_a7edb4_1 *a1)
{
    unsigned int v0;  // x8
    unsigned long long v1;  // x10
    unsigned int v10;  // w16
    unsigned int v11;  // w15
    unsigned long v2;  // x10
    st_a7edb4_0 *v3;  // x13
    unsigned int v4;  // w14
    unsigned int *v5;  // x13
    unsigned int v6;  // w16
    unsigned int v7;  // w15
    unsigned int v8;  // w16
    unsigned int v9;  // w15

    v0 = 0;
    v1 = a1->field_8;
    while (1)
    {
        v2 = v1 - 3;
        if (v1 < 3)
            return 0;
        v3 = a1->field_0;
        a1->field_0 = &v3[1];
        a1->field_8 = v2;
        v4 = v3->field_0 | v3->field_2 * 0x10000;
        if (((v4 & 0x924924) >> 1 | (v4 & 0x924924) >> 2) & v4)
            return 0;
        v5 = a0 + v0;
        v6 = (v4 * 0x20000000 | v4 >> 3) & 3758096391 & 7;
        *v5 = ~((int)((unsigned int)(2 - (v4 & 7))) >> 31) & (unsigned int)(2 - (v4 & 7)) | (int)((unsigned int)(2 - (v4 & 7))) >> 31 & (unsigned int)&(&g_7fe003)[-1 * (v4 & 7)];
        v5[1] = ~((int)((unsigned int)(2 - v6)) >> 31) & (unsigned int)(2 - v6) | (int)((unsigned int)(2 - v6)) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v6];
        v7 = (v4 * 0x4000000 | v4 >> 6) & 4227858439 & 7;
        v8 = (v4 * 0x800000 | v4 >> 9) & 0xff800007 & 7;
        v5[2] = ~((int)((unsigned int)(2 - v7)) >> 31) & (unsigned int)(2 - v7) | (int)((unsigned int)(2 - v7)) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v7];
        v5[3] = ~((int)((unsigned int)(2 - v8)) >> 31) & (unsigned int)(2 - v8) | (int)((unsigned int)(2 - v8)) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v8];
        v9 = (v4 * 0x100000 | v4 >> 12) & 0xfff00007 & 7;
        v10 = (v4 * 0x20000 | v4 >> 15) & 0xfffe0007 & 7;
        v5[4] = ~((int)((unsigned int)(2 - v9)) >> 31) & (unsigned int)(2 - v9) | (int)((unsigned int)(2 - v9)) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v9];
        v5[5] = ~((int)((unsigned int)(2 - v10)) >> 31) & (unsigned int)(2 - v10) | (int)((unsigned int)(2 - v10)) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v10];
        v11 = (v4 * 0x4000 | v4 >> 18) & 0xffffc007 & 7;
        v5[6] = ~((int)((unsigned int)(2 - v11)) >> 31) & (unsigned int)(2 - v11) | (int)((unsigned int)(2 - v11)) >> 31 & (unsigned int)&(&g_7fe003)[-1 * v11];
        v5[7] = ~((int)((unsigned int)(2 - (v4 >> 21))) >> 31) & (unsigned int)(2 - (v4 >> 21)) | (int)((unsigned int)(2 - (v4 >> 21))) >> 31 & (unsigned int)&(&g_7fe003)[-1 * (v4 >> 21)];
        v0 += 32;
        v1 = v2;
        if (v0 == 0x400)
            return 1;
    }
}

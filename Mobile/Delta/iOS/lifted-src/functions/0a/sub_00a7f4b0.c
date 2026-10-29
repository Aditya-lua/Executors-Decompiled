/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f4b0..0xa7f58c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7f4b0_1 {
    struct st_a7f4b0_0 *field_0;
    unsigned long long field_8;
} st_a7f4b0_1;

typedef struct st_a7f4b0_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned short field_8;
} st_a7f4b0_0;

extern char g_87e001;
extern char _NSHomeDirectory;

unsigned long long sub_a7f4b0(unsigned long a0, st_a7f4b0_1 *a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x10
    unsigned long v2;  // x10
    unsigned int *v3;  // x12
    st_a7f4b0_0 *v4;  // x14
    unsigned int v5;  // w15
    unsigned int v6;  // w13
    unsigned int v7;  // w14
    unsigned int v8;  // w15

    v0 = 0;
    v1 = a1->field_8;
    while (1)
    {
        v2 = v1 - 10;
        if (v1 < 10)
            return 0;
        v3 = a0 + v0;
        v4 = a1->field_0;
        a1->field_0 = &v4[1];
        a1->field_8 = v2;
        v5 = v4->field_0;
        v6 = v4->field_4;
        v7 = v4->field_8;
        *v3 = ~((int)((unsigned int)(0x80000 - (v5 & 0xfffff))) >> 31) & (unsigned int)(0x80000 - (v5 & 0xfffff)) | (int)((unsigned int)(0x80000 - (v5 & 0xfffff))) >> 31 & (unsigned int)&(&g_87e001)[-1 * (v5 & 0xfffff)];
        v3[1] = ~((int)((unsigned int)(0x80000 - ((v6 * 0x1000 | v5 >> 20) & 0xfffff))) >> 31) & (unsigned int)(0x80000 - ((v6 * 0x1000 | v5 >> 20) & 0xfffff)) | (int)((unsigned int)(0x80000 - ((v6 * 0x1000 | v5 >> 20) & 0xfffff))) >> 31 & (unsigned int)&(&g_87e001)[-1 * ((v6 * 0x1000 | v5 >> 20) & 0xfffff)];
        v8 = (v6 * &_NSHomeDirectory | v6 >> 8) & 0xff0fffff & 0xfffff;
        v3[2] = ~((int)((unsigned int)(0x80000 - v8)) >> 31) & (unsigned int)(0x80000 - v8) | (int)((unsigned int)(0x80000 - v8)) >> 31 & (unsigned int)&(&g_87e001)[-1 * v8];
        v3[3] = ~((int)((unsigned int)(0x80000 - (v7 * 16 | v6 >> 28))) >> 31) & (unsigned int)(0x80000 - (v7 * 16 | v6 >> 28)) | (int)((unsigned int)(0x80000 - (v7 * 16 | v6 >> 28))) >> 31 & (unsigned int)&(&g_87e001)[-1 * (v7 * 16 | v6 >> 28)];
        v0 += 16;
        v1 = v2;
        if ((unsigned int)v0 == 0x400)
            return 1;
    }
}

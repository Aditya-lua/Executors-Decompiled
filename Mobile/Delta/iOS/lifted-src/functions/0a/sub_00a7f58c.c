/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f58c..0xa7f670 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7f58c_1 {
    struct st_a7f58c_0 *field_0;
    unsigned long long field_8;
} st_a7f58c_1;

typedef struct st_a7f58c_0 {
    unsigned int field_0;
    unsigned int field_4;
    char field_8;
} st_a7f58c_0;

extern char g_81e001;

unsigned long long sub_a7f58c(unsigned long a0, st_a7f58c_1 *a1)
{
    unsigned long long v0;  // x10
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10
    unsigned long v3;  // x9
    st_a7f58c_0 *v4;  // x15
    unsigned int *v5;  // x13
    unsigned int v6;  // w16
    unsigned int v7;  // w14
    unsigned int v8;  // w15
    unsigned int v9;  // w16

    v0 = 0;
    v1 = a1->field_8;
    while (1)
    {
        v2 = v0;
        v3 = v1 - 9;
        if (v1 < 9)
            return 0;
        v4 = a1->field_0;
        a1->field_0 = &v4[1];
        a1->field_8 = v3;
        v5 = a0 + 8 + v2;
        v6 = v4->field_0;
        v7 = v4->field_4;
        v8 = v4->field_8;
        *(unsigned int *)((char *)v5 - 8) = ~((int)((unsigned int)(0x20000 - (v6 & 0x3ffff))) >> 31) & (unsigned int)(0x20000 - (v6 & 0x3ffff)) | (int)((unsigned int)(0x20000 - (v6 & 0x3ffff))) >> 31 & (unsigned int)&(&g_81e001)[-1 * (v6 & 0x3ffff)];
        *(unsigned int *)((char *)v5 - 4) = ~((int)((unsigned int)(0x20000 - ((v7 * 0x4000 | v6 >> 18) & 0x3ffff))) >> 31) & (unsigned int)(0x20000 - ((v7 * 0x4000 | v6 >> 18) & 0x3ffff)) | (int)((unsigned int)(0x20000 - ((v7 * 0x4000 | v6 >> 18) & 0x3ffff))) >> 31 & (unsigned int)&(&g_81e001)[-1 * ((v7 * 0x4000 | v6 >> 18) & 0x3ffff)];
        v9 = (v7 * 0x10000000 | v7 >> 4) & 0xf003ffff & 0x3ffff;
        v0 = v2 + 16;
        *v5 = ~((int)((unsigned int)(0x20000 - v9)) >> 31) & (unsigned int)(0x20000 - v9) | (int)((unsigned int)(0x20000 - v9)) >> 31 & (unsigned int)&(&g_81e001)[-1 * v9];
        v5[1] = ~((int)((unsigned int)(0x20000 - (v8 * 0x400 | v7 >> 22))) >> 31) & (unsigned int)(0x20000 - (v8 * 0x400 | v7 >> 22)) | (int)((unsigned int)(0x20000 - (v8 * 0x400 | v7 >> 22))) >> 31 & (unsigned int)&(&g_81e001)[-1 * (v8 * 0x400 | v7 >> 22)];
        v1 = v3;
        if (v2 >= 1008)
            return 1;
    }
}

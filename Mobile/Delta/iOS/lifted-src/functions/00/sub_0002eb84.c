/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2eb84..0x2f3b0 (2092 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2eb84_2 {
    unsigned int field_0;
} st_2eb84_2;

typedef struct st_2eb84_1 {
    char padding_0[96];
    struct st_2eb84_2 *field_60;
} st_2eb84_1;

typedef struct st_2eb84_0 {
    char field_0;
} st_2eb84_0;

extern unsigned long long g_e63868;

long long sub_2eb84(st_2eb84_1 *a0, unsigned long a1, int a2)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    unsigned int v26;  // w10
    unsigned long long v27;  // x11
    unsigned long long v28;  // x10
    unsigned long long v17;  // x26
    unsigned long long v18;  // x25
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    st_2eb84_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_2eb84_0 *v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    v26 = *(int *)((char *)a0->field_60 + a2 * 40);
    v27 = 96;
    if (!v26)
        v27 = 472;
    if (v26 == 1)
        v27 = 208;
    if (v26 == 2)
        v27 = 176;
    if (v26 == 3)
        v27 = 272;
    if (v26 == 4)
        v27 = 448;
    if (v26 == 5)
        v27 = 224;
    if (v26 == 6)
        v27 = 328;
    if (v26 == 7)
        v27 = 424;
    if (v26 == 8)
        v27 = 120;
    if (v26 == 9)
        v27 = 464;
    v28 = 456;
    if (v26 == 10)
        v27 = v28;
    goto *((void *)(*(long long *)((char *)&g_e63868 + v27)));
}

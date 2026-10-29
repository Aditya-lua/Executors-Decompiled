/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2abf10..0x2ac300 (1008 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2abf10_1 {
    char padding_0[20];
    unsigned int field_14;
    char padding_18[32];
    long long field_38;
    char padding_40[16];
    char field_50;
    char padding_51[63];
    unsigned long long field_90;
} st_2abf10_1;

typedef struct st_2abf10_0 {
    char field_0;
} st_2abf10_0;

extern unsigned long long g_e7c008;

void sub_2abf10(st_2abf10_1 *a0)
{
    unsigned long long v16;  // x26
    unsigned long long v17;  // x25
    unsigned int v26;  // w8
    unsigned long long v27;  // x9
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    unsigned long long *v25;  // x20
    st_2abf10_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_2abf10_0 *v1;  // [bp-0x70]
    st_2abf10_0 **v2;  // [bp-0x68], Other Possible Types: char
    st_2abf10_0 *v3;  // [bp-0x60]
    char v4;  // [bp-0x51]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = &v15;
    v14 = v24;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    sub_30d84(&a0->field_50);
    v25 = &a0->field_38;
    sub_c84c(v25, a0->field_38);
    v25[11] = 0xffffffffffffffff;
    v4 = *(int *)((char *)v25 - 36);
    sub_30594(v25, &v4);
    v26 = a0->field_14;
    v27 = 128;
    if (v26 == 45)
        v27 = 96;
    if (v26 == 48)
        v27 = 200;
    if (v26 - 49 < 9)
        v27 = 192;
    goto *((void *)(*(long long *)((char *)&g_e7c008 + v27)));
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aee88..0x2afc44 (3516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aee88_1 {
    char padding_0[32];
    unsigned int field_20;
} st_2aee88_1;

typedef struct st_2aee88_0 {
    char field_0;
} st_2aee88_0;

extern unsigned long long g_e7c248;

long long sub_2aee88(st_2aee88_1 *a0, unsigned long a1)
{
    unsigned long long v20;  // d9
    unsigned long long v21;  // d8
    unsigned long long v30;  // x20
    unsigned long long v31;  // x19
    unsigned long long v32;  // x30
    unsigned long long v33;  // x9
    unsigned int v34;  // w8
    unsigned long long v22;  // x28
    unsigned long long v23;  // x27
    unsigned long long v24;  // x26
    unsigned long long v25;  // x25
    unsigned long long v26;  // x24
    unsigned long long v27;  // x23
    unsigned long long v28;  // x22
    unsigned long long v29;  // x21
    st_2aee88_0 **v0;  // [bp-0x130], Other Possible Types: char
    st_2aee88_0 *v1;  // [bp-0x128]
    unsigned long long v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x88]
    unsigned long long v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x68]
    unsigned long long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x58]
    unsigned long long v9;  // [bp-0x50]
    unsigned long long v10;  // [bp-0x48]
    unsigned long long v11;  // [bp-0x40]
    unsigned long long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    char *v17;  // [bp-0x10]
    unsigned long long v18;  // [bp-0x8]
    char v19;  // [bp+0x0]

    v5 = v20;
    v6 = v21;
    v7 = v22;
    v8 = v23;
    v9 = v24;
    v10 = v25;
    v11 = v26;
    v12 = v27;
    v13 = v28;
    v14 = v29;
    v15 = v30;
    v16 = v31;
    v17 = &v19;
    v18 = v32;
    v1 = &v0;
    v0 = &v1;
    v33 = 800;
    v2 = 0;
    v3 = 0;
    v4 = 0;
    v34 = a0->field_20;
    if (v34 == 9)
        v33 = 408;
    if (v34 == 8)
        v33 = 192;
    if (v34 == 7)
        v33 = 384;
    if (v34 == 2)
        v33 = 880;
    if (v34 == 3)
        v33 = 816;
    if (v34 == 1)
        v33 = 400;
    if (v34 == 6)
        v33 = 112;
    if (v34 == 4)
        v33 = 368;
    if (v34 == 5)
        v33 = 248;
    if (v34 == 14)
        v33 = 760;
    if (v34 == 15)
        v33 = 304;
    goto *((void *)(*(long long *)((char *)&g_e7c248 + v33)));
}

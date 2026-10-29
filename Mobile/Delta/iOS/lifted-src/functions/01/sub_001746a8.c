/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1746a8..0x1747d8 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1746a8_0 {
    char field_0;
} st_1746a8_0;

typedef struct st_1746a8_2 {
    unsigned long long field_0;
} st_1746a8_2;

typedef struct st_1746a8_1 {
    char padding_0[488];
    struct st_1746a8_2 *field_1e8;
} st_1746a8_1;

extern st_1746a8_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1746a8(void)
{
    unsigned long long v29;  // d9
    unsigned long long v30;  // d8
    unsigned long long v31;  // x28
    unsigned long long v32;  // x27
    unsigned long long v33;  // x22
    unsigned long long v34;  // x21
    unsigned long long v35;  // x20
    unsigned long long v36;  // x19
    unsigned long long v37;  // x30
    unsigned long long v38;  // x0
    st_1746a8_0 **v0;  // [bp-0x250], Other Possible Types: char
    st_1746a8_0 *v1;  // [bp-0x248]
    st_1746a8_0 *v2;  // [bp-0x240]
    st_1746a8_0 **v3;  // [bp-0x238], Other Possible Types: char
    uint128_t v4;  // [bp-0x230]
    unsigned int v5;  // [bp-0x228]
    uint128_t v6;  // [bp-0x220]
    uint128_t v7;  // [bp-0x210]
    unsigned int v8;  // [bp-0x204]
    uint128_t v9;  // [bp-0x200]
    uint128_t v10;  // [bp-0x1f0]
    uint128_t v11;  // [bp-0x1e0]
    float v12;  // [bp-0x1e0]
    float v13;  // [bp-0x1dc]
    uint128_t v14;  // [bp-0x1d0]
    uint128_t v15;  // [bp-0x1c0]
    uint128_t v16;  // [bp-0x60]
    unsigned long v17;  // [bp-0x58]
    unsigned long long v18;  // [bp-0x50]
    unsigned long long v19;  // [bp-0x48]
    unsigned long long v20;  // [bp-0x40]
    unsigned long long v21;  // [bp-0x38]
    unsigned long long v22;  // [bp-0x30]
    unsigned long long v23;  // [bp-0x28]
    unsigned long long v24;  // [bp-0x20]
    unsigned long long v25;  // [bp-0x18]
    char *v26;  // [bp-0x10]
    unsigned long long v27;  // [bp-0x8]
    char v28;  // [bp+0x0]

    v18 = v29;
    v19 = v30;
    v20 = v31;
    v21 = v32;
    v22 = v33;
    v23 = v34;
    v24 = v35;
    v25 = v36;
    v26 = &v28;
    v27 = v37;
    v17 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v38 = sub_16b618();
    v2 = &v3;
    v3 = &v2;
    v15 = 0;
    v11 = 0;
    v14 = 0;
    v9 = 0;
    v10 = 0;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 2;
    v8 = 1;
    v12 = (float)(int)v38;
    v13 = (float)(int)(v38 >> 32);
    v16 = 0;
    g_f0d3d8->field_1e8();
}

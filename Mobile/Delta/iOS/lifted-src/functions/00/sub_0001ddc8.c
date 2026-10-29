/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ddc8..0x1e428 (1632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ddc8_1 {
    char padding_0[128];
    unsigned int field_80;
} st_1ddc8_1;

typedef struct st_1ddc8_0 {
    char field_0;
} st_1ddc8_0;

extern unsigned long long g_e61fe0;
extern char g_10002b0;

long long sub_1ddc8(st_1ddc8_1 *a0)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned int v19;  // w8
    unsigned long long v20;  // x9
    unsigned long long v21;  // x8
    st_1ddc8_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_1ddc8_0 *v1;  // [bp-0xb8]
    unsigned long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = &v11;
    v10 = v18;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v19 = a0->field_80;
    v20 = 272;
    if (v19 == 300)
        v20 = 384;
    if (v19 == 311)
        v20 = 336;
    if (v19 == 293)
        v20 = 208;
    if (v19 == 298)
        v20 = 216;
    if (v19 == 306)
        v20 = 144;
    if (v19 == 299)
        v20 = 320;
    if (v19 == 302)
        v20 = 408;
    if (v19 == 307)
        v20 = 304;
    if (v19 == 292)
        v20 = 80;
    v21 = 312;
    if ((v19 & 0xfffffffe) == 284)
        v20 = v21;
    goto *((void *)(*(long long *)((char *)&g_e61fe0 + v20)));
}

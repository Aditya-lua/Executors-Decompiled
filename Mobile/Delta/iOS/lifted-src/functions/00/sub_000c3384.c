/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3384..0xc378c (1032 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3384_0 {
    char field_0;
} st_c3384_0;

extern char g_10002b0;

long long sub_c3384(uint128_t *a0)
{
    unsigned long long v16;  // x26
    unsigned long long v17;  // x25
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    st_c3384_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_c3384_0 *v1;  // [bp-0x88]
    uint128_t v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x58]
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
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = *a0;
    v3 = a0[1];
    sub_c3418(); /* do not return */
}

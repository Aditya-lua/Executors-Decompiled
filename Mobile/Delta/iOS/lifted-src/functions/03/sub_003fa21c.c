/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3fa21c..0x3fa3b0 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3fa21c_0 {
    char field_0;
} st_3fa21c_0;

extern unsigned long long g_e7fb00;

void sub_3fa21c(char *a0, unsigned long a1)
{
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    unsigned int v21;  // w8
    unsigned int v22;  // w8
    st_3fa21c_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_3fa21c_0 *v1;  // [bp-0x60], Other Possible Types: char
    unsigned long long v2;  // [bp-0x58]
    char *v3;  // [bp-0x50]
    char v4;  // [bp-0x41]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = &v13;
    v12 = v20;
    v1 = &v0;
    v0 = &v1;
    sub_2a6e94(a0 + 8, *a0);
    v21 = ((char)v1 & ~(char)v0) * 2 + ((char)v0 & ~(char)v1) * 2 + (~((char)v1 - (char)v0) - ((char)v0 & ~(char)v1) * 2 & (unsigned int)((char)v1 - (char)v0 - ((char)v1 & ~(char)v0) * 2)) * 2 + ((char)v1 - (char)v0 + ((char)v0 & ~(char)v1) * 2 & (unsigned int)((char)v1 - (char)v0 - ((char)v1 & ~(char)v0) * 2)) * 2;
    v0 = (char)~((v21 * 2 & 4) + (v21 ^ 3)) + (((char)v21 * 2 & 4) + ((char)v21 ^ 3)) * 2;
    v1 = (char)v21 | 1;
    v22 = (v1 + 1 ^ v0) + (v1 + 1 & v0) * 2;
    *a0 = (char)~v22 + (char)v22 * 2;
    v2 = sub_10a00(&v4, 1);
    v3 = &v4;
    (g_e7fb00 - 0x1bb9e700)();
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52c0cc..0x52cb88 (2748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52c0cc_0 {
    char field_0;
} st_52c0cc_0;

typedef struct st_52c0cc_1 {
    char padding_0[16];
    char field_10;
} st_52c0cc_1;

extern unsigned long long g_e82428;
extern st_52c0cc_1 *g_f0d538;

void sub_52c0cc(unsigned long a0)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned int v21;  // w10
    unsigned int v22;  // w9
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    unsigned int v18;  // w9
    unsigned int v19;  // w11
    unsigned int v20;  // w9
    st_52c0cc_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_52c0cc_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    v1 = &v0;
    v0 = &v1;
    v18 = (char)v0;
    v19 = v18 + (-(v18 * 2) & 0xffffffa6) + (-(v18 * 2) & 88) + ((83 & ~v18) + 1 ^ v18 - 84) * 2 + ((83 & ~v18) + 1 & v18 - 84) * 4 + 83;
    v20 = v18 + v19 + 1;
    v21 = v20 + (-v18 & ~v19) * 2 + (unsigned int)(v19 - v18 - (v19 | -v18)) * 2 + (v19 * 3 + ~v19 * 4 + 3 & v18) * 2 - 1;
    v22 = (v20 | 0xfffffffe) + (((v21 ^ 2) - 1) * 2 & 4) + ((v21 ^ 2) - 1 + (v21 * 2 & 4) ^ 2);
    g_f0d538->field_10 = (((char)-v22 | 1) ^ (char)v22) + (((char)-v22 | 1) & (char)v22) * 2;
    (g_e82428 - 0xf64a6200)();
}

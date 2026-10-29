/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50fc10..0x510b14 (3844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50fc10_0 {
    char field_0;
} st_50fc10_0;

extern unsigned long long g_f0d3e0;

void sub_50fc10(unsigned long long a0)
{
    unsigned long long v18;  // x28
    unsigned long long v19;  // x27
    unsigned long long v28;  // x30
    unsigned long long v29;  // x9
    unsigned long long v30;  // x10
    unsigned long long v31;  // x8
    unsigned long long v20;  // x26
    unsigned long long v21;  // x25
    unsigned long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    unsigned long long v0;  // [bp-0x90]
    st_50fc10_0 **v1;  // [bp-0x80], Other Possible Types: char
    st_50fc10_0 *v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = &v17;
    v16 = v28;
    v0 = a0;
    v2 = &v1;
    v1 = &v2;
    v4 = 9708756365938969474;
    v3 = 9708756365938969594;
    v29 = (v4 ^ -v3) + (v4 & -v3 | v3 & ~v4) * 2;
    v30 = g_f0d3e0 + (v29 | ~g_f0d3e0) + 1;
    v31 = v30 + (v29 ^ g_f0d3e0) + 1;
    (*(long long *)((v31 ^ v30) + (v31 & v30) * 2 - 1))();
}

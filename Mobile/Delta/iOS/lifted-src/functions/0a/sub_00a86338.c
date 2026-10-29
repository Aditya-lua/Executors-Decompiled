/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa86338..0xa8668c (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_a86338(unsigned long long a0, unsigned long long *a1, char *a2, uint128_t *a3, unsigned int a4, unsigned long long a5, unsigned long long a6)
{
    unsigned long long v24;  // x28
    unsigned long long v25;  // x27
    unsigned long long v34;  // x30
    char v35;  // x8
    unsigned long long v26;  // x26
    unsigned long long v27;  // x25
    unsigned long long v28;  // x24
    unsigned long long v29;  // x23
    unsigned long long v30;  // x22
    unsigned long long v31;  // x21
    unsigned long long v32;  // x20
    unsigned long long v33;  // x19
    uint128_t v0;  // [bp-0xf0]
    uint128_t v1;  // [bp-0xe0]
    unsigned long long v2;  // [bp-0xc8]
    unsigned long long v3;  // [bp-0xc0]
    unsigned long long v4;  // [bp-0xa8]
    unsigned long long v5;  // [bp-0xa0]
    unsigned int v6;  // [bp-0x94]
    uint128_t v7;  // [bp-0x90]
    uint128_t v8;  // [bp-0x80]
    char v9;  // [bp-0x70]
    unsigned long v10;  // [bp-0x68]
    unsigned long long v11;  // [bp-0x60]
    unsigned long long v12;  // [bp-0x58]
    unsigned long long v13;  // [bp-0x50]
    unsigned long long v14;  // [bp-0x48]
    unsigned long long v15;  // [bp-0x40]
    unsigned long long v16;  // [bp-0x38]
    unsigned long long v17;  // [bp-0x30]
    unsigned long long v18;  // [bp-0x28]
    unsigned long long v19;  // [bp-0x20]
    unsigned long long v20;  // [bp-0x18]
    char *v21;  // [bp-0x10]
    unsigned long long v22;  // [bp-0x8]
    char v23;  // [bp+0x0]

    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = &v23;
    v22 = v34;
    v4 = a5;
    v5 = a6;
    v10 = *(long long *)&g_10002b0;
    v7 = *a3;
    v8 = a3[1];
    v2 = a0 + 2;
    v3 = a0;
    v0 = CONCAT(937044495634074881, 937044495634074881);
    v1 = CONCAT(21642340209583, 21642340209583);
    v6 = a4;
    v35 = *a2;
    *a2 = v35 + 1;
    v9 = v35;
    a1();
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d15e4..0x3d1bb0 (1484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d15e4_0 {
    char field_0;
} st_3d15e4_0;

extern unsigned long long g_e7ed40;
extern char g_10002b0;

long long sub_3d15e4(unsigned long a0, unsigned int a1)
{
    unsigned long long v16;  // x28
    unsigned long long v17;  // x27
    unsigned long long v26;  // x30
    unsigned long long v27;  // x8
    unsigned long long v18;  // x26
    unsigned long long v19;  // x25
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    st_3d15e4_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_3d15e4_0 *v1;  // [bp-0xb8]
    unsigned long v2;  // [bp-0x68]
    unsigned long long v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
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

    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = &v15;
    v14 = v26;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v27 = 312;
    if (a1 == 0xff)
        v27 = 184;
    if (a1 == 0xdd)
        v27 = 520;
    if (a1 == 219)
        v27 = 96;
    if (a1 == 196)
        v27 = 240;
    goto *((void *)(*(long long *)((char *)&g_e7ed40 + v27)));
}

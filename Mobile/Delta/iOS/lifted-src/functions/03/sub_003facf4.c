/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3facf4..0x3fbbb8 (3780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3facf4_0 {
    char field_0;
} st_3facf4_0;

extern unsigned long long g_e810d8;

long long sub_3facf4(unsigned long a0, char *a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    unsigned int v26;  // w8
    unsigned long long v27;  // x9
    unsigned long long v28;  // x8
    unsigned long long v17;  // x26
    unsigned long long v18;  // x25
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    st_3facf4_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_3facf4_0 *v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    v26 = *a1;
    v27 = 416;
    if (v26 == 1)
        v27 = 48;
    if (v26 == 2)
        v27 = 208;
    if (v26 == 3)
        v27 = 200;
    if (v26 == 8)
        v27 = 344;
    if (v26 == 4)
        v27 = 304;
    if (v26 == 5)
        v27 = 32;
    if (v26 == 6)
        v27 = 128;
    if (v26 == 7)
        v27 = 328;
    if (v26 == 9)
        v27 = 264;
    v28 = 184;
    if (!v26)
        v27 = v28;
    goto *((void *)(*(long long *)((char *)&g_e810d8 + v27)));
}

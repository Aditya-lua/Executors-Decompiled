/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfccc..0xbfed0 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e6ca70;

long long sub_bfccc(unsigned long a0, unsigned long a1, unsigned long a2, unsigned int a3, unsigned int a4, unsigned long a5, unsigned long a6)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    unsigned int v24;  // w8
    unsigned int v25;  // w9
    unsigned long long v26;  // x10
    unsigned long long v27;  // x9
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    v24 = a4 - a3;
    v25 = v24 & 31;
    v26 = 56;
    if (!(v24 & 31))
        v26 = 72;
    if (v25 == 1)
        v26 = 8;
    if (v25 == 2)
        v26 = 16;
    v27 = 40;
    if (v25 == 3)
        v26 = v27;
    goto *((void *)(*(long long *)((char *)&g_e6ca70 + v26)));
}

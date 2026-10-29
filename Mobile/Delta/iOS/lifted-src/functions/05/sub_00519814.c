/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x519814..0x51ca00 (12780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_519814_0 {
    char field_0;
} st_519814_0;

extern unsigned long long g_e82018;
extern char g_10002b0;

void sub_519814(unsigned long long a0)
{
    unsigned long long v20;  // x28
    unsigned long long v21;  // x27
    unsigned long long v30;  // x30
    st_519814_0 *v31;  // x8
    st_519814_0 **v32;  // x9
    unsigned long long v33;  // x10
    unsigned long long v34;  // x11
    unsigned long long v35;  // x8
    unsigned long long v36;  // x8
    unsigned int v37;  // w8
    unsigned long long v38;  // x9
    unsigned long long v22;  // x26
    unsigned long long v23;  // x25
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x21
    unsigned long long v28;  // x20
    unsigned long long v29;  // x19
    unsigned long long v0;  // [bp-0x130]
    unsigned long long v1;  // [bp-0x128]
    unsigned long long v2;  // [bp-0x100]
    unsigned int v3;  // [bp-0xb4]
    st_519814_0 **v4;  // [bp-0xb0], Other Possible Types: unsigned long long, char
    st_519814_0 *v5;  // [bp-0xa8], Other Possible Types: unsigned int, unsigned long
    unsigned long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x58]
    unsigned long long v9;  // [bp-0x50]
    unsigned long long v10;  // [bp-0x48]
    unsigned long long v11;  // [bp-0x40]
    unsigned long long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    char *v17;  // [bp-0x10]
    unsigned long long v18;  // [bp-0x8]
    char v19;  // [bp+0x0]

    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = &v19;
    v18 = v30;
    v6 = *(long long *)&g_10002b0;
    v5 = &v4;
    v4 = &v5;
    v2 = a0;
    v1 = sub_6b08();
    v31 = v5;
    v32 = v4;
    v33 = v32 | v31;
    v34 = (&(~v31)[-1 * (v32 | ~v31)] ^ v33) + (&(~v31)[-1 * (v32 | ~v31)] & v33) * 2;
    v35 = -((v33 ^ -(v32 & v31)) + (v33 & -(v32 & v31)) * 2);
    v36 = (v35 ^ v34) + (v34 + (v35 | ~v34)) * 2;
    v4 = v36 + 46;
    v5 = (20 | ~(v36 + 2)) - (v36 + 2 & 20) + (v36 + 2) * 2 + 21;
    v0 = (v4 | v5) + (v5 & v4);
    v37 = ((unsigned int)v5 | ~(unsigned int)v4) + (unsigned int)v4 + (unsigned int)((unsigned int)v5 - (unsigned int)v4 - ((unsigned int)v4 | (unsigned int)v5)) + ((unsigned int)v4 & ~(unsigned int)v5) * 2;
    v4 = (189562106 | ~(v37 + 1)) - (v37 + 1 & 189562106) + (v37 + 1) * 2 + 189562107;
    v5 = v37 + 279236357;
    v3 = v4 + (v5 | ~v4) + (v5 | v4) + 1;
    if (v3 == 0x1bf14bfe)
        v38 = 16;
    else
        v38 = 8;
    if (v3 == 1693737495)
        v38 = 32;
    if (v3 == 239370503)
        v38 = 64;
    if (v3 == 0x39fef017)
        v38 = 48;
    if (v3 == 1958097972)
        v38 = 104;
    if (v3 == 1083776762)
        v38 = 96;
    if (v3 == 2121554684)
        v38 = 0;
    if (v3 == 1980564595)
        v38 = 112;
    if (v3 == 1449808558)
        v38 = 88;
    if (v3 == 3532879702)
        v38 = 56;
    if (v3 == 2868316501)
        v38 = 80;
    if (v3 == 1304270972)
        v38 = 120;
    if (v3 == 1131400287)
        v38 = 72;
    if (v3 == 989491272)
        v38 = 24;
    goto *((void *)(*(long long *)((char *)&g_e82018 + v38)));
}

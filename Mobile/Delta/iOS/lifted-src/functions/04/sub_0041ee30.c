/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41ee30..0x41f0c0 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41ee30_0 {
    char field_0;
} st_41ee30_0;

extern unsigned long long g_e7fc70;
extern unsigned long long g_e7fc80;

void sub_41ee30(unsigned long long *a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v13;  // x26
    unsigned long long v14;  // x25
    st_41ee30_0 **v23;  // x10
    unsigned long long v24;  // x10
    unsigned long long v25;  // x9
    unsigned long long v15;  // x24
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    st_41ee30_0 *v22;  // x9
    st_41ee30_0 **v0;  // [bp-0x68], Other Possible Types: char, unsigned long long
    st_41ee30_0 *v1;  // [bp-0x60], Other Possible Types: unsigned long long
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

    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = &v12;
    v11 = v21;
    v1 = &v0;
    v0 = &v1;
    v22 = v1;
    v23 = v0;
    v24 = v23 - v22 + (v22 & ~v23) * 2;
    v25 = (v23 | v22) - (char *)&v22[v23 | ~v22] + v24 + 2 * ~v24;
    v0 = v25 + 22;
    v1 = v25 + (2 - (unsigned int)v25 | 0xfffffffffffffffc) + ((unsigned int)v25 + 1 & 3) + 5;
    if (a3 > (a0[2] - *a0) / ((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2 - 1))
    {
        sub_41cf2c(a0);
        sub_27204(a0, sub_1e4b0(a0, a3));
        (g_e7fc80 - 0x7a3ba300)();
    }
    else if (a3 > ((long long)(a0[1] - *a0) >> 3) * 12297829382473034411)
    {
        (g_e7fc70 - 0xed6fb500)();
    }
    else
    {
        (g_e7fc70 - 0xed6fb500)();
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x42581c..0x425b0c (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e806e8;
extern unsigned long long g_e80708;
extern unsigned long long g_e80720;

void sub_42581c(unsigned long long *a0, unsigned long long a1, unsigned long a2, long long a3)
{
    unsigned long long v12;  // x26
    unsigned long long v13;  // x25
    unsigned long long v22;  // x2
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    unsigned long long v21;  // x8
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = &v11;
    v10 = v20;
    v21 = a0[2];
    v22 = *a0;
    if ((unsigned long long)a3 > v22 + v21 + (v21 + (-v22 | ~v21) + (-v22 & ~v21)) * 2 + 2)
    {
        sub_4a3a50(a0);
        sub_422b3c(a0, sub_40e710(a0, a3));
        (g_e80720 - 0x4daef700)();
    }
    else if ((unsigned long long)a3 > a0[1] - v22)
    {
        v0 = a1;
        (g_e80708 - 0x5583a500)();
    }
    else
    {
        (g_e806e8 - 0x34191300)();
    }
}

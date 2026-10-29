/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a7d34..0x1a7e10 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_1a7d34(unsigned long long *a0, unsigned long long a1, unsigned long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v13;  // x22
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a1 > ((long long)(a0[2] - *a0) >> 3) * 12297829382473034411)
    {
        sub_1b1b2c(a0);
        sub_27204(a0, sub_1e4b0(a0, a1));
    }
    else
    {
        v13 = 12297829382473034411 * ((long long)(a0[1] - *a0) >> 3);
        sub_1a8ea4();
    }
}

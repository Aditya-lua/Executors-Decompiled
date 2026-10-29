/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc769c8..0xc76a10 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_bea8ec;
extern long long g_cba63b;

void sub_c769c8(void)
{
    unsigned long long v8;  // x30
    unsigned int v0;  // [bp-0x34]
    unsigned long v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    char v4;  // [bp-0x11]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v5 = &v7;
    v6 = v8;
    v0 = sub_c14884();
    v2 = &v0;
    v3 = &g_bea8ec;
    v1 = sub_c40a18(&v4, &g_cba63b, &v2);
    sub_c769bc(sub_c40ab4(&v1));
}

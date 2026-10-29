/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x258dd4..0x258e4c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f0d2b8;
extern unsigned long long g_f0d528;

void sub_258dd4(unsigned long a0, unsigned long a1, long long a2, unsigned long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
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
    if (sub_2a3e68(a2, 0, 0))
        sub_d5c30(a2, g_f0d528 + 5158);
    goto *((void *)(g_f0d2b8));
}

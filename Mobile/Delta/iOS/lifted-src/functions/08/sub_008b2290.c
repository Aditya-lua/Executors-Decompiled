/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b2290..0x8b232c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e83890;

void sub_8b2290(unsigned long a0, unsigned int a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_8af584();
    v8 = ((!a1) * 8 | (char)(!a1) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (a1 == 2)
        v8 = 24;
    if (a1 == 3)
        v8 = 16;
    goto *((void *)(*(long long *)((char *)&g_e83890 + v8)));
}

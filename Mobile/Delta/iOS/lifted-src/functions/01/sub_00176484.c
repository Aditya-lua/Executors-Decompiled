/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x176484..0x176548 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e6f880;

void sub_176484(unsigned long a0, unsigned int a1)
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
    sub_175558();
    v8 = ((!a1) * 8 | (char)(!a1) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (a1 == 2)
        v8 = 16;
    if (a1 == 3)
        v8 = 24;
    goto *((void *)(*(long long *)((char *)&g_e6f880 + v8)));
}

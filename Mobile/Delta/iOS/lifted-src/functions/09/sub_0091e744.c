/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91e744..0x91e978 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e838b0;

long long sub_91e744(unsigned long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long long v10;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = *a0;
    v9 = ((v8 == 0x100000000000) * 8 | (char)(v8 == 0x100000000000) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (v8 == 0x800000000000000)
        v9 = 32;
    if (v8 == 0x100000)
        v9 = 48;
    if (v8 == 64)
        v9 = 56;
    if (v8 == 0x80000000000000)
        v9 = 72;
    if (v8 == 0x100)
        v9 = 24;
    if (v8 == 0x400)
        v9 = 16;
    if (v8 == 0x800)
        v9 = 80;
    if (v8 == 4)
        v9 = 40;
    v10 = 64;
    if (v8 == 8)
        v9 = v10;
    goto *((void *)(*(long long *)((char *)&g_e838b0 + v9)));
}

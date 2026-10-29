/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50f918..0x50fb48 (560 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f0d3e0;

void sub_50f918(void)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long v10;  // x9
    unsigned long v11;  // x11
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = 750832996878177324;
    v0 = 750832996878177524;
    v10 = (v1 ^ -v0) + ((v1 & -v0) + (v1 + ~v1 * 2 + 1 & v0)) * 2;
    v11 = g_f0d3e0 + 1;
    (*(long long *)(v11 + (v10 | v11 + ~g_f0d3e0 * 2) + (v10 | g_f0d3e0)))();
}

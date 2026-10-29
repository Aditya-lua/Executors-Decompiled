/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3bdf14..0x3bdfbc (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f0d3e0;

void sub_3bdf14(void)
{
    unsigned long long v5;  // x30
    unsigned long long v6;  // x11
    unsigned long long v7;  // x12
    unsigned long v8;  // x8
    unsigned long long v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = 3386295821090051844;
    v0 = 3386295821090051964;
    v6 = v0 ^ v1;
    v7 = v6 & g_f0d3e0;
    v8 = g_f0d3e0 + 1;
    v9 = v8 + v6 + (v6 + (v0 ^ ~v1) * 2 + 1 | v8 + ~g_f0d3e0 * 2);
    (*(long long *)(v7 + (v9 | ~v7) + (v9 | v7) + 1))();
}

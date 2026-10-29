/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980540..0x9805a8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_9805a8;

void sub_980540(long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a19710(a0[4], 0);
    sub_a66ccc(a0[4], &g_9805a8, a0);
    sub_a66664(a0[3]);
    sub_a66664(a0[4]);
}

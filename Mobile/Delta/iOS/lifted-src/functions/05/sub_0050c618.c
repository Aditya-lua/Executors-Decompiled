/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50c618..0x50c658 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e81dd0;

void sub_50c618(uint128_t *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    *a0 = 0;
    a0[1] = 0;
    (g_e81dd0 - 0x4b069600)();
}

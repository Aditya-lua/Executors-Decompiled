/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa698f0..0xa69928 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b8;

long long sub_a698f0(long long a0)
{
    char *v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = &v2;
    return _vfprintf(*(long long *)&g_10002b8, a0, &v2);
}

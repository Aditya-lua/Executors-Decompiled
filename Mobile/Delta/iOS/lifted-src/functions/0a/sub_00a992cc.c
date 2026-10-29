/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa992cc..0xa9930c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a9930c;
extern long long g_f12f10;

long long sub_a992cc(unsigned int a0, unsigned long long a1, unsigned long long a2)
{
    unsigned int v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = a0;
    v1 = a1;
    v2 = a2;
    return sub_a66d48(g_f12f10, "@", &g_a9930c, &v0);
}

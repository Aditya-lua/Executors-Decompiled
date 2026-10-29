/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ae44..0x6ae84 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f0d100;
extern unsigned long long g_f0d118;

int sub_6ae44(unsigned long a0, char a1)
{
    unsigned long long v5;  // x30
    char v0;  // [bp-0x19]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (g_f0d118)
    {
        v2 = &v4;
        v3 = v5;
        v1 = a0;
        v0 = a1;
        a0 = sub_664e4(&g_f0d100, &v1, &v0);
    }
    return a0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x975c60..0x975c9c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_975c60(unsigned long a0, unsigned long a1, int a2)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if ((unsigned long long)*(long long *)(a0 + a2 * 32 + 168) <= a1)
    {
        v0 = &v2;
        v1 = v3;
        return !sub_991b0c(a0 + a2 * 32 + 144);
    }
    return 0;
}

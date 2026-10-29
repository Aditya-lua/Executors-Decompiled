/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c1a94..0x9c1acc (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_fffffffffffffffc;

long long sub_9c1a94(long long a0)
{
    unsigned long long v4;  // x30
    long long v5;  // x0
    char v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (!a0)
        return a0;
    v1 = &v3;
    v2 = v4;
    if (sub_9c167c(&v0, a0, 2))
        v5 = v0;
    else
        v5 = (char *)&g_fffffffffffffffc + 3;
    return v5;
}

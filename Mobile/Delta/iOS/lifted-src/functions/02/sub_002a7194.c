/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a7194..0x2a71d0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_2a7194(unsigned long long a0, unsigned long a1, char *i, unsigned long a3, char *a4)
{
    char *v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    for (v0 = &v1; i != a4; i = v2)
    {
        v2 = i - 16;
        a0 = sub_2a6e94(v2 + 8, *(i - 16));
    }
    return a0;
}

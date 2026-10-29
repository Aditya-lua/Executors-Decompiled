/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ada64..0x2adaa8 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_2ada64(unsigned long long a0, char *i, char *a2)
{
    unsigned long v2;  // x20
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (i == a2)
        return a0;
    do
    {
        v2 = i + 8;
        v3 = sub_2a6e94(v2, *i);
        i = v2 + 8;
    } while (i != a2);
    return v3;
}

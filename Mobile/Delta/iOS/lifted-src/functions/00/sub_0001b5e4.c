/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b5e4..0x1b644 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_1b5e4(unsigned long a0, long long i, long long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (i == a2)
        return i;
    do
    {
        sub_1b644(a3, i);
        a3 += 32;
        i += 32;
    } while (i != a2);
    return a2;
}

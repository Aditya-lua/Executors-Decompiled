/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24a0c..0x24a68 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_24a0c(unsigned long a0, long long i, long long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (i == a2)
        return i;
    do
    {
        sub_1e774(a3, i);
        a3 += 80;
        i += 80;
    } while (i != a2);
    return a2;
}

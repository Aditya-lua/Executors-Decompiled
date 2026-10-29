/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a5dc4..0x2a5e1c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2a5dc4(unsigned long a0, long long i, long long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (i == a2)
        return i;
    do
    {
        sub_2ab0f8(a3, i);
        i += 16;
    } while (i != a2);
    return a2;
}

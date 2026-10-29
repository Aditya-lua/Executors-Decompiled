/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2cd44..0x2cd98 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2cd44(long long a0, unsigned long a1, unsigned long a2, char a3, unsigned int a4, unsigned int a5)
{
    unsigned int v0;  // [bp-0x40]
    char v1;  // [bp-0x3c]
    unsigned int v2;  // [bp-0x38]
    unsigned int v3;  // [bp-0x34]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = sub_2dc60();
    v1 = a3;
    v2 = a4;
    v3 = a5;
    return sub_2bf68(a0 + 656, &v0);
}

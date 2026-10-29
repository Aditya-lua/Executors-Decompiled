/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c0044..0x1c007c (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1c0044(unsigned long a0, char *a1, char *a2)
{
    char *v0;  // x0

    v0 = a1;
    if (a1 != a2 && v0 + 1 != a2 && *v0 == 92)
        v0 = &v0[2 * (v0[1] == 123)];
    return v0;
}

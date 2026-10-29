/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be8a0..0x1be8d8 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1be8a0(unsigned long a0, char *a1, char *a2)
{
    char *v0;  // x0

    v0 = a1;
    if (a1 != a2 && v0 + 1 != a2 && *v0 == 92)
        v0 = &v0[2 * (v0[1] == 40)];
    return v0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a84ec..0x1a8524 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1a84ec(unsigned long a0, char *a1, char *a2)
{
    char *v0;  // x0

    v0 = a1;
    if (a1 != a2 && v0 + 1 != a2 && *v0 == 92)
        v0 = &v0[2 * (v0[1] == 41)];
    return v0;
}

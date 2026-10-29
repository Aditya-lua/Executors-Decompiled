/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f54c..0x7f570 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_7f54c(unsigned int *a0, unsigned int a1, unsigned int a2)
{
    if (a1 + a2 != 4)
        return *(int *)((char *)&a0[a1 + a2] - 4);
    return *a0 - 1;
}

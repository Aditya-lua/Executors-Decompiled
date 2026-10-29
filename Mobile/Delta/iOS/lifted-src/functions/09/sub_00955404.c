/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955404..0x955a54 (1616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_955404(unsigned long a0, unsigned int a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (0x88 < a1 - 3)
        return 0;
    goto *((void *)(sub_955440 + *(short *)(2 * a1 + 13793808) * 4));
}

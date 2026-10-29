/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcd134..0xcd14c (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_cd134(unsigned long long *a0)
{
    if (*a0)
        goto *((void *)(*a0));
    else
        goto *((void *)(a0[8]));
}

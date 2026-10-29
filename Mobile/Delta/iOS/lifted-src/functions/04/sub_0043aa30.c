/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43aa30..0x43aa64 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e800e0;

void sub_43aa30(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v0;  // x1

    v0 = *a0;
    *a0 = a1;
    if (!v0)
        return;
    goto *((void *)(g_e800e0 - 0xeede1b00));
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967c3c..0x967c74 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_d28050;

unsigned int sub_967c3c(unsigned int a0)
{
    if (120 < a0)
        return 0xffffffff;
    goto *((void *)(sub_967c60 + (&g_d28050)[a0] * 4));
}

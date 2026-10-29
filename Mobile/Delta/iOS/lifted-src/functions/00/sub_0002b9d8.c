/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b9d8..0x2ba34 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e63a78;
extern unsigned long long g_e63a80;

long long sub_2b9d8(char *a0, unsigned long long a1)
{
    unsigned long long v0;  // x1
    char *v1;  // x0

    if (a1)
    {
        while (1)
        {
            v0 = a1;
            v1 = a0 + 1;
            if (*a0 > 31)
            {
                a1 = v0 - 1;
                a0 = v1;
                if (v0 == 1)
                    goto *((void *)(g_e63a80));
            }
            else
            {
                goto *((void *)(g_e63a78));
            }
        }
    }
    else
    {
        goto *((void *)(g_e63a80));
    }
}

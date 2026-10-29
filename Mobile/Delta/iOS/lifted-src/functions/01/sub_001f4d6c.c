/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4d6c..0x1f4dd0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e788c8;
extern unsigned long long g_e788d0;

long long sub_1f4d6c(unsigned long a0, unsigned int *a1, unsigned int *a2, unsigned int a3)
{
    unsigned long v0;  // x10
    unsigned long v1;  // x10
    unsigned int *v2;  // x1
    unsigned int *v3;  // x2

    if (a3)
    {
        v0 = a3;
        while (1)
        {
            v1 = v0;
            v2 = a1 + 1;
            v3 = a2 + 1;
            if (*a1 == *a2)
            {
                v0 = v1 - 1;
                a1 = v2;
                a2 = v3;
                if (v1 == 1)
                    goto *((void *)(g_e788c8));
            }
            else
            {
                goto *((void *)(g_e788d0));
            }
        }
    }
    else
    {
        goto *((void *)(g_e788c8));
    }
}

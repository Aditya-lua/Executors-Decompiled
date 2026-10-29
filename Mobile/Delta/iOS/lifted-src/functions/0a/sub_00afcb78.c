/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafcb78..0xafcbdc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_ebb0c8;
extern char g_ebcf08;
extern char g_ebd8a8;
extern char g_ebd8e8;

int sub_afcb78(unsigned long a0, int a1, unsigned int *a2)
{
    *a2 = 0;
    if (20 >= a1)
    {
        switch (a1)
        {
        case 5:
            return &g_ebd8e8;
        case 20:
            return &g_ebb0c8;
        default:
            return 0;
        }
    }
    else if (a1 == 22)
    {
        return &g_ebd8a8;
    }
    else if (a1 == 21)
    {
        return &g_ebcf08;
    }
    else
    {
        return 0;
    }
}

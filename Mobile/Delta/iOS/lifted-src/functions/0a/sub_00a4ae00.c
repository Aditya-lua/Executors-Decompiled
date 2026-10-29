/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4ae00..0xa4aef0 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_def160;
extern unsigned long long g_e9d608;
extern unsigned long long g_e9d628;

long long sub_a4ae00(unsigned int a0)
{
    unsigned long long *v0;  // x8

    if (21 >= a0 - 713)
    {
        goto *((void *)(sub_a4ae34 + *(&(&g_def160)[a0] - 713) * 4));
    }
    else
    {
        switch (a0)
        {
        case 409:
            v0 = &g_e9d608;
            break;
        case 415:
            v0 = &g_e9d628;
            break;
        default:
            return 0;
        }
        return *v0;
    }
}

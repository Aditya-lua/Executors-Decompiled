/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b298..0xa5b3bc (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e9f7e8;
extern unsigned long long g_e9f7f8;
extern unsigned long long g_e9f808;
extern unsigned long long g_e9f818;
extern unsigned long long g_e9f828;
extern unsigned long long g_e9f838;
extern unsigned long long g_e9f848;
extern unsigned long long g_e9f858;
extern unsigned long long g_e9f868;
extern unsigned long long g_e9f878;
extern unsigned long long g_e9f898;

long long sub_a5b298(int a0)
{
    if (a0 > 919)
    {
        if (1086 >= a0)
        {
            switch (a0)
            {
            case 920:
                return g_e9f878;
            case 1034:
                return g_e9f838;
            case 1035:
                return g_e9f848;
            default:
LABEL_a5b3b8:
                break;
            }
        }
        else
        {
            switch (a0)
            {
            case 1087:
                return g_e9f818;
            case 1088:
                return g_e9f828;
            case 1172:
                return g_e9f858;
            default:
LABEL_a5b3b8:
                break;
            }
        }
    }
    else
    {
        if (a0 > 115)
        {
            if (a0 == 116)
            {
                return g_e9f898;
            }
            else if (a0 != 408)
            {
                if (a0 != 912)
                    goto LABEL_a5b3b8;
                return g_e9f7f8;
            }
            else
            {
                return g_e9f808;
            }
        }
        else
        {
            if (a0 != 6)
            {
                if (a0 != 28)
                    goto LABEL_a5b3b8;
                return g_e9f868;
            }
            return g_e9f7e8;
        }
    }
}

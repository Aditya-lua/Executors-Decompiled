/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa41564..0xa416cc (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_def068;
extern unsigned int g_def070;
extern unsigned int g_def078;
extern unsigned int g_def080;
extern unsigned int g_def088;
extern unsigned int g_def090;
extern unsigned int g_def098;
extern unsigned int g_def0a0;
extern unsigned int g_def0a8;
extern unsigned int g_def0b0;
extern unsigned int g_def0b8;
extern unsigned int g_def0c0;
extern unsigned int g_def0c8;
extern unsigned int g_def0d0;

int sub_a41564(int a0)
{
    unsigned int *v0;  // x8

    if (a0 > 987)
    {
        if (1103 >= a0)
        {
            if (1101 >= a0)
            {
                if (a0 == 988)
                {
                    v0 = &g_def098;
                }
                else if (a0 == 989)
                {
                    v0 = &g_def0a0;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                if (a0 == 1102)
                {
                    v0 = &g_def0a8;
                }
                else if (a0 == 1103)
                {
                    v0 = &g_def0b0;
                }
                else
                {
                    return 0;
                }
            }
        }
        else
        {
            if (1192 >= a0)
            {
                if (a0 == 1104)
                {
                    v0 = &g_def0b8;
                }
                else if (a0 == 1105)
                {
                    v0 = &g_def0c0;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                if (a0 == 1193)
                {
                    v0 = &g_def0c8;
                }
                else if (a0 == 1194)
                {
                    v0 = &g_def0d0;
                }
                else
                {
                    return 0;
                }
            }
        }
    }
    else
    {
        if (a0 > 798)
        {
            if (800 < a0)
            {
                switch (a0)
                {
                case 801:
                    v0 = &g_def088;
                    break;
                case 810:
                    v0 = &g_def090;
                    break;
                default:
                    return 0;
                }
            }
            else if (a0 == 799)
            {
                v0 = &g_def078;
            }
            else if (a0 == 800)
            {
                v0 = &g_def080;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (a0 == 163)
            {
                v0 = "@";
            }
            else if (a0 == 797)
            {
                v0 = &g_def068;
            }
            else if (a0 == 798)
            {
                v0 = &g_def070;
            }
            else
            {
                return 0;
            }
        }
    }
    return *v0;
}

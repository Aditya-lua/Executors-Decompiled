/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8f24..0xab8fcc (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8f24_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_ab8f24_0;

extern st_ab8f24_0 g_eb3c60;
extern st_ab8f24_0 g_eb3c70;
extern st_ab8f24_0 g_eb3c80;
extern st_ab8f24_0 g_eb3c90;
extern st_ab8f24_0 g_eb3ca0;
extern st_ab8f24_0 g_eb3cb0;
extern st_ab8f24_0 g_eb3cc0;

long long sub_ab8f24(int a0)
{
    st_ab8f24_0 *v0;  // x8

    if (a0 > 673)
    {
        if (1093 >= a0)
        {
            if (a0 == 674)
            {
                v0 = &g_eb3ca0.padding_0[0];
            }
            else if (a0 == 675)
            {
                v0 = &g_eb3c70.padding_0[0];
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (a0 == 1094)
            {
                v0 = &g_eb3cb0.padding_0[0];
            }
            else if (a0 == 1095)
            {
                v0 = &g_eb3cc0.padding_0[0];
            }
            else
            {
                return 0;
            }
        }
    }
    else
    {
        if (a0 == 64)
        {
            v0 = &g_eb3c60.padding_0[0];
        }
        else if (a0 == 672)
        {
            v0 = &g_eb3c80.padding_0[0];
        }
        else if (a0 == 673)
        {
            v0 = &g_eb3c90.padding_0[0];
        }
        else
        {
            return 0;
        }
    }
    return v0->field_8;
}

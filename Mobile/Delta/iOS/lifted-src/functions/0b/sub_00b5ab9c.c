/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5ab9c..0xb5acd4 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_dfe694;
extern long long g_dfe69d;
extern long long g_dfe6a8;
extern long long g_dfe6b3;
extern long long g_dfe6be;
extern long long g_dfe6c9;
extern long long g_dfe6d4;
extern long long g_dfe6df;
extern long long g_dfe6ea;

unsigned long long sub_b5ab9c(long long a0, long long a1, unsigned long a2, int a3)
{
    long long v2;  // x21
    long long v3;  // x22
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 > 674)
    {
        if (a3 > 1096)
        {
            if (a3 == 1097)
            {
                v2 = &g_dfe6d4;
            }
            else if (a3 == 1098)
            {
                v2 = &g_dfe6df;
            }
            else if (a3 == 1099)
            {
                v2 = &g_dfe6ea;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (a3 == 675)
            {
                v2 = &g_dfe69d;
            }
            else if (a3 == 1096)
            {
                v2 = &g_dfe6c9;
            }
            else
            {
                return 0;
            }
        }
    }
    else
    {
        if (672 >= a3)
        {
            switch (a3)
            {
            case 64:
                v2 = &g_dfe694;
                v3 = 9;
                goto LABEL_b5ac88;
            case 672:
                v2 = &g_dfe6a8;
                break;
            default:
                return 0;
            }
        }
        else if (a3 == 673)
        {
            v2 = &g_dfe6b3;
        }
        else if (a3 == 674)
        {
            v2 = &g_dfe6be;
        }
        else
        {
            return 0;
        }
    }
    v3 = 11;
LABEL_b5ac88:
    v4 = sub_c68640(a0, a1);
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_c68354(a0, 0xffffffff, v2, v3);
    if (!(unsigned int)v5)
        return v5;
    return sub_a69b58(a0, a1) != 0;
}

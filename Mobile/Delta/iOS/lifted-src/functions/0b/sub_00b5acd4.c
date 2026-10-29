/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5acd4..0xb5ae1c (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_dfe6f5;
extern long long g_dfe6fe;
extern long long g_dfe708;
extern long long g_dfe712;
extern long long g_dfe71c;
extern long long g_dfe726;
extern long long g_dfe731;
extern long long g_dfe73c;
extern long long g_dfe747;

unsigned long long sub_b5acd4(long long a0, long long a1, unsigned long a2, int a3)
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
                v2 = &g_dfe731;
                goto LABEL_b5adcc;
            }
            else if (a3 == 1098)
            {
                v2 = &g_dfe73c;
                goto LABEL_b5adcc;
            }
            else if (a3 == 1099)
            {
                v2 = &g_dfe747;
                goto LABEL_b5adcc;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (a3 != 675)
            {
                if (a3 != 1096)
                    return 0;
                v2 = &g_dfe726;
LABEL_b5adcc:
                v3 = 11;
            }
            else
            {
                v2 = &g_dfe6fe;
                v3 = 10;
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
                v2 = &g_dfe6f5;
                v3 = 9;
                break;
            case 672:
                v2 = &g_dfe708;
                v3 = 10;
                break;
            default:
                return 0;
            }
        }
        else if (a3 == 673)
        {
            v2 = &g_dfe712;
            v3 = 10;
        }
        else if (a3 == 674)
        {
            v2 = &g_dfe71c;
            v3 = 10;
        }
        else
        {
            return 0;
        }
    }
    v4 = sub_c68640(a0, a1);
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_c68354(a0, 0xffffffff, v2, v3);
    if (!(unsigned int)v5)
        return v5;
    return sub_a69b58(a0, a1) != 0;
}

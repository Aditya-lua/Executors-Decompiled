/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd0bc..0xafd2b4 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_dfe793;
extern long long g_dfe79e;
extern long long g_dfe7a9;
extern long long g_dfe7b4;
extern long long g_dfe7bf;
extern long long g_dfe7ca;
extern long long g_dfe7d5;
extern long long g_dfe7e0;
extern long long g_dfe7eb;
extern long long g_dfe7f6;
extern long long g_dfe801;
extern long long g_dfe80c;
extern long long g_dfe817;
extern long long g_dfe822;
extern long long g_dfe82d;
extern long long g_dfe835;

unsigned long long sub_afd0bc(long long a0, long long a1, int a2)
{
    long long v2;  // x21
    long long v3;  // x22
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (673 >= a2)
    {
        if (116 >= a2)
        {
            if (63 < a2)
            {
                switch (a2)
                {
                case 64:
                    v2 = &g_dfe7a9;
                    break;
                case 95:
                    v2 = &g_dfe835;
                    v3 = 7;
                    goto LABEL_afd258;
                default:
                    return 0xffffffff;
                }
            }
            else if (a2 == 3)
            {
                v2 = &g_dfe793;
            }
            else if (a2 == 4)
            {
                v2 = &g_dfe79e;
            }
            else
            {
                return 0xffffffff;
            }
        }
        else
        {
            if (671 >= a2)
            {
                switch (a2)
                {
                case 117:
                    v2 = &g_dfe82d;
                    v3 = 8;
                    goto LABEL_afd258;
                case 257:
                    v2 = &g_dfe822;
                    break;
                default:
                    return 0xffffffff;
                }
            }
            else if (a2 == 672)
            {
                v2 = &g_dfe7bf;
            }
            else if (a2 == 673)
            {
                v2 = &g_dfe7ca;
            }
            else
            {
                return 0xffffffff;
            }
        }
    }
    else
    {
        if (1095 >= a2)
        {
            if (1093 >= a2)
            {
                if (a2 == 674)
                {
                    v2 = &g_dfe7d5;
                }
                else if (a2 == 675)
                {
                    v2 = &g_dfe7b4;
                }
                else
                {
                    return 0xffffffff;
                }
            }
            else
            {
                if (a2 == 1094)
                {
                    v2 = &g_dfe7e0;
                }
                else if (a2 == 1095)
                {
                    v2 = &g_dfe7eb;
                }
                else
                {
                    return 0xffffffff;
                }
            }
        }
        else
        {
            if (1097 >= a2)
            {
                if (a2 == 1096)
                {
                    v2 = &g_dfe7f6;
                }
                else if (a2 == 1097)
                {
                    v2 = &g_dfe801;
                }
                else
                {
                    return 0xffffffff;
                }
            }
            else
            {
                if (a2 == 1098)
                {
                    v2 = &g_dfe80c;
                }
                else if (a2 == 1099)
                {
                    v2 = &g_dfe817;
                }
                else
                {
                    return 0xffffffff;
                }
            }
        }
    }
    v3 = 11;
LABEL_afd258:
    v4 = sub_c68640(a0, a1);
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_c685ac(a0, 0xffffffff);
    if (!(unsigned int)v5)
        return v5;
    v6 = sub_c68354(a0, 0xffffffff, v2, v3);
    if (!(unsigned int)v6)
        return v6;
    return sub_a69b58(a0, a1) != 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaecec4..0xaed0c4 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

unsigned long long sub_aecec4(unsigned long a0, unsigned long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v4;  // x22
    unsigned long v5;  // x23
    long long v7;  // x24
    long long v8;  // x0
    unsigned long long v9;  // x25
    unsigned long long v10;  // x27
    unsigned long v0;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1 || !sub_ad69e4(a1))
        return (int)sub_9d524c(a2) > 0;
    if ((int)sub_ad69e4(a1) >= 1)
    {
        v4 = 0;
        v5 = (unsigned int)a3 + 4;
        while (1)
        {
            v7 = sub_ad69f8(a1, v4);
            v8 = sub_af17c0(v7, v4);
            v9 = sub_a99eac(v8);
            if ((unsigned int)a3 && (v0 = a3, v1 = &g_c7c2eb, (int)sub_9d524c(a2, "%*s") < 1))
                break;
            if ((unsigned int)v9)
            {
                v0 = sub_a99788(v9);
                if (1 > (int)sub_9d524c(a2, "%s:\n"))
                    break;
            }
            else if ((int)sub_9c3060(a2, v8) < 1 || (int)sub_9d4888(a2, ":\n") < 1)
            {
                break;
            }
            if (!sub_af1728(v7))
            {
                v0 = v5;
                v1 = &g_c7c2eb;
                if ((int)sub_9d524c(a2, "%*s<No Values>\n") < 1)
                    break;
            }
            else if ((int)sub_af1728(v7) >= 1)
            {
                v10 = 0;
                do
                {
                    if ((int)sub_af961c(a2, v9, sub_af1810(v7, v10), v5) < 1 || (int)sub_9d4888(a2, "\n") < 1)
                        goto LABEL_aed098;
                } while ((v10 = (unsigned int)v10 + 1, (int)v10 < (int)sub_af1728(v7)));
            }
            v4 = (unsigned int)v4 + 1;
            if ((int)v4 >= (int)sub_ad69e4(a1))
                return 1;
        }
LABEL_aed098:
        return 0;
    }
    else
    {
        return 1;
    }
    return (int)sub_9d524c(a2) > 0;
}

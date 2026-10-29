/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae155c..0xae16a4 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_ae155c(unsigned long long a0, unsigned long long a1, long long a2)
{
    unsigned long long v7;  // w0
    unsigned long long v8;  // x22
    unsigned long long v9;  // x23
    unsigned long long v10;  // x24
    char v0;  // [bp-0x88]
    char v1;  // [bp-0x78]
    char v2;  // [bp-0x68]
    char v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = 1;
    if (a1 && a0 != a1)
    {
        if (!a0)
        {
LABEL_ae1664:
            v7 = 0;
        }
        else if ((int)sub_ad69e4(a1) >= 1)
        {
            v8 = 0;
            v9 = 0;
            v10 = a2 & 0xffffffff;
            while (1)
            {
                v7 = (unsigned int)sub_adff4c(sub_ad69f8(a1, v8), &v1, &v0, a2);
                if (!v7)
                    break;
                while (1)
                {
                    if ((int)sub_ad69e4(a0) <= (int)v9)
                        goto LABEL_ae1664;
                    v7 = (unsigned int)sub_adff4c(sub_ad69f8(a0, v9), &v3, &v2, a2);
                    if (!v7)
                    {
                        if (*(long long *)&g_10002b0 == v4)
                            return v7;
                        ___stack_chk_fail();
                    }
                    if (!(_memcmp(&v2, &v0, v10) >> 31 & 1))
                        break;
                    v9 = (unsigned int)v9 + 1;
                }
                if (0 < (int)_memcmp(&v3, &v1, v10))
                    goto LABEL_ae1664;
                v8 = (unsigned int)v8 + 1;
                v7 = 1;
                if ((int)v8 >= (int)sub_ad69e4(a1))
                    break;
            }
        }
        else
        {
            v7 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
}

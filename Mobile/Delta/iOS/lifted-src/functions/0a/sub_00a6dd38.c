/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6dd38..0xa6de70 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a6dd38(unsigned long long a0, unsigned long long a1, unsigned long long a2, char *a3, unsigned long long a4)
{
    char *iter;  // x21
    unsigned long long v3;  // x8
    unsigned long long v4;  // x25
    unsigned long long v5;  // x26
    unsigned long v6;  // x24
    unsigned long v7;  // x0
    unsigned long long v8;  // x23
    unsigned long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = a3;
    v3 = a0;
    v4 = 0;
    while (1)
    {
        v5 = v3;
        iter += 1;
        do
        {
            v6 = *(iter - 1);
            if (!(unsigned int)v6)
            {
                if (!a2)
                    return 1;
                *(unsigned long long *)a2 = v4;
                return 1;
            }
        } while ((iter += 1, (unsigned int)v6 == a4));
        v7 = *(iter - 1);
        if (!(unsigned int)v7)
        {
            sub_a368c8(v7);
            sub_a369bc("crypto/o_str.c", 226, "hexstr2buf_sep");
            sub_a36abc(15, 103, 0);
            return 0;
        }
        v8 = sub_a6dd0c(v7);
        v9 = sub_a6dd0c(v6);
        if (v8 >> 31 & 1 || v9 >> 31 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/o_str.c", 232, "hexstr2buf_sep");
            sub_a36abc(15, 0x66, 0);
            return 0;
        }
        v3 = 0;
        v4 += 1;
        if (v5)
        {
            if (a1 >= v4)
            {
                *(char *)v5 = (char)v8 | (char)v9 * 16;
                v3 = v5 + 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/o_str.c", 0xee, "hexstr2buf_sep");
                sub_a36abc(15, 116, 0);
                return 0;
            }
        }
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6df80..0xa6e09c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a6df80(char *iter, char *a1, char *a2, char *a3, char *a4, char *a5)
{
    char *v2;  // x8
    long long v3;  // x1
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // 4112
    unsigned long long v15;  // 4110
    unsigned long long v4;  // x8
    char *v5;  // x9
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    char *v8;  // x9
    char *v9;  // x9
    unsigned long v10;  // x10
    unsigned long v11;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0x7fffffffffffffff;
    if (a5)
        v2 = 0x5555555555555555;
    if (a4 > v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/o_str.c", 300, "buf2hexstr_sep");
        v3 = 113;
    }
    else
    {
        v4 = a4 * 2;
        v5 = &a4[v4];
        if (!a5)
            v5 = v4 + 1;
        if (1 >= v5)
            v5 = 1;
        if (a2)
            *(char **)a2 = v5;
        if (!iter)
            return 1;
        v6 = v5;
        v7 = a1;
        if (v5 > a1)
        {
            sub_a368c8();
            sub_a369bc("crypto/o_str.c", 312, "buf2hexstr_sep");
            v3 = 116;
        }
        else
        {
            if (a4)
            {
                v8 = a4;
                while (1)
                {
                    v9 = v8;
                    v10 = *a3;
                    a3 += 1;
                    *iter = *(char *)((v10 >> 4) + 13207245);
                    iter[1] = *(char *)((v10 & 15) + 13207245);
                    if (a5)
                    {
                        iter[2] = (char)a5;
                        iter += 3;
                        v8 = v9 - 1;
                        v6 = v9;
                        v7 = 1;
                        if (v9 == 1)
                            break;
                    }
                    else
                    {
                        iter += 2;
                        v8 = v9 - 1;
                        v6 = v9;
                        v7 = 1;
                        if (v9 == 1)
                            break;
                    }
                }
            }
            if (a4)
            {
                v11 = arm64g_calculate_condition(20, v6, v7, 0);
                v12 = 3;
                v13 = (v11 & 1 ? (unsigned long long)a5 : 0x40000000);
            }
            else
            {
                v14 = arm64g_calculate_condition(20, v6, v7, 0);
                v12 = 0;
                v13 = (v14 & 1 ? (unsigned long long)a5 : 0x40000000);
            }
            v15 = arm64g_calculate_condition(v12, v13, 0, 0);
            iter[-1 * !(v15 & 1)] = 0;
            return 1;
        }
    }
    sub_a36abc(15, v3, 0);
    return 0;
}

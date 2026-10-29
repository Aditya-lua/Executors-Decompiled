/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a413c..0x1a42c8 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a413c_0 {
    char field_0;
} st_1a413c_0;


char * sub_1a413c(char *a0, char *a1, char a2, unsigned long long a3, long long a4)
{
    char *v6;  // w25
    char *iter;  // x24
    unsigned long long v16;  // 4102
    char *v17;  // x1
    char *v18;  // w8
    unsigned long long v19;  // x24
    char *v20;  // x1
    char *v21;  // x0
    char *node;  // x8
    unsigned long long v9;  // x26
    char *v10;  // x0
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    st_1a413c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1a413c_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = (char *)a2;
    v1 = &v0;
    v0 = &v1;
    if (a1)
    {
        iter = 0;
        node = a1 - a0;
        if (a1 < a0)
            node = 0;
        v9 = 1;
        v10 = a0;
        while (1)
        {
            v11 = node;
            v12 = iter;
            if (node == iter)
                break;
            if (*(char *)(a0 + iter) == v6)
            {
                v13 = arm64g_calculate_condition(4, v11, v12, 0);
                v14 = arm64g_calculate_condition(52, (v13 & 1 ? v9 : 0x20000000), (v13 & 1 ? a3 : 0), 0);
                if (v14 & 1)
                    goto LABEL_1a41b4;
                goto LABEL_1a41ac;
            }
            else
            {
                v15 = arm64g_calculate_condition(4, v11, v12, 0);
                v16 = arm64g_calculate_condition(48, (v15 & 1 ? v9 : 0x20000000), (v15 & 1 ? a3 : 0), 0);
                if (!(v16 & 1))
                {
LABEL_1a41ac:
                    iter += 1;
                }
                else
                {
LABEL_1a41b4:
                    v17 = a1;
                    v10 = sub_1b2080(a0, v17);
                    if (v17 > v10)
                    {
                        v2 = a0 + v17;
                        v3 = a0 + v10;
                        v10 = sub_664e4(a4, &v3, &v2);
                    }
                    v9 += 1;
                    iter += 1;
                }
            }
        }
    }
    else
    {
        v18 = (char *)*a0;
        if (!v18)
            return a0;
        node = 0;
        v19 = 1;
        v10 = a0;
        while (1)
        {
            if (v18 != v6 || a3 <= v19)
            {
                node += 1;
                v18 = (char *)*(char *)(a0 + node);
                if (!v18)
                    break;
            }
            else
            {
                v10 = sub_1b2080(a0, 0);
                if (0 > v10)
                {
                    v2 = a0;
                    v3 = a0 + v10;
                    v10 = sub_664e4(a4, &v3, &v2);
                }
                node += 1;
                v19 += 1;
                v18 = (char *)*(char *)(a0 + node);
                if (!v18)
                    break;
            }
        }
    }
    if (!node)
        return v10;
    v20 = a1;
    v21 = sub_1b2080(a0, v20);
    if (v20 <= v21)
        return v21;
    v2 = a0 + v20;
    v3 = a0 + v21;
    return sub_664e4(a4, &v3, &v2);
}

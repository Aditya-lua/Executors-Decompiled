/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a07a4..0x9a093c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a07a4_0 {
    char padding_0[128];
    void* field_80;
    unsigned long long field_88;
} st_9a07a4_0;

typedef struct st_9a07a4_1 {
    char padding_0[2176];
    struct st_9a07a4_0 *field_880;
} st_9a07a4_1;


unsigned int sub_9a07a4(st_9a07a4_1 *a0, unsigned int a1, unsigned int a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6)
{
    st_9a07a4_0 *v4;  // x10
    unsigned int v5;  // w8
    unsigned long long v14;  // 4102
    unsigned long v6;  // x9
    void* iter;  // x21
    unsigned long v8;  // x9
    unsigned long v9;  // cc_dep1
    unsigned int v10;  // w10
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4112
    unsigned long v0;  // [bp-0x60]
    unsigned int v1;  // [bp-0x54]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v4 = a0->field_880;
    if (a1 & 384)
    {
        v5 = *(int *)&a0->padding_0[120] != 0;
        v6 = v4->field_88;
        if (v4->field_88)
            goto LABEL_9a07f8;
    }
    else
    {
        v5 = 2;
        v6 = v4->field_88;
        if (v4->field_88)
        {
LABEL_9a07f8:
            iter = v4->field_80;
            do
            {
                v8 = v6;
                if (*(short *)iter != a2)
                    continue;
                v9 = v5;
                if (v5 != 2)
                {
                    v10 = (int)iter[4];
                    if (v10 != v5)
                    {
                        v11 = arm64g_calculate_condition(19, v9, 2, 0);
                        v12 = arm64g_calculate_condition(19, (v11 & 1 ? v10 : 0x40000000), (v11 & 1 ? 2 : 0), 0);
                        if (v12 & 1)
                            continue;
                        goto LABEL_9a0830;
                    }
                    v13 = arm64g_calculate_condition(19, v9, 2, 0);
                    v14 = arm64g_calculate_condition(16, (v13 & 1 ? v10 : 0x40000000), (v13 & 1 ? 2 : 0), 0);
                    if (!(v14 & 1))
                        goto LABEL_9a0830;
                }
                else
                {
LABEL_9a0830:
                    if (sub_99a6d4())
                    {
                        if (a1 & 0x700 && !((char)((char)iter[12]) >> 1 & 1))
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/extensions_cust.c", 141, "custom_ext_parse");
                            sub_9a58a4(a0, 110, 110, 0);
                            return 0;
                        }
                        if (a1 & 16512)
                            *(unsigned int *)&iter[12] = (int)iter[12] | 1;
                        if ((long long)iter[40])
                        {
                            v0 = (long long)iter[48];
                            (long long)iter[40]();
                        }
                        break;
                    }
                }
            } while ((iter += 56, v6 = v8 - 1, v8 != 1));
        }
    }
    return 1;
}

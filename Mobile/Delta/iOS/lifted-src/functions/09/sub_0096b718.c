/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96b718..0x96b9a4 (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96b718_0 {
    char *field_0;
    char padding_8[128];
    struct st_96b718_1 *field_88;
} st_96b718_0;

typedef struct st_96b718_1 {
    struct st_96b718_1 *field_0;
    struct st_96b718_1 *field_1;
    struct st_96b718_1 *field_8;
    unsigned short field_10;
    char padding_12[2];
    struct st_96b718_1 *field_14;
    struct st_96b718_1 *field_1c;
    char padding_24[8];
    struct st_96b718_1 *field_2c;
    char padding_34[1564];
    struct st_96b718_1 *field_650;
    char padding_658[8];
    struct st_96b718_1 *field_660;
} st_96b718_1;

extern char g_e878d0;
extern char g_10002b0;

char * sub_96b718(char *a0, unsigned int a1, st_96b718_0 *a2)
{
    char *v6;  // w9
    char *iter;  // x22
    char *v16;  // x10
    char *v17;  // x10
    char *v18;  // x10
    char *v19;  // x8
    char *v20;  // x22
    char *v21;  // x23
    char *v22;  // x8
    char *v23;  // x23
    char *v24;  // x23
    char *v7;  // x21
    unsigned int v25;  // w9
    char *v26;  // x8
    char *v27;  // x10
    unsigned int v8;  // w10
    char *ptr;  // x0
    char *v10;  // x20
    char *v11;  // w8
    char *v12;  // w9
    char *v13;  // x11
    char *v14;  // x10
    char *v0;  // [bp-0x78]
    char *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = 0;
    if (a0 && (v6 = (char *)*a0, v7 = *a0 == 63, a0 = 0, a2->field_0 != 62 && (v8 = (unsigned int)(a1 - v7), a0 = 0, 39 >= (int)v8)))
    {
        ___memcpy_chk();
        *((char *)&v1 + v8) = 0;
        ptr = _strchr(&v1, 43);
        if (ptr)
        {
            v10 = ptr;
            *ptr = 0;
            if (v10[1])
            {
                sub_96e8d4((char *)&v0 + 4, &v0, &v1);
                sub_96e8d4((char *)&v0 + 4, &v0, v10 + 1);
                v11 = (char *)*(unsigned int *)((void*)&v0 + 4);
                if (v11)
                {
                    v12 = (char *)(unsigned int)v0;
                    if (v12)
                    {
                        v13 = a2->field_88;
                        if (v13)
                        {
                            v14 = *(long long *)&v13[1616];
                            if (*(long long *)&v13[1616])
                            {
                                iter = *(long long *)&v13[1632];
                                do
                                {
                                    v16 = v14;
                                    if (*(int *)&iter[20] == v12 && *(int *)&iter[28] == v11)
                                        goto LABEL_96b8e4;
                                } while ((iter += 72, v14 = v16 - 1, v16 != 1));
                            }
                        }
                        else
                        {
                            iter = &g_e878d0;
                            v17 = 31;
                            do
                            {
                                v18 = v17;
                                if (*(int *)&iter[20] == v12 && *(int *)&iter[28] == v11)
                                    goto LABEL_96b924;
                            } while ((iter += 72, v17 = v18 - 1, v18 != 1));
                        }
                    }
                }
            }
            else
            {
                if (*(long long *)&g_10002b0 == v2)
                    return 0;
                ___stack_chk_fail();
            }
            goto LABEL_96b8d0;
        }
        else
        {
            v19 = a2->field_88;
            if (v19)
            {
                if (*(long long *)&v19[1616])
                {
                    v20 = 0;
                    v21 = 0;
                    while (1)
                    {
                        v22 = &v20[*(long long *)&v19[1632]];
                        if ((!*(long long *)&v22[8] || sub_a6e200(&v1)) && sub_a6e200(&v1, *(long long *)v22))
                        {
                            v21 += 1;
                            v19 = a2->field_88;
                            v20 += 72;
                            if (v21 >= (unsigned long long)*(long long *)&v19[1616])
                                break;
                        }
                        else
                        {
                            iter = a2->field_88->field_650 + v20;
LABEL_96b8e4:
                            if (*(int *)&iter[44])
                                goto LABEL_96b924;
                            else
                                goto LABEL_96b96c;
                        }
                    }
                }
LABEL_96b8d0:
                a0 = v7;
            }
            else
            {
                iter = &g_e878d0;
                v23 = 31;
                do
                {
                    v24 = v23;
                    if (*(long long *)&iter[8] && !sub_a6e200(&v1) || !sub_a6e200(&v1, *(long long *)iter))
                        goto LABEL_96b924;
                } while ((iter += 72, v23 = v24 - 1, v24 != 1));
LABEL_96b924:
                v25 = *(short *)&iter[16];
                v26 = a2->field_0;
                a2->field_0 = v26 + 1;
                *(unsigned short *)((char *)a2 + 0x2 * v26 + 8) = v25;
                if (v26)
                {
                    v27 = 0;
                    a0 = 1;
                    do
                    {
                        if (*(short *)((char *)a2 + 0x2 * v27 + 8) == v25)
                        {
                            a2->field_0 = v26;
                            goto LABEL_96b96c;
                        }
                    } while ((v27 += 1, v26 != v27));
                }
                else
                {
LABEL_96b96c:
                    a0 = 1;
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return a0;
    ___stack_chk_fail();
}

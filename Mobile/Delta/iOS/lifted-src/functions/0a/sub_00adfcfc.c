/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadfcfc..0xadff4c (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adfcfc_1 {
    struct st_adfcfc_0 *field_0;
    struct st_adfcfc_0 *field_8;
} st_adfcfc_1;

typedef struct st_adfcfc_2 {
    char padding_0[8];
    struct st_adfcfc_1 *field_8;
} st_adfcfc_2;

typedef struct st_adfcfc_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_adfcfc_0;

extern long long g_eb4fb0;
extern long long g_eb5038;

int sub_adfcfc(st_adfcfc_2 **a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x0
    unsigned long long v12;  // x8
    unsigned long long v13;  // x8
    unsigned long long v14;  // x8
    unsigned long long v15;  // x20
    unsigned int v16;  // w9
    unsigned long long v17;  // w23
    unsigned long long v18;  // x8
    unsigned long long v19;  // x8
    unsigned long long v20;  // x8
    st_adfcfc_2 *v4;  // x22
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x24
    unsigned long long v9;  // x24
    unsigned long long v10;  // w9
    unsigned long long v11;  // w25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    if ((int)_memcmp(a1, a2, a3 & 0xffffffff) > 0)
    {
        return 0;
    }
    else if (sub_ae0540(a1, a2, v2) >> 31 & 1)
    {
        v3 = sub_9cde20(&g_eb5038);
        if (!v3)
            return v3;
        v4 = v3;
        *(unsigned int *)v3 = 1;
        v5 = sub_9cde20(&g_eb4fb0);
        v4->field_8 = v5;
        if (v5)
        {
            if (!*(long long *)v5)
            {
                v6 = sub_9cf14c();
                v4->field_8->field_0 = v6;
                if (v6)
                {
                    v5 = v4->field_8;
                    goto LABEL_adfde0;
                }
            }
            else
            {
LABEL_adfde0:
                if (*(long long *)(v5 + 8) || (v7 = sub_9cf14c(), v4->field_8->field_8 = v7, v7))
                {
                    if ((int)v2 >= 1)
                    {
                        v8 = v2;
                        while (1)
                        {
                            v9 = v8;
                            v10 = *(char *)(a1 - 1 + (v9 & 0xffffffff));
                            v11 = v10 != 0;
                            if (v10)
                                break;
                            v8 = (unsigned int)v9 - 1;
                            if (1 >= (int)v9)
                            {
                                v9 = 0;
                                break;
                            }
                        }
                    }
                    else
                    {
                        v11 = 0;
                        v9 = v2;
                    }
                    if (sub_9c026c(v4->field_8->field_0, a1, v9))
                    {
                        sub_9c76f4(v4->field_8->field_0, 0);
                        if (v11)
                        {
                            v12 = 0xfffffffffffffff8;
                            do
                            {
                                v13 = v12;
                                v14 = v13 + 1;
                                v12 = v14;
                            } while (*(char *)(a1 + (v9 & 0xffffffff) - 1) << ((char)v13 + 9 & 31));
                            v4->field_8->field_0->field_10 = v4->field_8->field_0->field_10 | -v14;
                        }
                        if ((int)v2 >= 1)
                        {
                            while (1)
                            {
                                v15 = v2;
                                v16 = *(char *)(a2 - 1 + (v15 & 0xffffffff));
                                v17 = v16 != 0xff;
                                if (v16 != 0xff)
                                    break;
                                v2 = (unsigned int)v15 - 1;
                                if (1 >= (int)v15)
                                {
                                    v15 = 0;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            v17 = 0;
                            v15 = v2;
                        }
                        if (sub_9c026c(v4->field_8->field_8, a2, v15))
                        {
                            sub_9c76f4(v4->field_8->field_8, 0);
                            if (v17)
                            {
                                v18 = 0xfffffffffffffff8;
                                do
                                {
                                    v19 = v18;
                                    v20 = v19 + 1;
                                    v18 = v20;
                                } while ((char)(~*(char *)(a2 + (v15 & 0xffffffff) - 1) << ((char)v19 + 9 & 31)));
                                v4->field_8->field_8->field_10 = v4->field_8->field_8->field_10 | -v20;
                            }
                            *a0 = v4;
                            return 1;
                        }
                    }
                }
            }
        }
        sub_9cd960(v4, &g_eb5038);
        return 0;
    }
}

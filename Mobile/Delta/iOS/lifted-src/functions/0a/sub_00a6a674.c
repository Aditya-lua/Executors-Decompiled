/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6a674..0xa6a904 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6a674_0 {
    long long field_0;
    char *field_8;
} st_a6a674_0;

extern char g_10002b0;

char * sub_a6a674(unsigned int a0, st_a6a674_0 *a1, st_a6a674_0 *a2)
{
    long long v5;  // x0
    char *v6;  // x8
    char *v15;  // x24
    char *v16;  // w0
    char *v17;  // x22
    char *v18;  // x2
    char *v7;  // x0
    char *v8;  // x26
    unsigned long long *v9;  // x27
    char *v10;  // w21
    char *v11;  // w0
    char *i;  // x25
    unsigned long v13;  // x22
    char *v14;  // x21
    char *v0;  // [bp-0xc0]
    char v1;  // [bp-0xb8]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = a2->field_0;
    v6 = a2->field_8;
    a1->field_0 = v5;
    if (v6)
    {
        v7 = sub_a68358(v5);
        if (v7)
        {
            if (a0 >= 18)
            {
                sub_a368c8();
                sub_a369bc("crypto/ex_data.c", 37, "get_and_lock");
                sub_a36abc(15, 0x80106, 0);
                v7 = 0;
            }
            else if (*(long long *)v7)
            {
                v8 = v7;
                v7 = sub_a7c17c(*(long long *)v7);
                if ((unsigned int)v7)
                {
                    v9 = v8 + 8;
                    v10 = (char *)(unsigned int)sub_ad69e4(v9[a0]);
                    v11 = (char *)(unsigned int)sub_ad69e4(a2->field_8);
                    if (v11 < v10)
                        i = v11;
                    else
                        i = v10;
                    v13 = (unsigned int)i - 1;
                    if ((int)(unsigned int)i < 1)
                    {
                        v14 = 0;
                        goto LABEL_a6a798;
                    }
                    if (10 > (unsigned int)i)
                    {
                        v14 = &v1;
LABEL_a6a778:
                        v15 = 0;
                        do
                        {
                            *(unsigned long long *)(v14 + 0x8 * v15) = sub_ad69f8(v9[a0], v15);
                            v15 += 1;
                        } while (i != v15);
LABEL_a6a798:
                        sub_a7c1b4(*(long long *)v8);
                        if (!(unsigned int)i)
                            goto LABEL_a6a7c4;
                        if (!v14)
                            goto LABEL_a6a800;
                        if (a1->field_8 && (int)(unsigned int)i <= (int)sub_ad69e4(a1->field_8))
                            sub_ad69f8(a1->field_8, v13);
                        v16 = (char *)(unsigned int)sub_a6a904(a1, v13);
                        v7 = v16 != 0;
                        if (v16 && (int)(unsigned int)i >= 1)
                        {
                            v17 = 0;
                            do
                            {
                                if (a2->field_8 && sub_ad69e4(a2->field_8) > v17)
                                    v18 = sub_ad69f8(a2->field_8, v17);
                                else
                                    v18 = 0;
                                v0 = v18;
                                if (*(long long *)(v14 + 0x8 * v17) && *(long long *)(*(long long *)(v14 + 0x8 * v17) + 40))
                                    (*(long long *)(*(long long *)(v14 + 0x8 * v17) + 40))();
                                sub_a6a904(a1, v17);
                                v17 += 1;
                            } while (i != v17);
                            v7 = 1;
                        }
                        if (v14 != &v1)
                            sub_a6c2e4(v14, "crypto/ex_data.c", 336);
                    }
                    else
                    {
                        v14 = sub_a6bf4c((i * 8 | i >> 61) & 0x7fffffff8 & 0x7ffffffff, "crypto/ex_data.c", 304);
                        if (v14)
                            goto LABEL_a6a778;
                        sub_a7c1b4(*(long long *)v8);
                        v7 = 0;
                    }
                }
            }
            else
            {
LABEL_a6a800:
                v7 = 0;
            }
        }
    }
    else
    {
LABEL_a6a7c4:
        v7 = 1;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v7;
    ___stack_chk_fail();
}

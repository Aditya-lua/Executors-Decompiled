/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5de20..0xc5e148 (808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5de20_1 {
    char field_0;
    char padding_1[7];
    char *field_8;
    unsigned long long field_10;
} st_c5de20_1;

typedef struct st_c5de20_0 {
    char *field_0;
    unsigned long long field_8;
    char padding_10[40];
    char field_38;
    char field_39;
    char field_3a;
} st_c5de20_0;

extern long long g_efd810;
extern long long g_efd828;

void sub_c5de20(st_c5de20_1 *a0, st_c5de20_0 *a1)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // w9
    unsigned long long v11;  // x8
    unsigned long long v12;  // x16
    unsigned long long v13;  // x8
    unsigned long long v14;  // w16
    char v4;  // x10
    char *v5;  // x14
    unsigned long long v6;  // x2
    char *v7;  // x15
    unsigned long iter;  // x11
    unsigned long long v9;  // x13
    char *v10;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_38;
    if ((unsigned int)v2 == 3 || (v3 = a1->field_39, v3 == 3))
    {
        v4 = 10;
    }
    else
    {
        v4 = a0->field_0;
        v5 = a1->field_0;
        v6 = a1->field_8;
        if (a1->field_3a & 1)
        {
            v7 = a0->field_8;
            iter = a0->field_10;
            while (1)
            {
                if (v3 < (unsigned int)v2)
                {
                    a0->field_8 = v7;
                    a0->field_10 = iter;
                    a0->field_0 = 10;
                    return;
                }
                v10 = v5;
                if ((unsigned int)v2 != 1)
                {
                    if ((unsigned int)v2 != 2)
                        goto LABEL_c5e0c4;
                    if (!v6)
                        goto LABEL_c5e094;
                    iter = 0;
                    do
                    {
                        if (v10[iter] == 47)
                        {
                            v11 = 1;
                            if (!iter)
                                goto LABEL_c5def8;
                            goto LABEL_c5deb8;
                        }
                    } while ((iter += 1, v6 != iter));
                    v11 = 0;
                    iter = v6;
                    if (!v6)
                        goto LABEL_c5def8;
LABEL_c5deb8:
                    if (iter != 1)
                    {
                        if (iter == 2 && *v10 == 46 && v10[1] == 46)
                        {
                            v9 = 0;
                            v4 = 8;
                            goto LABEL_c5df0c;
                        }
                    }
                    else
                    {
                        if (*v10 == 46)
                        {
LABEL_c5def8:
                            v4 = 10;
                            v9 = 1;
                            goto LABEL_c5df0c;
                        }
                    }
                    v9 = 0;
                    v4 = 9;
LABEL_c5df0c:
                    v2 = v11 + iter;
                    v12 = v6 - v2;
                    if (v6 < v2)
                    {
                        a0->field_8 = v10;
                        a0->field_10 = iter;
                        a0->field_0 = v4;
                        sub_c73bb0(v2, v6);
                        sub_c73bb0(1, 0);
                    }
                    v5 = &v10[v2];
                    a1->field_0 = v5;
                    a1->field_8 = v12;
                    v2 = 2;
                    v6 = v12;
                    v7 = v10;
                    if (!(v9 & 1))
                    {
                        a0->field_8 = v10;
                        goto LABEL_c5e05c;
                    }
                }
                else
                {
                    a0->field_8 = v7;
                    a0->field_10 = iter;
                    v2 = 2;
                    a1->field_38 = 2;
                    if (!v6)
                        goto LABEL_c5e104;
                    a1->field_0 = v10 + 1;
                    a1->field_8 = v6 - 1;
                    v4 = 6;
                    break;
                }
            }
        }
        else
        {
            v7 = a0->field_8;
            iter = a0->field_10;
            v10 = 2;
            while (1)
            {
                v9 = v5;
                v5 = v6;
                while (1)
                {
                    if (v3 < (unsigned int)v2)
                    {
                        a0->field_8 = v7;
                        a0->field_10 = iter;
                        a0->field_0 = 10;
                        return;
                    }
                    if ((unsigned int)v2 != 1)
                        break;
                    a1->field_38 = 2;
                    if (!v5)
                    {
                        v2 = 2;
                    }
                    else if (v5 != 1)
                    {
                        v2 = 2;
                        if (*(char *)v9 == 46 && *(char *)(v9 + 1) == 47)
                            goto LABEL_c5e0a8;
                    }
                    else
                    {
                        v2 = 2;
                        if (*(char *)v9 == 46)
                        {
LABEL_c5e0a8:
                            a0->field_8 = v7;
                            a0->field_10 = iter;
                            if (v6)
                            {
                                a1->field_0 = v9 + 1;
                                a1->field_8 = v6 - 1;
                                a0->field_0 = 7;
                                return;
                            }
                            sub_c73bb0(1, 0);
                        }
                    }
                }
                if ((unsigned int)v2 != 2)
                {
LABEL_c5e0c4:
                    a0->field_8 = v7;
                    a0->field_10 = iter;
                    a0->field_0 = v4;
                    a0 = sub_c73c80("internal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 40, &g_efd828);
LABEL_c5e0e4:
                    a0->field_8 = v9;
                    a0->field_10 = iter;
                    v6 = v5;
                    a0->field_0 = v4;
                    sub_c73bb0(v2, v6, v6, &g_efd810);
LABEL_c5e104:
                    a0 = sub_c73bb0(1, 0);
                    a0->field_8 = v10;
                    a0->field_10 = iter;
                    a0->field_0 = v4;
                    sub_c73bb0(v2, v6);
                    sub_c73bb0(1, 0);
                }
                if (v5)
                {
                    iter = 0;
                    do
                    {
                        if (*(char *)(v9 + iter) == 47)
                        {
                            v13 = 1;
                            if (!iter)
                                goto LABEL_c5e000;
                            goto LABEL_c5dfe4;
                        }
                    } while ((iter += 1, v5 != iter));
                    v13 = 0;
                    iter = v5;
                    if (!v5)
                        goto LABEL_c5e000;
LABEL_c5dfe4:
                    if (iter != 2)
                    {
                        if (iter == 1 && *(char *)v9 == 46)
                        {
LABEL_c5e000:
                            v4 = 10;
                            v14 = 1;
                            goto LABEL_c5e038;
                        }
LABEL_c5e030:
                        v14 = 0;
                        v4 = 9;
                    }
                    else
                    {
                        if (*(char *)v9 != 46 || *(char *)(v9 + 1) != 46)
                            goto LABEL_c5e030;
                        v14 = 0;
                        v4 = 8;
                    }
LABEL_c5e038:
                    v2 = v13 + iter;
                    v6 = &v5[-1 * v2];
                    if (v5 < v2)
                        goto LABEL_c5e0e4;
                    v5 = v9 + v2;
                    a1->field_0 = v5;
                    a1->field_8 = v6;
                    v2 = 2;
                    v7 = v9;
                    if (!v14)
                    {
                        a0->field_8 = v9;
LABEL_c5e05c:
                        a0->field_10 = iter;
                        break;
                    }
                }
                else
                {
LABEL_c5e094:
                    a0->field_8 = v7;
                    a0->field_10 = iter;
                    a1->field_38 = 3;
                    v4 = 10;
                    break;
                }
            }
        }
    }
    a0->field_0 = v4;
    return;
}

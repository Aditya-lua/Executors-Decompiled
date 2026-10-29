/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4b358..0xa4b5e4 (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4b358_0 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char padding_9[83];
    char field_5c;
} st_a4b358_0;

extern char g_def180;
extern char g_def200;

unsigned int sub_a4b358(st_a4b358_0 *a0, long long a1, unsigned int *a2, char *a3, unsigned int a4)
{
    char *v2;  // x25
    long long v3;  // x22
    unsigned int v12;  // w24
    unsigned int v13;  // w24
    unsigned long v14;  // x8
    unsigned int v15;  // w9
    unsigned int v16;  // x27
    unsigned long long v17;  // x0
    unsigned int v18;  // x0
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned int v4;  // x3
    unsigned int v22;  // x24
    unsigned int *v23;  // x19
    unsigned long long v24;  // x0
    unsigned long v25;  // 4112
    unsigned long v26;  // cc_op
    unsigned long v27;  // cc_dep1
    unsigned long v28;  // 4112
    unsigned long long v29;  // 4109
    char *v5;  // x23
    char *v6;  // x8
    unsigned int v7;  // w21
    char *v8;  // x28
    unsigned int v9;  // x27
    unsigned int v10;  // x11
    unsigned int v11;  // w19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = a1;
    v4 = a0->field_0;
    v5 = &a0->field_8;
    if ((int)v4 >= 1)
    {
        v6 = &v5[v4];
        if (*(v6 - 1) == 61)
        {
            v7 = 1;
            if (v4 == 1)
                goto LABEL_a4b3cc;
            if (*(v6 - 2) != 61)
                v7 = 1;
            else
                v7 = 2;
            if (!a4)
                goto LABEL_a4b4ec;
        }
        else
        {
            v7 = 0;
            if (!a4)
                goto LABEL_a4b4ec;
        }
LABEL_a4b3d0:
        if (!(a0->field_5c & 2))
            v8 = &g_def200;
        else
            v8 = &g_def180;
        if ((int)a4 >= 1)
        {
            v9 = 0;
            v10 = 0;
            v11 = 1;
            v12 = a4;
        }
        else
        {
            v10 = 0;
            v9 = 1;
LABEL_a4b500:
            v19 = 3;
            v20 = v4 & 0xffffffff;
            v21 = 1;
            if ((int)v4 >= 1)
            {
                v19 = 9;
                v20 = v4 & 3;
                v21 = 0;
                if (v4 & 3)
                {
                    if (v9 & 1)
                        goto LABEL_a4b524;
                    v18 = 0xffffffff;
                    goto LABEL_a4b5ac;
                }
                else
                {
                    v22 = v10;
                    v23 = a2;
                    v24 = sub_a4b5e4(a0, v3, v5);
                    if (!(v24 >> 31 & 1))
                    {
                        v19 = 3;
                        v20 = v7;
                        v21 = 1;
                        v10 = v22;
                        if ((int)v7 >= 1 && !(unsigned int)v24)
                        {
                            v4 = 0;
                            v18 = 0xffffffff;
                            a2 = v23;
                            goto LABEL_a4b5ac;
                        }
                        else
                        {
                            v4 = 0;
                            v10 += v24;
                            a2 = v23;
LABEL_a4b524:
                            if (v7)
                            {
                                v25 = arm64g_calculate_condition(v19 | 16, v20, v21, 0);
                                v26 = 3;
                                v27 = (v25 & 1 ? v4 & 0xffffffff : 0);
                            }
                            else
                            {
                                v28 = arm64g_calculate_condition(v19 | 16, v20, v21, 0);
                                v26 = 0;
                                v27 = (v28 & 1 ? v4 & 0xffffffff : 0);
                            }
                            v29 = arm64g_calculate_condition(v26, v27, 0, 0);
                            v18 = v9 & (unsigned int)!(v29 & 1);
                            goto LABEL_a4b5ac;
                        }
                    }
                    else
                    {
                        v4 = 0;
                        v18 = 0xffffffff;
                        a2 = v23;
                        v10 = v22;
                        goto LABEL_a4b5ac;
                    }
                }
            }
            else
            {
                goto LABEL_a4b524;
            }
        }
        while (1)
        {
            v13 = v12;
            v14 = *v2;
            v2 += 1;
            if ((long long)v14 >= 0 && !(v15 = v8[v14], v15 == 0xff))
            {
                if ((unsigned int)v14 == 61)
                {
                    v7 += 1;
                    goto LABEL_a4b46c;
                }
                if ((int)v7 >= 1)
                {
                    if ((v15 & 236) == 224)
                    {
LABEL_a4b46c:
                        if (2 >= (int)v7)
                        {
                            if (v15 != 242)
                                goto LABEL_a4b47c;
                            goto LABEL_a4b500;
                        }
                    }
                    goto LABEL_a4b5a4;
                }
                v7 = 0;
                if (v15 == 242)
                    goto LABEL_a4b500;
LABEL_a4b47c:
                if ((v15 & 236) != 224)
                {
                    if (63 >= (int)v4)
                    {
                        v5[v4] = v14;
                        v4 += 1;
                        goto LABEL_a4b49c;
                    }
                    goto LABEL_a4b5a4;
                }
LABEL_a4b49c:
                if (v4 != 64)
                {
LABEL_a4b420:
                    v9 = (int)v11 >= (int)a4;
                    v11 += 1;
                    v12 = v13 - 1;
                    if (v13 == 1)
                        goto LABEL_a4b500;
                }
                else
                {
                    v16 = v10;
                    v17 = sub_a4b5e4(a0, v3, v5);
                    if (!(v17 >> 31 & 1))
                    {
                        v10 = v16;
                        if ((int)v7 < 1 || (unsigned int)v17)
                        {
                            v4 = 0;
                            v10 += v17;
                            v3 += v17 & 0xffffffff;
                            goto LABEL_a4b420;
                        }
                        else
                        {
                            v4 = 0;
                            goto LABEL_a4b5a4;
                        }
                    }
                    else
                    {
                        v4 = 0;
                        v18 = 0xffffffff;
                        v10 = v16;
                        break;
                    }
                    goto LABEL_a4b5a4;
                }
            }
            else
            {
LABEL_a4b5a4:
                v18 = 0xffffffff;
                break;
            }
        }
    }
    else
    {
        v7 = 0;
LABEL_a4b3cc:
        if (a4)
            goto LABEL_a4b3d0;
LABEL_a4b4ec:
        v18 = 0;
        v10 = 0;
    }
LABEL_a4b5ac:
    *a2 = v10;
    a0->field_0 = v4;
    return v18;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa31934..0xa31c3c (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a31934_0 {
    char padding_0[144];
    struct st_a31934_1 *field_90;
    char field_98;
} st_a31934_0;

typedef struct st_a31934_2 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[12];
    char field_28;
} st_a31934_2;

typedef struct st_a31934_1 {
    unsigned int field_0;
} st_a31934_1;

extern char g_c7c2eb;

unsigned long long sub_a31934(st_a31934_0 *a0, unsigned int a1, char a2, char a3)
{
    char v2;  // x5
    unsigned long v3;  // cc_dep1
    unsigned long v12;  // 4112
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    long long v18;  // x1
    unsigned int *v19;  // x19
    unsigned int *v20;  // x19
    unsigned int v21;  // w8
    unsigned int *v4;  // x8
    char v22;  // w9
    unsigned long iter;  // x10
    char v24;  // x9
    st_a31934_2 *v25;  // x8
    char v26;  // x0
    unsigned int v5;  // w9
    char v6;  // x8
    unsigned long v7;  // 4112
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_ctrl.c", 130, "ENGINE_ctrl");
        sub_a36abc(38, 0xc0102, 0);
        return 0;
    }
    v2 = *(long long *)&a0->padding_0[112];
    if (8 > a1 - 11)
    {
        if (v2)
        {
            if (a0->field_98 >> 1 & 1)
                goto *((void *)(v2));
            v3 = a1;
            switch (a1)
            {
            case 11:
                v4 = a0->field_90;
                if (!v4)
                    return 0;
                v5 = *v4;
                if (!*v4)
                    return 0;
                v6 = *(long long *)&v4[2];
                goto LABEL_a3197c;
            case 17:
                v12 = arm64g_calculate_condition(19, v3, 11, 0);
                v8 = 0;
                v9 = (v12 & 1 ? a1 : 0x40000000);
                v10 = (v12 & 1 ? 15 : 0);
                v13 = arm64g_calculate_condition(16, v9, v10, 0);
                if (v13 & 1)
                    goto LABEL_a31a19;
LABEL_a31a1a:
                v16 = arm64g_calculate_condition(v8 | 16, v9, v10, 0);
                v17 = arm64g_calculate_condition(16, (v16 & 1 ? a1 : 0x40000000), (v16 & 1 ? 13 : 0), 0);
                if (v17 & 1 || a3)
                    goto LABEL_a31a60;
                sub_a368c8();
                sub_a369bc("crypto/engine/eng_ctrl.c", 80, "int_ctrl_helper");
                v18 = 786690;
                break;
            default:
                v7 = arm64g_calculate_condition(19, v3, 11, 0);
                v8 = 3;
                v9 = (v7 & 1 ? a1 : 0x40000000);
                v10 = (v7 & 1 ? 15 : 0);
                v11 = arm64g_calculate_condition(19, v9, v10, 0);
                if (!(v11 & 1))
                    goto LABEL_a31a1a;
LABEL_a31a19:
                v14 = arm64g_calculate_condition(v8 | 16, v9, v10, 0);
                v15 = arm64g_calculate_condition(19, (v14 & 1 ? a1 : 0x40000000), (v14 & 1 ? 13 : 0), 0);
LABEL_a31a60:
                v19 = a0->field_90;
                if (a1 == 13)
                {
                    if (v19 && *v19)
                    {
                        do
                        {
                            v20 = v19;
                            if (!*(long long *)&v20[2])
                                break;
                            if (!_strcmp(*(long long *)&v20[2], a3))
                                return *v20;
                            v19 = v20 + 8;
                        } while (v20[8]);
                    }
                    sub_a368c8();
                    sub_a369bc("crypto/engine/eng_ctrl.c", 88, "int_ctrl_helper");
                    v18 = 137;
                    break;
                }
                else if (v19)
                {
                    v21 = *v19;
                    if (v21)
                    {
                        v22 = 0;
                        iter = v19 + 8;
                        do
                        {
                        } while (a2 > v21 && *(long long *)(iter - 24) && (v22 += 1, v21 = *(int *)iter, iter += 32, v21));
                        v24 = v22;
                    }
                    else
                    {
                        v24 = 0;
                    }
                    if (v21 != a2)
                        goto LABEL_a31b5c;
                    v25 = &v19[8 * v24];
                    if (15 < (int)a1)
                    {
                        if (a1 == 16)
                        {
                            a3 = (char)v25->padding_10;
                            if (!v25->padding_10)
                                a3 = (char)&g_c7c2eb;
                            return _strlen(a3);
                        }
                        else if (a1 != 0x11)
                        {
                            if (a1 == 18)
                                return v25->field_18;
                        }
                        else
                        {
                            if (!v25->padding_10)
                            {
                                _strcpy(a3);
                                return _strlen(a3);
                            }
                            _strcpy(a3);
                            return _strlen(a3);
                        }
                        goto LABEL_a31bdc;
                    }
                    switch (a1)
                    {
                    case 12:
                        v5 = *(int *)&v25->padding_1c[4];
                        if (!*(int *)&v25->padding_1c[4])
                            return 0;
                        v6 = *(long long *)&v25->field_28;
LABEL_a3197c:
                        if (!v6)
                            v26 = 0;
                        else
                            v26 = v5;
                        return v26;
                    case 14:
                        return _strlen(v25->field_8);
                    case 15:
                        _strcpy(a3);
                        return _strlen(a3);
                    default:
LABEL_a31bdc:
                        sub_a368c8();
                        sub_a369bc("crypto/engine/eng_ctrl.c", 121, "int_ctrl_helper");
                        v18 = 110;
                        break;
                    }
                    break;
                }
                else
                {
LABEL_a31b5c:
                    sub_a368c8();
                    sub_a369bc("crypto/engine/eng_ctrl.c", 99, "int_ctrl_helper");
                    v18 = 138;
                    break;
                }
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_ctrl.c", 154, "ENGINE_ctrl");
            v18 = 120;
        }
        sub_a36abc(38, v18, 0);
        return 0xffffffff;
    }
    if (a1 == 10)
        return v2 != 0;
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_ctrl.c", 167, "ENGINE_ctrl");
        sub_a36abc(38, 120, 0);
        return 0;
    }
    goto *((void *)(v2));
}

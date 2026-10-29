/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95da14..0x95dba4 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95da14_0 {
    long long field_0;
    unsigned int field_8;
    unsigned int field_c;
    unsigned long long field_10;
} st_95da14_0;

typedef struct st_95da14_2 {
    unsigned int field_0;
} st_95da14_2;

typedef struct st_95da14_3 {
    unsigned long long field_0;
} st_95da14_3;

typedef struct st_95da14_1 {
    struct st_95da14_2 *field_0;
    char padding_8[32];
    struct st_95da14_3 *field_28;
    char padding_30[48];
    struct st_95da14_0 *field_60;
    unsigned long long field_68;
} st_95da14_1;


int sub_95da14(char *a0, unsigned int a1, st_95da14_1 *a2)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned long long v21;  // 4163
    unsigned int v22;  // w8
    unsigned int v23;  // w10
    unsigned long v24;  // cc_dep1
    unsigned int v25;  // w12
    unsigned long long v26;  // 4106
    unsigned long long v27;  // 4106
    char *v28;  // x13
    unsigned long long v29;  // 4108
    unsigned long long v30;  // 4108
    unsigned long long v13;  // x24
    unsigned long v31;  // cc_dep1
    unsigned int v32;  // w23
    unsigned long long v33;  // 4106
    unsigned long long v34;  // 4106
    unsigned long long v35;  // 4106
    unsigned long long v36;  // 4106
    unsigned int v37;  // w22
    unsigned long v38;  // x26
    unsigned int v39;  // x24
    unsigned long long *iter;  // x25
    unsigned long long v14;  // x23
    unsigned long long v41;  // 4112
    unsigned long long *v42;  // x10
    unsigned long long v43;  // x8
    unsigned int v44;  // w11
    unsigned int v45;  // w9
    unsigned int v46;  // w11
    unsigned long long v47;  // x10
    unsigned int v48;  // w8
    unsigned long long v49;  // x8
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    char *v20;  // x20
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (a0)
    {
        v0 = v11;
        v1 = v12;
        v2 = v13;
        v3 = v14;
        v4 = v15;
        v5 = v16;
        v6 = v17;
        v7 = v18;
        v8 = &v10;
        v9 = v19;
        v20 = a0;
        v21 = arm64g_calculate_condition(1, a1, 1, 0);
        if (!(v21 & 1))
        {
            v22 = *v20;
            v23 = a1 - 1;
            v24 = v22 & 0xff;
            if (v22 != 43)
            {
                v25 = a1;
                v26 = arm64g_calculate_condition(19, v24, 43, 0);
                if (!(v26 & 1))
                    goto LABEL_95da5a;
LABEL_95da59:
                v28 = v20;
                v29 = arm64g_calculate_condition(19, v24, 43, 0);
                if (!(v29 & 1))
                    goto LABEL_95da5e;
LABEL_95da5d:
            }
            else
            {
                v25 = v23;
                v27 = arm64g_calculate_condition(19, v24, 43, 0);
                if (v27 & 1)
                    goto LABEL_95da59;
LABEL_95da5a:
                v28 = v20 + 1;
                v30 = arm64g_calculate_condition(19, v24, 43, 0);
                if (v30 & 1)
                    goto LABEL_95da5d;
LABEL_95da5e:
            }
            v31 = v22 & 0xff;
            if (v22 == 45)
            {
                v32 = v23;
                v33 = arm64g_calculate_condition(19, v31, 45, 0);
                if (!(v33 & 1))
                    goto LABEL_95da6a;
LABEL_95da69:
                v20 = v28;
                v35 = arm64g_calculate_condition(3, v31, 45, 0);
                if (!(v35 & 1))
                    goto LABEL_95da6e;
LABEL_95da6d:
                v37 = 0;
            }
            else
            {
                v32 = v25;
                v34 = arm64g_calculate_condition(19, v31, 45, 0);
                if (v34 & 1)
                    goto LABEL_95da69;
LABEL_95da6a:
                v20 += 1;
                v36 = arm64g_calculate_condition(3, v31, 45, 0);
                if (v36 & 1)
                    goto LABEL_95da6d;
LABEL_95da6e:
                v37 = 1;
            }
            v38 = a2->field_68;
            if (a2->field_68)
                goto LABEL_95da8c;
        }
        else
        {
            v37 = 1;
            v32 = 0xffffffff;
            v38 = a2->field_68;
            if (a2->field_68)
            {
LABEL_95da8c:
                v39 = 0;
                iter = &a2->field_60->field_10;
                do
                {
                    if (!((int)a2->field_0 & *(int *)((char *)iter - 4) & 12))
                        continue;
                    v41 = arm64g_calculate_condition(1, v32, 1, 0);
                    if (v41 & 1)
                    {
                        if (_strcmp(*(long long *)((char *)iter - 16), v20))
                            continue;
                        goto LABEL_95db20;
                    }
                    else
                    {
                        if (*(int *)((char *)iter - 8) != v32)
                            continue;
                        if (sub_a6e258(*(long long *)((char *)iter - 16), v20, v32))
                        {
                            v38 = a2->field_68;
                        }
                        else
                        {
LABEL_95db20:
                            v42 = a2->field_28;
                            if (v42)
                            {
                                v43 = *iter;
                                v44 = *(int *)((char *)iter - 4);
                                v45 = v44 & 1;
                                v46 = v44 & 0xf00;
                                if (v44 & 0xf00)
                                {
                                    switch (v46)
                                    {
                                    case 256:
                                        v47 = 64;
                                        break;
                                    case 512:
                                        v47 = 72;
                                        break;
                                    default:
                                        goto LABEL_95db74;
                                    }
                                    if (v45 == v37)
                                        v48 = *(int *)*(long long *)((char *)a2 + v47) & ~(unsigned int)v43;
                                    else
                                        v48 = *(int *)*(long long *)((char *)a2 + v47) | (unsigned int)v43;
                                    *(unsigned int *)*(long long *)((char *)a2 + v47) = v48;
                                    goto LABEL_95db74;
                                }
                                else
                                {
                                    if (v45 == v37)
                                        v49 = *v42 & ~v43;
                                    else
                                        v49 = *v42 | v43;
                                    *v42 = v49;
                                    a0 = 1;
                                    goto LABEL_95db08;
                                }
                            }
                            else
                            {
LABEL_95db74:
                                a0 = 1;
                                goto LABEL_95db08;
                            }
                        }
                    }
                } while ((v39 += 1, iter += 3, v38 > v39));
            }
        }
        a0 = 0;
LABEL_95db08:
    }
    return (unsigned int)a0;
}

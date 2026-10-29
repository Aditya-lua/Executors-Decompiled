/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c8b5c..0x3c918c (1584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c8b5c_1 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[8];
    int field_10;
    char padding_14[60];
    unsigned long long field_50;
    unsigned int field_58;
} st_3c8b5c_1;

typedef struct st_3c8b5c_0 {
    char field_0;
} st_3c8b5c_0;

extern char g_10002b0;

int sub_3c8b5c(int *a0)
{
    int *v13;  // x21
    unsigned long v14;  // cc_dep1
    int v23;  // w9
    int v24;  // w8
    int i;  // w22
    int *v26;  // x24
    int *v27;  // x27
    int v28;  // w28
    int v29;  // w10
    int v30;  // x26
    unsigned long v31;  // x20
    st_3c8b5c_1 *v32;  // x23
    unsigned long long v15;  // 4102
    int v33;  // w9
    unsigned int v34;  // w8
    int v35;  // w24
    int v36;  // w27
    int v37;  // w8
    unsigned long long v38;  // 4102
    unsigned long long v39;  // x22
    int v40;  // w10
    unsigned long v41;  // x8
    int v42;  // w9
    unsigned long long idx;  // x22
    int v43;  // w8
    int j;  // w22
    int *v45;  // x23
    int *v46;  // x26
    int v47;  // w24
    int v48;  // w9
    int v49;  // x10
    unsigned long v50;  // x20
    int *v51;  // x25
    int v52;  // w26
    int v17;  // w9
    int v53;  // w8
    unsigned long v54;  // x8
    int v18;  // w24
    int v19;  // w25
    int v20;  // w28
    int v21;  // x0
    int v22;  // w8
    int *v0;  // [bp-0x138]
    int *v1;  // [bp-0x130]
    unsigned long long v2;  // [bp-0x128]
    int *v3;  // [bp-0x120], Other Possible Types: int
    int *v4;  // [bp-0x118], Other Possible Types: int
    int *v5;  // [bp-0x110], Other Possible Types: int
    int *v6;  // [bp-0x108], Other Possible Types: unsigned long
    st_3c8b5c_0 **v7;  // [bp-0x100], Other Possible Types: char
    st_3c8b5c_0 *v8;  // [bp-0xf8]
    char v9;  // [bp-0xf0]
    unsigned long v10;  // [bp-0x70]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v13 = a0 + 0x1000;
    v8 = &v7;
    v7 = &v8;
    sub_3ce68c();
    v14 = v13[533];
    if (v13[524])
    {
        v15 = arm64g_calculate_condition(19, v14, 1, 0);
        if (!(v15 & 1))
        {
            idx = (char *)a0 + v13[534] * 96 + 18080;
            v17 = *(int *)(idx + 32) + 7 >> 3;
            if (v17 >= 1)
            {
                v18 = *(int *)(idx + 28) + 7 >> 3;
                if (v18 >= 1)
                {
                    v19 = 0;
                    v6 = a0 + 2;
                    v5 = v17;
                    while (1)
                    {
                        v20 = 0;
                        do
                        {
                            if (v13[525])
                            {
                                v21 = sub_3cf210(a0);
                                if (!v21)
                                {
                                    if (*(long long *)&g_10002b0 == v10)
                                        return v21;
                                    ___stack_chk_fail();
                                }
                            }
                            else
                            {
                                v21 = sub_3d70e0(a0);
                                if (!v21)
                                {
                                    if (*(long long *)&g_10002b0 == v10)
                                        return v21;
                                    ___stack_chk_fail();
                                }
                            }
                            v22 = v13[539];
                            v13[539] = v22 - 1;
                            if (1 < v22)
                                continue;
                            if (23 >= v13[521])
                                sub_3ce8a0(a0);
                            if (((char)v13[522] & 248) != 208)
                                goto LABEL_3c914c;
                            sub_3ce68c(a0);
                        } while ((v20 += 1, v18 != v20));
                        v19 += 1;
                        if (v19 == v5)
                        {
                            if (*(long long *)&g_10002b0 == v10)
                                return 1;
                            ___stack_chk_fail();
                        }
                    }
                }
            }
LABEL_3c914c:
            v21 = 1;
        }
        else
        {
            v23 = v13[421];
            if (v23 < 1 || (v24 = v13[420], v24 < 1))
                goto LABEL_3c914c;
            i = 0;
            v26 = a0 + 4630;
            v27 = a0 + 4520;
            v5 = v26;
            v6 = v27;
            do
            {
                if (v24 >= 1)
                {
                    v28 = 0;
                    do
                    {
                        v29 = v13[533];
                        if (v13[533] >= 1)
                        {
                            v30 = 0;
                            do
                            {
                                v31 = v26[v30];
                                v32 = (char *)v27 + (unsigned int)v31 * 96;
                                v33 = *(int *)&v32->padding_8[0];
                                if (*(int *)&v32->padding_8[0] >= 1)
                                {
                                    v34 = v32->field_4;
                                    if ((int)v32->field_4 >= 1)
                                    {
                                        v35 = 0;
                                        do
                                        {
                                            if ((int)v34 >= 1)
                                            {
                                                v36 = 0;
                                                while (1)
                                                {
                                                    v21 = sub_3d70e0(a0, v32->field_50 + (v36 + (v35 + *(int *)&v32->padding_8[0] * i) * v32->field_58 + v34 * v28) * 64 * 2, (char *)a0 + v32->field_10 * 1680 + 2, v31);
                                                    if (!v21)
                                                        break;
                                                    v36 += 1;
                                                    v34 = v32->field_4;
                                                    if (v36 >= (int)v34)
                                                    {
                                                        v33 = *(int *)&v32->padding_8[0];
                                                        v27 = v6;
                                                        goto LABEL_3c8eb4;
                                                    }
                                                }
                                            }
LABEL_3c8eb4:
                                        } while ((v35 += 1, v33 > v35));
                                        v29 = v13[533];
                                        v26 = v5;
                                    }
                                }
                            } while ((v30 += 1, v29 > v30));
                        }
                        v37 = v13[539];
                        v13[539] = v37 - 1;
                        if (1 < v37)
                            continue;
                        if (23 >= v13[521])
                            sub_3ce8a0(a0);
                        if (((char)v13[522] & 248) != 208)
                            goto LABEL_3c914c;
                        sub_3ce68c(a0);
                    } while ((v28 += 1, v24 = v13[420], v28 < v13[420]));
                    v23 = v13[421];
                }
                i += 1;
                v21 = 1;
            } while (i < v23);
        }
    }
    else
    {
        v38 = arm64g_calculate_condition(19, v14, 1, 0);
        if (!(v38 & 1))
        {
            v6 = v13[534];
            v39 = (char *)a0 + (unsigned int)v6 * 96 + 18080;
            v40 = *(int *)(v39 + 32) + 7 >> 3;
            if (v40 < 1 || *(int *)(v39 + 28) + 7 >> 3 < 1)
                goto LABEL_3c914c;
            v5 = a0 + 2;
            v3 = v40;
            v4 = 0;
            v41 = *(int *)(v39 + 20);
            v21 = sub_3d2500(a0, &v9, (char *)v5 + *(int *)(v39 + 16) * 1680, (char *)a0 + (unsigned int)v41 * 1680 + 1682, (char *)&a0[872 + 0x100 * v41] + 2, v6, (char *)&a0[840 + 32 * *(int *)(v39 + 12)] + 2);
            if (v21)
                (*(long long *)&a0[4636])();
        }
        else
        {
            v42 = v13[421];
            if (v42 < 1 || (v43 = v13[420], v43 < 1))
                goto LABEL_3c914c;
            j = 0;
            v45 = a0 + 4630;
            v46 = a0 + 4520;
            v5 = a0 + 1682;
            v6 = a0 + 2;
            v4 = a0 + 3490;
            v3 = a0 + 3362;
            v0 = v46;
            v1 = v45;
            do
            {
                if (v43 >= 1)
                {
                    v47 = 0;
                    do
                    {
                        v48 = v13[533];
                        if (v13[533] >= 1)
                        {
                            v49 = 0;
                            do
                            {
                                v50 = v45[v49];
                                v51 = (char *)v46 + (unsigned int)v50 * 96;
                                if (v51[2] >= 1 && v51[1] >= 1)
                                {
                                    v52 = 0;
                                    v2 = v49;
                                    do
                                    {
                                        if (v51[1] >= 1)
                                        {
                                            v54 = v51[5];
                                            v21 = sub_3d2500(a0, &v9, (char *)v6 + v51[4] * 1680, (char *)v5 + (unsigned int)v54 * 1680, &v4[0x100 * v54], v50, &v3[32 * v51[3]]);
                                            if (v21)
                                                (*(long long *)&a0[4636])();
                                            if (*(long long *)&g_10002b0 == v10)
                                                return v21;
                                            ___stack_chk_fail();
                                        }
                                    } while ((v52 += 1, v51[2] > v52));
                                    v48 = v13[533];
                                    v46 = v0;
                                    v45 = v1;
                                }
                            } while ((v49 += 1, v48 > v49));
                        }
                        v53 = v13[539];
                        v13[539] = v53 - 1;
                        if (1 < v53)
                            continue;
                        if (23 >= v13[521])
                            sub_3ce8a0(a0);
                        if (((char)v13[522] & 248) != 208)
                            goto LABEL_3c914c;
                        sub_3ce68c(a0);
                    } while ((v47 += 1, v43 = v13[420], v47 < v13[420]));
                    v42 = v13[421];
                }
                j += 1;
                v21 = 1;
            } while (j < v42);
        }
    }
    if (*(long long *)&g_10002b0 == v10)
        return v21;
    ___stack_chk_fail();
}

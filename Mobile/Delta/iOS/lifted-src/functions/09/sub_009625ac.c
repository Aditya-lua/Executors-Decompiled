/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9625ac..0x962858 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9625ac_0 {
    unsigned int field_0;
    char padding_4[76];
    long long field_50;
    unsigned long long field_58;
    char padding_60[36];
    char field_84;
} st_9625ac_0;


unsigned long long sub_9625ac(st_9625ac_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4108
    unsigned long v21;  // cc_op
    unsigned long long v22;  // 4112
    unsigned long long v9;  // x20
    unsigned long long v23;  // 4108
    unsigned long long v24;  // x0
    unsigned long long v10;  // x19
    unsigned long v25;  // x8
    unsigned long long v26;  // x0
    long long v27;  // x21
    unsigned long v28;  // x8
    unsigned long long v29;  // w0
    unsigned long long v30;  // w0
    unsigned long long v11;  // x30
    unsigned long long v31;  // w8
    unsigned long long v32;  // x0
    unsigned long long v33;  // x0
    unsigned long v34;  // x0
    unsigned long long v35;  // x0
    unsigned long long v36;  // w0
    st_9625ac_0 *v12;  // x19
    unsigned long v13;  // x8
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return 1 > a1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0;
    v13 = a0->field_0;
    if ((unsigned int)v13)
    {
        if (!(v13 >> 7 & 1))
        {
            a0 = 0;
        }
        else
        {
            a0 = sub_980dc8(v12);
            if (0 < a1)
                return 0;
LABEL_962624:
            if ((char)v12->field_0 < 0)
            {
                v14 = sub_97df60(v12);
                if ((unsigned int)v14)
                    return v14;
            }
            if (!a0)
                return 1;
            if (a2)
            {
                v15 = sub_a35fe4();
                if (v15)
                {
                    if ((v15 & 0xff800000) != 0x1000000)
                    {
                        v19 = arm64g_calculate_condition(v21 | 16, v16, v17, v18);
                        v20 = arm64g_calculate_condition(179, (v19 & 1 ? v15 & 0xffffffff : 0x80000000), 0, 0);
                        if (!(v20 & 1))
                            goto LABEL_962666;
LABEL_962665:
                        v24 = 5;
                    }
                    else
                    {
                        v22 = arm64g_calculate_condition(v21 | 16, v16, v17, v18);
                        v23 = arm64g_calculate_condition(176, (v22 & 1 ? v15 & 0xffffffff : 0x80000000), 0, 0);
                        if (v23 & 1)
                            goto LABEL_962665;
LABEL_962666:
                        v24 = 1;
                    }
                    return v24;
                }
            }
            v25 = v12->field_0;
            if (v25 >> 7 & 1)
            {
LABEL_962780:
                v33 = sub_980dc8(v12);
                v28 = v12->field_0;
                if (v28 >> 7 & 1)
                {
                    v34 = sub_97e058(v12);
LABEL_9627a4:
                    if ((unsigned int)v34 == 4)
                        return v34;
                    v28 = v12->field_0;
LABEL_9627b0:
                    v35 = v12;
                    if (!(unsigned int)v28)
                        goto LABEL_9627d0;
LABEL_9627b8:
                    if (v28 >> 7 & 1)
                    {
                        v35 = sub_980dc8(v12);
                        if ((char)v12->field_0 >= 0)
                        {
                            if (v35)
                            {
LABEL_9627d0:
                                v36 = *(int *)(v35 + 104);
                                goto LABEL_9627e0;
                            }
                        }
                        else
                        {
                            v36 = (unsigned int)sub_97e058(v12);
LABEL_9627e0:
                            if (v36 == 8)
                                return 12;
                        }
                    }
                    if (sub_962858(v12) == 5)
                        return 9;
                    if (sub_962858(v12) == 6)
                        return 10;
                    if (sub_962858(v12) == 7)
                        return 11;
                    if (!(a0->field_84 >> 1 & 1) || *(int *)&a0[3].padding_4[41])
                        return 5;
                    return 6;
                    return 5;
                }
                else if (!v33)
                {
                    goto LABEL_9627b0;
                }
LABEL_962794:
                v34 = *(int *)(v33 + 104);
                goto LABEL_9627a4;
            }
            if ((unsigned int)v25)
            {
LABEL_962678:
                if (!(v25 >> 7 & 1))
                    goto LABEL_962770;
                v26 = sub_980dc8(v12);
                v28 = v12->field_0;
                if (!(v28 >> 7 & 1))
                {
                    if (!v26)
                        goto LABEL_962774;
LABEL_9626ec:
                    v29 = *(int *)(v26 + 104);
                }
                else
                {
                    v29 = (unsigned int)sub_97e058(v12);
                }
                if (v29 == 2)
                {
                    v27 = a0->field_58;
                    if (sub_9d3d68(v27, 2))
                        return 3;
                    if (sub_9d3d68(v27, 1))
                        return 2;
                    if (sub_9d3d68(v27, 4))
                    {
LABEL_962748:
                        v30 = (unsigned int)sub_9d4f84(v27);
                        if (v30 == 3)
                            v31 = 8;
                        else
                            v31 = 5;
                        if (v30 == 2)
                            v32 = 7;
                        else
                            v32 = v31;
                        return v32;
                    }
                }
LABEL_962770:
                v28 = v12->field_0;
LABEL_962774:
                v33 = v12;
                if (!(unsigned int)v28)
                    goto LABEL_962794;
                if (!(v28 >> 7 & 1))
                    goto LABEL_9627b8;
                goto LABEL_962780;
            }
            else
            {
                v26 = v12;
                if (*(int *)(v26 + 104) == 3)
                {
                    v27 = v12->field_50;
                    if (sub_9d3d68(v27, 1))
                        return 2;
                    if (sub_9d3d68(v27, 2))
                        return 3;
                    if (sub_9d3d68(v27, 4))
                        goto LABEL_962748;
                    v25 = v12->field_0;
                    v26 = v12;
                    if ((unsigned int)v25)
                        goto LABEL_962678;
                    goto LABEL_9626ec;
                }
            }
        }
    }
    if (a1 > 0)
        return 0;
    goto LABEL_962624;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc57854..0xc57afc (680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c57854_0 {
    char field_0[7];
    char field_3;
    char padding_4[3];
    struct st_c57854_0 *field_7;
    char field_f;
} st_c57854_0;

typedef struct st_c57854_1 {
    unsigned long long field_0;
    struct st_c57854_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    struct st_c57854_0 *field_20;
    unsigned long long field_28;
    struct st_c57854_0 *field_30;
    struct st_c57854_0 *field_38;
    struct st_c57854_0 *field_40;
    char field_48[7];
    char field_4b;
    char padding_4c[3];
    struct st_c57854_0 *field_4f;
    char field_57;
} st_c57854_1;

extern long long g_efcfd0;

unsigned long long sub_c57854(st_c57854_1 *a0, long long a1, long long a2, unsigned short *a3, st_c57854_0 *a4)
{
    st_c57854_0 *v12;  // x22
    st_c57854_0 *v13;  // x28
    unsigned long long v20;  // x0
    unsigned long v21;  // x9
    st_c57854_0 *v22;  // x8
    unsigned long long v23;  // x10
    unsigned int v24;  // w11
    st_c57854_0 *v25;  // x11
    st_c57854_0 *v26;  // x8
    st_c57854_0 *v27;  // x11
    st_c57854_0 *v28;  // x8
    unsigned long v29;  // cc_dep1
    unsigned long long i;  // x24
    unsigned long long v31;  // 4105
    unsigned long long v33;  // 4105
    st_c57854_0 *v34;  // x11
    st_c57854_0 *v35;  // x8
    unsigned short *v15;  // x27
    unsigned long v16;  // x25
    unsigned long long v17;  // x26
    st_c57854_0 *v18;  // x23
    unsigned long v19;  // x24
    st_c57854_0 *v0;  // [bp-0xac]
    st_c57854_0 *v1;  // [bp-0xa8]
    st_c57854_0 *v2;  // [bp-0xa0]
    unsigned long long v3;  // [bp-0x98]
    unsigned long v4;  // [bp-0x90]
    st_c57854_0 *v5;  // [bp-0x88]
    char v6;  // [bp-0x80]
    st_c57854_0 *v7;  // [bp-0x78]
    unsigned long long v8;  // [bp-0x70]
    uint56_t v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    *(unsigned int *)((char *)&v9 + 3) = 0;
    *(unsigned int *)&v9 = 0;
    if (a4)
    {
        v12 = 0;
        v13 = 0;
        v1 = 0;
        v0 = (st_c57854_0 *)0;
        i = a4 * 4;
        v15 = a3 + 1;
        v4 = 46;
        v5 = 0;
        v16 = 46;
        do
        {
            v19 = i;
            v20 = sub_c57ce4(&v6, a1, a2, *v15);
            v21 = v6;
            v22 = v7;
            v23 = v8;
            if (v21 == 46)
            {
                a0->field_8 = v22;
                a0->field_10 = v23;
                a0->field_0 = 46;
                return v20;
            }
            v24 = *(short *)((char *)v15 - 2);
            if (3 >= (int)v24)
            {
                if (v24 == 1)
                {
                    v2 = v22;
                    v3 = v23;
                    v4 = v21;
                    continue;
                }
                else if (v24 != 2)
                {
                    if (v24 != 3)
                        continue;
                    if (4 >= (long long)v21)
                    {
                        v25 = v22 & 0xffff;
                        v26 = v22 & 0xffffffff;
                        if (v21 == 4)
                            v13 = v26;
                        if (v21 == 3)
                            v13 = v25;
                        if (v21 == 2)
                            v13 = v22 & 0xff;
                        continue;
                    }
                    else
                    {
                        if (v21 != 5)
                        {
                            if (v21 != 6)
                            {
                                if (v21 != 7)
                                    continue;
                            }
                            else
                            {
                                if (v22 < 0)
                                    continue;
                            }
                        }
                        v13 = v22;
                        continue;
                    }
                }
                else if (4 >= (long long)v21)
                {
                    v27 = v22 & 0xffff;
                    v28 = v22 & 0xffffffff;
                    if (v21 != 4)
                        v28 = v5;
                    if (v21 == 3)
                        v28 = v27;
                    if (v21 == 2)
                        v28 = v22 & 0xff;
                    v5 = v28;
                    continue;
                }
                else
                {
                    if (v21 != 5)
                    {
                        if (v21 != 6)
                        {
                            if (v21 != 7)
                                continue;
                        }
                        else
                        {
                            if (v22 < 0)
                                continue;
                        }
                    }
                    v5 = v22;
                    continue;
                }
            }
            switch (v24)
            {
            case 4:
                if (4 >= (long long)v21)
                {
                    v34 = v22 & 0xffff;
                    v35 = v22 & 0xffffffff;
                    if (v21 == 4)
                        v12 = v35;
                    if (v21 == 3)
                        v12 = v34;
                    if (v21 == 2)
                        v12 = v22 & 0xff;
                    continue;
                }
                else
                {
                    if (v21 != 5)
                    {
                        if (v21 != 6)
                        {
                            if (v21 != 7)
                                continue;
                        }
                        else
                        {
                            if (v22 < 0)
                                continue;
                        }
                    }
                    v12 = v22;
                    continue;
                }
            case 5:
                if (v21 == 1 && v23 == 16)
                {
                    *(int *)&v9 = *(int *)&v22->field_0[0];
                    *(int *)((char *)&v9 + 3) = *(int *)&v22->field_0[3];
                    v1 = *(long long *)&v22->field_3;
                    v0 = (st_c57854_0 *)(v22->padding_4)[2 + 1];
                    break;
                }
                break;
            case 8193:
                v29 = v24 & 0xffff;
                v18 = v18;
                v31 = arm64g_calculate_condition(3, v29, 8193, 0);
                if (!(v31 & 1))
                {
                    v33 = arm64g_calculate_condition(3, v29, 8193, 0);
                    if (!(v33 & 1))
                    {
LABEL_c57964:
                        continue;
                    }
                    v16 = v21;
                    goto LABEL_c57964;
                }
            default:
                v29 = v24 & 0xffff;
                v18 = v18;
                v31 = arm64g_calculate_condition(3, v29, 8193, 0);
                if (!(v31 & 1))
                {
                    v33 = arm64g_calculate_condition(3, v29, 8193, 0);
                    if (!(v33 & 1))
                    {
LABEL_c57964:
                        continue;
                    }
                    v16 = v21;
                    goto LABEL_c57964;
                }
            }
            v15 += 2;
            i = v19 - 4;
        } while (i);
        if (v4 != 46)
        {
            *(unsigned int *)&a0->field_48[0] = *(unsigned int *)&v9;
            *(unsigned int *)&a0->field_48[3] = *(unsigned int *)((void*)&v9 + 3);
            a0->field_0 = v4;
            a0->field_8 = v2;
            a0->field_10 = v3;
            a0->field_18 = v16;
            a0->field_20 = v18;
            a0->field_28 = v17;
            a0->field_30 = v5;
            a0->field_38 = v13;
            a0->field_40 = v12;
            *(st_c57854_0 **)&a0->field_4b = v1;
            (a0->padding_4c)[2 + 1] = (char)v0;
            return v20;
        }
    }
    sub_c73c64(&g_efcfd0);
}

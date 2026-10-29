/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ab14..0xa5ac9c (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5ab14_0 {
    struct st_a5ab14_0 *field_0;
    char padding_8[24];
    struct st_a5ab14_0 *field_20;
    char padding_28[36];
    char field_4c;
} st_a5ab14_0;


st_a5ab14_0 * sub_a5ab14(st_a5ab14_0 *a0, unsigned long a1, st_a5ab14_0 *a2)
{
    st_a5ab14_0 *v3;  // x0
    st_a5ab14_0 *v4;  // w22
    st_a5ab14_0 *v13;  // w8
    st_a5ab14_0 *v14;  // w0
    char v15;  // x8
    st_a5ab14_0 *v5;  // w0
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4109
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4109
    st_a5ab14_0 *v12;  // x0
    char v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9c5df4(&v0);
    if (v3)
        v4 = (st_a5ab14_0 *)(int)v3->field_0;
    else
        v4 = (st_a5ab14_0 *)0;
    sub_a32e7c(v0);
    if (!a2)
    {
LABEL_a5aba4:
        if (a0)
        {
LABEL_a5abbc:
            v12 = sub_a5a8d8(a0, 0);
            if (!(unsigned int)v12)
                return v12;
            a0->field_20 = a2;
            if (407 >= (int)a0->field_0)
            {
                switch (v13)
                {
                case 6:
                    goto LABEL_a5ac28;
                case 28:
                    if (a2)
                    {
                        v14 = (st_a5ab14_0 *)(unsigned int)sub_9fd968(a2);
                    }
                    else
                    {
                        a0->field_4c = a0->field_4c & 254;
                        return a2 != 0;
                    }
                case 116:
                    if (a2)
                    {
                        v14 = (st_a5ab14_0 *)(unsigned int)sub_a01568(a2);
                        break;
                    }
                    else
                    {
                        a0->field_4c = a0->field_4c & 254;
                        return a2 != 0;
                    }
                default:
                    v15 = a0->field_4c & 254;
                    a0->field_4c = v15;
                    return a2 != 0;
                }
            }
            else
            {
                switch (v13)
                {
                case 408:
                    if (a2)
                    {
                        v14 = (st_a5ab14_0 *)(unsigned int)sub_a177b4(a2);
                        break;
                    }
                    else
                    {
                        a0->field_4c = a0->field_4c & 254;
                        return a2 != 0;
                    }
                case 1172:
                    return a2 != 0;
                case 912:
LABEL_a5ac28:
                    if (!a2)
                    {
                        a0->field_4c = a0->field_4c & 254;
                        return a2 != 0;
                    }
                    v14 = (st_a5ab14_0 *)(unsigned int)sub_aaec5c(a2);
                    break;
                default:
                    v15 = a0->field_4c & 254;
                    a0->field_4c = v15;
                    return a2 != 0;
                }
            }
            a0->field_4c = a0->field_4c & 254 | v14 != 0;
            return a2 != 0;
        }
    }
    else if (v4 == 1172 || v4 == 408)
    {
        if (!sub_9ffdd0(a2))
            goto LABEL_a5aba4;
        v5 = (st_a5ab14_0 *)(unsigned int)sub_a1abcc();
        v6 = v4;
        v7 = 408;
        if (v4 == 408 && (v6 = v5, v7 = 1172, v5 == 1172))
            goto LABEL_a5abb4;
        if (v5 != 1172)
        {
            v8 = arm64g_calculate_condition(19, v6, v7, 0);
            v9 = arm64g_calculate_condition(3, (v8 & 1 ? (unsigned long long)v4 : 0), (v8 & 1 ? 1172 : 0), 0);
            if (!(v9 & 1))
                goto LABEL_a5ab9a;
LABEL_a5ab99:
        }
        else
        {
            v10 = arm64g_calculate_condition(19, v6, v7, 0);
            v11 = arm64g_calculate_condition(0, (v10 & 1 ? (unsigned long long)v4 : 0), (v10 & 1 ? 1172 : 0), 0);
            if (v11 & 1)
                goto LABEL_a5ab99;
LABEL_a5ab9a:
        }
        if (a0)
            goto LABEL_a5abbc;
    }
    else
    {
LABEL_a5abb4:
        if (a0)
            goto LABEL_a5abbc;
    }
    return 0;
}

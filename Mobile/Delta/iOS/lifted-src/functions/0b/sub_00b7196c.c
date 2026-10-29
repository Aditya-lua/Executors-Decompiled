/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7196c..0xb71b50 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7196c_0 {
    struct st_b7196c_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_b7196c_0 *field_8;
    struct st_b7196c_0 *field_10;
} st_b7196c_0;


st_b7196c_0 * sub_b7196c(st_b7196c_0 *a0, void* a1, st_b7196c_0 *a2)
{
    st_b7196c_0 *v4;  // x19
    st_b7196c_0 *dst;  // x0
    st_b7196c_0 *v14;  // x22
    st_b7196c_0 *dst1;  // x0
    unsigned int v16;  // w8
    st_b7196c_0 *v17;  // x9
    unsigned long long v6;  // 4117
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4117
    st_b7196c_0 *v9;  // x23
    st_b7196c_0 *v10;  // x0
    st_b7196c_0 *v11;  // x21
    st_b7196c_0 **v12;  // x9
    st_b7196c_0 *v13;  // x23
    st_b7196c_0 *v0;  // [bp-0x50]
    st_b7196c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a2;
    if (a2)
    {
        dst = a0;
        if (*(char *)a1 == 47)
            goto LABEL_b719f0;
        if (v4 != 1 && (v6 = arm64g_calculate_condition(177, (char)a1[1], 64, 0), !(v6 & 1)))
        {
            if (3 >= v4)
            {
                v7 = arm64g_calculate_condition(4, v4, 3, 0);
            }
            else
            {
                v8 = arm64g_calculate_condition(177, (char)a1[3], 64, 0);
                if (!(v8 & 1) && !(dst = a0, (short)a1[1] != 12090))
                    goto LABEL_b719f0;
            }
        }
    }
    dst = sub_b71b50(a1, v4);
    if (!(unsigned int)dst)
        goto LABEL_b71a04;
LABEL_b719f0:
    if (v4 < 0)
    {
        v9 = 0;
    }
    else if (v4)
    {
        v9 = 1;
        v10 = sub_b71868(v4, 1);
        if (v10)
        {
            dst = _memcpy();
            v11 = v4;
            goto LABEL_b71ac0;
        }
    }
    else
    {
        v11 = 0;
        v10 = 1;
LABEL_b71ac0:
        if (a0->field_0)
        {
            dst = *(long long *)&a0->field_1;
            v1 = 1;
            v12 = &v0;
        }
        else
        {
            v12 = &v1;
        }
        *v12 = a0->field_0;
        if (v1 && v0)
            dst = _free();
        a0->field_0 = v11;
        *(st_b7196c_0 **)&a0->field_1 = v10;
        a0->field_8 = v4;
        return dst;
    }
    sub_c6b970(v9, v4);
LABEL_b71a04:
    v13 = *(long long *)&a0->field_1;
    v14 = a0->field_8;
    dst1 = sub_b71b50(v13, v14);
    if (v14)
    {
        if ((unsigned int)dst1)
            v16 = 92;
        else
            v16 = 47;
        if (v16 != *(char *)(v13 + v14 - 1))
        {
            if (a0->field_0 != v14)
            {
                v17 = v14;
            }
            else
            {
                dst1 = sub_c6b944(a0, v14, 1);
                v13 = *(long long *)&a0->field_1;
                v17 = a0->field_8;
            }
            *(char *)(v13 + v17) = v16;
            v14 = (char *)&v14->field_0 + 1;
            a0->field_8 = v14;
        }
    }
    if (a0->field_0 - v14 < v4)
    {
        sub_c6b944(a0, v14, v4);
        v13 = *(long long *)&a0->field_1;
        v14 = a0->field_8;
    }
    else if (!v4)
    {
        a0->field_8 = v14 + v4;
        return dst1;
    }
    dst1 = _memcpy(v13 + v14, a1, v4);
    a0->field_8 = a0->field_8 + v4;
    return dst1;
}

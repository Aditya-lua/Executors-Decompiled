/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb74df4..0xb74fb0 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b74df4_1 {
    struct st_b74df4_0 *field_0;
    struct st_b74df4_0 *field_8;
    struct st_b74df4_0 *field_10;
    struct st_b74df4_0 *field_18;
    struct st_b74df4_0 *field_20;
    struct st_b74df4_0 *field_28;
    struct st_b74df4_0 *field_30;
    struct st_b74df4_0 *field_38;
    struct st_b74df4_0 *field_40;
    struct st_b74df4_0 *field_48;
    struct st_b74df4_0 *field_50;
    struct st_b74df4_0 *field_58;
    struct st_b74df4_0 *field_60;
    struct st_b74df4_0 *field_68;
    struct st_b74df4_0 *field_70;
    char padding_78[8];
    struct st_b74df4_0 *field_80;
} st_b74df4_1;

typedef struct st_b74df4_0 {
    struct st_b74df4_0 *field_0;
} st_b74df4_0;


st_b74df4_0 ** sub_b74df4(st_b74df4_1 *a0)
{
    st_b74df4_0 **v5;  // x9
    st_b74df4_1 *v6;  // x0
    st_b74df4_0 **v15;  // x9
    st_b74df4_0 **v16;  // x10
    st_b74df4_0 **v17;  // x9
    st_b74df4_0 **v18;  // x8
    st_b74df4_0 **v19;  // x9
    st_b74df4_0 **ptr;  // x8
    st_b74df4_0 **v8;  // x1
    st_b74df4_0 **v9;  // x21
    st_b74df4_0 **v10;  // x19
    st_b74df4_0 **v11;  // x9
    st_b74df4_0 **v12;  // x10
    st_b74df4_0 **v13;  // x23
    st_b74df4_0 **v14;  // x10
    char v0;  // [bp-0x58]
    st_b74df4_0 **v1;  // [bp-0x50]
    st_b74df4_0 **v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0->field_0 != 2)
    {
        if (a0->field_0 == 1)
        {
            v5 = a0->field_8;
            a0->field_8 = 0;
            if (v5)
                return v5;
            a0->field_0 = 0;
        }
        v6 = a0;
        if (v6->field_10 == 1)
        {
            v6 = a0;
            if (v6->field_18)
            {
                v6 = a0;
                if (a0->field_20 != v6->field_30)
                {
                    v15 = *(long long *)a0->field_20;
                    v6->field_20 = a0->field_20 + 1;
                    return v15;
                }
                v6 = a0;
                if (v6->field_28)
                {
                    _free(a0->field_18);
                    v6 = a0;
                }
                v6->field_18 = 0;
            }
            v8 = v6->field_58;
            if (v8)
            {
                v9 = v6->field_60;
                if (v8 != v9)
                {
                    v10 = v8 + 8;
                    v6->field_58 = v10;
                    sub_b74fb0(&v0);
                    v6 = a0;
                    v11 = (st_b74df4_0 **)v0;
                    if (v11 != 0x8000000000000000)
                    {
                        ptr = v1;
                        v12 = v2;
                        v6->field_18 = ptr;
                        v6->field_20 = ptr;
                        v6->field_28 = v11;
                        v6->field_30 = (char *)ptr + 0x8 * v12;
                        if (v12)
                        {
                            v15 = *ptr;
                            v6->field_20 = ptr + 1;
                            return v15;
                        }
                        while (1)
                        {
                            if (v11)
                            {
                                _free(ptr);
                                v6 = a0;
                            }
                            v6->field_18 = 0;
                            if (v10 == v9)
                                break;
                            v13 = v10 + 8;
                            v6->field_58 = v13;
                            sub_b74fb0(&v0, v10);
                            v6 = a0;
                            v11 = (st_b74df4_0 **)v0;
                            if (v11 == 0x8000000000000000)
                                break;
                            ptr = v1;
                            v14 = v2;
                            v6->field_18 = ptr;
                            v6->field_20 = ptr;
                            v6->field_28 = v11;
                            v6->field_30 = (char *)ptr + 0x8 * v14;
                            v10 = v13;
                            if (v14)
                            {
                                v15 = *ptr;
                                v6->field_20 = ptr + 1;
                                return v15;
                            }
                        }
                    }
                }
            }
            if (v6->field_38)
            {
                v16 = v6->field_40;
                if (v16 != v6->field_50)
                {
                    v17 = *v16;
                    v6->field_40 = v16 + 1;
                    return v17;
                }
                if (v6->field_48)
                {
                    _free(v6->field_38);
                    v6 = a0;
                }
                v6->field_38 = 0;
            }
        }
        v6->field_0 = 2;
        a0 = v6;
    }
    if (a0->field_68)
    {
        v18 = a0->field_70;
        if (v18 != a0->field_80)
        {
            v19 = *v18;
            a0->field_70 = v18 + 1;
            return v19;
        }
    }
    return 0;
}

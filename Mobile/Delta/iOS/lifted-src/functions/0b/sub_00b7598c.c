/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7598c..0xb75b18 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7598c_0 {
    struct st_b7598c_0 *field_0;
} st_b7598c_0;

typedef struct st_b7598c_1 {
    unsigned long long field_0;
    struct st_b7598c_0 *field_8;
    struct st_b7598c_0 *field_10;
    struct st_b7598c_0 *field_18;
    struct st_b7598c_0 *field_20;
    struct st_b7598c_0 *field_28;
    struct st_b7598c_0 *field_30;
    struct st_b7598c_0 *field_38;
    struct st_b7598c_0 *field_40;
    struct st_b7598c_0 *field_48;
    struct st_b7598c_0 *field_50;
    struct st_b7598c_0 *field_58;
    struct st_b7598c_0 *field_60;
    struct st_b7598c_0 *field_68;
    struct st_b7598c_0 *field_70;
} st_b7598c_1;


st_b7598c_0 ** sub_b7598c(st_b7598c_1 *a0)
{
    st_b7598c_0 **v5;  // x8
    st_b7598c_0 **v6;  // x0
    st_b7598c_0 **v15;  // x8
    st_b7598c_0 **v16;  // x8
    st_b7598c_0 **v17;  // x0
    st_b7598c_0 **v7;  // x0
    st_b7598c_0 **v8;  // x1
    st_b7598c_0 **v9;  // x21
    st_b7598c_0 **v10;  // x20
    st_b7598c_0 **v11;  // x8
    st_b7598c_0 **v12;  // x9
    st_b7598c_0 **v13;  // x23
    st_b7598c_0 **v14;  // x9
    char v0;  // [bp-0x58]
    st_b7598c_0 **v1;  // [bp-0x50]
    st_b7598c_0 **v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0->field_58)
    {
        v5 = a0->field_60;
        if (v5 != a0->field_70)
        {
            v6 = *v5;
            a0->field_60 = v5 + 1;
            return v6;
        }
        if (a0->field_68)
            _free();
        a0->field_58 = 0;
    }
    if (a0->field_0 != 1)
        return 0;
    if (a0->field_8)
    {
        if (a0->field_10 != a0->field_20)
        {
            v15 = *(long long *)a0->field_10;
            a0->field_10 = a0->field_10 + 1;
            return v15;
        }
        if (a0->field_18)
            _free(a0->field_8);
        a0->field_8 = 0;
    }
    v8 = a0->field_48;
    if (v8)
    {
        v9 = a0->field_50;
        if (v8 != v9)
        {
            v10 = v8 + 8;
            a0->field_48 = v10;
            sub_b74fb0(&v0);
            v11 = (st_b7598c_0 **)v0;
            if (v11 != 0x8000000000000000)
            {
                v7 = v1;
                v12 = v2;
                a0->field_8 = v7;
                a0->field_10 = v7;
                a0->field_18 = v11;
                a0->field_20 = (char *)v7 + 0x8 * v12;
                if (v12)
                {
                    v15 = *v7;
                    a0->field_10 = v7 + 1;
                    return v15;
                }
                while (1)
                {
                    if (v11)
                        _free();
                    a0->field_8 = 0;
                    if (v10 == v9 || !(v13 = v10 + 8, a0->field_48 = v13, sub_b74fb0(&v0, v10), v11 = (st_b7598c_0 **)v0, v11 != 0x8000000000000000))
                        break;
                    v7 = v1;
                    v14 = v2;
                    a0->field_8 = v7;
                    a0->field_10 = v7;
                    a0->field_18 = v11;
                    a0->field_20 = (char *)v7 + 0x8 * v14;
                    v10 = v13;
                    if (v14)
                    {
                        v15 = *v7;
                        a0->field_10 = v7 + 1;
                        return v15;
                    }
                }
            }
        }
    }
    if (!a0->field_28)
        return a0->field_28;
    v16 = a0->field_30;
    if (v16 != a0->field_40)
    {
        v17 = *v16;
        a0->field_30 = v16 + 1;
        return v17;
    }
    if (a0->field_38)
        _free();
    a0->field_28 = 0;
    return 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb73b74..0xb73e64 (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b73b74_1 {
    struct st_b73b74_0 *field_0;
    struct st_b73b74_0 *field_8;
    struct st_b73b74_0 *field_10;
    struct st_b73b74_0 *field_18;
    struct st_b73b74_0 *field_20;
    struct st_b73b74_0 *field_28;
    struct st_b73b74_0 *field_30;
    struct st_b73b74_0 *field_38;
    struct st_b73b74_0 *field_40;
    struct st_b73b74_0 *field_48;
    struct st_b73b74_0 *field_50;
    struct st_b73b74_0 *field_58;
    struct st_b73b74_0 *field_60;
    struct st_b73b74_0 *field_68;
    struct st_b73b74_0 *field_70;
    struct st_b73b74_0 *field_78;
    struct st_b73b74_0 *field_80;
    struct st_b73b74_0 *field_88;
    struct st_b73b74_0 *field_90;
    struct st_b73b74_0 *field_98;
    struct st_b73b74_0 *field_a0;
    struct st_b73b74_0 *field_a8;
} st_b73b74_1;

typedef struct st_b73b74_0 {
    struct st_b73b74_0 *field_0;
} st_b73b74_0;


st_b73b74_0 ** sub_b73b74(st_b73b74_1 *a0)
{
    st_b73b74_0 **v5;  // x0
    st_b73b74_0 **v6;  // x1
    st_b73b74_0 **v15;  // x9
    st_b73b74_0 **v16;  // x8
    st_b73b74_0 **v17;  // x0
    st_b73b74_0 **v18;  // x8
    st_b73b74_0 **v19;  // x1
    st_b73b74_0 **v20;  // x9
    st_b73b74_0 **v21;  // x8
    st_b73b74_0 **v7;  // x21
    st_b73b74_0 **v8;  // x0
    st_b73b74_0 **v9;  // x20
    st_b73b74_0 **v10;  // x20
    st_b73b74_0 **v11;  // x22
    st_b73b74_0 **v12;  // x24
    st_b73b74_0 **v13;  // x8
    st_b73b74_0 **v14;  // x8
    char v0;  // [bp-0x58]
    st_b73b74_0 **v1;  // [bp-0x50]
    st_b73b74_0 **v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0->field_0 == 1)
    {
        if (a0->field_8)
        {
            if (a0->field_10 != a0->field_20)
            {
                v14 = *(long long *)a0->field_10;
                a0->field_10 = a0->field_10 + 1;
                return v14;
            }
            if (a0->field_18)
                _free(a0->field_8);
            a0->field_8 = 0;
        }
        v6 = a0->field_48;
        if (v6 && v6 != a0->field_50)
        {
            a0->field_48 = v6 + 3;
            sub_b7ea10(&v0);
            v7 = (st_b73b74_0 **)v0;
            if (v7 != 0x8000000000000000)
            {
                v8 = v1;
                v9 = v2;
                v5 = v8;
                if (a0->field_8)
                {
                    v5 = v8;
                    if (a0->field_18)
                    {
                        _free(a0->field_8);
                        v5 = v8;
                    }
                }
                a0->field_8 = v5;
                a0->field_10 = v5;
                a0->field_18 = v7;
                a0->field_20 = (char *)v8 + 0x8 * v9;
                if (v9)
                {
                    v14 = *v5;
                    a0->field_10 = v5 + 1;
                    return v14;
                }
                v10 = a0->field_48;
                v11 = a0->field_50;
                while (1)
                {
                    if (v7)
                        _free();
                    a0->field_8 = 0;
                    if (!v10 || v10 == v11 || !(v12 = v10 + 3, a0->field_48 = v12, sub_b7ea10(&v0, v10), v7 = (st_b73b74_0 **)v0, v7 != 0x8000000000000000))
                        break;
                    v5 = v1;
                    v13 = v2;
                    a0->field_8 = v5;
                    a0->field_10 = v5;
                    a0->field_18 = v7;
                    a0->field_20 = (char *)v5 + 0x8 * v13;
                    v10 = v12;
                    if (v13)
                    {
                        v14 = *v5;
                        a0->field_10 = v5 + 1;
                        return v14;
                    }
                }
            }
        }
        if (a0->field_28)
        {
            v15 = a0->field_30;
            if (v15 != a0->field_40)
            {
                v16 = *v15;
                a0->field_30 = v15 + 1;
                return v16;
            }
            if (a0->field_38)
                _free();
            a0->field_28 = 0;
        }
        if (a0->field_0 && a0->field_8 && a0->field_18)
        {
            _free();
            if (a0->field_28 && a0->field_38)
                _free();
        }
        a0->field_0 = 0;
    }
    if (a0->field_58 != 1)
        return 0;
    if (a0->field_60)
    {
        v17 = a0->field_68;
        if (v17 != a0->field_78)
        {
            v18 = *v17;
            a0->field_68 = v17 + 1;
            return v18;
        }
        if (a0->field_70)
            _free(a0->field_60);
        a0->field_60 = 0;
    }
    v19 = a0->field_a0;
    if (v19 && v19 != a0->field_a8)
    {
        a0->field_a0 = v19 + 8;
        sub_b738f8(&v0);
    }
    if (a0->field_80)
    {
        v20 = a0->field_88;
        if (v20 != a0->field_98)
        {
            v21 = *v20;
            a0->field_88 = v20 + 1;
            return v21;
        }
        if (a0->field_90)
            _free();
        a0->field_80 = 0;
        return 0;
    }
    return 0;
}

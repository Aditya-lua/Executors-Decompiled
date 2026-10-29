/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb765c4..0xb766f4 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b765c4_1 {
    struct st_b765c4_0 *field_0;
    struct st_b765c4_0 *field_8;
    struct st_b765c4_0 *field_10;
    struct st_b765c4_0 *field_18;
    struct st_b765c4_0 *field_20;
    struct st_b765c4_0 *field_28;
    struct st_b765c4_0 *field_30;
    struct st_b765c4_0 *field_38;
    struct st_b765c4_0 *field_40;
    struct st_b765c4_0 *field_48;
} st_b765c4_1;

typedef struct st_b765c4_0 {
    struct st_b765c4_0 *field_0;
} st_b765c4_0;


st_b765c4_0 ** sub_b765c4(st_b765c4_1 *a0)
{
    st_b765c4_0 **v5;  // x0
    st_b765c4_0 **v6;  // x1
    st_b765c4_0 **v7;  // x21
    st_b765c4_0 **v8;  // x20
    st_b765c4_0 **v9;  // x8
    st_b765c4_0 **v10;  // x23
    st_b765c4_0 **v11;  // x8
    st_b765c4_0 **v12;  // x9
    st_b765c4_0 **v13;  // x8
    char v0;  // [bp-0x58]
    st_b765c4_0 **v1;  // [bp-0x50]
    st_b765c4_0 **v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0->field_0)
    {
        if (a0->field_8 != a0->field_18)
        {
            v11 = *(long long *)a0->field_8;
            a0->field_8 = a0->field_8 + 1;
            return v11;
        }
        if (a0->field_10)
            _free(a0->field_0);
        a0->field_0 = 0;
    }
    v6 = a0->field_40;
    if (v6)
    {
        v7 = a0->field_48;
        if (v6 != v7)
        {
            v8 = v6 + 8;
            a0->field_40 = v8;
            sub_b74fb0(&v0);
            v9 = (st_b765c4_0 **)v0;
            if (v9 != 0x8000000000000000)
            {
                do
                {
                    v5 = v1;
                    a0->field_0 = v5;
                    a0->field_8 = v5;
                    a0->field_10 = v9;
                    a0->field_18 = (char *)v5 + 0x8 * v2;
                    if (v2)
                    {
                        v11 = *v5;
                        a0->field_8 = v5 + 1;
                        return v11;
                    }
                    if (v9)
                        _free();
                    a0->field_0 = 0;
                    if (v8 == v7)
                        break;
                } while ((v10 = v8 + 8, a0->field_40 = v10, sub_b74fb0(&v0, v8), v9 = (st_b765c4_0 **)v0, v8 = v10, v9 != 0x8000000000000000));
            }
        }
    }
    if (!a0->field_20)
        return 0;
    v12 = a0->field_28;
    if (v12 != a0->field_38)
    {
        v13 = *v12;
        a0->field_28 = v12 + 1;
        return v13;
    }
    if (a0->field_30)
        _free();
    a0->field_20 = 0;
    return 0;
}

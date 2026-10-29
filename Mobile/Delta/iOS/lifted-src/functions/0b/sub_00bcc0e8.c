/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcc0e8..0xbcc244 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcc0e8_0 {
    struct st_bcc0e8_0 *field_0;
} st_bcc0e8_0;

typedef struct st_bcc0e8_1 {
    struct st_bcc0e8_0 *field_0;
    struct st_bcc0e8_0 *field_8;
    struct st_bcc0e8_0 *field_10;
    struct st_bcc0e8_0 *field_18;
    struct st_bcc0e8_0 *field_20;
    struct st_bcc0e8_0 *field_28;
    struct st_bcc0e8_0 *field_30;
    struct st_bcc0e8_0 *field_38;
    struct st_bcc0e8_0 *field_40;
    struct st_bcc0e8_0 *field_48;
    struct st_bcc0e8_0 *field_50;
} st_bcc0e8_1;


st_bcc0e8_0 ** sub_bcc0e8(st_bcc0e8_1 *a0)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    st_bcc0e8_0 **v20;  // x9
    unsigned long v21;  // x20
    st_bcc0e8_0 **v22;  // x9
    st_bcc0e8_0 **v23;  // x8
    st_bcc0e8_0 **v24;  // x8
    st_bcc0e8_0 **v25;  // x0
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_bcc0e8_0 **v15;  // x0
    st_bcc0e8_0 **v16;  // x8
    st_bcc0e8_0 **v17;  // x21
    st_bcc0e8_0 **v18;  // x20
    st_bcc0e8_0 **v19;  // x8
    st_bcc0e8_0 **v0;  // [bp-0x48]
    st_bcc0e8_0 **v1;  // [bp-0x40]
    st_bcc0e8_0 **v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (a0->field_0 != 1)
        return 0;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    if (a0->field_8)
    {
        if (a0->field_10 != a0->field_20)
        {
            v23 = *(long long *)a0->field_10;
            a0->field_10 = a0->field_10 + 1;
            return v23;
        }
        if (a0->field_18)
            _free(a0->field_8);
        a0->field_8 = 0;
    }
    v16 = a0->field_48;
    if (v16)
    {
        v17 = a0->field_50;
        if (v16 != v17)
        {
            v18 = v16 + 9;
            a0->field_48 = v18;
            sub_bcc71c(&v0, v16 + 1);
            v19 = v0;
            if (v19 != 0x8000000000000000)
            {
                v15 = v1;
                v20 = v2;
                a0->field_8 = v15;
                a0->field_10 = v15;
                a0->field_18 = v19;
                a0->field_20 = (char *)v15 + 0x8 * v20;
                if (v20)
                {
                    v23 = *v15;
                    a0->field_10 = v15 + 1;
                    return v23;
                }
                while (1)
                {
                    if (v19)
                        _free();
                    a0->field_8 = 0;
                    if (v18 == v17 || !(a0->field_48 = v18 + 9, v21 = v18 + 1, sub_bcc71c(&v0, v21), v19 = v0, v19 != 0x8000000000000000))
                        break;
                    v15 = v1;
                    v22 = v2;
                    a0->field_8 = v15;
                    a0->field_10 = v15;
                    a0->field_18 = v19;
                    a0->field_20 = (char *)v15 + 0x8 * v22;
                    v18 = v21 + 64;
                    if (v22)
                    {
                        v23 = *v15;
                        a0->field_10 = v15 + 1;
                        return v23;
                    }
                }
            }
        }
    }
    if (a0->field_28)
    {
        v24 = a0->field_30;
        if (v24 != a0->field_40)
        {
            v25 = *v24;
            a0->field_30 = v24 + 1;
            return v25;
        }
        if (a0->field_38)
            _free();
        a0->field_28 = 0;
    }
    a0->field_0 = 0;
    return 0;
}

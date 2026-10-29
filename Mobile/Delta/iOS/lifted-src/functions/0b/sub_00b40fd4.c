/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb40fd4..0xb41168 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b40fd4_1 {
    unsigned long long field_0;
    struct st_b40fd4_0 *field_8;
    struct st_b40fd4_0 *field_10;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_b40fd4_1;

typedef struct st_b40fd4_0 {
    struct st_b40fd4_0 *field_0;
} st_b40fd4_0;


st_b40fd4_0 ** sub_b40fd4(st_b40fd4_0 **a0, st_b40fd4_1 *a1)
{
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_b40fd4_0 **v13;  // x8
    unsigned long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x30], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!a0)
    {
        return 1;
    }
    else if (*a0)
    {
        v5 = v10;
        v6 = v11;
        v7 = &v9;
        v8 = v12;
        if (a1->field_8)
        {
            v13 = sub_a6fbc4();
            if (v13)
            {
                v3 = (char *)a1->field_8 + a1->field_20;
                if (sub_a71440(v13, &v3, a1->field_30, &v4) != 1)
                {
                    return 0;
                }
                else if (v4 == a1->field_30)
                {
                    a1->field_18 = a1->field_18 + 1;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 179, "export_sub_cb");
                    v1 = v4;
                    v2 = a1->field_30;
                    v0 = a1->field_0;
                    sub_a36abc(57, 0xc0103);
                    return 0;
                }
            }
        }
        if (!a1->field_10)
        {
            return 1;
        }
        else if (sub_a6fbc4())
        {
            v3 = (char *)a1->field_10 + a1->field_28;
            if (sub_a71440() != 1)
            {
                return 0;
            }
            else if (v4 == a1->field_38)
            {
                a1->field_1c = a1->field_1c + 1;
                return 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 194, "export_sub_cb");
                v1 = v4;
                v2 = a1->field_30;
                v0 = a1->field_0;
                sub_a36abc(57, 0xc0103);
                return 0;
            }
        }
        else
        {
            return 1;
        }
    }
    else
    {
        return 1;
    }
}

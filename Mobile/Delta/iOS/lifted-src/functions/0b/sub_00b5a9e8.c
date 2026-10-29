/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a9e8..0xb5ab5c (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5a9e8_0 {
    struct st_b5a9e8_0 *field_0;
    char padding_8[8];
    struct st_b5a9e8_0 *field_10;
    struct st_b5a9e8_0 *field_18;
} st_b5a9e8_0;

typedef struct st_b5a9e8_1 {
    long long field_0;
    struct st_b5a9e8_0 *field_8;
    struct st_b5a9e8_0 *field_10;
    struct st_b5a9e8_0 *field_18;
    struct st_b5a9e8_0 *field_20;
} st_b5a9e8_1;


long long sub_b5a9e8(st_b5a9e8_1 *a0, st_b5a9e8_0 *a1)
{
    long long v2;  // x0
    st_b5a9e8_0 *v3;  // x0
    st_b5a9e8_0 *v12;  // x0
    st_b5a9e8_0 *v4;  // x22
    st_b5a9e8_0 **v5;  // x23
    st_b5a9e8_0 **v6;  // x23
    st_b5a9e8_0 *v7;  // x0
    st_b5a9e8_0 *v8;  // x0
    st_b5a9e8_0 *v9;  // x20
    st_b5a9e8_0 **v10;  // x21
    st_b5a9e8_0 **v11;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec(a0->field_0);
    if (!a1)
    {
        return 1;
    }
    else if (a1->field_0)
    {
        if (!sub_afe114(a0 + 1, a1, v2))
            return 0;
        v3 = sub_a6fbc4(a1, "pass");
        if (v3)
        {
            v4 = v3;
            v5 = &a0->field_8;
            v6 = v5 + 1;
            sub_a6c4e8(a0->field_8, v5[1], "providers/implementations/kdfs/pvkkdf.c", 0x77);
            *v6 = 0;
            *v5 = 0;
            if (!v4->field_18)
            {
                v7 = sub_a6bf4c(1, "providers/implementations/kdfs/pvkkdf.c", 124);
                *v5 = v7;
                if (v7)
                    goto LABEL_b5aab4;
            }
            else if (!(v4->field_10) || sub_a71440(v4, v5, 0, v6))
            {
                goto LABEL_b5aab4;
            }
        }
        else
        {
LABEL_b5aab4:
            v8 = sub_a6fbc4(a1, "salt");
            if (!v8)
                return 1;
            v9 = v8;
            v10 = &a0->field_18;
            v11 = v10 + 1;
            sub_a6c4e8(a0->field_18, v10[1], "providers/implementations/kdfs/pvkkdf.c", 0x77);
            *v11 = 0;
            *v10 = 0;
            if (!v9->field_18)
            {
                v12 = sub_a6bf4c(1, "providers/implementations/kdfs/pvkkdf.c", 124);
                *v10 = v12;
                if (v12)
                    return 1;
            }
            else if (!v9->field_10)
            {
                return 1;
            }
            else if (sub_a71440(v9, v10, 0, v11))
            {
                return 1;
            }
        }
        return 0;
    }
    else
    {
        return 1;
    }
}

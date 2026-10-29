/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa712cc..0xa71440 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a712cc_0 {
    struct st_a712cc_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned int field_8;
    char padding_c[4];
    struct st_a712cc_0 *field_10;
    struct st_a712cc_0 *field_18;
} st_a712cc_0;


st_a712cc_0 * sub_a712cc(st_a712cc_0 *a0, st_a712cc_0 *a1, st_a712cc_0 **a2, st_a712cc_0 *a3, unsigned int a4)
{
    unsigned long v2;  // cc_dep1
    unsigned long v3;  // cc_dep2
    long long v12;  // x1
    long long v13;  // x1
    st_a712cc_0 *n;  // x19
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4106
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4106
    st_a712cc_0 *v9;  // x20
    st_a712cc_0 *v10;  // x8
    st_a712cc_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !a1 && !a3)
    {
        sub_a368c8();
        v13 = 1336;
        goto LABEL_a71378;
    }
    v2 = *(int *)&a0->field_1;
    v3 = a4;
    if (*(int *)&a0->field_1 == a4)
    {
        n = a0->field_10;
        if (a4 != 4)
        {
            v5 = arm64g_calculate_condition(19, v2, v3, 0);
            v6 = arm64g_calculate_condition(20, (v5 & 1 ? n : 0x40000000), 0, 0);
            if (!(v6 & 1))
                goto LABEL_a7130e;
LABEL_a7130d:
            v9 = n;
        }
        else
        {
            v7 = arm64g_calculate_condition(19, v2, v3, 0);
            v8 = arm64g_calculate_condition(16, (v7 & 1 ? n : 0x40000000), 0, 0);
            if (v8 & 1)
                goto LABEL_a7130d;
LABEL_a7130e:
            v9 = (char *)&n->field_0 + 1;
        }
        if (a3)
            a3->field_0 = n;
        if (!*(long long *)&a0->field_8)
        {
            sub_a368c8();
            v13 = 1355;
LABEL_a71378:
            sub_a369bc("crypto/params.c", v13, "get_string_internal");
            v12 = 786690;
        }
        else if (a1)
        {
            v10 = a1->field_0;
            if (v10)
            {
                if (n <= *a2)
                    goto LABEL_a71428;
LABEL_a71338:
                sub_a368c8();
                sub_a369bc("crypto/params.c", 1372, "get_string_internal");
                v12 = 116;
            }
            else
            {
                v11 = sub_a6bf4c(v9, "crypto/params.c", 1363);
                if (!v11)
                    return v11;
                v10 = v11;
                a1->field_0 = v11;
                *a2 = v9;
                if (v9 < n)
                    goto LABEL_a71338;
LABEL_a71428:
                _memcpy(v10, *(long long *)&a0->field_8, n);
                goto LABEL_a71438;
            }
        }
        else
        {
LABEL_a71438:
            return 1;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1340, "get_string_internal");
        v12 = 129;
    }
    sub_a36abc(15, v12, 0);
    return 0;
}

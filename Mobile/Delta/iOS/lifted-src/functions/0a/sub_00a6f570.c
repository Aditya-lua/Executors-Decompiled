/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6f570..0xa6f85c (748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6f570_0 {
    struct st_a6f570_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_a6f570_0 *field_8;
    struct st_a6f570_0 *field_10;
    struct st_a6f570_0 *field_18;
    unsigned long long field_20;
} st_a6f570_0;

typedef struct st_a6f570_1 {
    struct st_a6f570_0 *field_0;
    unsigned int field_8;
    struct st_a6f570_0 *field_c;
    struct st_a6f570_0 *field_10;
    struct st_a6f570_0 *field_18;
    struct st_a6f570_0 *field_20;
    struct st_a6f570_0 *field_28;
} st_a6f570_1;


st_a6f570_0 * sub_a6f570(st_a6f570_0 *a0)
{
    unsigned long long v7;  // x24
    st_a6f570_0 *v8;  // x21
    st_a6f570_0 *i;  // x24
    st_a6f570_1 *v18;  // x0
    unsigned int v19;  // w9
    st_a6f570_0 *v20;  // w8
    st_a6f570_0 *v21;  // x2
    unsigned long v22;  // cc_dep1
    st_a6f570_0 *v23;  // x21
    unsigned long long v24;  // 4104
    unsigned long long v25;  // 4104
    st_a6f570_0 *v26;  // x22
    st_a6f570_0 *v9;  // x0
    unsigned long long v27;  // 4105
    unsigned long long v28;  // 4105
    st_a6f570_0 *ptr;  // x1
    st_a6f570_1 *v30;  // x20
    st_a6f570_0 *v31;  // x26
    st_a6f570_0 *v32;  // x23
    unsigned int j;  // w0
    unsigned int v34;  // w21
    long long v10;  // x1
    st_a6f570_0 *v11;  // x20
    unsigned int v12;  // w0
    st_a6f570_0 *v13;  // x23
    st_a6f570_0 **iter;  // x25
    st_a6f570_0 *v15;  // x27
    st_a6f570_0 *v16;  // x28
    st_a6f570_0 *v0;  // [bp-0xa0]
    st_a6f570_0 *v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x88]
    uint128_t v3;  // [bp-0x78]
    unsigned long long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (a0)
    {
        v7 = sub_a71e18((sub_ad69e4(a0->field_8) + 1) * 40);
        v8 = *(long long *)&a0->field_1 * 8;
        if (v8)
        {
            v9 = sub_a6c610(v8, "crypto/param_build.c", 469);
            if (v9)
                goto LABEL_a6f640;
            sub_a368c8();
            sub_a369bc("crypto/param_build.c", 471, "OSSL_PARAM_BLD_to_param");
            v10 = 111;
        }
        else
        {
            v9 = 0;
LABEL_a6f640:
            v11 = sub_a6bf4c(((char *)a0->field_0 + v7) * 8, "crypto/param_build.c", 475);
            if (!v11)
            {
                sub_a6ce98(v9, "crypto/param_build.c", 477);
                return v11;
            }
            v12 = sub_ad69e4(a0->field_8);
            if ((int)v12 >= 1)
            {
                v0 = v9;
                v13 = 0;
                iter = &v11->field_8;
                v15 = v9;
                v1 = v11;
                v16 = &(&v11->field_0)[v7];
                i = v12;
                do
                {
                    v18 = sub_ad69f8(a0->field_8, v13);
                    *(struct st_a6f570_0 **)((char *)iter - 16) = v18->field_0;
                    v19 = v18->field_8;
                    v20 = (st_a6f570_0 *)(&v18->field_8)[1];
                    *(unsigned int *)((char *)iter - 8) = v19;
                    iter[2] = 0xffffffffffffffff;
                    v21 = v18->field_c;
                    v22 = v20;
                    if (!v20)
                    {
                        v23 = 0;
                        v24 = arm64g_calculate_condition(3, v22, 0, 0);
                        if (!(v24 & 1))
                            goto LABEL_a6f6de;
                        goto LABEL_a6f6dd;
                    }
                    else
                    {
                        v23 = v18->field_10;
                        v25 = arm64g_calculate_condition(3, v22, 0, 0);
                        if (v25 & 1)
                        {
LABEL_a6f6dd:
                            v26 = v18->field_10;
                            v27 = arm64g_calculate_condition(3, v22, 0, 0);
                            if (!(v27 & 1))
                                goto LABEL_a6f6e2;
                            goto LABEL_a6f6e1;
                        }
                        else
                        {
LABEL_a6f6de:
                            v26 = 0;
                            v28 = arm64g_calculate_condition(3, v22, 0, 0);
                            if (v28 & 1)
                            {
LABEL_a6f6e1:
                                ptr = v16;
                                continue;
                            }
                            else
                            {
LABEL_a6f6e2:
                                ptr = v15;
                            }
                        }
                    }
                    *iter = ptr;
                    iter[1] = v21;
                    if (v18->field_18)
                    {
                        if (v19 != 2)
                            sub_9e5390(v18->field_18);
                        else
                            sub_9e536c(v18->field_18);
                    }
                    else
                    {
                        if (v19 - 4 < 2)
                        {
                            v30 = v18;
                            if (v18->field_20)
                            {
                                v31 = ptr;
                                _memcpy(ptr, v18->field_20);
                            }
                            else
                            {
                                v31 = ptr;
                                _bzero(ptr, v21);
                            }
                            if (v30->field_8 == 4)
                                *(char *)(v31 + v30->field_c) = 0;
                        }
                        else if (1 >= v19 - 6)
                        {
                            ptr->field_0 = v18->field_20;
                        }
                        else if (v21 >= 9)
                        {
                            _bzero(ptr, v21);
                        }
                        else if (v21)
                        {
                            _memcpy(ptr, &v18->field_28);
                        }
                    }
                    v15 = (char *)v15 + 0x8 * v23;
                    v16 = (char *)v16 + 0x8 * v26;
                    v13 = (char *)&v13->field_0 + 1;
                    iter += 5;
                } while (i != v13);
                v9 = v0;
                v11 = v1;
            }
            else
            {
                i = 0;
            }
            v32 = (char *)v11 + (unsigned int)i * 40;
            sub_a71bbc();
            *(uint128_t *)&v32->field_0 = v2;
            *(uint128_t *)&v32->field_8 = v3;
            v32->field_18 = v4;
            sub_a71e24(v32, v9, v8);
            a0->field_0 = 0;
            *(unsigned long long *)&a0->field_1 = 0;
            j = sub_ad69e4(a0->field_8);
            if ((int)j < 1)
                return v11;
            do
            {
                v34 = j;
                sub_a6c2e4(sub_ad692c(a0->field_8), "crypto/param_build.c", 110);
                j = v34 - 1;
            } while (j);
            return v11;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/param_build.c", 459, "OSSL_PARAM_BLD_to_param");
        v10 = 786690;
    }
    sub_a36abc(15, v10, 0);
    return 0;
}

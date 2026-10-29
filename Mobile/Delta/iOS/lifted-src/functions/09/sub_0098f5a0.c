/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98f5a0..0x98f78c (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98f5a0_0 {
    struct st_98f5a0_1 *field_0;
    unsigned long long field_8;
} st_98f5a0_0;

typedef struct st_98f5a0_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    char field_20;
} st_98f5a0_2;

typedef struct st_98f5a0_1 {
    char field_0;
} st_98f5a0_1;


unsigned long long sub_98f5a0(st_98f5a0_0 *a0, unsigned long long a1, st_98f5a0_2 *a2)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    char *v19;  // x8
    unsigned long long v20;  // x9
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    unsigned long v24;  // cc_ndep
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long long v11;  // x22
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long long v29;  // x23
    unsigned long long v30;  // x11
    unsigned long long v12;  // x21
    unsigned long long v31;  // x10
    char *v32;  // x0
    unsigned long long v33;  // x8
    st_98f5a0_2 *v34;  // x9
    unsigned long long v35;  // x8
    unsigned long long v36;  // x23
    unsigned long long v37;  // x12
    unsigned long long v38;  // w10
    unsigned long long v39;  // 4134
    unsigned long long v40;  // 4136
    unsigned long long v13;  // x20
    unsigned int v41;  // w13
    unsigned long long v42;  // x0
    char *v43;  // x8
    unsigned long long v44;  // x10
    unsigned long long v45;  // x22
    unsigned long long v46;  // x11
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x22
    unsigned long long v17;  // x0
    unsigned long long v18;  // x10
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0->field_8)
        return 0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = 1 << ((char)(*(char *)a0->field_0) >> 6 & 63);
    if (a0->field_8 < v16)
        return 0;
    v17 = sub_a7b0d8(a0->field_0);
    v18 = a0->field_8;
    v19 = &a0->field_0[v16];
    v20 = v18 - v16;
    a0->field_0 = v19;
    a0->field_8 = v20;
    if ((v17 & 0xfffffffffffffff8) == 8)
    {
        v25 = arm64g_calculate_condition(v21, v22, v23, v24);
        v26 = arm64g_calculate_condition(4, (v25 & 1 ? v18 : 0x40000000), (v25 & 1 ? v16 : 0), 0);
    }
    else
    {
        v27 = arm64g_calculate_condition(v21, v22, v23, v24);
        v28 = arm64g_calculate_condition(0, (v27 & 1 ? v18 : 0x40000000), (v27 & 1 ? v16 : 0), 0);
        if (!(v28 & 1) && (v29 = 1 << (*v19 >> 6 & 63), v29 <= v20))
        {
            v30 = v17;
            a2->field_0 = sub_a7b0d8(v19);
            v31 = a0->field_8;
            v32 = &a0->field_0[v29];
            v33 = v31 - v29;
            a0->field_0 = v32;
            a0->field_8 = v33;
            if (!(v30 >> 2 & 1))
            {
                v34 = a2;
                v35 = 0;
                a2->field_8 = 0;
                goto LABEL_98f674;
            }
            else if (v31 != v29 && (v36 = 1 << (*v32 >> 6 & 63), v33 >= v36))
            {
                v34 = a2;
                v35 = sub_a7b0d8();
                a2->field_8 = v35;
                v37 = a0->field_8;
                a0->field_0 = &a0->field_0[v36];
                a0->field_8 = v37 - v36;
LABEL_98f674:
                v38 = a1;
                v39 = ((v30 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc;
                v40 = (((v30 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2;
                v41 = ((((((((v40 | v39) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v40 | v39) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v40 | v39) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v40 | v39) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((((v40 | v39) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v40 | v39) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v40 | v39) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v40 | v39) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v34->field_20 = v34->field_20 & 0xfffffffc | (char)(__ROL__(v41, 2)) & 3;
                if (!(v30 >> 1 & 1))
                {
                    if (v38)
                    {
                        v42 = 0;
                        v34->field_10 = 0;
                        goto LABEL_98f72c;
                    }
                    else
                    {
                        v42 = a0->field_8;
                        v34->field_10 = v42;
                        if (v35 + v42 <= 0x3fffffffffffffff)
                        {
                            v43 = a0->field_0;
                            *(char **)v34->padding_18 = v43;
                            a0->field_0 = &v43[v42];
                            a0->field_8 = v42 - v42;
                            return 1;
                        }
                    }
                }
                else
                {
                    if (a0->field_8 && (v45 = 1 << ((char)(*(char *)a0->field_0) >> 6 & 63), a0->field_8 >= v45))
                    {
                        v42 = sub_a7b0d8(a0->field_0);
                        v38 = a1;
                        v34 = a2;
                        a2->field_10 = v42;
                        v46 = a0->field_8 - v45;
                        a0->field_0 = &a0->field_0[v45];
                        a0->field_8 = v46;
                        v35 = a2->field_8;
LABEL_98f72c:
                        if (v42 + v35 <= 0x3fffffffffffffff)
                        {
                            if (v38)
                            {
                                *(unsigned long long *)v34->padding_18 = 0;
                                return 1;
                            }
                            v43 = a0->field_0;
                            v44 = a0->field_8;
                            *(char **)v34->padding_18 = v43;
                            if (v44 >= v42)
                            {
                                a0->field_0 = &v43[v42];
                                a0->field_8 = v44 - v42;
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}

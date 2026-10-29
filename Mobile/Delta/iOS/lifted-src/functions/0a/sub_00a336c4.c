/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa336c4..0xa338f0 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a336c4_0 {
    struct st_a336c4_0 *field_0;
    struct st_a336c4_0 *field_8;
    char padding_10[168];
    struct st_a336c4_0 *field_b8;
    struct st_a336c4_0 *field_c0;
} st_a336c4_0;

extern long long g_a33d44;
extern long long g_f0d560;
extern st_a336c4_0 *g_f12820;
extern st_a336c4_0 *g_f12828;

st_a336c4_0 * sub_a336c4(st_a336c4_0 *a0)
{
    st_a336c4_0 *v2;  // x0
    st_a336c4_0 *iter;  // x21
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    st_a336c4_0 *v4;  // w0
    st_a336c4_0 *v13;  // x9
    st_a336c4_0 **v14;  // x10
    long long v15;  // x19
    long long v16;  // x20
    st_a336c4_0 *v18;  // w8
    long long v19;  // x1
    long long v21;  // x1
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a0->field_0 && a0->field_8)
        {
            v2 = sub_a7c198(g_f0d560);
            if (!(unsigned int)v2)
                return v2;
            iter = g_f12820;
            if (g_f12820)
            {
                while (1)
                {
                    v4 = (st_a336c4_0 *)(unsigned int)_strcmp(iter->field_0, a0->field_0);
                    iter = iter->field_c0;
                    if (iter)
                    {
                        v5 = arm64g_calculate_condition(v12 | 16, v7, v8, v9);
                        v6 = arm64g_calculate_condition(19, (v5 & 1 ? (unsigned long long)v4 : 0x40000000), 0, 0);
                        if (!(v6 & 1))
                            break;
                    }
                    else
                    {
                        v10 = arm64g_calculate_condition(v12 | 16, v7, v8, v9);
                        v11 = arm64g_calculate_condition(16, (v10 & 1 ? (unsigned long long)v4 : 0x40000000), 0, 0);
                        if (!(v11 & 1))
                            break;
                    }
                }
                if (!v4)
                {
                    v16 = 103;
                    v15 = 73;
LABEL_a33838:
                    sub_a368c8();
                    sub_a369bc("crypto/engine/eng_list.c", v15, "engine_list_add");
                    v19 = v16;
                    sub_a368c8(sub_a36abc(38, v19, 0), v19, 0);
                    sub_a369bc("crypto/engine/eng_list.c", 353, "ENGINE_add");
                    sub_a36abc(38, 110, 0);
                    sub_a7c1b4(g_f0d560);
                    return 0;
                }
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v13 = g_f12828;
                if (g_f12828 && (v14 = &g_f12828->field_c0, !g_f12828->field_c0))
                    goto LABEL_a338c0;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v15 = 106;
                if (/* unsupported instruction */ == 1)
                    goto LABEL_a33778;
            }
            else
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                if (g_f12828)
                {
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v15 = 89;
                }
                else
                {
                    if (sub_a33180(&g_a33d44))
                    {
                        v13 = 0;
                        v14 = &g_f12820;
LABEL_a338c0:
                        *v14 = a0;
                        g_f12828 = a0;
                        a0->field_b8 = v13;
                        a0->field_c0 = 0;
                        sub_a7c1b4(g_f0d560);
                        return 1;
                    }
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v15 = 97;
                }
                if (v18 == 1)
                {
LABEL_a33778:
                    /* unsupported instruction */;
                }
            }
            v16 = 110;
            goto LABEL_a33838;
        }
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_list.c", 347, "ENGINE_add");
        v21 = 108;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_list.c", 343, "ENGINE_add");
        v21 = 786690;
    }
    sub_a36abc(38, v21, 0);
    return 0;
}

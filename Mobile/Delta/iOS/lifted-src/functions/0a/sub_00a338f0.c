/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa338f0..0xa33a3c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a338f0_0 {
    char padding_0[184];
    struct st_a338f0_0 *field_b8;
    struct st_a338f0_0 *field_c0;
} st_a338f0_0;

extern long long g_f0d560;
extern st_a338f0_0 *g_f12820;
extern st_a338f0_0 *g_f12828;

st_a338f0_0 * sub_a338f0(st_a338f0_0 *a0)
{
    st_a338f0_0 **v3;  // x8
    unsigned long long v12;  // 4102
    st_a338f0_0 *v13;  // x8
    st_a338f0_0 *v14;  // x9
    st_a338f0_0 *v15;  // x19
    unsigned long v4;  // cc_op
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    st_a338f0_0 *v8;  // x9
    unsigned long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long v11;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_list.c", 365, "ENGINE_remove");
        sub_a36abc(38, 0xc0102, 0);
        return a0;
    }
    else if (sub_a7c198(g_f0d560))
    {
        v3 = &g_f12820;
        while (1)
        {
            v8 = *v3;
            v3 = &v8->field_c0;
            if (v8)
            {
                v9 = arm64g_calculate_condition(v4 | 16, v5, v6, v7);
                v4 = 4;
                v5 = (v9 & 1 ? v8 : 0x40000000);
                v6 = (v9 & 1 ? a0 : 0);
                v7 = 0;
                v10 = arm64g_calculate_condition(20, v5, v6, 0);
                if (!(v10 & 1))
                    break;
            }
            else
            {
                v11 = arm64g_calculate_condition(v4 | 16, v5, v6, v7);
                v4 = 0;
                v5 = (v11 & 1 ? 0 : 0x40000000);
                v6 = (v11 & 1 ? a0 : 0);
                v7 = 0;
                v12 = arm64g_calculate_condition(16, v5, v6, 0);
                if (!(v12 & 1))
                    break;
            }
        }
        if (v8)
        {
            v13 = a0->field_b8;
            v14 = a0->field_c0;
            if (v14)
                v14->field_b8 = v13;
            if (v13)
                v13->field_c0 = v14;
            if (g_f12820 == a0)
                g_f12820 = a0->field_c0;
            if (g_f12828 == a0)
                g_f12828 = v13;
            sub_a33034(a0, 0);
            v15 = 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_list.c", 132, "engine_list_remove");
            sub_a368c8(sub_a36abc(38, 105, 0), 105, 0);
            sub_a369bc("crypto/engine/eng_list.c", 371, "ENGINE_remove");
            sub_a36abc(38, 110, 0);
            v15 = 0;
        }
        sub_a7c1b4(g_f0d560);
        return v15;
    }
    else
    {
        return 0;
    }
}

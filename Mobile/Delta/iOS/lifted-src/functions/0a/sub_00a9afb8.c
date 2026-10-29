/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9afb8..0xa9b180 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9afb8_0 {
    struct st_a9afb8_0 *field_0;
    unsigned int field_4;
    struct st_a9afb8_0 *field_8;
} st_a9afb8_0;

extern long long g_a9b180;
extern long long g_a9b198;
extern long long g_a9b240;
extern long long g_f09048;
extern long long g_f12f38;
extern st_a9afb8_0 *g_f12f40;
extern st_a9afb8_0 *g_f12f48;
extern st_a9afb8_0 *g_f12f50;

st_a9afb8_0 * sub_a9afb8(unsigned long long a0, unsigned int a1, st_a9afb8_0 *a2)
{
    st_a9afb8_0 *v3;  // x0
    st_a9afb8_0 *v4;  // x19
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long v15;  // 4112
    unsigned long long v16;  // 4105
    unsigned int v6;  // w8
    unsigned long v7;  // 4112
    unsigned long v8;  // cc_op
    st_a9afb8_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!(unsigned int)a0)
    {
        return 0;
    }
    else if (!a2)
    {
        return 0;
    }
    else if (!sub_a7c208(&g_f09048, &g_a9b240))
    {
        return 0;
    }
    else if ((int)g_f12f50)
    {
        v3 = sub_a6bf4c(12, "crypto/objects/obj_xref.c", 158);
        if (!v3)
            return v3;
        v4 = v3;
        *(unsigned int *)&v3->field_0 = a0;
        *(unsigned int *)((char *)&v3->field_0 + 4) = a1;
        v3->field_4 = (unsigned int)a2;
        if (!sub_a7c198(g_f12f38))
        {
            sub_a368c8();
            sub_a369bc("crypto/objects/obj_xref.c", 165, "OBJ_add_sigid");
            sub_a36abc(8, 0xc0110, 0);
            sub_a6c2e4(v4, "crypto/objects/obj_xref.c", 166);
            return 0;
        }
        else if (sub_a9ae6c(a0, (char *)&v0 + 4, &v0, 0))
        {
            v6 = (unsigned int)v0;
            if (*(unsigned int *)((void*)&v0 + 4) == a1)
            {
                v7 = arm64g_calculate_condition(v11, v12, v13, v14);
                v8 = 3;
                v9 = (v7 & 1 ? v6 : 0);
                v10 = (v7 & 1 ? (unsigned long long)a2 : 0);
            }
            else
            {
                v15 = arm64g_calculate_condition(v11, v12, v13, v14);
                v8 = 0;
                v9 = (v15 & 1 ? v6 : 0);
                v10 = (v15 & 1 ? (unsigned long long)a2 : 0);
            }
            v16 = arm64g_calculate_condition(v8 | 16, v9, v10, 0);
            sub_a6c2e4(v4, "crypto/objects/obj_xref.c", 0xcc);
            sub_a7c1b4(g_f12f38);
            return !(v16 & 1);
        }
        else
        {
            if (g_f12f48 || !(g_f12f48 = sub_ad6270(&g_a9b180), !g_f12f48))
            {
                if (!g_f12f40)
                {
                    g_f12f40 = sub_ad6270(&g_a9b198);
                    if (g_f12f40)
                        goto LABEL_a9b108;
                }
                else
                {
LABEL_a9b108:
                    if (sub_ad68a0())
                    {
                        if (sub_ad68a0(g_f12f40, v4))
                        {
                            sub_ad6ae4(g_f12f48);
                            sub_ad6ae4(g_f12f40);
                            sub_a6c2e4(0, "crypto/objects/obj_xref.c", 0xcc);
                            sub_a7c1b4(g_f12f38);
                            return 1;
                        }
                        v4 = 0;
                    }
                }
            }
            sub_a6c2e4(v4, "crypto/objects/obj_xref.c", 0xcc);
            sub_a7c1b4(g_f12f38);
            return 0;
        }
    }
    else
    {
        return 0;
    }
}

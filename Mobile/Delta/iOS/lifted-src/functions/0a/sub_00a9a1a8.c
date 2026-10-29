/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9a1a8..0xa9a2fc (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9a1a8_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a9a1a8_0;

typedef struct st_a9a1a8_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a9a1a8_0 *field_8;
    unsigned int field_10;
    struct st_a9a1a8_1 *field_14;
} st_a9a1a8_1;

extern long long g_a9a808;
extern long long g_a9a87c;
extern long long g_df53b0;
extern char g_ea1ec8;
extern long long g_f09038;
extern st_a9a1a8_1 *g_f12f20;
extern long long g_f12f28;
extern st_a9a1a8_1 *g_f12f30;

st_a9a1a8_1 * sub_a9a1a8(st_a9a1a8_1 *a0, st_a9a1a8_1 *a1)
{
    st_a9a1a8_1 *v5;  // x0
    st_a9a1a8_1 *v6;  // x0
    st_a9a1a8_1 *v7;  // x0
    st_a9a1a8_1 *v0;  // [bp-0x38]
    st_a9a1a8_1 *v1;  // [bp-0x30]
    st_a9a1a8_1 *v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = a0;
    if (!a0)
        return a0;
    v5 = a0->field_10;
    if ((unsigned int)v5)
    {
        return v5;
    }
    else if ((&a0->field_10)[1])
    {
        v6 = sub_a67850(&v2, &g_df53b0, 1344, 4, &g_a9a87c, 0);
        if (v6)
            return *(int *)&(&g_ea1ec8)[16 + v6->field_0 * 40];
        if (a1)
        {
            sub_a6afb8(64, 0);
            if (!sub_a7c208(&g_f09038, &g_a9a808) || !(int)g_f12f30 || !sub_a7c17c(g_f12f28))
            {
                sub_a368c8();
                sub_a369bc("crypto/objects/obj_dat.c", 400, "ossl_obj_obj2nid");
                sub_a36abc(8, 0xc010f, 0);
                return 0;
            }
        }
        v7 = g_f12f20;
        if (g_f12f20)
        {
            v0 = (st_a9a1a8_1 *)0;
            v1 = v2;
            v7 = sub_a66b6c(g_f12f20, &v0);
            if (v7)
                v7 = v7->field_8->field_10;
        }
        if (a1)
        {
            sub_a7c1b4(g_f12f28);
            return v7;
        }
        return v7;
    }
    else
    {
        return 0;
    }
}

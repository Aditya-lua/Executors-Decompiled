/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa99a1c..0xa99b48 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a99a1c_3 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a99a1c_2 *field_8;
} st_a99a1c_3;

typedef struct st_a99a1c_2 {
    char padding_0[16];
    unsigned int field_10;
} st_a99a1c_2;

extern long long g_a9a808;
extern long long g_a9a834;
extern long long g_df0050;
extern char g_ea1ec8;
extern long long g_f09038;
extern st_a99a1c_3 *g_f12f20;
extern long long g_f12f28;
extern st_a99a1c_3 *g_f12f30;

st_a99a1c_3 * sub_a99a1c(unsigned long long a0)
{
    st_a99a1c_3 *v7;  // x0
    st_a99a1c_3 *v8;  // x0
    st_a99a1c_3 *v9;  // x20
    unsigned int v0;  // [bp-0x60]
    char *v1;  // [bp-0x58]
    char *v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v3;
    v4 = a0;
    v7 = sub_a67850(&v2, &g_df0050, 1478, 4, &g_a9a834, 0);
    if (v7)
        return *(int *)&(&g_ea1ec8)[16 + v7->field_0 * 40];
    sub_a6afb8(64, 0);
    if (sub_a7c208(&g_f09038, &g_a9a808) && (int)g_f12f30 && sub_a7c17c(g_f12f28))
    {
        if (g_f12f20 && !(v0 = 2, v1 = &v3, v8 = sub_a66b6c(g_f12f20, &v0), !v8))
            v9 = v8->field_8->field_10;
        else
            v9 = 0;
        sub_a7c1b4(g_f12f28);
        return v9;
    }
    sub_a368c8();
    sub_a369bc("crypto/objects/obj_dat.c", 646, "OBJ_ln2nid");
    sub_a36abc(8, 0xc010f, 0);
    return 0;
}

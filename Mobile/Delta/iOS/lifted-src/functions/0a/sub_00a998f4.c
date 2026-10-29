/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa998f4..0xa99a1c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a998f4_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a998f4_0 *field_8;
} st_a998f4_1;

typedef struct st_a998f4_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a998f4_0;

extern long long g_a9a808;
extern long long g_a9a858;
extern long long g_df1768;
extern char g_ea1ec8;
extern long long g_f09038;
extern st_a998f4_1 *g_f12f20;
extern long long g_f12f28;
extern st_a998f4_1 *g_f12f30;

st_a998f4_1 * sub_a998f4(unsigned long a0)
{
    st_a998f4_1 *v6;  // x0
    st_a998f4_1 *v7;  // x0
    st_a998f4_1 *v8;  // x20
    unsigned int v0;  // [bp-0x60]
    char *v1;  // [bp-0x58]
    char *v2;  // [bp-0x50]
    char v3;  // [bp-0x48], Other Possible Types: unsigned long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = &v3;
    v3 = a0;
    v6 = sub_a67850(&v2, &g_df1768, 1478, 4, &g_a9a858, 0);
    if (v6)
        return *(int *)&(&g_ea1ec8)[16 + v6->field_0 * 40];
    sub_a6afb8(64, 0);
    if (sub_a7c208(&g_f09038, &g_a9a808) && (int)g_f12f30 && sub_a7c17c(g_f12f28))
    {
        if (g_f12f20 && !(v0 = 1, v1 = &v3, v7 = sub_a66b6c(g_f12f20, &v0), !v7))
            v8 = v7->field_8->field_10;
        else
            v8 = 0;
        sub_a7c1b4(g_f12f28);
        return v8;
    }
    sub_a368c8();
    sub_a369bc("crypto/objects/obj_dat.c", 673, "OBJ_sn2nid");
    sub_a36abc(8, 0xc010f, 0);
    return 0;
}

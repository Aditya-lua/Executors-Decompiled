/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa99624..0xa9976c (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a99624_0 {
    char padding_0[8];
    struct st_a99624_0 *field_8;
} st_a99624_0;

extern long long g_a9a808;
extern char g_ea1ec8;
extern long long g_f09038;
extern st_a99624_0 *g_f12f20;
extern long long g_f12f28;
extern st_a99624_0 *g_f12f30;

st_a99624_0 * sub_a99624(st_a99624_0 *a0)
{
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a99624_0 *v12;  // x19
    long long v13;  // x0
    long long v14;  // x1
    char v0;  // [bp-0x58]
    st_a99624_0 *v1;  // [bp-0x48]
    unsigned int v2;  // [bp-0x30]
    char *v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
    {
        a0 = (st_a99624_0 *)0;
    }
    else if (1486 < a0 || !*(int *)&(&g_ea1ec8)[16 + a0 * 40])
    {
        v4 = v9;
        v5 = v10;
        v6 = &v8;
        v7 = v11;
        v2 = 3;
        v3 = &v0;
        v1 = a0;
        sub_a6afb8(64, 0);
        if (sub_a7c208(&g_f09038, &g_a9a808) && (int)g_f12f30 && sub_a7c17c(g_f12f28))
        {
            if (g_f12f20)
            {
                v12 = sub_a66b6c(g_f12f20, &v2);
                v13 = sub_a7c1b4(g_f12f28);
                if (v12)
                    return v12->field_8;
            }
            else
            {
                v13 = sub_a7c1b4(g_f12f28);
            }
            sub_a368c8(v13);
            sub_a369bc("crypto/objects/obj_dat.c", 349, "OBJ_nid2obj");
            v14 = 101;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/objects/obj_dat.c", 340, "OBJ_nid2obj");
            v14 = 786703;
        }
        sub_a36abc(8, v14, 0);
        return 0;
    }
    return &(&g_ea1ec8)[a0 * 40];
}

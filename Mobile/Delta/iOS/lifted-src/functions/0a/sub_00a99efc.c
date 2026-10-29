/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa99efc..0xa9a1a8 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a99efc_0 {
    struct st_a99efc_0 *field_0;
    struct st_a99efc_0 *field_8;
    struct st_a99efc_0 *field_10;
    struct st_a99efc_0 *field_14;
} st_a99efc_0;

extern long long g_a9a808;
extern long long g_a9a87c;
extern long long g_df53b0;
extern char g_ea1ec8;
extern long long g_f09038;
extern st_a99efc_0 *g_f12f20;
extern long long g_f12f28;
extern st_a99efc_0 *g_f12f30;

st_a99efc_0 * sub_a99efc(st_a99efc_0 *a0, st_a99efc_0 *a1, st_a99efc_0 *a2)
{
    long long v5;  // x1
    st_a99efc_0 *v6;  // x0
    st_a99efc_0 *v7;  // x19
    st_a99efc_0 *v8;  // x0
    st_a99efc_0 *v9;  // x8
    st_a99efc_0 *v10;  // x0
    st_a99efc_0 *v11;  // w8
    st_a99efc_0 *v12;  // x20
    st_a99efc_0 *v0;  // [bp-0x58]
    st_a99efc_0 *v1;  // [bp-0x50]
    st_a99efc_0 *v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a0 && !a1 && !a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/objects/obj_dat.c", 783, "OBJ_create");
        v5 = 524550;
    }
    else if (a1 && sub_a998f4(a1) || a2 && sub_a99a1c(a2))
    {
        sub_a368c8();
        sub_a369bc("crypto/objects/obj_dat.c", 790, "OBJ_create");
        v5 = 0x66;
    }
    else
    {
        if (a0)
        {
            v6 = sub_a997a4(a0, 1);
            if (!v6)
                return v6;
LABEL_a99fe4:
            v7 = v6;
            sub_a6afb8(64, 0);
            if (sub_a7c208(&g_f09038, &g_a9a808) && (int)g_f12f30 && sub_a7c198(g_f12f28))
            {
                if (a0)
                {
                    v2 = v7;
                    if ((int)v7->field_10)
                    {
LABEL_a9a038:
                        sub_a368c8();
                        sub_a369bc("crypto/objects/obj_dat.c", 817, "OBJ_create");
                        sub_a36abc(8, 0x66, 0);
                        sub_a7c1b4(g_f12f28);
                        sub_9c3580(v7);
                        return 0;
                    }
                    if (*(int *)((char *)&v7->field_10 + 4))
                    {
                        v8 = sub_a67850(&v2, &g_df53b0, 1344, 4, &g_a9a87c, 0);
                        if (v8)
                        {
                            v9 = &(&g_ea1ec8)[(int)v8->field_0 * 40];
                            goto LABEL_a9a114;
                        }
                        else if (g_f12f20 && (v0 = (st_a99efc_0 *)0, v1 = v2, v10 = sub_a66b6c(g_f12f20, &v0), v10))
                        {
                            v9 = v10->field_8;
LABEL_a9a114:
                            if ((int)v9->field_10)
                                goto LABEL_a9a038;
                        }
                    }
                }
                do
                {
                    /* unsupported instruction */;
                    v11 = (st_a99efc_0 *)/* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                *(unsigned int *)&v7->field_10 = (unsigned int)v11;
                if (!v11)
                {
                    sub_a7c1b4(g_f12f28);
                    sub_9c3580(v7);
                    return 0;
                }
                v7->field_0 = a1;
                v7->field_8 = a2;
                v12 = sub_a9a2fc(v7, 0);
                v7->field_0 = 0;
                v7->field_8 = 0;
                sub_a7c1b4(g_f12f28);
                sub_9c3580(v7);
                return v12;
            }
            sub_a368c8();
            sub_a369bc("crypto/objects/obj_dat.c", 809, "OBJ_create");
            sub_a36abc(8, 0xc0110, 0);
            sub_9c3580(v7);
            return 0;
        }
        v6 = sub_9c3624();
        if (v6)
            goto LABEL_a99fe4;
        sub_a368c8();
        sub_a369bc("crypto/objects/obj_dat.c", 803, "OBJ_create");
        v5 = 524301;
    }
    sub_a36abc(8, v5, 0);
    return 0;
}

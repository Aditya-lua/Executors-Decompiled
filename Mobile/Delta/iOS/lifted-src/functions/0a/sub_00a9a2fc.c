/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9a2fc..0xa9a7f0 (1268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a9a808;
extern long long g_a9a8c0;
extern long long g_a9ac3c;
extern long long g_f09038;
extern unsigned long long g_f12f20;
extern long long g_f12f28;
extern char g_f12f30;
extern char g_10002b0;

int sub_a9a2fc(unsigned long a0, unsigned long long a1)
{
    unsigned long long v11;  // x0
    unsigned int *v12;  // x19
    unsigned long long v21;  // x28
    unsigned long long v22;  // x8
    unsigned long long v23;  // x0
    unsigned long long v24;  // x0
    unsigned long long v25;  // x0
    unsigned long long idx;  // x25
    unsigned long index;  // x26
    unsigned long idx1;  // x25
    unsigned long long v13;  // x21
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    long long v16;  // x25
    unsigned long long v17;  // x0
    unsigned int *v18;  // x25
    unsigned long long v19;  // x27
    unsigned long long v20;  // w26
    unsigned long long v0;  // [bp-0xa8]
    unsigned long long v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x98]
    unsigned long long v3;  // [bp-0x90]
    unsigned long long v4;  // [bp-0x88]
    unsigned long long v5;  // [bp-0x80]
    unsigned long long v6;  // [bp-0x78]
    unsigned long long v7;  // [bp-0x70]
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    v11 = sub_a9ad24();
    if (v11)
    {
        v12 = v11;
        v7 = sub_a6bf4c(16, "crypto/objects/obj_dat.c", 270);
        if (!v7)
        {
            v14 = 0;
            v15 = 0;
            v13 = 0;
            goto LABEL_a9a730;
        }
        if (v12[5] && *(long long *)(a0 + 24))
        {
            v13 = sub_a6bf4c(16, "crypto/objects/obj_dat.c", 273);
            v4 = v13;
            if (v13)
                goto LABEL_a9a3a8;
            v14 = 0;
            v15 = 0;
            goto LABEL_a9a730;
        }
        v13 = 0;
LABEL_a9a3a8:
        if (*(long long *)v12)
        {
            v15 = sub_a6bf4c(16, "crypto/objects/obj_dat.c", 275);
            v5 = v15;
            if (v15)
            {
                if (!*(long long *)&v12[2])
                    goto LABEL_a9a41c;
                goto LABEL_a9a3d8;
            }
            else
            {
                v14 = 0;
                goto LABEL_a9a730;
            }
            goto LABEL_a9a730;
        }
        v15 = 0;
        if (*(long long *)&v12[2])
        {
LABEL_a9a3d8:
            v14 = sub_a6bf4c(16, "crypto/objects/obj_dat.c", 277);
            v6 = v14;
            if (v14)
            {
                if (a1)
                    goto LABEL_a9a424;
                goto LABEL_a9a464;
            }
            goto LABEL_a9a730;
        }
LABEL_a9a41c:
        v14 = 0;
        if (a1)
        {
LABEL_a9a424:
            sub_a6afb8(64, 0);
            if (sub_a7c208(&g_f09038, &g_a9a808) && *(int *)&g_f12f30 && sub_a7c198(g_f12f28))
                goto LABEL_a9a464;
            sub_a368c8();
            sub_a369bc("crypto/objects/obj_dat.c", 281, "ossl_obj_add_object");
            sub_a36abc(8, 0xc0110, 0);
            goto LABEL_a9a730;
        }
        else
        {
LABEL_a9a464:
            if (!g_f12f20)
            {
                g_f12f20 = sub_a66520(sub_a66530(&g_a9a8c0, &g_a9ac3c), " ", "@", " ", "@");
                if (g_f12f20)
                    goto LABEL_a9a4b0;
                v16 = 287;
LABEL_a9a6f0:
                sub_a368c8();
                sub_a369bc("crypto/objects/obj_dat.c", v16, "ossl_obj_add_object");
                sub_a36abc(8, 0x8000f, 0);
                if (a1)
                    sub_a7c1b4(g_f12f28);
LABEL_a9a730:
                sub_a6c2e4(v13, "crypto/objects/obj_dat.c", 322);
                sub_a6c2e4(v15, "crypto/objects/obj_dat.c", 322);
                sub_a6c2e4(v14, "crypto/objects/obj_dat.c", 322);
                sub_a6c2e4(v7, "crypto/objects/obj_dat.c", 322);
                sub_9c3580(v12);
                v11 = 0;
            }
            else
            {
LABEL_a9a4b0:
                if (v13)
                {
                    *(unsigned int *)v13 = 0;
                    *(unsigned int **)(v13 + 8) = v12;
                    v17 = sub_a66b6c();
                    v18 = v17;
                    v0 = v17;
                    v19 = !v17;
                    if (v17)
                        *v18 = 0xffffffff;
                    sub_a66794(g_f12f20, v13);
                    if (!sub_a66e38(g_f12f20))
                        goto LABEL_a9a544;
                    v20 = 0;
                    v21 = 0;
                    v22 = 1;
                    goto LABEL_a9a65c;
                }
LABEL_a9a544:
                if (v15)
                {
                    *(unsigned int *)v15 = 1;
                    *(unsigned int **)(v15 + 8) = v12;
                    v23 = sub_a66b6c(g_f12f20, v15);
                    v18 = v23;
                    v1 = v23;
                    v19 = !v23;
                    if (v23)
                        *v18 = 0xffffffff;
                    sub_a66794(g_f12f20, v15);
                    if (!sub_a66e38(g_f12f20))
                        goto LABEL_a9a5a4;
                    v22 = 0;
                    v20 = 0;
                    v21 = 1;
                    goto LABEL_a9a65c;
                }
LABEL_a9a5a4:
                if (v14)
                {
                    *(unsigned int *)v14 = 2;
                    *(unsigned int **)(v14 + 8) = v12;
                    v24 = sub_a66b6c(g_f12f20, v14);
                    v18 = v24;
                    v2 = v24;
                    v19 = !v24;
                    if (v24)
                        *v18 = 0xffffffff;
                    sub_a66794(g_f12f20, v14);
                    if (!sub_a66e38(g_f12f20))
                        goto LABEL_a9a604;
                    v22 = 0;
                    v20 = 1;
                    v21 = 2;
                    goto LABEL_a9a65c;
                }
                else
                {
LABEL_a9a604:
                    *(unsigned int *)v7 = 3;
                    *(unsigned int **)(v7 + 8) = v12;
                    v25 = sub_a66b6c(g_f12f20, v7);
                    v18 = v25;
                    v3 = v25;
                    v19 = !v25;
                    if (v25)
                        *v18 = 0xffffffff;
                    sub_a66794(g_f12f20, v7);
                    if (sub_a66e38(g_f12f20))
                    {
                        v22 = 0;
                        v20 = 1;
                        v21 = 3;
LABEL_a9a65c:
                        if (!(v19 & 1))
                            *v18 = v21;
                        if (!(v22 & 1))
                        {
                            idx = v21 - 1;
                            sub_a66994(g_f12f20, (&v4)[idx]);
                            if ((&v0)[idx])
                                *(unsigned int *)(&v0)[idx] = idx;
                            if (v20)
                            {
                                index = v21 - 2;
                                sub_a66994(g_f12f20, (&v4)[index]);
                                if ((&v0)[index])
                                    *(unsigned int *)(&v0)[index] = index;
                                if (idx >= 2)
                                {
                                    idx1 = v21 - 3;
                                    sub_a66994(g_f12f20, (&v4)[idx1]);
                                    if ((&v0)[idx1])
                                        *(unsigned int *)(&v0)[idx1] = idx1;
                                }
                            }
                        }
                        v16 = 308;
                        goto LABEL_a9a6f0;
                    }
                    else
                    {
                        v12[8] = v12[8] & 0xfffffff2;
                        if (a1)
                            sub_a7c1b4(g_f12f28);
                        v11 = v12[4];
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v8)
        return v11;
    ___stack_chk_fail();
}

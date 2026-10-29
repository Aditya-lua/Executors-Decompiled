/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f7f8..0xa3fd98 (1440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3f7f8_0 {
    unsigned int field_0;
    char padding_4[4];
    void* field_8;
    char padding_10[9];
    char field_19;
    char padding_1a[14];
    void* field_28;
    unsigned long long field_30;
} st_a3f7f8_0;


unsigned long long sub_a3f7f8(st_a3f7f8_0 *a0, unsigned int a1, unsigned long a2, unsigned int a3)
{
    unsigned int v2;  // x22
    unsigned int v3;  // x20
    long long v12;  // x1
    unsigned int v13;  // x0
    void* v14;  // x8
    unsigned long v15;  // x0
    unsigned int v16;  // x0
    void* v17;  // x0
    unsigned int v18;  // w0
    unsigned long long v19;  // 4112
    void* v20;  // x8
    unsigned int v21;  // w0
    void* v4;  // x9
    unsigned long long v22;  // x0
    unsigned long v23;  // x0
    unsigned int v24;  // x0
    unsigned int v25;  // x22
    unsigned long v26;  // x22
    unsigned int v5;  // w8
    long long v6;  // x1
    unsigned int v7;  // x23
    void* v8;  // x8
    unsigned int v9;  // x0
    unsigned int v10;  // w8
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = a1;
    v4 = a0->field_28;
    if (v4 && (v5 = *(int *)v4, v5 & 49648 && (long long)v4[48]))
    {
        switch (v5)
        {
        default:
            sub_a368c8();
            sub_a369bc("crypto/evp/digest.c", 178, "evp_md_init_internal");
            v6 = 189;
            break;
        }
        goto LABEL_a3fab4;
    }
    sub_a50dd0(a0, 2050);
    if (v3)
    {
        *(unsigned long long *)&a0->field_0 = v3;
LABEL_a3f894:
        if (!*(long long *)&a0->padding_10[0] || !a0->field_8 || *(int *)v3 != *(int *)a0->field_8)
        {
            sub_a32e7c(*(long long *)&a0->padding_10[0]);
            *(unsigned long long *)&a0->padding_10[0] = 0;
            if (v2)
            {
LABEL_a3f8c0:
                v7 = 0;
                goto LABEL_a3f8c4;
            }
            v7 = sub_a351bc(*(int *)v3);
            if (*(long long *)&a0->padding_10[0] || v7)
            {
LABEL_a3f8c4:
                if (*(long long *)&a0[1].field_0)
                {
                    v8 = a0->field_8;
                    if (v8)
                    {
                        if ((long long)v8[176])
                            (long long)v8[176]();
                        *(unsigned long long *)&a0[1].field_0 = 0;
                        goto LABEL_a3f8e4;
                        goto LABEL_a3f8e4;
                    }
                    else
                    {
                        sub_c67268();
                    }
                }
                else
                {
LABEL_a3f8e4:
                    v9 = (unsigned int)a0[1].field_8;
                    if (a0->field_8 == v9)
                        a0->field_8 = 0;
                    if (v9 && !*(int *)(v9 + 24))
                    {
                        do
                        {
                            /* unsupported instruction */;
                            v10 = /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v11 = arm64g_calculate_condition(19, v10, 1, 0);
                        if (!(v11 & 1))
                        {
                            /* unsupported instruction */;
                        }
                        else if (1 < (int)v10)
                        {
                            goto LABEL_a3fa7c;
                        }
                        sub_a50b58();
                    }
LABEL_a3fa7c:
                    a0[1].field_8 = 0;
                    if (v2)
                    {
                        if (sub_a32d54(v2))
                            goto LABEL_a3fac8;
                        sub_a368c8();
                        v12 = 311;
LABEL_a3faa8:
                        sub_a369bc("crypto/evp/digest.c", v12, "evp_md_init_internal");
                        v6 = 134;
LABEL_a3fab4:
                        sub_a36abc(6, v6, 0);
                    }
                    else
                    {
                        v2 = v7;
                        if (!v7)
                            goto LABEL_a3fadc;
LABEL_a3fac8:
                        v13 = sub_a351d8(v2, *(int *)v3);
                        if (v13)
                        {
                            v3 = v13;
LABEL_a3fadc:
                            *(unsigned long long *)&a0->padding_10[0] = v2;
                            v14 = a0->field_8;
                            if (v14 != v3)
                            {
                                if (v14)
                                {
                                    if ((long long)v14[64] && !sub_a50db0(a0, 2))
                                        (long long)a0->field_8[64]();
                                    if (*(long long *)&a0->padding_1a[6] && (int)a0->field_8[76] >= 1)
                                    {
                                        sub_a50db0(a0, 4);
                                        sub_a6c4e8(*(long long *)&a0->padding_1a[6], (int)a0->field_8[76], "crypto/evp/digest.c", 38);
                                        *(unsigned long long *)&a0->padding_1a[6] = 0;
                                    }
                                }
                                a0->field_8 = v3;
                                if (!(a0->field_19 & 1))
                                {
                                    v15 = *(int *)(v3 + 76);
                                    if ((unsigned int)v15)
                                    {
                                        a0->field_30 = *(long long *)(v3 + 40);
                                        v16 = sub_a6bffc(v15, "crypto/evp/digest.c", 344);
                                        *(unsigned long long *)&a0->padding_1a[6] = v16;
                                        if (!v16)
                                            return v16;
                                    }
                                }
                            }
                            goto LABEL_a3fb90;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/evp/digest.c", 323, "evp_md_init_internal");
                            sub_a36abc(6, 134, 0);
                            sub_a32e7c(v2);
                        }
                    }
                }
            }
            else
            {
                if (a0->field_19 & 1 || *(int *)(v3 + 24) == 2)
                    goto LABEL_a3f8c0;
                v20 = a0->field_8;
                if (v20)
                {
                    if ((long long)v20[64])
                    {
                        v21 = sub_a50db0(a0, 2);
                        v20 = a0->field_8;
                        if (!v21)
                            (long long)v20[64]();
                    }
                    if (*(long long *)&a0->padding_1a[6] && (int)v20[76] >= 1)
                    {
                        sub_a50db0(a0, 4);
                        sub_a6c4e8(*(long long *)&a0->padding_1a[6], (int)a0->field_8[76], "crypto/evp/digest.c", 38);
                        *(unsigned long long *)&a0->padding_1a[6] = 0;
                        v20 = a0->field_8;
                    }
                }
                if (v20 != v3)
                {
                    v22 = sub_a3f7a4(a0);
                    if (!(unsigned int)v22)
                        return v22;
                    if (*(long long *)(v3 + 112))
                        goto LABEL_a3fc5c;
                    v23 = *(int *)v3;
                    if ((unsigned int)v23)
                        sub_a9976c(v23);
                    v24 = sub_a4e6ec(0, 1);
                    if (v24)
                    {
                        v3 = v24;
                        sub_a3f52c(a0[1].field_8);
                        a0[1].field_8 = v3;
                        v25 = v3;
                        v26 = v25 + 112;
                        if (!*(long long *)(v25 + 112))
                            goto LABEL_a3fc94;
LABEL_a3fc60:
                        if (a0[1].field_8 != v3)
                        {
                            if (!*(int *)(v3 + 24))
                            {
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                            }
                            sub_a3f52c();
                            a0[1].field_8 = v3;
                        }
LABEL_a3fc94:
                        a0->field_8 = v3;
                        if (!*(long long *)&a0[1].field_0)
                        {
                            sub_a79f54(*(long long *)v26);
                            (*(long long *)(v3 + 128))();
                        }
                        if (*(long long *)(v3 + 0x88))
                        {
                            goto *((void *)(*(long long *)(v3 + 0x88)));
                        }
                        else
                        {
                            sub_a368c8();
                            v12 = 298;
                            goto LABEL_a3faa8;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        v12 = 271;
                        goto LABEL_a3faa8;
                    }
                    goto LABEL_a3faa8;
                }
                else if (*(long long *)(v3 + 112))
                {
LABEL_a3fc5c:
                    v26 = v3 + 112;
                    goto LABEL_a3fc60;
                }
                else
                {
                    sub_c67298();
                }
            }
        }
        else
        {
LABEL_a3fb90:
            v17 = a0->field_28;
            if (!v17 || *(short *)v17 & 49648 && (long long)v17[40] || !(v18 = sub_a5e1f4(), 0 >= (int)v18 && (v19 = arm64g_calculate_condition(0x11, v18, 2, 0), v19 & 1)))
            {
                if (!(a0->field_19 & 1))
                    goto *((void *)((long long)a0->field_8[32]));
                else
                    return 1;
            }
        }
        return 0;
    }
    v3 = (unsigned int)a0->field_8;
    if (v3)
        goto LABEL_a3f894;
    sub_a368c8();
    sub_a369bc("crypto/evp/digest.c", 189, "evp_md_init_internal");
    v6 = 139;
    goto LABEL_a3fab4;
}

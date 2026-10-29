/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4f8c..0x9f55a8 (1564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4f8c_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
} st_9f4f8c_1;

typedef struct st_9f4f8c_0 {
    char padding_0[40];
    long long field_28;
} st_9f4f8c_0;

extern long long g_9f5df0;
extern long long g_9f5e14;
extern long long g_f08588;
extern long long g_f08598;
extern long long g_f127c0;
extern long long g_f127c8;
extern char g_f127d0;
extern char g_f127d4;
extern long long g_f127d8;

unsigned long long sub_9f4f8c(st_9f4f8c_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v18;  // x28
    unsigned long long v19;  // x27
    unsigned long long v28;  // x30
    unsigned long long v29;  // x21
    unsigned long long v30;  // x0
    unsigned long long v31;  // w0
    unsigned long long v32;  // x8
    unsigned long long v33;  // x0
    unsigned long long v34;  // x21
    unsigned long long v35;  // x0
    unsigned long long v36;  // x20
    unsigned long long v37;  // x21
    unsigned long long v20;  // x26
    st_9f4f8c_1 *v39;  // x22
    unsigned long long v40;  // x28
    unsigned long v41;  // x26
    unsigned long long ptr;  // x0
    unsigned int v43;  // w24
    long long v44;  // x25
    unsigned long long v45;  // x27
    unsigned long long idx;  // x24
    unsigned long long v47;  // x0
    unsigned long long v21;  // x25
    unsigned long long v48;  // x25
    unsigned long long v49;  // x27
    unsigned long long v50;  // x0
    unsigned long long v51;  // x22
    unsigned long long v52;  // x0
    unsigned long long *v53;  // x25
    unsigned long long v54;  // x0
    unsigned long long v55;  // x0
    unsigned long long v56;  // x22
    unsigned long long v57;  // x0
    unsigned long long v22;  // x24
    long long v58;  // x22
    long long v59;  // x1
    long long v60;  // x2
    unsigned long long v23;  // x23
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    unsigned long long v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x68], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    if (!a0)
        return 1;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = &v17;
    v16 = v28;
    v29 = a2;
    v4 = 0;
    sub_a36c8c();
    v30 = sub_9f4cec(a0, 0, "config_diagnostics", &v4);
    sub_a36cd4(v30, 0, "config_diagnostics", &v4);
    if ((int)v30 >= 1)
    {
        sub_a685ec(a0->field_28, (long long)v4 > 0);
        v31 = (long long)v4 > 0;
    }
    else
    {
        v31 = (unsigned int)sub_a68564(a0->field_28);
    }
    v32 = v29 & 0xffffffffffffffe8;
    if (v31)
        v29 = v32;
    sub_a36c8c();
    if (a1)
    {
        v33 = sub_9f4c48(a0, 0, a1);
        if (v33)
            goto LABEL_9f5064;
        if (!(v29 >> 5 & 1))
            goto LABEL_9f5524;
    }
    v33 = sub_9f4c48(a0, 0, "openssl_conf");
    if (v33)
    {
LABEL_9f5064:
        v34 = v33;
        v35 = sub_9f4bd0(a0, v34);
        if (v35)
        {
            v36 = v35;
            sub_a36cd4();
            if ((int)sub_ad69e4(v36) >= 1)
            {
                v37 = 0;
                do
                {
                    v39 = sub_ad69f8(v36, v37);
                    sub_a36c8c(v39, v37);
                    v40 = v39->field_8;
                    v41 = v39->field_10;
                    if (sub_a7c208(&g_f08588, &g_9f5df0) && g_f127d0)
                    {
                        ptr = _strrchr(v40, 46);
                        if (ptr)
                            v43 = ptr - v40;
                        else
                            v43 = _strlen(v40);
                        if (sub_a7c208(&g_f08598, &g_9f5e14) && *(int *)&g_f127d4)
                        {
                            sub_a7b924(g_f127c0);
                            v44 = sub_a7bf24(&g_f127c8);
                            if ((int)sub_ad69e4(v44) >= 1)
                            {
                                v45 = 0;
                                do
                                {
                                    idx = sub_ad69f8(v44, v45);
                                    if (!_strncmp(*(long long *)(idx + 8), v40, v43))
                                    {
                                        sub_a7bc48(g_f127c0);
                                        goto LABEL_9f5238;
                                    }
                                } while ((v45 = (unsigned int)v45 + 1, (int)v45 < (int)sub_ad69e4(v44)));
                            }
                            sub_a7bc48(g_f127c0);
                        }
                        if (v29 >> 3 & 1)
                        {
LABEL_9f5310:
                            if (v29 >> 2 & 1)
                                goto LABEL_9f5504;
                            sub_a368c8();
                            sub_a369bc("crypto/conf/conf_mod.c", 276, "module_run");
                            v0 = v40;
                            v59 = 113;
                            v60 = "module=%s";
                            goto LABEL_9f5500;
                        }
                        v47 = sub_9f2d14(a0, v41, "path");
                        if (!v47)
                            v48 = v40;
                        else
                            v48 = v47;
                        v49 = sub_a042b8();
                        if (!v49)
                        {
                            v51 = 110;
                            goto LABEL_9f52c4;
                        }
                        v50 = sub_a04518(v49, "OPENSSL_init");
                        if (!v50)
                        {
                            v51 = 112;
LABEL_9f52c4:
                            sub_a368c8(sub_a04184(v49));
                            sub_a369bc("crypto/conf/conf_mod.c", 331, "module_load_dso");
                            v0 = v40;
                            v1 = v48;
                            sub_a36abc(14, v51, "module=%s, path=%s");
                            goto LABEL_9f5310;
                        }
                        idx = sub_9f5ac0(v49, v40, v50, sub_a04518(v49, "OPENSSL_finish"));
                        if (!idx)
                        {
                            v51 = 0;
                            goto LABEL_9f52c4;
                        }
LABEL_9f5238:
                        v52 = sub_a6bf4c(40, "crypto/conf/conf_mod.c", 437);
                        if (!v52)
                        {
LABEL_9f54b4:
                            if (v29 >> 2 & 1)
                                goto LABEL_9f5504;
                            sub_a368c8();
                            sub_a369bc("crypto/conf/conf_mod.c", 286, "module_run");
                            v1 = v41;
                            v2 = 0xffffffff;
                            v0 = v40;
                            v59 = 109;
                            v60 = "module=%s, value=%s retcode=%-8d";
LABEL_9f5500:
                            sub_a36abc(14, v59, v60);
                            goto LABEL_9f5504;
                        }
                        v53 = v52;
                        *(unsigned long long *)v52 = idx;
                        v54 = sub_a6d9b4(v40, "crypto/conf/conf_mod.c", 442);
                        v53[1] = v54;
                        v55 = sub_a6d9b4(v41, "crypto/conf/conf_mod.c", 443);
                        v53[2] = v55;
                        v53[4] = 0;
                        if (!v54 || !v55)
                        {
LABEL_9f547c:
                            sub_a6c2e4(v53[1], "crypto/conf/conf_mod.c", 499);
                            sub_a6c2e4(v53[2], "crypto/conf/conf_mod.c", 500);
                            sub_a6c2e4(v53, "crypto/conf/conf_mod.c", 501);
                            goto LABEL_9f54b4;
                        }
                        if (*(long long *)(idx + 16))
                            (*(long long *)(idx + 16))();
                        if (!sub_a7c208(&g_f08598, &g_9f5e14) || !*(int *)&g_f127d4)
                        {
LABEL_9f5468:
                            goto LABEL_9f547c;
                        }
                        sub_a7bd78(g_f127c0);
                        v56 = sub_a7bf24(&g_f127d8);
                        if (v56)
                        {
                            v57 = sub_ad5f4c(v56);
                            v4 = v57;
                            if (!v57)
                                goto LABEL_9f540c;
                        }
                        else
                        {
                            v57 = sub_ad61b4();
                            v4 = v57;
                            if (!v57)
                            {
LABEL_9f540c:
                                sub_a7bd80(g_f127c0);
                                v58 = 472;
LABEL_9f5438:
                                sub_a368c8();
                                sub_a369bc("crypto/conf/conf_mod.c", v58, "module_init");
                                sub_a36abc(14, 0x8000f, 0);
                                goto LABEL_9f5468;
                            }
                        }
                        v3 = v56;
                        if (sub_ad68a0())
                        {
                            *(int *)(idx + 32) = *(int *)(idx + 32) + 1;
                            sub_a7bf2c(&g_f127d8, &v4);
                            sub_a7bd80(g_f127c0);
                            sub_a7bd88(g_f127c0);
                            sub_ad6020(v3);
                        }
                        else
                        {
                            sub_a7bd80(g_f127c0);
                            sub_ad6020(v57);
                            v58 = 479;
                            goto LABEL_9f5438;
                        }
                    }
                    else
                    {
LABEL_9f5504:
                        if (!(v29 & 1))
                        {
                            sub_a36e70();
                            return 0xffffffff;
                        }
                    }
                } while ((sub_a36cd4(), v37 = (unsigned int)v37 + 1, (int)v37 < (int)sub_ad69e4(v36)));
            }
        }
        else if (!(v29 >> 2 & 1))
        {
            sub_a368c8(sub_a36e70());
            sub_a369bc("crypto/conf/conf_mod.c", 163, "CONF_modules_load");
            v0 = v34;
            sub_a36abc(14, 124, "openssl_conf=%s");
            return 0;
        }
        else
        {
            sub_a36cd4();
            return 0;
        }
    }
    else
    {
LABEL_9f5524:
        sub_a36cd4();
    }
    return 1;
}

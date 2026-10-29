/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64e9c..0xa654d8 (1596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a64e9c_0 {
    struct st_a64e9c_0 *field_0;
    char field_1;
    char field_2;
    char field_3;
} st_a64e9c_0;


void* sub_a64e9c(void* a0, void* a1, void* a2, void* a3, void* a4, void* a5, void* a6, void* a7)
{
    void* v13;  // x21
    void* v14;  // x22
    unsigned long v23;  // cc_op
    void* v97;  // x0
    void* v98;  // x0
    void* v99;  // x20
    void* v100;  // x0
    void* v101;  // x0
    void* v102;  // x19
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned long v26;  // cc_ndep
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    void* v15;  // x25
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    void* v16;  // x26
    unsigned int v31;  // w8
    unsigned long v32;  // cc_dep1
    unsigned long long v33;  // 4105
    unsigned long long v34;  // 4105
    void* ptr;  // x0
    void* ptr1;  // x0
    void* v17;  // x20
    unsigned long v37;  // cc_dep1
    void* v38;  // x27
    unsigned long long v39;  // 4106
    unsigned long long v40;  // 4106
    void* v41;  // x28
    void* ptr2;  // x0
    void* v43;  // x19
    void* v44;  // x8
    unsigned int v45;  // w9
    void* v46;  // x8
    void* v18;  // w8
    unsigned long v47;  // cc_dep1
    void* v48;  // x20
    unsigned long long v49;  // 4105
    unsigned long long v50;  // 4105
    void* v51;  // x27
    unsigned int v53;  // w8
    unsigned long long v54;  // 4112
    unsigned long long v55;  // 4102
    unsigned long long v56;  // 4112
    void* v19;  // x19
    unsigned long long v57;  // 4102
    void* v58;  // x2
    long long v59;  // x1
    void* v60;  // x8
    void* v61;  // x8
    void* v62;  // x8
    void* v63;  // x10
    unsigned long v64;  // cc_dep1
    unsigned long v65;  // cc_dep2
    void* v66;  // x8
    void* v20;  // w0
    void* v67;  // x22
    unsigned int v68;  // w8
    unsigned long long v69;  // x8
    unsigned long long v70;  // 4110
    unsigned long long v71;  // 4102
    unsigned long long v72;  // 4110
    unsigned long long v73;  // 4102
    void* v74;  // x27
    void* v75;  // x0
    void* v76;  // w9
    unsigned int v21;  // w8
    unsigned long long v77;  // 4109
    unsigned long v78;  // cc_dep1
    void* v79;  // x21
    unsigned long long v80;  // 4106
    unsigned long long v81;  // 4106
    void* v82;  // x22
    void* v83;  // x0
    void* v84;  // x8
    unsigned long v85;  // cc_dep1
    void* v86;  // x21
    unsigned long long v22;  // x9
    unsigned long long v87;  // 4105
    unsigned long long v88;  // 4105
    void* v89;  // x8
    unsigned long long v90;  // 4114
    void* v91;  // x22
    void* v92;  // x0
    void* v93;  // x20
    void* v94;  // x0
    void* v95;  // x0
    void* v96;  // x0
    st_a64e9c_0 **v0;  // [bp-0xd0], Other Possible Types: void*
    void* v1;  // [bp-0xc8]
    void* v2;  // [bp-0xc0]
    void* v3;  // [bp-0xb8]
    void* v4;  // [bp-0xb0]
    void* v5;  // [bp-0xa8]
    void* v6;  // [bp-0xa0]
    void* v7;  // [bp-0x98]
    void* v8;  // [bp-0x90]
    void* v9;  // [bp-0x78]
    void* v10;  // [bp-0x64]
    char *v11;  // [bp-0x10]
    void* v12;  // [bp+0x0]

    v11 = &v12;
    v13 = a7;
    v14 = a3;
    v15 = a0;
    v10 = (void*)0;
    if (a1)
        *(unsigned long long *)a1 = 0;
    if (a2)
        *(unsigned long long *)a2 = 0;
    if (v14)
        *(unsigned long long *)v14 = 0;
    if (a4)
        *(unsigned long long *)a4 = 0;
    if (a5)
        *(unsigned int *)a5 = 0;
    if (a6)
        *(unsigned long long *)a6 = 0;
    if (v12)
        *(unsigned long long *)v12 = 0;
    if (v13)
        *(unsigned long long *)v13 = 0;
    if (!v15)
    {
        sub_a368c8();
        sub_a369bc("crypto/http/http_lib.c", 79, "OSSL_parse_url");
        sub_a36abc(61, 0xc0102, 0);
        return 0;
    }
    v9 = v12;
    v16 = v15;
    v17 = v15;
    if (sub_a6994c(*(char *)v16, 3))
    {
        v18 = (void*)*(char *)v15;
        v17 = v15;
        v16 = v15;
        if (v18)
        {
            v19 = v15;
            do
            {
                if (sub_a6994c((char)v18, 3) || !(v20 = (void*)(unsigned int)sub_a69974(*(char *)v19), !sub_a69974(*(char *)v19)))
                    continue;
                v21 = *(char *)v19;
                v22 = 1 << ((char)v21 & 63) & 114349209288705;
                if (v21 <= 63)
                {
                    v27 = arm64g_calculate_condition(v23 | 144, v24, v25, v26);
                    v28 = arm64g_calculate_condition(20, (v27 & 1 ? v22 : 0x40000000), 0, 0);
                    if (v28 & 1)
                        continue;
                    goto LABEL_a64f9c;
                }
                else
                {
                    v29 = arm64g_calculate_condition(v23 | 144, v24, v25, v26);
                    v30 = arm64g_calculate_condition(16, (v29 & 1 ? v22 : 0x40000000), 0, 0);
                    if (!(v30 & 1))
                    {
LABEL_a64f9c:
                        v17 = v15;
                        v16 = v15;
                        if (v21 != 58 || !(v17 = v15, v16 = v15, (char)v19[1] == 47))
                            goto LABEL_a65018;
                        v31 = (char)v19[2];
                        v32 = v31 & 0xff;
                        if (v31 == 47)
                        {
                            v17 = v19;
                            v33 = arm64g_calculate_condition(3, v32, 47, 0);
                            if (!(v33 & 1))
                                goto LABEL_a64fd6;
                        }
                        else
                        {
                            v17 = v15;
                            v34 = arm64g_calculate_condition(3, v32, 47, 0);
                            if (!(v34 & 1))
                            {
LABEL_a64fd6:
                                v16 = v15;
LABEL_a64fd8:
                                goto LABEL_a65018;
                            }
                        }
                        v16 = v19 + 3;
                        goto LABEL_a64fd8;
                    }
                }
            } while ((v18 = (void*)(char)v19[1], v19 += 1, v18));
            v17 = v15;
            v16 = v15;
        }
    }
LABEL_a65018:
    ptr = _strpbrk(v16, "/?#");
    if (!ptr)
        ptr = v16 + _strlen(v16);
    ptr1 = _memchr(v16, 64, ptr - v16);
    v37 = ptr1;
    if (!ptr1)
    {
        v38 = v16;
        v39 = arm64g_calculate_condition(4, v37, 0, 0);
        if (!(v39 & 1))
            goto LABEL_a65056;
LABEL_a65055:
        v41 = v16;
    }
    else
    {
        v38 = ptr1;
        v40 = arm64g_calculate_condition(4, v37, 0, 0);
        if (v40 & 1)
            goto LABEL_a65055;
LABEL_a65056:
        v41 = ptr1 + 1;
    }
    if (*(char *)v41 == 91)
    {
        ptr2 = _memchr(v41 + 1, 93, ~v41 + ptr);
        if (!ptr2)
            goto LABEL_a6535c;
        v7 = v38;
        v8 = v17;
        v43 = ptr2 + 1;
    }
    else
    {
        v7 = v38;
        v8 = v17;
        v43 = _strpbrk(v41, ":/?#");
        if (!v43)
            v43 = v41 + _strlen(v41);
    }
    v44 = v43;
    v45 = *(char *)v44;
    v46 = v44 + 1;
    v47 = v45 & 0xff;
    if (v45 == 58)
    {
        v48 = v46;
        v49 = arm64g_calculate_condition(3, v47, 58, 0);
        if (!(v49 & 1))
            goto LABEL_a650ca;
LABEL_a650c9:
        v51 = v46;
    }
    else
    {
        v48 = "0";
        v50 = arm64g_calculate_condition(3, v47, 58, 0);
        if (v50 & 1)
            goto LABEL_a650c9;
LABEL_a650ca:
        v51 = v43;
    }
    v0 = &v10;
    v53 = v10 >> 16;
    if (1 <= (int)_sscanf())
    {
        v54 = arm64g_calculate_condition(v23 | 160, v24, v25, v26);
        v55 = arm64g_calculate_condition(3, (v54 & 1 ? v53 : 0), 0, 0);
        if (v55 & 1)
            goto LABEL_a6512c;
    }
    else
    {
        v56 = arm64g_calculate_condition(v23 | 160, v24, v25, v26);
        v57 = arm64g_calculate_condition(0, (v56 & 1 ? v53 : 0), 0, 0);
        if (v57 & 1)
        {
LABEL_a6512c:
            v6 = v14;
            v60 = 0;
            do
            {
                v61 = v60;
                v62 = v61 + 1;
                v60 = v62;
            } while ((char)(*(char *)(v48 + v61) - 48) < 10);
            v63 = v62 - 1;
            v64 = v48;
            v65 = v51;
            if (v48 == v51)
                v66 = v63;
            else
                v66 = 0;
            v67 = v51 + v66;
            v68 = *(char *)v67;
            v69 = 1 << ((char)v68 & 63) & 9223512808702869505;
            if (v68 <= 63)
            {
                v70 = arm64g_calculate_condition(148, v64, v65, 0);
                v71 = arm64g_calculate_condition(4, (v70 & 1 ? v69 : 0x40000000), 0, 0);
                if (v71 & 1)
                    goto LABEL_a6532c;
            }
            else
            {
                v72 = arm64g_calculate_condition(148, v64, v65, 0);
                v73 = arm64g_calculate_condition(0, (v72 & 1 ? v69 : 0x40000000), 0, 0);
                if (v73 & 1)
                {
LABEL_a6532c:
                    sub_a368c8();
                    sub_a369bc("crypto/http/http_lib.c", 143, "OSSL_parse_url");
                    sub_a36abc(61, 125, 0);
                    v14 = v6;
LABEL_a6535c:
                    sub_a368c8();
                    sub_a369bc("crypto/http/http_lib.c", 189, "OSSL_parse_url");
                    v59 = 101;
                    v58 = 0;
LABEL_a65384:
                    sub_a36abc(61, v59, v58);
LABEL_a65388:
                    v93 = a4;
                    if (!a1)
                        goto LABEL_a653a8;
                    v92 = *(long long *)a1;
                    goto LABEL_a65394;
                }
            }
            v4 = v63;
            v5 = v13;
            v74 = v67 + _strlen(v67);
            v75 = _strchr(v67, 63);
            if (v75)
                v76 = (void*)(!v13);
            else
                v76 = (void*)1;
            v3 = v67;
            v77 = arm64g_calculate_condition(4, v75, 0, 0);
            v78 = v76;
            if (v76)
            {
                v79 = v74;
                v80 = arm64g_calculate_condition(19, v78, 0, 0);
                if (!(v80 & 1))
                    goto LABEL_a651ba;
LABEL_a651b9:
                v82 = v74;
            }
            else
            {
                v79 = v75;
                v81 = arm64g_calculate_condition(19, v78, 0, 0);
                if (v81 & 1)
                    goto LABEL_a651b9;
LABEL_a651ba:
                v82 = v75 + 1;
            }
            v83 = _strchr();
            if (v82 == v79)
                v84 = v83;
            else
                v84 = v79;
            v85 = v83;
            if (!v83)
            {
                v86 = v79;
                v87 = arm64g_calculate_condition(4, v85, 0, 0);
                if (!(v87 & 1))
                    goto LABEL_a651da;
LABEL_a651d9:
                v89 = v74;
            }
            else
            {
                v86 = v84;
                v88 = arm64g_calculate_condition(4, v85, 0, 0);
                if (v88 & 1)
                    goto LABEL_a651d9;
LABEL_a651da:
                v89 = v83;
            }
            v1 = v89;
            v2 = v82;
            v90 = arm64g_calculate_condition(4, v85, 0, 0);
            if (v90 & 1)
                v91 = v74;
            else
                v91 = v83 + 1;
            if (!a1 || (v92 = sub_a6da14(v15, v8 - v15, "crypto/http/http_lib.c", 43), *(void* *)a1 = v92, v92))
            {
                v8 = v86;
                v13 = v5;
                v14 = v6;
                if ((!v14 || (v94 = sub_a6da14(v41, v43 - v41, "crypto/http/http_lib.c", 43), *(void* *)v14 = v94, v94)) && (!a4 || (v95 = sub_a6da14(v48, v4, "crypto/http/http_lib.c", 43), *(void* *)a4 = v95, v95)) && (!a2 || (v96 = sub_a6da14(v16, v7 - v16, "crypto/http/http_lib.c", 43), *(void* *)a2 = v96, v96)) && (!v13 || (v97 = sub_a6da14(v2, v1 - v2, "crypto/http/http_lib.c", 43), *(void* *)v13 = v97, v97)) && (!v9 || (v98 = sub_a6da14(v91, v74 - v91, "crypto/http/http_lib.c", 43), *(void* *)v9 = v98, v98)))
                {
                    if (a5)
                        *(unsigned int *)a5 = (unsigned int)v10;
                    v99 = a6;
                    if (*(char *)v3 == 47)
                    {
                        if (v99)
                        {
                            v100 = sub_a6da14();
                            *(void* *)v99 = v100;
                            if (v100)
                                return 1;
                        }
                        else
                        {
                            return 1;
                        }
                    }
                    else
                    {
                        if (v99)
                        {
                            v101 = sub_a6bf4c(v8 - v3 + 2, "crypto/http/http_lib.c", 182);
                            *(void* *)v99 = v101;
                            if (v101)
                            {
                                v0 = v3;
                                sub_9d5b44();
                                return 1;
                            }
                        }
                        else
                        {
                            return 1;
                        }
                    }
                }
            }
            else
            {
                v13 = v5;
                v14 = v6;
                v93 = a4;
LABEL_a65394:
                sub_a6c2e4(v92, "crypto/http/http_lib.c", 49);
                *(unsigned long long *)a1 = 0;
LABEL_a653a8:
                if (a2)
                {
                    sub_a6c2e4(*(long long *)a2, "crypto/http/http_lib.c", 49);
                    *(unsigned long long *)a2 = 0;
                }
                v102 = a6;
                if (v14)
                {
                    sub_a6c2e4(*(long long *)v14, "crypto/http/http_lib.c", 49);
                    *(unsigned long long *)v14 = 0;
                }
                if (v93)
                {
                    sub_a6c2e4(*(long long *)v93, "crypto/http/http_lib.c", 49);
                    *(unsigned long long *)v93 = 0;
                }
                if (v102)
                {
                    sub_a6c2e4(*(long long *)v102, "crypto/http/http_lib.c", 49);
                    *(unsigned long long *)v102 = 0;
                }
                if (v13)
                {
                    sub_a6c2e4(*(long long *)v13, "crypto/http/http_lib.c", 49);
                    *(unsigned long long *)v13 = 0;
                }
                if (!v9)
                    return 0;
                sub_a6c2e4(*(long long *)v9, "crypto/http/http_lib.c", 49);
                *(unsigned long long *)v9 = 0;
                return 0;
            }
            goto LABEL_a65388;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/http/http_lib.c", 132, "OSSL_parse_url");
    v0 = v48;
    v58 = "%s";
    v59 = 123;
    goto LABEL_a65384;
}

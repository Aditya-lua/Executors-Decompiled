/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa77c2c..0xa781e0 (1460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a77c2c_2 {
    long long field_0;
    unsigned long long field_8;
} st_a77c2c_2;

typedef struct st_a77c2c_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_a77c2c_0;

typedef struct st_a77c2c_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
} st_a77c2c_1;


unsigned long long sub_a77c2c(unsigned long a0, long long a1)
{
    long long v10;  // x23
    long long v11;  // x0
    unsigned long long v20;  // x26
    unsigned long long v21;  // x20
    unsigned long long v22;  // x27
    st_a77c2c_1 *v23;  // x0
    unsigned long v24;  // x25
    unsigned long long ptr;  // x0
    unsigned long long v26;  // x23
    unsigned long long v27;  // w26
    unsigned long long v28;  // x0
    st_a77c2c_2 *v29;  // x20
    long long v12;  // x25
    unsigned long long v30;  // x20
    unsigned long long v31;  // w0
    unsigned long long v32;  // x25
    unsigned long long v33;  // x20
    unsigned long long v34;  // x0
    unsigned long long v35;  // x20
    unsigned long long v36;  // x24
    unsigned long long v37;  // x0
    unsigned long long v38;  // x19
    unsigned long long v39;  // x0
    unsigned long long v13;  // x21
    unsigned long long v41;  // x0
    unsigned long v42;  // cc_op
    unsigned long v43;  // cc_dep1
    unsigned long v44;  // cc_dep2
    unsigned long v45;  // cc_ndep
    unsigned long long v46;  // 4110
    unsigned long long v47;  // 4102
    st_a77c2c_0 *v14;  // x20
    unsigned long long v48;  // 4110
    unsigned long long v49;  // 4102
    long long v15;  // x24
    unsigned long long v50;  // x0
    unsigned long long v51;  // x20
    unsigned long long v16;  // x19
    unsigned long long v52;  // x0
    unsigned long long v53;  // x19
    unsigned long v17;  // x28
    unsigned long long v54;  // x2
    unsigned long long ptr1;  // x20
    unsigned long long v19;  // x0
    unsigned long v0;  // [bp-0xb0]
    st_a77c2c_2 *v1;  // [bp-0xa8]
    long long v2;  // [bp-0xa0]
    long long v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x80]
    unsigned long long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a1;
    v11 = sub_9f4bd0(v10, sub_c4ba8());
    if (v11)
    {
        v12 = v11;
        if ((int)sub_ad69e4() < 1)
            return 1;
        v13 = 0;
        v2 = v10;
        v3 = v12;
        while (1)
        {
            v14 = sub_ad69f8(v12, v13);
            v15 = sub_962b90(v10);
            v16 = *(long long *)&v14->padding_0[8];
            v17 = v14->field_10;
            v7 = 0;
            ptr1 = _strchr(*(long long *)&v14->padding_0[8], 46);
            v19 = sub_9f4bd0(v10, v17);
            if (!v19)
            {
                sub_a368c8();
                sub_a369bc("crypto/provider_conf.c", 328, "provider_conf_load");
                v0 = v17;
                v54 = "section=%s not found";
                break;
            }
            v20 = v19;
            if (ptr1)
                v16 = ptr1 + 1;
            if ((int)sub_ad69e4() < 1)
            {
                v22 = 0;
                v6 = 0;
                v4 = 0;
                v5 = 0;
                if (v16)
                    goto LABEL_a77ff4;
                goto LABEL_a78044;
            }
            v21 = 0;
            v22 = 0;
            do
            {
                v23 = sub_ad69f8(v20, v21);
                v24 = v23->field_8;
                ptr = _strchr(v23->field_8, 46);
                if (ptr)
                    v24 = ptr + 1;
                v26 = v23->field_10;
                if (!_strcmp())
                {
                    v16 = v26;
                    continue;
                }
                else
                {
                    if (_strcmp(v24, "soft_load"))
                    {
                        if (!_strcmp(v24, "module"))
                        {
                            v22 = v26;
                            continue;
                        }
                        else if (_strcmp(v24, "activate"))
                        {
                            continue;
                        }
                    }
                    if (!sub_a781e0(v24, v26))
                        return 0;
                }
            } while ((v21 = (unsigned int)v21 + 1, (int)sub_ad69e4(v20) > (int)v21));
            if ((unsigned int)v7)
            {
                v27 = *(unsigned int *)((void*)&v7 + 4);
                v28 = sub_a6820c(v15, 16);
                v4 = 0;
                v12 = v3;
                if (!v28 || (v29 = v28, !sub_a7c198(*(long long *)v28)))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/provider_conf.c", 211, "provider_conf_activate");
                    sub_a36abc(15, 0xc0103, 0);
                    v10 = v2;
                    return 0;
                }
                v1 = v29;
                v30 = v29->field_8;
                if (v30)
                {
                    v31 = (unsigned int)sub_ad69e4(v30);
                    if (v31 >= 1)
                    {
                        v32 = 0;
                        do
                        {
                            if (!_strcmp(sub_a77644(sub_ad69f8(v30, v32), v32), v16))
                            {
                                v33 = 0;
                                v10 = v2;
                                v12 = v3;
                                goto LABEL_a78174;
                            }
                        } while ((v32 = (unsigned int)v32 + 1, v31 != (unsigned int)v32));
                    }
                }
                if (!sub_a788fc(v15))
                {
                    sub_a368c8(sub_a7c1b4(v1->field_0));
                    sub_a369bc("crypto/provider_conf.c", 224, "provider_conf_activate");
                    sub_a36abc(15, 0xc0103, 0);
                    v10 = v2;
                    v12 = v3;
                    return 0;
                }
                v34 = sub_a78b18(v15, v16, 1);
                v10 = v2;
                v12 = v3;
                if (v34 || !(v34 = sub_a78e10(v15, v16, 0, 0, 1), !v34))
                {
                    v36 = v34;
                    if (v22)
                        sub_a79254(v36, v22);
                    v37 = sub_ad61b4();
                    if (v37)
                    {
                        v38 = v37;
                        v33 = sub_a783bc(v36, 0, 0, v17, v10, v38);
                        sub_ad6020(v38);
                        if ((unsigned int)v33 == 1)
                        {
                            if (sub_a79700(v36, 1, 0))
                            {
                                if (sub_a792b8(v36, &v4, 0))
                                {
                                    if (v4 == v36 || sub_a79700(v4, 1, 0))
                                    {
                                        v39 = v1->field_8;
                                        if (v39 || (v39 = sub_ad61b4(0), v1->field_8 = v39, v39))
                                        {
                                            if (!sub_ad68a0(v39, v4))
                                                goto LABEL_a78154;
                                            v33 = 1;
                                            goto LABEL_a78174;
                                        }
                                        else
                                        {
LABEL_a78154:
                                            sub_a79500(v4, 1);
                                            goto LABEL_a78160;
                                        }
                                    }
                                    else
                                    {
LABEL_a78160:
                                        sub_a78ccc(v4);
                                    }
                                }
                                else
                                {
                                    sub_a79500(v36, 1);
                                }
                            }
                            v33 = 0;
                        }
                        else if (0 < (int)v33)
                        {
                            goto LABEL_a78174;
                        }
                    }
                    else
                    {
                        v33 = 0xffffffff;
                    }
                    sub_a78ccc(v36);
LABEL_a78174:
                    sub_a7c1b4(v1->field_0);
                    if (v33 >> 31 & 1)
                        return 0;
                }
                else
                {
                    sub_a7c1b4(v1->field_0);
                    if (v27)
                        sub_a35af4();
                    if (v27)
                        v35 = 0;
                    else
                        v35 = 0xffffffff;
                    if (v35 >> 31 & 1)
                        return 0;
                }
                goto LABEL_a77ccc;
            }
            v6 = 0;
            v4 = 0;
            v5 = 0;
            v12 = v3;
            if (v16)
            {
                v10 = v2;
LABEL_a77ff4:
                v41 = sub_a6d9b4(v16, "crypto/provider_conf.c", 369);
                v4 = v41;
                if (v41)
                {
                    v46 = arm64g_calculate_condition(v42 | 16, v43, v44, v45);
                    v47 = arm64g_calculate_condition(20, (v46 & 1 ? v22 : 0x40000000), 0, 0);
                    if (!(v47 & 1))
                        goto LABEL_a78018;
                    goto LABEL_a78028;
                }
                v48 = arm64g_calculate_condition(v42 | 16, v43, v44, v45);
                v49 = arm64g_calculate_condition(16, (v48 & 1 ? v22 : 0x40000000), 0, 0);
                if (v49 & 1)
                    goto LABEL_a78028;
LABEL_a78018:
                if (!v41)
                    goto LABEL_a780ac;
                goto LABEL_a78044;
            }
            v10 = v2;
            if (v22)
            {
LABEL_a78028:
                v50 = sub_a6d9b4(v22, "crypto/provider_conf.c", 374);
                (&v4)[1] = v50;
                if (v50)
                    goto LABEL_a78044;
LABEL_a780ac:
                v51 = 0;
LABEL_a77cc0:
                sub_a78648(&v4);
                if (v51 >> 31 & 1)
                    return 0;
LABEL_a77ccc:
                v13 = (unsigned int)v13 + 1;
                if ((int)sub_ad69e4(v12) <= (int)v13)
                    return 1;
            }
            else
            {
LABEL_a78044:
                v52 = sub_ad61b4();
                if (!v52)
                {
                    v51 = 0xffffffff;
                    goto LABEL_a77cc0;
                }
                v53 = v52;
                v51 = sub_a783bc(0, &v4, 0, v17, v10, v53);
                sub_ad6020(v53);
                if ((int)v51 < 1 || !*&(&v4)[1] && !*&(&v5)[1] || (v51 = sub_a78980(v15, &v4), !(unsigned int)v51))
                    goto LABEL_a77cc0;
                if (v51 >> 31 & 1)
                    return 0;
                goto LABEL_a77ccc;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_conf.c", 412, "provider_conf_init");
        v54 = 0;
    }
    sub_a36abc(15, 105, v54);
    return 0;
}

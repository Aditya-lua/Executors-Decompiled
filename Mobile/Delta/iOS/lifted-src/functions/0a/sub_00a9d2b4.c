/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9d2b4..0xa9db28 (2164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a9d2b4(long long a0, unsigned long a1, unsigned long a2, long long *a3, unsigned long long *a4, unsigned long long a5)
{
    unsigned int v8;  // x19
    unsigned int v9;  // x25
    long long v18;  // x27
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long v23;  // cc_ndep
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned int v10;  // x22
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    unsigned int v11;  // x0
    unsigned long v28;  // x0
    unsigned int v29;  // x0
    unsigned int v30;  // x0
    unsigned int v31;  // x0
    unsigned int v32;  // w0
    unsigned int v33;  // w25
    unsigned int v34;  // x20
    unsigned int v35;  // w0
    unsigned int v12;  // x24
    unsigned long long v36;  // 4112
    unsigned long long v37;  // 4108
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4108
    unsigned int v40;  // w0
    unsigned int v41;  // w27
    unsigned long long v42;  // 4106
    unsigned long v43;  // x23
    long long len;  // x26
    unsigned int v45;  // x20
    unsigned int v13;  // w28
    unsigned long v46;  // cc_dep1
    long long v47;  // x8
    unsigned long long v48;  // 4109
    unsigned long long v49;  // 4109
    long long v50;  // x1
    unsigned int v51;  // x0
    unsigned int v52;  // x26
    long long v53;  // x23
    unsigned int v54;  // w24
    unsigned int v55;  // x0
    long long v14;  // x0
    unsigned int v56;  // x1
    unsigned int v57;  // w0
    unsigned int v58;  // w0
    unsigned long long v15;  // x0
    unsigned long v16;  // x20
    long long v17;  // w22
    long long v0;  // [bp-0xa8]
    unsigned int v1;  // [bp-0xa0]
    unsigned int v2;  // [bp-0x9c]
    void* v3;  // [bp-0x70]
    char v4;  // [bp-0x68], Other Possible Types: unsigned int
    unsigned int v5;  // [bp-0x64]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    *a4 = 0;
    *(unsigned long long *)a2 = 0;
    *(unsigned long long *)a1 = 0;
    *a3 = 0;
    if (!~((unsigned int)a5 >> 1 & 3))
    {
        sub_a368c8();
        sub_a369bc("crypto/pem/pem_lib.c", 957, "PEM_read_bio_ex");
        sub_a36abc(9, 0x80106, 0);
        v8 = 0;
        v9 = 0;
        v10 = 0;
        v11 = 0;
        v12 = 0;
        v13 = (unsigned int)a5 & 1;
    }
    else
    {
        v13 = (unsigned int)a5 & 1;
        if (!(a5 & 1))
            v14 = sub_9d8844();
        else
            v14 = sub_9d8850();
        v8 = sub_9d3c1c(v14);
        v9 = sub_9d3c1c(v14);
        if (v8 && v9)
        {
            if (!v13)
            {
                v12 = sub_a6bf4c(0x100, "crypto/pem/pem_lib.c", 784);
                if (!v12)
                    goto LABEL_a9d560;
            }
            else
            {
                v12 = sub_a6c610(0x100, "crypto/pem/pem_lib.c", 784);
                if (!v12)
                {
LABEL_a9d560:
                    v10 = 0;
                    goto LABEL_a9d564;
                }
            }
            v15 = sub_9d4abc(a0, v12, 0xff);
            if ((int)v15 < 1)
            {
LABEL_a9d58c:
                sub_a368c8();
                sub_a369bc("crypto/pem/pem_lib.c", 792, "get_name");
                sub_a36abc(9, 108, 0);
                if (v13)
                    goto LABEL_a9d6b0;
LABEL_a9d5bc:
                sub_a6c2e4(v12, "crypto/pem/pem_lib.c", 813);
                sub_a4af04(0);
                v12 = 0;
                v10 = 0;
LABEL_a9d5e4:
                sub_a6c2e4(v10, "crypto/pem/pem_lib.c", 0x3ff);
                sub_9d3c28(v8);
                sub_9d3c28(v9);
                return v12;
            }
            v16 = v12 - 6;
            v17 = (unsigned int)sub_a9dbe4(v12, v15, (unsigned int)a5 & 0xfffffffb, 1);
            if (_strncmp(v12, "-----BEGIN ", 11) || v17 < 6 || (v18 = v16 + v17, _strncmp(v18, "-----\n", 6)))
            {
                if ((int)sub_9d4abc(a0, v12, 0xff) >= 1)
                {
                    do
                    {
                        v17 = (unsigned int)sub_a9dbe4(v12);
                        if (!_strncmp(v12, "-----BEGIN ", 11))
                        {
                            v24 = arm64g_calculate_condition(v20, v21, v22, v23);
                            v25 = arm64g_calculate_condition(179, (v24 & 1 ? v17 : 0x80000000), (v24 & 1 ? 6 : 0), 0);
                            if (v25 & 1)
                                continue;
                        }
                        else
                        {
                            v26 = arm64g_calculate_condition(v20, v21, v22, v23);
                            v27 = arm64g_calculate_condition(176, (v26 & 1 ? v17 : 0x80000000), (v26 & 1 ? 6 : 0), 0);
                            if (v27 & 1)
                                continue;
                        }
                        v18 = v16 + v17;
                        if (!_strncmp(v18, "-----\n", 6))
                            goto LABEL_a9d4ac;
                    } while ((int)sub_9d4abc(a0, v12, 0xff) >= 1);
                }
                goto LABEL_a9d58c;
            }
LABEL_a9d4ac:
            *(char *)v18 = 0;
            v28 = v17 - 16;
            if (!v13)
            {
                v29 = sub_a6bf4c(v28, "crypto/pem/pem_lib.c", 806);
                if (!v29)
                    goto LABEL_a9d5bc;
                v10 = v29;
                _memcpy();
                sub_a6c2e4(v12, "crypto/pem/pem_lib.c", 813);
                v30 = sub_a6bf4c(0x100, "crypto/pem/pem_lib.c", 848);
            }
            else
            {
                v31 = sub_a6c610(v28, "crypto/pem/pem_lib.c", 806);
                if (!v31)
                {
LABEL_a9d6b0:
                    sub_a6d4c0(v12, 0x100, "crypto/pem/pem_lib.c", 813);
                    sub_a4af04(0);
                    v12 = 0;
                    v10 = 0;
LABEL_a9d570:
                    sub_a6d4c0(v10, 0, "crypto/pem/pem_lib.c", 0x3ff);
                    sub_9d3c28(v8);
                    sub_9d3c28(v9);
                    return v12;
                }
                v10 = v31;
                _memcpy();
                sub_a6d4c0(v12, 0x100, "crypto/pem/pem_lib.c", 813);
                v30 = sub_a6c610(0x100, "crypto/pem/pem_lib.c", 848);
            }
            v12 = v30;
            if (v30)
            {
                v32 = sub_9d4abc(a0, v12, 0xff);
                if ((int)v32 >= 1)
                {
                    v33 = 0;
                    v34 = 0;
                    v2 = 0;
                    v0 = v8;
                }
                else
                {
LABEL_a9d808:
                    sub_a368c8();
                    v50 = 856;
                    goto LABEL_a9d8a0;
                }
                while (1)
                {
                    while (1)
                    {
                        if (v32 == 254)
                        {
                            v1 = *(char *)(v12 + 253) != 10;
                            if (!v33)
                                goto LABEL_a9d72c;
                        }
                        else
                        {
                            v1 = 0;
                            if (!v33)
                            {
LABEL_a9d72c:
                                v33 = _memchr(v12, 58, v32) != 0;
                            }
                        }
                        v35 = _strncmp(v12, "-----END ", 9);
                        if (v33 != 1)
                        {
                            v36 = arm64g_calculate_condition(v20 | 16, v21, v22, v23);
                            v37 = arm64g_calculate_condition(3, (v36 & 1 ? v35 : 0x40000000), 0, 0);
                            if (!(v37 & 1))
                                goto LABEL_a9d762;
                            goto LABEL_a9d761;
                        }
                        v38 = arm64g_calculate_condition(v20 | 16, v21, v22, v23);
                        v39 = arm64g_calculate_condition(0, (v38 & 1 ? v35 : 0x40000000), 0, 0);
                        if (v39 & 1)
                        {
LABEL_a9d761:
                            goto LABEL_a9d762;
                        }
LABEL_a9d762:
                        v40 = sub_a9dbe4();
                        if (*(char *)v12 != 10)
                            break;
                        if (!(v34 & 1))
                        {
                            if (v33 != 2)
                            {
                                v33 = 2;
                                v0 = v9;
                                goto LABEL_a9d7e8;
                            }
                            else
                            {
                                sub_a368c8();
                                v50 = 885;
                                goto LABEL_a9d8a0;
                            }
                            goto LABEL_a9d8a0;
                        }
                        else
                        {
LABEL_a9d7e8:
                            v32 = sub_9d4abc(a0, v12, 0xff);
                            v34 = v1;
                            if (1 > (int)v32)
                                goto LABEL_a9d808;
                        }
                    }
                    v41 = v40;
                    if (!_strncmp(v12, "-----END ", 9))
                        break;
                    if (!v2)
                    {
                        if (sub_9d4888(v0, v12) >> 31 & 1)
                            goto LABEL_a9d8b4;
                        if (v33 != 2)
                        {
                            v2 = 0;
                            goto LABEL_a9d6e4;
                        }
                        if (65 < (int)v41)
                            goto LABEL_a9d8b4;
                        v42 = arm64g_calculate_condition(3, v41, 65, 0);
                        v2 = !(v42 & 1);
LABEL_a9d6e4:
                        v32 = sub_9d4abc(a0, v12, 0xff);
                        v34 = v1;
                        if ((int)v32 < 1)
                            goto LABEL_a9d808;
                    }
                    else
                    {
                        sub_a368c8();
                        v50 = 909;
LABEL_a9d8a0:
                        sub_a369bc("crypto/pem/pem_lib.c", v50, "get_header_and_data");
                        sub_a36abc(9, 0x66, 0);
LABEL_a9d8b4:
                        v45 = 1;
                        if (v13)
                            goto LABEL_a9d8f4;
                        goto LABEL_a9d8c0;
                    }
                }
                v43 = v12 + 9;
                len = _strlen(v10);
                if (_strncmp(v43, v10, len) || _strncmp(v43 + len, "-----\n", 6))
                {
                    sub_a368c8();
                    v50 = 899;
                    goto LABEL_a9d8a0;
                }
                else
                {
                    v45 = 0;
                    v46 = v33;
                    if (!v33)
                    {
                        v8 = v9;
                        v47 = v0;
                        v48 = arm64g_calculate_condition(3, v46, 0, 0);
                        if (!(v48 & 1))
                            goto LABEL_a9d8ee;
                        goto LABEL_a9d8ed;
                    }
                    else
                    {
                        v8 = v8;
                        v47 = v0;
                        v49 = arm64g_calculate_condition(3, v46, 0, 0);
                        if (v49 & 1)
                        {
LABEL_a9d8ed:
                            v9 = v47;
                            goto LABEL_a9d8f0;
                        }
                        else
                        {
LABEL_a9d8ee:
LABEL_a9d8f0:
                            if (!v13)
                            {
LABEL_a9d8c0:
                                sub_a6c2e4(v12, "crypto/pem/pem_lib.c", 932);
                            }
                            else
                            {
LABEL_a9d8f4:
                                sub_a6d4c0(v12, 0x100, "crypto/pem/pem_lib.c", 932);
                            }
                        }
                    }
                }
                if (v45 & 1)
                    goto LABEL_a9d548;
                sub_9d46fc(v9, 115, 0, &v3);
                v12 = *(int *)v3;
                v5 = v12;
                if (!v12)
                {
LABEL_a9d564:
                    v11 = 0;
                }
                else
                {
                    v51 = sub_a4aef0();
                    if (v51)
                    {
                        v52 = v9;
                        sub_a4b348();
                        v53 = v51;
                        if (!(sub_a4b358(v53, (long long)v3[8], &v5, (long long)v3[8], v12) >> 31 & 1) && !(sub_a4b87c(v53, (long long)v3[8] + v5, &v4) >> 31 & 1))
                        {
                            v5 += v4;
                            *(unsigned long long *)v3 = v5;
                            v54 = sub_9d46fc(v8, 3, 0, 0);
                            *(unsigned long long *)a2 = sub_a9db28(v54 + 1, a5, 1001);
                            v55 = sub_a9db28(v5, a5, 1002);
                            *a3 = v55;
                            v56 = *(long long *)a2;
                            v9 = v52;
                            if (v56 && v55 && (!v54 || !(v57 = sub_9d3d84(v8), v56 = *(long long *)a2, sub_9d3d84(v8) != v54)))
                            {
                                *(char *)(v56 + v54) = 0;
                                v58 = sub_9d3d84(v9, *a3, v5);
                                if (v58 == v5)
                                {
                                    *a4 = v58;
                                    *(unsigned long long *)a1 = v10;
                                    v12 = 1;
                                    v10 = 0;
                                    goto LABEL_a9db04;
                                }
                                else
                                {
                                    v56 = *(long long *)a2;
                                }
                            }
                            sub_a9db48(v56, a5, 0, 1017);
                            *(unsigned long long *)a2 = 0;
                            sub_a9db48(*a3, a5, 0, 1019);
                            v12 = 0;
                            *a3 = 0;
LABEL_a9db04:
                            v11 = v53;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/pem/pem_lib.c", 994, "PEM_read_bio_ex");
                            sub_a36abc(9, 100, 0);
                            v12 = 0;
                            v11 = v53;
                            v9 = v52;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pem_lib.c", 983, "PEM_read_bio_ex");
                        sub_a36abc(9, 0x80006, 0);
LABEL_a9d548:
                        v11 = 0;
                        v12 = 0;
                    }
                }
            }
            else
            {
                v11 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/pem/pem_lib.c", 965, "PEM_read_bio_ex");
            sub_a36abc(9, 0x80020, 0);
            v10 = 0;
            goto LABEL_a9d548;
        }
    }
    sub_a4af04(v11);
    if (!v13)
        goto LABEL_a9d5e4;
    goto LABEL_a9d570;
}

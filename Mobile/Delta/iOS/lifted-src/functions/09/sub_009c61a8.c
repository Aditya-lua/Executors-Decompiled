/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c61a8..0x9c6a80 (2264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_9c7260;
extern unsigned int g_c7c2eb;
extern unsigned int g_fffffffffffffffc;

unsigned int sub_9c61a8(unsigned long a0, unsigned int a1, unsigned int a2, unsigned int *a3)
{
    unsigned int v21;  // w8
    unsigned long v22;  // x20
    unsigned int index;  // x24
    unsigned int v32;  // x0
    unsigned int v33;  // x0
    unsigned int v34;  // x19
    long long v35;  // x22
    long long v36;  // x23
    unsigned int idx;  // x19
    unsigned int v38;  // w8
    long long v39;  // x22
    long long v40;  // x1
    unsigned int v23;  // x22
    unsigned int v41;  // x0
    unsigned int v42;  // x8
    unsigned int v43;  // x8
    unsigned int v44;  // x0
    unsigned int v45;  // x0
    unsigned long long v46;  // 4118
    unsigned int v47;  // w19
    unsigned long long v48;  // 4123
    unsigned long long v49;  // x0
    unsigned int v50;  // w0
    unsigned int v24;  // x21
    unsigned long long v51;  // 4112
    unsigned int v52;  // w22
    unsigned int v53;  // w19
    void* iter;  // x20
    long long v55;  // x1
    unsigned long long v56;  // 4112
    unsigned int v57;  // x20
    unsigned int v58;  // x19
    unsigned long v59;  // x20
    unsigned int v60;  // w23
    unsigned int v25;  // x25
    unsigned int *v61;  // x24
    unsigned int v62;  // w3
    unsigned long v63;  // cc_dep1
    unsigned long long v64;  // 4118
    unsigned int v65;  // w8
    unsigned long long v66;  // 4112
    unsigned long long v67;  // 4109
    unsigned long long v68;  // 4112
    unsigned long long v69;  // 4109
    unsigned int v26;  // x0
    long long v27;  // x26
    long long v28;  // x0
    unsigned long long v29;  // x0
    unsigned int v30;  // x0
    unsigned long long v0;  // [bp-0x2b0]
    unsigned long long v1;  // [bp-0x2a8]
    char v2;  // [bp-0x2a0]
    char v3;  // [bp-0x29c]
    unsigned int v4;  // [bp-0x298]
    unsigned long v5;  // [bp-0x290]
    long long ptr;  // [bp-0x288]
    long long v7;  // [bp-0x288]
    unsigned int v8;  // [bp-0x280]
    unsigned long long v9;  // [bp-0x278]
    unsigned int v10;  // [bp-0x270]
    unsigned int v11;  // [bp-0x26c]
    long long v12;  // [bp-0x268]
    char v13;  // [bp-0x260]
    unsigned int v15;  // [bp-0x80]
    unsigned long long v16;  // [bp-0x78], Other Possible Types: unsigned int
    unsigned int v17;  // [bp-0x70]
    unsigned long long v18;  // [bp-0x68]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v8 = 0;
    v4 = 0;
    v9 = (char *)&g_fffffffffffffffc + 3;
    v11 = 1;
    v15 = 0;
    if (sub_9f5c88())
    {
        v21 = 194;
    }
    else
    {
        v22 = v10;
        if (((unsigned int)v22 >> 1 & 0x7fffffff) != 8)
        {
            v34 = v12;
            v33 = sub_9cf1f0();
            if (!v33)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/asn1_gen.c", 592, "asn1_str2type");
                sub_a36abc(13, 0x8000d, 0);
                goto LABEL_9c6828;
            }
            if (!v34)
                v34 = (unsigned int)&g_c7c2eb;
            v35 = 196;
            v36 = 735;
            idx = v33;
            if ((int)v22 > 4)
            {
                if (30 >= (unsigned int)v22)
                {
                    v38 = 1 << ((char)v22 & 31);
                    if (v38 & 0x5c5c1000)
                    {
                        if (v11 != 1)
                        {
                            if (v11 == 2)
                            {
                                v39 = 0x1000;
                                goto LABEL_9c6494;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/asn1/asn1_gen.c", 683, "asn1_str2type");
                                v40 = 177;
                                goto LABEL_9c6818;
                            }
                            goto LABEL_9c6818;
                        }
                        v39 = 4097;
LABEL_9c6494:
                        v33 = idx;
                        if ((int)sub_9c214c(idx + 8, v34, 0xffffffff, v39, sub_9cacc4(v22)) >= 1)
                            goto LABEL_9c64c4;
                        v35 = 524301;
                        v36 = 690;
                        goto LABEL_9c6500;
                    }
                    else
                    {
                        if (!(v38 & 0x1800000))
                        {
                            if ((unsigned int)v22 == 10)
                                goto LABEL_9c65f0;
                            goto LABEL_9c6620;
                        }
                        if (v11 != 1)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/asn1_gen.c", 650, "asn1_str2type");
                            v40 = 193;
                            goto LABEL_9c6818;
                        }
                        v35 = 524301;
                        v41 = sub_9c7910();
                        *(unsigned long long *)(idx + 8) = v41;
                        if (v41)
                        {
                            if (sub_9c7770())
                            {
                                *(unsigned int *)(*(long long *)(idx + 8) + 4) = v22;
                                v33 = idx;
                                if (sub_9c5024(*(long long *)(idx + 8)))
                                    goto LABEL_9c64c4;
                                v35 = 184;
                                v36 = 663;
                                goto LABEL_9c6500;
                            }
                            else
                            {
                                v36 = 658;
                                goto LABEL_9c6500;
                            }
                        }
                        else
                        {
                            v36 = 654;
                            goto LABEL_9c6500;
                        }
                    }
                }
                else
                {
LABEL_9c6620:
                    if ((unsigned int)v22 != 6)
                    {
                        if ((unsigned int)v22 == 5)
                        {
                            if (*(char *)v34)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/asn1/asn1_gen.c", 603, "asn1_str2type");
                                v40 = 182;
                                goto LABEL_9c6818;
                            }
                            goto LABEL_9c64c4;
                        }
                    }
                    else
                    {
                        if (v11 != 1)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/asn1_gen.c", 638, "asn1_str2type");
                            v40 = 191;
                            goto LABEL_9c6818;
                        }
                        v42 = sub_a997a4(v34, 0);
                        v33 = idx;
                        *(unsigned long long *)(idx + 8) = v42;
                        if (v42)
                            goto LABEL_9c64c4;
                        v35 = 183;
                        v36 = 642;
                        goto LABEL_9c6500;
                    }
                }
            }
            if ((unsigned int)v22 - 3 >= 2)
            {
                if ((unsigned int)v22 != 1)
                {
                    if ((unsigned int)v22 == 2)
                    {
LABEL_9c65f0:
                        if (v11 != 1)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/asn1_gen.c", 625, "asn1_str2type");
                            v40 = 185;
                            goto LABEL_9c6818;
                        }
                        v43 = sub_aef470(0, v34);
                        v33 = idx;
                        *(unsigned long long *)(idx + 8) = v43;
                        if (v43)
                            goto LABEL_9c64c4;
                        v35 = 180;
                        v36 = 631;
                        goto LABEL_9c6500;
                    }
                }
                else
                {
                    if (v11 != 1)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/asn1_gen.c", 610, "asn1_str2type");
                        v40 = 190;
                        goto LABEL_9c6818;
                    }
                    v16 = 0;
                    v17 = 0;
                    v18 = v34;
                    v33 = idx;
                    if (sub_aef6fc(&v16, idx + 8))
                        goto LABEL_9c64c4;
                    v35 = 176;
                    v36 = 617;
                    goto LABEL_9c6500;
                }
            }
            v44 = sub_9c7910();
            *(unsigned long long *)(idx + 8) = v44;
            if (!v44)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/asn1_gen.c", 699, "asn1_str2type");
                v40 = 524301;
                goto LABEL_9c6818;
            }
            switch (v11)
            {
            case 1:
                v33 = idx;
                if (sub_9c7770(v44, v34, 0xffffffff))
                {
LABEL_9c6724:
                    if ((unsigned int)v22 == 3)
                    {
                        sub_9c76f4(*(long long *)(v33 + 8), 0);
                        v33 = idx;
                    }
LABEL_9c64c4:
                    *(unsigned int *)v33 = v22;
                    break;
                }
                else
                {
                    v35 = 524301;
                    v36 = 713;
                    goto LABEL_9c6500;
                }
                goto LABEL_9c6500;
            case 3:
                v45 = sub_a6df78(v34, &v16);
                if (v45)
                {
                    v33 = idx;
                    *(unsigned long long *)(*(long long *)(idx + 8) + 8) = v45;
                    *(unsigned int *)*(long long *)(idx + 8) = v16;
                    *(unsigned int *)(*(long long *)(idx + 8) + 4) = v22;
                    goto LABEL_9c6724;
                }
                else
                {
                    v35 = 178;
                    v36 = 705;
                    goto LABEL_9c6500;
                }
                goto LABEL_9c6500;
            default:
                if ((unsigned int)v22 == 3 && v11 == 4)
                {
                    v33 = idx;
                    if (sub_9f5c88(v34, 44, 1, &g_9c7260))
                        goto LABEL_9c64c4;
                    v35 = 188;
                    v36 = 719;
LABEL_9c6500:
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/asn1_gen.c", v36, "asn1_str2type");
                    sub_a36abc(13, v35, 0);
                    v0 = "string=";
                    v1 = v34;
                    sub_a364a0(2);
                    goto LABEL_9c6820;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/asn1_gen.c", 725, "asn1_str2type");
                    v40 = 175;
LABEL_9c6818:
                    sub_a36abc(13, v40, 0);
LABEL_9c6820:
                    sub_9cf1fc(idx);
LABEL_9c6828:
                    v33 = 0;
                    break;
                }
            }
            goto LABEL_9c682c;
        }
        else if (!a1)
        {
            v21 = 192;
        }
        else if ((int)a2 >= 50)
        {
            v21 = 181;
        }
        else
        {
            v23 = v12;
            v16 = 0;
            v24 = sub_ad61b4();
            if (v24)
            {
                if (v23)
                {
                    v23 = sub_ae4a14(a1, v23);
                    if (!v23)
                        goto LABEL_9c6788;
                    if ((int)sub_ad69e4(v23) >= 1)
                    {
                        v25 = 0;
                        do
                        {
                            v26 = sub_9c61a8(*(long long *)(sub_ad69f8(v23, v25) + 16), a1, a2 + 1, a3);
                            if (!v26)
                                goto LABEL_9c6788;
                            v27 = v26;
                            if (!sub_ad68a0(v24, v27))
                            {
                                sub_9cf1fc(v27);
                                goto LABEL_9c6788;
                            }
                        } while ((v25 += 1, (int)v25 < (int)sub_ad69e4(v23)));
                    }
                }
                v28 = v24;
                if ((unsigned int)v22 == 0x11)
                    v29 = sub_9cf268(v28, &v16);
                else
                    v29 = sub_9cf25c(v28, &v16);
                if (!(v29 >> 31 & 1) && !(v30 = sub_9cf1f0(), !v30))
                {
                    index = v30;
                    v32 = sub_9c79e8(v22);
                    *(unsigned long long *)(index + 8) = v32;
                    if (v32)
                    {
                        *(unsigned int *)index = v22;
                        *(unsigned long long *)(v32 + 8) = v16;
                        *(unsigned int *)*(long long *)(index + 8) = v29;
                        v16 = 0;
                    }
                }
                else
                {
LABEL_9c6788:
                    index = 0;
                }
            }
            else
            {
                index = 0;
                v23 = 0;
            }
            sub_a6c2e4(v16, "crypto/asn1/asn1_gen.c", 461);
            sub_ad6958(v24, sub_9cf1fc);
            sub_ae4a74(a1, v23);
            v33 = index;
LABEL_9c682c:
            if (!v33)
                return v33;
            v46 = arm64g_calculate_condition(0x11, (unsigned int)v9, 1, 0);
            if (!(v46 & 1) && !v15)
                return v33;
            v47 = sub_9cf1e4();
            sub_9cf1fc(v33);
            if (!v8)
                return 0;
            v16 = v8;
            v48 = arm64g_calculate_condition(1, (unsigned int)v9, 1, 0);
            if (!(v48 & 1))
            {
                v49 = sub_9c7328(&v16, &v4, &v3, &v2, v47);
                if (!(v49 >> 7 & 1))
                {
                    if (v49 & 1)
                        v4 = 0;
                    v50 = sub_9c7680(0);
                    v51 = arm64g_calculate_condition(1, v50, 1, 0);
                    if (v51 & 1)
                        goto LABEL_9c69c0;
                    v52 = v47 + v8 - v16;
LABEL_9c68e8:
                    if ((int)v15 >= 1)
                    {
                        v53 = 0;
                        iter = (char *)&v12 + v15 * 24;
                        do
                        {
                            v55 = *(int *)((char *)iter - 4) + v50;
                            *(long long *)iter = v55;
                            v50 = sub_9c7680(0, v55, *(int *)((char *)iter - 16));
                            v56 = arm64g_calculate_condition(1, v50, 1, 0);
                            if (v56 & 1)
                                goto LABEL_9c69c0;
                        } while ((iter -= 24, v53 += 1, (int)v53 < (int)v15));
                    }
                    v59 = v50;
                    v58 = sub_a6bf4c(v59, "crypto/asn1/asn1_gen.c", 205);
                    if (v58)
                    {
                        ptr = v58;
                        if ((int)v15 >= 1)
                        {
                            v60 = 0;
                            v61 = &v13 + 16;
                            do
                            {
                                sub_9c755c(&ptr, *(int *)((char *)v61 - 8), *v61, *(int *)((char *)v61 - 16), *(int *)((char *)v61 - 12));
                                if (*(int *)((char *)v61 - 4))
                                {
                                    v7 = ptr + 1;
                                    *(char *)ptr = 0;
                                    ptr = v7;
                                }
                            } while ((v60 += 1, v61 += 6, (int)v15 > (int)v60));
                        }
                        v62 = v9;
                        v63 = v62;
                        v64 = arm64g_calculate_condition(1, v62, 1, 0);
                        if (!(v64 & 1))
                        {
                            v65 = v62 & 0xfffffffe;
                            if (!*(unsigned int *)((void*)&v9 + 4))
                            {
                                v66 = arm64g_calculate_condition(1, v63, 1, 0);
                                v67 = arm64g_calculate_condition(3, (v66 & 1 ? v65 : 0), (v66 & 1 ? 16 : 0), 0);
                                if (!(v67 & 1))
                                    goto LABEL_9c69ee;
LABEL_9c69ed:
                            }
                            else
                            {
                                v68 = arm64g_calculate_condition(1, v63, 1, 0);
                                v69 = arm64g_calculate_condition(0, (v68 & 1 ? v65 : 0), (v68 & 1 ? 16 : 0), 0);
                                if (v69 & 1)
                                    goto LABEL_9c69ed;
LABEL_9c69ee:
                            }
                            sub_9c755c();
                        }
                        _memcpy(ptr, v16, v52);
                        v5 = v58;
                        v57 = sub_9cf1d8(0, &v5, v59);
                    }
                    else
                    {
                        v57 = 0;
                    }
                }
                else
                {
LABEL_9c69c0:
                    v57 = 0;
                    v58 = 0;
                }
            }
            else
            {
                v50 = v47;
                v52 = v47;
                goto LABEL_9c68e8;
            }
            sub_a6c2e4(v8, "crypto/asn1/asn1_gen.c", 243);
            sub_a6c2e4(v58, "crypto/asn1/asn1_gen.c", 244);
            return v57;
        }
    }
    *a3 = v21;
    return 0;
}

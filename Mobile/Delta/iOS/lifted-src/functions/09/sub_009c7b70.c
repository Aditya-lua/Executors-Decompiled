/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7b70..0x9c8738 (3016 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c7b70_0 {
    char field_0;
} st_9c7b70_0;

typedef struct st_9c7b70_1 {
    struct st_9c7b70_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_9c7b70_1;

extern st_9c7b70_1 g_e8a140;
extern char g_10002b0;

unsigned long long sub_9c7b70(unsigned long long a0, st_9c7b70_0 **a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6)
{
    unsigned long long v22;  // x25
    unsigned long long v23;  // x0
    unsigned long long v32;  // x8
    unsigned long v33;  // x23
    unsigned long v34;  // x21
    long long v35;  // x2
    unsigned long long v36;  // x10
    unsigned long long v37;  // w24
    unsigned long long v38;  // x27
    unsigned long long v39;  // x20
    unsigned long long v40;  // x19
    unsigned long long v41;  // x21
    unsigned long long v24;  // x26
    char *v42;  // x21
    long long v43;  // x2
    unsigned long long v44;  // w8
    unsigned long long v45;  // x20
    unsigned long long v46;  // w23
    unsigned long long v47;  // x27
    unsigned long long v48;  // x8
    unsigned long long v49;  // x19
    unsigned long long idx;  // x26
    unsigned long long v51;  // x8
    st_9c7b70_0 **v25;  // x24
    unsigned long v52;  // x9
    unsigned long long v53;  // x8
    unsigned long v54;  // x9
    unsigned long long v55;  // w10
    unsigned long v56;  // cc_dep1
    unsigned int v57;  // w10
    unsigned long long v58;  // 4112
    unsigned long long v59;  // 4102
    unsigned long long v60;  // 4112
    unsigned long long v61;  // 4102
    unsigned long long v26;  // x27
    unsigned long long v62;  // x0
    unsigned long long v63;  // 4118
    unsigned long long v64;  // x19
    unsigned long long v65;  // w0
    unsigned long v66;  // cc_dep1
    unsigned long long v67;  // 4112
    unsigned long long v68;  // 4112
    unsigned long long v69;  // 4112
    unsigned long long v70;  // 4112
    unsigned long long v71;  // w0
    unsigned long long v27;  // w8
    unsigned long long v72;  // x28
    unsigned long long v73;  // x8
    unsigned long long v74;  // x19
    unsigned long long v75;  // x19
    char *v76;  // x21
    unsigned long v77;  // x26
    unsigned long long v78;  // x19
    char *v79;  // x22
    char *v80;  // x21
    char *v81;  // x9
    char *v28;  // x19
    unsigned long long v29;  // x0
    unsigned long long v30;  // x28
    unsigned long v31;  // x12
    char *v0;  // [bp-0x1a0], Other Possible Types: unsigned long long, unsigned long
    unsigned long long v1;  // [bp-0x198]
    unsigned long v2;  // [bp-0x190]
    unsigned long long v3;  // [bp-0x188]
    unsigned long long v4;  // [bp-0x180]
    unsigned long long v5;  // [bp-0x170]
    char *v6;  // [bp-0x168]
    unsigned long v7;  // [bp-0x160]
    char *v8;  // [bp-0x140]
    unsigned long long v9;  // [bp-0x130]
    st_9c7b70_0 **v10;  // [bp-0x128]
    unsigned long v11;  // [bp-0x120]
    unsigned long long v12;  // [bp-0x118]
    unsigned long long v13;  // [bp-0x110]
    unsigned long long v14;  // [bp-0x10c]
    unsigned long long v15;  // [bp-0x108]
    char *v16;  // [bp-0x100], Other Possible Types: unsigned long
    char *iter;  // [bp-0xf8]
    char v18;  // [bp-0xf0]
    unsigned long v19;  // [bp-0x70]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v22 = a0;
    v19 = *(long long *)&g_10002b0;
    v12 = 0;
    if ((int)a4 >= 129)
    {
        sub_9d4888(v22, "BAD RECURSION DEPTH\n");
        v23 = 0;
    }
    else
    {
        v24 = a2;
        v25 = a1;
        iter = *a1;
        if ((long long)a2 >= 1)
        {
            v26 = a4;
            v6 = &(*a1)[v24];
            v10 = v25;
            v11 = (int)a3;
            if (!a5)
                v27 = 0;
            else
                v27 = (unsigned int)a4;
            v7 = v27;
            v5 = (int)a6;
            v9 = v26;
            do
            {
                v28 = iter;
                v29 = sub_9c7328(&iter, &v15, &v14, &v13, v24);
                if (v29 >> 7 & 1)
                {
                    sub_9d4888(v22, "Error in encoding\n");
                    goto LABEL_9c8680;
                }
                v30 = v29;
                v31 = (unsigned int)((unsigned int)iter - v28);
                v32 = v28 - *v25 + v11;
                v33 = v13;
                v34 = v14;
                if ((unsigned int)v29 == 33)
                {
                    v2 = v31;
                    v3 = "cons: ";
                    v0 = v32;
                    v1 = v26;
                    v35 = "%5ld:d=%-2d hl=%ld l=inf  %s";
                }
                else
                {
                    v36 = "cons: ";
                    if (!((unsigned int)v30 & 32))
                        v36 = "prim: ";
                    v2 = v31;
                    v3 = v15;
                    v0 = v32;
                    v1 = a4;
                    v4 = v36;
                    v35 = "%5ld:d=%-2d hl=%ld l=%4ld %s";
                }
                if ((int)sub_9d5b44(&v18, 128, v35) < 1)
                {
                    v38 = 0;
LABEL_9c8648:
                    sub_9d3c28(v38);
                    goto LABEL_9c8680;
                }
                v8 = v28;
                if (v22)
                {
                    if (sub_9d46fc(v22, 79, 0, &v18) > 0)
                    {
                        v37 = 0;
                        v38 = 0;
                        v39 = v22;
                    }
                    else
                    {
                        v38 = sub_9d3c1c(sub_9d2adc());
                        if (!v38 || (v39 = sub_9d4ec8(v38, v22), !v39))
                            goto LABEL_9c8648;
                        v37 = 1;
                    }
                    v40 = sub_9d46fc(v39, 81, 0, 0);
                    if (sub_9d46fc(v39, 79, 0, &v18) < 1 || sub_9d46fc(v39, 80, v7, 0) < 1)
                    {
                        v41 = 1;
                        if ((long long)v40 < 0)
                            goto LABEL_9c7f30;
                        goto LABEL_9c7f1c;
                    }
                }
                else
                {
                    v39 = 0;
                    v37 = 0;
                    v38 = 0;
                    v40 = 0xffffffffffffffff;
                }
                if (!~((unsigned int)v33 >> 6 & 3))
                {
                    v0 = v34;
                    v42 = &v18;
                    v43 = "priv [ %d ] ";
                    goto LABEL_9c7ef8;
                }
                if (v33 >> 7 & 1)
                {
                    v0 = v34;
                    v42 = &v18;
                    v43 = "cont [ %d ]";
                    goto LABEL_9c7ef8;
                }
                else if (v33 >> 6 & 1)
                {
                    v0 = v34;
                    v42 = &v18;
                    v43 = "appl [ %d ]";
LABEL_9c7ef8:
                    sub_9d5b44(&v18, 128, v43);
                    goto LABEL_9c7efc;
                }
                else if ((int)v34 >= 31)
                {
                    v0 = v34;
                    v42 = &v18;
                    v43 = "<ASN1 %d>";
                    goto LABEL_9c7ef8;
                }
                else
                {
                    if (((unsigned int)v34 & 0xfffffff7) == 258)
                        v44 = (unsigned int)v34 & 10;
                    else
                        v44 = (unsigned int)v34;
                    v42 = "(unknown)";
                    if (30 >= v44)
                        v42 = (&g_e8a140.field_0)[v44];
LABEL_9c7efc:
                    v0 = v42;
                    v41 = 1 > (int)sub_9d524c(v39, "%-18s");
                    if ((long long)v40 < 0)
                        goto LABEL_9c7f30;
LABEL_9c7f1c:
                    sub_9d46fc(v39, 80, v40, 0);
LABEL_9c7f30:
                    if (v37)
                        sub_9d4f1c(v39);
                    sub_9d3c28(v38);
                    if (v41 & 1)
                    {
                        v23 = 0;
                        idx = 0;
                        v72 = 0;
                        v47 = 0;
                        v25 = v10;
                        goto LABEL_9c8690;
                    }
                    v45 = v24 - v31;
                    v25 = v10;
                    if (v30 >> 5 & 1)
                    {
                        v76 = iter;
                        v77 = a5;
                        v26 = v9;
                        if ((int)sub_9d3fec(v22, "\n", 1) < 1)
                            goto LABEL_9c8680;
                        v78 = v15;
                        if ((long long)v45 < (long long)v78)
                        {
                            v0 = v45;
                            sub_9d524c(v22, "length is greater than %ld\n");
LABEL_9c8680:
                            v23 = 0;
LABEL_9c8684:
                            idx = 0;
                            goto LABEL_9c8688;
                        }
                        v79 = iter;
                        if ((unsigned int)v30 != 33 || v78)
                        {
                            v80 = &v76[v15];
                            if (v80 > v79)
                            {
                                do
                                {
                                    if (!(unsigned int)sub_9c7b70(v22, &iter, v78, &v79[-1 * *(int *)v25 + a3], (unsigned int)v26 + 1, v77, a6))
                                        goto LABEL_9c8680;
                                } while ((v81 = iter, v78 = &v79[v78] - v81, v79 = v81, v79 < v80));
                            }
                            goto LABEL_9c7c60;
                        }
                        while (1)
                        {
                            v23 = sub_9c7b70(v22, &iter, v6 - v79, &v79[-1 * *(int *)v25 + a3], (unsigned int)v26 + 1, v77, a6);
                            if (!(unsigned int)v23)
                                goto LABEL_9c8684;
                            if ((unsigned int)v23 != 2)
                            {
                                v79 = iter;
                                if (v79 >= v6)
                                    goto LABEL_9c804c;
                            }
                            else
                            {
                                v79 = iter;
LABEL_9c804c:
                                v15 = v79 - v76;
                                goto LABEL_9c7c60;
                            }
                        }
                    }
                    v46 = (unsigned int)a6;
                    v26 = v9;
                    if (v13)
                    {
                        iter = &iter[v15];
                        if ((int)sub_9d3fec(v22, "\n", 1) < 1)
                            goto LABEL_9c8680;
                        goto LABEL_9c7c60;
                    }
                    if (v14 <= 5)
                    {
                        if (v14 == 1)
                        {
                            v31 = v31;
                            if (v15 == 1)
                            {
                                v23 = 0;
                            }
                            else
                            {
                                if ((int)sub_9d4888(v22, ":BAD BOOLEAN") < 1)
                                    goto LABEL_9c8680;
                                if ((long long)v15 < 1)
                                    goto LABEL_9c8504;
                                v23 = 1;
                            }
                            v0 = *iter;
                            sub_9d524c(v22, ":%u");
                            goto LABEL_9c84fc;
                        }
                        if (v14 == 2)
                        {
                            v16 = v8;
                            v72 = sub_9cf104(0, &v16, v15 + v31);
                            if (v72)
                            {
                                if ((int)sub_9d3fec(v22, ":", 1) >= 1 && (*(int *)(v72 + 4) != 258 || (int)sub_9d3fec(v22, "-", 1) >= 1))
                                {
                                    v73 = *(int *)v72;
                                    if ((int)v73 >= 1)
                                    {
                                        v74 = 0;
                                        do
                                        {
                                            v0 = *(char *)(*(long long *)(v72 + 8) + v74);
                                            if ((int)sub_9d524c(v22, "%02X") < 1)
                                                goto LABEL_9c8708;
                                        } while ((v74 += 1, v73 = *(int *)v72, (long long)v74 < (long long)v73));
                                    }
                                    if ((unsigned int)v73)
                                    {
                                        v23 = 0;
                                        goto LABEL_9c84c4;
                                    }
                                    v23 = 0;
                                    if ((int)sub_9d3fec(v22, "00", 2) >= 1)
                                        goto LABEL_9c84c4;
                                    idx = 0;
                                }
                                else
                                {
LABEL_9c8708:
                                    v23 = 0;
                                    idx = 0;
                                }
LABEL_9c868c:
                                v47 = 0;
                                goto LABEL_9c8690;
                            }
                            else
                            {
                                if ((int)sub_9d4888(v22, ":BAD INTEGER") < 1)
                                    goto LABEL_9c8680;
                                v23 = 1;
LABEL_9c84c4:
                                sub_9cf124(v72);
                                goto LABEL_9c84fc;
                            }
                        }
                        else if (v14 == 4)
                        {
                            v16 = v8;
                            idx = sub_9cf0d4(0, &v16, v15 + v31);
                            if (idx && !(v51 = *(int *)idx, (int)v51 < 1))
                            {
                                v52 = *(long long *)(idx + 8);
                                v16 = *(long long *)(idx + 8);
                                while (1)
                                {
                                    v53 = v51;
                                    v54 = v52 + 1;
                                    v55 = *(char *)v52;
                                    v56 = v55 & 0xff;
                                    if (v55 <= 31)
                                    {
                                        v57 = 1 << ((char)v55 & 31) & 0x2600;
                                        if (v55 <= 13)
                                        {
                                            v58 = arm64g_calculate_condition(147, v56, 31, 0);
                                            v59 = arm64g_calculate_condition(3, (v58 & 1 ? v57 : 0x40000000), 0, 0);
                                            if (v59 & 1)
                                                break;
                                            goto LABEL_9c80d0;
                                        }
                                        else
                                        {
                                            v60 = arm64g_calculate_condition(147, v56, 31, 0);
                                            v61 = arm64g_calculate_condition(0, (v60 & 1 ? v57 : 0x40000000), 0, 0);
                                            if (v61 & 1)
                                                break;
                                            goto LABEL_9c80d0;
                                        }
                                    }
                                    if (v55 > 126)
                                        break;
LABEL_9c80d0:
                                    v51 = v53 - 1;
                                    v52 = v54;
                                    if (v53 == 1)
                                    {
                                        if ((int)sub_9d3fec(v22, ":", 1) < 1 || (int)sub_9d3fec(v22, v16, *(int *)idx) < 1)
                                            goto LABEL_9c8724;
                                        goto LABEL_9c8498;
                                    }
                                }
                                v62 = v22;
                                if (v46)
                                {
                                    if ((int)sub_9d3fec(v62, "\n", 1) < 1)
                                        goto LABEL_9c8724;
                                    v63 = arm64g_calculate_condition(1, v46, 1, 0);
                                    if ((int)sub_9d395c() < 1)
                                        goto LABEL_9c8724;
                                    sub_9cf0f4(idx);
                                    goto LABEL_9c8594;
                                }
                                else if ((int)sub_9d3fec(v62, "[HEX DUMP]:", 11) < 1)
                                {
LABEL_9c8724:
                                    v23 = 0;
LABEL_9c8688:
                                    v72 = 0;
                                    goto LABEL_9c868c;
                                }
                                else if (*(int *)idx >= 1)
                                {
                                    v64 = 0;
                                    do
                                    {
                                        v0 = *(char *)(v16 + v64);
                                        if ((int)sub_9d524c(v22, "%02X") < 1)
                                            goto LABEL_9c8724;
                                    } while ((v64 += 1, (long long)v64 < *(int *)idx));
                                }
                            }
LABEL_9c8498:
                            sub_9cf0f4(idx);
                            goto LABEL_9c8578;
                        }
                        goto LABEL_9c82b0;
                    }
                    if (30 >= v14)
                    {
                        if (1 << ((char)v14 & 31) & 0x5dc1000)
                        {
                            if ((int)sub_9d3fec(v22, ":", 1) < 1 || (long long)v15 >= 1 && sub_9d3fec(v22, iter) != (unsigned int)v15)
                                goto LABEL_9c8680;
                            goto LABEL_9c8578;
                        }
                        switch (v14)
                        {
                        case 10:
                            v16 = v8;
                            v47 = sub_9cf134(0, &v16, v15 + v31);
                            if (v47)
                            {
                                if ((int)sub_9d3fec(v22, ":", 1) >= 1 && (*(int *)(v47 + 4) != 266 || (int)sub_9d3fec(v22, "-", 1) >= 1))
                                {
                                    v48 = *(int *)v47;
                                    if ((int)v48 >= 1)
                                    {
                                        v49 = 0;
                                        do
                                        {
                                            v0 = *(char *)(*(long long *)(v47 + 8) + v49);
                                            if ((int)sub_9d524c(v22, "%02X") < 1)
                                                goto LABEL_9c8714;
                                        } while ((v49 += 1, v48 = *(int *)v47, (long long)v49 < (long long)v48));
                                    }
                                    if ((unsigned int)v48)
                                    {
                                        v23 = 0;
                                        goto LABEL_9c84f0;
                                    }
                                    else
                                    {
                                        v23 = 0;
                                        if ((int)sub_9d3fec(v22, "00", 2) >= 1)
                                            goto LABEL_9c84f0;
                                    }
                                }
                                else
                                {
LABEL_9c8714:
                                }
                                v23 = 0;
                                idx = 0;
                                v72 = 0;
                                goto LABEL_9c8690;
                            }
                            else
                            {
                                if ((int)sub_9d4888(v22, ":BAD ENUMERATED") < 1)
                                    goto LABEL_9c8680;
                                v23 = 1;
LABEL_9c84f0:
                                sub_9cf0f4(v47);
                                v26 = v9;
LABEL_9c84fc:
                                if (!(unsigned int)v23)
                                    goto LABEL_9c8578;
LABEL_9c8504:
                                if ((int)sub_9d4888(v22, ":[") < 1)
                                    goto LABEL_9c8680;
                                if ((long long)v15 >= 1)
                                {
                                    v75 = 0;
                                    do
                                    {
                                        v0 = v8[v75 + v31];
                                        if ((int)sub_9d524c(v22, "%02X") < 1)
                                            goto LABEL_9c8680;
                                    } while ((v75 += 1, (long long)v75 < (long long)v15));
                                }
                                if ((int)sub_9d4888(v22, "]") < 1)
                                    goto LABEL_9c8680;
                                goto LABEL_9c8578;
                            }
                        case 30:
LABEL_9c8578:
                            v71 = (unsigned int)sub_9d3fec(v22, "\n", 1);
LABEL_9c858c:
                            if (v71 < 1)
                                goto LABEL_9c8680;
LABEL_9c8594:
                            iter = &iter[v15];
                            if (!v14 && !v13)
                            {
                                idx = 0;
                                v72 = 0;
                                v47 = 0;
                                v23 = 2;
                                goto LABEL_9c8690;
                            }
                            break;
                        default:
                            goto LABEL_9c818c;
                        }
                    }
                    else
                    {
LABEL_9c818c:
                        if (v14 == 6)
                        {
                            v16 = v8;
                            if (sub_9c321c(&v12, &v16, v15 + v31))
                            {
                                if ((int)sub_9d3fec(v22, ":", 1) < 1)
                                    goto LABEL_9c8680;
                                sub_9c3060(v22, v12);
                                goto LABEL_9c8578;
                            }
                            else
                            {
                                if (1 > (int)sub_9d4888(v22, ":BAD OBJECT"))
                                    goto LABEL_9c8680;
                                goto LABEL_9c8504;
                            }
                            goto LABEL_9c8504;
                        }
LABEL_9c82b0:
                        if (!v46 || (long long)v15 < 1)
                            goto LABEL_9c8578;
                        v65 = (unsigned int)sub_9d3fec(v22, "\n", 1);
                        v66 = v65;
                        if (v65 < 1)
                            goto LABEL_9c8680;
                        if ((long long)v5 <= (long long)v15)
                        {
                            v67 = arm64g_calculate_condition(163, v66, 1, 0);
                            v68 = arm64g_calculate_condition(1, (v67 & 1 ? v46 : 0x40000000), v67 & 1, 0);
                            if (!(v68 & 1))
                                goto LABEL_9c82f2;
                        }
                        else
                        {
                            v69 = arm64g_calculate_condition(163, v66, 1, 0);
                            v70 = arm64g_calculate_condition(0, (v69 & 1 ? v46 : 0x40000000), v69 & 1, 0);
                            if (!(v70 & 1))
                            {
LABEL_9c82f2:
LABEL_9c82f4:
                                v71 = (unsigned int)sub_9d395c();
                                goto LABEL_9c858c;
                            }
                        }
                        goto LABEL_9c82f4;
                    }
                }
LABEL_9c7c60:
            } while ((v24 = v45 - v15, (long long)v45 > (long long)v15));
        }
        idx = 0;
        v72 = 0;
        v47 = 0;
        v23 = 1;
LABEL_9c8690:
        sub_9c3580(v12);
        sub_9cf0f4(idx);
        sub_9cf124(v72);
        sub_9cf0f4(v47);
        *v25 = iter;
    }
    if (*(long long *)&g_10002b0 == v19)
        return v23;
    ___stack_chk_fail();
}

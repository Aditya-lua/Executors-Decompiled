/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9f8e8..0xa9fe80 (1432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a9f8e8(unsigned long long a0, long long a1, unsigned long long a2)
{
    unsigned int v10;  // w0
    long long v11;  // x24
    unsigned int v20;  // w22
    int v21;  // w25
    unsigned int v22;  // w0
    unsigned long long v23;  // 4153
    unsigned int v24;  // w0
    unsigned long long v25;  // 4153
    unsigned int v26;  // w0
    unsigned long long v27;  // 4153
    unsigned int v28;  // w0
    unsigned long long v29;  // 4153
    unsigned long long v12;  // w23
    unsigned int v30;  // w0
    unsigned long long v31;  // 4153
    long long v32;  // x2
    long long v33;  // x1
    unsigned int v34;  // w8
    long long v35;  // x0
    unsigned int v36;  // w0
    unsigned long long v37;  // x24
    unsigned long long idx;  // x24
    unsigned long long v39;  // x0
    int v13;  // w0
    char v40;  // x8
    unsigned long v41;  // x23
    long long v42;  // x21
    long long v43;  // x20
    unsigned int v44;  // w0
    unsigned long v45;  // x23
    long long v46;  // x23
    unsigned long v47;  // x25
    long long v48;  // x24
    unsigned long long v49;  // x25
    unsigned long long v14;  // x27
    long long v50;  // x21
    long long v51;  // x21
    long long v52;  // x21
    long long v53;  // x21
    long long v54;  // x0
    unsigned int v55;  // w0
    unsigned long long v56;  // 4135
    unsigned long v57;  // x20
    long long v58;  // x21
    unsigned long long v59;  // x20
    char v15;  // x28
    long long v60;  // x23
    long long v61;  // x23
    long long v62;  // x21
    unsigned long long v63;  // x0
    long long v64;  // x1
    unsigned long long v65;  // x2
    unsigned int v16;  // w25
    unsigned long long v17;  // x22
    unsigned int v18;  // w0
    unsigned long long v19;  // 4153
    long long v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x98]
    unsigned long v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x88]
    unsigned long long v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x78]
    char v6;  // [bp-0x70], Other Possible Types: unsigned long long
    char v7;  // [bp-0x68], Other Possible Types: unsigned long long
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = sub_a5b3bc(a1, "RSA");
    if (v10)
    {
        v11 = sub_a59af4(a1);
        sub_ab1ac4(v11, 0, &v7, 0);
        if ((int)sub_9e46a8(v7) > 32)
        {
LABEL_a9f958:
            sub_a368c8();
            v32 = "check_bitlen_rsa";
            v33 = 672;
            goto LABEL_a9fe1c;
        }
        else
        {
            v12 = (unsigned int)sub_aafbc4(v11);
            v13 = sub_aafbcc(v11);
            if (a2)
            {
                if (v12)
                {
                    v14 = 0;
                    v15 = 164;
                    v16 = 826364754;
                    v17 = (v12 + 7 >> 3) + 20;
                    if (!a0)
                        return (v12 + 7 >> 3) + 20;
                    goto LABEL_a9fa74;
                }
            }
            else
            {
                sub_ab1ac4(v11, 0, 0, &v6);
                v18 = sub_9e46a8(v6);
                v19 = arm64g_calculate_condition(177, v18, 7, 0);
                if (v13 < (int)((int)((v19 & 1 ? v18 + 14 : v18 + 7)) >> 3))
                    goto LABEL_a9f958;
                v20 = v12 + 15;
                v21 = (int)(v20) >> 4;
                sub_ab1aec(v11, &v5, &v4);
                sub_ab1b90(v11, &v2, &v1, &v3);
                v22 = sub_9e46a8(v3);
                v23 = arm64g_calculate_condition(177, v22, 7, 0);
                if (v21 < (int)((int)((v23 & 1 ? v22 + 14 : v22 + 7)) >> 3) || (v24 = sub_9e46a8(v5), v25 = arm64g_calculate_condition(177, v24, 7, 0), v21 < (int)((int)((v25 & 1 ? v24 + 14 : v24 + 7)) >> 3) || (v26 = sub_9e46a8(v4), v27 = arm64g_calculate_condition(177, v26, 7, 0), v21 < (int)((int)((v27 & 1 ? v26 + 14 : v26 + 7)) >> 3) || (v28 = sub_9e46a8(v2), v29 = arm64g_calculate_condition(177, v28, 7, 0), v21 < (int)((int)((v29 & 1 ? v28 + 14 : v28 + 7)) >> 3) || (v30 = sub_9e46a8(v1), v31 = arm64g_calculate_condition(177, v30, 7, 0), v21 < (int)((int)((v31 & 1 ? v30 + 14 : v30 + 7)) >> 3))))))
                    goto LABEL_a9f958;
                if (v12)
                {
                    v34 = (v20 >> 4) * 5 + (v12 + 7 >> 3) * 2 + 4;
                    v15 = 164;
                    v16 = 843141970;
                    goto LABEL_a9fe70;
                }
            }
        }
    }
    else if (sub_a5b3bc(a1, "DSA"))
    {
        v35 = sub_a5ace4(a1);
        v6 = 0;
        v7 = 0;
        v4 = 0;
        v5 = 0;
        v3 = 0;
        sub_9ffcc8(v35, &v7, &v6, &v5);
        sub_a02134(v35, &v4, &v3);
        v36 = sub_9e46a8(v7);
        if (v36 & 7 || (v12 = v36, sub_9e46a8(v6) != 160 || v12 < (int)sub_9e46a8(v5)))
        {
LABEL_a9fe04:
            sub_a368c8();
            v32 = "check_bitlen_dsa";
            v33 = 723;
LABEL_a9fe1c:
            sub_a369bc("crypto/pem/pvkfmt.c", v33, v32);
            sub_a36abc(9, 126, 0);
        }
        else if (a2)
        {
            if (v12 < (int)sub_9e46a8(v4))
                goto LABEL_a9fe04;
            if (v12)
            {
                v14 = 0;
                v15 = 0x22;
                v16 = 827544388;
                v17 = (v12 >> 2) + (v12 >> 3) + 60;
                if (!a0)
                    return (v12 >> 2) + (v12 >> 3) + 60;
                goto LABEL_a9fa74;
            }
        }
        else
        {
            if ((int)sub_9e46a8(v3) >= 161)
                goto LABEL_a9fe04;
            if (v12)
            {
                v34 = (v12 >> 2) + 64;
                v15 = 0x22;
                v16 = 844321604;
LABEL_a9fe70:
                v14 = 1;
                v17 = v34 + 16;
                if (!a0)
                    return v34 + 16;
LABEL_a9fa74:
                v37 = *(long long *)a0;
                idx = v37;
                if (!idx)
                {
                    v39 = sub_a6bf4c((int)v17, "crypto/pem/pvkfmt.c", 592);
                    if (v39)
                    {
                        idx = v39;
                        *(unsigned long long *)a0 = v39;
                        goto LABEL_a9faa0;
                    }
                }
                else
                {
LABEL_a9faa0:
                    if (!(unsigned int)v14)
                        v40 = 6;
                    else
                        v40 = 7;
                    *(char *)idx = v40;
                    *(unsigned int *)(idx + 1) = 2;
                    *(char *)(idx + 5) = v15;
                    *(unsigned short *)(idx + 6) = 0;
                    *(char *)(idx + 8) = v16;
                    *(char *)(idx + 9) = 83;
                    *(char *)(idx + 10) = v16 >> 16;
                    *(char *)(idx + 11) = v16 >> 24;
                    *(char *)(idx + 12) = v12;
                    *(char *)(idx + 13) = v12 >> 8;
                    *(char *)(idx + 14) = v12 >> 16;
                    v41 = idx + 16;
                    *(char *)(idx + 15) = v12 >> 24;
                    if (v10)
                    {
                        v42 = sub_a59af4(a1);
                        v43 = sub_aafbcc(v42);
                        v44 = sub_aafbc4(v42);
                        sub_ab1ac4(v42, &v7, &v5, &v6);
                        sub_9e536c(v5, v41, 4);
                        v45 = idx + 20;
                        sub_9e536c(v7, v45, v43);
                        if ((unsigned int)v14)
                        {
                            v46 = v45 + (int)v43;
                            v47 = v44 + 15;
                            v48 = (int)((unsigned int)v47) >> 4;
                            sub_ab1aec(v42, &v4, &v3);
                            sub_ab1b90(v42, &v1, &v0, &v2);
                            sub_9e536c(v4, v46, v48);
                            v49 = (long long)(v47 * 0x100000000) >> 63 & 0xfffffffff0000000 | __ROL__(v47, 60) & 0xf00000000fffffff & 0xfffffff;
                            v50 = v46 + v49;
                            sub_9e536c(v3, v50, v48);
                            v51 = v50 + v49;
                            sub_9e536c(v1, v51, v48);
                            v52 = v51 + v49;
                            sub_9e536c(v0, v52, v48);
                            v53 = v52 + v49;
                            sub_9e536c(v2, v53, v48);
                            sub_9e536c(v6, v53 + v49, v43);
                        }
                    }
                    else
                    {
                        v54 = sub_a5ace4(a1);
                        v6 = 0;
                        v7 = 0;
                        v4 = 0;
                        v5 = 0;
                        v3 = 0;
                        sub_9ffcc8(v54, &v7, &v6, &v5);
                        sub_a02134(v54, &v4, &v3);
                        v55 = sub_9e46a8(v7);
                        v56 = arm64g_calculate_condition(177, v55, 7, 0);
                        v57 = (v56 & 1 ? v55 + 14 : v55 + 7);
                        v58 = (int)((unsigned int)v57) >> 3;
                        sub_9e536c(v7, v41, v58);
                        v59 = (long long)(v57 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v57, 61) & 0xe00000001fffffff & 0x1fffffff;
                        v60 = v41 + v59;
                        sub_9e536c(v6, v60, 20);
                        v61 = v60 + 20;
                        sub_9e536c(v5, v61, v58);
                        v62 = v61 + v59;
                        if (v14 & 1)
                        {
                            v63 = v3;
                            v59 = 20;
                            v64 = v62;
                            v65 = 20;
                        }
                        else
                        {
                            v63 = v4;
                            v64 = v62;
                            v65 = v59;
                        }
                        sub_9e536c(v63, v64, v65);
                        memset(v62 + v59, 0xff, 24);
                    }
                    if (!v37)
                        return v17;
                    *(long long *)a0 = *(long long *)a0 + (int)v17;
                    return v17;
                }
            }
        }
    }
    return 0xffffffff;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25ceb0..0x25e35c (5292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25ceb0_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    long long field_18;
} st_25ceb0_1;

typedef struct st_25ceb0_0 {
    void* field_0;
} st_25ceb0_0;

typedef struct st_25ceb0_2 {
    char field_0;
} st_25ceb0_2;

extern long long g_f11980;

int sub_25ceb0(unsigned int a0, st_25ceb0_0 **a1, unsigned int *a2, long long *a3)
{
    void* *v6;  // x20
    unsigned int v7;  // w8
    void* v16;  // x19
    uint128_t v106;  // q1
    uint128_t v107;  // q1
    uint128_t v108;  // q1
    uint128_t v109;  // q1
    uint128_t v110;  // q1
    uint128_t v111;  // q1
    uint128_t v112;  // q1
    uint128_t v113;  // q1
    unsigned long long v114;  // x8
    st_25ceb0_1 *v115;  // x0
    long long v17;  // x8
    unsigned int v116;  // w0
    long long v117;  // x8
    uint128_t v118;  // q1
    uint128_t v119;  // q1
    uint128_t v120;  // q1
    uint128_t v121;  // q1
    uint128_t v122;  // q1
    uint128_t v123;  // q1
    uint128_t v124;  // q1
    uint128_t v125;  // q1
    unsigned int v18;  // w0
    uint128_t v126;  // q1
    uint128_t v127;  // q1
    uint128_t v128;  // q1
    uint128_t v129;  // q1
    uint128_t v130;  // q1
    uint128_t v131;  // q1
    uint128_t v132;  // q1
    uint128_t v133;  // q1
    uint128_t v134;  // q1
    uint128_t v135;  // q1
    long long v19;  // x8
    uint128_t v136;  // q1
    uint128_t v137;  // q1
    uint128_t v138;  // q1
    unsigned int v139;  // w0
    unsigned int v20;  // w0
    long long v21;  // x8
    long long v22;  // x8
    unsigned int v23;  // w0
    long long v24;  // x8
    long long v25;  // x8
    long long v8;  // x9
    unsigned int v26;  // w0
    long long v27;  // x8
    unsigned int v28;  // w0
    long long v29;  // x8
    unsigned int v30;  // w0
    long long v31;  // x8
    long long v32;  // x8
    unsigned int v33;  // w0
    long long v34;  // x8
    long long v35;  // x8
    void* v9;  // x22
    unsigned int v36;  // w0
    long long v37;  // x8
    unsigned int v38;  // w0
    long long v39;  // x8
    unsigned int v40;  // w0
    long long v41;  // x8
    long long v42;  // x8
    unsigned int v43;  // w0
    long long v44;  // x8
    long long v45;  // x8
    unsigned long v10;  // x21
    unsigned int v46;  // w0
    long long v47;  // x8
    unsigned int v48;  // w0
    long long v49;  // x8
    unsigned int v50;  // w0
    long long v51;  // x8
    long long v52;  // x8
    unsigned int v53;  // w0
    long long v54;  // x8
    long long v55;  // x8
    void* v11;  // x19
    unsigned int v56;  // w0
    long long v57;  // x8
    unsigned int v58;  // w0
    long long v59;  // x8
    unsigned int v60;  // w0
    long long v61;  // x8
    long long v62;  // x8
    unsigned int v63;  // w0
    long long v64;  // x8
    long long v65;  // x8
    long long v12;  // x8
    unsigned int v66;  // w0
    long long v67;  // x8
    unsigned int v68;  // w0
    long long v69;  // x8
    unsigned int v70;  // w0
    long long v71;  // x8
    long long v72;  // x8
    unsigned int v73;  // w0
    long long v74;  // x8
    long long v75;  // x8
    unsigned int v13;  // w0
    unsigned int v76;  // w0
    long long v77;  // x8
    unsigned int v78;  // w0
    long long v79;  // x8
    unsigned int v80;  // w0
    long long v81;  // x8
    long long v82;  // x8
    unsigned int v83;  // w0
    long long v84;  // x8
    long long v85;  // x8
    void* v14;  // x22
    unsigned int v86;  // w0
    long long v87;  // x8
    unsigned int v88;  // w0
    long long v89;  // x8
    unsigned int v90;  // w0
    long long v91;  // x8
    long long v92;  // x8
    uint128_t v93;  // q1
    uint128_t v94;  // q1
    uint128_t v95;  // q1
    unsigned long v15;  // x21
    uint128_t v96;  // q1
    uint128_t v97;  // q1
    uint128_t v98;  // q1
    uint128_t v99;  // q1
    uint128_t v100;  // q1
    uint128_t v101;  // q1
    uint128_t v102;  // q1
    uint128_t v103;  // q1
    uint128_t v104;  // q1
    uint128_t v105;  // q1
    st_25ceb0_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_25ceb0_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_25ceb0_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    v8 = *a3;
    if (-1913464123207913326 >= v8)
    {
        if (-6829757742107251620 >= v8)
        {
            if (-7952285048595286290 >= v8)
            {
                switch (v8)
                {
                case 9521620647743807008:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v24 = 0;
                        do
                        {
                            *((char *)v16 + v24) = *((char *)v14 + v24);
                            v24 += 1;
                        } while (v24 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v23;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v22 = 0;
                    do
                    {
                        *((char *)v11 + v22) = *((char *)v9 + v22);
                        v22 += 1;
                    } while (v22 != 672);
                case 9690496647577256489:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v21 = 0;
                        do
                        {
                            *((char *)v16 + v21) = *((char *)v14 + v21);
                            v21 += 1;
                        } while (v21 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v20;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v19 = 0;
                    do
                    {
                        *((char *)v11 + v19) = *((char *)v9 + v19);
                        v19 += 1;
                    } while (v19 != 672);
                case 10361322093732925319:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v17 = 0;
                        do
                        {
                            *((char *)v16 + v17) = *((char *)v14 + v17);
                            v17 += 1;
                        } while (v17 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v13;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v12 = 0;
                    do
                    {
                        *((char *)v11 + v12) = *((char *)v9 + v12);
                        v12 += 1;
                    } while (v12 != 672);
                default:
                    return v18;
                }
            }
            else
            {
                switch (v8)
                {
                case 10494459025114265327:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v34 = 0;
                        do
                        {
                            *((char *)v16 + v34) = *((char *)v14 + v34);
                            v34 += 1;
                        } while (v34 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v33;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v32 = 0;
                    do
                    {
                        *((char *)v11 + v32) = *((char *)v9 + v32);
                        v32 += 1;
                    } while (v32 != 672);
                case 10994288373421139203:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v31 = 0;
                        do
                        {
                            *((char *)v16 + v31) = *((char *)v14 + v31);
                            v31 += 1;
                        } while (v31 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v30;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v29 = 0;
                    do
                    {
                        *((char *)v11 + v29) = *((char *)v9 + v29);
                        v29 += 1;
                    } while (v29 != 672);
                case 11188602000349077110:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v27 = 0;
                        do
                        {
                            *((char *)v16 + v27) = *((char *)v14 + v27);
                            v27 += 1;
                        } while (v27 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v26;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v25 = 0;
                    do
                    {
                        *((char *)v11 + v25) = *((char *)v9 + v25);
                        v25 += 1;
                    } while (v25 != 672);
                default:
                    return v28;
                }
            }
        }
        else
        {
            if (-4007314134421133498 >= v8)
            {
                switch (v8)
                {
                case 11616986331602299997:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v44 = 0;
                        do
                        {
                            *((char *)v16 + v44) = *((char *)v14 + v44);
                            v44 += 1;
                        } while (v44 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v43;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v42 = 0;
                    do
                    {
                        *((char *)v11 + v42) = *((char *)v9 + v42);
                        v42 += 1;
                    } while (v42 != 672);
                case 12428605097544732185:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v41 = 0;
                        do
                        {
                            *((char *)v16 + v41) = *((char *)v14 + v41);
                            v41 += 1;
                        } while (v41 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v40;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v39 = 0;
                    do
                    {
                        *((char *)v11 + v39) = *((char *)v9 + v39);
                        v39 += 1;
                    } while (v39 != 672);
                case 13473106346793744271:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v37 = 0;
                        do
                        {
                            *((char *)v16 + v37) = *((char *)v14 + v37);
                            v37 += 1;
                        } while (v37 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v36;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v35 = 0;
                    do
                    {
                        *((char *)v11 + v35) = *((char *)v9 + v35);
                        v35 += 1;
                    } while (v35 != 672);
                default:
                    return v38;
                }
            }
            else
            {
                switch (v8)
                {
                case 14439429939288418119:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v54 = 0;
                        do
                        {
                            *((char *)v16 + v54) = *((char *)v14 + v54);
                            v54 += 1;
                        } while (v54 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v53;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v52 = 0;
                    do
                    {
                        *((char *)v11 + v52) = *((char *)v9 + v52);
                        v52 += 1;
                    } while (v52 != 672);
                case 14449488726378798062:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v51 = 0;
                        do
                        {
                            *((char *)v16 + v51) = *((char *)v14 + v51);
                            v51 += 1;
                        } while (v51 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v50;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v49 = 0;
                    do
                    {
                        *((char *)v11 + v49) = *((char *)v9 + v49);
                        v49 += 1;
                    } while (v49 != 672);
                case 16247924983557827370:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v47 = 0;
                        do
                        {
                            *((char *)v16 + v47) = *((char *)v14 + v47);
                            v47 += 1;
                        } while (v47 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v46;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v45 = 0;
                    do
                    {
                        *((char *)v11 + v45) = *((char *)v9 + v45);
                        v45 += 1;
                    } while (v45 != 672);
                default:
                    return v48;
                }
            }
        }
    }
    else
    {
        if (4027017843405614606 >= v8)
        {
            if (590382856820498685 >= v8)
            {
                switch (v8)
                {
                case 16533279950501638291:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v64 = 0;
                        do
                        {
                            *((char *)v16 + v64) = *((char *)v14 + v64);
                            v64 += 1;
                        } while (v64 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v63;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v62 = 0;
                    do
                    {
                        *((char *)v11 + v62) = *((char *)v9 + v62);
                        v62 += 1;
                    } while (v62 != 672);
                case 17279256254980577037:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v61 = 0;
                        do
                        {
                            *((char *)v16 + v61) = *((char *)v14 + v61);
                            v61 += 1;
                        } while (v61 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v60;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v59 = 0;
                    do
                    {
                        *((char *)v11 + v59) = *((char *)v9 + v59);
                        v59 += 1;
                    } while (v59 != 672);
                case 17927078645275096836:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v57 = 0;
                        do
                        {
                            *((char *)v16 + v57) = *((char *)v14 + v57);
                            v57 += 1;
                        } while (v57 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v56;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v55 = 0;
                    do
                    {
                        *((char *)v11 + v55) = *((char *)v9 + v55);
                        v55 += 1;
                    } while (v55 != 672);
                default:
                    return v58;
                }
            }
            else
            {
                switch (v8)
                {
                case 590382856820498686:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v74 = 0;
                        do
                        {
                            *((char *)v16 + v74) = *((char *)v14 + v74);
                            v74 += 1;
                        } while (v74 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v73;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v72 = 0;
                    do
                    {
                        *((char *)v11 + v72) = *((char *)v9 + v72);
                        v72 += 1;
                    } while (v72 != 672);
                case 1095081571371732276:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v71 = 0;
                        do
                        {
                            *((char *)v16 + v71) = *((char *)v14 + v71);
                            v71 += 1;
                        } while (v71 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v70;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v69 = 0;
                    do
                    {
                        *((char *)v11 + v69) = *((char *)v9 + v69);
                        v69 += 1;
                    } while (v69 != 672);
                case 2237921083943061184:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v67 = 0;
                        do
                        {
                            *((char *)v16 + v67) = *((char *)v14 + v67);
                            v67 += 1;
                        } while (v67 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v66;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v65 = 0;
                    do
                    {
                        *((char *)v11 + v65) = *((char *)v9 + v65);
                        v65 += 1;
                    } while (v65 != 672);
                default:
                    return v68;
                }
            }
        }
        else
        {
            if (6423349515310746361 >= v8)
            {
                switch (v8)
                {
                case 4027017843405614607:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v84 = 0;
                        do
                        {
                            *((char *)v16 + v84) = *((char *)v14 + v84);
                            v84 += 1;
                        } while (v84 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v83;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v82 = 0;
                    do
                    {
                        *((char *)v11 + v82) = *((char *)v9 + v82);
                        v82 += 1;
                    } while (v82 != 672);
                case 4470461010411310557:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v81 = 0;
                        do
                        {
                            *((char *)v16 + v81) = *((char *)v14 + v81);
                            v81 += 1;
                        } while (v81 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v80;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v79 = 0;
                    do
                    {
                        *((char *)v11 + v79) = *((char *)v9 + v79);
                        v79 += 1;
                    } while (v79 != 672);
                case 4917682820964830050:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v77 = 0;
                        do
                        {
                            *((char *)v16 + v77) = *((char *)v14 + v77);
                            v77 += 1;
                        } while (v77 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v76;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v75 = 0;
                    do
                    {
                        *((char *)v11 + v75) = *((char *)v9 + v75);
                        v75 += 1;
                    } while (v75 != 672);
                default:
                    return v78;
                }
            }
            else
            {
                switch (v8)
                {
                case 6423349515310746362:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v117 = 0;
                        do
                        {
                            *((char *)v16 + v117) = *((char *)v14 + v117);
                            v117 += 1;
                        } while (v117 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v116;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 >= v11 - v9)
                    {
                        v92 = 0;
                        do
                        {
                            *((char *)v11 + v92) = *((char *)v9 + v92);
                            v92 += 1;
                        } while (v92 != 672);
                    }
                    else
                    {
LABEL_25db18:
                        v93 = (int128_t)v9[16];
                        *(int128_t *)v11 = *(int128_t *)v9;
                        *(uint128_t *)&v11[16] = v93;
                        v94 = (int128_t)v9[48];
                        *(int128_t *)&v11[32] = (int128_t)v9[32];
                        *(uint128_t *)&v11[48] = v94;
                        v95 = (int128_t)v9[80];
                        *(int128_t *)&v11[64] = (int128_t)v9[64];
                        *(uint128_t *)&v11[80] = v95;
                        v96 = (int128_t)v9[112];
                        *(int128_t *)&v11[96] = (int128_t)v9[96];
                        *(uint128_t *)&v11[112] = v96;
                        v97 = (int128_t)v9[144];
                        *(int128_t *)&v11[128] = (int128_t)v9[128];
                        *(uint128_t *)&v11[144] = v97;
                        v98 = (int128_t)v9[176];
                        *(int128_t *)&v11[160] = (int128_t)v9[160];
                        *(uint128_t *)&v11[176] = v98;
                        v99 = (int128_t)v9[208];
                        *(int128_t *)&v11[192] = (int128_t)v9[192];
                        *(uint128_t *)&v11[208] = v99;
                        v100 = (int128_t)v9[240];
                        *(int128_t *)&v11[224] = (int128_t)v9[224];
                        *(uint128_t *)&v11[240] = v100;
                        v101 = (int128_t)v9[272];
                        *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                        *(uint128_t *)&v11[272] = v101;
                        v102 = (int128_t)v9[304];
                        *(int128_t *)&v11[288] = (int128_t)v9[288];
                        *(uint128_t *)&v11[304] = v102;
                        v103 = (int128_t)v9[336];
                        *(int128_t *)&v11[320] = (int128_t)v9[320];
                        *(uint128_t *)&v11[336] = v103;
                        v104 = (int128_t)v9[368];
                        *(int128_t *)&v11[352] = (int128_t)v9[352];
                        *(uint128_t *)&v11[368] = v104;
                        v105 = (int128_t)v9[400];
                        *(int128_t *)&v11[384] = (int128_t)v9[384];
                        *(uint128_t *)&v11[400] = v105;
                        v106 = (int128_t)v9[432];
                        *(int128_t *)&v11[416] = (int128_t)v9[416];
                        *(uint128_t *)&v11[432] = v106;
                        v107 = (int128_t)v9[464];
                        *(int128_t *)&v11[448] = (int128_t)v9[448];
                        *(uint128_t *)&v11[464] = v107;
                        v108 = (int128_t)v9[496];
                        *(int128_t *)&v11[480] = (int128_t)v9[480];
                        *(uint128_t *)&v11[496] = v108;
                        v109 = (int128_t)v9[528];
                        *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                        *(uint128_t *)&v11[528] = v109;
                        v110 = (int128_t)v9[560];
                        *(int128_t *)&v11[544] = (int128_t)v9[544];
                        *(uint128_t *)&v11[560] = v110;
                        v111 = (int128_t)v9[592];
                        *(int128_t *)&v11[576] = (int128_t)v9[576];
                        *(uint128_t *)&v11[592] = v111;
                        v112 = (int128_t)v9[624];
                        *(int128_t *)&v11[608] = (int128_t)v9[608];
                        *(uint128_t *)&v11[624] = v112;
                        v113 = (int128_t)v9[656];
                        *(int128_t *)&v11[640] = (int128_t)v9[640];
                        *(uint128_t *)&v11[656] = v113;
                        break;
                    }
                case 8713493630975559703:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 < v16 - v14)
                            goto LABEL_25e25c;
                        v91 = 0;
                        do
                        {
                            *((char *)v16 + v91) = *((char *)v14 + v91);
                            v91 += 1;
                        } while (v91 != 672);
                        goto LABEL_25e304;
                    }
                    if (v7 != 2)
                        return v90;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v89 = 0;
                    do
                    {
                        *((char *)v11 + v89) = *((char *)v9 + v89);
                        v89 += 1;
                    } while (v89 != 672);
                case 7275024694829464213:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v15 = (long long)v14[16];
                        v16 = operatornew(672);
                        _bzero(v16, 672);
                        if (31 >= v16 - v14)
                        {
                            v87 = 0;
                            do
                            {
                                *((char *)v16 + v87) = *((char *)v14 + v87);
                                v87 += 1;
                            } while (v87 != 672);
                        }
                        else
                        {
LABEL_25e25c:
                            v118 = (int128_t)v14[16];
                            *(int128_t *)v16 = *(int128_t *)v14;
                            *(uint128_t *)&v16[16] = v118;
                            v119 = (int128_t)v14[48];
                            *(int128_t *)&v16[32] = (int128_t)v14[32];
                            *(uint128_t *)&v16[48] = v119;
                            v120 = (int128_t)v14[80];
                            *(int128_t *)&v16[64] = (int128_t)v14[64];
                            *(uint128_t *)&v16[80] = v120;
                            v121 = (int128_t)v14[112];
                            *(int128_t *)&v16[96] = (int128_t)v14[96];
                            *(uint128_t *)&v16[112] = v121;
                            v122 = (int128_t)v14[144];
                            *(int128_t *)&v16[128] = (int128_t)v14[128];
                            *(uint128_t *)&v16[144] = v122;
                            v123 = (int128_t)v14[176];
                            *(int128_t *)&v16[160] = (int128_t)v14[160];
                            *(uint128_t *)&v16[176] = v123;
                            v124 = (int128_t)v14[208];
                            *(int128_t *)&v16[192] = (int128_t)v14[192];
                            *(uint128_t *)&v16[208] = v124;
                            v125 = (int128_t)v14[240];
                            *(int128_t *)&v16[224] = (int128_t)v14[224];
                            *(uint128_t *)&v16[240] = v125;
                            v126 = (int128_t)v14[272];
                            *(int128_t *)&v16[0x100] = (int128_t)v14[0x100];
                            *(uint128_t *)&v16[272] = v126;
                            v127 = (int128_t)v14[304];
                            *(int128_t *)&v16[288] = (int128_t)v14[288];
                            *(uint128_t *)&v16[304] = v127;
                            v128 = (int128_t)v14[336];
                            *(int128_t *)&v16[320] = (int128_t)v14[320];
                            *(uint128_t *)&v16[336] = v128;
                            v129 = (int128_t)v14[368];
                            *(int128_t *)&v16[352] = (int128_t)v14[352];
                            *(uint128_t *)&v16[368] = v129;
                            v130 = (int128_t)v14[400];
                            *(int128_t *)&v16[384] = (int128_t)v14[384];
                            *(uint128_t *)&v16[400] = v130;
                            v131 = (int128_t)v14[432];
                            *(int128_t *)&v16[416] = (int128_t)v14[416];
                            *(uint128_t *)&v16[432] = v131;
                            v132 = (int128_t)v14[464];
                            *(int128_t *)&v16[448] = (int128_t)v14[448];
                            *(uint128_t *)&v16[464] = v132;
                            v133 = (int128_t)v14[496];
                            *(int128_t *)&v16[480] = (int128_t)v14[480];
                            *(uint128_t *)&v16[496] = v133;
                            v134 = (int128_t)v14[528];
                            *(int128_t *)&v16[0x200] = (int128_t)v14[0x200];
                            *(uint128_t *)&v16[528] = v134;
                            v135 = (int128_t)v14[560];
                            *(int128_t *)&v16[544] = (int128_t)v14[544];
                            *(uint128_t *)&v16[560] = v135;
                            v136 = (int128_t)v14[592];
                            *(int128_t *)&v16[576] = (int128_t)v14[576];
                            *(uint128_t *)&v16[592] = v136;
                            v137 = (int128_t)v14[624];
                            *(int128_t *)&v16[608] = (int128_t)v14[608];
                            *(uint128_t *)&v16[624] = v137;
                            v138 = (int128_t)v14[656];
                            *(int128_t *)&v16[640] = (int128_t)v14[640];
                            *(uint128_t *)&v16[656] = v138;
                        }
LABEL_25e304:
                        *(unsigned long long *)&v16[16] = 2456424;
                        *v6 = v16;
                        v115 = operatornew(32);
                        v115->field_0 = 0;
                        v115->field_8 = v15;
                        v115->field_10 = 2508632;
LABEL_25e32c:
                        v115->field_18 = 0;
                        v2 = v6;
                        v3 = v115;
                        sub_2592b4(&g_f11980, &v2);
                        return v139;
                    }
                    if (v7 != 2)
                        return v86;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25db18;
                    v85 = 0;
                    do
                    {
                        *((char *)v11 + v85) = *((char *)v9 + v85);
                        v85 += 1;
                    } while (v85 != 672);
                default:
                    return v88;
                }
            }
        }
    }
    v114 = 2462860;
    if (0)
        v114 = 2405940;
    *(unsigned long long *)&v11[24] = v114;
    *v6 = v11;
    v115 = operatornew(32);
    v115->field_0 = 0;
    v115->field_8 = v10;
    v115->field_10 = 2508632;
    goto LABEL_25e32c;
}

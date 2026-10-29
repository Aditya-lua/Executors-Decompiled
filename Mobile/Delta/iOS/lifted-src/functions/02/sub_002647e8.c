/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2647e8..0x2652fc (2836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2647e8_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_2647e8_1;

typedef struct st_2647e8_0 {
    void* field_0;
} st_2647e8_0;

typedef struct st_2647e8_2 {
    char field_0;
} st_2647e8_2;

extern long long g_f11980;

int sub_2647e8(unsigned int a0, st_2647e8_0 **a1, unsigned int *a2, long long *a3)
{
    void* *v6;  // x20
    unsigned int v7;  // w8
    unsigned int v16;  // w0
    long long v17;  // x8
    unsigned int v18;  // w0
    long long v19;  // x8
    long long v20;  // x8
    unsigned int v21;  // w0
    long long v22;  // x8
    long long v23;  // x8
    unsigned int v24;  // w0
    long long v25;  // x8
    long long v8;  // x9
    unsigned int v26;  // w0
    long long v27;  // x8
    unsigned int v28;  // w0
    long long v29;  // x8
    long long v30;  // x8
    unsigned int v31;  // w0
    long long v32;  // x8
    long long v33;  // x8
    unsigned int v34;  // w0
    long long v35;  // x8
    void* v9;  // x22
    unsigned int v36;  // w0
    long long v37;  // x8
    unsigned int v38;  // w0
    long long v39;  // x8
    long long v40;  // x8
    unsigned int v41;  // w0
    long long v42;  // x8
    long long v43;  // x8
    unsigned int v44;  // w0
    long long v45;  // x8
    unsigned long v10;  // x21
    unsigned int v46;  // w0
    long long v47;  // x8
    unsigned int v48;  // w0
    long long v49;  // x8
    long long v50;  // x8
    uint128_t v51;  // q1
    uint128_t v52;  // q1
    uint128_t v53;  // q1
    uint128_t v54;  // q1
    uint128_t v55;  // q1
    void* v11;  // x19
    uint128_t v56;  // q1
    uint128_t v57;  // q1
    uint128_t v58;  // q1
    uint128_t v59;  // q1
    uint128_t v60;  // q1
    uint128_t v61;  // q1
    uint128_t v62;  // q1
    uint128_t v63;  // q1
    uint128_t v64;  // q1
    uint128_t v65;  // q1
    long long v12;  // x8
    uint128_t v66;  // q1
    uint128_t v67;  // q1
    uint128_t v68;  // q1
    uint128_t v69;  // q1
    uint128_t v70;  // q1
    uint128_t v71;  // q1
    unsigned int v72;  // w0
    long long v73;  // x8
    uint128_t v74;  // q1
    uint128_t v75;  // q1
    unsigned int v13;  // w0
    uint128_t v76;  // q1
    uint128_t v77;  // q1
    uint128_t v78;  // q1
    uint128_t v79;  // q1
    uint128_t v80;  // q1
    uint128_t v81;  // q1
    uint128_t v82;  // q1
    uint128_t v83;  // q1
    uint128_t v84;  // q1
    uint128_t v85;  // q1
    void* v14;  // x22
    uint128_t v86;  // q1
    uint128_t v87;  // q1
    uint128_t v88;  // q1
    uint128_t v89;  // q1
    uint128_t v90;  // q1
    uint128_t v91;  // q1
    uint128_t v92;  // q1
    uint128_t v93;  // q1
    uint128_t v94;  // q1
    st_2647e8_1 *v95;  // x0
    long long v15;  // x8
    unsigned int v96;  // w0
    st_2647e8_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_2647e8_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_2647e8_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    v8 = *a3;
    if (1272429211127413513 >= v8)
    {
        if (-2810126710002998673 >= v8)
        {
            switch (v8)
            {
            case 11609101809852879966:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v22 = 0;
                    do
                    {
                        *((char *)v11 + v22) = *((char *)v14 + v22);
                        v22 += 1;
                    } while (v22 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v21;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v20 = 0;
                do
                {
                    *((char *)v11 + v20) = *((char *)v9 + v20);
                    v20 += 1;
                } while (v20 != 672);
            case 12130809037479533586:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v19 = 0;
                    do
                    {
                        *((char *)v11 + v19) = *((char *)v14 + v19);
                        v19 += 1;
                    } while (v19 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v18;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v17 = 0;
                do
                {
                    *((char *)v11 + v17) = *((char *)v9 + v17);
                    v17 += 1;
                } while (v17 != 672);
            case 15335456887023086567:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v15 = 0;
                    do
                    {
                        *((char *)v11 + v15) = *((char *)v14 + v15);
                        v15 += 1;
                    } while (v15 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v13;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v12 = 0;
                do
                {
                    *((char *)v11 + v12) = *((char *)v9 + v12);
                    v12 += 1;
                } while (v12 != 672);
            default:
                return v16;
            }
        }
        else
        {
            switch (v8)
            {
            case 15636617363706552944:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v32 = 0;
                    do
                    {
                        *((char *)v11 + v32) = *((char *)v14 + v32);
                        v32 += 1;
                    } while (v32 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v31;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v30 = 0;
                do
                {
                    *((char *)v11 + v30) = *((char *)v9 + v30);
                    v30 += 1;
                } while (v30 != 672);
            case 16504348212694621143:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v29 = 0;
                    do
                    {
                        *((char *)v11 + v29) = *((char *)v14 + v29);
                        v29 += 1;
                    } while (v29 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v28;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v27 = 0;
                do
                {
                    *((char *)v11 + v27) = *((char *)v9 + v27);
                    v27 += 1;
                } while (v27 != 672);
            case 17741393985798612485:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v25 = 0;
                    do
                    {
                        *((char *)v11 + v25) = *((char *)v14 + v25);
                        v25 += 1;
                    } while (v25 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v24;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v23 = 0;
                do
                {
                    *((char *)v11 + v23) = *((char *)v9 + v23);
                    v23 += 1;
                } while (v23 != 672);
            default:
                return v26;
            }
        }
    }
    else
    {
        if (5011412984919243190 >= v8)
        {
            switch (v8)
            {
            case 1272429211127413514:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v42 = 0;
                    do
                    {
                        *((char *)v11 + v42) = *((char *)v14 + v42);
                        v42 += 1;
                    } while (v42 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v41;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v40 = 0;
                do
                {
                    *((char *)v11 + v40) = *((char *)v9 + v40);
                    v40 += 1;
                } while (v40 != 672);
            case 1771394424353125922:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v39 = 0;
                    do
                    {
                        *((char *)v11 + v39) = *((char *)v14 + v39);
                        v39 += 1;
                    } while (v39 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v38;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v37 = 0;
                do
                {
                    *((char *)v11 + v37) = *((char *)v9 + v37);
                    v37 += 1;
                } while (v37 != 672);
            case 2995660400373406881:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v35 = 0;
                    do
                    {
                        *((char *)v11 + v35) = *((char *)v14 + v35);
                        v35 += 1;
                    } while (v35 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v34;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v33 = 0;
                do
                {
                    *((char *)v11 + v33) = *((char *)v9 + v33);
                    v33 += 1;
                } while (v33 != 672);
            default:
                return v36;
            }
        }
        else
        {
            switch (v8)
            {
            case 5011412984919243191:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v73 = 0;
                    do
                    {
                        *((char *)v11 + v73) = *((char *)v14 + v73);
                        v73 += 1;
                    } while (v73 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v72;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v50 = 0;
                do
                {
                    *((char *)v11 + v50) = *((char *)v9 + v50);
                    v50 += 1;
                } while (v50 != 672);
            case 5925979280301328998:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 >= v11 - v14)
                    {
                        v49 = 0;
                        do
                        {
                            *((char *)v11 + v49) = *((char *)v14 + v49);
                            v49 += 1;
                        } while (v49 != 672);
                    }
                    else
                    {
LABEL_265208:
                        v74 = (int128_t)v14[16];
                        *(int128_t *)v11 = *(int128_t *)v14;
                        *(uint128_t *)&v11[16] = v74;
                        v75 = (int128_t)v14[48];
                        *(int128_t *)&v11[32] = (int128_t)v14[32];
                        *(uint128_t *)&v11[48] = v75;
                        v76 = (int128_t)v14[80];
                        *(int128_t *)&v11[64] = (int128_t)v14[64];
                        *(uint128_t *)&v11[80] = v76;
                        v77 = (int128_t)v14[112];
                        *(int128_t *)&v11[96] = (int128_t)v14[96];
                        *(uint128_t *)&v11[112] = v77;
                        v78 = (int128_t)v14[144];
                        *(int128_t *)&v11[128] = (int128_t)v14[128];
                        *(uint128_t *)&v11[144] = v78;
                        v79 = (int128_t)v14[176];
                        *(int128_t *)&v11[160] = (int128_t)v14[160];
                        *(uint128_t *)&v11[176] = v79;
                        v80 = (int128_t)v14[208];
                        *(int128_t *)&v11[192] = (int128_t)v14[192];
                        *(uint128_t *)&v11[208] = v80;
                        v81 = (int128_t)v14[240];
                        *(int128_t *)&v11[224] = (int128_t)v14[224];
                        *(uint128_t *)&v11[240] = v81;
                        v82 = (int128_t)v14[272];
                        *(int128_t *)&v11[0x100] = (int128_t)v14[0x100];
                        *(uint128_t *)&v11[272] = v82;
                        v83 = (int128_t)v14[304];
                        *(int128_t *)&v11[288] = (int128_t)v14[288];
                        *(uint128_t *)&v11[304] = v83;
                        v84 = (int128_t)v14[336];
                        *(int128_t *)&v11[320] = (int128_t)v14[320];
                        *(uint128_t *)&v11[336] = v84;
                        v85 = (int128_t)v14[368];
                        *(int128_t *)&v11[352] = (int128_t)v14[352];
                        *(uint128_t *)&v11[368] = v85;
                        v86 = (int128_t)v14[400];
                        *(int128_t *)&v11[384] = (int128_t)v14[384];
                        *(uint128_t *)&v11[400] = v86;
                        v87 = (int128_t)v14[432];
                        *(int128_t *)&v11[416] = (int128_t)v14[416];
                        *(uint128_t *)&v11[432] = v87;
                        v88 = (int128_t)v14[464];
                        *(int128_t *)&v11[448] = (int128_t)v14[448];
                        *(uint128_t *)&v11[464] = v88;
                        v89 = (int128_t)v14[496];
                        *(int128_t *)&v11[480] = (int128_t)v14[480];
                        *(uint128_t *)&v11[496] = v89;
                        v90 = (int128_t)v14[528];
                        *(int128_t *)&v11[0x200] = (int128_t)v14[0x200];
                        *(uint128_t *)&v11[528] = v90;
                        v91 = (int128_t)v14[560];
                        *(int128_t *)&v11[544] = (int128_t)v14[544];
                        *(uint128_t *)&v11[560] = v91;
                        v92 = (int128_t)v14[592];
                        *(int128_t *)&v11[576] = (int128_t)v14[576];
                        *(uint128_t *)&v11[592] = v92;
                        v93 = (int128_t)v14[624];
                        *(int128_t *)&v11[608] = (int128_t)v14[608];
                        *(uint128_t *)&v11[624] = v93;
                        v94 = (int128_t)v14[656];
                        *(int128_t *)&v11[640] = (int128_t)v14[640];
                        *(uint128_t *)&v11[656] = v94;
                    }
LABEL_2652b0:
                    *(unsigned long long *)&v11[16] = 2456424;
                    *v6 = v11;
                    v95 = operatornew(32);
                    v95->field_0 = 0;
                    v95->field_8 = v10;
                    v95->field_10 = 0;
                    v95->field_18 = 0;
                    v2 = v6;
                    v3 = v95;
                    sub_2592b4(&g_f11980, &v2);
                    return v96;
                }
                if (v7 != 2)
                    return v48;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 >= v11 - v9)
                {
                    v47 = 0;
                    do
                    {
                        *((char *)v11 + v47) = *((char *)v9 + v47);
                        v47 += 1;
                    } while (v47 != 672);
                }
                else
                {
LABEL_264e20:
                    v51 = (int128_t)v9[16];
                    *(int128_t *)v11 = *(int128_t *)v9;
                    *(uint128_t *)&v11[16] = v51;
                    v52 = (int128_t)v9[48];
                    *(int128_t *)&v11[32] = (int128_t)v9[32];
                    *(uint128_t *)&v11[48] = v52;
                    v53 = (int128_t)v9[80];
                    *(int128_t *)&v11[64] = (int128_t)v9[64];
                    *(uint128_t *)&v11[80] = v53;
                    v54 = (int128_t)v9[112];
                    *(int128_t *)&v11[96] = (int128_t)v9[96];
                    *(uint128_t *)&v11[112] = v54;
                    v55 = (int128_t)v9[144];
                    *(int128_t *)&v11[128] = (int128_t)v9[128];
                    *(uint128_t *)&v11[144] = v55;
                    v56 = (int128_t)v9[176];
                    *(int128_t *)&v11[160] = (int128_t)v9[160];
                    *(uint128_t *)&v11[176] = v56;
                    v57 = (int128_t)v9[208];
                    *(int128_t *)&v11[192] = (int128_t)v9[192];
                    *(uint128_t *)&v11[208] = v57;
                    v58 = (int128_t)v9[240];
                    *(int128_t *)&v11[224] = (int128_t)v9[224];
                    *(uint128_t *)&v11[240] = v58;
                    v59 = (int128_t)v9[272];
                    *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                    *(uint128_t *)&v11[272] = v59;
                    v60 = (int128_t)v9[304];
                    *(int128_t *)&v11[288] = (int128_t)v9[288];
                    *(uint128_t *)&v11[304] = v60;
                    v61 = (int128_t)v9[336];
                    *(int128_t *)&v11[320] = (int128_t)v9[320];
                    *(uint128_t *)&v11[336] = v61;
                    v62 = (int128_t)v9[368];
                    *(int128_t *)&v11[352] = (int128_t)v9[352];
                    *(uint128_t *)&v11[368] = v62;
                    v63 = (int128_t)v9[400];
                    *(int128_t *)&v11[384] = (int128_t)v9[384];
                    *(uint128_t *)&v11[400] = v63;
                    v64 = (int128_t)v9[432];
                    *(int128_t *)&v11[416] = (int128_t)v9[416];
                    *(uint128_t *)&v11[432] = v64;
                    v65 = (int128_t)v9[464];
                    *(int128_t *)&v11[448] = (int128_t)v9[448];
                    *(uint128_t *)&v11[464] = v65;
                    v66 = (int128_t)v9[496];
                    *(int128_t *)&v11[480] = (int128_t)v9[480];
                    *(uint128_t *)&v11[496] = v66;
                    v67 = (int128_t)v9[528];
                    *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                    *(uint128_t *)&v11[528] = v67;
                    v68 = (int128_t)v9[560];
                    *(int128_t *)&v11[544] = (int128_t)v9[544];
                    *(uint128_t *)&v11[560] = v68;
                    v69 = (int128_t)v9[592];
                    *(int128_t *)&v11[576] = (int128_t)v9[576];
                    *(uint128_t *)&v11[592] = v69;
                    v70 = (int128_t)v9[624];
                    *(int128_t *)&v11[608] = (int128_t)v9[608];
                    *(uint128_t *)&v11[624] = v70;
                    v71 = (int128_t)v9[656];
                    *(int128_t *)&v11[640] = (int128_t)v9[640];
                    *(uint128_t *)&v11[656] = v71;
                    break;
                }
            case 8821523008270799521:
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_265208;
                    v45 = 0;
                    do
                    {
                        *((char *)v11 + v45) = *((char *)v14 + v45);
                        v45 += 1;
                    } while (v45 != 672);
                    goto LABEL_2652b0;
                }
                if (v7 != 2)
                    return v44;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_264e20;
                v43 = 0;
                do
                {
                    *((char *)v11 + v43) = *((char *)v9 + v43);
                    v43 += 1;
                } while (v43 != 672);
            default:
                return v46;
            }
        }
    }
    *(unsigned long long *)&v11[24] = 2462860;
    *v6 = v11;
    v95 = operatornew(32);
    v95->field_0 = 0;
    v95->field_8 = v10;
    v95->field_10 = 0;
    v95->field_18 = 0;
    v2 = v6;
    v3 = v95;
    sub_2592b4(&g_f11980, &v2);
    return v96;
}

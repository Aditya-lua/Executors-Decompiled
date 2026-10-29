/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x259a3c..0x25a970 (3892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_259a3c_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_259a3c_1;

typedef struct st_259a3c_0 {
    void* field_0;
} st_259a3c_0;

typedef struct st_259a3c_2 {
    char field_0;
} st_259a3c_2;

extern long long g_f11980;

int sub_259a3c(unsigned int a0, st_259a3c_0 **a1, unsigned int *a2, long long *a3)
{
    void* *v6;  // x20
    unsigned int v7;  // w8
    unsigned int v16;  // w0
    uint128_t v106;  // q1
    uint128_t v107;  // q1
    uint128_t v108;  // q1
    uint128_t v109;  // q1
    uint128_t v110;  // q1
    uint128_t v111;  // q1
    uint128_t v112;  // q1
    uint128_t v113;  // q1
    st_259a3c_1 *v114;  // x0
    unsigned int v115;  // w0
    long long k;  // x8
    unsigned int v18;  // w0
    long long n;  // x8
    long long l;  // x8
    unsigned int v21;  // w0
    long long i0;  // x8
    long long j;  // x8
    unsigned int v24;  // w0
    long long i3;  // x8
    long long v8;  // x9
    unsigned int v26;  // w0
    long long m;  // x8
    unsigned int v28;  // w0
    long long i1;  // x8
    long long v30;  // x8
    unsigned int v31;  // w0
    long long v32;  // x8
    unsigned int v33;  // w0
    long long v34;  // x8
    unsigned int v35;  // w0
    void* v9;  // x22
    long long v36;  // x8
    long long v37;  // x8
    unsigned int v38;  // w0
    long long v39;  // x8
    unsigned int v40;  // w0
    long long v41;  // x8
    unsigned int v42;  // w0
    long long v43;  // x8
    long long v44;  // x8
    unsigned int v45;  // w0
    unsigned long v10;  // x21
    long long v46;  // x8
    unsigned int v47;  // w0
    long long v48;  // x8
    unsigned int v49;  // w0
    long long v50;  // x8
    long long v51;  // x8
    unsigned int v52;  // w0
    long long v53;  // x8
    unsigned int v54;  // w0
    long long v55;  // x8
    void* v11;  // x19
    unsigned int v56;  // w0
    long long v57;  // x8
    long long v58;  // x8
    unsigned int v59;  // w0
    long long v60;  // x8
    unsigned int v61;  // w0
    long long v62;  // x8
    unsigned int v63;  // w0
    long long v64;  // x8
    long long v65;  // x8
    long long i;  // x8
    unsigned int v66;  // w0
    long long v67;  // x8
    unsigned int v68;  // w0
    long long v69;  // x8
    uint128_t v70;  // q1
    uint128_t v71;  // q1
    uint128_t v72;  // q1
    uint128_t v73;  // q1
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
    unsigned int v91;  // w0
    long long v92;  // x8
    uint128_t v93;  // q1
    uint128_t v94;  // q1
    uint128_t v95;  // q1
    long long i2;  // x8
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
    st_259a3c_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_259a3c_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_259a3c_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    v8 = *a3;
    if (v8 > 1675930547855404219)
    {
        if (v8 > 5336257903392610231)
        {
            if (v8 > 8288808111467042373)
            {
                if (v8 == 8288808111467042374)
                {
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        i0 = 0;
                        do
                        {
                            *((char *)v11 + i0) = *((char *)v14 + i0);
                            i0 += 1;
                        } while (i0 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v21;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    l = 0;
                    do
                    {
                        *((char *)v11 + l) = *((char *)v9 + l);
                        l += 1;
                    } while (l != 672);
                }
                else if (v8 != 8935729035328580205)
                {
                    if (v8 != 8985537603631273652)
                        return v16;
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        i2 = 0;
                        do
                        {
                            *((char *)v11 + i2) = *((char *)v14 + i2);
                            i2 += 1;
                        } while (i2 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v13;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    i = 0;
                    do
                    {
                        *((char *)v11 + i) = *((char *)v9 + i);
                        i += 1;
                    } while (i != 672);
                }
                else
                {
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        n = 0;
                        do
                        {
                            *((char *)v11 + n) = *((char *)v14 + n);
                            n += 1;
                        } while (n != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v18;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    k = 0;
                    do
                    {
                        *((char *)v11 + k) = *((char *)v9 + k);
                        k += 1;
                    } while (k != 672);
                }
            }
            else
            {
                if (v8 != 5336257903392610232)
                {
                    if (v8 != 6126038601543250585)
                        return v26;
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
                            i3 = 0;
                            do
                            {
                                *((char *)v11 + i3) = *((char *)v14 + i3);
                                i3 += 1;
                            } while (i3 != 672);
                        }
                        else
                        {
LABEL_25a87c:
                            v93 = (int128_t)v14[16];
                            *(int128_t *)v11 = *(int128_t *)v14;
                            *(uint128_t *)&v11[16] = v93;
                            v94 = (int128_t)v14[48];
                            *(int128_t *)&v11[32] = (int128_t)v14[32];
                            *(uint128_t *)&v11[48] = v94;
                            v95 = (int128_t)v14[80];
                            *(int128_t *)&v11[64] = (int128_t)v14[64];
                            *(uint128_t *)&v11[80] = v95;
                            v96 = (int128_t)v14[112];
                            *(int128_t *)&v11[96] = (int128_t)v14[96];
                            *(uint128_t *)&v11[112] = v96;
                            v97 = (int128_t)v14[144];
                            *(int128_t *)&v11[128] = (int128_t)v14[128];
                            *(uint128_t *)&v11[144] = v97;
                            v98 = (int128_t)v14[176];
                            *(int128_t *)&v11[160] = (int128_t)v14[160];
                            *(uint128_t *)&v11[176] = v98;
                            v99 = (int128_t)v14[208];
                            *(int128_t *)&v11[192] = (int128_t)v14[192];
                            *(uint128_t *)&v11[208] = v99;
                            v100 = (int128_t)v14[240];
                            *(int128_t *)&v11[224] = (int128_t)v14[224];
                            *(uint128_t *)&v11[240] = v100;
                            v101 = (int128_t)v14[272];
                            *(int128_t *)&v11[0x100] = (int128_t)v14[0x100];
                            *(uint128_t *)&v11[272] = v101;
                            v102 = (int128_t)v14[304];
                            *(int128_t *)&v11[288] = (int128_t)v14[288];
                            *(uint128_t *)&v11[304] = v102;
                            v103 = (int128_t)v14[336];
                            *(int128_t *)&v11[320] = (int128_t)v14[320];
                            *(uint128_t *)&v11[336] = v103;
                            v104 = (int128_t)v14[368];
                            *(int128_t *)&v11[352] = (int128_t)v14[352];
                            *(uint128_t *)&v11[368] = v104;
                            v105 = (int128_t)v14[400];
                            *(int128_t *)&v11[384] = (int128_t)v14[384];
                            *(uint128_t *)&v11[400] = v105;
                            v106 = (int128_t)v14[432];
                            *(int128_t *)&v11[416] = (int128_t)v14[416];
                            *(uint128_t *)&v11[432] = v106;
                            v107 = (int128_t)v14[464];
                            *(int128_t *)&v11[448] = (int128_t)v14[448];
                            *(uint128_t *)&v11[464] = v107;
                            v108 = (int128_t)v14[496];
                            *(int128_t *)&v11[480] = (int128_t)v14[480];
                            *(uint128_t *)&v11[496] = v108;
                            v109 = (int128_t)v14[528];
                            *(int128_t *)&v11[0x200] = (int128_t)v14[0x200];
                            *(uint128_t *)&v11[528] = v109;
                            v110 = (int128_t)v14[560];
                            *(int128_t *)&v11[544] = (int128_t)v14[544];
                            *(uint128_t *)&v11[560] = v110;
                            v111 = (int128_t)v14[592];
                            *(int128_t *)&v11[576] = (int128_t)v14[576];
                            *(uint128_t *)&v11[592] = v111;
                            v112 = (int128_t)v14[624];
                            *(int128_t *)&v11[608] = (int128_t)v14[608];
                            *(uint128_t *)&v11[624] = v112;
                            v113 = (int128_t)v14[656];
                            *(int128_t *)&v11[640] = (int128_t)v14[640];
                            *(uint128_t *)&v11[656] = v113;
                        }
LABEL_25a924:
                        *(unsigned long long *)&v11[16] = 2456424;
                        *v6 = v11;
                        v114 = operatornew(32);
                        v114->field_0 = 0;
                        v114->field_8 = v10;
                        v114->field_10 = 0;
                        v114->field_18 = 0;
                        v2 = v6;
                        v3 = v114;
                        sub_2592b4(&g_f11980, &v2);
                        return v115;
                    }
                    if (v7 != 2)
                        return v24;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    j = 0;
                    do
                    {
                        *((char *)v11 + j) = *((char *)v9 + j);
                        j += 1;
                    } while (j != 672);
                }
                else
                {
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        i1 = 0;
                        do
                        {
                            *((char *)v11 + i1) = *((char *)v14 + i1);
                            i1 += 1;
                        } while (i1 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v28;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 >= v11 - v9)
                    {
                        m = 0;
                        do
                        {
                            *((char *)v11 + m) = *((char *)v9 + m);
                            m += 1;
                        } while (m != 672);
                    }
                    else
                    {
LABEL_25a340:
                        v70 = (int128_t)v9[16];
                        *(int128_t *)v11 = *(int128_t *)v9;
                        *(uint128_t *)&v11[16] = v70;
                        v71 = (int128_t)v9[48];
                        *(int128_t *)&v11[32] = (int128_t)v9[32];
                        *(uint128_t *)&v11[48] = v71;
                        v72 = (int128_t)v9[80];
                        *(int128_t *)&v11[64] = (int128_t)v9[64];
                        *(uint128_t *)&v11[80] = v72;
                        v73 = (int128_t)v9[112];
                        *(int128_t *)&v11[96] = (int128_t)v9[96];
                        *(uint128_t *)&v11[112] = v73;
                        v74 = (int128_t)v9[144];
                        *(int128_t *)&v11[128] = (int128_t)v9[128];
                        *(uint128_t *)&v11[144] = v74;
                        v75 = (int128_t)v9[176];
                        *(int128_t *)&v11[160] = (int128_t)v9[160];
                        *(uint128_t *)&v11[176] = v75;
                        v76 = (int128_t)v9[208];
                        *(int128_t *)&v11[192] = (int128_t)v9[192];
                        *(uint128_t *)&v11[208] = v76;
                        v77 = (int128_t)v9[240];
                        *(int128_t *)&v11[224] = (int128_t)v9[224];
                        *(uint128_t *)&v11[240] = v77;
                        v78 = (int128_t)v9[272];
                        *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                        *(uint128_t *)&v11[272] = v78;
                        v79 = (int128_t)v9[304];
                        *(int128_t *)&v11[288] = (int128_t)v9[288];
                        *(uint128_t *)&v11[304] = v79;
                        v80 = (int128_t)v9[336];
                        *(int128_t *)&v11[320] = (int128_t)v9[320];
                        *(uint128_t *)&v11[336] = v80;
                        v81 = (int128_t)v9[368];
                        *(int128_t *)&v11[352] = (int128_t)v9[352];
                        *(uint128_t *)&v11[368] = v81;
                        v82 = (int128_t)v9[400];
                        *(int128_t *)&v11[384] = (int128_t)v9[384];
                        *(uint128_t *)&v11[400] = v82;
                        v83 = (int128_t)v9[432];
                        *(int128_t *)&v11[416] = (int128_t)v9[416];
                        *(uint128_t *)&v11[432] = v83;
                        v84 = (int128_t)v9[464];
                        *(int128_t *)&v11[448] = (int128_t)v9[448];
                        *(uint128_t *)&v11[464] = v84;
                        v85 = (int128_t)v9[496];
                        *(int128_t *)&v11[480] = (int128_t)v9[480];
                        *(uint128_t *)&v11[496] = v85;
                        v86 = (int128_t)v9[528];
                        *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                        *(uint128_t *)&v11[528] = v86;
                        v87 = (int128_t)v9[560];
                        *(int128_t *)&v11[544] = (int128_t)v9[544];
                        *(uint128_t *)&v11[560] = v87;
                        v88 = (int128_t)v9[592];
                        *(int128_t *)&v11[576] = (int128_t)v9[576];
                        *(uint128_t *)&v11[592] = v88;
                        v89 = (int128_t)v9[624];
                        *(int128_t *)&v11[608] = (int128_t)v9[608];
                        *(uint128_t *)&v11[624] = v89;
                        v90 = (int128_t)v9[656];
                        *(int128_t *)&v11[640] = (int128_t)v9[640];
                        *(uint128_t *)&v11[656] = v90;
                    }
                }
            }
        }
        else
        {
            if (2538498159522194104 >= v8)
            {
                switch (v8)
                {
                case 1675930547855404220:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v36 = 0;
                        do
                        {
                            *((char *)v11 + v36) = *((char *)v14 + v36);
                            v36 += 1;
                        } while (v36 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v35;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v34 = 0;
                    do
                    {
                        *((char *)v11 + v34) = *((char *)v9 + v34);
                        v34 += 1;
                    } while (v34 != 672);
                case 2193339525810570974:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v32 = 0;
                        do
                        {
                            *((char *)v11 + v32) = *((char *)v14 + v32);
                            v32 += 1;
                        } while (v32 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v31;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v30 = 0;
                    do
                    {
                        *((char *)v11 + v30) = *((char *)v9 + v30);
                        v30 += 1;
                    } while (v30 != 672);
                default:
                    return v33;
                }
            }
            else
            {
                switch (v8)
                {
                case 2538498159522194105:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v43 = 0;
                        do
                        {
                            *((char *)v11 + v43) = *((char *)v14 + v43);
                            v43 += 1;
                        } while (v43 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v42;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v41 = 0;
                    do
                    {
                        *((char *)v11 + v41) = *((char *)v9 + v41);
                        v41 += 1;
                    } while (v41 != 672);
                case 4462946168680541816:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v39 = 0;
                        do
                        {
                            *((char *)v11 + v39) = *((char *)v14 + v39);
                            v39 += 1;
                        } while (v39 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v38;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v37 = 0;
                    do
                    {
                        *((char *)v11 + v37) = *((char *)v9 + v37);
                        v37 += 1;
                    } while (v37 != 672);
                default:
                    return v40;
                }
            }
        }
    }
    else
    {
        if (-5316864576993812969 >= v8)
        {
            if (-8250342712438799517 >= v8)
            {
                switch (v8)
                {
                case 9938342268995263783:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v50 = 0;
                        do
                        {
                            *((char *)v11 + v50) = *((char *)v14 + v50);
                            v50 += 1;
                        } while (v50 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v49;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v48 = 0;
                    do
                    {
                        *((char *)v11 + v48) = *((char *)v9 + v48);
                        v48 += 1;
                    } while (v48 != 672);
                case 10077348443305636262:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v46 = 0;
                        do
                        {
                            *((char *)v11 + v46) = *((char *)v14 + v46);
                            v46 += 1;
                        } while (v46 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v45;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v44 = 0;
                    do
                    {
                        *((char *)v11 + v44) = *((char *)v9 + v44);
                        v44 += 1;
                    } while (v44 != 672);
                default:
                    return v47;
                }
            }
            else
            {
                switch (v8)
                {
                case 10196401361270752100:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v57 = 0;
                        do
                        {
                            *((char *)v11 + v57) = *((char *)v14 + v57);
                            v57 += 1;
                        } while (v57 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v56;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v55 = 0;
                    do
                    {
                        *((char *)v11 + v55) = *((char *)v9 + v55);
                        v55 += 1;
                    } while (v55 != 672);
                case 12343171505636736757:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v53 = 0;
                        do
                        {
                            *((char *)v11 + v53) = *((char *)v14 + v53);
                            v53 += 1;
                        } while (v53 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v52;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v51 = 0;
                    do
                    {
                        *((char *)v11 + v51) = *((char *)v9 + v51);
                        v51 += 1;
                    } while (v51 != 672);
                default:
                    return v54;
                }
            }
        }
        else
        {
            if (-718140854494822069 >= v8)
            {
                switch (v8)
                {
                case 13129879496715738648:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v64 = 0;
                        do
                        {
                            *((char *)v11 + v64) = *((char *)v14 + v64);
                            v64 += 1;
                        } while (v64 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v63;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v62 = 0;
                    do
                    {
                        *((char *)v11 + v62) = *((char *)v9 + v62);
                        v62 += 1;
                    } while (v62 != 672);
                case 15917493167019201054:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v60 = 0;
                        do
                        {
                            *((char *)v11 + v60) = *((char *)v14 + v60);
                            v60 += 1;
                        } while (v60 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v59;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v58 = 0;
                    do
                    {
                        *((char *)v11 + v58) = *((char *)v9 + v58);
                        v58 += 1;
                    } while (v58 != 672);
                default:
                    return v61;
                }
            }
            else
            {
                switch (v8)
                {
                case 17728603219214729548:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v92 = 0;
                        do
                        {
                            *((char *)v11 + v92) = *((char *)v14 + v92);
                            v92 += 1;
                        } while (v92 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v91;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
                    v69 = 0;
                    do
                    {
                        *((char *)v11 + v69) = *((char *)v9 + v69);
                        v69 += 1;
                    } while (v69 != 672);
                case 18367110424166470733:
                    v1 = &v0;
                    v0 = &v1;
                    if (v7 == 3)
                    {
                        v14 = *v6;
                        v10 = (long long)v14[16];
                        v11 = operatornew(672);
                        _bzero(v11, 672);
                        if (31 < v11 - v14)
                            goto LABEL_25a87c;
                        v67 = 0;
                        do
                        {
                            *((char *)v11 + v67) = *((char *)v14 + v67);
                            v67 += 1;
                        } while (v67 != 672);
                        goto LABEL_25a924;
                    }
                    if (v7 != 2)
                        return v66;
                    v9 = *v6;
                    v10 = (long long)v9[24];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v9)
                        goto LABEL_25a340;
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
    }
    *(unsigned long long *)&v11[24] = 2462860;
    *v6 = v11;
    v114 = operatornew(32);
    v114->field_0 = 0;
    v114->field_8 = v10;
    v114->field_10 = 0;
    v114->field_18 = 0;
    v2 = v6;
    v3 = v114;
    sub_2592b4(&g_f11980, &v2);
    return v115;
}

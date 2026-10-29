/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25e35c..0x25ecf0 (2452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25e35c_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_25e35c_1;

typedef struct st_25e35c_0 {
    void* field_0;
} st_25e35c_0;

typedef struct st_25e35c_2 {
    char field_0;
} st_25e35c_2;

extern long long g_f11980;

int sub_25e35c(unsigned int a0, st_25e35c_0 **a1, unsigned int *a2, long long *a3)
{
    void* *v6;  // x20
    unsigned int v7;  // w8
    unsigned int v16;  // w0
    long long i2;  // x8
    unsigned int v18;  // w0
    long long i12;  // x8
    long long i0;  // x8
    unsigned int v21;  // w0
    long long i8;  // x8
    long long k;  // x8
    unsigned int v24;  // w0
    long long i4;  // x8
    long long v8;  // x9
    unsigned int v26;  // w0
    long long m;  // x8
    unsigned int v28;  // w0
    long long i6;  // x8
    long long j;  // x8
    unsigned int v31;  // w0
    long long i11;  // x8
    unsigned int v33;  // w0
    long long i3;  // x8
    unsigned int v35;  // w0
    void* v9;  // x22
    long long i13;  // x8
    long long i1;  // x8
    unsigned int v38;  // w0
    long long i9;  // x8
    long long l;  // x8
    unsigned int v41;  // w0
    long long i5;  // x8
    unsigned int v43;  // w0
    long long n;  // x8
    uint128_t v45;  // q1
    unsigned long v10;  // x21
    uint128_t v46;  // q1
    uint128_t v47;  // q1
    uint128_t v48;  // q1
    uint128_t v49;  // q1
    uint128_t v50;  // q1
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
    long long i;  // x8
    unsigned int v66;  // w0
    long long i7;  // x8
    uint128_t v68;  // q1
    uint128_t v69;  // q1
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
    st_25e35c_1 *v89;  // x0
    unsigned int v90;  // w0
    long long i10;  // x8
    st_25e35c_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_25e35c_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_25e35c_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    v8 = *a3;
    if (4505772126206265561 >= v8)
    {
        if (v8 > -1545470499475332087)
        {
            if (v8 == -1545470499475332086)
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
                        goto LABEL_25ebfc;
                    i8 = 0;
                    do
                    {
                        *((char *)v11 + i8) = *((char *)v14 + i8);
                        i8 += 1;
                    } while (i8 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v21;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
                i0 = 0;
                do
                {
                    *((char *)v11 + i0) = *((char *)v9 + i0);
                    i0 += 1;
                } while (i0 != 672);
            }
            else if (v8 != 0x288ff1bc7cfcdaf8)
            {
                if (v8 != 3523858734850622659)
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
                        goto LABEL_25ebfc;
                    i10 = 0;
                    do
                    {
                        *((char *)v11 + i10) = *((char *)v14 + i10);
                        i10 += 1;
                    } while (i10 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v13;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
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
                        goto LABEL_25ebfc;
                    i12 = 0;
                    do
                    {
                        *((char *)v11 + i12) = *((char *)v14 + i12);
                        i12 += 1;
                    } while (i12 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v18;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
                i2 = 0;
                do
                {
                    *((char *)v11 + i2) = *((char *)v9 + i2);
                    i2 += 1;
                } while (i2 != 672);
            }
        }
        else
        {
            if (v8 != -0x7c47fa1700e814e8)
            {
                if (v8 != -4901537551520464737)
                    return v26;
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_25ebfc;
                    i4 = 0;
                    do
                    {
                        *((char *)v11 + i4) = *((char *)v14 + i4);
                        i4 += 1;
                    } while (i4 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v24;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
                k = 0;
                do
                {
                    *((char *)v11 + k) = *((char *)v9 + k);
                    k += 1;
                } while (k != 672);
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
                        goto LABEL_25ebfc;
                    i6 = 0;
                    do
                    {
                        *((char *)v11 + i6) = *((char *)v14 + i6);
                        i6 += 1;
                    } while (i6 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v28;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
                m = 0;
                do
                {
                    *((char *)v11 + m) = *((char *)v9 + m);
                    m += 1;
                } while (m != 672);
            }
        }
    }
    else
    {
        if (v8 > 5562616537307523903)
        {
            if (v8 == 5562616537307523904)
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
                        goto LABEL_25ebfc;
                    i9 = 0;
                    do
                    {
                        *((char *)v11 + i9) = *((char *)v14 + i9);
                        i9 += 1;
                    } while (i9 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v38;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
                i1 = 0;
                do
                {
                    *((char *)v11 + i1) = *((char *)v9 + i1);
                    i1 += 1;
                } while (i1 != 672);
            }
            else if (v8 != 5959728304416166631)
            {
                if (v8 != 7714213535090315742)
                    return v33;
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_25ebfc;
                    i11 = 0;
                    do
                    {
                        *((char *)v11 + i11) = *((char *)v14 + i11);
                        i11 += 1;
                    } while (i11 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v31;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
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
                    if (31 >= v11 - v14)
                    {
                        i13 = 0;
                        do
                        {
                            *((char *)v11 + i13) = *((char *)v14 + i13);
                            i13 += 1;
                        } while (i13 != 672);
                    }
                    else
                    {
LABEL_25ebfc:
                        v68 = (int128_t)v14[16];
                        *(int128_t *)v11 = *(int128_t *)v14;
                        *(uint128_t *)&v11[16] = v68;
                        v69 = (int128_t)v14[48];
                        *(int128_t *)&v11[32] = (int128_t)v14[32];
                        *(uint128_t *)&v11[48] = v69;
                        v70 = (int128_t)v14[80];
                        *(int128_t *)&v11[64] = (int128_t)v14[64];
                        *(uint128_t *)&v11[80] = v70;
                        v71 = (int128_t)v14[112];
                        *(int128_t *)&v11[96] = (int128_t)v14[96];
                        *(uint128_t *)&v11[112] = v71;
                        v72 = (int128_t)v14[144];
                        *(int128_t *)&v11[128] = (int128_t)v14[128];
                        *(uint128_t *)&v11[144] = v72;
                        v73 = (int128_t)v14[176];
                        *(int128_t *)&v11[160] = (int128_t)v14[160];
                        *(uint128_t *)&v11[176] = v73;
                        v74 = (int128_t)v14[208];
                        *(int128_t *)&v11[192] = (int128_t)v14[192];
                        *(uint128_t *)&v11[208] = v74;
                        v75 = (int128_t)v14[240];
                        *(int128_t *)&v11[224] = (int128_t)v14[224];
                        *(uint128_t *)&v11[240] = v75;
                        v76 = (int128_t)v14[272];
                        *(int128_t *)&v11[0x100] = (int128_t)v14[0x100];
                        *(uint128_t *)&v11[272] = v76;
                        v77 = (int128_t)v14[304];
                        *(int128_t *)&v11[288] = (int128_t)v14[288];
                        *(uint128_t *)&v11[304] = v77;
                        v78 = (int128_t)v14[336];
                        *(int128_t *)&v11[320] = (int128_t)v14[320];
                        *(uint128_t *)&v11[336] = v78;
                        v79 = (int128_t)v14[368];
                        *(int128_t *)&v11[352] = (int128_t)v14[352];
                        *(uint128_t *)&v11[368] = v79;
                        v80 = (int128_t)v14[400];
                        *(int128_t *)&v11[384] = (int128_t)v14[384];
                        *(uint128_t *)&v11[400] = v80;
                        v81 = (int128_t)v14[432];
                        *(int128_t *)&v11[416] = (int128_t)v14[416];
                        *(uint128_t *)&v11[432] = v81;
                        v82 = (int128_t)v14[464];
                        *(int128_t *)&v11[448] = (int128_t)v14[448];
                        *(uint128_t *)&v11[464] = v82;
                        v83 = (int128_t)v14[496];
                        *(int128_t *)&v11[480] = (int128_t)v14[480];
                        *(uint128_t *)&v11[496] = v83;
                        v84 = (int128_t)v14[528];
                        *(int128_t *)&v11[0x200] = (int128_t)v14[0x200];
                        *(uint128_t *)&v11[528] = v84;
                        v85 = (int128_t)v14[560];
                        *(int128_t *)&v11[544] = (int128_t)v14[544];
                        *(uint128_t *)&v11[560] = v85;
                        v86 = (int128_t)v14[592];
                        *(int128_t *)&v11[576] = (int128_t)v14[576];
                        *(uint128_t *)&v11[592] = v86;
                        v87 = (int128_t)v14[624];
                        *(int128_t *)&v11[608] = (int128_t)v14[608];
                        *(uint128_t *)&v11[624] = v87;
                        v88 = (int128_t)v14[656];
                        *(int128_t *)&v11[640] = (int128_t)v14[640];
                        *(uint128_t *)&v11[656] = v88;
                    }
LABEL_25eca4:
                    *(unsigned long long *)&v11[16] = 2456424;
                    *v6 = v11;
                    v89 = operatornew(32);
                    v89->field_0 = 0;
                    v89->field_8 = v10;
                    v89->field_10 = 0;
                    v89->field_18 = 0;
                    v2 = v6;
                    v3 = v89;
                    sub_2592b4(&g_f11980, &v2);
                    return v90;
                }
                if (v7 != 2)
                    return v35;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 >= v11 - v9)
                {
                    i3 = 0;
                    do
                    {
                        *((char *)v11 + i3) = *((char *)v9 + i3);
                        i3 += 1;
                    } while (i3 != 672);
                }
                else
                {
LABEL_25e89c:
                    v45 = (int128_t)v9[16];
                    *(int128_t *)v11 = *(int128_t *)v9;
                    *(uint128_t *)&v11[16] = v45;
                    v46 = (int128_t)v9[48];
                    *(int128_t *)&v11[32] = (int128_t)v9[32];
                    *(uint128_t *)&v11[48] = v46;
                    v47 = (int128_t)v9[80];
                    *(int128_t *)&v11[64] = (int128_t)v9[64];
                    *(uint128_t *)&v11[80] = v47;
                    v48 = (int128_t)v9[112];
                    *(int128_t *)&v11[96] = (int128_t)v9[96];
                    *(uint128_t *)&v11[112] = v48;
                    v49 = (int128_t)v9[144];
                    *(int128_t *)&v11[128] = (int128_t)v9[128];
                    *(uint128_t *)&v11[144] = v49;
                    v50 = (int128_t)v9[176];
                    *(int128_t *)&v11[160] = (int128_t)v9[160];
                    *(uint128_t *)&v11[176] = v50;
                    v51 = (int128_t)v9[208];
                    *(int128_t *)&v11[192] = (int128_t)v9[192];
                    *(uint128_t *)&v11[208] = v51;
                    v52 = (int128_t)v9[240];
                    *(int128_t *)&v11[224] = (int128_t)v9[224];
                    *(uint128_t *)&v11[240] = v52;
                    v53 = (int128_t)v9[272];
                    *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                    *(uint128_t *)&v11[272] = v53;
                    v54 = (int128_t)v9[304];
                    *(int128_t *)&v11[288] = (int128_t)v9[288];
                    *(uint128_t *)&v11[304] = v54;
                    v55 = (int128_t)v9[336];
                    *(int128_t *)&v11[320] = (int128_t)v9[320];
                    *(uint128_t *)&v11[336] = v55;
                    v56 = (int128_t)v9[368];
                    *(int128_t *)&v11[352] = (int128_t)v9[352];
                    *(uint128_t *)&v11[368] = v56;
                    v57 = (int128_t)v9[400];
                    *(int128_t *)&v11[384] = (int128_t)v9[384];
                    *(uint128_t *)&v11[400] = v57;
                    v58 = (int128_t)v9[432];
                    *(int128_t *)&v11[416] = (int128_t)v9[416];
                    *(uint128_t *)&v11[432] = v58;
                    v59 = (int128_t)v9[464];
                    *(int128_t *)&v11[448] = (int128_t)v9[448];
                    *(uint128_t *)&v11[464] = v59;
                    v60 = (int128_t)v9[496];
                    *(int128_t *)&v11[480] = (int128_t)v9[480];
                    *(uint128_t *)&v11[496] = v60;
                    v61 = (int128_t)v9[528];
                    *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                    *(uint128_t *)&v11[528] = v61;
                    v62 = (int128_t)v9[560];
                    *(int128_t *)&v11[544] = (int128_t)v9[544];
                    *(uint128_t *)&v11[560] = v62;
                    v63 = (int128_t)v9[592];
                    *(int128_t *)&v11[576] = (int128_t)v9[576];
                    *(uint128_t *)&v11[592] = v63;
                    v64 = (int128_t)v9[624];
                    *(int128_t *)&v11[608] = (int128_t)v9[608];
                    *(uint128_t *)&v11[624] = v64;
                    v65 = (int128_t)v9[656];
                    *(int128_t *)&v11[640] = (int128_t)v9[640];
                    *(uint128_t *)&v11[656] = v65;
                }
            }
        }
        else
        {
            if (v8 != 4505772126206265562)
            {
                if (v8 != 4775711412269194811)
                    return v43;
                v1 = &v0;
                v0 = &v1;
                if (v7 == 3)
                {
                    v14 = *v6;
                    v10 = (long long)v14[16];
                    v11 = operatornew(672);
                    _bzero(v11, 672);
                    if (31 < v11 - v14)
                        goto LABEL_25ebfc;
                    i5 = 0;
                    do
                    {
                        *((char *)v11 + i5) = *((char *)v14 + i5);
                        i5 += 1;
                    } while (i5 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v41;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
                l = 0;
                do
                {
                    *((char *)v11 + l) = *((char *)v9 + l);
                    l += 1;
                } while (l != 672);
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
                        goto LABEL_25ebfc;
                    i7 = 0;
                    do
                    {
                        *((char *)v11 + i7) = *((char *)v14 + i7);
                        i7 += 1;
                    } while (i7 != 672);
                    goto LABEL_25eca4;
                }
                if (v7 != 2)
                    return v66;
                v9 = *v6;
                v10 = (long long)v9[24];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v9)
                    goto LABEL_25e89c;
                n = 0;
                do
                {
                    *((char *)v11 + n) = *((char *)v9 + n);
                    n += 1;
                } while (n != 672);
            }
        }
    }
    *(unsigned long long *)&v11[24] = 2462860;
    *v6 = v11;
    v89 = operatornew(32);
    v89->field_0 = 0;
    v89->field_8 = v10;
    v89->field_10 = 0;
    v89->field_18 = 0;
    v2 = v6;
    v3 = v89;
    sub_2592b4(&g_f11980, &v2);
    return v90;
}

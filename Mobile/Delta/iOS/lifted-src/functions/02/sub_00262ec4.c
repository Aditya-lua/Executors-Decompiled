/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x262ec4..0x263600 (1852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_262ec4_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_262ec4_1;

typedef struct st_262ec4_0 {
    void* field_0;
} st_262ec4_0;

typedef struct st_262ec4_2 {
    char field_0;
} st_262ec4_2;

extern long long g_f11980;

int sub_262ec4(unsigned int a0, st_262ec4_0 **a1, unsigned int *a2, long long *a3)
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
    unsigned int v23;  // w0
    long long v24;  // x8
    unsigned int v25;  // w0
    long long v8;  // x9
    long long v26;  // x8
    long long v27;  // x8
    unsigned int v28;  // w0
    long long v29;  // x8
    unsigned int v30;  // w0
    long long v31;  // x8
    unsigned int v32;  // w0
    long long v33;  // x8
    long long v34;  // x8
    uint128_t v35;  // q1
    void* v9;  // x22
    uint128_t v36;  // q1
    uint128_t v37;  // q1
    uint128_t v38;  // q1
    uint128_t v39;  // q1
    uint128_t v40;  // q1
    uint128_t v41;  // q1
    uint128_t v42;  // q1
    uint128_t v43;  // q1
    uint128_t v44;  // q1
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
    unsigned int v56;  // w0
    long long v57;  // x8
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
    uint128_t v72;  // q1
    uint128_t v73;  // q1
    uint128_t v74;  // q1
    uint128_t v75;  // q1
    unsigned int v13;  // w0
    uint128_t v76;  // q1
    uint128_t v77;  // q1
    uint128_t v78;  // q1
    st_262ec4_1 *v79;  // x0
    unsigned int v80;  // w0
    void* v14;  // x22
    long long v15;  // x8
    st_262ec4_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_262ec4_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_262ec4_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    if (*a3 <= -4725998778889554952)
    {
        switch (v8)
        {
        case 11526500634453578431:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_26350c;
                v57 = 0;
                do
                {
                    *((char *)v11 + v57) = *((char *)v14 + v57);
                    v57 += 1;
                } while (v57 != 672);
                goto LABEL_2635b4;
            }
            if (v7 != 2)
                return v56;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_263278;
            v34 = 0;
            do
            {
                *((char *)v11 + v34) = *((char *)v9 + v34);
                v34 += 1;
            } while (v34 != 672);
        case 11711208459152658598:
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
                    v33 = 0;
                    do
                    {
                        *((char *)v11 + v33) = *((char *)v14 + v33);
                        v33 += 1;
                    } while (v33 != 672);
                }
                else
                {
LABEL_26350c:
                    v58 = (int128_t)v14[16];
                    *(int128_t *)v11 = *(int128_t *)v14;
                    *(uint128_t *)&v11[16] = v58;
                    v59 = (int128_t)v14[48];
                    *(int128_t *)&v11[32] = (int128_t)v14[32];
                    *(uint128_t *)&v11[48] = v59;
                    v60 = (int128_t)v14[80];
                    *(int128_t *)&v11[64] = (int128_t)v14[64];
                    *(uint128_t *)&v11[80] = v60;
                    v61 = (int128_t)v14[112];
                    *(int128_t *)&v11[96] = (int128_t)v14[96];
                    *(uint128_t *)&v11[112] = v61;
                    v62 = (int128_t)v14[144];
                    *(int128_t *)&v11[128] = (int128_t)v14[128];
                    *(uint128_t *)&v11[144] = v62;
                    v63 = (int128_t)v14[176];
                    *(int128_t *)&v11[160] = (int128_t)v14[160];
                    *(uint128_t *)&v11[176] = v63;
                    v64 = (int128_t)v14[208];
                    *(int128_t *)&v11[192] = (int128_t)v14[192];
                    *(uint128_t *)&v11[208] = v64;
                    v65 = (int128_t)v14[240];
                    *(int128_t *)&v11[224] = (int128_t)v14[224];
                    *(uint128_t *)&v11[240] = v65;
                    v66 = (int128_t)v14[272];
                    *(int128_t *)&v11[0x100] = (int128_t)v14[0x100];
                    *(uint128_t *)&v11[272] = v66;
                    v67 = (int128_t)v14[304];
                    *(int128_t *)&v11[288] = (int128_t)v14[288];
                    *(uint128_t *)&v11[304] = v67;
                    v68 = (int128_t)v14[336];
                    *(int128_t *)&v11[320] = (int128_t)v14[320];
                    *(uint128_t *)&v11[336] = v68;
                    v69 = (int128_t)v14[368];
                    *(int128_t *)&v11[352] = (int128_t)v14[352];
                    *(uint128_t *)&v11[368] = v69;
                    v70 = (int128_t)v14[400];
                    *(int128_t *)&v11[384] = (int128_t)v14[384];
                    *(uint128_t *)&v11[400] = v70;
                    v71 = (int128_t)v14[432];
                    *(int128_t *)&v11[416] = (int128_t)v14[416];
                    *(uint128_t *)&v11[432] = v71;
                    v72 = (int128_t)v14[464];
                    *(int128_t *)&v11[448] = (int128_t)v14[448];
                    *(uint128_t *)&v11[464] = v72;
                    v73 = (int128_t)v14[496];
                    *(int128_t *)&v11[480] = (int128_t)v14[480];
                    *(uint128_t *)&v11[496] = v73;
                    v74 = (int128_t)v14[528];
                    *(int128_t *)&v11[0x200] = (int128_t)v14[0x200];
                    *(uint128_t *)&v11[528] = v74;
                    v75 = (int128_t)v14[560];
                    *(int128_t *)&v11[544] = (int128_t)v14[544];
                    *(uint128_t *)&v11[560] = v75;
                    v76 = (int128_t)v14[592];
                    *(int128_t *)&v11[576] = (int128_t)v14[576];
                    *(uint128_t *)&v11[592] = v76;
                    v77 = (int128_t)v14[624];
                    *(int128_t *)&v11[608] = (int128_t)v14[608];
                    *(uint128_t *)&v11[624] = v77;
                    v78 = (int128_t)v14[656];
                    *(int128_t *)&v11[640] = (int128_t)v14[640];
                    *(uint128_t *)&v11[656] = v78;
                }
LABEL_2635b4:
                *(unsigned long long *)&v11[16] = 2456424;
                *v6 = v11;
                v79 = operatornew(32);
                v79->field_0 = 0;
                v79->field_8 = v10;
                v79->field_10 = 0;
                v79->field_18 = 0;
                v2 = v6;
                v3 = v79;
                sub_2592b4(&g_f11980, &v2);
                return v80;
            }
            if (v7 != 2)
                return v32;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 >= v11 - v9)
            {
                v31 = 0;
                do
                {
                    *((char *)v11 + v31) = *((char *)v9 + v31);
                    v31 += 1;
                } while (v31 != 672);
            }
            else
            {
LABEL_263278:
                v35 = (int128_t)v9[16];
                *(int128_t *)v11 = *(int128_t *)v9;
                *(uint128_t *)&v11[16] = v35;
                v36 = (int128_t)v9[48];
                *(int128_t *)&v11[32] = (int128_t)v9[32];
                *(uint128_t *)&v11[48] = v36;
                v37 = (int128_t)v9[80];
                *(int128_t *)&v11[64] = (int128_t)v9[64];
                *(uint128_t *)&v11[80] = v37;
                v38 = (int128_t)v9[112];
                *(int128_t *)&v11[96] = (int128_t)v9[96];
                *(uint128_t *)&v11[112] = v38;
                v39 = (int128_t)v9[144];
                *(int128_t *)&v11[128] = (int128_t)v9[128];
                *(uint128_t *)&v11[144] = v39;
                v40 = (int128_t)v9[176];
                *(int128_t *)&v11[160] = (int128_t)v9[160];
                *(uint128_t *)&v11[176] = v40;
                v41 = (int128_t)v9[208];
                *(int128_t *)&v11[192] = (int128_t)v9[192];
                *(uint128_t *)&v11[208] = v41;
                v42 = (int128_t)v9[240];
                *(int128_t *)&v11[224] = (int128_t)v9[224];
                *(uint128_t *)&v11[240] = v42;
                v43 = (int128_t)v9[272];
                *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                *(uint128_t *)&v11[272] = v43;
                v44 = (int128_t)v9[304];
                *(int128_t *)&v11[288] = (int128_t)v9[288];
                *(uint128_t *)&v11[304] = v44;
                v45 = (int128_t)v9[336];
                *(int128_t *)&v11[320] = (int128_t)v9[320];
                *(uint128_t *)&v11[336] = v45;
                v46 = (int128_t)v9[368];
                *(int128_t *)&v11[352] = (int128_t)v9[352];
                *(uint128_t *)&v11[368] = v46;
                v47 = (int128_t)v9[400];
                *(int128_t *)&v11[384] = (int128_t)v9[384];
                *(uint128_t *)&v11[400] = v47;
                v48 = (int128_t)v9[432];
                *(int128_t *)&v11[416] = (int128_t)v9[416];
                *(uint128_t *)&v11[432] = v48;
                v49 = (int128_t)v9[464];
                *(int128_t *)&v11[448] = (int128_t)v9[448];
                *(uint128_t *)&v11[464] = v49;
                v50 = (int128_t)v9[496];
                *(int128_t *)&v11[480] = (int128_t)v9[480];
                *(uint128_t *)&v11[496] = v50;
                v51 = (int128_t)v9[528];
                *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                *(uint128_t *)&v11[528] = v51;
                v52 = (int128_t)v9[560];
                *(int128_t *)&v11[544] = (int128_t)v9[544];
                *(uint128_t *)&v11[560] = v52;
                v53 = (int128_t)v9[592];
                *(int128_t *)&v11[576] = (int128_t)v9[576];
                *(uint128_t *)&v11[592] = v53;
                v54 = (int128_t)v9[624];
                *(int128_t *)&v11[608] = (int128_t)v9[608];
                *(uint128_t *)&v11[624] = v54;
                v55 = (int128_t)v9[656];
                *(int128_t *)&v11[640] = (int128_t)v9[640];
                *(uint128_t *)&v11[656] = v55;
                break;
            }
        case 12050845198663372030:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_26350c;
                v29 = 0;
                do
                {
                    *((char *)v11 + v29) = *((char *)v14 + v29);
                    v29 += 1;
                } while (v29 != 672);
                goto LABEL_2635b4;
            }
            if (v7 != 2)
                return v28;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_263278;
            v27 = 0;
            do
            {
                *((char *)v11 + v27) = *((char *)v9 + v27);
                v27 += 1;
            } while (v27 != 672);
        default:
            return v30;
        }
    }
    else if (-1735334470704603671 >= *a3)
    {
        switch (v8)
        {
        case 13720745294819996665:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_26350c;
                v19 = 0;
                do
                {
                    *((char *)v11 + v19) = *((char *)v14 + v19);
                    v19 += 1;
                } while (v19 != 672);
                goto LABEL_2635b4;
            }
            if (v7 != 2)
                return v18;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_263278;
            v17 = 0;
            do
            {
                *((char *)v11 + v17) = *((char *)v9 + v17);
                v17 += 1;
            } while (v17 != 672);
        case 16417033663498032162:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_26350c;
                v15 = 0;
                do
                {
                    *((char *)v11 + v15) = *((char *)v14 + v15);
                    v15 += 1;
                } while (v15 != 672);
                goto LABEL_2635b4;
            }
            if (v7 != 2)
                return v13;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_263278;
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
        case 16711409603004947946:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_26350c;
                v26 = 0;
                do
                {
                    *((char *)v11 + v26) = *((char *)v14 + v26);
                    v26 += 1;
                } while (v26 != 672);
                goto LABEL_2635b4;
            }
            if (v7 != 2)
                return v25;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_263278;
            v24 = 0;
            do
            {
                *((char *)v11 + v24) = *((char *)v9 + v24);
                v24 += 1;
            } while (v24 != 672);
        case 867371542930547451:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_26350c;
                v22 = 0;
                do
                {
                    *((char *)v11 + v22) = *((char *)v14 + v22);
                    v22 += 1;
                } while (v22 != 672);
                goto LABEL_2635b4;
            }
            if (v7 != 2)
                return v21;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_263278;
            v20 = 0;
            do
            {
                *((char *)v11 + v20) = *((char *)v9 + v20);
                v20 += 1;
            } while (v20 != 672);
        default:
            return v23;
        }
    }
    *(unsigned long long *)&v11[24] = 2462860;
    *v6 = v11;
    v79 = operatornew(32);
    v79->field_0 = 0;
    v79->field_8 = v10;
    v79->field_10 = 0;
    v79->field_18 = 0;
    v2 = v6;
    v3 = v79;
    sub_2592b4(&g_f11980, &v2);
    return v80;
}

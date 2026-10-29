/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x254f08..0x2553ec (1252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_254f08_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_254f08_1;

typedef struct st_254f08_0 {
    void* field_0;
} st_254f08_0;

typedef struct st_254f08_2 {
    char field_0;
} st_254f08_2;

extern long long g_f11980;

int sub_254f08(unsigned int a0, st_254f08_0 **a1, unsigned int *a2, long long *a3)
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
    uint128_t v25;  // q1
    long long v8;  // x9
    uint128_t v26;  // q1
    uint128_t v27;  // q1
    uint128_t v28;  // q1
    uint128_t v29;  // q1
    uint128_t v30;  // q1
    uint128_t v31;  // q1
    uint128_t v32;  // q1
    uint128_t v33;  // q1
    uint128_t v34;  // q1
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
    unsigned int v46;  // w0
    long long v47;  // x8
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
    long long v12;  // x8
    uint128_t v66;  // q1
    uint128_t v67;  // q1
    uint128_t v68;  // q1
    st_254f08_1 *v69;  // x0
    unsigned int v70;  // w0
    unsigned int v13;  // w0
    void* v14;  // x22
    long long v15;  // x8
    st_254f08_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_254f08_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_254f08_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    if (1261069375956022009 >= *a3)
    {
        switch (v8)
        {
        case 12646176450407567261:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_2552f8;
                v19 = 0;
                do
                {
                    *((char *)v11 + v19) = *((char *)v14 + v19);
                    v19 += 1;
                } while (v19 != 672);
                goto LABEL_2553a0;
            }
            if (v7 != 2)
                return v18;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_255130;
            v17 = 0;
            do
            {
                *((char *)v11 + v17) = *((char *)v9 + v17);
                v17 += 1;
            } while (v17 != 672);
        case 410081406168541697:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_2552f8;
                v15 = 0;
                do
                {
                    *((char *)v11 + v15) = *((char *)v14 + v15);
                    v15 += 1;
                } while (v15 != 672);
                goto LABEL_2553a0;
            }
            if (v7 != 2)
                return v13;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_255130;
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
        case 1261069375956022010:
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
                    v47 = 0;
                    do
                    {
                        *((char *)v11 + v47) = *((char *)v14 + v47);
                        v47 += 1;
                    } while (v47 != 672);
                }
                else
                {
LABEL_2552f8:
                    v48 = (int128_t)v14[16];
                    *(int128_t *)v11 = *(int128_t *)v14;
                    *(uint128_t *)&v11[16] = v48;
                    v49 = (int128_t)v14[48];
                    *(int128_t *)&v11[32] = (int128_t)v14[32];
                    *(uint128_t *)&v11[48] = v49;
                    v50 = (int128_t)v14[80];
                    *(int128_t *)&v11[64] = (int128_t)v14[64];
                    *(uint128_t *)&v11[80] = v50;
                    v51 = (int128_t)v14[112];
                    *(int128_t *)&v11[96] = (int128_t)v14[96];
                    *(uint128_t *)&v11[112] = v51;
                    v52 = (int128_t)v14[144];
                    *(int128_t *)&v11[128] = (int128_t)v14[128];
                    *(uint128_t *)&v11[144] = v52;
                    v53 = (int128_t)v14[176];
                    *(int128_t *)&v11[160] = (int128_t)v14[160];
                    *(uint128_t *)&v11[176] = v53;
                    v54 = (int128_t)v14[208];
                    *(int128_t *)&v11[192] = (int128_t)v14[192];
                    *(uint128_t *)&v11[208] = v54;
                    v55 = (int128_t)v14[240];
                    *(int128_t *)&v11[224] = (int128_t)v14[224];
                    *(uint128_t *)&v11[240] = v55;
                    v56 = (int128_t)v14[272];
                    *(int128_t *)&v11[0x100] = (int128_t)v14[0x100];
                    *(uint128_t *)&v11[272] = v56;
                    v57 = (int128_t)v14[304];
                    *(int128_t *)&v11[288] = (int128_t)v14[288];
                    *(uint128_t *)&v11[304] = v57;
                    v58 = (int128_t)v14[336];
                    *(int128_t *)&v11[320] = (int128_t)v14[320];
                    *(uint128_t *)&v11[336] = v58;
                    v59 = (int128_t)v14[368];
                    *(int128_t *)&v11[352] = (int128_t)v14[352];
                    *(uint128_t *)&v11[368] = v59;
                    v60 = (int128_t)v14[400];
                    *(int128_t *)&v11[384] = (int128_t)v14[384];
                    *(uint128_t *)&v11[400] = v60;
                    v61 = (int128_t)v14[432];
                    *(int128_t *)&v11[416] = (int128_t)v14[416];
                    *(uint128_t *)&v11[432] = v61;
                    v62 = (int128_t)v14[464];
                    *(int128_t *)&v11[448] = (int128_t)v14[448];
                    *(uint128_t *)&v11[464] = v62;
                    v63 = (int128_t)v14[496];
                    *(int128_t *)&v11[480] = (int128_t)v14[480];
                    *(uint128_t *)&v11[496] = v63;
                    v64 = (int128_t)v14[528];
                    *(int128_t *)&v11[0x200] = (int128_t)v14[0x200];
                    *(uint128_t *)&v11[528] = v64;
                    v65 = (int128_t)v14[560];
                    *(int128_t *)&v11[544] = (int128_t)v14[544];
                    *(uint128_t *)&v11[560] = v65;
                    v66 = (int128_t)v14[592];
                    *(int128_t *)&v11[576] = (int128_t)v14[576];
                    *(uint128_t *)&v11[592] = v66;
                    v67 = (int128_t)v14[624];
                    *(int128_t *)&v11[608] = (int128_t)v14[608];
                    *(uint128_t *)&v11[624] = v67;
                    v68 = (int128_t)v14[656];
                    *(int128_t *)&v11[640] = (int128_t)v14[640];
                    *(uint128_t *)&v11[656] = v68;
                }
LABEL_2553a0:
                *(unsigned long long *)&v11[16] = 2456424;
                *v6 = v11;
                v69 = operatornew(32);
                v69->field_0 = 0;
                v69->field_8 = v10;
                v69->field_10 = 0;
                v69->field_18 = 0;
                v2 = v6;
                v3 = v69;
                sub_2592b4(&g_f11980, &v2);
                return v70;
            }
            if (v7 != 2)
                return v46;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 >= v11 - v9)
            {
                v24 = 0;
                do
                {
                    *((char *)v11 + v24) = *((char *)v9 + v24);
                    v24 += 1;
                } while (v24 != 672);
            }
            else
            {
LABEL_255130:
                v25 = (int128_t)v9[16];
                *(int128_t *)v11 = *(int128_t *)v9;
                *(uint128_t *)&v11[16] = v25;
                v26 = (int128_t)v9[48];
                *(int128_t *)&v11[32] = (int128_t)v9[32];
                *(uint128_t *)&v11[48] = v26;
                v27 = (int128_t)v9[80];
                *(int128_t *)&v11[64] = (int128_t)v9[64];
                *(uint128_t *)&v11[80] = v27;
                v28 = (int128_t)v9[112];
                *(int128_t *)&v11[96] = (int128_t)v9[96];
                *(uint128_t *)&v11[112] = v28;
                v29 = (int128_t)v9[144];
                *(int128_t *)&v11[128] = (int128_t)v9[128];
                *(uint128_t *)&v11[144] = v29;
                v30 = (int128_t)v9[176];
                *(int128_t *)&v11[160] = (int128_t)v9[160];
                *(uint128_t *)&v11[176] = v30;
                v31 = (int128_t)v9[208];
                *(int128_t *)&v11[192] = (int128_t)v9[192];
                *(uint128_t *)&v11[208] = v31;
                v32 = (int128_t)v9[240];
                *(int128_t *)&v11[224] = (int128_t)v9[224];
                *(uint128_t *)&v11[240] = v32;
                v33 = (int128_t)v9[272];
                *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                *(uint128_t *)&v11[272] = v33;
                v34 = (int128_t)v9[304];
                *(int128_t *)&v11[288] = (int128_t)v9[288];
                *(uint128_t *)&v11[304] = v34;
                v35 = (int128_t)v9[336];
                *(int128_t *)&v11[320] = (int128_t)v9[320];
                *(uint128_t *)&v11[336] = v35;
                v36 = (int128_t)v9[368];
                *(int128_t *)&v11[352] = (int128_t)v9[352];
                *(uint128_t *)&v11[368] = v36;
                v37 = (int128_t)v9[400];
                *(int128_t *)&v11[384] = (int128_t)v9[384];
                *(uint128_t *)&v11[400] = v37;
                v38 = (int128_t)v9[432];
                *(int128_t *)&v11[416] = (int128_t)v9[416];
                *(uint128_t *)&v11[432] = v38;
                v39 = (int128_t)v9[464];
                *(int128_t *)&v11[448] = (int128_t)v9[448];
                *(uint128_t *)&v11[464] = v39;
                v40 = (int128_t)v9[496];
                *(int128_t *)&v11[480] = (int128_t)v9[480];
                *(uint128_t *)&v11[496] = v40;
                v41 = (int128_t)v9[528];
                *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                *(uint128_t *)&v11[528] = v41;
                v42 = (int128_t)v9[560];
                *(int128_t *)&v11[544] = (int128_t)v9[544];
                *(uint128_t *)&v11[560] = v42;
                v43 = (int128_t)v9[592];
                *(int128_t *)&v11[576] = (int128_t)v9[576];
                *(uint128_t *)&v11[592] = v43;
                v44 = (int128_t)v9[624];
                *(int128_t *)&v11[608] = (int128_t)v9[608];
                *(uint128_t *)&v11[624] = v44;
                v45 = (int128_t)v9[656];
                *(int128_t *)&v11[640] = (int128_t)v9[640];
                *(uint128_t *)&v11[656] = v45;
                break;
            }
        case 1694596381258191888:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_2552f8;
                v22 = 0;
                do
                {
                    *((char *)v11 + v22) = *((char *)v14 + v22);
                    v22 += 1;
                } while (v22 != 672);
                goto LABEL_2553a0;
            }
            if (v7 != 2)
                return v21;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_255130;
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
    v69 = operatornew(32);
    v69->field_0 = 0;
    v69->field_8 = v10;
    v69->field_10 = 0;
    v69->field_18 = 0;
    v2 = v6;
    v3 = v69;
    sub_2592b4(&g_f11980, &v2);
    return v70;
}

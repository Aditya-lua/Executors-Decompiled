/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25b578..0x25b984 (1036 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25b578_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_25b578_1;

typedef struct st_25b578_0 {
    void* field_0;
} st_25b578_0;

typedef struct st_25b578_2 {
    char field_0;
} st_25b578_2;

extern long long g_f11980;

int sub_25b578(unsigned int a0, st_25b578_0 **a1, unsigned int *a2, unsigned long long *a3)
{
    void* *v6;  // x20
    unsigned int v7;  // w8
    unsigned int v16;  // w0
    long long v17;  // x8
    unsigned int v18;  // w0
    long long v19;  // x8
    long long v20;  // x8
    uint128_t v21;  // q1
    uint128_t v22;  // q1
    uint128_t v23;  // q1
    uint128_t v24;  // q1
    uint128_t v25;  // q1
    unsigned long long v8;  // x9
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
    unsigned int v42;  // w0
    long long v43;  // x8
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
    uint128_t v56;  // q1
    uint128_t v57;  // q1
    uint128_t v58;  // q1
    uint128_t v59;  // q1
    uint128_t v60;  // q1
    uint128_t v61;  // q1
    uint128_t v62;  // q1
    uint128_t v63;  // q1
    uint128_t v64;  // q1
    st_25b578_1 *v65;  // x0
    long long v12;  // x8
    unsigned int v66;  // w0
    unsigned int v13;  // w0
    void* v14;  // x22
    long long v15;  // x8
    st_25b578_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_25b578_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_25b578_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    switch (v8)
    {
    case 7503741118180142156:
        v1 = &v0;
        v0 = &v1;
        if (v7 != 3)
        {
            if (v7 != 2)
                return v42;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 >= v11 - v9)
            {
                v20 = 0;
                do
                {
                    *((char *)v11 + v20) = *((char *)v9 + v20);
                    v20 += 1;
                } while (v20 != 672);
            }
            else
            {
LABEL_25b70c:
                v21 = (int128_t)v9[16];
                *(int128_t *)v11 = *(int128_t *)v9;
                *(uint128_t *)&v11[16] = v21;
                v22 = (int128_t)v9[48];
                *(int128_t *)&v11[32] = (int128_t)v9[32];
                *(uint128_t *)&v11[48] = v22;
                v23 = (int128_t)v9[80];
                *(int128_t *)&v11[64] = (int128_t)v9[64];
                *(uint128_t *)&v11[80] = v23;
                v24 = (int128_t)v9[112];
                *(int128_t *)&v11[96] = (int128_t)v9[96];
                *(uint128_t *)&v11[112] = v24;
                v25 = (int128_t)v9[144];
                *(int128_t *)&v11[128] = (int128_t)v9[128];
                *(uint128_t *)&v11[144] = v25;
                v26 = (int128_t)v9[176];
                *(int128_t *)&v11[160] = (int128_t)v9[160];
                *(uint128_t *)&v11[176] = v26;
                v27 = (int128_t)v9[208];
                *(int128_t *)&v11[192] = (int128_t)v9[192];
                *(uint128_t *)&v11[208] = v27;
                v28 = (int128_t)v9[240];
                *(int128_t *)&v11[224] = (int128_t)v9[224];
                *(uint128_t *)&v11[240] = v28;
                v29 = (int128_t)v9[272];
                *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                *(uint128_t *)&v11[272] = v29;
                v30 = (int128_t)v9[304];
                *(int128_t *)&v11[288] = (int128_t)v9[288];
                *(uint128_t *)&v11[304] = v30;
                v31 = (int128_t)v9[336];
                *(int128_t *)&v11[320] = (int128_t)v9[320];
                *(uint128_t *)&v11[336] = v31;
                v32 = (int128_t)v9[368];
                *(int128_t *)&v11[352] = (int128_t)v9[352];
                *(uint128_t *)&v11[368] = v32;
                v33 = (int128_t)v9[400];
                *(int128_t *)&v11[384] = (int128_t)v9[384];
                *(uint128_t *)&v11[400] = v33;
                v34 = (int128_t)v9[432];
                *(int128_t *)&v11[416] = (int128_t)v9[416];
                *(uint128_t *)&v11[432] = v34;
                v35 = (int128_t)v9[464];
                *(int128_t *)&v11[448] = (int128_t)v9[448];
                *(uint128_t *)&v11[464] = v35;
                v36 = (int128_t)v9[496];
                *(int128_t *)&v11[480] = (int128_t)v9[480];
                *(uint128_t *)&v11[496] = v36;
                v37 = (int128_t)v9[528];
                *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                *(uint128_t *)&v11[528] = v37;
                v38 = (int128_t)v9[560];
                *(int128_t *)&v11[544] = (int128_t)v9[544];
                *(uint128_t *)&v11[560] = v38;
                v39 = (int128_t)v9[592];
                *(int128_t *)&v11[576] = (int128_t)v9[576];
                *(uint128_t *)&v11[592] = v39;
                v40 = (int128_t)v9[624];
                *(int128_t *)&v11[608] = (int128_t)v9[608];
                *(uint128_t *)&v11[624] = v40;
                v41 = (int128_t)v9[656];
                *(int128_t *)&v11[640] = (int128_t)v9[640];
                *(uint128_t *)&v11[656] = v41;
                break;
            }
        }
        else
        {
            v14 = *v6;
            v10 = (long long)v14[16];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v14)
                goto LABEL_25b890;
            v43 = 0;
            do
            {
                *((char *)v11 + v43) = *((char *)v14 + v43);
                v43 += 1;
            } while (v43 != 672);
            goto LABEL_25b938;
        }
    case 1395053109160472607:
        v1 = &v0;
        v0 = &v1;
        if (v7 != 3)
        {
            if (v7 != 2)
                return v18;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_25b70c;
            v17 = 0;
            do
            {
                *((char *)v11 + v17) = *((char *)v9 + v17);
                v17 += 1;
            } while (v17 != 672);
        }
        else
        {
            v14 = *v6;
            v10 = (long long)v14[16];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v14)
                goto LABEL_25b890;
            v19 = 0;
            do
            {
                *((char *)v11 + v19) = *((char *)v14 + v19);
                v19 += 1;
            } while (v19 != 672);
            goto LABEL_25b938;
        }
    case 17967764063389145436:
        v1 = &v0;
        v0 = &v1;
        if (v7 != 3)
        {
            if (v7 != 2)
                return v13;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_25b70c;
            v12 = 0;
            do
            {
                *((char *)v11 + v12) = *((char *)v9 + v12);
                v12 += 1;
            } while (v12 != 672);
        }
        else
        {
            v14 = *v6;
            v10 = (long long)v14[16];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 >= v11 - v14)
            {
                v15 = 0;
                do
                {
                    *((char *)v11 + v15) = *((char *)v14 + v15);
                    v15 += 1;
                } while (v15 != 672);
            }
            else
            {
LABEL_25b890:
                v44 = (int128_t)v14[16];
                *(int128_t *)v11 = *(int128_t *)v14;
                *(uint128_t *)&v11[16] = v44;
                v45 = (int128_t)v14[48];
                *(int128_t *)&v11[32] = (int128_t)v14[32];
                *(uint128_t *)&v11[48] = v45;
                v46 = (int128_t)v14[80];
                *(int128_t *)&v11[64] = (int128_t)v14[64];
                *(uint128_t *)&v11[80] = v46;
                v47 = (int128_t)v14[112];
                *(int128_t *)&v11[96] = (int128_t)v14[96];
                *(uint128_t *)&v11[112] = v47;
                v48 = (int128_t)v14[144];
                *(int128_t *)&v11[128] = (int128_t)v14[128];
                *(uint128_t *)&v11[144] = v48;
                v49 = (int128_t)v14[176];
                *(int128_t *)&v11[160] = (int128_t)v14[160];
                *(uint128_t *)&v11[176] = v49;
                v50 = (int128_t)v14[208];
                *(int128_t *)&v11[192] = (int128_t)v14[192];
                *(uint128_t *)&v11[208] = v50;
                v51 = (int128_t)v14[240];
                *(int128_t *)&v11[224] = (int128_t)v14[224];
                *(uint128_t *)&v11[240] = v51;
                v52 = (int128_t)v14[272];
                *(int128_t *)&v11[0x100] = (int128_t)v14[0x100];
                *(uint128_t *)&v11[272] = v52;
                v53 = (int128_t)v14[304];
                *(int128_t *)&v11[288] = (int128_t)v14[288];
                *(uint128_t *)&v11[304] = v53;
                v54 = (int128_t)v14[336];
                *(int128_t *)&v11[320] = (int128_t)v14[320];
                *(uint128_t *)&v11[336] = v54;
                v55 = (int128_t)v14[368];
                *(int128_t *)&v11[352] = (int128_t)v14[352];
                *(uint128_t *)&v11[368] = v55;
                v56 = (int128_t)v14[400];
                *(int128_t *)&v11[384] = (int128_t)v14[384];
                *(uint128_t *)&v11[400] = v56;
                v57 = (int128_t)v14[432];
                *(int128_t *)&v11[416] = (int128_t)v14[416];
                *(uint128_t *)&v11[432] = v57;
                v58 = (int128_t)v14[464];
                *(int128_t *)&v11[448] = (int128_t)v14[448];
                *(uint128_t *)&v11[464] = v58;
                v59 = (int128_t)v14[496];
                *(int128_t *)&v11[480] = (int128_t)v14[480];
                *(uint128_t *)&v11[496] = v59;
                v60 = (int128_t)v14[528];
                *(int128_t *)&v11[0x200] = (int128_t)v14[0x200];
                *(uint128_t *)&v11[528] = v60;
                v61 = (int128_t)v14[560];
                *(int128_t *)&v11[544] = (int128_t)v14[544];
                *(uint128_t *)&v11[560] = v61;
                v62 = (int128_t)v14[592];
                *(int128_t *)&v11[576] = (int128_t)v14[576];
                *(uint128_t *)&v11[592] = v62;
                v63 = (int128_t)v14[624];
                *(int128_t *)&v11[608] = (int128_t)v14[608];
                *(uint128_t *)&v11[624] = v63;
                v64 = (int128_t)v14[656];
                *(int128_t *)&v11[640] = (int128_t)v14[640];
                *(uint128_t *)&v11[656] = v64;
            }
LABEL_25b938:
            *(unsigned long long *)&v11[16] = 2456424;
            *v6 = v11;
            v65 = operatornew(32);
            v65->field_0 = 0;
            v65->field_8 = v10;
            v65->field_10 = 0;
            v65->field_18 = 0;
            v2 = v6;
            v3 = v65;
            sub_2592b4(&g_f11980, &v2);
            return v66;
        }
    default:
        return v16;
    }
    *(unsigned long long *)&v11[24] = 2462860;
    *v6 = v11;
    v65 = operatornew(32);
    v65->field_0 = 0;
    v65->field_8 = v10;
    v65->field_10 = 0;
    v65->field_18 = 0;
    v2 = v6;
    v3 = v65;
    sub_2592b4(&g_f11980, &v2);
    return v66;
}

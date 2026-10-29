/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25b9fc..0x25c09c (1696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25b9fc_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_25b9fc_1;

typedef struct st_25b9fc_0 {
    void* field_0;
} st_25b9fc_0;

typedef struct st_25b9fc_2 {
    char field_0;
} st_25b9fc_2;

extern long long g_f11980;

int sub_25b9fc(unsigned int a0, st_25b9fc_0 **a1, unsigned int *a2, long long *a3)
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
    uint128_t v114;  // q1
    uint128_t v115;  // q1
    long long v17;  // x8
    uint128_t v116;  // q1
    uint128_t v117;  // q1
    uint128_t v118;  // q1
    unsigned int v119;  // w0
    unsigned int v18;  // w0
    long long v19;  // x8
    long long v20;  // x8
    uint128_t v21;  // q1
    uint128_t v22;  // q1
    uint128_t v23;  // q1
    uint128_t v24;  // q1
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
    st_25b9fc_1 *v65;  // x0
    long long v12;  // x8
    unsigned int v66;  // w0
    void* v67;  // x22
    unsigned long v68;  // x21
    void* v69;  // x19
    long long v70;  // x8
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
    uint128_t v91;  // q1
    unsigned long long v92;  // x8
    unsigned int v93;  // w0
    void* v94;  // x22
    unsigned long v95;  // x21
    long long v15;  // x8
    void* v96;  // x19
    long long v97;  // x8
    uint128_t v98;  // q1
    uint128_t v99;  // q1
    uint128_t v100;  // q1
    uint128_t v101;  // q1
    uint128_t v102;  // q1
    uint128_t v103;  // q1
    uint128_t v104;  // q1
    uint128_t v105;  // q1
    st_25b9fc_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_25b9fc_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_25b9fc_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    if (6961115826942786858 >= *a3)
    {
        switch (v8)
        {
        case 14805512262589200788:
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
                if (31 >= v11 - v9)
                {
                    v17 = 0;
                    do
                    {
                        *((char *)v11 + v17) = *((char *)v9 + v17);
                        v17 += 1;
                    } while (v17 != 672);
                }
                else
                {
LABEL_25bc24:
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
                if (31 >= v11 - v14)
                {
                    v19 = 0;
                    do
                    {
                        *((char *)v11 + v19) = *((char *)v14 + v19);
                        v19 += 1;
                    } while (v19 != 672);
                }
                else
                {
LABEL_25bda8:
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
LABEL_25be50:
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
                return v119;
            }
        case 1189801545460292680:
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
                    goto LABEL_25bc24;
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
                if (31 < v11 - v14)
                    goto LABEL_25bda8;
                v15 = 0;
                do
                {
                    *((char *)v11 + v15) = *((char *)v14 + v15);
                    v15 += 1;
                } while (v15 != 672);
                goto LABEL_25be50;
            }
        default:
            return v16;
        }
    }
    else
    {
        switch (v8)
        {
        case 6961115826942786859:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v94 = *v6;
                v95 = (long long)v94[16];
                v96 = operatornew(672);
                _bzero(v96, 672);
                if (31 >= v96 - v94)
                {
                    v97 = 0;
                    do
                    {
                        *((char *)v96 + v97) = *((char *)v94 + v97);
                        v97 += 1;
                    } while (v97 != 672);
                }
                else
                {
                    v98 = (int128_t)v94[16];
                    *(int128_t *)v96 = *(int128_t *)v94;
                    *(uint128_t *)&v96[16] = v98;
                    v99 = (int128_t)v94[48];
                    *(int128_t *)&v96[32] = (int128_t)v94[32];
                    *(uint128_t *)&v96[48] = v99;
                    v100 = (int128_t)v94[80];
                    *(int128_t *)&v96[64] = (int128_t)v94[64];
                    *(uint128_t *)&v96[80] = v100;
                    v101 = (int128_t)v94[112];
                    *(int128_t *)&v96[96] = (int128_t)v94[96];
                    *(uint128_t *)&v96[112] = v101;
                    v102 = (int128_t)v94[144];
                    *(int128_t *)&v96[128] = (int128_t)v94[128];
                    *(uint128_t *)&v96[144] = v102;
                    v103 = (int128_t)v94[176];
                    *(int128_t *)&v96[160] = (int128_t)v94[160];
                    *(uint128_t *)&v96[176] = v103;
                    v104 = (int128_t)v94[208];
                    *(int128_t *)&v96[192] = (int128_t)v94[192];
                    *(uint128_t *)&v96[208] = v104;
                    v105 = (int128_t)v94[240];
                    *(int128_t *)&v96[224] = (int128_t)v94[224];
                    *(uint128_t *)&v96[240] = v105;
                    v106 = (int128_t)v94[272];
                    *(int128_t *)&v96[0x100] = (int128_t)v94[0x100];
                    *(uint128_t *)&v96[272] = v106;
                    v107 = (int128_t)v94[304];
                    *(int128_t *)&v96[288] = (int128_t)v94[288];
                    *(uint128_t *)&v96[304] = v107;
                    v108 = (int128_t)v94[336];
                    *(int128_t *)&v96[320] = (int128_t)v94[320];
                    *(uint128_t *)&v96[336] = v108;
                    v109 = (int128_t)v94[368];
                    *(int128_t *)&v96[352] = (int128_t)v94[352];
                    *(uint128_t *)&v96[368] = v109;
                    v110 = (int128_t)v94[400];
                    *(int128_t *)&v96[384] = (int128_t)v94[384];
                    *(uint128_t *)&v96[400] = v110;
                    v111 = (int128_t)v94[432];
                    *(int128_t *)&v96[416] = (int128_t)v94[416];
                    *(uint128_t *)&v96[432] = v111;
                    v112 = (int128_t)v94[464];
                    *(int128_t *)&v96[448] = (int128_t)v94[448];
                    *(uint128_t *)&v96[464] = v112;
                    v113 = (int128_t)v94[496];
                    *(int128_t *)&v96[480] = (int128_t)v94[480];
                    *(uint128_t *)&v96[496] = v113;
                    v114 = (int128_t)v94[528];
                    *(int128_t *)&v96[0x200] = (int128_t)v94[0x200];
                    *(uint128_t *)&v96[528] = v114;
                    v115 = (int128_t)v94[560];
                    *(int128_t *)&v96[544] = (int128_t)v94[544];
                    *(uint128_t *)&v96[560] = v115;
                    v116 = (int128_t)v94[592];
                    *(int128_t *)&v96[576] = (int128_t)v94[576];
                    *(uint128_t *)&v96[592] = v116;
                    v117 = (int128_t)v94[624];
                    *(int128_t *)&v96[608] = (int128_t)v94[608];
                    *(uint128_t *)&v96[624] = v117;
                    v118 = (int128_t)v94[656];
                    *(int128_t *)&v96[640] = (int128_t)v94[640];
                    *(uint128_t *)&v96[656] = v118;
                }
                *(unsigned long long *)&v96[16] = 2456424;
                *v6 = v96;
                v65 = operatornew(32);
                v65->field_0 = 0;
                v65->field_8 = v95;
                v65->field_10 = 2444924;
            }
            else if (v7 == 2)
            {
                v67 = *v6;
                v68 = (long long)v67[24];
                v69 = operatornew(672);
                _bzero(v69, 672);
                if (31 >= v69 - v67)
                {
                    v70 = 0;
                    do
                    {
                        *((char *)v69 + v70) = *((char *)v67 + v70);
                        v70 += 1;
                    } while (v70 != 672);
                }
                else
                {
                    v71 = (int128_t)v67[16];
                    *(int128_t *)v69 = *(int128_t *)v67;
                    *(uint128_t *)&v69[16] = v71;
                    v72 = (int128_t)v67[48];
                    *(int128_t *)&v69[32] = (int128_t)v67[32];
                    *(uint128_t *)&v69[48] = v72;
                    v73 = (int128_t)v67[80];
                    *(int128_t *)&v69[64] = (int128_t)v67[64];
                    *(uint128_t *)&v69[80] = v73;
                    v74 = (int128_t)v67[112];
                    *(int128_t *)&v69[96] = (int128_t)v67[96];
                    *(uint128_t *)&v69[112] = v74;
                    v75 = (int128_t)v67[144];
                    *(int128_t *)&v69[128] = (int128_t)v67[128];
                    *(uint128_t *)&v69[144] = v75;
                    v76 = (int128_t)v67[176];
                    *(int128_t *)&v69[160] = (int128_t)v67[160];
                    *(uint128_t *)&v69[176] = v76;
                    v77 = (int128_t)v67[208];
                    *(int128_t *)&v69[192] = (int128_t)v67[192];
                    *(uint128_t *)&v69[208] = v77;
                    v78 = (int128_t)v67[240];
                    *(int128_t *)&v69[224] = (int128_t)v67[224];
                    *(uint128_t *)&v69[240] = v78;
                    v79 = (int128_t)v67[272];
                    *(int128_t *)&v69[0x100] = (int128_t)v67[0x100];
                    *(uint128_t *)&v69[272] = v79;
                    v80 = (int128_t)v67[304];
                    *(int128_t *)&v69[288] = (int128_t)v67[288];
                    *(uint128_t *)&v69[304] = v80;
                    v81 = (int128_t)v67[336];
                    *(int128_t *)&v69[320] = (int128_t)v67[320];
                    *(uint128_t *)&v69[336] = v81;
                    v82 = (int128_t)v67[368];
                    *(int128_t *)&v69[352] = (int128_t)v67[352];
                    *(uint128_t *)&v69[368] = v82;
                    v83 = (int128_t)v67[400];
                    *(int128_t *)&v69[384] = (int128_t)v67[384];
                    *(uint128_t *)&v69[400] = v83;
                    v84 = (int128_t)v67[432];
                    *(int128_t *)&v69[416] = (int128_t)v67[416];
                    *(uint128_t *)&v69[432] = v84;
                    v85 = (int128_t)v67[464];
                    *(int128_t *)&v69[448] = (int128_t)v67[448];
                    *(uint128_t *)&v69[464] = v85;
                    v86 = (int128_t)v67[496];
                    *(int128_t *)&v69[480] = (int128_t)v67[480];
                    *(uint128_t *)&v69[496] = v86;
                    v87 = (int128_t)v67[528];
                    *(int128_t *)&v69[0x200] = (int128_t)v67[0x200];
                    *(uint128_t *)&v69[528] = v87;
                    v88 = (int128_t)v67[560];
                    *(int128_t *)&v69[544] = (int128_t)v67[544];
                    *(uint128_t *)&v69[560] = v88;
                    v89 = (int128_t)v67[592];
                    *(int128_t *)&v69[576] = (int128_t)v67[576];
                    *(uint128_t *)&v69[592] = v89;
                    v90 = (int128_t)v67[624];
                    *(int128_t *)&v69[608] = (int128_t)v67[608];
                    *(uint128_t *)&v69[624] = v90;
                    v91 = (int128_t)v67[656];
                    *(int128_t *)&v69[640] = (int128_t)v67[640];
                    *(uint128_t *)&v69[656] = v91;
                }
                v92 = 2462860;
                *(unsigned long long *)&v69[24] = v92;
                *v6 = v69;
                v65 = operatornew(32);
                v65->field_0 = 0;
                v65->field_8 = v68;
                v65->field_10 = 2444924;
            }
            else
            {
                return v93;
            }
            v65->field_18 = 0;
            v2 = v6;
            v3 = v65;
            sub_2592b4(&g_f11980, &v2);
            return v119;
        case 7253349722282338515:
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
                if (31 < v11 - v9)
                    goto LABEL_25bc24;
                v20 = 0;
                do
                {
                    *((char *)v11 + v20) = *((char *)v9 + v20);
                    v20 += 1;
                } while (v20 != 672);
            }
            else
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_25bda8;
                v43 = 0;
                do
                {
                    *((char *)v11 + v43) = *((char *)v14 + v43);
                    v43 += 1;
                } while (v43 != 672);
                goto LABEL_25be50;
            }
        default:
            return v66;
        }
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
    return v119;
}

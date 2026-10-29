/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x262390..0x262c88 (2296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_262390_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_262390_1;

typedef struct st_262390_0 {
    void* field_0;
} st_262390_0;

typedef struct st_262390_2 {
    char field_0;
} st_262390_2;

extern long long g_f11980;

int sub_262390(unsigned int a0, st_262390_0 **a1, unsigned int *a2, long long *a3)
{
    void* *v6;  // x20
    unsigned int v7;  // w8
    unsigned int v16;  // w0
    void* v106;  // x19
    long long v107;  // x8
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
    unsigned int v129;  // w0
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
    uint128_t v46;  // q1
    uint128_t v47;  // q1
    uint128_t v48;  // q1
    uint128_t v49;  // q1
    uint128_t v50;  // q1
    uint128_t v51;  // q1
    uint128_t v52;  // q1
    unsigned int v53;  // w0
    long long v54;  // x8
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
    uint128_t v72;  // q1
    uint128_t v73;  // q1
    uint128_t v74;  // q1
    uint128_t v75;  // q1
    unsigned int v13;  // w0
    st_262390_1 *v76;  // x0
    void* v77;  // x22
    unsigned long v78;  // x21
    void* v79;  // x19
    long long v80;  // x8
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
    uint128_t v95;  // q1
    long long v15;  // x8
    uint128_t v96;  // q1
    uint128_t v97;  // q1
    uint128_t v98;  // q1
    uint128_t v99;  // q1
    uint128_t v100;  // q1
    uint128_t v101;  // q1
    unsigned long long v102;  // x8
    unsigned int v103;  // w0
    void* v104;  // x22
    unsigned long v105;  // x21
    st_262390_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_262390_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_262390_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    if (*a3 <= -0x392efb5b2cda019)
    {
        switch (v8)
        {
        case 9777224025025737823:
            v1 = &v0;
            v0 = &v1;
            if (v7 != 3)
            {
                if (v7 == 2)
                {
                    v77 = *v6;
                    v78 = (long long)v77[24];
                    v79 = operatornew(672);
                    _bzero(v79, 672);
                    if (31 >= v79 - v77)
                    {
                        v80 = 0;
                        do
                        {
                            *((char *)v79 + v80) = *((char *)v77 + v80);
                            v80 += 1;
                        } while (v80 != 672);
                    }
                    else
                    {
                        v81 = (int128_t)v77[16];
                        *(int128_t *)v79 = *(int128_t *)v77;
                        *(uint128_t *)&v79[16] = v81;
                        v82 = (int128_t)v77[48];
                        *(int128_t *)&v79[32] = (int128_t)v77[32];
                        *(uint128_t *)&v79[48] = v82;
                        v83 = (int128_t)v77[80];
                        *(int128_t *)&v79[64] = (int128_t)v77[64];
                        *(uint128_t *)&v79[80] = v83;
                        v84 = (int128_t)v77[112];
                        *(int128_t *)&v79[96] = (int128_t)v77[96];
                        *(uint128_t *)&v79[112] = v84;
                        v85 = (int128_t)v77[144];
                        *(int128_t *)&v79[128] = (int128_t)v77[128];
                        *(uint128_t *)&v79[144] = v85;
                        v86 = (int128_t)v77[176];
                        *(int128_t *)&v79[160] = (int128_t)v77[160];
                        *(uint128_t *)&v79[176] = v86;
                        v87 = (int128_t)v77[208];
                        *(int128_t *)&v79[192] = (int128_t)v77[192];
                        *(uint128_t *)&v79[208] = v87;
                        v88 = (int128_t)v77[240];
                        *(int128_t *)&v79[224] = (int128_t)v77[224];
                        *(uint128_t *)&v79[240] = v88;
                        v89 = (int128_t)v77[272];
                        *(int128_t *)&v79[0x100] = (int128_t)v77[0x100];
                        *(uint128_t *)&v79[272] = v89;
                        v90 = (int128_t)v77[304];
                        *(int128_t *)&v79[288] = (int128_t)v77[288];
                        *(uint128_t *)&v79[304] = v90;
                        v91 = (int128_t)v77[336];
                        *(int128_t *)&v79[320] = (int128_t)v77[320];
                        *(uint128_t *)&v79[336] = v91;
                        v92 = (int128_t)v77[368];
                        *(int128_t *)&v79[352] = (int128_t)v77[352];
                        *(uint128_t *)&v79[368] = v92;
                        v93 = (int128_t)v77[400];
                        *(int128_t *)&v79[384] = (int128_t)v77[384];
                        *(uint128_t *)&v79[400] = v93;
                        v94 = (int128_t)v77[432];
                        *(int128_t *)&v79[416] = (int128_t)v77[416];
                        *(uint128_t *)&v79[432] = v94;
                        v95 = (int128_t)v77[464];
                        *(int128_t *)&v79[448] = (int128_t)v77[448];
                        *(uint128_t *)&v79[464] = v95;
                        v96 = (int128_t)v77[496];
                        *(int128_t *)&v79[480] = (int128_t)v77[480];
                        *(uint128_t *)&v79[496] = v96;
                        v97 = (int128_t)v77[528];
                        *(int128_t *)&v79[0x200] = (int128_t)v77[0x200];
                        *(uint128_t *)&v79[528] = v97;
                        v98 = (int128_t)v77[560];
                        *(int128_t *)&v79[544] = (int128_t)v77[544];
                        *(uint128_t *)&v79[560] = v98;
                        v99 = (int128_t)v77[592];
                        *(int128_t *)&v79[576] = (int128_t)v77[576];
                        *(uint128_t *)&v79[592] = v99;
                        v100 = (int128_t)v77[624];
                        *(int128_t *)&v79[608] = (int128_t)v77[608];
                        *(uint128_t *)&v79[624] = v100;
                        v101 = (int128_t)v77[656];
                        *(int128_t *)&v79[640] = (int128_t)v77[640];
                        *(uint128_t *)&v79[656] = v101;
                    }
                    v102 = 2462860;
                    *(unsigned long long *)&v79[24] = v102;
                    *v6 = v79;
                    v76 = operatornew(32);
                    v76->field_0 = 0;
                    v76->field_8 = v78;
                    v76->field_10 = 2444924;
                }
                else
                {
                    return v103;
                }
            }
            else
            {
                v104 = *v6;
                v105 = (long long)v104[16];
                v106 = operatornew(672);
                _bzero(v106, 672);
                if (31 >= v106 - v104)
                {
                    v107 = 0;
                    do
                    {
                        *((char *)v106 + v107) = *((char *)v104 + v107);
                        v107 += 1;
                    } while (v107 != 672);
                }
                else
                {
                    v108 = (int128_t)v104[16];
                    *(int128_t *)v106 = *(int128_t *)v104;
                    *(uint128_t *)&v106[16] = v108;
                    v109 = (int128_t)v104[48];
                    *(int128_t *)&v106[32] = (int128_t)v104[32];
                    *(uint128_t *)&v106[48] = v109;
                    v110 = (int128_t)v104[80];
                    *(int128_t *)&v106[64] = (int128_t)v104[64];
                    *(uint128_t *)&v106[80] = v110;
                    v111 = (int128_t)v104[112];
                    *(int128_t *)&v106[96] = (int128_t)v104[96];
                    *(uint128_t *)&v106[112] = v111;
                    v112 = (int128_t)v104[144];
                    *(int128_t *)&v106[128] = (int128_t)v104[128];
                    *(uint128_t *)&v106[144] = v112;
                    v113 = (int128_t)v104[176];
                    *(int128_t *)&v106[160] = (int128_t)v104[160];
                    *(uint128_t *)&v106[176] = v113;
                    v114 = (int128_t)v104[208];
                    *(int128_t *)&v106[192] = (int128_t)v104[192];
                    *(uint128_t *)&v106[208] = v114;
                    v115 = (int128_t)v104[240];
                    *(int128_t *)&v106[224] = (int128_t)v104[224];
                    *(uint128_t *)&v106[240] = v115;
                    v116 = (int128_t)v104[272];
                    *(int128_t *)&v106[0x100] = (int128_t)v104[0x100];
                    *(uint128_t *)&v106[272] = v116;
                    v117 = (int128_t)v104[304];
                    *(int128_t *)&v106[288] = (int128_t)v104[288];
                    *(uint128_t *)&v106[304] = v117;
                    v118 = (int128_t)v104[336];
                    *(int128_t *)&v106[320] = (int128_t)v104[320];
                    *(uint128_t *)&v106[336] = v118;
                    v119 = (int128_t)v104[368];
                    *(int128_t *)&v106[352] = (int128_t)v104[352];
                    *(uint128_t *)&v106[368] = v119;
                    v120 = (int128_t)v104[400];
                    *(int128_t *)&v106[384] = (int128_t)v104[384];
                    *(uint128_t *)&v106[400] = v120;
                    v121 = (int128_t)v104[432];
                    *(int128_t *)&v106[416] = (int128_t)v104[416];
                    *(uint128_t *)&v106[432] = v121;
                    v122 = (int128_t)v104[464];
                    *(int128_t *)&v106[448] = (int128_t)v104[448];
                    *(uint128_t *)&v106[464] = v122;
                    v123 = (int128_t)v104[496];
                    *(int128_t *)&v106[480] = (int128_t)v104[480];
                    *(uint128_t *)&v106[496] = v123;
                    v124 = (int128_t)v104[528];
                    *(int128_t *)&v106[0x200] = (int128_t)v104[0x200];
                    *(uint128_t *)&v106[528] = v124;
                    v125 = (int128_t)v104[560];
                    *(int128_t *)&v106[544] = (int128_t)v104[544];
                    *(uint128_t *)&v106[560] = v125;
                    v126 = (int128_t)v104[592];
                    *(int128_t *)&v106[576] = (int128_t)v104[576];
                    *(uint128_t *)&v106[592] = v126;
                    v127 = (int128_t)v104[624];
                    *(int128_t *)&v106[608] = (int128_t)v104[608];
                    *(uint128_t *)&v106[624] = v127;
                    v128 = (int128_t)v104[656];
                    *(int128_t *)&v106[640] = (int128_t)v104[640];
                    *(uint128_t *)&v106[656] = v128;
                }
                *(unsigned long long *)&v106[16] = 2456424;
                *v6 = v106;
                v76 = operatornew(32);
                v76->field_0 = 0;
                v76->field_8 = v105;
                v76->field_10 = 2444924;
            }
            v76->field_18 = 0;
            v2 = v6;
            v3 = v76;
            sub_2592b4(&g_f11980, &v2);
            return v129;
        case 11458941287104690832:
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
                    v54 = 0;
                    do
                    {
                        *((char *)v11 + v54) = *((char *)v14 + v54);
                        v54 += 1;
                    } while (v54 != 672);
                }
                else
                {
LABEL_2629d8:
                    v55 = (int128_t)v14[16];
                    *(int128_t *)v11 = *(int128_t *)v14;
                    *(uint128_t *)&v11[16] = v55;
                    v56 = (int128_t)v14[48];
                    *(int128_t *)&v11[32] = (int128_t)v14[32];
                    *(uint128_t *)&v11[48] = v56;
                    v57 = (int128_t)v14[80];
                    *(int128_t *)&v11[64] = (int128_t)v14[64];
                    *(uint128_t *)&v11[80] = v57;
                    v58 = (int128_t)v14[112];
                    *(int128_t *)&v11[96] = (int128_t)v14[96];
                    *(uint128_t *)&v11[112] = v58;
                    v59 = (int128_t)v14[144];
                    *(int128_t *)&v11[128] = (int128_t)v14[128];
                    *(uint128_t *)&v11[144] = v59;
                    v60 = (int128_t)v14[176];
                    *(int128_t *)&v11[160] = (int128_t)v14[160];
                    *(uint128_t *)&v11[176] = v60;
                    v61 = (int128_t)v14[208];
                    *(int128_t *)&v11[192] = (int128_t)v14[192];
                    *(uint128_t *)&v11[208] = v61;
                    v62 = (int128_t)v14[240];
                    *(int128_t *)&v11[224] = (int128_t)v14[224];
                    *(uint128_t *)&v11[240] = v62;
                    v63 = (int128_t)v14[272];
                    *(int128_t *)&v11[0x100] = (int128_t)v14[0x100];
                    *(uint128_t *)&v11[272] = v63;
                    v64 = (int128_t)v14[304];
                    *(int128_t *)&v11[288] = (int128_t)v14[288];
                    *(uint128_t *)&v11[304] = v64;
                    v65 = (int128_t)v14[336];
                    *(int128_t *)&v11[320] = (int128_t)v14[320];
                    *(uint128_t *)&v11[336] = v65;
                    v66 = (int128_t)v14[368];
                    *(int128_t *)&v11[352] = (int128_t)v14[352];
                    *(uint128_t *)&v11[368] = v66;
                    v67 = (int128_t)v14[400];
                    *(int128_t *)&v11[384] = (int128_t)v14[384];
                    *(uint128_t *)&v11[400] = v67;
                    v68 = (int128_t)v14[432];
                    *(int128_t *)&v11[416] = (int128_t)v14[416];
                    *(uint128_t *)&v11[432] = v68;
                    v69 = (int128_t)v14[464];
                    *(int128_t *)&v11[448] = (int128_t)v14[448];
                    *(uint128_t *)&v11[464] = v69;
                    v70 = (int128_t)v14[496];
                    *(int128_t *)&v11[480] = (int128_t)v14[480];
                    *(uint128_t *)&v11[496] = v70;
                    v71 = (int128_t)v14[528];
                    *(int128_t *)&v11[0x200] = (int128_t)v14[0x200];
                    *(uint128_t *)&v11[528] = v71;
                    v72 = (int128_t)v14[560];
                    *(int128_t *)&v11[544] = (int128_t)v14[544];
                    *(uint128_t *)&v11[560] = v72;
                    v73 = (int128_t)v14[592];
                    *(int128_t *)&v11[576] = (int128_t)v14[576];
                    *(uint128_t *)&v11[592] = v73;
                    v74 = (int128_t)v14[624];
                    *(int128_t *)&v11[608] = (int128_t)v14[608];
                    *(uint128_t *)&v11[624] = v74;
                    v75 = (int128_t)v14[656];
                    *(int128_t *)&v11[640] = (int128_t)v14[640];
                    *(uint128_t *)&v11[656] = v75;
                }
LABEL_262a80:
                *(unsigned long long *)&v11[16] = 2456424;
                *v6 = v11;
                v76 = operatornew(32);
                v76->field_0 = 0;
                v76->field_8 = v10;
                v76->field_10 = 0;
                v76->field_18 = 0;
                v2 = v6;
                v3 = v76;
                sub_2592b4(&g_f11980, &v2);
                return v129;
            }
            if (v7 != 2)
                return v53;
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
LABEL_262744:
                v32 = (int128_t)v9[16];
                *(int128_t *)v11 = *(int128_t *)v9;
                *(uint128_t *)&v11[16] = v32;
                v33 = (int128_t)v9[48];
                *(int128_t *)&v11[32] = (int128_t)v9[32];
                *(uint128_t *)&v11[48] = v33;
                v34 = (int128_t)v9[80];
                *(int128_t *)&v11[64] = (int128_t)v9[64];
                *(uint128_t *)&v11[80] = v34;
                v35 = (int128_t)v9[112];
                *(int128_t *)&v11[96] = (int128_t)v9[96];
                *(uint128_t *)&v11[112] = v35;
                v36 = (int128_t)v9[144];
                *(int128_t *)&v11[128] = (int128_t)v9[128];
                *(uint128_t *)&v11[144] = v36;
                v37 = (int128_t)v9[176];
                *(int128_t *)&v11[160] = (int128_t)v9[160];
                *(uint128_t *)&v11[176] = v37;
                v38 = (int128_t)v9[208];
                *(int128_t *)&v11[192] = (int128_t)v9[192];
                *(uint128_t *)&v11[208] = v38;
                v39 = (int128_t)v9[240];
                *(int128_t *)&v11[224] = (int128_t)v9[224];
                *(uint128_t *)&v11[240] = v39;
                v40 = (int128_t)v9[272];
                *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                *(uint128_t *)&v11[272] = v40;
                v41 = (int128_t)v9[304];
                *(int128_t *)&v11[288] = (int128_t)v9[288];
                *(uint128_t *)&v11[304] = v41;
                v42 = (int128_t)v9[336];
                *(int128_t *)&v11[320] = (int128_t)v9[320];
                *(uint128_t *)&v11[336] = v42;
                v43 = (int128_t)v9[368];
                *(int128_t *)&v11[352] = (int128_t)v9[352];
                *(uint128_t *)&v11[368] = v43;
                v44 = (int128_t)v9[400];
                *(int128_t *)&v11[384] = (int128_t)v9[384];
                *(uint128_t *)&v11[400] = v44;
                v45 = (int128_t)v9[432];
                *(int128_t *)&v11[416] = (int128_t)v9[416];
                *(uint128_t *)&v11[432] = v45;
                v46 = (int128_t)v9[464];
                *(int128_t *)&v11[448] = (int128_t)v9[448];
                *(uint128_t *)&v11[464] = v46;
                v47 = (int128_t)v9[496];
                *(int128_t *)&v11[480] = (int128_t)v9[480];
                *(uint128_t *)&v11[496] = v47;
                v48 = (int128_t)v9[528];
                *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                *(uint128_t *)&v11[528] = v48;
                v49 = (int128_t)v9[560];
                *(int128_t *)&v11[544] = (int128_t)v9[544];
                *(uint128_t *)&v11[560] = v49;
                v50 = (int128_t)v9[592];
                *(int128_t *)&v11[576] = (int128_t)v9[576];
                *(uint128_t *)&v11[592] = v50;
                v51 = (int128_t)v9[624];
                *(int128_t *)&v11[608] = (int128_t)v9[608];
                *(uint128_t *)&v11[624] = v51;
                v52 = (int128_t)v9[656];
                *(int128_t *)&v11[640] = (int128_t)v9[640];
                *(uint128_t *)&v11[656] = v52;
                break;
            }
        case 14945517153879417041:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_2629d8;
                v29 = 0;
                do
                {
                    *((char *)v11 + v29) = *((char *)v14 + v29);
                    v29 += 1;
                } while (v29 != 672);
                goto LABEL_262a80;
            }
            if (v7 != 2)
                return v28;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_262744;
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
    else if (3377701905806902035 >= *a3)
    {
        switch (v8)
        {
        case 18189212381328072680:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_2629d8;
                v19 = 0;
                do
                {
                    *((char *)v11 + v19) = *((char *)v14 + v19);
                    v19 += 1;
                } while (v19 != 672);
                goto LABEL_262a80;
            }
            if (v7 != 2)
                return v18;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_262744;
            v17 = 0;
            do
            {
                *((char *)v11 + v17) = *((char *)v9 + v17);
                v17 += 1;
            } while (v17 != 672);
        case 305621381295914027:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_2629d8;
                v15 = 0;
                do
                {
                    *((char *)v11 + v15) = *((char *)v14 + v15);
                    v15 += 1;
                } while (v15 != 672);
                goto LABEL_262a80;
            }
            if (v7 != 2)
                return v13;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_262744;
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
        case 3377701905806902036:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_2629d8;
                v26 = 0;
                do
                {
                    *((char *)v11 + v26) = *((char *)v14 + v26);
                    v26 += 1;
                } while (v26 != 672);
                goto LABEL_262a80;
            }
            if (v7 != 2)
                return v25;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_262744;
            v24 = 0;
            do
            {
                *((char *)v11 + v24) = *((char *)v9 + v24);
                v24 += 1;
            } while (v24 != 672);
        case 6798610425390867304:
            v1 = &v0;
            v0 = &v1;
            if (v7 == 3)
            {
                v14 = *v6;
                v10 = (long long)v14[16];
                v11 = operatornew(672);
                _bzero(v11, 672);
                if (31 < v11 - v14)
                    goto LABEL_2629d8;
                v22 = 0;
                do
                {
                    *((char *)v11 + v22) = *((char *)v14 + v22);
                    v22 += 1;
                } while (v22 != 672);
                goto LABEL_262a80;
            }
            if (v7 != 2)
                return v21;
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 < v11 - v9)
                goto LABEL_262744;
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
    v76 = operatornew(32);
    v76->field_0 = 0;
    v76->field_8 = v10;
    v76->field_10 = 0;
    v76->field_18 = 0;
    v2 = v6;
    v3 = v76;
    sub_2592b4(&g_f11980, &v2);
    return v129;
}

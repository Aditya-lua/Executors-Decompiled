/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x257414..0x257b68 (1876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_257414_0 {
    void* field_0;
} st_257414_0;

typedef struct st_257414_1 {
    char field_0;
} st_257414_1;

extern long long g_f11980;

int sub_257414(unsigned int a0, st_257414_0 **a1, void* a2, unsigned long long *a3)
{
    void* *v6;  // x20
    unsigned int v7;  // w8
    uint128_t v16;  // q1
    uint128_t v106;  // q1
    uint128_t v107;  // q1
    uint128_t v108;  // q1
    uint128_t v109;  // q1
    uint128_t v110;  // q1
    uint128_t v111;  // q1
    void* v112;  // x22
    long long v113;  // x8
    uint128_t v114;  // q1
    uint128_t v115;  // q1
    uint128_t v17;  // q1
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
    uint128_t v18;  // q1
    uint128_t v126;  // q1
    uint128_t v127;  // q1
    uint128_t v128;  // q1
    uint128_t v129;  // q1
    uint128_t v130;  // q1
    uint128_t v131;  // q1
    uint128_t v132;  // q1
    uint128_t v133;  // q1
    uint128_t v134;  // q1
    unsigned long long v135;  // x8
    uint128_t v19;  // q1
    unsigned int v136;  // w0
    void* v137;  // x22
    void* v138;  // x19
    long long v139;  // x8
    uint128_t v140;  // q1
    uint128_t v141;  // q1
    uint128_t v142;  // q1
    uint128_t v143;  // q1
    uint128_t v144;  // q1
    uint128_t v145;  // q1
    uint128_t v20;  // q1
    uint128_t v146;  // q1
    uint128_t v147;  // q1
    uint128_t v148;  // q1
    uint128_t v149;  // q1
    uint128_t v150;  // q1
    uint128_t v151;  // q1
    uint128_t v152;  // q1
    uint128_t v153;  // q1
    uint128_t v154;  // q1
    uint128_t v155;  // q1
    uint128_t v21;  // q1
    uint128_t v156;  // q1
    uint128_t v157;  // q1
    uint128_t v158;  // q1
    uint128_t v159;  // q1
    uint128_t v160;  // q1
    unsigned int v161;  // w0
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
    unsigned long v34;  // x22
    unsigned int v35;  // w0
    void* v9;  // x22
    void* v36;  // x22
    unsigned long v37;  // x21
    void* v38;  // x19
    long long v39;  // x8
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
    uint128_t v56;  // q1
    uint128_t v57;  // q1
    uint128_t v58;  // q1
    uint128_t v59;  // q1
    uint128_t v60;  // q1
    void* v61;  // x0
    unsigned int v63;  // w0
    void* v64;  // x22
    long long v65;  // x8
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
    uint128_t v13;  // q1
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
    uint128_t v14;  // q1
    uint128_t v86;  // q1
    unsigned int v87;  // w0
    void* v88;  // x22
    void* v89;  // x19
    long long v90;  // x8
    uint128_t v91;  // q1
    uint128_t v92;  // q1
    uint128_t v93;  // q1
    uint128_t v94;  // q1
    uint128_t v95;  // q1
    uint128_t v15;  // q1
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
    st_257414_1 **v0;  // [bp-0x68], Other Possible Types: char
    st_257414_1 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    void* v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *(int *)a2;
    switch (v8)
    {
    case 13716686291101396263:
        v1 = &v0;
        v0 = &v1;
        if (v7 == 3)
        {
            v137 = *v6;
            v37 = (long long)v137[16];
            v138 = operatornew(672);
            _bzero(v138, 672);
            if (31 >= v138 - v137)
            {
                v139 = 0;
                do
                {
                    *((char *)v138 + v139) = *((char *)v137 + v139);
                    v139 += 1;
                } while (v139 != 672);
            }
            else
            {
                v140 = (int128_t)v137[16];
                *(int128_t *)v138 = *(int128_t *)v137;
                *(uint128_t *)&v138[16] = v140;
                v141 = (int128_t)v137[48];
                *(int128_t *)&v138[32] = (int128_t)v137[32];
                *(uint128_t *)&v138[48] = v141;
                v142 = (int128_t)v137[80];
                *(int128_t *)&v138[64] = (int128_t)v137[64];
                *(uint128_t *)&v138[80] = v142;
                v143 = (int128_t)v137[112];
                *(int128_t *)&v138[96] = (int128_t)v137[96];
                *(uint128_t *)&v138[112] = v143;
                v144 = (int128_t)v137[144];
                *(int128_t *)&v138[128] = (int128_t)v137[128];
                *(uint128_t *)&v138[144] = v144;
                v145 = (int128_t)v137[176];
                *(int128_t *)&v138[160] = (int128_t)v137[160];
                *(uint128_t *)&v138[176] = v145;
                v146 = (int128_t)v137[208];
                *(int128_t *)&v138[192] = (int128_t)v137[192];
                *(uint128_t *)&v138[208] = v146;
                v147 = (int128_t)v137[240];
                *(int128_t *)&v138[224] = (int128_t)v137[224];
                *(uint128_t *)&v138[240] = v147;
                v148 = (int128_t)v137[272];
                *(int128_t *)&v138[0x100] = (int128_t)v137[0x100];
                *(uint128_t *)&v138[272] = v148;
                v149 = (int128_t)v137[304];
                *(int128_t *)&v138[288] = (int128_t)v137[288];
                *(uint128_t *)&v138[304] = v149;
                v150 = (int128_t)v137[336];
                *(int128_t *)&v138[320] = (int128_t)v137[320];
                *(uint128_t *)&v138[336] = v150;
                v151 = (int128_t)v137[368];
                *(int128_t *)&v138[352] = (int128_t)v137[352];
                *(uint128_t *)&v138[368] = v151;
                v152 = (int128_t)v137[400];
                *(int128_t *)&v138[384] = (int128_t)v137[384];
                *(uint128_t *)&v138[400] = v152;
                v153 = (int128_t)v137[432];
                *(int128_t *)&v138[416] = (int128_t)v137[416];
                *(uint128_t *)&v138[432] = v153;
                v154 = (int128_t)v137[464];
                *(int128_t *)&v138[448] = (int128_t)v137[448];
                *(uint128_t *)&v138[464] = v154;
                v155 = (int128_t)v137[496];
                *(int128_t *)&v138[480] = (int128_t)v137[480];
                *(uint128_t *)&v138[496] = v155;
                v156 = (int128_t)v137[528];
                *(int128_t *)&v138[0x200] = (int128_t)v137[0x200];
                *(uint128_t *)&v138[528] = v156;
                v157 = (int128_t)v137[560];
                *(int128_t *)&v138[544] = (int128_t)v137[544];
                *(uint128_t *)&v138[560] = v157;
                v158 = (int128_t)v137[592];
                *(int128_t *)&v138[576] = (int128_t)v137[576];
                *(uint128_t *)&v138[592] = v158;
                v159 = (int128_t)v137[624];
                *(int128_t *)&v138[608] = (int128_t)v137[608];
                *(uint128_t *)&v138[624] = v159;
                v160 = (int128_t)v137[656];
                *(int128_t *)&v138[640] = (int128_t)v137[640];
                *(uint128_t *)&v138[656] = v160;
            }
            *(unsigned long long *)&v138[16] = 2456424;
            *v6 = v138;
            v61 = operatornew(32);
            *(unsigned long long *)v61 = 0;
            *(unsigned long *)&v61[8] = v37;
            *(unsigned long long *)&v61[16] = 2720108;
            *(unsigned long long *)&v61[24] = 0;
            v2 = v6;
            v3 = v61;
            sub_2592b4(&g_f11980, &v2);
            return v161;
        }
        else if (v7 == 2)
        {
            v112 = *v6;
            v10 = (long long)v112[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 >= v11 - v112)
            {
                v113 = 0;
                do
                {
                    *((char *)v11 + v113) = *((char *)v112 + v113);
                    v113 += 1;
                } while (v113 != 672);
                v34 = 2720108;
                break;
            }
            else
            {
                v114 = (int128_t)v112[16];
                *(int128_t *)v11 = *(int128_t *)v112;
                *(uint128_t *)&v11[16] = v114;
                v115 = (int128_t)v112[48];
                *(int128_t *)&v11[32] = (int128_t)v112[32];
                *(uint128_t *)&v11[48] = v115;
                v116 = (int128_t)v112[80];
                *(int128_t *)&v11[64] = (int128_t)v112[64];
                *(uint128_t *)&v11[80] = v116;
                v117 = (int128_t)v112[112];
                *(int128_t *)&v11[96] = (int128_t)v112[96];
                *(uint128_t *)&v11[112] = v117;
                v118 = (int128_t)v112[144];
                *(int128_t *)&v11[128] = (int128_t)v112[128];
                *(uint128_t *)&v11[144] = v118;
                v119 = (int128_t)v112[176];
                *(int128_t *)&v11[160] = (int128_t)v112[160];
                *(uint128_t *)&v11[176] = v119;
                v120 = (int128_t)v112[208];
                *(int128_t *)&v11[192] = (int128_t)v112[192];
                *(uint128_t *)&v11[208] = v120;
                v121 = (int128_t)v112[240];
                *(int128_t *)&v11[224] = (int128_t)v112[224];
                *(uint128_t *)&v11[240] = v121;
                v122 = (int128_t)v112[272];
                *(int128_t *)&v11[0x100] = (int128_t)v112[0x100];
                *(uint128_t *)&v11[272] = v122;
                v123 = (int128_t)v112[304];
                *(int128_t *)&v11[288] = (int128_t)v112[288];
                *(uint128_t *)&v11[304] = v123;
                v124 = (int128_t)v112[336];
                *(int128_t *)&v11[320] = (int128_t)v112[320];
                *(uint128_t *)&v11[336] = v124;
                v125 = (int128_t)v112[368];
                *(int128_t *)&v11[352] = (int128_t)v112[352];
                *(uint128_t *)&v11[368] = v125;
                v126 = (int128_t)v112[400];
                *(int128_t *)&v11[384] = (int128_t)v112[384];
                *(uint128_t *)&v11[400] = v126;
                v127 = (int128_t)v112[432];
                *(int128_t *)&v11[416] = (int128_t)v112[416];
                *(uint128_t *)&v11[432] = v127;
                v128 = (int128_t)v112[464];
                *(int128_t *)&v11[448] = (int128_t)v112[448];
                *(uint128_t *)&v11[464] = v128;
                v129 = (int128_t)v112[496];
                *(int128_t *)&v11[480] = (int128_t)v112[480];
                *(uint128_t *)&v11[496] = v129;
                v130 = (int128_t)v112[528];
                *(int128_t *)&v11[0x200] = (int128_t)v112[0x200];
                *(uint128_t *)&v11[528] = v130;
                v131 = (int128_t)v112[560];
                *(int128_t *)&v11[544] = (int128_t)v112[544];
                *(uint128_t *)&v11[560] = v131;
                v132 = (int128_t)v112[592];
                *(int128_t *)&v11[576] = (int128_t)v112[576];
                *(uint128_t *)&v11[592] = v132;
                v133 = (int128_t)v112[624];
                *(int128_t *)&v11[608] = (int128_t)v112[608];
                *(uint128_t *)&v11[624] = v133;
                v134 = (int128_t)v112[656];
                *(int128_t *)&v11[640] = (int128_t)v112[640];
                *(uint128_t *)&v11[656] = v134;
                v34 = 2720108;
                break;
            }
        }
        else
        {
            return v136;
        }
    case 2561137434563208377:
        v1 = &v0;
        v0 = &v1;
        if (v7 == 3)
        {
            v88 = *v6;
            v37 = (long long)v88[16];
            v89 = operatornew(672);
            _bzero(v89, 672);
            if (31 >= v89 - v88)
            {
                v90 = 0;
                do
                {
                    *((char *)v89 + v90) = *((char *)v88 + v90);
                    v90 += 1;
                } while (v90 != 672);
            }
            else
            {
                v91 = (int128_t)v88[16];
                *(int128_t *)v89 = *(int128_t *)v88;
                *(uint128_t *)&v89[16] = v91;
                v92 = (int128_t)v88[48];
                *(int128_t *)&v89[32] = (int128_t)v88[32];
                *(uint128_t *)&v89[48] = v92;
                v93 = (int128_t)v88[80];
                *(int128_t *)&v89[64] = (int128_t)v88[64];
                *(uint128_t *)&v89[80] = v93;
                v94 = (int128_t)v88[112];
                *(int128_t *)&v89[96] = (int128_t)v88[96];
                *(uint128_t *)&v89[112] = v94;
                v95 = (int128_t)v88[144];
                *(int128_t *)&v89[128] = (int128_t)v88[128];
                *(uint128_t *)&v89[144] = v95;
                v96 = (int128_t)v88[176];
                *(int128_t *)&v89[160] = (int128_t)v88[160];
                *(uint128_t *)&v89[176] = v96;
                v97 = (int128_t)v88[208];
                *(int128_t *)&v89[192] = (int128_t)v88[192];
                *(uint128_t *)&v89[208] = v97;
                v98 = (int128_t)v88[240];
                *(int128_t *)&v89[224] = (int128_t)v88[224];
                *(uint128_t *)&v89[240] = v98;
                v99 = (int128_t)v88[272];
                *(int128_t *)&v89[0x100] = (int128_t)v88[0x100];
                *(uint128_t *)&v89[272] = v99;
                v100 = (int128_t)v88[304];
                *(int128_t *)&v89[288] = (int128_t)v88[288];
                *(uint128_t *)&v89[304] = v100;
                v101 = (int128_t)v88[336];
                *(int128_t *)&v89[320] = (int128_t)v88[320];
                *(uint128_t *)&v89[336] = v101;
                v102 = (int128_t)v88[368];
                *(int128_t *)&v89[352] = (int128_t)v88[352];
                *(uint128_t *)&v89[368] = v102;
                v103 = (int128_t)v88[400];
                *(int128_t *)&v89[384] = (int128_t)v88[384];
                *(uint128_t *)&v89[400] = v103;
                v104 = (int128_t)v88[432];
                *(int128_t *)&v89[416] = (int128_t)v88[416];
                *(uint128_t *)&v89[432] = v104;
                v105 = (int128_t)v88[464];
                *(int128_t *)&v89[448] = (int128_t)v88[448];
                *(uint128_t *)&v89[464] = v105;
                v106 = (int128_t)v88[496];
                *(int128_t *)&v89[480] = (int128_t)v88[480];
                *(uint128_t *)&v89[496] = v106;
                v107 = (int128_t)v88[528];
                *(int128_t *)&v89[0x200] = (int128_t)v88[0x200];
                *(uint128_t *)&v89[528] = v107;
                v108 = (int128_t)v88[560];
                *(int128_t *)&v89[544] = (int128_t)v88[544];
                *(uint128_t *)&v89[560] = v108;
                v109 = (int128_t)v88[592];
                *(int128_t *)&v89[576] = (int128_t)v88[576];
                *(uint128_t *)&v89[592] = v109;
                v110 = (int128_t)v88[624];
                *(int128_t *)&v89[608] = (int128_t)v88[608];
                *(uint128_t *)&v89[624] = v110;
                v111 = (int128_t)v88[656];
                *(int128_t *)&v89[640] = (int128_t)v88[640];
                *(uint128_t *)&v89[656] = v111;
            }
            *(unsigned long long *)&v89[16] = 2456424;
            *v6 = v89;
            v61 = operatornew(32);
            *(unsigned long long *)v61 = 0;
            *(unsigned long *)&v61[8] = v37;
            *(unsigned long long *)&v61[16] = 2719036;
            *(unsigned long long *)&v61[24] = 0;
            v2 = v6;
            v3 = v61;
            sub_2592b4(&g_f11980, &v2);
            return v161;
        }
        else if (v7 == 2)
        {
            v64 = *v6;
            v10 = (long long)v64[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 >= v11 - v64)
            {
                v65 = 0;
                do
                {
                    *((char *)v11 + v65) = *((char *)v64 + v65);
                    v65 += 1;
                } while (v65 != 672);
                v34 = 2719036;
                break;
            }
            else
            {
                v66 = (int128_t)v64[16];
                *(int128_t *)v11 = *(int128_t *)v64;
                *(uint128_t *)&v11[16] = v66;
                v67 = (int128_t)v64[48];
                *(int128_t *)&v11[32] = (int128_t)v64[32];
                *(uint128_t *)&v11[48] = v67;
                v68 = (int128_t)v64[80];
                *(int128_t *)&v11[64] = (int128_t)v64[64];
                *(uint128_t *)&v11[80] = v68;
                v69 = (int128_t)v64[112];
                *(int128_t *)&v11[96] = (int128_t)v64[96];
                *(uint128_t *)&v11[112] = v69;
                v70 = (int128_t)v64[144];
                *(int128_t *)&v11[128] = (int128_t)v64[128];
                *(uint128_t *)&v11[144] = v70;
                v71 = (int128_t)v64[176];
                *(int128_t *)&v11[160] = (int128_t)v64[160];
                *(uint128_t *)&v11[176] = v71;
                v72 = (int128_t)v64[208];
                *(int128_t *)&v11[192] = (int128_t)v64[192];
                *(uint128_t *)&v11[208] = v72;
                v73 = (int128_t)v64[240];
                *(int128_t *)&v11[224] = (int128_t)v64[224];
                *(uint128_t *)&v11[240] = v73;
                v74 = (int128_t)v64[272];
                *(int128_t *)&v11[0x100] = (int128_t)v64[0x100];
                *(uint128_t *)&v11[272] = v74;
                v75 = (int128_t)v64[304];
                *(int128_t *)&v11[288] = (int128_t)v64[288];
                *(uint128_t *)&v11[304] = v75;
                v76 = (int128_t)v64[336];
                *(int128_t *)&v11[320] = (int128_t)v64[320];
                *(uint128_t *)&v11[336] = v76;
                v77 = (int128_t)v64[368];
                *(int128_t *)&v11[352] = (int128_t)v64[352];
                *(uint128_t *)&v11[368] = v77;
                v78 = (int128_t)v64[400];
                *(int128_t *)&v11[384] = (int128_t)v64[384];
                *(uint128_t *)&v11[400] = v78;
                v79 = (int128_t)v64[432];
                *(int128_t *)&v11[416] = (int128_t)v64[416];
                *(uint128_t *)&v11[432] = v79;
                v80 = (int128_t)v64[464];
                *(int128_t *)&v11[448] = (int128_t)v64[448];
                *(uint128_t *)&v11[464] = v80;
                v81 = (int128_t)v64[496];
                *(int128_t *)&v11[480] = (int128_t)v64[480];
                *(uint128_t *)&v11[496] = v81;
                v82 = (int128_t)v64[528];
                *(int128_t *)&v11[0x200] = (int128_t)v64[0x200];
                *(uint128_t *)&v11[528] = v82;
                v83 = (int128_t)v64[560];
                *(int128_t *)&v11[544] = (int128_t)v64[544];
                *(uint128_t *)&v11[560] = v83;
                v84 = (int128_t)v64[592];
                *(int128_t *)&v11[576] = (int128_t)v64[576];
                *(uint128_t *)&v11[592] = v84;
                v85 = (int128_t)v64[624];
                *(int128_t *)&v11[608] = (int128_t)v64[608];
                *(uint128_t *)&v11[624] = v85;
                v86 = (int128_t)v64[656];
                *(int128_t *)&v11[640] = (int128_t)v64[640];
                *(uint128_t *)&v11[656] = v86;
                v34 = 2719036;
                break;
            }
        }
        else
        {
            return v87;
        }
    case 16541317954345723243:
        v1 = &v0;
        v0 = &v1;
        if (v7 == 3)
        {
            v36 = *v6;
            v37 = (long long)v36[16];
            v38 = operatornew(672);
            _bzero(v38, 672);
            if (31 >= v38 - v36)
            {
                v39 = 0;
                do
                {
                    *((char *)v38 + v39) = *((char *)v36 + v39);
                    v39 += 1;
                } while (v39 != 672);
            }
            else
            {
                v40 = (int128_t)v36[16];
                *(int128_t *)v38 = *(int128_t *)v36;
                *(uint128_t *)&v38[16] = v40;
                v41 = (int128_t)v36[48];
                *(int128_t *)&v38[32] = (int128_t)v36[32];
                *(uint128_t *)&v38[48] = v41;
                v42 = (int128_t)v36[80];
                *(int128_t *)&v38[64] = (int128_t)v36[64];
                *(uint128_t *)&v38[80] = v42;
                v43 = (int128_t)v36[112];
                *(int128_t *)&v38[96] = (int128_t)v36[96];
                *(uint128_t *)&v38[112] = v43;
                v44 = (int128_t)v36[144];
                *(int128_t *)&v38[128] = (int128_t)v36[128];
                *(uint128_t *)&v38[144] = v44;
                v45 = (int128_t)v36[176];
                *(int128_t *)&v38[160] = (int128_t)v36[160];
                *(uint128_t *)&v38[176] = v45;
                v46 = (int128_t)v36[208];
                *(int128_t *)&v38[192] = (int128_t)v36[192];
                *(uint128_t *)&v38[208] = v46;
                v47 = (int128_t)v36[240];
                *(int128_t *)&v38[224] = (int128_t)v36[224];
                *(uint128_t *)&v38[240] = v47;
                v48 = (int128_t)v36[272];
                *(int128_t *)&v38[0x100] = (int128_t)v36[0x100];
                *(uint128_t *)&v38[272] = v48;
                v49 = (int128_t)v36[304];
                *(int128_t *)&v38[288] = (int128_t)v36[288];
                *(uint128_t *)&v38[304] = v49;
                v50 = (int128_t)v36[336];
                *(int128_t *)&v38[320] = (int128_t)v36[320];
                *(uint128_t *)&v38[336] = v50;
                v51 = (int128_t)v36[368];
                *(int128_t *)&v38[352] = (int128_t)v36[352];
                *(uint128_t *)&v38[368] = v51;
                v52 = (int128_t)v36[400];
                *(int128_t *)&v38[384] = (int128_t)v36[384];
                *(uint128_t *)&v38[400] = v52;
                v53 = (int128_t)v36[432];
                *(int128_t *)&v38[416] = (int128_t)v36[416];
                *(uint128_t *)&v38[432] = v53;
                v54 = (int128_t)v36[464];
                *(int128_t *)&v38[448] = (int128_t)v36[448];
                *(uint128_t *)&v38[464] = v54;
                v55 = (int128_t)v36[496];
                *(int128_t *)&v38[480] = (int128_t)v36[480];
                *(uint128_t *)&v38[496] = v55;
                v56 = (int128_t)v36[528];
                *(int128_t *)&v38[0x200] = (int128_t)v36[0x200];
                *(uint128_t *)&v38[528] = v56;
                v57 = (int128_t)v36[560];
                *(int128_t *)&v38[544] = (int128_t)v36[544];
                *(uint128_t *)&v38[560] = v57;
                v58 = (int128_t)v36[592];
                *(int128_t *)&v38[576] = (int128_t)v36[576];
                *(uint128_t *)&v38[592] = v58;
                v59 = (int128_t)v36[624];
                *(int128_t *)&v38[608] = (int128_t)v36[608];
                *(uint128_t *)&v38[624] = v59;
                v60 = (int128_t)v36[656];
                *(int128_t *)&v38[640] = (int128_t)v36[640];
                *(uint128_t *)&v38[656] = v60;
            }
            *(unsigned long long *)&v38[16] = 2456424;
            *v6 = v38;
            v61 = operatornew(32);
            *(unsigned long long *)v61 = 0;
            *(unsigned long *)&v61[8] = v37;
            *(unsigned long long *)&v61[16] = 2720688;
            *(unsigned long long *)&v61[24] = 0;
            v2 = v6;
            v3 = v61;
            sub_2592b4(&g_f11980, &v2);
            return v161;
        }
        else if (v7 == 2)
        {
            v9 = *v6;
            v10 = (long long)v9[24];
            v11 = operatornew(672);
            _bzero(v11, 672);
            if (31 >= v11 - v9)
            {
                v12 = 0;
                do
                {
                    *((char *)v11 + v12) = *((char *)v9 + v12);
                    v12 += 1;
                } while (v12 != 672);
            }
            else
            {
                v13 = (int128_t)v9[16];
                *(int128_t *)v11 = *(int128_t *)v9;
                *(uint128_t *)&v11[16] = v13;
                v14 = (int128_t)v9[48];
                *(int128_t *)&v11[32] = (int128_t)v9[32];
                *(uint128_t *)&v11[48] = v14;
                v15 = (int128_t)v9[80];
                *(int128_t *)&v11[64] = (int128_t)v9[64];
                *(uint128_t *)&v11[80] = v15;
                v16 = (int128_t)v9[112];
                *(int128_t *)&v11[96] = (int128_t)v9[96];
                *(uint128_t *)&v11[112] = v16;
                v17 = (int128_t)v9[144];
                *(int128_t *)&v11[128] = (int128_t)v9[128];
                *(uint128_t *)&v11[144] = v17;
                v18 = (int128_t)v9[176];
                *(int128_t *)&v11[160] = (int128_t)v9[160];
                *(uint128_t *)&v11[176] = v18;
                v19 = (int128_t)v9[208];
                *(int128_t *)&v11[192] = (int128_t)v9[192];
                *(uint128_t *)&v11[208] = v19;
                v20 = (int128_t)v9[240];
                *(int128_t *)&v11[224] = (int128_t)v9[224];
                *(uint128_t *)&v11[240] = v20;
                v21 = (int128_t)v9[272];
                *(int128_t *)&v11[0x100] = (int128_t)v9[0x100];
                *(uint128_t *)&v11[272] = v21;
                v22 = (int128_t)v9[304];
                *(int128_t *)&v11[288] = (int128_t)v9[288];
                *(uint128_t *)&v11[304] = v22;
                v23 = (int128_t)v9[336];
                *(int128_t *)&v11[320] = (int128_t)v9[320];
                *(uint128_t *)&v11[336] = v23;
                v24 = (int128_t)v9[368];
                *(int128_t *)&v11[352] = (int128_t)v9[352];
                *(uint128_t *)&v11[368] = v24;
                v25 = (int128_t)v9[400];
                *(int128_t *)&v11[384] = (int128_t)v9[384];
                *(uint128_t *)&v11[400] = v25;
                v26 = (int128_t)v9[432];
                *(int128_t *)&v11[416] = (int128_t)v9[416];
                *(uint128_t *)&v11[432] = v26;
                v27 = (int128_t)v9[464];
                *(int128_t *)&v11[448] = (int128_t)v9[448];
                *(uint128_t *)&v11[464] = v27;
                v28 = (int128_t)v9[496];
                *(int128_t *)&v11[480] = (int128_t)v9[480];
                *(uint128_t *)&v11[496] = v28;
                v29 = (int128_t)v9[528];
                *(int128_t *)&v11[0x200] = (int128_t)v9[0x200];
                *(uint128_t *)&v11[528] = v29;
                v30 = (int128_t)v9[560];
                *(int128_t *)&v11[544] = (int128_t)v9[544];
                *(uint128_t *)&v11[560] = v30;
                v31 = (int128_t)v9[592];
                *(int128_t *)&v11[576] = (int128_t)v9[576];
                *(uint128_t *)&v11[592] = v31;
                v32 = (int128_t)v9[624];
                *(int128_t *)&v11[608] = (int128_t)v9[608];
                *(uint128_t *)&v11[624] = v32;
                v33 = (int128_t)v9[656];
                *(int128_t *)&v11[640] = (int128_t)v9[640];
                *(uint128_t *)&v11[656] = v33;
            }
            v34 = 2720688;
            break;
        }
        else
        {
            return v35;
        }
    default:
        return v63;
    }
    v135 = 2462860;
    if (v34 == 2)
        v135 = 2405940;
    *(unsigned long long *)&v11[24] = v135;
    *v6 = v11;
    v61 = operatornew(32);
    *(unsigned long long *)v61 = 0;
    *(unsigned long *)&v61[8] = v10;
    *(unsigned long *)&v61[16] = v34;
    *(unsigned long long *)&v61[24] = 0;
    v2 = v6;
    v3 = v61;
    sub_2592b4(&g_f11980, &v2);
    return v161;
}

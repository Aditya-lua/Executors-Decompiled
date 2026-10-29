/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc46b30..0xc489cc (7836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c46b30_2 {
} st_c46b30_2;

typedef struct st_c46b30_1 {
    char padding_0[16];
    char field_10;
    char padding_11[15];
    struct st_c46b30_2 *field_20;
    struct st_c46b30_2 *field_28;
    unsigned int field_30;
    char padding_34[12];
    unsigned long long field_40;
    unsigned long long field_48;
    char padding_50[144];
    struct st_c46b30_2 *field_e0;
    char padding_e8[8];
    struct st_c46b30_2 *field_f0;
    struct st_c46b30_2 *field_f8;
    struct st_c46b30_3 *field_100;
    char padding_108[24];
    char field_120;
} st_c46b30_1;

typedef struct st_c46b30_4 {
    char padding_0[16];
    char field_10;
    char padding_11[15];
    struct st_c46b30_2 *field_20;
    struct st_c46b30_2 *field_28;
    unsigned long long field_30;
    char padding_38[8];
    unsigned long long field_40;
    unsigned long long field_48;
    char padding_50[144];
    struct st_c46b30_2 *field_e0;
    char padding_e8[8];
    struct st_c46b30_2 *field_f0;
    struct st_c46b30_2 *field_f8;
    struct st_c46b30_3 *field_100;
    char padding_108[24];
    char field_120;
} st_c46b30_4;

typedef struct st_c46b30_9 {
    unsigned long long field_0;
    char padding_8[120];
    char field_80;
    char field_81;
    char padding_82[86];
    char field_d8;
    char field_d9[23];
    char field_e8;
    char padding_e9[7];
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    struct st_c46b30_10 *field_130;
    unsigned long long field_138;
    struct st_c46b30_4 *field_140;
    unsigned long long field_148;
    unsigned long long field_150;
    unsigned long long field_158;
    struct st_c46b30_4 *field_160;
    struct st_c46b30_10 *field_168;
    unsigned long long field_170;
    struct st_c46b30_4 *field_178;
    struct st_c46b30_4 *field_180;
    struct st_c46b30_4 *field_188;
    unsigned long long field_190;
    struct st_c46b30_4 *field_198;
    struct st_c46b30_4 *field_1a0;
    struct st_c46b30_4 *field_1a8;
    struct st_c46b30_4 *field_1b0;
    struct st_c46b30_4 *field_1b8;
    char padding_1c0[16];
    uint128_t field_1d0;
    uint128_t field_1e0;
    uint128_t field_1f0;
    unsigned long long field_200;
} st_c46b30_9;

typedef struct st_c46b30_11 {
    unsigned long long field_0;
    char padding_8[120];
    char field_80;
    char field_81;
    char padding_82[86];
    char field_d8;
    char field_d9[23];
    char field_e8;
    char padding_e9[7];
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    struct st_c46b30_10 *field_130;
    unsigned int field_138;
    char padding_13c[4];
    struct st_c46b30_4 *field_140;
    unsigned int field_148;
    char padding_14c[4];
    long long field_150;
    unsigned int field_158;
    char padding_15c[4];
    struct st_c46b30_4 *field_160;
    struct st_c46b30_10 *field_168;
    unsigned int field_170;
    char padding_174[4];
    struct st_c46b30_4 *field_178;
    struct st_c46b30_4 *field_180;
    struct st_c46b30_4 *field_188;
    unsigned int field_190;
    char padding_194[4];
    struct st_c46b30_4 *field_198;
    struct st_c46b30_4 *field_1a0;
    struct st_c46b30_4 *field_1a8;
    struct st_c46b30_4 *field_1b0;
    struct st_c46b30_4 *field_1b8;
    char padding_1c0[16];
    uint128_t field_1d0;
    uint128_t field_1e0;
    uint128_t field_1f0;
    unsigned long long field_200;
} st_c46b30_11;

typedef struct st_c46b30_3 {
    char padding_0[16];
    char field_10;
    char padding_11[47];
    unsigned long long field_40;
    unsigned long long field_48;
} st_c46b30_3;

typedef struct st_c46b30_10 {
    struct st_c46b30_4 *field_0;
} st_c46b30_10;

typedef struct st_c46b30_5 {
    unsigned long long field_0;
    unsigned int field_8;
} st_c46b30_5;

extern long long g_e0d561;

unsigned long long sub_c46b30(st_c46b30_11 *a0, long long a1, st_c46b30_4 **a2, st_c46b30_9 **a3)
{
    long long v176;  // x0
    unsigned long v177;  // cc_op
    unsigned long long v186;  // 4111
    unsigned int v187;  // x0
    long long v188;  // x0
    unsigned long long v189;  // 4111
    long long v190;  // x0
    unsigned long long v191;  // 4111
    long long v192;  // x0
    unsigned long long v193;  // 4115
    unsigned long long v195;  // 4115
    unsigned long v178;  // cc_dep1
    unsigned long long v197;  // 4115
    unsigned int v198;  // x0
    unsigned int v199;  // x0
    unsigned int v200;  // x0
    unsigned int v201;  // x0
    unsigned int v202;  // x0
    unsigned int i;  // x22
    unsigned int v204;  // x0
    st_c46b30_4 **v205;  // x21
    unsigned long v179;  // cc_dep2
    st_c46b30_4 *v206;  // x9
    long long v207;  // x0
    unsigned long long v208;  // 4111
    long long v209;  // x0
    unsigned long long v210;  // 4111
    long long v211;  // x0
    unsigned long long v212;  // 4111
    long long v213;  // x0
    unsigned long long v214;  // 4111
    long long v215;  // x0
    unsigned long v180;  // cc_ndep
    unsigned long long v216;  // 4115
    unsigned long long v218;  // 4111
    long long v219;  // x0
    unsigned long long v220;  // 4115
    unsigned long long v222;  // 4115
    unsigned long long v224;  // 4115
    unsigned int v225;  // x0
    unsigned long long v181;  // 4111
    unsigned int v226;  // x0
    unsigned int v227;  // x0
    unsigned int v228;  // x0
    unsigned int v229;  // x0
    unsigned int v230;  // x0
    unsigned int ptr1;  // x0
    unsigned long long v232;  // 4102
    unsigned int ptr2;  // x0
    st_c46b30_1 *v234;  // x23
    unsigned int v235;  // x21
    st_c46b30_1 *v182;  // x9
    unsigned int v236;  // x19
    unsigned int v237;  // x24
    unsigned int v238;  // x25
    unsigned int v239;  // x20
    st_c46b30_5 *v240;  // x8
    unsigned int v241;  // x0
    unsigned int v242;  // x8
    unsigned long v243;  // x11
    unsigned int v244;  // x12
    unsigned long v245;  // x10
    long long v183;  // x0
    unsigned long v246;  // x11
    unsigned long v247;  // x12
    unsigned int v248;  // x13
    void* v249;  // x14
    unsigned int v250;  // x13
    unsigned int v251;  // x26
    unsigned int v253;  // x20
    unsigned long long v184;  // 4111
    long long v185;  // x0
    unsigned int v0;  // [bp-0x8f0]
    unsigned int v10;  // [bp-0x8a0]
    long long v11;  // [bp-0x888], Other Possible Types: unsigned long long
    st_c46b30_4 *v12;  // [bp-0x880], Other Possible Types: long long
    st_c46b30_1 *v13;  // [bp-0x878], Other Possible Types: long long
    st_c46b30_4 *v14;  // [bp-0x870], Other Possible Types: long long
    st_c46b30_1 *v15;  // [bp-0x868]
    st_c46b30_1 *v16;  // [bp-0x860]
    st_c46b30_1 *v17;  // [bp-0x858]
    st_c46b30_1 *v18;  // [bp-0x850]
    st_c46b30_1 *v19;  // [bp-0x848]
    st_c46b30_1 *v20;  // [bp-0x840]
    st_c46b30_1 *v21;  // [bp-0x838]
    st_c46b30_1 *v22;  // [bp-0x830], Other Possible Types: st_c46b30_4 *
    st_c46b30_1 *v23;  // [bp-0x818]
    st_c46b30_1 *v24;  // [bp-0x810]
    st_c46b30_1 *v25;  // [bp-0x808]
    st_c46b30_1 *v26;  // [bp-0x800]
    st_c46b30_1 *v27;  // [bp-0x7f8]
    st_c46b30_1 *v28;  // [bp-0x7f0], Other Possible Types: st_c46b30_4 *, unsigned long
    st_c46b30_1 *v29;  // [bp-0x7e8], Other Possible Types: st_c46b30_4 *
    st_c46b30_9 **v30;  // [bp-0x7e0]
    st_c46b30_4 **v31;  // [bp-0x7d8]
    st_c46b30_1 *v32;  // [bp-0x7d0]
    st_c46b30_1 *v33;  // [bp-0x7c8]
    st_c46b30_1 *v34;  // [bp-0x7c0]
    st_c46b30_1 *v35;  // [bp-0x7b8]
    st_c46b30_1 *v36;  // [bp-0x7b0]
    st_c46b30_1 *v37;  // [bp-0x7a8]
    st_c46b30_1 *v38;  // [bp-0x7a0]
    st_c46b30_1 *v39;  // [bp-0x798]
    st_c46b30_1 *v40;  // [bp-0x790]
    st_c46b30_1 *v41;  // [bp-0x788]
    st_c46b30_1 *v42;  // [bp-0x780]
    st_c46b30_1 *v43;  // [bp-0x778]
    st_c46b30_1 *v44;  // [bp-0x770]
    st_c46b30_1 *v45;  // [bp-0x768]
    st_c46b30_1 *v46;  // [bp-0x760]
    long long v47;  // [bp-0x758]
    st_c46b30_1 *v48;  // [bp-0x750]
    long long v49;  // [bp-0x748]
    unsigned long long v50;  // [bp-0x740]
    long long v51;  // [bp-0x738]
    unsigned long long v52;  // [bp-0x730]
    long long v53;  // [bp-0x728]
    unsigned long long v54;  // [bp-0x720]
    long long v55;  // [bp-0x718]
    unsigned long long v56;  // [bp-0x710]
    long long v57;  // [bp-0x708]
    unsigned long long v58;  // [bp-0x700]
    long long v59;  // [bp-0x6f8]
    unsigned long long v60;  // [bp-0x6f0]
    long long v61;  // [bp-0x6e8]
    unsigned int v62;  // [bp-0x6e0], Other Possible Types: unsigned long long
    unsigned int v63;  // [bp-0x6d8]
    unsigned int v64;  // [bp-0x6c8]
    unsigned int v65;  // [bp-0x6c0]
    st_c46b30_1 *v80;  // [bp-0x5c0]
    unsigned int v84;  // [bp-0x598]
    unsigned int v85;  // [bp-0x590]
    unsigned int v86;  // [bp-0x588]
    unsigned long v87;  // [bp-0x580]
    unsigned int v88;  // [bp-0x578]
    unsigned int v89;  // [bp-0x570]
    unsigned int v90;  // [bp-0x568]
    unsigned int v91;  // [bp-0x560]
    unsigned int v92;  // [bp-0x558]
    unsigned int v93;  // [bp-0x550]
    unsigned int v94;  // [bp-0x548]
    unsigned int v95;  // [bp-0x540]
    unsigned long v96;  // [bp-0x538]
    unsigned long v97;  // [bp-0x530]
    unsigned int v98;  // [bp-0x528]
    uint192_t v119;  // [bp-0x460]
    uint192_t v120;  // [bp-0x460]
    uint128_t v121;  // [bp-0x460]
    uint128_t v122;  // [bp-0x448]
    uint128_t v123;  // [bp-0x438], Other Possible Types: uint128_t
    uint128_t v124;  // [bp-0x428], Other Possible Types: uint128_t
    uint128_t v125;  // [bp-0x418], Other Possible Types: uint128_t
    st_c46b30_1 *v126;  // [bp-0x408]
    st_c46b30_1 *v127;  // [bp-0x400]
    st_c46b30_1 *v128;  // [bp-0x3f8]
    st_c46b30_1 *v129;  // [bp-0x3f0]
    st_c46b30_1 *v130;  // [bp-0x3e8]
    st_c46b30_4 *v131;  // [bp-0x3e0]
    long long v132;  // [bp-0x3d8]
    st_c46b30_4 *v133;  // [bp-0x3d0]
    long long v134;  // [bp-0x3c8]
    unsigned long long v135;  // [bp-0x3c0]
    long long v136;  // [bp-0x3b8]
    unsigned long long v137;  // [bp-0x3b0]
    long long v138;  // [bp-0x3a8]
    unsigned long long v139;  // [bp-0x3a0]
    long long v140;  // [bp-0x398]
    unsigned long long v141;  // [bp-0x390]
    long long v142;  // [bp-0x388]
    unsigned long long v143;  // [bp-0x380]
    unsigned long long v144;  // [bp-0x378]
    unsigned long long v145;  // [bp-0x370]
    long long v146;  // [bp-0x368]
    unsigned int v147;  // [bp-0x360]
    unsigned int v148;  // [bp-0x358]
    unsigned int v149;  // [bp-0x348]
    unsigned int v150;  // [bp-0x340]
    char *v174;  // [bp-0x10]
    char v175;  // [bp+0x0]

    v174 = &v175;
    v0 = 0;
    v30 = a3;
    v31 = a2;
    v176 = sub_c600f0(sub_c601ac(a1, ".debug_abbrev"), ".debug_abbrev");
    v181 = arm64g_calculate_condition(v177, v178, v179, v180);
    v28 = (v181 & 1 ? 0 : ".debug_abbrev");
    v29 = v182;
    v183 = sub_c600f0(sub_c60104(v176, ".debug_addr"), ".debug_addr");
    v184 = arm64g_calculate_condition(v177, v178, v179, v180);
    v26 = (v184 & 1 ? 0 : ".debug_addr");
    v27 = v182;
    v185 = sub_c600f0(sub_c600c0(v183, ".debug_aranges"), ".debug_aranges");
    v186 = arm64g_calculate_condition(v177, v178, v179, v180);
    v24 = (v186 & 1 ? 0 : ".debug_aranges");
    v25 = v182;
    v187 = sub_c60104(v185, ".debug_info");
    v23 = (st_c46b30_1 *)(v187 ? v187 : 1);
    v22 = (!v187 ? 0 : ".debug_info");
    v188 = sub_c600f0(sub_c60104(v187, ".debug_line"), ".debug_line");
    v189 = arm64g_calculate_condition(v177, v178, v179, v180);
    v20 = (v189 & 1 ? 0 : ".debug_line");
    v21 = v182;
    v190 = sub_c600f0(sub_c600b4(v188, ".debug_line_str"), ".debug_line_str");
    v191 = arm64g_calculate_condition(v177, v178, v179, v180);
    v18 = (v191 & 1 ? 0 : ".debug_line_str");
    v19 = v182;
    v192 = sub_c600c0(v190, ".debug_macinfo");
    sub_c600f0(v192, ".debug_macinfo");
    v193 = arm64g_calculate_condition(v177, v178, v179, v180);
    v16 = (v193 & 1 ? 0 : ".debug_macinfo");
    v17 = v182;
    sub_c600f0(sub_c60194(a1, ".debug_macro"), ".debug_macro");
    v195 = arm64g_calculate_condition(v177, v178, v179, v180);
    v14 = (v195 & 1 ? 0 : ".debug_macro");
    v15 = v182;
    sub_c600f0(sub_c6018c(a1, ".debug_str"), ".debug_str");
    v197 = arm64g_calculate_condition(v177, v178, v179, v180);
    v12 = (v197 & 1 ? 0 : ".debug_str");
    v13 = v182;
    v198 = sub_c54568(a1, ".debug_str_offsets", 18);
    v11 = (v198 ? v198 : 1);
    v199 = sub_c60194(a1, &g_e0d561);
    v200 = sub_c6018c(a1, ".debug_loc");
    v201 = sub_c600b4(v200, ".debug_loclists");
    v202 = sub_c601ac(a1, ".debug_ranges");
    i = (v202 ? v202 : 1);
    v204 = sub_c600b4(v202, ".debug_rnglists");
    v63 = 0;
    v62 = 0;
    v32 = v29;
    v33 = v28;
    v34 = v27;
    v35 = v26;
    v36 = v25;
    v37 = v24;
    v38 = v23;
    v39 = v22;
    v40 = v21;
    v41 = v20;
    v42 = v19;
    v43 = v18;
    v44 = v17;
    v45 = v16;
    v46 = v15;
    v47 = v14;
    v48 = v13;
    v49 = v12;
    v50 = v11;
    v51 = (!v198 ? 0 : ".debug_str_offsets");
    v52 = (v199 ? v199 : 1);
    v53 = (!v199 ? 0 : &g_e0d561);
    v54 = (v200 ? v200 : 1);
    v55 = (!v200 ? 0 : ".debug_loc");
    v205 = v31;
    v56 = (v201 ? v201 : 1);
    v57 = (!v201 ? 0 : ".debug_loclists");
    v58 = i;
    v59 = (!v202 ? 0 : ".debug_ranges");
    v60 = (v204 ? v204 : 1);
    v61 = (!v204 ? 0 : ".debug_rnglists");
    v64 = 0;
    v65 = 0;
    v206 = *v205;
    v29 = v206;
    v119 = v120;
    if (v206 != 0x8000000000000000)
    {
        v207 = sub_c600f0(sub_c601ac(v205, ".debug_abbrev"), ".debug_abbrev");
        v208 = arm64g_calculate_condition(v177, v178, v179, v180);
        v27 = (v208 & 1 ? 0 : ".debug_abbrev");
        v28 = v206;
        v209 = sub_c600f0(sub_c60110(v207, ".debug_addr"), ".debug_addr");
        v210 = arm64g_calculate_condition(v177, v178, v179, v180);
        v25 = (v210 & 1 ? 0 : ".debug_addr");
        v26 = v206;
        v211 = sub_c600f0(sub_c601e4(v209, ".debug_aranges"), ".debug_aranges");
        v212 = arm64g_calculate_condition(v177, v178, v179, v180);
        v23 = (v212 & 1 ? 0 : ".debug_aranges");
        v24 = v206;
        v213 = sub_c600f0(sub_c60110(v211, ".debug_info"), ".debug_info");
        v214 = arm64g_calculate_condition(v177, v178, v179, v180);
        v21 = (v214 & 1 ? 0 : ".debug_info");
        v22 = v206;
        v215 = sub_c60110(v213, ".debug_line");
        sub_c600f0(v215, ".debug_line");
        v216 = arm64g_calculate_condition(v177, v178, v179, v180);
        v19 = (v216 & 1 ? 0 : ".debug_line");
        v20 = v206;
        v218 = arm64g_calculate_condition(v177, v178, v179, v180);
        v17 = (v218 & 1 ? 0 : ".debug_line_str");
        v18 = v206;
        v219 = sub_c601e4(sub_c600f0(sub_c600fc(v205, ".debug_line_str"), ".debug_line_str"), ".debug_macinfo");
        sub_c600f0(v219, ".debug_macinfo");
        v220 = arm64g_calculate_condition(v177, v178, v179, v180);
        v15 = (v220 & 1 ? 0 : ".debug_macinfo");
        v16 = v206;
        sub_c600f0(sub_c60194(v205, ".debug_macro"), ".debug_macro");
        v222 = arm64g_calculate_condition(v177, v178, v179, v180);
        v13 = (v222 & 1 ? 0 : ".debug_macro");
        v14 = v206;
        sub_c600f0(sub_c6018c(v205, ".debug_str"), ".debug_str");
        v224 = arm64g_calculate_condition(v177, v178, v179, v180);
        v11 = (v224 & 1 ? 0 : ".debug_str");
        v12 = v206;
        v225 = sub_c54568(v205, ".debug_str_offsets", 18);
        v10 = (v225 ? v225 : 1);
        v226 = sub_c60194(v205, &g_e0d561);
        v227 = sub_c6018c(v205, ".debug_loc");
        v228 = sub_c600fc(v205, ".debug_loclists");
        v229 = sub_c601ac(v205, ".debug_ranges");
        i = (!v229 ? 0 : ".debug_ranges");
        v230 = sub_c600fc(v205, ".debug_rnglists");
        v148 = 0;
        v147 = 0;
        v121 = CONCAT(1, 1);
        v119 = _INSERT(CONCAT(v121, 0), 16, v28);
        *(st_c46b30_1 **)&v122 = v27;
        *(st_c46b30_1 **)((char *)&v122 + 8) = v26;
        *(st_c46b30_1 **)&v123 = v25;
        *(st_c46b30_1 **)((char *)&v123 + 8) = v24;
        *(st_c46b30_1 **)&v124 = v23;
        *(st_c46b30_4 **)((char *)&v124 + 8) = v22;
        *(st_c46b30_1 **)&v125 = v21;
        *(st_c46b30_1 **)((char *)&v125 + 8) = v20;
        v126 = v19;
        v127 = v18;
        v128 = v17;
        v129 = v16;
        v130 = v15;
        v131 = v14;
        v132 = v13;
        v133 = v12;
        v134 = v11;
        v135 = v10;
        v136 = (!v225 ? 0 : ".debug_str_offsets");
        v137 = (v226 ? v226 : 1);
        v138 = (!v226 ? 0 : &g_e0d561);
        v139 = (v227 ? v227 : 1);
        v140 = (!v227 ? 0 : ".debug_loc");
        v141 = (v228 ? v228 : 1);
        v142 = (!v228 ? 0 : ".debug_loclists");
        v143 = (v229 ? v229 : 1);
        v144 = i;
        v145 = (v230 ? v230 : 1);
        v146 = (!v230 ? 0 : ".debug_rnglists");
        v149 = 0;
        v150 = 0;
        ptr1 = _malloc(296);
        if (ptr1)
        {
            sub_c6022c();
            if (v62)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v232 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v232 & 1))
                {
                    /* unsupported instruction */;
                    sub_c60220();
                }
            }
            v62 = ptr1;
            sub_c6014c();
            goto LABEL_c47024;
        }
        else
        {
            sub_c60214();
            goto LABEL_c48730;
        }
        goto LABEL_c48730;
    }
LABEL_c47024:
    _memcpy((char *)&v119 + 16, &v32, 280);
    v119 = _INSERT(CONCAT(v119, 0), 0, CONCAT(1, 1));
    ptr2 = _malloc(296);
    if (!ptr2)
    {
        sub_c60214();
LABEL_c48730:
        __debugbreak();
    }
    v234 = (st_c46b30_1 *)ptr2;
    sub_c6022c();
    v80 = v234;
    v84 = 0;
    v85 = 8;
    v86 = 0;
    v235 = *(long long *)&v234->padding_34[4];
    v28 = *(long long *)&v234->field_30;
    v87 = *(long long *)&v234->field_30;
    v88 = v235;
    v89 = 0;
    if (v235)
    {
        v236 = 0;
        v237 = 0;
        v238 = 0;
        v239 = 8;
        i = v235;
        do
        {
            sub_c54718(&v119, &v87, v238);
            if (*(char *)((void*)&v123 + 1) == 3)
            {
                v251 = *(unsigned long long *)((void*)&v119 + 8);
                v253 = *(unsigned long long *)&v119 >> 8;
            }
            v238 = i - v88 + v89;
            v89 = v238;
            if (v237 == v84)
            {
                sub_c6c28c(&v84);
                v239 = v85;
            }
            v240 = (st_c46b30_5 *)(v239 + v236);
            v240->field_0 = *(unsigned long long *)((void*)&v122 + 8);
            *(unsigned long long *)&v240->field_8 = *(unsigned long long *)((void*)&v119 + 16);
            v237 += 1;
            v86 = v237;
            i = v88;
            v236 += 16;
        } while (i);
        if (2 <= v237)
        {
            v241 = v85;
            if (21 > v237)
            {
                v242 = 0;
                v243 = v241 + 16;
                v244 = v241;
                do
                {
                    v245 = v243;
                    v246 = *(long long *)(v244 + 16);
                    if ((unsigned long long)*(long long *)v244 > v246)
                    {
                        v247 = *(long long *)(v244 + 24);
                        v248 = v242;
                        do
                        {
                            v249 = (void*)(v241 + v248);
                            *(int128_t *)&v249[16] = *(int128_t *)v249;
                            if (!v248)
                            {
                                v250 = v241;
                                goto LABEL_c485b4;
                            }
                        } while ((v248 -= 16, v246 < (unsigned long long)*(long long *)((char *)v249 - 16)));
                        v250 = v241 + v248 + 16;
LABEL_c485b4:
                        *(unsigned long *)v250 = v246;
                        *(unsigned long *)(v250 + 8) = v247;
                    }
                } while ((v243 = v245 + 16, v242 += 16, v244 = v245, v243 != v241 + v237 * 16));
            }
            else
            {
                sub_c549d4(v241, v237);
            }
        }
    }
    v90 = 0;
    v91 = 8;
    v92 = 0;
    v93 = 0;
    v94 = 8;
    v95 = 0;
    v96 = v234->field_40;
    v97 = v234->field_48;
    v98 = 0;
    *(unsigned int *)&v23 = v234->field_120;
    v24 = v234->field_f0;
    v25 = v234->field_20;
    v26 = v234->field_f8;
    v27 = v234->field_28;
}

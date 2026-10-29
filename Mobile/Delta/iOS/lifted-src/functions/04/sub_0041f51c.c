/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41f51c..0x41ff28 (2572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41f51c_0 {
    char field_0;
} st_41f51c_0;

extern unsigned short g_f04520;
extern unsigned short g_f04522;
extern unsigned short g_f04524;
extern unsigned short g_f04526;
extern unsigned long long g_f04528;
extern unsigned short g_f12060;
extern unsigned short g_f12062;
extern unsigned short g_f12064;
extern unsigned short g_f12066;

int sub_41f51c(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x10
    unsigned long long v13;  // x16
    unsigned int v103;  // w8
    unsigned int v104;  // w9
    unsigned int v105;  // w8
    unsigned int v106;  // w9
    unsigned int v107;  // w8
    unsigned long long v14;  // x10
    unsigned long long v15;  // x10
    unsigned long long v16;  // x12
    unsigned int v17;  // w10
    unsigned int v18;  // w12
    unsigned int v19;  // w12
    unsigned long long v20;  // x11
    unsigned int v21;  // w13
    unsigned int v22;  // w12
    unsigned long long v5;  // x12
    unsigned long long v23;  // x13
    unsigned long long v24;  // x14
    unsigned long long v25;  // x15
    unsigned long long v26;  // x13
    unsigned long v27;  // x14
    unsigned long long v28;  // x15
    unsigned long long v29;  // x17
    unsigned long long v30;  // x14
    unsigned int v31;  // w14
    unsigned long v32;  // x15
    unsigned long long v6;  // x8
    unsigned long long v33;  // x17
    unsigned long long v34;  // x0
    unsigned long long v35;  // x1
    unsigned long long v36;  // x17
    unsigned long long v37;  // x15
    unsigned long long v38;  // x0
    unsigned long long v39;  // x17
    unsigned long long v40;  // x1
    unsigned long long v41;  // x0
    unsigned long long v42;  // x4
    unsigned long long v7;  // x11
    unsigned long long v43;  // x1
    unsigned int v44;  // w17
    unsigned int v45;  // w0
    unsigned int v46;  // w14
    unsigned long long v47;  // x17
    unsigned long long v48;  // x0
    unsigned long long v49;  // x2
    unsigned long long v50;  // x5
    unsigned long long v51;  // x17
    unsigned long long v52;  // x17
    unsigned long long v8;  // x8
    unsigned long long v53;  // x0
    unsigned long long v54;  // x17
    unsigned long long v55;  // x1
    unsigned long long v56;  // x17
    unsigned int v57;  // w17
    unsigned long long v58;  // x0
    unsigned long long v59;  // x1
    unsigned long long v60;  // x2
    unsigned long long v61;  // x2
    unsigned long long v62;  // x0
    st_41f51c_0 *v9;  // x10
    unsigned long long v63;  // x0
    unsigned long long v64;  // x16
    unsigned long long v65;  // x0
    unsigned short v66;  // x16
    unsigned long long v67;  // x17
    unsigned long v68;  // x0
    unsigned long long v69;  // x1
    unsigned long long v70;  // x3
    unsigned long long v71;  // x2
    unsigned long long v72;  // x0
    st_41f51c_0 **v10;  // x12
    unsigned long long v73;  // x15
    unsigned long long v74;  // x17
    unsigned long long v75;  // x15
    unsigned long long v76;  // x0
    unsigned int v77;  // w17
    unsigned int v78;  // w17
    unsigned int v79;  // w0
    unsigned int v80;  // w12
    unsigned int v81;  // w14
    unsigned short v82;  // x17
    unsigned long long v11;  // x14
    unsigned short v83;  // x14
    unsigned int v84;  // w14
    unsigned int v85;  // w16
    unsigned int v86;  // w12
    unsigned short v87;  // x14
    unsigned short v88;  // x15
    unsigned int v89;  // w8
    unsigned int v90;  // w9
    unsigned int v91;  // w11
    unsigned int v92;  // w12
    st_41f51c_0 **v12;  // x15
    unsigned int v93;  // w13
    unsigned int v94;  // w10
    unsigned int v95;  // w15
    unsigned int v96;  // w8
    unsigned int v97;  // w9
    unsigned int v98;  // w10
    unsigned int v99;  // w12
    unsigned int v100;  // w11
    unsigned int v101;  // w12
    unsigned int v102;  // w11
    st_41f51c_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_41f51c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f04520 + ~(~&g_f04520 + &g_f04520));
    v4 = v3 >> 29;
    v5 = v3 | v4;
    v6 = ~v3 - (v4 | ~v3);
    v7 = v5 ^ v6;
    v8 = v7 + (v5 & v6) * 2;
    v9 = v1;
    v10 = v0;
    v11 = v10 - v9;
    v12 = ~v10;
    v13 = v9 | ~v10;
    v14 = v11 + (v9 + v12 ^ -v13) * 2 + (v9 + v12 & -v13) * 4;
    v15 = (v10 + ~v9 & -(v11 + v13)) * 4 + (v10 + ~v9 ^ -(v11 + v13)) * 2 + ((v11 * 2 | v11 >> 63) & 2 & 3) + ((v10 + ~v9 & -(v11 + v13)) * 4 + (v10 + ~v9 ^ -(v11 + v13)) * 2 | 0xfffffffffffffffd - (v9 + v10 + v12 * 2)) + (0xfffffffffffffffd - (v9 + v10 + v12 * 2) | ~((v10 + ~v9 & -(v11 + v13)) * 4 + (v10 + ~v9 ^ -(v11 + v13)) * 2)) + (v14 ^ 1) + (v9 + v10 + v12 * 2 - v14) * 2;
    v16 = (((0xfffffffffffffffa - v15 | 12157) ^ v15 + 6) + ((0xfffffffffffffffa - v15 | 12157) & v15 + 6) * 2 ^ (v15 + 5 | 12157) + 1) + (((0xfffffffffffffffa - v15 | 12157) ^ v15 + 6) + ((0xfffffffffffffffa - v15 | 12157) & v15 + 6) * 2 & (v15 + 5 | 12157) + 1) * 2;
    v0 = ~v16 + v16 * 2;
    v1 = v15 + 53383;
    v17 = v0;
    v18 = v1;
    v19 = (v18 + ~v18 * 2 + 1 & v17) + v18;
    v20 = ~v8 * 2;
    v21 = ((unsigned int)v8 ^ 1) + (__ROL__((unsigned int)v7, 1) & 2 & 3) + (unsigned int)v20;
    v22 = v21 | v18 + v17 + ~(v18 | v17) + ((unsigned int)(0xfffffffe - (v18 + v17 + ~(v18 | v17))) | v19) + (v18 & v17 | v19) + 2;
    g_f12060 = (unsigned short)v21 + (unsigned short)v22 + ((unsigned short)-v21 & (unsigned short)~v22) * 2 + (unsigned short)(v22 - v21 - (v22 | -v21)) * 2;
    v23 = v1;
    v24 = v0;
    v25 = v24 + ~v23 + (v23 & ~v24) * 2;
    v26 = (v24 ^ v23) + (0xffffffffffffffff ^ (v24 ^ v23) * 2) + v25 * 2 + (0xfffffffffffffffe - v25 | (v24 ^ v23) + (0xffffffffffffffff ^ (v24 ^ v23) * 2)) + (0xfffffffffffffffe - v25 | v24 ^ v23) + 4;
    v27 = (v26 * 2 & 4) + (v26 ^ 2);
    v28 = ~v27 + v27 * 2;
    v29 = v28 * 2;
    v30 = v28 + ((-v27 | 5) + v27) * 2 + (~(unsigned int)v29 & 10) - 5;
    v0 = ~v30 + v30 * 2;
    v1 = (v28 ^ 13) + (v29 & 26) - 1;
    v31 = v8 >> ((char)v0 + 1 + ((char)v1 | (char)v0) + ((char)v0 + 1 + (char)~v0 * 2 | (char)v1) & 63);
    v32 = v1;
    v33 = v0;
    v34 = v33 | v32;
    v35 = (-((v33 + v32 ^ -v34) + (v33 + v32 & -v34) * 2) ^ v34) + (-((v33 + v32 ^ -v34) + (v33 + v32 & -v34) * 2) & v34) * 2;
    v36 = v34 + 1 + (v33 & v32) + (-(v33 & v32) & ~v34) * 2 + (v34 + 1 + (-(v33 & v32) | ~v34)) * 2;
    v37 = v36 - 2;
    v38 = v35 - v36 + (v37 | ~v35) + 2;
    v39 = (v38 ^ (v37 & v35) - v35) + (1 - v36 & v35) * 2 + (v38 & (v37 & v35) - v35) * 2;
    v40 = v39 + 56046;
    v41 = (v39 + 56045 ^ -(v40 + (0xffffffffffff2512 | ~v39))) + (v39 + 56045 & -(v40 + (0xffffffffffff2512 | ~v39))) * 2;
    v42 = v39 + 1;
    v43 = ((unsigned int)v42 + (unsigned int)~v39 * 2 | 0xffffffffffff2512) + v40;
    v0 = v41 + (v43 | ~v41) + (v41 | v43) + 1;
    v1 = v42 + (v39 ^ 0xffffffffffffdaed) + (v39 | 9490) + (9490 & ~v39);
    v44 = (unsigned int)v1 + (unsigned int)v0;
    v45 = v44 & v31;
    v46 = v31 - v44 + v45 + (v44 & ~v31) * 2;
    g_f12062 = (unsigned short)v46 + ((unsigned short)v31 | (unsigned short)v44) + (unsigned short)v45 + (((unsigned short)v31 | (unsigned short)v44) + (unsigned short)v45 + ((unsigned short)-v46 | (unsigned short)~((v31 | v44) + v45)) + ((unsigned short)-v46 & (unsigned short)~((v31 | v44) + v45))) * 2 + 2;
    v47 = v1;
    v48 = v0;
    v49 = (v47 ^ -v48) + (v47 + (-v48 | ~v47)) * 2;
    v50 = v48 | v47;
    v51 = -((v47 + ~v50 ^ v48 + 1) + (v47 + ~v50 & v48 + 1) * 2);
    v52 = (v51 ^ v50) + (v50 + (v51 | ~v50)) * 2 + 2;
    v53 = v52 * 2;
    v54 = ((v48 & ~v47) * 2 | ~(v49 + 2)) + (v48 & ~v47) * 2 + (~(v49 + 2) | ~((v48 & ~v47) * 2)) + v49 * 2 + v52 + 6;
    v55 = v54 + ~v53;
    v0 = v55 + 12;
    v1 = (v55 + 22 ^ -(v54 - v53 | 21)) + (v54 - v53 | 21) + (v55 + 22 & -(v54 - v53 | 21)) * 2;
    v56 = ((v1 | ~v0) + v0 + 1 ^ (v1 ^ v0) + (v1 | ~v0) + v0 + 2) + ((v1 | ~v0) + v0 + 1 & (v1 ^ v0) + (v1 | ~v0) + v0 + 2) * 2;
    v57 = v8 >> ((char)~v56 + (char)v56 * 2 & 63);
    v58 = v1;
    v59 = v0;
    v60 = v58 + ~v58 * 2 + 1;
    v61 = v58 - v59 + ((v60 + v59 & -(v60 | v59)) * 4 + (v60 + v59 ^ -(v60 | v59)) * 2 | ~(v58 - v59)) + ((v60 + v59 & -(v60 | v59)) * 4 + (v60 + v59 ^ -(v60 | v59)) * 2 | v58 - v59) + 1;
    v62 = -((v59 + ~v59 * 2 ^ ~(v59 + ~v59 * 2 + 1 | v58)) + ((v59 + ~v59 * 2 + 1 | v58) & ~(v59 + ~v59 * 2)) * 2);
    v63 = (v62 ^ (v59 | v58)) + ((v59 | v58) + (v62 | ~(v59 | v58))) * 2;
    v64 = v61 - v63 - 2 + ((v61 & 0xfffffffffffffffe - v63) - (v61 - v63 - 2) & v61 - v63 - 2) * 4 + (((v61 & 0xfffffffffffffffe - v63) - (v61 - v63 - 2) ^ v61 - v63 - 2) - (v61 & 0xfffffffffffffffe - v63)) * 2;
    v65 = ((v64 + 1 + ~v64 * 2 | 60155) ^ v64 + 1) + ((v64 + 1 + ~v64 * 2 | 60155) & v64 + 1) * 2;
    v0 = (v64 | 60155) + v65 + (v64 | 60155 | ~v65) + (v65 & ~(v64 | 60155)) + 1;
    v1 = v64 + 5380;
    v66 = v0 + ~(unsigned int)v1 + ((unsigned int)v1 + 1 & v0) * 2 + ((unsigned int)v1 + 1 & ~v0) * 2 - 1;
    g_f12064 = (unsigned short)v57 + 1 + (unsigned short)v57 + 1 + (unsigned short)~v57 * 2 + (v66 | (unsigned short)~(v57 + 1 + ~v57 * 2)) + ((unsigned short)v57 + 1 + (unsigned short)~v57 * 2 ^ v66) + 1;
    v67 = v1;
    v68 = v0;
    v69 = v68 + ~v68 * 2 + 1 & v67;
    v70 = -((v67 + ~v67 * 2 ^ ~(v67 + ~v67 * 2 + 1 | v68)) + ((v67 + ~v67 * 2 + 1 | v68) & ~(v67 + ~v67 * 2)) * 2);
    v71 = (v70 ^ v69 + v68) + (v69 + v68 + (v70 | ~(v69 + v68))) * 2;
    v72 = 1 | v69 * 2;
    v73 = (v71 + 2 ^ (v72 ^ v68 - v67) + (v72 & v68 - v67) * 2 - 1) + (v71 + 2 - ((v72 ^ v68 - v67) + (v72 & v68 - v67) * 2) + ((-((v72 ^ v68 - v67) + (v72 & v68 - v67) * 2) | 1) + ((v72 ^ v68 - v67) & 1) | ~(v71 + 2)) + v71 + 3 - (v71 + 3) * 2 + (v71 + 2 & (v72 ^ v68 - v67) + (v72 & v68 - v67) * 2 - 1) - (v71 + 3 - (v71 + 3) * 2 | 1 - ((v72 ^ v68 - v67) + (v72 & v68 - v67) * 2))) * 2;
    v74 = v73 + 4;
    v75 = v73 + 5;
    v76 = v75 + ~v74 * 2 | 5;
    v0 = (0xffffffffffffffd4 - (v75 + (0xffffffffffffffd4 | ~v74)) & v75 + (43 | ~v74)) + v75 + (0xffffffffffffffd4 | ~v74) + 43 + (v75 + (0xffffffffffffffd4 | ~v74) + 43 & v75 + (43 | ~v74));
    v1 = (v76 ^ v75) + (v74 | 5) + (v76 & v75) * 2;
    g_f12066 = v8 >> ((char)v1 + (char)v0 & 63);
    v77 = g_f04520 + ~g_f04520 * 2 + 1;
    v78 = v77 + ~v77 * 2;
    v79 = v78 + 1 | g_f12060;
    g_f04520 = g_f04520 + g_f12060 + ((unsigned short)v79 & (unsigned short)~v78) * 4 + (((unsigned short)v78 ^ (unsigned short)~v79) + ~g_f12060) * 2 + 2;
    v80 = g_f04522 + 1;
    v81 = v80 + ~g_f04522 * 2;
    v82 = (unsigned short)v81 + g_f12062;
    v83 = -(v81 | g_f12062);
    g_f04522 = (unsigned short)v80 + g_f12062 + (v82 & v83) * 4 + ((v82 ^ v83) + ~g_f12062) * 2 + 1;
    v84 = g_f04524 | g_f12064;
    v85 = -g_f04524;
    v86 = g_f04524 - g_f12064;
    g_f04524 = (unsigned short)v86 + ((unsigned short)v84 & (unsigned short)v85) * 4 + ((unsigned short)v84 ^ (unsigned short)v85) * 2 + (((unsigned short)v84 & (unsigned short)v85) * 4 + ((unsigned short)v84 ^ (unsigned short)v85) * 2 | (unsigned short)~v86) + ((unsigned short)v86 & (unsigned short)~((v84 & v85) * 4 + (v84 ^ v85) * 2)) + 1;
    v87 = g_f04526 + 1;
    v88 = v87 + ~g_f04526 * 2 | g_f12066;
    g_f04526 = v87 + g_f12066 + (v88 ^ (unsigned int)(0xfffe - g_f04526)) - ((g_f12066 & g_f04526) + (v88 & v87) * 2);
    g_f04528 = (g_f04528 & v8 + v20 + 1) + v8 + ~((g_f04528 + ~g_f04528 * 2 + 1 | v8) + g_f04528);
    v89 = v1;
    v90 = v0;
    v91 = v89 - v90 + (v90 & v89) + (v90 & ~v89) * 2 + ((v89 + 1 + ~v89 * 2 | v90) ^ ~v89 * 2 + v89) - ((v89 + 1 + ~v89 * 2 | v90) & v89 + 1) * 2;
    v92 = v91 + 1;
    v93 = v91 + 2;
    v94 = 0xfffffffe - v91;
    v95 = v94 * 2;
    v96 = (v92 ^ -v89) + (v93 + (v94 | -v89) + (v95 + (v92 ^ 1) + (__ROL__(v92, 1) & 2 & 3) & v89)) * 2;
    v97 = (v92 | v90) - (v90 - v92 + (v92 | ~v90) & v93) * 2 + (v90 - v92 + (v92 | ~v90) ^ v95 + v92);
    v98 = v97 + 1;
    v99 = v96 | v98;
    v100 = (v98 | ~v96) - v97 + v99 * 2;
    v101 = -((v98 + v96 ^ -v99) + (v98 + v96 & -v99) * 2);
    v102 = (v101 ^ v100) + (v101 & v100) * 2;
    v103 = (v98 ^ -v96) + (v97 + ((unsigned int)(0x7ffffffe - v97) | -v96)) * 2;
    v104 = (v97 - v98 * 2 + v96 & -(v97 - v98 * 2 | v96)) * 4 + (v97 - v98 * 2 + v96 ^ -(v97 - v98 * 2 | v96)) * 2;
    v105 = v103 + v104 + (v104 | ~(v103 + 4)) + (v103 + 4 & ~v104);
    v106 = v102 ^ (unsigned int)(0xfffffffb - v105);
    v107 = ((v105 + 4 | v102) - v105) * 2 - 7;
    return (v107 ^ v106) + (v107 & v106) * 2 - 1;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x419bac..0x41a6e0 (2868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_419bac_0 {
    char field_0;
} st_419bac_0;

extern unsigned short g_f04440;
extern unsigned short g_f04442;
extern unsigned short g_f04444;
extern unsigned short g_f04446;
extern unsigned long long g_f04448;
extern unsigned short g_f11ff0;
extern unsigned short g_f11ff2;
extern unsigned short g_f11ff4;
extern unsigned short g_f11ff6;
extern unsigned int g_fffffffffffffffc;

int sub_419bac(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x10
    unsigned int v102;  // w8
    unsigned int v103;  // w9
    unsigned int v104;  // w8
    unsigned int v105;  // w9
    unsigned int v106;  // w10
    unsigned int v107;  // w11
    unsigned int v108;  // w12
    unsigned int v109;  // w8
    unsigned int v110;  // w8
    unsigned long long v13;  // x12
    unsigned long long v14;  // x10
    unsigned long long v15;  // x10
    unsigned long long v16;  // x12
    unsigned long long v17;  // x10
    unsigned long long v18;  // x16
    unsigned long long v19;  // x10
    unsigned int v20;  // w10
    unsigned int v21;  // w12
    st_419bac_0 *v4;  // x10
    unsigned int v22;  // w13
    unsigned int v23;  // w10
    unsigned short v24;  // x10
    unsigned long long v25;  // x12
    unsigned long long v26;  // x13
    unsigned long long v27;  // x15
    unsigned long long v28;  // x14
    unsigned long long v29;  // x12
    unsigned long long v30;  // x12
    unsigned long long v31;  // x13
    st_419bac_0 **v5;  // x12
    unsigned long long v32;  // x12
    unsigned int v33;  // w12
    unsigned long v34;  // x13
    unsigned long long v35;  // x14
    unsigned long long v36;  // x15
    unsigned long long v37;  // x15
    unsigned long long v38;  // x17
    unsigned long long v39;  // x13
    unsigned long long v40;  // x13
    unsigned long long v41;  // x13
    st_419bac_0 *v6;  // x14
    unsigned long long v42;  // x15
    unsigned short v43;  // x13
    unsigned long long v44;  // x13
    unsigned long long v45;  // x14
    unsigned long long v46;  // x16
    unsigned long long v47;  // x0
    unsigned long long v48;  // x15
    unsigned long long v49;  // x17
    unsigned long long v50;  // x13
    unsigned long long v51;  // x14
    unsigned long long v7;  // x13
    unsigned long long v52;  // x13
    unsigned long long v53;  // x14
    unsigned int v54;  // w14
    unsigned long long v55;  // x16
    unsigned long long v56;  // x17
    unsigned long long v57;  // x0
    unsigned long long v58;  // x1
    unsigned long long v59;  // x16
    unsigned long long v60;  // x16
    unsigned long long v61;  // x15
    unsigned long long v8;  // x13
    unsigned long long v62;  // x16
    unsigned long long v63;  // x11
    unsigned long long v64;  // x16
    unsigned int v65;  // w11
    unsigned short v66;  // x16
    unsigned long long v67;  // x14
    unsigned long long v68;  // x16
    unsigned long long v69;  // x0
    unsigned long long v70;  // x17
    unsigned long long v71;  // x15
    unsigned long long v9;  // x15
    unsigned long long v72;  // x16
    unsigned long long v73;  // x17
    unsigned long long v74;  // x15
    unsigned long long v75;  // x17
    unsigned long long v76;  // x16
    unsigned long long v77;  // x0
    unsigned long long v78;  // x16
    unsigned long long v79;  // x13
    unsigned long long v80;  // x16
    unsigned long long v81;  // x15
    unsigned long long v10;  // x13
    unsigned int v82;  // w16
    unsigned short v83;  // x16
    unsigned short v84;  // x17
    unsigned int v85;  // w10
    unsigned int v86;  // w12
    unsigned int v87;  // w14
    unsigned int v88;  // w10
    unsigned int v89;  // w10
    unsigned short v90;  // x11
    unsigned short v91;  // x14
    unsigned long long v11;  // x15
    unsigned int v92;  // w8
    unsigned int v93;  // w9
    unsigned int v94;  // w12
    unsigned int v95;  // w10
    unsigned int v96;  // w10
    unsigned int v97;  // w8
    unsigned int v98;  // w9
    unsigned int v99;  // w10
    unsigned int v100;  // w12
    unsigned int v101;  // w13
    st_419bac_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_419bac_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04440 + ~(~&g_f04440 + &g_f04440));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 + 1;
    v7 = (char *)v6 + 0x2 * ~v4;
    v8 = v7 + 1;
    v9 = v8 + ~v7 * 2 | v5;
    v10 = (((v9 & v8) * 4 + (v9 ^ v8) * 2 | 1) ^ v5 + v4 + (-v5 & ~v4) * 2 + &v6[-v5 | ~v4] * 2) + (((v9 & v8) * 4 + (v9 ^ v8) * 2 | 1) & v5 + v4 + (-v5 & ~v4) * 2 + &v6[-v5 | ~v4] * 2) * 2;
    v11 = (char *)v5 + 0x2 * ~v5 + 1;
    v12 = (v5 ^ -v4) + (v5 - v4 - (v5 | -v4)) * 2;
    v13 = ((v11 + ~v11 * 2 + 1 | v4) + v11) * 2;
    v14 = v12 + v13 + 2 + (v13 + 2 | ~v12) + ((char *)&g_fffffffffffffffc - v13 + 1 & v12);
    v15 = v14 - v10 + (~v10 + v10 * 2 & ~v14) * 2 + (~v10 + v10 * 2 | ~v14) * 2;
    v16 = v15 + 2;
    v17 = v15 + 3;
    v18 = v16 * 2;
    v19 = (((v16 & 7282 ^ 7282) + (v16 ^ 0xffffffffffffe38d) ^ v17) + ((v16 & 7282 ^ 7282) + (v16 ^ 0xffffffffffffe38d) & v17) * 2 ^ v16 - (v18 | 0xffffffffffffc71b) + (v16 & 7282) + 0xffffffffffffe38e) + (((v16 & 7282 ^ 7282) + (v16 ^ 0xffffffffffffe38d) ^ v17) + ((v16 & 7282 ^ 7282) + (v16 ^ 0xffffffffffffe38d) & v17) * 2 & v16 - (v18 | 0xffffffffffffc71b) + (v16 & 7282) + 0xffffffffffffe38e) * 2;
    v0 = (v16 ^ 58253) + v18 + (0xffffffffffff1c72 & ~v16) + 58255 + (v17 + ~v16 * 2 | 58253);
    v1 = ~v19 + v19 * 2;
    v20 = v0;
    v21 = v1;
    v22 = (v21 + v20 ^ -(v20 | v21)) + (v21 + v20 & -(v20 | v21)) * 2;
    v23 = v22 + (v21 + 1 + v21 + 1 + ~v21 * 2 + (v20 | ~(v21 + 1 + ~v21 * 2)) | ~v22) + (v21 + 1 + v21 + 1 + ~v21 * 2 + (v20 | ~(v21 + 1 + ~v21 * 2)) | v22) + 1;
    v24 = ((unsigned short)v23 + (unsigned short)~v23 * 2 + 1 & (unsigned short)~(unsigned int)v3) + (unsigned short)v23;
    g_f11ff0 = (v24 ^ (unsigned short)v3 + 1) + (v24 & (unsigned short)v3 + 1) * 2;
    v25 = v1;
    v26 = v0;
    v27 = v26 | ~v25;
    v28 = v25 - v26 + (v26 + ~v25 ^ -v27) * 2 + (v26 + ~v25 & -v27) * 4;
    v29 = (v27 + v25 ^ v26 + (v25 | ~v26) + (v26 ^ v25) + 1) - (v26 + (v25 | ~v26) + (v26 ^ v25) + 1 & ~(v27 + v25)) * 2;
    v30 = v28 + (v29 | ~v28) + (v29 | v28);
    v31 = v30 + 2;
    v32 = (((char *)&g_fffffffffffffffc - v30 + 1 | 2) ^ v30 + 3) + (((char *)&g_fffffffffffffffc - v30 + 1 | 2) & v30 + 3) * 2;
    v0 = (v32 ^ (v31 & 2) - (v31 ^ (char *)&g_fffffffffffffffc + 1)) + (v32 & (v31 & 2) - (v31 ^ (char *)&g_fffffffffffffffc + 1)) * 2 - 1;
    v1 = (v31 ^ 15) + ((v31 * 2 | v31 >> 63) & 30 & 31) - 1;
    v33 = v3 >> ((char)v0 + ((char)v1 | (char)~v0) + ((char)v1 ^ (char)v0) + ((char)v1 + (char)v0 ^ (char)-(v1 | v0)) + ((char)v1 + (char)v0 & (char)-(v1 | v0)) * 2 + 1 & 63);
    v34 = v1;
    v35 = v0;
    v36 = v34 + ~v34 * 2 + 1;
    v37 = ((v36 + v35 + ~(v36 | v35)) * 2 + 3 ^ v34 - v35) + ((v36 + v35 + ~(v36 | v35)) * 2 + 3 & v34 - v35) * 2;
    v38 = v35 + 1;
    v39 = (v35 ^ -v34) + (v38 + (-v34 | ~v35)) * 2;
    v40 = v39 + ((v38 + ~v35 * 2 + v34 & -(v38 + ~v35 * 2 | v34)) * 4 + (v38 + ~v35 * 2 + v34 ^ -(v38 + ~v35 * 2 | v34)) * 2 | ~v39) + ((v38 + ~v35 * 2 + v34 & -(v38 + ~v35 * 2 | v34)) * 4 + (v38 + ~v35 * 2 + v34 ^ -(v38 + ~v35 * 2 | v34)) * 2 | v39) + 1;
    v41 = v40 - v37 + v37 * 2 + ~v40 * 2;
    v42 = (unsigned int)v41 * 2 + 2 & 52500;
    v0 = v41 + 39287;
    v1 = ~(v41 + v42 + (v42 ^ 52500) + 0xffffffffffff9977) + (v41 + v42 + (v42 ^ 52500) + 0xffffffffffff9977) * 2;
    v43 = (unsigned int)v0 + ((unsigned int)v1 ^ 0xfffffffe) - ~(unsigned int)v1 * 2 - (__ROL__((unsigned int)v1, 1) & 2 & 3);
    g_f11ff2 = (unsigned short)v33 + (unsigned short)~v33 * 2 + 1 + (unsigned short)~(v33 + ~v33 * 2 + 1) * 2 + (unsigned short)v33 * 3 + (unsigned short)~v33 * 4 + ((unsigned short)(0xfffc - ((unsigned short)v33 * 3 + (unsigned short)~v33 * 4)) | v43) + ((unsigned short)v33 * 3 + (unsigned short)~v33 * 4 + 3 ^ v43) + 6;
    v44 = v1;
    v45 = v0;
    v46 = v45 & ~v44;
    v47 = v44 + 1;
    v48 = ((v47 + ~v44 * 2 | v45) ^ v47) + ((v47 + ~v44 * 2 | v45) & v47) * 2;
    v49 = v47 - v45 + (v45 & v44) + v48 + (v46 + ~v48) * 2;
    v50 = v45 - v44;
    v51 = v50 + (v44 - v45 + v46) * 2;
    v52 = (v51 ^ 1) + ((v50 * 2 | v50 >> 63) & 2 & 3) + ~v51 * 2;
    v53 = v49 + 1 + v52 + v49 + 1 - (v49 + 1 & v52) + ((char *)&g_fffffffffffffffc - v49 + 2 | v52) + 2;
    v0 = v53 + (v53 + (25 | ~v53)) * 2 + ((0xffffffff ^ (unsigned int)v53 * 2) & 50) - 24;
    v1 = ~((v53 | 1) + (v53 & 1) + 8) + ((v53 | 1) + (v53 & 1) + 8) * 2;
    v54 = v3 >> (((char)v1 | (char)v0) + ((char)v1 + (char)~(v1 | v0) ^ (char)v0 + 1) + ((char)v1 + (char)~(v1 | v0) & (char)v0 + 1) * 2 & 63);
    v55 = v1;
    v56 = v0;
    v57 = v56 + v55;
    v58 = ((v56 | v55) - 1 ^ v57) - (v57 & -(v56 | v55)) * 2 + (v56 | v55);
    v59 = v57 + (v56 + (-v55 | ~v56) + (-v55 & ~v56)) * 2 + 2;
    v60 = v59 + (v55 & ~v56) * 2 + ((v55 & ~v56) * 2 | ~v59) + (v59 & ~((v55 & ~v56) * 2));
    v61 = v60 + v58 + 2 + (v58 + 2 + ((char *)&g_fffffffffffffffc - v58 + 2) * 2 + (~(v58 + 2 + ((char *)&g_fffffffffffffffc - v58 + 2) * 2) | ~v60)) * 2 + ((((char *)&g_fffffffffffffffc - v58 + 2 | ~v60) & v58 + 2) * 4 + (((char *)&g_fffffffffffffffc - v58 + 2 | ~v60) ^ v58 + 2) * 2 + ~((((char *)&g_fffffffffffffffc - v58 + 2 | ~v60) & v58 + 2) * 4 + (((char *)&g_fffffffffffffffc - v58 + 2 | ~v60) ^ v58 + 2) * 2) * 2 ^ (char *)&g_fffffffffffffffc + 2);
    v62 = v61 + 3;
    v63 = (char *)&g_fffffffffffffffc - v61 + 1;
    v64 = (-(unsigned int)v62 | 0xffffffffffffcf52) + v62;
    v0 = (v61 + 2 | 1) + (v61 + 2 & 1) + 53074 - (v61 + 2 & 53074) + v62 + (v63 & 0xffffffffffff30ad) + 53074 + (0xffffffffffff30ad - (v62 + (v63 & 0xffffffffffff30ad)) | (v61 + 2 & 53074) - ((v61 + 2 | 1) + (v61 + 2 & 1) + 53074)) + (v62 + (v63 & 0xffffffffffff30ad) + 53074 & (v61 + 2 | 1) + (v61 + 2 & 1) + 53074 + ~(v61 + 2 & 53074));
    v1 = (v62 + 12461 + (v63 & 0xffffffffffffcf52) & 0xffffffffffffcf52 - v64) + v64 + 12461 + (v62 + 12461 + (v63 & 0xffffffffffffcf52) & v64 + 12461);
    v65 = ((unsigned int)v1 + 1 ^ (unsigned int)v0) + ((unsigned int)v0 + ((unsigned int)v1 + 1 | ~(unsigned int)v0)) * 2;
    v66 = (unsigned short)v54 + (0xffff ^ (unsigned short)v54 * 2);
    g_f11ff4 = (unsigned short)~v65 + (unsigned short)v54 + (unsigned short)~v54 * 2 + v66 + ((unsigned short)v65 + 1 & v66) + (((unsigned short)v65 + 1 & (unsigned short)v54) + (unsigned short)~(v54 + ~v54 * 2 + 1)) * 2 + 3;
    v67 = v1;
    v68 = v0;
    v69 = v67 - v68 + (v68 - v67 + (v67 & ~v68)) * 2;
    v70 = v68 + ~v68 * 2 + 1 & v67;
    v71 = (((char *)&g_fffffffffffffffc + 3 ^ v70 * 2) + v70 * 4 + 2 ^ v68 + v67 + (-v67 & ~v68) * 2 + (v68 - v67 - (v68 | -v67)) * 2) + (((char *)&g_fffffffffffffffc + 3 ^ v70 * 2) + v70 * 4 + 2 & v68 + v67 + (-v67 & ~v68) * 2 + (v68 - v67 - (v68 | -v67)) * 2) * 2;
    v72 = 1 - v71;
    v73 = v69 + v71 + (v72 & ~v69) * 2;
    v74 = ((v72 & v69) - (v69 - v71 + 1) & v69 - v71 + 1) * 4 + ((v72 & v69) - (v69 - v71 + 1) ^ v69 - v71 + 1) * 2 + v73 + (-v73 | ~(((v72 & v69) - (v69 - v71 + 1) & v69 - v71 + 1) * 4 + ((v72 & v69) - (v69 - v71 + 1) ^ v69 - v71 + 1) * 2)) + (((v72 & v69) - (v69 - v71 + 1) & v69 - v71 + 1) * 4 + ((v72 & v69) - (v69 - v71 + 1) ^ v69 - v71 + 1) * 2 & v73 - 1);
    v75 = v74 + 1;
    v76 = v75 + ~v74 * 2;
    v77 = ~(unsigned int)v76 | 0xffffffffffffffe9;
    v78 = (v76 + v77 + 23 ^ v75) + (v76 + v77 + 23 & v75) * 2;
    v79 = v74 + (22 | ~v74) + v75 + ((0xffffffff ^ (unsigned int)v74 * 2) & 44) - 22;
    v80 = (v74 + 26 ^ -(v74 | 26)) + (v74 + 26 & -(v74 | 26)) * 2;
    v0 = v78 + (v79 | ~v78) + (v78 | v79) + 1;
    v1 = (v80 & 0xffffffffffffffe5 - (v75 + (0xffffffffffffffe5 | ~v74))) + v75 + (0xffffffffffffffe5 | ~v74) + 26 + (v80 & v75 + (0xffffffffffffffe5 | ~v74) + 26);
    v81 = v1 + ~v1 * 2;
    g_f11ff6 = v3 >> ((char)v1 + (char)~v1 * 2 + v0 + ((char)~v81 & ~v0) * 2 + (v0 + ((char)~v81 | ~v0)) * 2 + 2 & 63);
    v82 = (g_f04440 ^ 1) + ~g_f04440 * 2 + (__ROL__(g_f04440, 1) & 2 & 3);
    v83 = g_f11ff0 | (unsigned short)~v82;
    v84 = -g_f11ff0;
    g_f04440 = g_f04440 + g_f11ff0 + (g_f04440 + (v84 | ~g_f04440)) * 2 + (v83 & (unsigned short)v82 + 1) * 4 + ((v83 ^ (unsigned short)v82 + 1) + (v84 & ~g_f04440)) * 2 + 2;
    v85 = g_f04442 - g_f11ff2;
    v86 = 1 | ((unsigned int)(g_f11ff2 - g_f04442) + (g_f04442 & ~g_f11ff2)) * 2;
    g_f04442 = (unsigned short)~((v86 ^ v85) + (v86 & v85) * 2) + (((unsigned short)v86 ^ (unsigned short)v85) + ((unsigned short)v86 & (unsigned short)v85) * 2) * 2;
    v87 = -g_f11ff4;
    v88 = g_f04444 + 1;
    v89 = v88 + g_f11ff4 + (v87 & ~g_f04444) * 2 + (v88 + (v87 | ~g_f04444)) * 2;
    v90 = (g_f11ff4 + ~g_f04444 + (g_f04444 & ~g_f11ff4)) * 2;
    g_f04444 = (v90 + 2 | (unsigned short)-v89) + v90 + 2 + ((unsigned short)(0xfffd - v90) | (unsigned short)-v89) + (unsigned short)v89 * 2;
    v91 = g_f11ff6 | ~g_f04446;
    g_f04446 = (unsigned short)((g_f04446 | g_f11ff6) + (v91 ^ g_f04446 + ~g_f04446 * 2) - (v91 & g_f04446 + 1) * 2) + 1;
    g_f04448 = g_f04448 ^ v3;
    v92 = v1;
    v93 = *(unsigned int *)&v0;
    v94 = v93 & v92;
    v95 = v92 - v93 + v94 + (v93 & ~v92) * 2;
    v96 = (v95 ^ -v94) + (v95 + (-v94 | ~v95)) * 2 + 2;
    v97 = (v96 | v92) - (v96 & v92);
    v98 = (v96 & v93 + ~v93 * 2 + 1) + v93 + ((v96 | v93) - 1 ^ v96 + v93) - (v96 + v93 & -(v96 | v93)) * 2;
    v99 = v98 + 1;
    v100 = v99 + v97;
    v101 = ((v99 | v97) - 1 ^ v100) - (v100 & -(v99 | v97)) * 2 + (v99 | v97);
    v102 = v100 + (((unsigned int)(0x7ffffffe - v98) & -v97) + (unsigned int)(v99 - v97 - (v99 | -v97))) * 2;
    v103 = (v98 - v99 * 2 & v97) * 2;
    v104 = v102 + (v103 | ~v102) + (v102 | v103);
    v105 = v104 + 1;
    v106 = 0xfffffffe - v101;
    v107 = (v105 ^ v101 + 1) + ((v105 & v101 + 1) + (v106 & ~v104)) * 2;
    v108 = v101 + 2;
    v109 = (v108 + v106 * 2 & v104) - v105;
    v110 = (v109 & v108) * 4 + (v109 ^ v108) * 2 | 1;
    return (v110 ^ v107) + (v110 & v107) * 2 - 1;
}

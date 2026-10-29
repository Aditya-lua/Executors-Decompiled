/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50ae4c..0x50b6cc (2176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50ae4c_0 {
    char field_0;
} st_50ae4c_0;

extern unsigned short g_f04700;
extern unsigned short g_f04702;
extern unsigned short g_f04704;
extern unsigned short g_f04706;
extern unsigned long long g_f04708;
extern unsigned short g_f12150;
extern unsigned short g_f12152;
extern unsigned short g_f12154;
extern unsigned short g_f12156;

unsigned int sub_50ae4c(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x11
    unsigned long long v13;  // x10
    unsigned long long v14;  // x10
    unsigned long v15;  // x11
    unsigned long long v16;  // x10
    unsigned int v17;  // w10
    unsigned short v18;  // x10
    unsigned long long v19;  // x11
    unsigned long long v20;  // x12
    unsigned long long v21;  // x17
    st_50ae4c_0 *v4;  // x10
    unsigned long long v22;  // x15
    unsigned long long v23;  // x14
    unsigned long long v24;  // x13
    unsigned long long v25;  // x11
    unsigned long long v26;  // x11
    unsigned long v27;  // x12
    unsigned long long v28;  // x11
    unsigned long long v29;  // x14
    unsigned int v30;  // w11
    unsigned long v31;  // x12
    st_50ae4c_0 **v5;  // x11
    unsigned long v32;  // x13
    unsigned long long v33;  // x14
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    unsigned long long v36;  // x13
    unsigned long long v37;  // x12
    unsigned long long v38;  // x12
    unsigned long long v39;  // x15
    unsigned long long v40;  // x14
    unsigned int v41;  // w13
    st_50ae4c_0 **v6;  // x14
    unsigned int v42;  // w12
    unsigned int v43;  // w12
    unsigned int v44;  // w12
    unsigned long long v45;  // x12
    unsigned long long v46;  // x14
    unsigned long long v47;  // x15
    unsigned long long v48;  // x13
    unsigned long long v49;  // x13
    unsigned long long v50;  // x15
    unsigned long long v51;  // x12
    unsigned long long v7;  // x13
    unsigned long long v52;  // x12
    unsigned long long v53;  // x12
    unsigned long long v54;  // x14
    unsigned long long v55;  // x13
    unsigned long long v56;  // x14
    unsigned long long v57;  // x12
    unsigned int v58;  // w12
    unsigned long long v59;  // x13
    unsigned long v60;  // x14
    unsigned long long v61;  // x16
    unsigned long long v8;  // x12
    unsigned long long v62;  // x13
    unsigned long long v63;  // x13
    unsigned long long v64;  // x14
    unsigned long long v65;  // x15
    unsigned long long v66;  // x13
    unsigned long v67;  // x14
    unsigned long long v68;  // x17
    unsigned long long v69;  // x15
    unsigned long long v70;  // x16
    unsigned long long v71;  // x13
    unsigned long long v9;  // x14
    unsigned long long v72;  // x13
    unsigned long long v73;  // x13
    unsigned int v74;  // w15
    unsigned int v75;  // w16
    unsigned int v76;  // w15
    unsigned int v77;  // w14
    unsigned int v78;  // w10
    unsigned int v79;  // w10
    unsigned short v80;  // x16
    unsigned int v81;  // w12
    unsigned long long v10;  // x10
    unsigned int v82;  // w10
    unsigned short v83;  // x11
    unsigned int v84;  // w10
    unsigned short v85;  // x11
    unsigned long long v11;  // x11
    st_50ae4c_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_50ae4c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04700 + ~(~&g_f04700 + &g_f04700));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (char *)v5 + 1;
    v7 = (char *)v6 + 0x2 * ~v5;
    v8 = v4 + v5 + (v5 & v4) + ~(v5 & v4) * 2 + v7 + ((char *)v4 + 0x2 * ~v4 + 1 & ~v7) + 3;
    v9 = v5 - v4 + (v4 | ~v5) + (char *)v6 + 2 * (v4 & ~v5);
    v10 = (v7 | v4) + (char *)v5;
    v11 = ~v10;
    v12 = v9 - v11;
    v13 = v12 + (v11 & ~v9 | v9 & ~v10) * 2;
    v14 = (v13 ^ 1) + ((v12 * 2 | v12 >> 63) & 2 & 3) + ~v13 * 2 + 1;
    v15 = v14 ^ v8;
    v16 = v15 + (v14 & v8) * 2;
    v0 = v16 + (v16 & 59189) + (~(unsigned int)v16 | 0xffffffffffff18ca) + 59190;
    v1 = (v15 & 1) + 6345 + (v16 | 1);
    v17 = ((unsigned int)v1 + 1 ^ (unsigned int)v0) + ((unsigned int)v1 + 1 & (unsigned int)v0) * 2;
    v18 = ((unsigned short)v17 ^ (unsigned short)v3) + ((unsigned short)v17 & (unsigned short)v3) * 2;
    g_f12150 = (unsigned short)((~v17 + v17 * 2 | (unsigned int)v3) - v18) + (v18 + (unsigned short)~(~v17 + v17 * 2 | (unsigned int)v3)) * 2 + 1;
    v19 = v1;
    v20 = v0;
    v21 = v19 + 1;
    v22 = (v19 ^ -v20) + ((-v20 | ~v19) + v21) * 2;
    v23 = v22 + ((v20 & ~v19) * 2 | ~v22) + (v22 | (v20 & ~v19) * 2) + 1;
    v24 = v21 + v20 + (v21 + ~v19 * 2 | ~v20);
    v25 = -((v19 - v20 + (v20 | ~v19) ^ v20 + 1) + (v19 - v20 + (v20 | ~v19) & v20 + 1) * 2);
    v26 = ((v25 & v24) * 2 + (v25 ^ v24) ^ 1) + (((v25 ^ v24) * 2 | (v25 ^ v24) >> 63) & 2 & 3) + ((v25 ^ ~v24) - (v25 & v24) * 2) * 2 + 1;
    v27 = v26 ^ v23;
    v28 = v27 + (v26 & v23) * 2;
    v29 = v28 | 1;
    v0 = v28 + v29 + (~v28 | 1) + 1;
    v1 = v29 + (v27 & 1) + 14;
    v30 = v3 >> ((char)v1 + v0 & 63);
    v31 = v1;
    v32 = v0;
    v33 = v32 | v31;
    v34 = (v32 + v31 ^ -v33) + (v32 + v31 & -v33) * 2;
    v35 = (v32 ^ 1) + ~v32 * 2 + ((v32 * 2 | v32 >> 63) & 2 & 3);
    v36 = ((v35 + ~v35 * 2 + 1 | v31) + v35) * 2;
    v37 = (0xfffffffffffffffd - v36 & v32 - v31) + v36 + 2 + (v36 + 2 & v32 - v31);
    v38 = (v34 + v33 + (-v34 & ~v33) * 2 + (v33 - v34 - (v33 | -v34)) * 2 | v37 + ~v37 * 2 + 1) + (v37 + ~v37 * 2 + 1 & v34 + v33 + (-v34 & ~v33) * 2 + (v33 - v34 - (v33 | -v34)) * 2);
    v39 = (0x1ffe - v38 | 0xffffffffffffe5e3) + v38;
    v40 = (0xffffffffffffe5e2 - v39 ^ v38 + 6685) + (0xffffffffffffe5e2 - v39 & v38 + 6685) * 2;
    v0 = v39 + 6686 - ((v40 & 0xffffffffffffe5e1 - v39) + (v40 & v39 + 6686)) + v40 * 2;
    v1 = (v38 + 58851 | 1) + (~(unsigned int)v38 & 1);
    v41 = (unsigned int)((unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 3;
    v42 = (v41 ^ (unsigned int)v0) + (v41 & (unsigned int)v0) * 2;
    v43 = v42 + ~v42 * 2 + v42 * 2 + 1;
    v44 = v43 + ~v43 * 2 + 1;
    g_f12152 = (unsigned short)~(v44 + (v30 | ~v44)) + ((unsigned short)v43 & (unsigned short)v30 | (unsigned short)v30 & (unsigned short)~v43);
    v45 = v1;
    v46 = v0;
    v47 = (v45 ^ -v46) + (v45 + (-v46 | ~v45)) * 2 + 2;
    v48 = ((v46 | v45) & -v45) * 4 + ((v46 | v45) ^ -v45) * 2 | 1;
    v49 = ~((v48 ^ v47) + (v48 & v47) * 2) + ((v48 ^ v47) + (v48 & v47) * 2) * 2;
    v50 = 1 | ((v46 ^ 1) + ~v46 * 2 + ((v46 * 2 | v46 >> 63) & 2 & 3) & v45) * 2;
    v51 = 1 - ((v50 ^ v46 - v45) + (v50 & v46 - v45) * 2);
    v52 = ~((v51 ^ v49) + (v51 & v49) * 2) + ((v51 ^ v49) + (v51 & v49) * 2) * 2;
    v53 = (v52 * 2 & 4) + (v52 ^ 2);
    v54 = v53 * 2;
    v55 = v54 + ~v53;
    v56 = ((v53 - v54 | 22) ^ v53) + ((v53 - v54 | 22) & v53) * 2;
    v57 = (v55 ^ 11) + ((-v53 | 11) + v53) * 2;
    v0 = (v56 ^ (v55 | 22) + 1) + (v56 & (v55 | 22) + 1) * 2 - 1;
    v1 = ~v57 + v57 * 2;
    v58 = v3 >> ((char)v1 + v0 & 63);
    v59 = v1;
    v60 = v0;
    v61 = (-((v59 + ~v59 * 2 ^ ~(v59 + ~v59 * 2 + 1 | v60)) + ((v59 + ~v59 * 2 + 1 | v60) & ~(v59 + ~v59 * 2)) * 2) ^ (v59 | v60)) + (-((v59 + ~v59 * 2 ^ ~(v59 + ~v59 * 2 + 1 | v60)) + ((v59 + ~v59 * 2 + 1 | v60) & ~(v59 + ~v59 * 2)) * 2) & (v59 | v60)) * 2;
    v62 = v60 - v59 + ((v59 & ~v60) * 2 | ~(v60 - v59)) + ((v59 & ~v60) * 2 | v60 - v59) + 1;
    v63 = v62 + (0xffffffffffffffff ^ v62 * 2) + (v62 + (0xffffffffffffffff ^ v62 * 2) | ~v61) + (v62 | ~v61) + v61 * 2;
    v64 = v63 + 3;
    v65 = (v64 + ~v64 * 2 ^ ~(v64 + ~v64 * 2 + 1 | 36997)) + ((v64 + ~v64 * 2 + 1 | 36997) & ~(v64 + ~v64 * 2)) * 2;
    v0 = (v65 ^ (v64 | 36997) + 1) + (v65 & (v64 | 36997) + 1) * 2 - 1;
    v1 = v63 + 28541;
    g_f12154 = (unsigned short)(v58 + v1 + v0 + (v58 & ~((unsigned int)v1 + v0)) + ((unsigned int)v1 + v0 | ~v58) - ((unsigned int)v1 + v0 | v58)) + 1;
    v66 = v1;
    v67 = v0;
    v68 = v66 + 1;
    v69 = v68 + v67 + (-v67 & ~v66) * 2 + (v66 - v67 - (v66 | -v67)) * 2;
    v70 = (v68 + ~v66 * 2 & v67) * 2;
    v71 = (v66 + ~(v67 | v66) ^ v67 + ~v67 * 2) - (v66 + ~(v67 | v66) & v67 + 1) * 2 + (v67 | v66);
    v72 = v69 + (v70 | -v69) + (v69 - 1 | v70) - v71 * 4 + (v71 + 1 ^ 1) + (v71 + 1) * 2 + ((v71 + 1) * 2 & 2);
    v0 = v72 + 16;
    v1 = (v72 - 5 ^ 28) + (v72 + (9223372036854775812 - v72 | 28)) * 2 - 9;
    v73 = (v1 + 1 ^ v0) + (v0 + (v1 + 1 | ~v0)) * 2 + 2;
    g_f12156 = v3 >> ((char)~v73 + (char)v73 * 2 & 63);
    v74 = g_f04700 * 3 + ~g_f04700 * 4 + 3;
    v75 = v74 + g_f12150;
    v76 = -(v74 | g_f12150);
    v77 = (v75 & v76) * 4 + (v75 ^ v76) * 2 | 1;
    v78 = (v77 ^ (unsigned int)(g_f04700 - g_f12150)) + (v77 & (unsigned int)(g_f04700 - g_f12150)) * 2;
    g_f04700 = (unsigned short)~v78 + (unsigned short)v78 * 2;
    v79 = g_f04702;
    v80 = (unsigned short)(g_f12152 - v79) + ((unsigned short)v79 | ~g_f12152);
    g_f04702 = (unsigned short)((~g_f12152 & (unsigned short)~v79) + (v80 ^ g_f04702 + (unsigned short)~v79 * 2) + (g_f12152 | g_f04702) * 2 - (v80 & g_f04702 + 1) * 2) + 2;
    v81 = g_f04704 + ~g_f04704 * 2 + 1;
    v82 = g_f04704 - g_f12154;
    v83 = (((unsigned short)v81 + (unsigned short)~v81 * 2 + 1 | g_f12154) + (unsigned short)v81) * 2;
    g_f04704 = (unsigned short)v82 + v83 + 2 + ((unsigned short)(0xfffd - v83) & (unsigned short)v82) + (v83 + 2 | (unsigned short)~v82) + 1;
    v84 = g_f04706 - g_f12156;
    v85 = (g_f12156 + ~g_f04706 + (g_f04706 & ~g_f12156)) * 2 + 2;
    g_f04706 = (unsigned short)v84 + (v85 | (unsigned short)~v84) + (v85 | (unsigned short)v84) + 1;
    g_f04708 = (g_f04708 & v3 + ~v3 * 2 + 1) + v3 - (g_f04708 & v3);
    return v79 | ~g_f12152;
}

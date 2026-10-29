/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f39c8..0x4f43f4 (2604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4f39c8_0 {
    char field_0;
} st_4f39c8_0;

extern unsigned short g_f04620;
extern unsigned short g_f04622;
extern unsigned short g_f04624;
extern unsigned short g_f04626;
extern unsigned long long g_f04628;
extern unsigned short g_f120e0;
extern unsigned short g_f120e2;
extern unsigned short g_f120e4;
extern unsigned short g_f120e6;

unsigned int sub_4f39c8(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x14
    unsigned short v102;  // x14
    unsigned short v103;  // x11
    unsigned long long v104;  // x12
    unsigned long long v105;  // x8
    unsigned long long v13;  // x15
    unsigned long long v14;  // x11
    unsigned int v15;  // w11
    unsigned int v16;  // w14
    unsigned short v17;  // x15
    unsigned short v18;  // x15
    unsigned short v19;  // x11
    unsigned long long v20;  // x14
    unsigned long long v21;  // x15
    st_4f39c8_0 *v4;  // x11
    unsigned long long v22;  // x16
    unsigned long long v23;  // x17
    unsigned long long v24;  // x16
    unsigned long long v25;  // x0
    unsigned long long v26;  // x15
    unsigned long long v27;  // x14
    unsigned long long v28;  // x0
    unsigned long long v29;  // x1
    unsigned long long v30;  // x14
    unsigned long long v31;  // x14
    st_4f39c8_0 **v5;  // x12
    unsigned long long v32;  // x14
    unsigned long long v33;  // x14
    unsigned short v34;  // x14
    unsigned long long v35;  // x15
    unsigned long long v36;  // x17
    unsigned long long v37;  // x0
    unsigned long long v38;  // x13
    unsigned long long v39;  // x13
    unsigned long long v40;  // x15
    unsigned long v41;  // x16
    unsigned long long v6;  // x13
    unsigned long long v42;  // x13
    unsigned long long v43;  // x15
    unsigned long long v44;  // x13
    unsigned long long v45;  // x0
    unsigned long v46;  // x17
    unsigned int v47;  // w13
    unsigned short v48;  // x15
    unsigned short v49;  // x13
    unsigned short v50;  // x13
    unsigned long long v51;  // x14
    st_4f39c8_0 **v7;  // x16
    unsigned long v52;  // x15
    unsigned long long v53;  // x16
    unsigned long long v54;  // x14
    unsigned long long v55;  // x1
    unsigned long long v56;  // x14
    unsigned long long v57;  // x14
    unsigned long long v58;  // x15
    unsigned long long v59;  // x16
    unsigned long long v60;  // x14
    unsigned long long v61;  // x14
    unsigned long long v8;  // x13
    unsigned long long v62;  // x14
    unsigned long long v63;  // x16
    unsigned int v64;  // w14
    unsigned long long v65;  // x15
    unsigned long long v66;  // x16
    unsigned long long v67;  // x0
    unsigned long long v68;  // x15
    unsigned long long v69;  // x1
    unsigned long long v70;  // x15
    unsigned long long v71;  // x16
    unsigned long long v9;  // x14
    unsigned long long v72;  // x16
    unsigned int v73;  // w15
    unsigned int v74;  // w16
    unsigned int v75;  // w15
    unsigned int v76;  // w16
    unsigned long long v77;  // x15
    unsigned long long v78;  // x16
    unsigned long long v79;  // x17
    unsigned long long v80;  // x17
    unsigned long long v81;  // x0
    unsigned long long v10;  // x11
    unsigned long long v82;  // x15
    unsigned long long v83;  // x12
    unsigned long v84;  // x15
    unsigned long long v85;  // x12
    unsigned long long v86;  // x15
    unsigned long long v87;  // x12
    unsigned int v88;  // w16
    unsigned int v89;  // w17
    unsigned int v90;  // w0
    unsigned int v91;  // w11
    unsigned long long v11;  // x11
    unsigned int v92;  // w15
    unsigned short v93;  // x16
    unsigned short v94;  // x17
    unsigned int v95;  // w11
    unsigned short v96;  // x13
    unsigned int v97;  // w11
    unsigned short v98;  // x14
    unsigned short v99;  // x15
    unsigned short v100;  // x16
    unsigned short v101;  // x13
    st_4f39c8_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4f39c8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04620 + ~(~&g_f04620 + &g_f04620));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (char *)v4 + 0x2 * ~v4 + 0x2 * ~(struct st_4f39c8_0 *)((char *)v4 + 0x2 * ~v4 + 1) + 1;
    v7 = (char *)v5 + 1;
    v8 = ((v6 + 1 | v5) & ~v6) * 4 + (v6 ^ ~(v6 + 1 | v5)) * 2;
    v9 = (char *)v4 + 0x2 * ~v5 + v7 + ~v8 + v8 * 2 + 2;
    v10 = (v5 + v4 + (-v4 & ~v5) * 2 + ((char *)v7 + (-v4 | ~v5)) * 2 | ((char *)v5 + (0xffffffffffffffff ^ v5 * 2) + v4 & -((char *)v5 + (0xffffffffffffffff ^ v5 * 2) | v4)) * 4 + ((char *)v5 + (0xffffffffffffffff ^ v5 * 2) + v4 ^ -((char *)v5 + (0xffffffffffffffff ^ v5 * 2) | v4)) * 2) + (((char *)v5 + (0xffffffffffffffff ^ v5 * 2) + v4 & -((char *)v5 + (0xffffffffffffffff ^ v5 * 2) | v4)) * 4 + ((char *)v5 + (0xffffffffffffffff ^ v5 * 2) + v4 ^ -((char *)v5 + (0xffffffffffffffff ^ v5 * 2) | v4)) * 2 & v5 + v4 + (-v4 & ~v5) * 2 + ((char *)v7 + (-v4 | ~v5)) * 2);
    v11 = v9 + v10 + (-v10 & ~v9) * 2 + ~((v10 - (v10 - 1 & v9) & v9 - v10) * 4 + (v10 - (v10 - 1 & v9) ^ v9 - v10) * 2) + ((v10 - (v10 - 1 & v9) & v9 - v10) * 4 + (v10 - (v10 - 1 & v9) ^ v9 - v10) * 2) * 2;
    v12 = v11 + 2;
    v13 = ~v12 + v12 * 2;
    v14 = 0xfffffffffffffffe - v11;
    v0 = (v13 & 50787 | (v14 & 50787) + v13) + ((v14 & 50787) + v13 & v13 & 50787);
    v1 = (v13 ^ 14749 | 0xfffffffffffffffe) + ((v13 ^ 14749) + ((v14 | 14749) + v12) * 2 | 1);
    v15 = v0;
    v16 = v1;
    v17 = (unsigned short)v16 + (unsigned short)~(v16 | v15);
    v18 = (v17 ^ (unsigned short)v15 + 1) + (v17 & (unsigned short)v15 + 1) * 2;
    v19 = ((unsigned short)v16 + 1 + (unsigned short)~v16 * 2 & (unsigned short)v15) + (unsigned short)v16 + 1;
    g_f120e0 = (unsigned short)((v18 ^ v19) + (v18 & v19) * 2 - 1) & (unsigned short)v3;
    v20 = v1;
    v21 = v0;
    v22 = v21 | v20;
    v23 = (v21 + ~v22 ^ v20 + 1) + (v21 + ~v22 & v20 + 1) * 2;
    v24 = v22 + v23 + (-v23 & ~v22) * 2 + (v22 - (v23 + (v22 | -v23))) * 2;
    v25 = (v21 ^ 1) + v21 * 2 + ~v21 * 4 + (v21 * 2 & 2) + 2 & v20;
    v26 = v25 * 2;
    v27 = v21 - v20 + 1;
    v28 = v27 + v25 * 4;
    v29 = v24 + v28 + ~v26 + ((v28 + ~v26 - 1 & v24) - (v24 + v28 + ~v26)) * 2;
    v30 = (v28 - v26 + (v26 - v28) * 2 | 1) + (v27 & 1);
    v31 = (v30 + ~(v30 | v24) & v24 + 1) * 4 + (v30 + ~(v30 | v24) ^ v24 + 1) * 2 | 1;
    v32 = ~((v31 ^ v29) + (v31 & v29) * 2) + ((v31 ^ v29) + (v31 & v29) * 2) * 2;
    v0 = (v32 + 11 ^ -(v32 | 11)) + (v32 | 11) + (v32 + 11 & -(v32 | 11)) * 2;
    v1 = v32 + 5;
    v33 = (v1 + 1 + (v1 + 1 + ~v1 * 2 & v0) ^ v1 & v0) + (v1 + 1 + (v1 + 1 + ~v1 * 2 & v0) & v1 & v0) * 2;
    v34 = v3 >> ((char)~v33 + (char)v33 * 2 & 63);
    v35 = v1;
    v36 = v0;
    v37 = (v35 ^ -v36) + (v35 - (v36 + (v35 | -v36))) * 2;
    v38 = (v35 + (0xffffffffffffffff ^ v35 * 2) & v36) * 2;
    v39 = v37 + (v38 | ~v37) + (v37 | v38) + 1;
    v40 = (~v36 - (-v35 | ~v36)) * 2 - (((v36 & ~v35) + 1 ^ v35 + ~v36) * 2 + ((v36 & ~v35) + 1 & v35 + ~v36) * 4 + (v36 ^ -v35));
    v41 = v39 ^ v40;
    v42 = v41 + (v39 & v40) * 2;
    v43 = (v41 | 0xfffffffffffffffe) + (-v42 | 1) + 1;
    v44 = v43 + v42 * 2;
    v45 = v44 & 16077;
    v46 = v44 + v45 + 0xffffffffffffc133 + ((0xffffffff ^ (unsigned int)v44 * 2) & 32154);
    v0 = (v44 ^ 0xffffffffffffc132) + v44 + (v45 ^ 16077) + (0xfffffffffffffffe - ((v44 ^ 0xffffffffffffc132) + v44 + (v45 ^ 16077)) | v46) + ((v44 ^ 0xffffffffffffc132) + v44 + (v45 ^ 16077) + 1 | v46) + 2;
    v1 = (v44 | 1) + (v43 & 1) + 49457;
    v47 = (unsigned int)v1 | v0;
    v48 = ((unsigned short)v1 + v0 ^ (unsigned short)-v47) + ((unsigned short)v1 + v0 & (unsigned short)-v47) * 2;
    v49 = (v48 ^ (unsigned short)v47 + 1) + (v48 & (unsigned short)v47 + 1) * 2;
    v50 = v34 + v49 - 1 + (0xffff ^ v34 * 2) + (unsigned short)((v49 - 1 & v34) - v49);
    g_f120e2 = v50 - v34 + (v50 + ((unsigned short)(0xfffffffe - v50) | v34 + 1) + ((unsigned short)(0xfffffffe - v50) & v34 + 1)) * 2 + 4;
    v51 = v1;
    v52 = v0;
    v53 = (v52 | v51) + (v52 + v51 ^ -(v52 | v51)) + (v52 + v51 & -(v52 | v51)) * 2 + ~((v52 + v51 ^ -(v52 | v51)) + (v52 + v51 & -(v52 | v51)) * 2) * 2;
    v54 = v51 + ~v51 * 2 + 1 & v52 | v51 & ~v52;
    v55 = 0xfffffffffffffffd - v53;
    v56 = v54 + ~v54 * 2 + (v55 & 0xfffffffffffffffd - (v54 + ~v54 * 2)) + 2;
    v57 = (v53 + 2 ^ v54) + ~((v56 & v53 + 3) * 4 + (v56 ^ v53 + 3) * 2) + ((v53 + 2 & v54) + v53 + 3 + v55 * 2 + (-v54 | ~(v53 + 3 + v55 * 2))) * 2 + ((v56 & v53 + 3) * 4 + (v56 ^ v53 + 3) * 2) * 2;
    v58 = v57 + 4;
    v59 = ~v58 + v58 * 2;
    v60 = 0xfffffffffffffffc - v57;
    v61 = ((v60 | 15) ^ v58) + ((v60 | 15) & v58) * 2;
    v0 = ((v60 | 0x11) ^ v58) + ((v60 | 0x11) & v58) * 2 + (v59 | 0x11);
    v1 = (v61 | v59 | 15) + (v61 & (v59 | 15));
    v62 = v0;
    v63 = ((v1 | ~v62) ^ v62 + 1) + ((v1 | ~v62) & v62 + 1) * 2;
    v64 = v3 >> (((char)v62 | (char)v1) + (char)v63 + ((char)v62 | (char)v1 | (char)~v63) + ((char)v63 & (char)~(v62 | v1)) + 1 & 63);
    v65 = v1;
    v66 = v0;
    v67 = (-((v65 + ~v65 * 2 ^ ~(v65 + ~v65 * 2 + 1 | v66)) + ((v65 + ~v65 * 2 + 1 | v66) & ~(v65 + ~v65 * 2)) * 2) ^ (v65 | v66)) + (-((v65 + ~v65 * 2 ^ ~(v65 + ~v65 * 2 + 1 | v66)) + ((v65 + ~v65 * 2 + 1 | v66) & ~(v65 + ~v65 * 2)) * 2) & (v65 | v66)) * 2;
    v68 = (v66 ^ -v65) + (v66 + 1 + (-v65 | ~v66)) * 2 + (v66 + 1 + ~v66 * 2 & v65) * 2;
    v69 = v67 + ~v67 * 2 + 1;
    v70 = v67 + ~(v68 + 1) + (v68 + 1) * 2 + (v67 - v68 & -(v67 | -v68)) * 4 + (v69 + (v67 - v68 ^ -(v67 | -v68)) + (-(~(v68 + 1) + (v68 + 1) * 2) | ~v69)) * 2 + 2;
    v71 = (v70 + ~v70 * 2 ^ ~(v70 + ~v70 * 2 + 1 | 42591)) + ((v70 + ~v70 * 2 + 1 | 42591) & ~(v70 + ~v70 * 2)) * 2;
    v72 = (v71 ^ (v70 & 42591) - (v70 ^ 0xffffffffffff59a0)) + (v71 & (v70 & 42591) - (v70 ^ 0xffffffffffff59a0)) * 2;
    v0 = ~v72 + v72 * 2;
    v1 = v70 + 22944;
    v73 = v0;
    v74 = v1;
    v75 = (~v74 & ~v73) + (v74 | v73) * 2 + 1;
    v76 = v64 + ~v64 * 2 + 1;
    g_f120e4 = (unsigned short)v76 + (unsigned short)v64 + ((unsigned short)v74 & (unsigned short)v73 | (unsigned short)v75) + ((unsigned short)v75 & (unsigned short)v74 & (unsigned short)v73) + 1 + (((unsigned short)v74 & (unsigned short)v73 | (unsigned short)v75) + ((unsigned short)v75 & (unsigned short)v74 & (unsigned short)v73) + 1 + (unsigned short)~((v74 & v73 | v75) + (v75 & v74 & v73)) * 2 | (unsigned short)~v76) + 1;
    v77 = v1;
    v78 = v0;
    v79 = v77 - v78 + (v78 & ~v77) * 2;
    v80 = (v79 + (v78 & v77) ^ -(v78 & v77)) + (v79 - (v79 + (v78 & v77) | -(v78 & v77))) * 2;
    v81 = ~v78;
    v82 = -((v78 + v81 * 2 ^ ~(v78 + v81 * 2 + 1 | v77)) + ((v78 + v81 * 2 + 1 | v77) & ~(v78 + v81 * 2)) * 2);
    v83 = v82 - ((v81 & ~v77) + (v77 | v78) * 2 + 2 + ((v82 | 0xfffffffffffffffe - ((v81 & ~v77) + (v77 | v78) * 2)) + (v81 & ~v77) + (v77 | v78) * 2 + 2 + (v82 & 0xfffffffffffffffe - ((v81 & ~v77) + (v77 | v78) * 2))) * 2) + 1;
    v84 = v83 ^ v80;
    v85 = v84 + (v83 & v80) * 2;
    v86 = (v84 | 0xfffffffffffffffe) + (-v85 | 1) + 1;
    v87 = v86 + v85 * 2;
    v0 = ((v87 | 0xffffffffffffffe2) + 30 ^ (v87 | 29) + 1) + ((v87 | 0xffffffffffffffe2) + 30 & (v87 | 29) + 1) * 2 - 1;
    v1 = (v86 | 0xfffffffffffffffe) + (v87 & 0xfffffffffffffffe) + 21;
    g_f120e6 = v3 >> (((char)~v1 & ~v0 | (char)v1 & v0) + ((char)v1 | v0) * 2 + 1 & 63);
    v88 = -g_f120e0;
    v89 = g_f120e0 | g_f04620;
    v90 = -g_f04620;
    v91 = (v88 ^ g_f04620) + (unsigned int)(g_f04620 - g_f120e0 - (v88 | g_f04620)) * 2 + ~((v89 & v90) * 4 + (v89 ^ v90) * 2) + ((v89 & v90) * 4 + (v89 ^ v90) * 2) * 2 + 2;
    g_f04620 = (unsigned short)~v91 + (unsigned short)v91 * 2;
    v92 = -g_f120e2;
    v93 = g_f04622 + ~g_f04622 * 2;
    v94 = g_f120e2 - (v93 + 1) + (v93 + 1 | ~g_f120e2);
    v95 = (v92 ^ g_f04622) + (unsigned int)(g_f04622 - g_f120e2 - (v92 | g_f04622)) * 2;
    v96 = (v94 & v93 + 2) * 4 + (v94 ^ v93 + 2) * 2;
    g_f04622 = (unsigned short)v95 + (v96 | (unsigned short)~v95) + (v96 | (unsigned short)v95) + 1;
    v97 = g_f04624;
    v98 = (unsigned short)v97 + 1;
    v99 = (unsigned short)~v97 * 2;
    v100 = v98 + v99 | g_f120e4;
    g_f04624 = v98 + g_f120e4 + (v100 ^ v99 + v97) - ((g_f120e4 & v97) + (v100 & v98) * 2);
    v101 = g_f120e6 | g_f04626;
    v102 = -g_f04626;
    v103 = g_f04626 - g_f120e6;
    g_f04626 = (v103 | (v101 & v102) * 4 + (v101 ^ v102) * 2) + ((v101 & v102) * 4 + (v101 ^ v102) * 2 & v103);
    v104 = g_f04628 + ~g_f04628 * 2 + 1;
    v105 = (g_f04628 ^ -v3) + (g_f04628 - (v3 + (g_f04628 | -v3))) * 2;
    g_f04628 = v105 + (v104 + v3 & -(v104 | v3)) * 4 + (v104 + v3 ^ -(v104 | v3)) * 2 + (v105 & ~((v104 + v3 & -(v104 | v3)) * 4 + (v104 + v3 ^ -(v104 | v3)) * 2)) + ((v104 + v3 & -(v104 | v3)) * 4 + (v104 + v3 ^ -(v104 | v3)) * 2 | ~v105) + 1;
    return g_f120e4 & v97;
}

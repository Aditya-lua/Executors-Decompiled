/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4da6b0..0x4db03c (2444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4da6b0_0 {
    char field_0;
} st_4da6b0_0;

extern unsigned short g_f04680;
extern unsigned short g_f04682;
extern unsigned short g_f04684;
extern unsigned short g_f04686;
extern unsigned long long g_f04688;
extern unsigned short g_f12110;
extern unsigned short g_f12112;
extern unsigned short g_f12114;
extern unsigned short g_f12116;

unsigned int sub_4da6b0(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v13;  // x13
    unsigned long v14;  // x14
    unsigned int v15;  // w13
    unsigned short v16;  // x10
    unsigned long long v17;  // x13
    unsigned long v18;  // x15
    unsigned long long v19;  // x1
    unsigned long long v20;  // x16
    unsigned long long v21;  // x17
    unsigned long long v22;  // x16
    st_4da6b0_0 *v5;  // x10
    unsigned long long v23;  // x17
    unsigned long long v24;  // x13
    unsigned long long v25;  // x14
    unsigned long long v26;  // x13
    unsigned long long v27;  // x13
    unsigned long long v28;  // x13
    unsigned int v29;  // w12
    unsigned long long v30;  // x13
    unsigned long long v31;  // x14
    unsigned long long v32;  // x16
    st_4da6b0_0 **v6;  // x12
    unsigned long long v33;  // x13
    unsigned long long v34;  // x13
    unsigned long long v35;  // x13
    unsigned long long v36;  // x14
    unsigned int v37;  // w13
    unsigned long v38;  // x13
    unsigned long long v39;  // x14
    unsigned long long v40;  // x16
    unsigned long long v41;  // x15
    unsigned long long v42;  // x0
    unsigned long long v7;  // x14
    unsigned long long v43;  // x17
    unsigned long long v44;  // x16
    unsigned long long v45;  // x13
    unsigned long long v46;  // x13
    unsigned long long v47;  // x13
    unsigned long long v48;  // x14
    unsigned int v49;  // w13
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v52;  // x17
    unsigned long long v8;  // x13
    unsigned long long v53;  // x0
    unsigned long long v54;  // x11
    unsigned long long v55;  // x16
    unsigned long long v56;  // x0
    unsigned long long v57;  // x14
    unsigned long long v58;  // x15
    unsigned long long v59;  // x14
    unsigned long long v60;  // x11
    unsigned long long v61;  // x14
    unsigned long long v62;  // x15
    unsigned long long v9;  // x10
    unsigned int v63;  // w11
    unsigned int v64;  // w14
    unsigned int v65;  // w11
    unsigned int v66;  // w11
    unsigned short v67;  // x11
    unsigned long v68;  // x13
    unsigned long v69;  // x15
    unsigned long long v70;  // x16
    unsigned long long v71;  // x13
    unsigned long long v72;  // x14
    unsigned long long v10;  // x14
    unsigned long long v73;  // x13
    unsigned long long v74;  // x13
    unsigned long long v75;  // x13
    unsigned int v76;  // w15
    unsigned int v77;  // w16
    unsigned short v78;  // x10
    unsigned short v79;  // x14
    unsigned int v80;  // w15
    unsigned int v81;  // w10
    unsigned short v82;  // x10
    unsigned long long v11;  // x10
    unsigned short v83;  // x12
    unsigned int v84;  // w14
    unsigned short v85;  // x14
    unsigned int v86;  // w12
    unsigned int v87;  // w13
    unsigned int v88;  // w10
    unsigned int v89;  // w11
    unsigned long long v90;  // x11
    unsigned long long v12;  // x10
    st_4da6b0_0 **v1;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4da6b0_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v2 = &v1;
    v1 = &v2;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f04680 + ~(~&g_f04680 + &g_f04680));
    v4 = ((v3 | v3 >> 29) ^ ~v3 - (v3 >> 29 | ~v3)) + ((v3 | v3 >> 29) & ~v3 - (v3 >> 29 | ~v3)) * 2;
    v5 = v2;
    v6 = v1;
    v7 = v6 + v5;
    v8 = v7 + ((char *)v5 + 0x2 * ~v5 + 1 + v6 & -((char *)v5 + 0x2 * ~v5 + 1 | v6)) * 4 + &v5[1 + (-v6 | ~v5) + (-v6 & ~v5) + ((char *)v5 + 0x2 * ~v5 + 1 + v6 ^ -((char *)v5 + 0x2 * ~v5 + 1 | v6))] * 2;
    v9 = v6 - v5 + (v7 + (0xffffffffffffffff ^ v6 * 2) + ~(v7 + (0xffffffffffffffff ^ v6 * 2) + (v6 | ~v5))) * 4 - (v7 + (0xffffffffffffffff ^ v6 * 2) + ~(v7 + (0xffffffffffffffff ^ v6 * 2) + (v6 | ~v5))) * 2;
    v10 = (v9 ^ v8) + ((v9 & v8) - (v9 + v8) + (v9 - 1 & v8)) * 2;
    v11 = ((v8 & -v9) - (v8 - v9) & v8 - v9) * 4 + ((v8 & -v9) - (v8 - v9) ^ v8 - v9) * 2 | 1;
    v12 = ~((v11 ^ v10) + (v11 & v10) * 2) + ((v11 ^ v10) + (v11 & v10) * 2) * 2;
    v13 = (v12 + 51348 ^ -(v12 | 51348)) + (v12 + 51348 & -(v12 | 51348)) * 2;
    v14 = v12 + (v12 & 51348) + 0xffffffffffff376c + ((0xffffffff ^ (unsigned int)v12 * 2) & 102696);
    v1 = v13 + v14 + (v13 & ~v14) + (v14 | ~v13) + 1;
    v2 = v12 + 14187;
    v15 = (unsigned int)v2 + ~(unsigned int)v2 * 2;
    v16 = ((unsigned short)v15 + 1 + v1 + ((unsigned short)((v1 & 0xffffffff) - (v15 + 1 + (v1 | ~v15))) + ((unsigned short)~v15 & (unsigned short)~v1)) * 2 & 0xfffe) + ((unsigned short)v15 + 1 + v1 | 0xfffe);
    g_f12110 = (unsigned short)v4 + v16 + ((unsigned short)(0xfffe - v16) & (unsigned short)v4 + (0xffff ^ (unsigned short)v4 * 2)) + 2;
    v17 = v2;
    v18 = v1;
    v19 = v18 + v17;
    v20 = v19 + (-v18 & ~v17) * 2 + (v17 - (v18 + (v17 | -v18))) * 2;
    v21 = (v17 * 3 + ~v17 * 4 + 3 & v18) * 2;
    v22 = v20 + v21 + (v20 & v21) + (~v21 | ~v20) + 1;
    v23 = (v18 ^ 1) + ~v18 * 2 + ((v18 * 2 | v18 >> 63) & 2 & 3);
    v24 = v19 + (v18 - (v17 + (v18 | -v17)) + (-v17 & ~v18)) * 2;
    v25 = (v23 + v17 & -(v23 | v17)) * 4 + (v23 + v17 ^ -(v23 | v17)) * 2 | 1;
    v26 = ~((v25 ^ v24) + (v25 & v24) * 2) + ((v25 ^ v24) + (v25 & v24) * 2) * 2;
    v27 = v26 + (0xffffffffffffffff ^ v26 * 2) + (v26 & v22) + (v26 + (0xffffffffffffffff ^ v26 * 2) & v22);
    v28 = v27 + (v27 | 1) + (~v27 | 1);
    v1 = (((0xffffffff ^ ((unsigned int)v28 + 1) * 2) & 10) + v28 - 4 + (v28 + 1 + (5 | ~(v28 + 1))) * 2 + 2 | 1) + (v28 - 4 | 0xfffffffffffffffe);
    v2 = v28 + 13;
    v29 = v4 >> ((char)v2 + (char)v1 & 63);
    v30 = v2;
    v31 = v1;
    v32 = v31 - v30 + (v31 & v30) + (v30 & ~v31) * 2;
    v33 = (v31 + v30 ^ -(v31 | v30)) + (v31 + v30 & -(v31 | v30)) * 2;
    v34 = v33 + v32 + (-v33 & ~v32) * 2 + (v32 - (v33 + (v32 | -v33))) * 2;
    v35 = v34 + (0xffffffffffffffff ^ v34 * 2) + (v34 & (v31 ^ v30)) + (v34 + (0xffffffffffffffff ^ v34 * 2) & (v31 ^ v30));
    v36 = v35 + 1;
    v1 = (v36 | 9741) + (v35 + (0xffffffffffffd9f2 & ~v36)) * 2 + (0xffffffffffffd9f0 - (v35 + (0xffffffffffffd9f2 & ~v36)) | v36 | 9741) - (v35 + (0xffffffffffffd9f2 & ~v36) + 9743 & (v36 | 9741)) + 19487;
    v2 = (v36 ^ 55795) + (111590 & v36 * 2) - 1;
    v37 = (unsigned int)v1 + ~(unsigned int)v2 + ((unsigned int)v2 + 1 & ~(unsigned int)v1) * 2 + ((unsigned int)v2 + 1 & (unsigned int)v1) * 2;
    g_f12112 = ((unsigned short)v29 & (unsigned short)-v37) + ((unsigned short)~v37 + (unsigned short)v37 * 2 & (unsigned short)v29) + ((unsigned short)~v37 + (unsigned short)v37 * 2 | (unsigned short)~v29) + 1;
    v38 = v2;
    v39 = v1;
    v40 = v39 + 1;
    v41 = v40 + ~v39 * 2;
    v42 = v39 | v38;
    v43 = (v39 + v38 ^ -v42) + (v39 + v38 & -v42) * 2;
    v44 = v43 + v40 + v38 + (v41 | ~v38) + (-v43 & ~(v40 + v38 + (v41 | ~v38))) * 2 + (v40 + v38 + (v41 | ~v38) - (v43 + (v40 + v38 + (v41 | ~v38) | -v43))) * 2;
    v45 = ((v41 | v38) + v39 ^ ~v42) + (v42 & ~((v41 | v38) + v39)) * 2;
    v46 = (v44 ^ v45) + (v44 & v45) * 2 + ((v44 & v45 - 1) - (v44 + v45)) * 2;
    v47 = v46 + (v44 & -v45) * 2 + (v46 & (v44 & -v45) * 2) + (~v46 | ~((v44 & -v45) * 2));
    v48 = ((v47 + 1 | 0xffffffffffffffe9) + 23 ^ v47 + 1 + (v47 + 1 & 22) - (0xffffffffffffffd3 | (v47 + 1) * 2) - 22) + ((v47 + 1 | 0xffffffffffffffe9) + 23 & v47 + 1 + (v47 + 1 & 22) - (0xffffffffffffffd3 | (v47 + 1) * 2) - 22) * 2;
    v1 = ~v48 + v48 * 2;
    v2 = v47 + 11;
    v49 = v4 >> ((char)v2 + (char)v1 & 63);
    v50 = v2;
    v51 = v1;
    v52 = -v51;
    v53 = v51 + v50 + (v52 & ~v50) * 2;
    v54 = (v53 + (v50 + (v52 | ~v50)) * 2 + 2 ^ (0xffffffffffffffff ^ (v51 & ~v50) * 2) + (v51 & ~v50) * 4 + 2) + (v53 + (v50 + (v52 | ~v50)) * 2 + 2 & (0xffffffffffffffff ^ (v51 & ~v50) * 2) + (v51 & ~v50) * 4 + 2) * 2;
    v55 = ~v54 + v54 * 2;
    v56 = v51 - v50 + (v51 & v50) + (v50 & ~v51) * 2;
    v57 = (v51 + ~v51 * 2 + 1 | v50) + v51;
    v58 = v57 - v56;
    v59 = v56 - v57 + v58 * 2 - v55 + (v55 | 0xfffffffffffffffe - (v56 - v57 + v58 * 2)) + 1;
    v60 = (v55 ^ v58 + 1 | (v59 & v54) * 4 + (v59 ^ v54) * 2) + ((v59 & v54) * 4 + (v59 ^ v54) * 2 & (v55 ^ v58 + 1));
    v61 = v60 | 46757;
    v62 = (v60 + 46757 ^ -v61) + (v60 + 46757 & -v61) * 2;
    v1 = (v62 ^ v61 + 1) + (v62 & v61 + 1) * 2 - 1;
    v2 = (v60 ^ 18779) + (v60 + (18779 | ~v60)) * 2 + 1;
    v63 = v1;
    v64 = v2;
    v65 = v63 + 1 + v64 + (v63 + 1 + ~v63 * 2 | ~v64);
    v66 = (v64 & v63) + v65 + (v64 & v63 & ~v65) + (v65 | ~(v64 & v63));
    v67 = (v66 + 2 ^ v49) + (v66 + 2 & v49) * 2 - 1;
    g_f12114 = (v67 ^ (unsigned short)-(v66 + 1 | v49)) + (unsigned short)(v67 - (v66 + 1 | v49) - (v67 | -(v66 + 1 | v49))) * 2;
    v68 = v2;
    v69 = v1;
    v70 = v68 - v69 + (v69 & ~v68) * 2;
    v71 = v69 + v68 + (-v68 & ~v69) * 2 + (v69 - (v68 + (v69 | -v68))) * 2;
    v72 = 1 | (v68 & ~v69) * 2;
    v73 = ~((v71 ^ v72) + (v71 & v72) * 2) + ((v71 ^ v72) + (v71 & v72) * 2) * 2;
    v74 = v70 - v73 + (v73 - 1 & v70 + ~v70 * 2 + 1);
    v75 = ((v73 - v70 + (v70 | -v73) ^ (v70 | -v73)) + (v73 - v70 + (v70 | -v73) & (v70 | -v73)) * 2 ^ v74 * 2 + 3) + ((v73 - v70 + (v70 | -v73) ^ (v70 | -v73)) + (v73 - v70 + (v70 | -v73) & (v70 | -v73)) * 2 & v74 * 2 + 3) * 2;
    v1 = v75 + ((-v75 | 13) + v75) * 2 + (~((unsigned int)v75 * 2 + 30) & 26) - 15;
    v2 = v75 + 35;
    g_f12116 = v4 >> ((char)v2 + (char)v1 & 63);
    v76 = g_f04680 + 1;
    v77 = ~g_f04680 * 2;
    v78 = (unsigned short)~(g_f12110 | g_f04680) + g_f12110;
    g_f04680 = (unsigned short)(g_f04680 + v76 + v77 + (g_f12110 | ~(v76 + v77)) + (v78 ^ v77 + g_f04680) - (v78 & v76) * 2) + 2;
    v79 = g_f04682 + (g_f12112 | ~g_f04682) + (g_f12112 ^ g_f04682);
    v80 = g_f12112 + g_f04682;
    v81 = -(g_f12112 | g_f04682);
    v82 = -((v80 ^ v81) + (v80 & v81) * 2);
    g_f04682 = (v79 + 1 ^ v82) + (v79 + (v82 | (unsigned short)(0xfffffffe - v79))) * 2 + 4;
    v83 = -g_f12114;
    v84 = (g_f04684 ^ 1) + ~g_f04684 * 2 + (__ROL__(g_f04684, 1) & 2 & 3);
    v85 = g_f12114 | (unsigned short)~v84;
    g_f04684 = (v83 ^ g_f04684) + (v85 & (unsigned short)v84 + 1) * 4 + ((unsigned short)(g_f04684 - g_f12114 - (v83 | g_f04684)) + (v85 ^ (unsigned short)v84 + 1)) * 2;
    v86 = g_f12116 + ~g_f04686;
    v87 = -(g_f12116 | ~g_f04686);
    v88 = g_f04686 - g_f12116;
    v89 = (v86 & v87) * 4 + (v86 ^ v87) * 2 | 1;
    g_f04686 = (unsigned short)~((v89 ^ v88) + (v89 & v88) * 2) + (((unsigned short)v89 ^ (unsigned short)v88) + ((unsigned short)v89 & (unsigned short)v88) * 2) * 2;
    v90 = g_f04688 * 3 + ~g_f04688 * 4 + 3;
    g_f04688 = v4 + g_f04688 + (v90 + v4 & -(v90 | v4)) * 4 + ((v90 + v4 ^ -(v90 | v4)) + ~v4) * 2 + 2;
    return g_f12110 | ~(v76 + v77);
}

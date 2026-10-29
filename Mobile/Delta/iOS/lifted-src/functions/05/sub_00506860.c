/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x506860..0x5072c0 (2656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_506860_0 {
    char field_0;
} st_506860_0;

extern unsigned short g_f04710;
extern unsigned short g_f04712;
extern unsigned short g_f04714;
extern unsigned short g_f04716;
extern unsigned long long g_f04718;
extern unsigned short g_f12158;
extern unsigned short g_f1215a;
extern unsigned short g_f1215c;
extern unsigned short g_f1215e;

unsigned int sub_506860(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x12
    unsigned long v102;  // x12
    unsigned long long v103;  // x12
    unsigned long long v104;  // x8
    unsigned long long v105;  // x10
    unsigned long long v13;  // x11
    unsigned int v14;  // w11
    unsigned int v15;  // w12
    unsigned int v16;  // w14
    unsigned int v17;  // w11
    unsigned int v18;  // w11
    unsigned int v19;  // w14
    unsigned int v20;  // w11
    unsigned short v21;  // x12
    st_506860_0 *v4;  // x10
    unsigned long long v22;  // x12
    unsigned long long v23;  // x14
    unsigned long long v24;  // x1
    unsigned long long v25;  // x16
    unsigned long long v26;  // x17
    unsigned long long v27;  // x17
    unsigned long long v28;  // x12
    unsigned long long v29;  // x12
    unsigned long long v30;  // x14
    unsigned long long v31;  // x15
    st_506860_0 **v5;  // x11
    unsigned long v32;  // x16
    unsigned long long v33;  // x14
    unsigned long long v34;  // x1
    unsigned long long v35;  // x14
    unsigned short v36;  // x14
    unsigned long long v37;  // x15
    unsigned long v38;  // x16
    unsigned long long v39;  // x1
    unsigned long v40;  // x17
    unsigned long long v41;  // x0
    unsigned long v6;  // x12
    unsigned long long v42;  // x17
    unsigned long long v43;  // x1
    unsigned long long v44;  // x15
    unsigned long v45;  // x1
    unsigned long long v46;  // x13
    unsigned int v47;  // w13
    unsigned int v48;  // w15
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v7;  // x13
    unsigned long long v52;  // x17
    unsigned long long v53;  // x16
    unsigned long long v54;  // x14
    unsigned long long v55;  // x14
    unsigned long long v56;  // x14
    unsigned int v57;  // w14
    unsigned long long v58;  // x15
    unsigned long long v59;  // x16
    unsigned long long v60;  // x17
    unsigned long long v61;  // x17
    unsigned long long v8;  // x12
    unsigned long long v62;  // x0
    unsigned long long v63;  // x17
    unsigned long long v64;  // x0
    unsigned long long v65;  // x0
    unsigned long long v66;  // x1
    unsigned long long v67;  // x15
    unsigned long long v68;  // x15
    unsigned long long v69;  // x15
    unsigned long long v70;  // x16
    unsigned long long v71;  // x15
    unsigned long long v9;  // x11
    unsigned int v72;  // w16
    unsigned int v73;  // w16
    unsigned int v74;  // w15
    unsigned short v75;  // x14
    unsigned long v76;  // x15
    unsigned long long v77;  // x16
    unsigned long long v78;  // x17
    unsigned long long v79;  // x17
    unsigned long long v80;  // x15
    unsigned long long v81;  // x16
    unsigned long long v10;  // x14
    unsigned long long v82;  // x1
    unsigned long long v83;  // x15
    unsigned long long v84;  // x15
    unsigned long long v85;  // x16
    unsigned long long v86;  // x15
    unsigned long long v87;  // x17
    unsigned long long v88;  // x12
    unsigned long long v89;  // x15
    unsigned int v90;  // w12
    unsigned int v91;  // w11
    unsigned long long v11;  // x11
    unsigned int v92;  // w10
    unsigned short v93;  // x13
    unsigned short v94;  // x11
    unsigned int v95;  // w14
    unsigned int v96;  // w12
    unsigned short v97;  // x13
    unsigned short v98;  // x12
    unsigned short v99;  // x11
    unsigned short v100;  // x10
    unsigned long v101;  // x13
    st_506860_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_506860_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04710 + ~(~&g_f04710 + &g_f04710));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = &v4[(v5 | ~v4) + (v5 ^ v4)];
    v7 = &v4[(char *)v4 + 0x2 * ~v4 + 1 | v5];
    v8 = (v7 ^ 0xfffffffffffffffe - v6) + (v6 + (0xfffffffffffffffe - v6 | ~v7)) * 2 + 4;
    v9 = ((v5 | v4) & ~(st_506860_0 **)((v4 | ~v5) + (char *)v5)) * 2 - ((v4 | ~v5) + (char *)v5 ^ (v5 | v4));
    v10 = (v8 ^ v9 - 1) + ((v8 & v9 + 0x7ffffffffffffffe) - (v8 + v9) + (v8 & v9 - 1)) * 2;
    v11 = ((v8 & 1 - v9) * 2 | 0xfffffffffffffffd - v10) + (v8 & 1 - v9) * 2 + v10 * 2 - (v10 + 2 & (v8 & 1 - v9) * 2);
    v12 = 0xffffffffffff5129 - (v11 + 6) - (-((unsigned int)v11 + 6) | 0xffffffffffff5128);
    v13 = ((v12 ^ v11 + 44764) + (v12 & v11 + 44764) * 2 ^ (v11 + 5 | 44759) + 1) + ((v12 ^ v11 + 44764) + (v12 & v11 + 44764) * 2 & (v11 + 5 | 44759) + 1) * 2;
    v0 = v11 + 20781;
    v1 = ~v13 + v13 * 2;
    v14 = v0;
    v15 = v1;
    v16 = (v15 - v14 + (v14 | ~v15) ^ v14 + 1) + (v15 - v14 + (v14 | ~v15) & v14 + 1) * 2;
    v17 = v14 + (v15 | ~v14) + (v15 ^ v14);
    v18 = v17 + v16 + (v17 + 1 | ~v16) + (v16 & (unsigned int)(0xfffffffe - v17)) + 2;
    v19 = ~v3;
    v20 = (v18 + ~v18 * 2 + 1 & v19) + v18;
    v21 = ((unsigned short)v3 ^ 1) + (unsigned short)v3 * 2 + (unsigned short)v19 * 4 + ((unsigned short)v3 * 2 & 2);
    g_f12158 = v21 + (unsigned short)v20 + ((unsigned short)v20 + ((unsigned short)(0xfffffffe - v21) | (unsigned short)~v20) + ((unsigned short)(0xfffffffe - v21) & (unsigned short)~v20)) * 2 + 4;
    v22 = v1;
    v23 = v0;
    v24 = v22 + 1;
    v25 = ((v22 ^ -v23) + ((-v23 | ~v22) + v24) * 2 | (v23 & ~v22) * 2) + ((v22 ^ -v23) + ((-v23 | ~v22) + v24) * 2 & (v23 & ~v22) * 2);
    v26 = v23 + ~v23 * 2;
    v27 = v26 + 2;
    v28 = v27 + ~(v26 + 1) * 2 | v22;
    v29 = v23 + v24 + (v28 & v27) * 4 + ((v28 ^ v27) + ~v22) * 2;
    v30 = ((v29 & v25) + ~v29 ^ (v29 & v25) - v25) + (v25 + ~v29 + (v29 & v25 + ~v25 * 2 + 1) + ((v29 & v25) + ~v29 & (v29 & v25) - v25)) * 2;
    v31 = v30 + 2;
    v32 = 0xffffffff ^ (unsigned int)v31 * 2;
    v33 = v30 + 3;
    v34 = v31 & 14;
    v35 = ((v34 ^ 14) + (v31 ^ 0xfffffffffffffff1) ^ v33) + ((v34 ^ 14) + (v31 ^ 0xfffffffffffffff1) & v33) * 2;
    v0 = v31 + (v33 + (~v31 | 3)) * 2 + (v32 & 6) - 4;
    v1 = v31 + v34 + (v32 & 28) - 14 + v35 + (v35 & ~(v31 + v34 + (v32 & 28) - 14)) + (v31 + v34 + (v32 & 28) - 14 | ~v35) + 1;
    v36 = v3 >> ((char)v1 + v0 & 63);
    v37 = v1;
    v38 = v0;
    v39 = v37 + 1;
    v40 = v39 + v38 + ~(v38 | v37) + (v38 ^ v37);
    v41 = ((v39 + ~v37 * 2 | v38) ^ -(v39 + ~v37 * 2)) + ((v39 + ~v37 * 2 | v38) & -(v39 + ~v37 * 2)) * 2;
    v42 = v40 + v41 + (-v41 & ~v40) * 2 + (v40 - v41 - (v40 | -v41)) * 2;
    v43 = v38 - v37 + (v37 & ~v38) * 2;
    v44 = (v43 + (v38 & v37) ^ -(v38 & v37)) + (v43 - (v43 + (v38 & v37) | -(v38 & v37))) * 2;
    v45 = v42 ^ v44;
    v46 = v45 + (~(v44 + ~v44 * 2 + 1) - (0xfffffffffffffffd - (v44 + ~v44 * 2) & v42) & v44 + ~v44 * 2 + 1 + v42 + 1) * 4 + ((v42 & v44 - 1) - (v44 + v42 + 1) + (v42 & v44) + (~(v44 + ~v44 * 2 + 1) - (0xfffffffffffffffd - (v44 + ~v44 * 2) & v42) ^ v44 + ~v44 * 2 + 1 + v42 + 1)) * 2;
    v0 = (v45 | 0xfffffffffffffffe) + ((v46 + 2 ^ 23148) + (v46 + 2 + (23148 | ~(v46 + 2))) * 2 + 2 | 1);
    v1 = v46 + 42390;
    v47 = v0;
    v48 = (unsigned int)(((unsigned int)v1 ^ 0xfffffffe) + (unsigned int)v1 * 4 - ((unsigned int)v1 * 2 + ((unsigned int)v1 * 2 & 2))) + 3;
    g_f1215a = (unsigned short)(v36 * 2 + (v36 ^ 0xfffe) - ((v36 * 2 & 2) + (~((v47 + (v48 | ~v47)) * 2 + 2) - (v48 ^ v47) + 1 & v36))) + 2;
    v50 = v1;
    v51 = v0;
    v52 = v50 - v51 + ((v51 & ~v50) * 2 | ~(v50 - v51)) + ((v51 & ~v50) * 2 | v50 - v51) + 1;
    v53 = v50 + 1 + v51 + (v51 + ~v51 * 2 + 1 | v50 + 1 + ~v50 * 2);
    v54 = v53 + (v51 & v50) + (-(v51 & v50) & ~v53) * 2 + (v53 + (-(v51 & v50) | ~v53)) * 2 + 2;
    v55 = v52 - v54 + (v54 | ~v52) + (v52 & ~v54);
    v56 = ~((v55 * 2 & 4) + (v55 ^ 2)) + ((v55 * 2 & 4) + (v55 ^ 2)) * 2;
    v0 = v56 + 15;
    v1 = ((v56 & 0x11) - (v56 + 18) | ~(v56 & 0x11)) + v56 + 18 + (v56 & 0x11 & v56 + 18 + ~(v56 & 0x11));
    v57 = v3 >> ((char)v1 + (char)v0 & 63);
    v58 = v1;
    v59 = v0;
    v60 = (v58 ^ 1) + ~v58 * 2 + ((v58 * 2 | v58 >> 63) & 2 & 3);
    v61 = v60 + 1;
    v62 = v61 + ~v60 * 2 | v59;
    v63 = v58 - v59 + (v62 ^ v61) * 2 + (v62 & v61) * 4;
    v64 = (v59 ^ 1) + ~v59 * 2 + ((v59 * 2 | v59 >> 63) & 2 & 3);
    v65 = v64 + 1;
    v66 = v65 + ~v64 * 2 | v58;
    v67 = ~(v59 - v58) - ((v59 - v58 | (v66 & v65) * 4 + (v66 ^ v65) * 2) + ((v66 & v65) * 4 + (v66 ^ v65) * 2 | ~(v59 - v58)));
    v68 = ((v67 | v63 + ~v63 * 2 + 1) & ~(v63 + ~v63 * 2)) * 4 + (v63 + ~v63 * 2 ^ ~(v67 | v63 + ~v63 * 2 + 1)) * 2;
    v69 = (v67 | v63) - (v63 + (v67 | ~v63)) + ~v68 + v68 * 2;
    v70 = v69 + 2;
    v71 = v70 + (v69 & 750) + ((0xffffffff ^ (unsigned int)v69 * 2) & 1500) - 752;
    v0 = v69 + 64785;
    v1 = v71 + (v70 + (0xfffffffffffffd11 & ~v69)) * 2 + (v71 | 0xfffffffffffffd12 - (v70 + (0xfffffffffffffd11 & ~v69))) + (0xfffffffffffffd12 - (v70 + (0xfffffffffffffd11 & ~v69)) | ~v71) + 1500;
    v72 = (unsigned int)((unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 3;
    v73 = v57 + ~v57 * 2 + 1;
    v74 = ((v72 ^ (unsigned int)v0) + ((unsigned int)v0 + (v72 | ~(unsigned int)v0)) * 2 + 1 & v73 + ~v73 * 2 + 1) + v73;
    v75 = (unsigned short)((v57 ^ 0xfffffffe) + v57 * 4 - (v57 * 2 + (v57 * 2 & 2))) + 3;
    g_f1215c = ((unsigned short)v74 ^ v75) + ((unsigned short)v74 + (v75 | (unsigned short)~v74)) * 2 + 2;
    v76 = v1;
    v77 = v0;
    v78 = (v76 ^ 1) + ~v76 * 2 + ((v76 * 2 | v76 >> 63) & 2 & 3);
    v79 = (v76 - v77 | ((v77 | ~v78) & v78 + 1) * 4 + ((v77 | ~v78) ^ v78 + 1) * 2) + (((v77 | ~v78) & v78 + 1) * 4 + ((v77 | ~v78) ^ v78 + 1) * 2 & v76 - v77);
    v80 = v77 - v76 + (((v77 | v76) & -v77) * 4 + ((v77 | v76) ^ -v77) * 2 | ~(v77 - v76)) + (((v77 | v76) & -v77) * 4 + ((v77 | v76) ^ -v77) * 2 | v77 - v76);
    v81 = v80 + 1;
    v82 = (v79 - v81 + (v80 | ~v79) + 1 ^ (v79 & v80) - v79) + (v79 - v81 + (v80 | ~v79) + 1 & (v79 & v80) - v79) * 2;
    v83 = ~v79 - v81 + (v79 | v80) + 1;
    v84 = v82 + (v83 & v79 + 1) * 4 + (v83 ^ v79 + 1) * 2 + ((v83 & v79 + 1) * 4 + (v83 ^ v79 + 1) * 2 | ~v82) + (v82 & ~((v83 & v79 + 1) * 4 + (v83 ^ v79 + 1) * 2));
    v85 = v84 + 1;
    v86 = v84 + 2;
    v87 = (v86 + ~v85 * 2 | 37) + v86;
    v88 = v85 + v86 + (37 | ~v85) + ((0xffffffff ^ (unsigned int)v85 * 2) & 74) - 36;
    v0 = (v88 ^ v87) + (v88 & v87) * 2 - 1;
    v1 = (v85 | 1) + (v85 & 1) + 10;
    v89 = (v1 ^ 1) + ~v1 * 2 + ((v1 * 2 | v1 >> 63) & 2 & 3);
    g_f1215e = v3 >> (v0 + (char)v89 + (char)~v89 * 2 + 1 & 63);
    v90 = g_f04710;
    g_f04710 = (unsigned short)(v90 - g_f12158) + (g_f12158 & (unsigned short)v90) + (g_f12158 & (unsigned short)~v90) * 2 + (unsigned short)~((g_f12158 | ~v90) + v90);
    v91 = g_f04712 - g_f1215a;
    v92 = 1 | (g_f1215a & ~g_f04712) * 2;
    g_f04712 = (unsigned short)~((v92 ^ v91) + (v92 & v91) * 2) + (((unsigned short)v92 ^ (unsigned short)v91) + ((unsigned short)v92 & (unsigned short)v91) * 2) * 2;
    v93 = g_f04714 + 1;
    v94 = -g_f1215c;
    g_f04714 = (v94 ^ g_f04714) + ((v94 | ~g_f04714) + v93 + (v93 + ~g_f04714 * 2 & g_f1215c)) * 2;
    v95 = g_f04716 * 2;
    v96 = (g_f04716 ^ 1) + v95 + ~g_f04716 * 4 + (v95 & 2) + 2;
    v97 = (unsigned short)v96 + g_f1215e;
    v98 = -(v96 | g_f1215e);
    v99 = -g_f1215e;
    v100 = (v99 ^ g_f04716) + (g_f04716 + (v99 | ~g_f04716)) * 2 + 2;
    g_f04716 = (v100 | (v97 & v98) * 4 + (v97 ^ v98) * 2) + ((v97 & v98) * 4 + (v97 ^ v98) * 2 & v100);
    v101 = g_f04718 + v3;
    v102 = v101 + (0xffffffffffffffff ^ g_f04718 * 2);
    v103 = v102 + ~(v102 + (g_f04718 | ~v3));
    v104 = v101 + (g_f04718 + (-v3 | ~g_f04718) + (-v3 & ~g_f04718)) * 2 + 2;
    v105 = (0xffffffffffffffff ^ v103 * 2) + v103 * 4 + 2;
    g_f04718 = (v105 ^ v104) + (v105 & v104) * 2 - 1;
    return g_f12158 & v90;
}

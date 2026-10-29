/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x941cd4..0x942608 (2356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_941cd4_0 {
    char field_0;
} st_941cd4_0;

extern unsigned short g_f04bf0;
extern unsigned short g_f04bf2;
extern unsigned short g_f04bf4;
extern unsigned short g_f04bf6;
extern unsigned long long g_f04bf8;
extern unsigned short g_f1275c;
extern unsigned short g_f1275e;
extern unsigned short g_f12760;
extern unsigned short g_f12762;

unsigned long long sub_941cd4(void)
{
    unsigned long long v2;  // x8
    st_941cd4_0 *v3;  // x10
    unsigned int v12;  // w10
    unsigned int v13;  // w12
    unsigned int v14;  // w13
    unsigned int v15;  // w10
    unsigned int v16;  // w10
    unsigned int v17;  // w11
    unsigned int v18;  // w12
    unsigned int v19;  // w13
    unsigned int v20;  // w10
    unsigned short v21;  // x11
    st_941cd4_0 **v4;  // x11
    unsigned long v22;  // x11
    unsigned long v23;  // x12
    unsigned long long v24;  // x13
    unsigned long long v25;  // x11
    unsigned long long v26;  // x11
    unsigned long long v27;  // x11
    unsigned long long v28;  // x11
    char v29;  // x13
    unsigned int v30;  // w12
    unsigned long long v31;  // x13
    st_941cd4_0 **v5;  // x13
    unsigned long long v32;  // x14
    unsigned long long v33;  // x17
    unsigned long long v34;  // x2
    unsigned long long v35;  // x13
    unsigned long long v36;  // x14
    unsigned long long v37;  // x16
    unsigned long long v38;  // x17
    unsigned int v39;  // w12
    unsigned int v40;  // w16
    unsigned int v41;  // w12
    unsigned long long v6;  // x12
    unsigned int v42;  // w14
    unsigned long v43;  // x14
    unsigned long long v44;  // x15
    unsigned long long v45;  // x16
    unsigned long long v46;  // x17
    unsigned long long v47;  // x0
    unsigned long long v48;  // x17
    unsigned long long v49;  // x17
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v7;  // x10
    unsigned long long v52;  // x14
    unsigned long v53;  // x16
    unsigned long long v54;  // x14
    unsigned long long v55;  // x16
    unsigned long long v56;  // x14
    unsigned int v57;  // w14
    unsigned long long v58;  // x15
    unsigned long long v59;  // x17
    unsigned long long v60;  // x0
    unsigned int v61;  // w13
    unsigned long long v8;  // x10
    unsigned int v62;  // w16
    unsigned int v63;  // w13
    unsigned long v64;  // x14
    unsigned long long v65;  // x15
    unsigned long long v66;  // x16
    unsigned long long v67;  // x17
    unsigned long long v68;  // x16
    unsigned long long v69;  // x16
    unsigned long long v70;  // x14
    unsigned long long v71;  // x15
    unsigned long long v9;  // x12
    unsigned long long v72;  // x17
    unsigned long long v73;  // x11
    unsigned long long v74;  // x17
    unsigned long long v75;  // x16
    unsigned long long v76;  // x11
    unsigned int v77;  // w15
    unsigned int v78;  // w10
    unsigned int v79;  // w10
    unsigned short v80;  // x12
    unsigned int v81;  // w10
    unsigned int v10;  // w10
    unsigned int v82;  // w12
    unsigned short v83;  // x10
    unsigned short v84;  // x11
    unsigned int v85;  // w12
    unsigned int v86;  // w10
    unsigned int v87;  // w10
    unsigned long v88;  // x8
    unsigned long long v89;  // x10
    unsigned int v11;  // w11
    st_941cd4_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_941cd4_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 15742441161276987803 + ((2704302907400130352 + ~2704302907400130352 * 2 + 1 & 5037156692) + 2704302907397768736) * 2;
    v3 = v1;
    v4 = v0;
    v5 = (char *)v4 + 1;
    v6 = ((char *)v5 + 0x2 * ~v4 & v3) + (char *)v5;
    v7 = ((~(v5 + v3 + ((char *)v3 + 0x2 * ~v3 + 1 | ~v4)) - (-(v4 & v3) | ~(v5 + v3 + ((char *)v3 + 0x2 * ~v3 + 1 | ~v4)))) * 2 - (v5 + v3 + ((char *)v3 + 0x2 * ~v3 + 1 | ~v4) + (v4 & v3) + (-(v4 & v3) & ~(v5 + v3 + ((char *)v3 + 0x2 * ~v3 + 1 | ~v4))) * 2) ^ v6 + (((char *)v3 + 0x2 * ~v3 + 1 | v4) ^ 0x2 * ~v3 + (char *)v3) - (((char *)v3 + 0x2 * ~v3 + 1 | v4) & v3 + 1) * 2) + ((~(v5 + v3 + ((char *)v3 + 0x2 * ~v3 + 1 | ~v4)) - (-(v4 & v3) | ~(v5 + v3 + ((char *)v3 + 0x2 * ~v3 + 1 | ~v4)))) * 2 - (v5 + v3 + ((char *)v3 + 0x2 * ~v3 + 1 | ~v4) + (v4 & v3) + (-(v4 & v3) & ~(v5 + v3 + ((char *)v3 + 0x2 * ~v3 + 1 | ~v4))) * 2) & v6 + (((char *)v3 + 0x2 * ~v3 + 1 | v4) ^ 0x2 * ~v3 + (char *)v3) - (((char *)v3 + 0x2 * ~v3 + 1 | v4) & v3 + 1) * 2) * 2;
    v8 = v7 | 41239;
    v9 = (v7 + 41239 ^ -v8) + (v7 + 41239 & -v8) * 2;
    v0 = (v7 | 24296) + (24296 | ~v7) + v7 + 1 + (0xfffffffffffffffe - ((24296 | ~v7) + v7) | ~(v7 | 24296)) + ((24296 | ~v7) + v7 + 1 & (v7 | 24296)) + 1;
    v1 = (v9 ^ v8 + 1) + (v9 & v8 + 1) * 2 - 1;
    v10 = v0;
    v11 = v1;
    v12 = v10 + 1;
    v13 = v12 + ~v10 * 2;
    v14 = ((v11 | ~v10) ^ -v13) + ((v11 | ~v10) & -v13) * 2;
    v15 = v11 + 1 + v12 + (v11 + 1 + ~v11 * 2 | v13);
    v16 = (v15 ^ v14) + (v15 & v14) * 2;
    v17 = ~v16 + v16 * 2;
    v18 = ~v2;
    v19 = v17 | v18;
    v20 = (unsigned int)v2 + v17 + ((unsigned int)v2 & -v16) + v19 + 1;
    v21 = v18 - (v17 ^ (unsigned int)v2) - v19;
    g_f1275c = ((unsigned short)v20 ^ v21) + ((unsigned short)v20 + (v21 | (unsigned short)~v20)) * 2 + 2;
    v22 = v1;
    v23 = v0;
    v24 = ((v22 ^ 1) + ~v22 * 2 + ((v22 * 2 | v22 >> 63) & 2 & 3) & v23) * 2;
    v25 = (v23 + ~v23 * 2 ^ ~(v23 + ~v23 * 2 + 1 | v22)) + ((v23 + ~v23 * 2 + 1 | v22) & ~(v23 + ~v23 * 2)) * 2;
    v26 = v25 + (v23 | v22) + (-v25 & ~(v23 | v22)) * 2 + ((v23 | v22) + (-v25 | ~(v23 | v22))) * 2 + 2;
    v27 = v22 - v23 + v24 + (v22 - v23 & ~v24) + (v24 | ~(v22 - v23)) + v26 + 1;
    v28 = v27 - v26 * 2 + (v26 * 2 - v27 | 1) + (v27 + ~(v26 * 2) | 1);
    v0 = v28 + 6;
    v1 = ~((v28 | 1) + (v28 & 1) + 10) + ((v28 | 1) + (v28 & 1) + 10) * 2;
    v29 = (char)v1 * 3 + (char)~v1 * 4;
    v30 = v2 >> (((char)(0xfffffffffffffffd - v29) ^ (char)v0) + ((char)v0 + ((char)(0x7ffffffffffffffd - v29) | (char)~v0)) * 2 + 1 & 63);
    v31 = v1;
    v32 = v0;
    v33 = (v31 ^ 1) + ~v31 * 2 + ((v31 * 2 | v31 >> 63) & 2 & 3);
    v34 = v32 + ~v32 * 2 + 1;
    v35 = v32 - v31 + (v34 + v31 ^ -(v34 | v31)) * 2 + (v34 + v31 & -(v34 | v31)) * 4;
    v36 = (v31 ^ -v32) + (v31 - v32 - (v31 | -v32)) * 2 + (v33 + v32 - (v33 + 0x8000000000000000 | v32)) * 4 + (0xffffffffffffffff ^ (v33 + v32 - (v33 + 0x8000000000000000 | v32)) * 2) + (v35 ^ 1) - 2;
    v37 = v36 - v35 * 4 + v35 * 2 + (v35 * 2 & 2);
    v38 = v37 + 2;
    v0 = v37 + (v37 + (0x7ffffffffffffffd - v37 | 7192)) * 2 + ((0xffffffff ^ (unsigned int)v38 * 2) & 14384) + 0xffffffffffffe3ef;
    v1 = ((v38 | 1) + (v36 & 1) + 58344 | 1) + ((v38 | 1) + (v36 & 1) + 58344 & 1) - 2;
    v39 = v30 * 2;
    v40 = (v39 & 2) + (v30 ^ 1);
    v41 = v39 + 2;
    v42 = v41 + ~v30 * 4 + v40 | (unsigned int)(v0 + (unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 2;
    g_f1275e = (unsigned short)(v42 - (v41 - v40)) + ((unsigned short)v42 + ((unsigned short)(v41 - v40) | (unsigned short)~v42) + ((unsigned short)(v41 - v40) & (unsigned short)~v42)) * 2 + 2;
    v43 = v1;
    v44 = v0;
    v45 = -v44;
    v46 = v43 + ~v43 * 2 + 1;
    v47 = (v43 ^ v45) + (v43 - v44 - (v43 | v45)) * 2;
    v48 = (v46 + v44 & -(v46 | v44)) * 4 + (v46 + v44 ^ -(v46 | v44)) * 2 | 1;
    v49 = (v48 ^ v47) + (v48 & v47) * 2 - 1;
    v50 = (v44 ^ -v43) + (v44 + (-v43 | ~v44)) * 2 + 2;
    v51 = ((v44 | v43) & v45) * 4 + ((v44 | v43) ^ v45) * 2 | 1;
    v52 = 1 - ((v51 ^ v50) + (v51 & v50) * 2);
    v53 = v49 ^ v52;
    v54 = v53 + (v49 & v52) * 2;
    v55 = (v54 + ~v54 * 2 ^ ~(v54 + ~v54 * 2 + (v53 & 1) + 1)) + (v54 + ~v54 * 2 + (v53 & 1) + 1 & ~(v54 + ~v54 * 2)) * 2;
    v56 = (v55 ^ (v54 | 1) + 1) + (v55 & (v54 | 1) + 1) * 2;
    v0 = v54 + 31;
    v1 = ~v56 + v56 * 2;
    v57 = v2 >> ((char)(((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2 - 1) & 63);
    v58 = (1 | ((v1 | v0) - (v0 & v1) | -(v0 ^ v1)) * 2) - ((-(v0 ^ v1) | ~((v1 | v0) - (v0 & v1))) + (v1 | v0) - (v0 & v1)) * 2 + (((v1 | v0) - (v0 & v1) & -(v0 ^ v1)) - ((v1 | v0) - (v0 & v1) - (v0 ^ v1)) & (v1 | v0) - (v0 & v1) - (v0 ^ v1)) * 4 + (((v1 | v0) - (v0 & v1) & -(v0 ^ v1)) - ((v1 | v0) - (v0 & v1) - (v0 ^ v1)) ^ (v1 | v0) - (v0 & v1) - (v0 ^ v1)) * 2 + ((((v1 | v0) - (v0 & v1) & -(v0 ^ v1)) - ((v1 | v0) - (v0 & v1) - (v0 ^ v1)) & (v1 | v0) - (v0 & v1) - (v0 ^ v1)) * 4 + (((v1 | v0) - (v0 & v1) & -(v0 ^ v1)) - ((v1 | v0) - (v0 & v1) - (v0 ^ v1)) ^ (v1 | v0) - (v0 & v1) - (v0 ^ v1)) * 2 | (-(v0 ^ v1) | ~((v1 | v0) - (v0 & v1))) + (v1 | v0) - (v0 & v1) - ((v1 | v0) - (v0 & v1) | -(v0 ^ v1))) + ((-(v0 ^ v1) | ~((v1 | v0) - (v0 & v1))) + (v1 | v0) - (v0 & v1) - ((v1 | v0) - (v0 & v1) | -(v0 ^ v1)) | ~((((v1 | v0) - (v0 & v1) & -(v0 ^ v1)) - ((v1 | v0) - (v0 & v1) - (v0 ^ v1)) & (v1 | v0) - (v0 & v1) - (v0 ^ v1)) * 4 + (((v1 | v0) - (v0 & v1) & -(v0 ^ v1)) - ((v1 | v0) - (v0 & v1) - (v0 ^ v1)) ^ (v1 | v0) - (v0 & v1) - (v0 ^ v1)) * 2));
    v59 = v58 - 1;
    v60 = v58 * 2;
    v0 = (v59 | 14614) + v58 + (v58 - v60 | 14614);
    v1 = (-v58 | 50921) - v58 + v60 + v58 + (v59 & 50921) + ((0xffffffff ^ (unsigned int)v59 * 2) & 101842) + 0xffffffffffff3916;
    v61 = v0;
    v62 = (v61 + ~v61 * 2 ^ ~(v61 + ~v61 * 2 + 1 | (unsigned int)v1)) + ((v61 + ~v61 * 2 + 1 | (unsigned int)v1) & ~(v61 + ~v61 * 2)) * 2;
    v63 = (v62 ^ ((unsigned int)v1 | v61) + 1) + (v62 & ((unsigned int)v1 | v61) + 1) * 2;
    g_f12760 = (unsigned short)(v57 * 2 + (v57 ^ 0xfffe) + (v57 ^ 1) + ~v57 * 2 - ((unsigned short)~v63 + (unsigned short)v63 * 2)) + ((unsigned short)~v63 + (unsigned short)v63 * 2 & ((unsigned short)v57 ^ 1) + (unsigned short)~v57 * 2 + ((unsigned short)v57 * 2 & 2)) + ((unsigned short)~v63 + (unsigned short)v63 * 2 & (unsigned short)~((v57 ^ 1) + ~v57 * 2 + (v57 * 2 & 2))) * 2 + 3;
    v64 = v1;
    v65 = v0;
    v66 = v64 + ~v64 * 2;
    v67 = v66 + 1;
    v68 = (v66 ^ ~(v67 | v65)) + ((v67 | v65) & ~v66) * 2;
    v69 = v64 + v65 + (v65 + ~v65 * 2 + 1 | v67) + v68 + ~v68 * 2 + 3;
    v70 = (v65 | v64) + ~((v64 | ~v65) + v65);
    v71 = v70 + 0x7fffffffffffffff;
    v72 = v69 + v70 + ((v69 & v71) - (v69 + v70)) * 2;
    v73 = (0xfffffffffffffffd - ((v69 | v71) - v70) * 2 & v72) + ((v69 | v71) - v70) * 2 + 2 + (((v69 | v71) - v70) * 2 + 2 & v72);
    v74 = v73 + 1;
    v75 = v74 + ~v73 * 2;
    v76 = ((v75 | 2) + v74 ^ (v73 & 2) - (v73 ^ 0xfffffffffffffffd)) + ((v75 | 2) + v74 & (v73 & 2) - (v73 ^ 0xfffffffffffffffd)) * 2;
    v0 = ((46 & ~v73) + (v73 ^ 0xffffffffffffffd1) ^ -v75) + (v73 | 46) + ((46 & ~v73) + (v73 ^ 0xffffffffffffffd1) & -v75) * 2;
    v1 = ~v76 + v76 * 2;
    g_f12762 = v2 >> ((char)v1 + (char)v0 & 63);
    v77 = g_f04bf0 | g_f1275c;
    v78 = (unsigned int)(g_f1275c - g_f04bf0) + (g_f04bf0 | ~g_f1275c);
    v79 = (v78 ^ g_f04bf0 + 1) + (v78 & g_f04bf0 + 1) * 2;
    g_f04bf0 = v79 + v77 + 1 + ((-v79 & 0xffff | ~v77) + v77 + 1 + (-v79 & 0xffff & ~v77)) * 2 - 1;
    v80 = g_f1275e + g_f04bf2;
    v81 = g_f1275e | g_f04bf2;
    g_f04bf2 = (unsigned short)(v81 - (v80 & -v81) * 2) + ((unsigned short)(v81 - 1) ^ v80) + 1;
    v82 = g_f04bf4 + ~g_f04bf4 * 2 + 1;
    v83 = g_f04bf4 - g_f12760;
    v84 = ((g_f12760 | (unsigned short)~v82) + (unsigned short)v82) * 2 + 3;
    g_f04bf4 = (v84 ^ v83) + (v84 & v83) * 2 - 1;
    v85 = g_f12762 | g_f04bf6;
    v86 = g_f12762 + g_f04bf6;
    v87 = (v86 ^ -v85) + (v86 & -v85) * 2;
    g_f04bf6 = (unsigned short)v85 + (unsigned short)v87 + ((unsigned short)(v85 - v87 - (v85 | -v87 & 0xffff)) + ((unsigned short)-v87 & (unsigned short)~v85)) * 2;
    v88 = g_f04bf8 - v2;
    v89 = (v2 + ~g_f04bf8 + (g_f04bf8 & ~v2)) * 2 + 3;
    g_f04bf8 = (v89 ^ v88) + (v89 & v88) * 2 - 1;
    return -v75;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50884c..0x50916c (2336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50884c_0 {
    char field_0;
} st_50884c_0;

extern unsigned short g_f04470;
extern unsigned short g_f04472;
extern unsigned short g_f04474;
extern unsigned short g_f04476;
extern unsigned long long g_f04478;
extern unsigned short g_f12008;
extern unsigned short g_f1200a;
extern unsigned short g_f1200c;
extern unsigned short g_f1200e;

unsigned int sub_50884c(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x12
    unsigned long v13;  // x13
    unsigned long long v14;  // x15
    unsigned long long v15;  // x0
    unsigned long long v16;  // x12
    unsigned long long v17;  // x13
    unsigned long long v18;  // x15
    char v19;  // x15
    unsigned int v20;  // w15
    unsigned long long v21;  // x16
    st_50884c_0 *v4;  // x10
    unsigned long long v22;  // x17
    unsigned long long v23;  // x1
    unsigned long long v24;  // x13
    unsigned long long v25;  // x0
    unsigned long long v26;  // x0
    unsigned long long v27;  // x2
    unsigned long long v28;  // x1
    unsigned long long v29;  // x16
    unsigned long long v30;  // x2
    unsigned long long v31;  // x17
    st_50884c_0 **v5;  // x11
    unsigned long long v32;  // x16
    unsigned int v33;  // w17
    unsigned int v34;  // w16
    unsigned long v35;  // x16
    unsigned long long v36;  // x17
    unsigned long long v37;  // x0
    unsigned long long v38;  // x2
    unsigned long long v39;  // x1
    unsigned long long v40;  // x3
    unsigned long long v41;  // x0
    unsigned long long v6;  // x10
    unsigned long long v42;  // x4
    unsigned long long v43;  // x16
    unsigned long long v44;  // x17
    unsigned long long v45;  // x1
    unsigned long long v46;  // x16
    unsigned long long v47;  // x16
    unsigned long long v48;  // x0
    unsigned long long v49;  // x17
    unsigned long long v50;  // x1
    unsigned long long v51;  // x16
    unsigned long long v7;  // x10
    unsigned long long v52;  // x14
    unsigned long long v53;  // x16
    unsigned int v54;  // w14
    unsigned long v55;  // x16
    unsigned long v56;  // x0
    unsigned long v57;  // x11
    unsigned long long v58;  // x3
    unsigned long long v59;  // x11
    unsigned long long v60;  // x16
    unsigned long long v61;  // x11
    unsigned long long v8;  // x12
    unsigned int v62;  // w11
    unsigned int v63;  // w12
    unsigned long v65;  // x12
    unsigned long long v66;  // x14
    unsigned long long v67;  // x0
    unsigned long long v68;  // x1
    unsigned long long v69;  // x17
    unsigned long long v70;  // x12
    unsigned long long v71;  // x12
    unsigned long long v9;  // x13
    unsigned long long v72;  // x12
    unsigned long long v73;  // x13
    unsigned int v74;  // w17
    unsigned int v75;  // w10
    unsigned int v76;  // w14
    unsigned short v77;  // x10
    unsigned short v78;  // x12
    unsigned int v79;  // w14
    unsigned int v80;  // w10
    unsigned short v81;  // x10
    unsigned int v10;  // w10
    unsigned int v82;  // w12
    unsigned short v83;  // x12
    unsigned short v11;  // x10
    st_50884c_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_50884c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04470 + ~(~&g_f04470 + &g_f04470));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v5 - v4 + (v4 & ~v5) * 4 - (v4 & ~v5) * 2;
    v7 = v6 + (0xffffffffffffffff ^ v6 * 2) + (v6 & (v5 ^ v4)) + (v6 + (0xffffffffffffffff ^ v6 * 2) & (v5 ^ v4));
    v8 = v7 + 1;
    v9 = v7 + (0xfffffffffffffffe - v7 | 0x7f82) + 2;
    v0 = (v9 ^ (v8 | 0x7f82) + 1) + (v9 & (v8 | 0x7f82) + 1) * 2 - 1;
    v1 = v7 + (65788 & v8 * 2) + (65788 & v8 * 2 ^ 65788) + 0xffffffffffff7f82;
    v10 = v0 + ~(unsigned int)v1 + (unsigned int)v1 * 2 + 2;
    v11 = (unsigned short)v10 + (unsigned short)~v10 * 2 + (unsigned short)v10 * 2 + 1;
    g_f12008 = v11 * 2 - ((v11 & (unsigned int)v3) + (v11 & (unsigned int)~v3) * 2);
    v12 = v1;
    v13 = v0;
    v14 = v12 + (0xffffffffffffffff ^ v12 * 2) & v13;
    v15 = v12 + 1;
    v16 = v13 + 1 + v12 + (v15 + ~v12 * 2 | ~v13) + ((v13 + 1 + ~v13 * 2 | v12) ^ ~v13 * 2 + v13) - ((v13 + 1 + ~v13 * 2 | v12) & v13 + 1) * 2;
    v17 = (((v15 - v13 + v14 * 4 + ~(v14 * 2) + ~v16 & -(v15 - v13 + v14 * 4 + ~(v14 * 2) | ~v16)) * 4 + (v15 - v13 + v14 * 4 + ~(v14 * 2) + ~v16 ^ -(v15 - v13 + v14 * 4 + ~(v14 * 2) | ~v16)) * 2 | 1) ^ v14 * 2 - (v15 - v13 + v14 * 4) - v16 + (v16 & v15 - v13 + v14 * 4 + ~(v14 * 2)) * 2) + (((v15 - v13 + v14 * 4 + ~(v14 * 2) + ~v16 & -(v15 - v13 + v14 * 4 + ~(v14 * 2) | ~v16)) * 4 + (v15 - v13 + v14 * 4 + ~(v14 * 2) + ~v16 ^ -(v15 - v13 + v14 * 4 + ~(v14 * 2) | ~v16)) * 2 | 1) & v14 * 2 - (v15 - v13 + v14 * 4) - v16 + (v16 & v15 - v13 + v14 * 4 + ~(v14 * 2)) * 2) * 2;
    v18 = v17 - 1;
    v0 = (v17 + 1 | 1) + (v18 & 1);
    v1 = v17 + ((-v17 | 14) + v17) * 2 + ((0xffffffff ^ (unsigned int)v18 * 2) & 28) - 16;
    v19 = (0xffffffffffffffff ^ ~v1 * 2) - v1;
    v20 = v3 >> ((v19 ^ (char)v0) + ((char)v0 + (v19 | (char)~v0)) * 2 + 1 & 63);
    v21 = v1;
    v22 = v0;
    v23 = v21 + 1;
    v24 = v23 + v22 + (-v22 & ~v21) * 2 + (v21 - v22 - (v21 | -v22)) * 2;
    v25 = ((v23 + ~v21 * 2 + ~(v23 + ~v21 * 2) * 2 + 1 | v22) + v23 + ~v21 * 2) * 2;
    v26 = v25 + 2 + v24 + (0xfffffffffffffffd - v25 | -v24) + (v25 + 2 & v24 - 1);
    v27 = (v22 ^ 1) + ~v22 * 2 + ((v22 * 2 | v22 >> 63) & 2 & 3);
    v28 = (v23 + v27 - 1 & -(v23 + v27) - (~v27 | ~v21)) * 4 + (v23 + v27 - 1 ^ -(v23 + v27) - (~v27 | ~v21)) * 2;
    v29 = ~(v22 - v21 + ~v28 + v28 * 2 + 2) + (v22 - v21 + ~v28 + v28 * 2 + 2) * 2;
    v30 = v26 + 1;
    v31 = v29 + v30 + (v30 + ~v26 * 2 - v29 - (v30 + ~v26 * 2 | -v29)) * 2;
    v32 = ((v29 - 1 & ~v26) - v29 & v30) * 4 + ((v29 - 1 & ~v26) - v29 ^ v30) * 2 + v31 + (((v29 - 1 & ~v26) - v29 & v30) * 4 + ((v29 - 1 & ~v26) - v29 ^ v30) * 2 | -v31) + (v31 - 1 & ~(((v29 - 1 & ~v26) - v29 & v30) * 4 + ((v29 - 1 & ~v26) - v29 ^ v30) * 2));
    v0 = v32 + 41140;
    v1 = (v32 ^ 24396) + (48792 & v32 * 2) - 1;
    v33 = (unsigned int)(((unsigned int)v1 ^ 0xfffffffe) + (unsigned int)v1 * 2 - ((unsigned int)v1 * 2 & 2)) + 3;
    v34 = (unsigned int)((v0 & 0xffffffff) - v33) + (v33 & (unsigned int)v0) * 2 + (v33 & ~(unsigned int)v0) * 2 + 1;
    g_f1200a = ((unsigned short)(~v34 + v34 * 2 - 1) + (unsigned short)v20 ^ (unsigned short)-(~v34 + v34 * 2 - 1 | v20)) + ((unsigned short)~v34 + (unsigned short)v34 * 2 + (unsigned short)v20 + ((unsigned short)-(~v34 + v34 * 2 - 1 | v20) | (unsigned short)~(~v34 + v34 * 2 - 1 + v20))) * 2;
    v35 = v1;
    v36 = v0;
    v37 = v35 + (0xffffffffffffffff ^ v35 * 2) & v36;
    v38 = v36 + 1;
    v39 = v38 + ~v36 * 2;
    v40 = v37 * 2;
    v41 = v35 + v39 + v37 * 4 + 2;
    v42 = v41 + ~v40;
    v43 = v36 - v35 + (v35 | ~v36) + v38 + (v35 & ~v36) * 2 + ~((v39 | v35) + v36);
    v44 = v43 + 0x7fffffffffffffff;
    v45 = v43 + v42 + ((v44 & v42) - (v43 + v42)) * 2;
    v46 = (v42 - v43 + (v44 & v40 - v41)) * 2;
    v47 = (v45 & 0xfffffffffffffffd - v46) + v46 + 2 + (v45 & v46 + 2);
    v48 = v47 + 1;
    v49 = ((7 & ~v47) + (v47 ^ 0xfffffffffffffff8) ^ v48) + ((7 & ~v47) + (v47 ^ 0xfffffffffffffff8) & v48) * 2;
    v50 = (v48 + ~v47 * 2 | 25) + v47;
    v51 = (0xffffffffffffffe6 | ~v47) + v48 + 25;
    v0 = (v49 ^ (v47 | 7) + 1) + (v49 & (v47 | 7) + 1) * 2 - 1;
    v1 = v51 + v50 * 2 + (0xfffffffffffffffe - v50 | v51) - (v50 + 1 & v51) + 3;
    v52 = v1 | v0;
    v53 = (v1 + v0 ^ -v52) + (v1 + v0 & -v52) * 2;
    v54 = v3 >> ((char)v53 + ((char)v52 | (char)~v53) + ((char)v53 | (char)v52) + 1 & 63);
    v55 = v1;
    v56 = v0;
    v57 = v55 + v56 + (0xffffffffffffffff ^ v55 * 2);
    v58 = ~(v57 + (v55 | ~v56));
    v59 = ((1 | (v57 + v58) * 2) ^ (v55 ^ -v56) + (v55 - v56 - (v55 | -v56)) * 2) + ((1 | (v57 + v58) * 2) & (v55 ^ -v56) + (v55 - v56 - (v55 | -v56)) * 2) * 2;
    v60 = (v56 ^ -v55) + (v56 - v55 - (v56 | -v55)) * 2 + (((v56 ^ 1) + ~v56 * 2 + ((v56 * 2 | v56 >> 63) & 2 & 3) | ~v55) + v55) * 2 + 2;
    v61 = (v60 ^ 1) + v60 * 2 - (v59 + v60 * 4) + (v60 * 2 & 2) + v59 * 2;
    v0 = v61 + 25109;
    v1 = v61 - 4 + (v61 - 2 & 40424) - (0xfffffffffffec42f | (v61 - 2) * 2) + (0xffffffffffff6215 - (v61 - 4) - (0xfffd - (v61 - 4) | 0xffffffffffff6217) ^ v61 + 40422) + (0xffffffffffff6215 - (v61 - 4) - (0xfffd - (v61 - 4) | 0xffffffffffff6217) & v61 + 40422) * 2 + 0xffffffffffff6219;
    v62 = v0;
    v63 = (unsigned int)v1 + (0xffffffff ^ (unsigned int)v1 * 2);
    g_f1200c = (((unsigned short)v63 + (unsigned short)v62 + ((unsigned short)v62 + ((unsigned short)-v63 | (unsigned short)~v62) + ((unsigned short)-v63 & (unsigned short)~v62)) * 2 + 2 | 1) + ((unsigned short)v63 + (unsigned short)v62 | 0xfffe) | (unsigned short)~v54) + (unsigned short)v54 + 1;
    v65 = v1;
    v66 = v0;
    v67 = ~v66;
    v68 = v66 + v65;
    v69 = v68 + ((v66 & ~v65) + v67) * 2 + 2;
    v70 = v68 + ~v65 * 2 + ~((v65 + v67 & -(v65 | ~v66)) * 4 + (v65 + v67 ^ -(v65 | ~v66)) * 2) + ((v65 + v67 & -(v65 | ~v66)) * 4 + (v65 + v67 ^ -(v65 | ~v66)) * 2) * 2;
    v71 = ((v70 + 4 + ~(v70 + 3) * 2 | 1) + (v70 + 4 & 1) & v69) * 2;
    v72 = (v69 ^ 0xfffffffffffffffd - v70) + v71 + (v71 | ~(v69 ^ 0xfffffffffffffffd - v70)) + ((v69 ^ 0xfffffffffffffffd - v70) & ~v71);
    v0 = (v72 + 1 ^ 42) + (v72 + 1 + (42 | ~(v72 + 1))) * 2 + 1;
    v1 = v72 + 8;
    v73 = v1 * 3 + ~v1 * 4;
    g_f1200e = v3 >> ((char)v1 * 3 + (char)~v1 * 4 + 2 + v0 + (((char)(0x7ffffffffffffffd - v73) & v0) + (char)~(v73 + 2 | v0)) * 2 & 63);
    v74 = g_f12008 + g_f04470;
    v75 = g_f12008 | g_f04470;
    g_f04470 = (unsigned short)(g_f04470 + (g_f12008 | ~g_f04470) + (g_f12008 ^ g_f04470) - (v74 & -v75) * 2) + ((unsigned short)(v75 - 1) ^ (unsigned short)v74) + 2;
    v76 = g_f1200a | g_f04472;
    v77 = g_f1200a + g_f04472;
    g_f04472 = (unsigned short)(v76 - (v77 & -v76) * 2) + ((unsigned short)(v76 - 1) ^ v77) + 1;
    v78 = g_f04474 + (g_f1200c | ~g_f04474) + (g_f1200c ^ g_f04474) + 1;
    v79 = g_f1200c + g_f04474;
    v80 = -(g_f1200c | g_f04474);
    v81 = -((v79 ^ v80) + (v79 & v80) * 2);
    g_f04474 = (v81 ^ v78) + (v81 & v78) * 2;
    v82 = (g_f04476 ^ 1) + ~g_f04476 * 2 + (__ROL__(g_f04476, 1) & 2 & 3);
    v83 = g_f1200e | (unsigned short)~v82;
    g_f04476 = g_f04476 - g_f1200e + (v83 ^ (unsigned short)v82 + 1) * 2 + (v83 & (unsigned short)v82 + 1) * 4;
    g_f04478 = g_f04478 - v3 + (((g_f04478 ^ 1) + ~g_f04478 * 2 + ((g_f04478 * 2 | g_f04478 >> 63) & 2 & 3) | ~v3) + v3) * 2 + 2;
    return v74 & -v75;
}

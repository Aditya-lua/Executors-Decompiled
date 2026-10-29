/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ca3c8..0x4cad10 (2376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ca3c8_0 {
    char field_0;
} st_4ca3c8_0;

extern unsigned short g_f04420;
extern unsigned short g_f04422;
extern unsigned short g_f04424;
extern unsigned short g_f04426;
extern unsigned long long g_f04428;
extern unsigned short g_f11fe0;
extern unsigned short g_f11fe2;
extern unsigned short g_f11fe4;
extern unsigned short g_f11fe6;
extern unsigned int g_fffffffffffffffc;

int sub_4ca3c8(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v12;  // x13
    unsigned long long v13;  // x12
    unsigned long long v14;  // x10
    unsigned long v15;  // x13
    unsigned long long v16;  // x10
    unsigned long long v17;  // x13
    unsigned long long v18;  // x14
    unsigned long long v19;  // x10
    unsigned long long v20;  // x15
    unsigned long long v21;  // x15
    unsigned long long v4;  // x12
    unsigned long long v22;  // x13
    unsigned int v23;  // w13
    unsigned int v24;  // w16
    unsigned int v25;  // w15
    unsigned int v26;  // w15
    unsigned int v27;  // w11
    unsigned int v28;  // w11
    unsigned long v29;  // x13
    unsigned long v30;  // x16
    unsigned long long v31;  // x14
    unsigned long long v5;  // x8
    unsigned long long v32;  // x13
    unsigned long long v33;  // x13
    unsigned long long v34;  // x16
    unsigned int v35;  // w14
    unsigned long long v36;  // x16
    unsigned long long v37;  // x17
    unsigned long long v38;  // x1
    unsigned long long v39;  // x4
    unsigned long long v40;  // x0
    unsigned long long v41;  // x1
    unsigned long long v6;  // x11
    unsigned long long v42;  // x0
    unsigned long long v43;  // x16
    unsigned long long v44;  // x16
    unsigned long v45;  // x17
    unsigned long long v46;  // x16
    unsigned short v47;  // x14
    unsigned long long v48;  // x16
    unsigned long long v49;  // x17
    unsigned long long v50;  // x0
    unsigned long long v51;  // x16
    unsigned long long v7;  // x8
    unsigned long long v52;  // x16
    unsigned long long v53;  // x17
    unsigned long long v54;  // x0
    unsigned long long v55;  // x17
    unsigned long long v56;  // x17
    unsigned long long v57;  // x1
    unsigned int v58;  // w16
    unsigned long long v59;  // x17
    unsigned long v60;  // x1
    unsigned long long v61;  // x2
    st_4ca3c8_0 *v8;  // x10
    unsigned long long v62;  // x4
    unsigned long long v63;  // x15
    unsigned long long v64;  // x17
    unsigned long long v65;  // x0
    unsigned long long v66;  // x12
    unsigned long long v67;  // x0
    unsigned long v68;  // x15
    unsigned long long v69;  // x16
    unsigned long long v70;  // x17
    unsigned long long v71;  // x0
    st_4ca3c8_0 **v9;  // x12
    unsigned long long v72;  // x1
    unsigned long long v73;  // x2
    unsigned long long v74;  // x15
    unsigned long long v75;  // x16
    unsigned long long v76;  // x15
    unsigned long long v77;  // x16
    unsigned long long v78;  // x15
    unsigned long long v79;  // x16
    unsigned long long v80;  // x17
    unsigned long v81;  // x15
    unsigned long long v10;  // x13
    unsigned long long v82;  // x16
    char v83;  // x17
    unsigned long long v84;  // x15
    unsigned int v85;  // w16
    unsigned int v86;  // w17
    unsigned short v87;  // x11
    unsigned short v88;  // x15
    unsigned short v89;  // x11
    unsigned int v90;  // w14
    unsigned int v91;  // w11
    unsigned long long v11;  // x14
    unsigned int v92;  // w10
    st_4ca3c8_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4ca3c8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04420 + ~(~&g_f04420 + &g_f04420));
    v3 = v2 >> 29;
    v4 = v2 | v3;
    v5 = ~v2 - (v3 | ~v2);
    v6 = v4 ^ v5;
    v7 = v6 + (v4 & v5) * 2;
    v8 = v1;
    v9 = v0;
    v10 = ~v9 * 2;
    v11 = v9 - v8 + (v8 & ~v9) + (char *)v9 + v10 + (v8 | ~(st_4ca3c8_0 **)((char *)v9 + v10 + 1)) + 2;
    v12 = (v9 ^ 1) + ((v9 * 2 | v9 >> 63) & 2 & 3) + v10;
    v13 = (&v8[v12] & -(v12 | v8)) * 4 + (&v8[v12] ^ -(v12 | v8)) * 2 | 1;
    v14 = 1 - ((v13 ^ v9 - v8) + (v13 & v9 - v8) * 2);
    v15 = v14 ^ v11;
    v16 = v15 + (v14 & v11) * 2;
    v17 = (v15 | (char *)&g_fffffffffffffffc + 2) + (-v16 | 1) + 1;
    v18 = v17 + v16 * 2;
    v19 = v18 + ~v18 * 2;
    v20 = v19 + 1;
    v21 = v18 + v20 + 43224 + (~(unsigned int)v20 | 0xffffffffffff5729);
    v22 = (v18 | 1) + (v17 & 1) - (v18 & 43222) + 43222;
    v0 = v18 + (v18 & 22313) + ((0xffffffff ^ (unsigned int)v18 * 2) & 44626) + (v19 ^ ~(v20 | 22313)) + ((v20 | 22313) & ~v19) * 2 + 0xffffffffffffa8d7;
    v1 = (v21 ^ v22) + (v21 & v22) * 2 - 1;
    v23 = v0;
    v24 = v23 + 1;
    v25 = v24 + ~v23 * 2 | (unsigned int)v1;
    v26 = ~v7;
    v27 = ((unsigned int)v7 ^ 1) + (__ROL__((unsigned int)v6, 1) & 2 & 3) + v26 * 2;
    v28 = v27 - (((v25 ^ v24) + (v25 & v24) * 2 ^ ((unsigned int)v1 | v23) + 1) + ((v25 ^ v24) + (v25 & v24) * 2 & ((unsigned int)v1 | v23) + 1) * 2) + (((v25 ^ v24) + (v25 & v24) * 2 ^ ((unsigned int)v1 | v23) + 1) + ((v25 ^ v24) + (v25 & v24) * 2 & ((unsigned int)v1 | v23) + 1) * 2 - 1 & v27) + (((v25 ^ v24) + (v25 & v24) * 2 ^ ((unsigned int)v1 | v23) + 1) + ((v25 ^ v24) + (v25 & v24) * 2 & ((unsigned int)v1 | v23) + 1) * 2 - 1 & ~v27) * 2 + 1;
    g_f11fe0 = (unsigned short)v28 + (unsigned short)v26 + ((unsigned short)v28 + ((unsigned short)v7 + 1 | (unsigned short)~v28) + ((unsigned short)v7 + 1 & (unsigned short)~v28)) * 2 + 2;
    v29 = v1;
    v30 = v0;
    v31 = (v30 ^ ~-v29) + (v29 + (v30 | -v29) - v30) * 2;
    v32 = v29 + v30 + ((v29 + ((char *)&g_fffffffffffffffc + 3 ^ v29 * 2) & v30) + ~v30) * 2 + v31 - ((v30 + ((char *)&g_fffffffffffffffc + 3 ^ v30 * 2) + v29 & -(v30 + ((char *)&g_fffffffffffffffc + 3 ^ v30 * 2) | v29)) * 4 + (v30 + ((char *)&g_fffffffffffffffc + 3 ^ v30 * 2) + v29 ^ -(v30 + ((char *)&g_fffffffffffffffc + 3 ^ v30 * 2) | v29)) * 2 | v31) + (v31 & ~((v30 + ((char *)&g_fffffffffffffffc + 3 ^ v30 * 2) + v29 & -(v30 + ((char *)&g_fffffffffffffffc + 3 ^ v30 * 2) | v29)) * 4 + (v30 + ((char *)&g_fffffffffffffffc + 3 ^ v30 * 2) + v29 ^ -(v30 + ((char *)&g_fffffffffffffffc + 3 ^ v30 * 2) | v29)) * 2));
    v33 = v32 + ((char *)&g_fffffffffffffffc - v32 + 1 | 1) + (v32 + 2 | 1) + 3;
    v34 = (v33 + ~v33 * 2 + 1 | 9) + v33;
    v0 = (v33 * 2 & 16 & v33) + ((v33 * 2 & 16 | v33) ^ 8) - 1;
    v1 = (v33 | 9) + v34 + ((char *)&g_fffffffffffffffc - v34 + 2 | v33 | 9) + (v34 + 1 & ~(v33 | 9)) + 2;
    v35 = v7 >> ((char)v1 + (char)v0 & 63);
    v36 = v1;
    v37 = v0;
    v38 = v36 + ((char *)&g_fffffffffffffffc + 3 ^ v36 * 2) & v37;
    v39 = v36 + 1;
    v40 = v37 + v36 + (-v37 & ~v36) * 2 + ((-v37 | ~v36) + v39) * 2;
    v41 = ((char *)&g_fffffffffffffffc + 3 ^ v38 * 2) + v38 * 4 + 2;
    v42 = ~((v41 ^ v40) + (v41 & v40) * 2) + ((v41 ^ v40) + (v41 & v40) * 2) * 2;
    v43 = v36 - (v37 + (v36 | ~v37)) + (v39 + ~v36 * 2 & v37);
    v44 = ((v43 | 1) + (v43 & 1) - 2 ^ 1) + ~((v43 | 1) + (v43 & 1) - 2) * 2 + ((((v43 | 1) + (v43 & 1) - 2) * 2 | (v43 | 1) + (v43 & 1) - 2 >> 63) & 2 & 3) + 1;
    v45 = v44 ^ v42;
    v46 = v45 + (v44 & v42) * 2;
    v0 = (v45 & 1) + 42117 + (v46 | 1);
    v1 = (v46 + (46836 & v46 * 2) + (46836 & v46 * 2 ^ 46836) + 0xffffffffffffa486 | 1) + (v45 | (char *)&g_fffffffffffffffc + 2);
    v47 = (unsigned short)v35 + (unsigned short)~v35 * 2;
    g_f11fe2 = ((unsigned short)v1 + (unsigned short)v0 | (unsigned short)v35 + (unsigned short)~v35 * 2 + 1) + (unsigned short)v35 + (unsigned short)~v35 * 2 + 1 + ((unsigned short)(((unsigned int)v1 + (unsigned int)v0 | v47 + 1) - (v35 + ~v35 * 2 + 1) - ((unsigned int)v1 + (unsigned int)v0 | v47 + 1 | ~(v35 + ~v35 * 2))) + ((unsigned short)~((unsigned int)v1 + (unsigned int)v0 | v35 + ~v35 * 2 + 1) & (unsigned short)~(v35 + ~v35 * 2))) * 2;
    v48 = v1;
    v49 = v0;
    v50 = (v48 & ~v49) + (v49 | ~v48) + (v49 ^ v48) + 1;
    v51 = ((v49 | v48) - 1 ^ v49 + v48) - (v49 + v48 & -(v49 | v48)) * 2 + (v49 | v48);
    v52 = (v51 + 1 | ~v50) + v50 * 2 + v51 - (v51 + 1) * 2 + (v51 - (v51 + 1) * 2 | ~v50);
    v53 = v52 + 2;
    v54 = v52 + 3;
    v55 = (v53 - (v54 * 2 | 0xffffffffffffffef) + (v54 & 8) - 7 ^ v53 + (0xfffffffffffffff7 & ~v54) + 10) + (v53 - (v54 * 2 | 0xffffffffffffffef) + (v54 & 8) - 7 & v53 + (0xfffffffffffffff7 & ~v54) + 10) * 2;
    v0 = v53 + (~v54 | 0xffffffffffffffe7) + (((char *)&g_fffffffffffffffc - v52 | 24) ^ v52 + 4) + (((char *)&g_fffffffffffffffc - v52 | 24) & v52 + 4) * 2 + 26;
    v1 = ~v55 + v55 * 2;
    v56 = v1;
    v57 = v56 + ~v56 * 2 + 1;
    v58 = v7 >> (v0 + (char)v56 + (char)v57 + (v0 + ~v0 * 2 + 1 | (char)v56) + (v0 | (char)~v57) + 2 & 63);
    v59 = v1;
    v60 = v0;
    v61 = v60 + v59;
    v62 = (v59 ^ -v60) + (v59 + (-v60 | ~v59)) * 2 + 2;
    v63 = 1 | (v61 + ((char *)&g_fffffffffffffffc + 3 ^ v59 * 2) + ~(v61 + ((char *)&g_fffffffffffffffc + 3 ^ v59 * 2) + (v59 | ~v60))) * 2;
    v64 = v61 + ((-v59 & ~v60) + v60 - (v59 + (v60 | -v59))) * 2;
    v65 = 1 | ((v60 ^ 1) + ~v60 * 2 + ((v60 * 2 | v60 >> 63) & 2 & 3) & v59) * 2;
    v66 = (1 - ((v65 ^ v64) + (v65 & v64) * 2) ^ (v63 ^ v62) + (v63 & v62) * 2 - 1) + (1 - ((v65 ^ v64) + (v65 & v64) * 2) & (v63 ^ v62) + (v63 & v62) * 2 - 1) * 2;
    v67 = (v66 & 0xffffffffffffad1a ^ 0xffffffffffffad1b ^ v66 + 21221) + ((v66 & 0xffffffffffffad1a ^ 0xffffffffffffad1b) & v66 + 21221) * 2;
    v0 = (v66 + 44314 ^ -(v66 | 44314)) + (v66 | 44314) + (v66 + 44314 & -(v66 | 44314)) * 2;
    v1 = (v66 | 21221) + v67 + (v67 & ~(v66 | 21221)) + (v66 | 21221 | ~v67) + 1;
    g_f11fe4 = ((unsigned short)v1 + (unsigned short)v0 & (unsigned short)v58) + ((unsigned short)v1 + (unsigned short)v0 + 1 ^ (unsigned short)v58) + (unsigned short)~((unsigned int)v1 + (unsigned int)v0 + v58) + ((unsigned short)v1 + (unsigned short)v0 + 1 & (unsigned short)v58) * 2;
    v68 = v1;
    v69 = v0;
    v70 = v68 + (v69 | ~v68) + (v69 ^ v68) + 1;
    v71 = v69 & v68;
    v72 = -v71;
    v73 = v70 + v71 + (v72 & ~v70) * 2;
    v74 = (~v69 & ~v68) + (v68 | v69) * 2;
    v75 = v74 + 2;
    v76 = (v71 - v75 + (v74 + 1 | v72)) * 2;
    v77 = v71 + v75 + ((char *)&g_fffffffffffffffc - v74 + 2 & v72) * 2;
    v78 = (v76 - v77 + 3 ^ v73 + (v70 + (v72 | ~v70)) * 2 + 2) + (v76 - v77 + 3 & v73 + (v70 + (v72 | ~v70)) * 2 + 2) * 2;
    v79 = (v78 + 42 ^ -(v78 | 42)) + (v78 + 42 & -(v78 | 42)) * 2;
    v80 = v78 + (~(unsigned int)v78 | 0xffffffffffffffd5) + 43;
    v0 = v79 + (v80 | ~v79) + (v79 | v80) + 1;
    v1 = v78 + 6;
    v81 = v0;
    v82 = v1;
    v83 = ((char)v81 + (char)~v81 * 2 + 1 | (char)v82) + (char)v81;
    v84 = (v82 + ~v82 * 2 + 1 & v81) + v82;
    g_f11fe6 = v7 >> (v83 + (char)v84 + ((char)((char *)&g_fffffffffffffffc - v83 + 2) | (char)v84) + (v83 + 1 & (char)~v84) + 2 & 63);
    v85 = g_f04420 * 3 + ~g_f04420 * 4;
    v86 = (unsigned int)(g_f11fe0 - v85) + (v85 + 3 | ~g_f11fe0) - 3;
    v87 = -g_f11fe0;
    g_f04420 = (v87 ^ g_f04420) + ((unsigned short)v86 & (unsigned short)v85 + 4) * 4 + (g_f04420 + (v87 | ~g_f04420) + ((unsigned short)v86 ^ (unsigned short)v85 + 4)) * 2 + 2;
    v88 = (~g_f11fe2 & ~g_f04422) + (g_f11fe2 | g_f04422) * 2;
    v89 = -(g_f11fe2 & g_f04422);
    g_f04422 = (v88 + 1 ^ v89) + (v88 + ((unsigned short)(0xfffffffe - v88) | v89)) * 2 + 4;
    v90 = g_f04424 + ~g_f04424 * 2;
    g_f04424 = (~g_f11fe4 & ~g_f04424) + (unsigned short)~((v90 + 1 | g_f11fe4) + g_f04424) + (g_f11fe4 | g_f04424) * 2 + 1;
    v91 = g_f04426 - g_f11fe6;
    v92 = ((0xffffffff ^ g_f04426 * 2) + g_f04426 & g_f11fe6) * 2;
    g_f04426 = (unsigned short)v91 + (unsigned short)v92 + ((unsigned short)v92 | (unsigned short)~v91) + ((unsigned short)v91 & (unsigned short)~v92) + 1;
    g_f04428 = (~g_f04428 & ~v7) - (g_f04428 & v7) + (v7 | g_f04428) * 2 + 1;
    return v86 ^ v85 + 4;
}

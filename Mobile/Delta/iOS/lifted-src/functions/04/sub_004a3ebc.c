/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a3ebc..0x4a4764 (2216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a3ebc_0 {
    char field_0;
} st_4a3ebc_0;

extern unsigned short g_f046c0;
extern unsigned short g_f046c2;
extern unsigned short g_f046c4;
extern unsigned short g_f046c6;
extern unsigned long long g_f046c8;
extern unsigned short g_f12130;
extern unsigned short g_f12132;
extern unsigned short g_f12134;
extern unsigned short g_f12136;

unsigned int sub_4a3ebc(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x13
    unsigned long long v13;  // x16
    unsigned long long v14;  // x16
    unsigned int v15;  // w13
    unsigned int v16;  // w14
    unsigned int v17;  // w15
    unsigned int v18;  // w13
    unsigned long long v19;  // x14
    unsigned long v20;  // x15
    unsigned long long v21;  // x1
    st_4a3ebc_0 *v4;  // x13
    unsigned long long v22;  // x16
    unsigned long long v23;  // x14
    unsigned long long v24;  // x14
    unsigned long long v25;  // x14
    unsigned int v26;  // w14
    unsigned long long v27;  // x15
    unsigned long long v28;  // x16
    unsigned long long v29;  // x0
    unsigned long long v30;  // x17
    unsigned long long v31;  // x15
    st_4a3ebc_0 **v5;  // x15
    unsigned long long v32;  // x17
    unsigned long long v33;  // x16
    unsigned long long v34;  // x15
    unsigned long long v35;  // x16
    unsigned long long v36;  // x15
    unsigned long long v37;  // x17
    unsigned long long v38;  // x15
    unsigned int v39;  // w16
    unsigned long v40;  // x15
    unsigned long long v41;  // x16
    st_4a3ebc_0 *v6;  // x12
    unsigned long long v42;  // x17
    unsigned long long v43;  // x0
    unsigned long long v44;  // x15
    unsigned long long v45;  // x16
    unsigned long long v46;  // x17
    unsigned long long v47;  // x15
    unsigned long long v48;  // x16
    unsigned long long v49;  // x15
    unsigned long long v50;  // x16
    unsigned long long v51;  // x15
    unsigned long long v7;  // x11
    unsigned short v52;  // x16
    unsigned long long v53;  // x15
    unsigned long long v54;  // x17
    unsigned long long v55;  // x0
    unsigned long long v56;  // x15
    unsigned long long v57;  // x1
    unsigned long long v58;  // x15
    unsigned long long v59;  // x17
    unsigned int v60;  // w0
    unsigned int v61;  // w17
    unsigned long long v8;  // x13
    unsigned long long v62;  // x17
    unsigned long long v63;  // x0
    unsigned long long v64;  // x3
    unsigned long long v65;  // x2
    unsigned long long v66;  // x12
    unsigned long long v67;  // x1
    unsigned long long v68;  // x17
    unsigned long long v69;  // x17
    unsigned long long v70;  // x11
    unsigned int v71;  // w0
    unsigned long long v9;  // x14
    unsigned int v72;  // w17
    unsigned int v73;  // w1
    unsigned int v74;  // w1
    unsigned int v75;  // w11
    unsigned int v76;  // w13
    unsigned short v77;  // x13
    unsigned short v78;  // x14
    unsigned int v79;  // w11
    unsigned long long v80;  // x12
    unsigned long long v81;  // x13
    unsigned long long v10;  // x13
    unsigned long long v82;  // x8
    unsigned long long v83;  // x9
    unsigned long long v11;  // x13
    st_4a3ebc_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4a3ebc_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f046c0 + ~(~&g_f046c0 + &g_f046c0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 + 1;
    v7 = (char *)v6 + 0x2 * ~v4 | v5;
    v8 = (v5 ^ -v4) + (v5 - &v4[v5 | -v4]) * 2;
    v9 = (v5 + v4 + (0xffffffffffffffff ^ v5 * 2) + ~(v5 + v4 + (0xffffffffffffffff ^ v5 * 2) + (v5 | ~v4))) * 2;
    v10 = v8 + v9 + (v8 & ~v9) + (v9 | ~v8) + 1;
    v11 = (v10 + ~v10 * 2 + 2 ^ (v5 | v4) + (v7 ^ -0x1 * v4 + 0xfffffffffffffffe) - (v7 & v6) * 2 + 1) + (v10 + ~v10 * 2 + 2 & (v5 | v4) + (v7 ^ -0x1 * v4 + 0xfffffffffffffffe) - (v7 & v6) * 2 + 1) * 2;
    v12 = (-v11 | 1) + v11 + (~v11 + v11 * 2 | 1);
    v13 = v12 + 1;
    v14 = (v13 ^ (39406 | ~v12)) + (v13 & (39406 | ~v12)) * 2;
    v0 = (v12 ^ 26130) + (v13 + (26130 | ~v12)) * 2 - 1;
    v1 = (v14 ^ (v12 | 39406) + 1) + (v14 & (v12 | 39406) + 1) * 2 - 1;
    v15 = v0;
    v16 = v1;
    v17 = (v16 + v15 ^ -(v16 | v15)) + (v16 + v15 & -(v16 | v15)) * 2;
    v18 = v15 - v16 + (v16 & v15) + (v16 & ~v15) * 2;
    g_f12130 = ((unsigned short)v18 + (unsigned short)v17 + ((unsigned short)v18 | (unsigned short)~v17) + ((unsigned short)v17 & (unsigned short)~v18) + 1 | (unsigned short)v3 * 3 + (unsigned short)~(unsigned int)v3 * 4 + 3) + (unsigned short)v3 + 1;
    v19 = v1;
    v20 = v0;
    v21 = v19 + 1;
    v22 = (v20 | ~v19) + v21 + (v20 ^ v19) + ~((v19 | ~v20) + v20);
    v23 = ((v21 + ~v19 * 2 & v20) + v19 ^ (v20 | v19) - (v20 + v19)) + ((v21 + ~v19 * 2 & v20) + v19 & (v20 | v19) - (v20 + v19)) * 2;
    v24 = v23 + (0xffffffffffffffff ^ v23 * 2) + (v23 & v22) + (v23 + (0xffffffffffffffff ^ v23 * 2) & v22);
    v25 = ~((v24 * 2 & 4) + (v24 ^ 2)) + ((v24 * 2 & 4) + (v24 ^ 2)) * 2;
    v0 = v25 + (v25 * 2 & 12) + (v25 * 2 & 12 ^ 12) - 7;
    v1 = v25 + 11;
    v26 = v3 >> (((char)v1 + (char)~(v1 | v0) ^ (char)v0 + 1) + ((char)v1 | (char)v0) + ((char)v1 + (char)~(v1 | v0) & (char)v0 + 1) * 2 & 63);
    v27 = v1;
    v28 = v0;
    v29 = v28 | v27;
    v30 = (v27 ^ -v28) + (v29 & -v27) * 4 + (v27 + (-v28 | ~v27) + (v29 ^ -v27)) * 2;
    v31 = (v29 - 1 ^ v28 + v27) - (v28 + v27 & -v29) * 2 + v29;
    v32 = v30 + 3;
    v33 = v32 + ~(v30 + 2) * 2;
    v34 = v32 + v31 + (v33 & ~v31) * 2;
    v35 = ((v33 | ~v31) & v32) * 4 + ((v33 | ~v31) ^ v32) * 2 | 1;
    v36 = ~((v35 ^ v34) + (v35 & v34) * 2) + ((v35 ^ v34) + (v35 & v34) * 2) * 2;
    v37 = v36 & 25106;
    v38 = v36 + v37 - (0xffffffffffff3bdb | v36 * 2) + 0xffffffffffff9ded;
    v0 = v36 + 40429;
    v1 = (v38 | ~v37) + v37 + (v38 | v37) + 1;
    v39 = (unsigned int)v1 + ~(unsigned int)v1 * 2;
    g_f12132 = ((unsigned short)v39 + (unsigned short)v0 + ((unsigned short)~v39 & (unsigned short)~(unsigned int)v0) * 2 + ((unsigned short)v0 + ((unsigned short)~v39 | (unsigned short)~(unsigned int)v0)) * 2 + 2 | (unsigned short)~v26) + (unsigned short)v26 + 1;
    v40 = v1;
    v41 = v0;
    v42 = v41 | v40;
    v43 = (v40 ^ -v41) + (v42 ^ -v40) * 2 + (v42 & -v40) * 4 + (v40 + (-v41 | ~v40)) * 2 + 2;
    v44 = v42 + (v41 | ~v40) + v40 + (~((v41 | ~v40) + v40) & ~v42) * 2 + (v42 & ~((v41 | ~v40) + v40)) * 2;
    v45 = v44 + 1;
    v46 = (v44 + 2 + ~v45 * 2 | 1) + (v44 + 2 & 1);
    v47 = v43 - v46 + (v46 & ~v43) * 2 - ((v45 - (v44 & v43) & v43 - v45) * 4 + (v45 - (v44 & v43) ^ v43 - v45) * 2 + ~((v45 - (v44 & v43) & v43 - v45) * 4 + (v45 - (v44 & v43) ^ v43 - v45) * 2) * 2 | 1);
    v48 = -v47;
    v49 = (v48 | 0xffffffffffffffee) + v47;
    v50 = (0xffffffffffffffef - v49 ^ v47 + 16) + (0xffffffffffffffef - v49 & v47 + 16) * 2;
    v0 = (0xfffffffffffffff1 - (v47 + (v48 | 0xfffffffffffffff0)) ^ v47 + 14) + (v47 - 1 | 15) + (0xfffffffffffffff1 - (v47 + (v48 | 0xfffffffffffffff0)) & v47 + 14) * 2;
    v1 = v50 + (v49 + 0x11 | ~v50) + (v50 | v49 + 0x11) + 1;
    v51 = (v1 + 1 ^ v0) + (v0 + (v1 + 1 | ~v0)) * 2 + 2;
    v52 = v3 >> ((char)~v51 + (char)v51 * 2 & 63);
    v53 = v1;
    v54 = v0;
    v55 = v53 - v54 + (v54 & ~v53) * 2 + ((v54 & ~v53) * 2 | ~(v53 - v54)) + (v53 - v54 & ~((v54 & ~v53) * 2)) + 1;
    v56 = v54 - v53 + (v54 + ~v54 * 2 + 1 & v53) * 2;
    v57 = v55 + ~v55 * 2 + 1;
    v58 = v56 + v55;
    v59 = v58 + (v55 & -v56) * 4 - (v55 & -v56) * 2 + (v57 + (-v56 | ~v57)) * 2 + 2;
    v0 = ((v59 | 1) + (v58 & 1) + 44242 | 1) + ((v59 | 1) + (v58 & 1) + 44242 & 1) - 2;
    v1 = v59 + (v59 + (21294 | ~v59)) * 2 + ((0xffffffff ^ (unsigned int)v59 * 2) & 42588) + 0xffffffffffffacd3;
    v60 = (0xffffffff ^ ~(unsigned int)v1 * 2) - v1;
    v61 = (v60 ^ (unsigned int)v0) + ((unsigned int)v0 + (v60 | ~(unsigned int)v0)) * 2 + 3;
    g_f12134 = v52 + (unsigned short)~v61 + (unsigned short)v61 * 2 + (v52 + (0xffff ^ v52 * 2) & (unsigned short)-(~v61 + v61 * 2));
    v62 = v1;
    v63 = v0;
    v64 = v63 + 1;
    v65 = ~v63 * 2;
    v66 = v65 + v62 + v64 + (0xfffffffffffffffe - (v65 + v62 + v64) | (v63 & ~v62) * 2) + (v65 + v62 + v64 + 1 | (v63 & ~v62) * 2);
    v67 = (v63 ^ 1) + ((v63 * 2 | v63 >> 63) & 2 & 3) + v65;
    v68 = v63 + v62 + (-v62 & ~v63) * 2 + (v64 + (-v62 | ~v63)) * 2;
    v69 = v68 + ((v67 + v62 & -(v67 | v62)) * 4 + (v67 + v62 ^ -(v67 | v62)) * 2 | ~v68) + ((v67 + v62 & -(v67 | v62)) * 4 + (v67 + v62 ^ -(v67 | v62)) * 2 | v68);
    v70 = ((v69 & v66 + 2) * 2 - (v66 + v69) - 3 ^ (0xffffffffffffffff ^ (v66 + 2 & ~v69) * 2) + (v66 + 2 & ~v69) * 4 + 2) + ((v69 & v66 + 2) * 2 - (v66 + v69) - 3 & (0xffffffffffffffff ^ (v66 + 2 & ~v69) * 2) + (v66 + 2 & ~v69) * 4 + 2) * 2;
    v0 = v70 + 46;
    v1 = v70;
    g_f12136 = v3 >> (((char)v1 | (char)~v0) + (char)v0 + 1 + ((char)v1 ^ (char)v0) + (((char)v0 + 1 + (char)~v0 * 2 | (char)v1) ^ (char)-(v0 + 1 + ~v0 * 2)) + (((char)v0 + 1 + (char)~v0 * 2 | (char)v1) & (char)-(v0 + 1 + ~v0 * 2)) * 2 & 63);
    v71 = g_f046c0 + 1;
    v72 = v71 + ~g_f046c0 * 2;
    v73 = ~(v72 | g_f12130) + g_f12130;
    v74 = -g_f12130;
    v75 = v71 + g_f12130 + (v74 & ~g_f046c0) * 2 + ((v74 | ~g_f046c0) + v71) * 2;
    v76 = (v73 & v72 + 1) * 4 + (v73 ^ v72 + 1) * 2;
    g_f046c0 = (unsigned short)v76 + (unsigned short)v75 * 2 + ((unsigned short)v76 | (unsigned short)-v75) + ((unsigned short)-v75 | (unsigned short)~v76);
    g_f046c2 = g_f046c2 - g_f12132 + (g_f046c2 + (0xffff ^ g_f046c2 * 2) & g_f12132) * 2;
    g_f046c4 = g_f12134 ^ g_f046c4;
    v77 = g_f12136 | g_f046c6;
    v78 = -g_f046c6;
    v79 = g_f046c6 - g_f12136;
    g_f046c6 = (unsigned short)v79 + ((v77 & v78) * 4 + (v77 ^ v78) * 2 | (unsigned short)~v79) + ((v77 & v78) * 4 + (v77 ^ v78) * 2 | (unsigned short)v79) + 1;
    v80 = v3 + ~g_f046c8;
    v81 = -(v3 | ~g_f046c8);
    v82 = (g_f046c8 ^ -v3) + (g_f046c8 - (v3 + (g_f046c8 | -v3))) * 2;
    v83 = (v80 & v81) * 4 + (v80 ^ v81) * 2 | 1;
    g_f046c8 = (v83 ^ v82) + (v83 & v82) * 2 - 1;
    return v76 | -v75;
}

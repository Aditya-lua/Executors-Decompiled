/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x932e34..0x933744 (2320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_932e34_0 {
    char field_0;
} st_932e34_0;

extern unsigned short g_f04ab0;
extern unsigned short g_f04ab2;
extern unsigned short g_f04ab4;
extern unsigned short g_f04ab6;
extern unsigned long long g_f04ab8;
extern unsigned short g_f126bc;
extern unsigned short g_f126be;
extern unsigned short g_f126c0;
extern unsigned short g_f126c2;
extern unsigned long g_fffffffffffffff0;

unsigned long long sub_932e34(void)
{
    unsigned long long v3;  // x8
    st_932e34_0 *v4;  // x11
    unsigned long long v13;  // x11
    unsigned short v14;  // x11
    unsigned long long v15;  // x14
    unsigned long v16;  // x15
    unsigned long long v17;  // x17
    unsigned long long v18;  // x1
    unsigned long long v19;  // x16
    unsigned long long v20;  // x14
    unsigned long long v21;  // x14
    unsigned long long v22;  // x14
    st_932e34_0 **v5;  // x13
    unsigned long long v23;  // x15
    unsigned long long v24;  // x16
    unsigned long long v25;  // x17
    unsigned long long v26;  // x0
    unsigned long long v27;  // x13
    unsigned int v28;  // w13
    unsigned long v29;  // x14
    unsigned long v30;  // x15
    unsigned long long v31;  // x16
    unsigned long long v32;  // x16
    unsigned long long v6;  // x14
    unsigned long long v33;  // x14
    unsigned long long v34;  // x16
    unsigned long v35;  // x15
    unsigned int v36;  // w14
    unsigned long long v37;  // x14
    unsigned long v38;  // x16
    unsigned long v39;  // x17
    unsigned long long v40;  // x0
    unsigned long long v41;  // x0
    unsigned long long v42;  // x17
    unsigned long long v7;  // x15
    unsigned long long v43;  // x15
    unsigned long long v44;  // x16
    unsigned long long v45;  // x2
    unsigned long long v46;  // x15
    unsigned long long v47;  // x17
    unsigned long long v48;  // x16
    unsigned long long v49;  // x15
    unsigned long long v50;  // x16
    char v51;  // x15
    unsigned long v52;  // x16
    unsigned long long v8;  // x16
    char v53;  // x17
    char v54;  // x15
    unsigned int v55;  // w15
    unsigned long v56;  // x16
    unsigned long v57;  // x17
    unsigned long long v58;  // x14
    unsigned long long v59;  // x16
    unsigned long long v60;  // x16
    unsigned long long v62;  // x14
    unsigned long v9;  // x15
    unsigned long long v63;  // x16
    unsigned int v64;  // w14
    unsigned int v65;  // w15
    unsigned int v66;  // w12
    unsigned long long v67;  // x14
    unsigned long v68;  // x16
    unsigned long long v69;  // x17
    unsigned long long v70;  // x17
    unsigned long long v71;  // x14
    unsigned long long v72;  // x14
    unsigned long long v10;  // x16
    unsigned long long v73;  // x14
    unsigned long long v74;  // x15
    unsigned int v75;  // w16
    unsigned int v76;  // w14
    unsigned int v77;  // w11
    unsigned short v78;  // x11
    unsigned int v79;  // w14
    unsigned int v80;  // w11
    unsigned int v81;  // w13
    unsigned long long v11;  // x11
    unsigned int v83;  // w13
    unsigned int v84;  // w14
    unsigned int v85;  // w13
    unsigned long long v86;  // x8
    unsigned long long v87;  // x9
    unsigned long long v12;  // x13
    st_932e34_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_932e34_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v3 = 0x9430b9e1158b00 + ((0xff6bcf41e5b40ef0 + ~0xff6bcf41e5b40ef0 * 2 + 1 & 0x7fb5e7a0f) + 0xff6bcf4004a004f0) * 2;
    v4 = v1;
    v5 = v0;
    v6 = &v4[v5 | ~v4];
    v7 = (v5 ^ v4) + v6;
    v8 = -(v5 & v4);
    v9 = v7 + 1 ^ v8;
    v10 = v9 + (v7 + (0xfffffffffffffffe - v7 | v8)) * 2 + 4;
    v11 = v5 - v4;
    v12 = (v11 | ((char *)v5 - v6 & v4 + ~v5) * 4 + ((char *)v5 - v6 ^ v4 + ~v5) * 2) + (((char *)v5 - v6 & v4 + ~v5) * 4 + ((char *)v5 - v6 ^ v4 + ~v5) * 2 & v11);
    v13 = (v11 - v9 & 1) - (v10 + ~v12 | 1) + (v10 - v12) * 2;
    v0 = (v13 - 1 & 0xfffffffffffffffe) + (v13 - 1 | 0xfffffffffffffffe) + 41725;
    v1 = v13 + 23811;
    v14 = (unsigned short)v1 + v0 | (unsigned short)v3 + (0xffff ^ (unsigned short)v3 * 2);
    g_f126bc = (v14 ^ (unsigned short)v3 + 1) + (v14 & (unsigned short)v3 + 1) * 2;
    v15 = v1;
    v16 = v0;
    v17 = v16 - v15;
    v18 = -(v17 + (v15 | ~v16));
    v19 = (v16 + ~v15 & v18) * 4 + (v16 + ~v15 ^ v18) * 2 + (v15 + v16 + ~v16 * 2) * 2 + ((v16 + ~v15 & v18) * 4 + (v16 + ~v15 ^ v18) * 2 | 0xfffffffffffffffd - (v15 + v16 + ~v16 * 2)) + (0xfffffffffffffffd - (v15 + v16 + ~v16 * 2) | ~((v16 + ~v15 & v18) * 4 + (v16 + ~v15 ^ v18) * 2)) + 6;
    v20 = v17 + ((v16 | v15) ^ -v16) * 2 + ((v16 | v15) & -v16) * 4;
    v21 = v20 + ~v20 * 2 + 1;
    v22 = v19 + (v21 | ~v19) + (v19 | v21);
    v23 = v22 + 3;
    v24 = v22 + 2;
    v25 = 0xfffffffffffffffd - v22;
    v26 = v23 * 2;
    v27 = (v25 | 6) + v26 + ((0xffffffff ^ (unsigned int)v24 * 2) & 12) - 7;
    v0 = (v23 - v26 | 6) + v24 + (v27 | (v23 - v26 | 6) + v23) + (0xfffffffffffffffe - ((v23 - v26 | 6) + v24) | v27) + 2;
    v1 = v23 + (v25 | (char *)&g_fffffffffffffff0 + 5) + (v22 + 12 ^ (char *)&g_fffffffffffffff0 - v23 - (v25 | (char *)&g_fffffffffffffff0 + 5) + 6) + (v22 + 12 & (char *)&g_fffffffffffffff0 - v23 - (v25 | (char *)&g_fffffffffffffff0 + 5) + 6) * 2 + 10;
    v28 = v3 >> ((char)(v0 + (v1 ^ 0xfffffffffffffffe) - ~v1 * 2 - ((v1 * 2 | v1 >> 63) & 2 & 3)) & 63);
    v29 = v1;
    v30 = v0;
    v31 = (v29 ^ -v30) + (v29 + (-v30 | ~v29)) * 2 + 2;
    v32 = ((v29 - v30 - (v29 | ~v30) & v30 + ~v29) * 4 + (v29 - v30 - (v29 | ~v30) ^ v30 + ~v29) * 2 | ~v31) + (v29 - v30 - (v29 | ~v30) & v30 + ~v29) * 4 + (v29 - v30 - (v29 | ~v30) ^ v30 + ~v29) * 2 + v31 * 2 - ((v29 - v30 - (v29 | ~v30) & v30 + ~v29) * 4 + (v29 - v30 - (v29 | ~v30) ^ v30 + ~v29) * 2 & v31) + 1;
    v33 = (~((v32 ^ -(v30 ^ v29)) + (v32 & -(v30 ^ v29)) * 2) + ((v32 ^ -(v30 ^ v29)) + (v32 & -(v30 ^ v29)) * 2) * 2 ^ 1) - (v32 ^ -(v30 ^ v29) | 0xfffffffffffffffe) + (v32 ^ -(v30 ^ v29)) + (v32 & -(v30 ^ v29)) * 2 - (~((v32 ^ -(v30 ^ v29)) + (v32 & -(v30 ^ v29)) * 2) + ((v32 ^ -(v30 ^ v29)) + (v32 & -(v30 ^ v29)) * 2) * 2 | 1);
    v34 = ((-v33 | 7361) ^ v33) + ((-v33 | 7361) & v33) * 2;
    v35 = (unsigned int)v33 - 1 & 7361;
    v0 = v33 + 7361 + ~v35 + (v33 + 7361 + ~v35 | ~v34) + (v35 - (v33 + 7361) | ~v34) + v34 * 2 + 2;
    v1 = v33 + 58173;
    v36 = ((unsigned int)v1 + 1 ^ v0 | 0xfffffffe) + (((unsigned int)v1 + 1 ^ v0) + ((unsigned int)v1 + 1 & v0) * 2 | 1);
    g_f126be = (unsigned short)v36 + (unsigned short)v28 + ((unsigned short)v36 | (unsigned short)v28) + ((unsigned short)((v36 & v28) - (v36 + v28 | -(v36 | v28))) + ((unsigned short)-(v36 | v28) & (unsigned short)~(v36 + v28))) * 2;
    v37 = v1;
    v38 = v0;
    v39 = ~v38;
    v40 = (v38 + v39 * 2 + 1 & v37) + v38;
    v41 = v40 + 1 + (v38 & v37) + (-(v38 & v37) & ~v40) * 2 + (v40 + 1 + (-(v38 & v37) | ~v40)) * 2;
    v42 = (v38 ^ 1) + v38 * 2 + v39 * 4 + (v38 * 2 & 2) + 2;
    v43 = ((1 | (v42 & v37) * 2) ^ (v38 ^ -v37) + (v38 - v37 - (v38 | -v37)) * 2) + ((1 | (v42 & v37) * 2) & (v38 ^ -v37) + (v38 - v37 - (v38 | -v37)) * 2) * 2;
    v44 = ~v43 + v43 * 2;
    v45 = v44 - 1;
    v46 = (v41 - v43 + (v45 | -v41) + 1 ^ -v41 - (-v44 | -v41)) + (v41 - v43 + (v45 | -v41) + 1 & -v41 - (-v44 | -v41)) * 2;
    v47 = v41 - v41 * 2;
    v48 = v47 - v44 + (v45 | ~v47) + 1;
    v49 = v46 + ((v48 & -v47) * 4 + (v48 ^ -v47) * 2 | ~v46) + (v46 | (v48 & -v47) * 4 + (v48 ^ -v47) * 2) + 1;
    v50 = v49 * 2;
    v0 = v49 + (~(unsigned int)v50 & 46) + (v49 + (23 | ~v49)) * 2 - 22;
    v1 = (v49 ^ 11) + (v50 & 22) - 1;
    v51 = v0;
    v52 = v1;
    v53 = ((char)(v52 - v51) + (v51 | (char)~v52) ^ v51 + 1) + ((char)(v52 - v51) + (v51 | (char)~v52) & v51 + 1) * 2;
    v54 = (char)v52 + 1 + ((char)v52 + 1 + (char)~v52 * 2 & v51);
    v55 = v3 >> ((char)((v53 ^ v54) + (v53 & v54) * 2 - 1) & 63);
    v56 = v1;
    v57 = v0;
    v58 = (v57 + v56 + (-v57 & ~v56) * 2 + (v56 - v57 - (v56 | -v57)) * 2 ^ (1 | (v57 - v56 + (v56 & ~v57)) * 2)) + (v57 + v56 + (-v57 & ~v56) * 2 + (v56 - v57 - (v56 | -v57)) * 2 & (1 | (v57 - v56 + (v56 & ~v57)) * 2)) * 2;
    v59 = v57 & v56;
    v60 = v59 + v56 + 1 + (v56 + 1 + ~v56 * 2 & v57);
    v62 = ((((v60 + ~v59 * 2 & -v58) + ~(v60 + ~v59 * 2) & v58) * 4 + ((v60 + ~v59 * 2 & -v58) + ~(v60 + ~v59 * 2) ^ v58) * 2 | 1) ^ ((v58 - 1 | (0xfffffffffffffffe - (v60 + ~v59 * 2) | 1) + (v60 & 1)) ^ -(v58 - 1 & (0xfffffffffffffffe - (v60 + ~v59 * 2) | 1) + (v60 & 1))) + ((v58 - 1 | (0xfffffffffffffffe - (v60 + ~v59 * 2) | 1) + (v60 & 1)) & -(v58 - 1 & (0xfffffffffffffffe - (v60 + ~v59 * 2) | 1) + (v60 & 1))) * 2) + ((((v60 + ~v59 * 2 & -v58) + ~(v60 + ~v59 * 2) & v58) * 4 + ((v60 + ~v59 * 2 & -v58) + ~(v60 + ~v59 * 2) ^ v58) * 2 | 1) & ((v58 - 1 | (0xfffffffffffffffe - (v60 + ~v59 * 2) | 1) + (v60 & 1)) ^ -(v58 - 1 & (0xfffffffffffffffe - (v60 + ~v59 * 2) | 1) + (v60 & 1))) + ((v58 - 1 | (0xfffffffffffffffe - (v60 + ~v59 * 2) | 1) + (v60 & 1)) & -(v58 - 1 & (0xfffffffffffffffe - (v60 + ~v59 * 2) | 1) + (v60 & 1))) * 2) * 2;
    v63 = ~v62 + v62 * 2;
    v0 = v63 + (-v62 | 52916) + (0xfffffffffffffffe - (v63 + (-v62 | 52916)) | v63 + (-v62 & 52916)) + (v63 + (-v62 | 52916) + 1 | v63 + (-v62 & 52916)) + 2;
    v1 = v63 + 12619;
    v64 = v55 + ~v55 * 2;
    v65 = v64 + 1;
    v66 = v65 | ((unsigned int)((v0 & 0xffffffff) - ((unsigned int)v1 + 1)) + (((unsigned int)v1 + 1 & v0) + ((unsigned int)v1 + 1 & ~v0)) * 2 | 1) + ((unsigned int)((v0 & 0xffffffff) - ((unsigned int)v1 + 1)) | 0xfffffffe);
    g_f126c0 = (unsigned short)v66 + (unsigned short)v65 + ((unsigned short)(v66 - v65 - (v66 | ~v64)) + ((unsigned short)~v66 & (unsigned short)~v64)) * 2;
    v67 = v1;
    v68 = v0;
    v69 = v67 + 1 + v68 + (v67 + 1 + ~v67 * 2 | ~v68);
    v70 = (v68 & v67) + v69 + (-(v68 & v67) & ~v69) * 2 + (v69 - (v68 & v67) - (v69 | -(v68 & v67))) * 2;
    v71 = (v68 ^ -v67) + (v68 - v67 - (v68 | -v67)) * 2;
    v72 = v71 + ((v67 & ~v68) * 2 | ~v71) + (v71 | (v67 & ~v68) * 2) + 1;
    v73 = (v72 | ~v70) + v70 * 2 + v72 + (0xffffffffffffffff ^ v72 * 2) + (v72 + (0xffffffffffffffff ^ v72 * 2) | ~v70);
    v74 = v73 + 3;
    v0 = (v74 | 1) + (v74 & 1) + 31;
    v1 = v73 + (0x22 & v74 * 2) + (0x22 & v74 * 2 ^ 0x22) - 15;
    g_f126c2 = v3 >> ((char)v1 + v0 & 63);
    v75 = g_f04ab0 | g_f126bc;
    v76 = g_f04ab0 + ~g_f04ab0 * 2;
    v77 = v76 + 1 | g_f126bc;
    v78 = -((v76 ^ ~v77) + (v77 & ~v76) * 2);
    g_f04ab0 = (v78 ^ (unsigned short)v75) + ((unsigned short)v75 + (v78 | (unsigned short)~v75)) * 2 + 2;
    v79 = g_f126be | g_f04ab2;
    v80 = g_f04ab2 + 1;
    v81 = v80 + ~g_f04ab2 * 2 | g_f126be;
    g_f04ab2 = (unsigned short)v79 + ((unsigned short)v81 ^ (unsigned short)v80) + ((unsigned short)v81 & (unsigned short)v80) * 2 + ((unsigned short)(v79 - ((v81 ^ v80) + (v81 & v80) * 2) - (v79 | -((v81 ^ v80) + (v81 & v80) * 2) & 0xffff)) + ((unsigned short)-((v81 ^ v80) + (v81 & v80) * 2) & (unsigned short)~v79)) * 2;
    g_f04ab4 = g_f04ab4 - g_f126c0 + (g_f126c0 + ~g_f04ab4 + (g_f04ab4 & ~g_f126c0)) * 2 + 2;
    v83 = (g_f04ab6 ^ 1) + ~g_f04ab6 * 2 + (__ROL__(g_f04ab6, 1) & 2 & 3);
    v84 = v83 + g_f126c2;
    v85 = -(v83 | g_f126c2);
    g_f04ab6 = g_f04ab6 - g_f126c2 + (unsigned short)~((v84 & v85) * 4 + (v84 ^ v85) * 2) + (((unsigned short)v84 & (unsigned short)v85) * 4 + ((unsigned short)v84 ^ (unsigned short)v85) * 2) * 2 + 1;
    v86 = g_f04ab8 + v3 + (-v3 & ~g_f04ab8) * 2 + (g_f04ab8 - v3 - (g_f04ab8 | -v3)) * 2;
    v87 = (v3 - g_f04ab8 + (g_f04ab8 & ~v3)) * 2;
    g_f04ab8 = (v86 | v87) + (v86 & v87);
    return v74 & 1;
}

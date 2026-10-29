/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4df7d4..0x4e00cc (2296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4df7d4_0 {
    char field_0;
} st_4df7d4_0;

extern unsigned short g_f04480;
extern unsigned short g_f04482;
extern unsigned short g_f04484;
extern unsigned short g_f04486;
extern unsigned long long g_f04488;
extern unsigned short g_f12010;
extern unsigned short g_f12012;
extern unsigned short g_f12014;
extern unsigned short g_f12016;

unsigned long long sub_4df7d4(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x11
    unsigned long long v13;  // x10
    unsigned int v14;  // w10
    unsigned int v15;  // w11
    unsigned short v16;  // x12
    unsigned short v17;  // x10
    unsigned long long v18;  // x11
    unsigned long long v19;  // x12
    unsigned long long v20;  // x13
    unsigned long long v21;  // x13
    st_4df7d4_0 *v4;  // x10
    unsigned long long v22;  // x0
    unsigned long long v23;  // x14
    unsigned long long v24;  // x12
    unsigned long long v25;  // x15
    unsigned long long v26;  // x12
    unsigned long long v27;  // x12
    unsigned int v28;  // w12
    unsigned long long v29;  // x14
    unsigned long long v30;  // x15
    unsigned long long v31;  // x16
    st_4df7d4_0 **v5;  // x11
    unsigned long v32;  // x14
    unsigned long long v33;  // x14
    unsigned long long v34;  // x15
    unsigned long long v35;  // x14
    unsigned long long v36;  // x16
    unsigned long v37;  // x17
    unsigned short v38;  // x14
    unsigned int v39;  // w15
    unsigned short v40;  // x14
    unsigned short v41;  // x12
    st_4df7d4_0 **v6;  // x13
    unsigned long v42;  // x14
    unsigned long long v43;  // x15
    unsigned long long v44;  // x17
    unsigned long long v45;  // x0
    unsigned long long v46;  // x1
    unsigned long long v47;  // x16
    unsigned long long v48;  // x13
    unsigned long long v49;  // x13
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v7;  // x12
    unsigned long long v52;  // x13
    unsigned long long v53;  // x13
    unsigned long long v54;  // x15
    unsigned long long v55;  // x16
    unsigned long long v56;  // x13
    unsigned int v57;  // w13
    unsigned long v58;  // x14
    unsigned long long v59;  // x15
    unsigned long long v60;  // x16
    unsigned long long v61;  // x16
    unsigned long long v8;  // x11
    unsigned long long v62;  // x4
    unsigned long long v63;  // x14
    unsigned long long v64;  // x14
    unsigned long long v65;  // x14
    unsigned long long v66;  // x15
    unsigned long long v67;  // x17
    unsigned int v68;  // w14
    unsigned int v69;  // w15
    unsigned int v70;  // w16
    unsigned int v71;  // w15
    unsigned long long v9;  // x14
    unsigned int v72;  // w14
    unsigned int v73;  // w14
    unsigned int v74;  // w15
    unsigned int v75;  // w16
    unsigned long long v76;  // x14
    unsigned long v77;  // x15
    unsigned long long v78;  // x16
    unsigned long long v79;  // x16
    unsigned long long v80;  // x14
    unsigned long long v81;  // x14
    unsigned long v10;  // x16
    unsigned long long v82;  // x15
    unsigned long long v83;  // x16
    unsigned long long v84;  // x1
    unsigned long long v85;  // x15
    unsigned short v86;  // x15
    unsigned short v87;  // x16
    unsigned int v88;  // w12
    unsigned int v89;  // w10
    unsigned int v90;  // w10
    unsigned long long v91;  // x11
    unsigned long long v11;  // x10
    unsigned long long v92;  // x10
    unsigned long long v93;  // x8
    st_4df7d4_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4df7d4_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04480 + ~(~&g_f04480 + &g_f04480));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (char *)v5 + 1;
    v7 = v6 + v4 + ((char *)v6 + 0x2 * ~v5 | ~v4);
    v8 = v4 & ~v5;
    v9 = v8 - (char *)v4;
    v10 = (v7 + (v9 | ~v7)) * 2 + 2;
    v11 = (v6 - v4 + v8 * 2 - 2 - (v10 + (v7 ^ v9)) + (v10 + (v7 ^ v9) | ~(v6 - v4 + v8 * 2 - 2)) + 1 ^ (v10 + (v7 ^ v9) | ~(v6 - v4 + v8 * 2 - 2))) + (v10 + (v7 ^ v9) + ~(v6 - v4 + v8 * 2 - 2) + ((v7 ^ ~v9) - v10 & v6 - v4 + v8 * 2 - 2) + (v6 - v4 + v8 * 2 - 2 - (v10 + (v7 ^ v9)) + (v10 + (v7 ^ v9) | ~(v6 - v4 + v8 * 2 - 2)) + 1 & (v10 + (v7 ^ v9) | ~(v6 - v4 + v8 * 2 - 2)))) * 2;
    v12 = v11 + 2;
    v13 = v11 + 3;
    v0 = v13 + (v12 ^ 0xffffffffffff7981) + (v12 | 34430) + (34430 & ~v12);
    v1 = ((v13 + ~v12 * 2 | 31105) + v13 | v13 + ~v12 * 2 + v13 + (31105 | ~(v13 + ~v12 * 2))) + ((v13 + ~v12 * 2 | 31105) + v13 & v13 + ~v12 * 2 + v13 + (31105 | ~(v13 + ~v12 * 2)));
    v14 = v0;
    v15 = v1;
    v16 = ((unsigned short)v14 + 1 + (unsigned short)~v14 * 2 | (unsigned short)v15) + (unsigned short)v14 + 1;
    v17 = (unsigned short)v15 + 1 + ((unsigned short)v15 + 1 + (unsigned short)~v15 * 2 & (unsigned short)v14);
    g_f12010 = (unsigned short)((v17 ^ v16) + (v17 & v16) * 2 - 1) & (unsigned short)v3;
    v18 = v1;
    v19 = v0;
    v20 = v18 + ~v18 * 2 + 1;
    v21 = (v18 - v19 | (v20 + v19 & -(v20 | v19)) * 4 + (v20 + v19 ^ -(v20 | v19)) * 2) + ((v20 + v19 & -(v20 | v19)) * 4 + (v20 + v19 ^ -(v20 | v19)) * 2 & v18 - v19);
    v22 = v19 + 1;
    v23 = v22 + ~v19 * 2 | v18;
    v24 = v19 - v18 + (v19 & v18) + (v18 & ~v19) * 2 + (v23 ^ 0xfffffffffffffffe - v19) - (v23 & v22) * 2;
    v25 = v24 - v21 + (v21 | ~v24) + 1;
    v26 = 1 | (v21 & ~v24) * 2;
    v27 = ((v25 ^ v21 - v24 + (v24 | ~v21)) + (v25 & v21 - v24 + (v24 | ~v21)) * 2 ^ v26) + ((v25 ^ v21 - v24 + (v24 | ~v21)) + (v25 & v21 - v24 + (v24 | ~v21)) * 2 & v26) * 2;
    v0 = v27 + 7;
    v1 = (v27 - 1 ^ 9) + ((-v27 | 9) + v27) * 2 - 1;
    v28 = v3 >> ((char)~((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) + (((char)v1 + 1 ^ (char)v0) + ((char)v1 + 1 & (char)v0) * 2) * 2 & 63);
    v29 = v1;
    v30 = v0;
    v31 = v30 + ~v29 + (v29 & ~v30) + (v30 + ~v30 * 2 + 1 & v29);
    v32 = (v30 - v29 | (v30 + (0xffffffffffffffff ^ v30 * 2) + v29 & -(v30 + (0xffffffffffffffff ^ v30 * 2) | v29)) * 4 + (v30 + (0xffffffffffffffff ^ v30 * 2) + v29 ^ -(v30 + (0xffffffffffffffff ^ v30 * 2) | v29)) * 2) + ((v30 + (0xffffffffffffffff ^ v30 * 2) + v29 & -(v30 + (0xffffffffffffffff ^ v30 * 2) | v29)) * 4 + (v30 + (0xffffffffffffffff ^ v30 * 2) + v29 ^ -(v30 + (0xffffffffffffffff ^ v30 * 2) | v29)) * 2 & v30 - v29) + (0xffffffffffffffff ^ ((v30 - v29 | (v30 + (0xffffffffffffffff ^ v30 * 2) + v29 & -(v30 + (0xffffffffffffffff ^ v30 * 2) | v29)) * 4 + (v30 + (0xffffffffffffffff ^ v30 * 2) + v29 ^ -(v30 + (0xffffffffffffffff ^ v30 * 2) | v29)) * 2) + ((v30 + (0xffffffffffffffff ^ v30 * 2) + v29 & -(v30 + (0xffffffffffffffff ^ v30 * 2) | v29)) * 4 + (v30 + (0xffffffffffffffff ^ v30 * 2) + v29 ^ -(v30 + (0xffffffffffffffff ^ v30 * 2) | v29)) * 2 & v30 - v29)) * 2);
    v33 = v31 + (v32 | 0xfffffffffffffffe - v31) + (v32 | v31 + 1);
    v34 = v33 + 3;
    v35 = ((0xfffffffffffffffc - v33 | 10510) ^ v33 + 4) + ((0xfffffffffffffffc - v33 | 10510) & v33 + 4) * 2;
    v36 = v34 * 2;
    v37 = v33 + (v34 & 10510) + (~(unsigned int)v36 & 21020);
    v0 = v37 + v35 + (v35 & 10506 - v37) + (v37 + 0xffffffffffffd6f5 | ~v35) + 0xffffffffffffd6f6;
    v1 = (v34 | 0xfffffffffffffffe) + ((v36 & 110052) + (v34 ^ 55026) & 0xfffffffffffffffe) + 1;
    v38 = (unsigned short)v0 + ((unsigned short)v1 | (unsigned short)~(unsigned int)v0) + ((unsigned short)v1 ^ (unsigned short)v0) + ((unsigned short)v1 & (unsigned short)v0) + 1;
    v39 = ~v28;
    v40 = (unsigned short)v28 + (unsigned short)v39 * 2 + (v38 | (unsigned short)~(v28 + v39 * 2 + 1)) + ((unsigned short)v28 + (unsigned short)v39 * 2 + 1 ^ v38) + 2;
    v41 = (unsigned short)((v28 ^ 0xfffffffe) - (v28 * 2 + v39 * 4)) + ((unsigned short)~(v28 * 2) | 0xfffd);
    g_f12012 = (v40 ^ v41) + (v40 & v41) * 2;
    v42 = v1;
    v43 = v0;
    v44 = v42 | v43;
    v45 = (v42 + ~v42 * 2 + 1 | v43) + v42;
    v46 = v44 + ~v45;
    v47 = v43 * 3 + ~v43 * 4 + 3 & v42;
    v48 = (0xffffffffffffffff ^ v47 * 2) + v47 * 4 + 2;
    v49 = ~((v48 ^ v43 - v42) + (v48 & v43 - v42) * 2) + ((v48 ^ v43 - v42) + (v48 & v43 - v42) * 2) * 2;
    v50 = -v49;
    v51 = v45 - v44;
    v52 = (v49 ^ v46) + (v44 - v45 + v51 * 2 - (v49 + (v44 - v45 + v51 * 2 | v50)) + (v49 & v46)) * 2;
    v53 = (v52 & 0xfffffffffffffffd - ((v51 | v50) + v46) * 2) + ((v51 | v50) + v46) * 2 + 2 + (v52 & ((v51 | v50) + v46) * 2 + 2);
    v54 = ~v53;
    v55 = v53 + 1;
    v56 = (v55 + v54 * 2 | 15) + v53;
    v0 = (v53 ^ 18) + (36 & v53 * 2) - 1;
    v1 = v56 + (0xfffffffffffffffe - v56 | (v54 | 0xfffffffffffffff0) + v55 + 15) + (v56 + 1 | (v54 | 0xfffffffffffffff0) + v55 + 15) + 2;
    v57 = v3 >> (((char)v1 | (char)v0) + ((char)v1 + (char)v0 ^ (char)-(v1 | v0)) + ((char)v1 + (char)v0 & (char)-(v1 | v0)) * 2 & 63);
    v58 = v1;
    v59 = v0;
    v60 = ((v58 ^ 1) + ~v58 * 2 + ((v58 * 2 | v58 >> 63) & 2 & 3) & v59) * 2;
    v61 = v58 - v59 + (v60 | ~(v58 - v59)) + (v60 | v58 - v59);
    v62 = v59 + 1;
    v63 = v62 + ~v59 * 2 | v58;
    v64 = v59 - v58 + (v59 & v58) + (v58 & ~v59) * 2 + (v63 ^ 0xfffffffffffffffe - v59) - (v63 & v62) * 2;
    v65 = v61 + 2 + v64 + ((v61 + 1 & v64) + v61 + 1 - (v61 + 2 + v64) + (v61 + 2 + ~(v61 + 1) * 2 | ~v64)) * 2;
    v66 = v65 + 2;
    v67 = ((35942 | ~v66) ^ v65 + 3) + ((35942 | ~v66) & v65 + 3) * 2;
    v0 = v67 + (v66 | 35942 | ~v67) + (v67 | v66 | 35942) + 1;
    v1 = v65 + 29595;
    v68 = v0;
    v69 = v1;
    v70 = v69 + v68;
    v71 = v69 + ~v69 * 2 + 1;
    v72 = v70 + v71 + (v68 + ~v68 * 2 + 1 & ~v71) + 2;
    v73 = (v72 ^ (v70 ^ -(v68 | v69)) + (v70 & -(v68 | v69)) * 2) + (v72 & (v70 ^ -(v68 | v69)) + (v70 & -(v68 | v69)) * 2) * 2;
    v74 = ~v57 * 2;
    v75 = v74 + (v57 ^ 1) + (__ROL__(v57, 1) & 2 & 3);
    g_f12014 = (unsigned short)(v75 - (v74 + v57)) + ((unsigned short)~v73 + (unsigned short)v73 * 2 | (unsigned short)~v75) + ((unsigned short)~v73 + (unsigned short)v73 * 2 ^ (unsigned short)v75);
    v76 = v1;
    v77 = v0;
    v78 = v76 + ~v76 * 2 + 1;
    v79 = (((v78 + v77 & -(v78 | v77)) * 4 + (v78 + v77 ^ -(v78 | v77)) * 2 | 1) ^ v76 - v77) + (((v78 + v77 & -(v78 | v77)) * 4 + (v78 + v77 ^ -(v78 | v77)) * 2 | 1) & v76 - v77) * 2;
    v80 = ((v77 | v76) ^ -(v77 & v76)) + ((v77 | v76) + (-(v77 & v76) | ~(v77 | v76))) * 2 + 2;
    v81 = (v80 ^ 1) - v80 * 2 + (v80 * 2 & 2) + ~v79 - 2;
    v82 = v81 + v79 * 2;
    v83 = v82 + 1;
    v84 = 38 & v83 * 2;
    v0 = (v82 + v84 + (v84 ^ 38) - 18 | 1) + (v81 | 0xfffffffffffffffe);
    v1 = v82 + v83 + (0xfffffffffffffffe - v82 | 30) + (~(unsigned int)v83 | 0xffffffffffffffe1) + 33;
    v85 = v0 + ~v0 * 2;
    g_f12016 = v3 >> (((char)~v1 & (char)~v0) + ((char)v0 + (char)~v0 * 2 ^ (char)~(v85 + 1 | v1)) + (((char)v1 | (char)v0) + (((char)v85 + 1 | (char)v1) & (char)~v85)) * 2 + 1 & 63);
    v86 = g_f12010 | g_f04480;
    v87 = -g_f04480;
    g_f04480 = g_f04480 - g_f12010 + (v86 ^ v87) * 2 + (v86 & v87) * 4;
    v88 = g_f12012 | g_f04482;
    v89 = g_f12012 + g_f04482;
    v90 = (v89 ^ -v88) + (v89 & -v88) * 2;
    g_f04482 = (unsigned short)v90 + (unsigned short)v88 + ((unsigned short)(v88 - v90 - (v88 | -v90 & 0xffff)) + ((unsigned short)-v90 & (unsigned short)~v88)) * 2;
    g_f04484 = g_f04484 - g_f12014 + (g_f12014 & ~g_f04484) * 2;
    g_f04486 = g_f12016 ^ g_f04486;
    v91 = g_f04488 | v3;
    v92 = g_f04488 + ~g_f04488 * 2;
    v93 = (v92 ^ ~(v92 + 1 | v3)) + ((v92 + 1 | v3) & ~v92) * 2;
    g_f04488 = v93 + v91 + (v91 - (v93 + (v91 | -v93)) + (-v93 & ~v91)) * 2;
    return v82 + v84 + (v84 ^ 38) - 18 | 1;
}

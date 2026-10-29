/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x415f34..0x416a30 (2812 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_415f34_0 {
    char field_0;
} st_415f34_0;

extern unsigned short g_f04580;
extern unsigned short g_f04582;
extern unsigned short g_f04584;
extern unsigned short g_f04586;
extern unsigned long long g_f04588;
extern unsigned short g_f12090;
extern unsigned short g_f12092;
extern unsigned short g_f12094;
extern unsigned short g_f12096;

int sub_415f34(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x12
    unsigned int v102;  // w8
    unsigned int v103;  // w12
    unsigned int v104;  // w10
    unsigned int v105;  // w10
    unsigned int v106;  // w9
    unsigned int v107;  // w10
    unsigned int v108;  // w8
    unsigned int v109;  // w8
    unsigned int v110;  // w8
    unsigned long long v13;  // x12
    unsigned long long v14;  // x12
    unsigned long long v15;  // x14
    unsigned long long v16;  // x12
    unsigned int v17;  // w12
    unsigned short v18;  // x12
    unsigned long v19;  // x14
    unsigned long long v20;  // x15
    unsigned long long v21;  // x16
    long long v4;  // x9
    unsigned long long v22;  // x0
    unsigned long long v23;  // x16
    unsigned long long v24;  // x16
    unsigned long long v25;  // x17
    unsigned long long v26;  // x1
    unsigned long long v27;  // x14
    unsigned long long v28;  // x15
    unsigned long v29;  // x1
    unsigned long long v30;  // x15
    unsigned long long v31;  // x16
    st_415f34_0 *v5;  // x11
    unsigned long long v32;  // x17
    unsigned long long v33;  // x16
    unsigned short v34;  // x16
    unsigned long v35;  // x17
    unsigned long long v36;  // x0
    unsigned long long v37;  // x1
    unsigned long long v38;  // x2
    unsigned long long v39;  // x1
    unsigned long long v40;  // x1
    unsigned long long v41;  // x3
    st_415f34_0 **v6;  // x12
    unsigned long long v42;  // x17
    unsigned long long v43;  // x13
    unsigned long v44;  // x13
    unsigned short v45;  // x13
    unsigned short v46;  // x13
    unsigned long v47;  // x16
    unsigned long v48;  // x17
    unsigned long long v49;  // x1
    unsigned long long v50;  // x0
    unsigned long long v51;  // x17
    unsigned long long v7;  // x14
    unsigned long long v52;  // x16
    unsigned long long v53;  // x14
    unsigned long long v54;  // x16
    unsigned long long v55;  // x2
    unsigned long long v56;  // x17
    unsigned long long v57;  // x14
    unsigned int v58;  // w14
    unsigned long long v59;  // x15
    unsigned long long v60;  // x16
    unsigned long long v61;  // x17
    st_415f34_0 **v8;  // x12
    unsigned long long v62;  // x17
    unsigned long long v63;  // x15
    unsigned long long v64;  // x16
    unsigned long long v65;  // x15
    unsigned long long v66;  // x15
    unsigned long long v67;  // x16
    unsigned long long v68;  // x2
    unsigned long long v69;  // x3
    unsigned long long v70;  // x0
    unsigned long long v71;  // x15
    unsigned long long v9;  // x13
    unsigned int v72;  // w16
    unsigned int v73;  // w15
    unsigned int v74;  // w0
    unsigned int v75;  // w16
    unsigned int v76;  // w15
    unsigned long v77;  // x15
    unsigned long long v78;  // x16
    unsigned long long v79;  // x17
    unsigned long long v80;  // x0
    unsigned long long v81;  // x11
    unsigned long long v10;  // x11
    unsigned long long v82;  // x11
    unsigned long long v83;  // x15
    unsigned long long v84;  // x15
    unsigned int v85;  // w13
    unsigned short v86;  // x11
    unsigned short v87;  // x13
    unsigned int v88;  // w13
    unsigned short v89;  // x11
    unsigned long long v90;  // x12
    unsigned long long v91;  // x13
    unsigned long long v11;  // x11
    unsigned long long v92;  // x8
    unsigned long long v93;  // x8
    unsigned int v94;  // w8
    unsigned int v95;  // w9
    unsigned int v96;  // w10
    unsigned int v97;  // w10
    unsigned int v98;  // w10
    unsigned int v99;  // w11
    unsigned int v100;  // w12
    unsigned int v101;  // w13
    st_415f34_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_415f34_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long, unsigned long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04580 + ~(~&g_f04580 + &g_f04580));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = -v3;
    v5 = v1;
    v6 = v0;
    v7 = (v6 & v5) + (v6 | v5) + ~(v6 & v5) * 2;
    v8 = (char *)v6 + 1;
    v9 = (char *)v8 + (v5 | ~v6) + (v6 ^ v5);
    v10 = (char *)v8 + 0x2 * ~v6 | v5;
    v11 = -((v10 ^ v8) + (v10 & v8) * 2);
    v12 = (0xffffffffffffffff ^ (v11 & v9) * 2) - (v11 ^ v9);
    v13 = v7 + v12 + (v7 + 2 & ~v12) + (v12 | 0xfffffffffffffffd - v7) + 3;
    v14 = (v13 * 2 & 4) + (v13 ^ 2);
    v15 = v14 - 1;
    v16 = ((-v14 | 46664) + v14 + (v15 ^ 46664) + 1 ^ ((-v14 | 46664) ^ v14) + ((-v14 | 46664) & v14) * 2) + ((-v14 | 46664) + v14 + (v15 ^ 46664) + 1 & ((-v14 | 46664) ^ v14) + ((-v14 | 46664) & v14) * 2) * 2;
    v0 = ~v16 + v16 * 2;
    v1 = (v15 ^ 18872) + (37744 & v15 * 2) - 1;
    v17 = (unsigned int)v0 + (unsigned int)v1;
    v18 = -((unsigned int)v3 | v17);
    g_f12090 = (v18 ^ (unsigned short)v17 + (unsigned short)v3) + (unsigned short)(v3 - ((unsigned int)v3 & ~v17) - (v18 | v17 + (unsigned int)v3)) * 2;
    v19 = v1;
    v20 = v0;
    v21 = v19 * 2;
    v22 = v20 + v19;
    v23 = v21 - (v22 + (v19 | ~v20));
    v24 = (((v23 & v22 + ~v21) * 4 + (v23 ^ v22 + ~v21) * 2 | 1) ^ v22 + ~v20 * 2 + 2) + (((v23 & v22 + ~v21) * 4 + (v23 ^ v22 + ~v21) * 2 | 1) & v22 + ~v20 * 2 + 2) * 2;
    v25 = v24 - 1;
    v26 = v19 + ~v19 * 2 + 1;
    v27 = (v22 ^ -(v20 | v19)) + (v22 & -(v20 | v19)) * 2;
    v28 = v22 + v26 + 1 - (v26 | v20) + v27 + ((v26 | v20) - (v22 + v26 + 1) & -v27) * 2 + (v22 + v26 + 1 - (v26 | v20) + ((v26 | v20) - (v22 + v26 + 1) | -v27)) * 2;
    v29 = 0xffffffffffffffff ^ (v28 + v24 + (1 - v28 | -v24)) * 2;
    v30 = v28 + ~(v25 & v28 - 2);
    v31 = (((v30 & v24 - v28) * 4 + (v30 ^ v24 - v28) * 2 | 1) ^ v29 + v28 + v25 + 2) + (((v30 & v24 - v28) * 4 + (v30 ^ v24 - v28) * 2 | 1) & v29 + v28 + v25 + 2) * 2;
    v32 = ~v31 + v31 * 2;
    v33 = (v32 | 1) + (1 & ~v31) + 6;
    v0 = ((-v31 | 10) ^ v31) + v32 + ((-v31 | 10) & v31) * 2 + (v32 & 10) + ((0xffffffff ^ (unsigned int)v32 * 2) & 20) - 10;
    v1 = v33 * 3 + ~v33 * 2 + 1;
    v34 = v3 >> ((char)v1 + (char)v0 & 63);
    v35 = v1;
    v36 = v0;
    v37 = (v35 ^ 1) + ~v35 * 2 + ((v35 * 2 | v35 >> 63) & 2 & 3);
    v38 = (v35 ^ -v36) + (v35 + (-v36 | ~v35)) * 2;
    v39 = ((v36 | ~v37) + v37) * 2;
    v40 = v36 | v35;
    v41 = ~v40;
    v42 = -((v35 + v41 ^ v36 + 1) + (v35 + v41 & v36 + 1) * 2);
    v43 = v42 - v40 + v39 + 2 + (v39 + 2 | ~(v38 + 2)) + (0xfffffffffffffffd - v39 | ~(v38 + 2)) + (v41 - (v42 | ~v40)) * 2 + (v38 - (v42 & ~v40)) * 2;
    v44 = (0xfffffffffffffffa - v43 | 1) + v43 + 6 + (1 & ~(v43 + 6)) + (~(v43 + 6) + (v43 + 6) * 2 ^ 1);
    v0 = v44 + 20265;
    v1 = (v44 | 1) + (v44 & 1) + 45269;
    v45 = (((unsigned short)v1 | v0) + 1 ^ (unsigned short)v1 & v0) + (((unsigned short)v1 | v0) + 1 & (unsigned short)v1 & v0) * 2;
    v46 = v45 - (v45 - 1 | v34);
    g_f12092 = (unsigned int)(v46 - v34) + ((unsigned int)(1 - v46) & v34 + 1) * 2 + (v46 + ((unsigned int)(1 - v46) | v34 + 1)) * 2 - 5;
    v47 = v1;
    v48 = v0;
    v49 = v48 | v47;
    v50 = (~v47 & ~v48) + v49 * 2 + 1;
    v51 = v48 + (v48 & v47) + (v47 & ~v48) * 2;
    v52 = ((v50 ^ -((v48 + v47 ^ -v49) + (v48 + v47 & -v49) * 2)) + (v50 + (-((v48 + v47 ^ -v49) + (v48 + v47 & -v49) * 2) | ~v50)) * 2 + 2 ^ v47 + (v48 + v47 ^ -v49) - v51 + (v48 + v47 & -v49) * 2) + ((v50 ^ -((v48 + v47 ^ -v49) + (v48 + v47 & -v49) * 2)) + (v50 + (-((v48 + v47 ^ -v49) + (v48 + v47 & -v49) * 2) | ~v50)) * 2 + 2 & v47 + (v48 + v47 ^ -v49) - v51 + (v48 + v47 & -v49) * 2) * 2;
    v53 = (-v52 | 1) + v52 + (1 & ~v52) + (~v52 + v52 * 2 ^ 1);
    v54 = v53 + 16;
    v55 = v53 & 16;
    v56 = v53 + 0x11;
    v57 = -(v56 + (~(unsigned int)v53 | 0xffffffffffffffef));
    v0 = (v53 - 16 & v55) + (v54 ^ -(v53 | 16)) + (v54 & -(v53 | 16)) * 2 + (((0xffffffff ^ (unsigned int)v53 * 2) & 32) + v53 - 16 | v55);
    v1 = v56 + ~v55 + (v54 ^ v57) + (v54 & v57) * 2;
    v58 = v3 >> ((char)((v1 & 0xff & v0) - v1) + ((char)v0 + (char)~v0 * 2 + 1 | (char)v1) + ((char)v1 | (char)v0) * 2 + 1 & 63);
    v59 = v1;
    v60 = v0;
    v61 = v59 + ~v59 * 2 + 1;
    v62 = v60 + ~v60 * 2 + 1 | v61;
    v63 = v60 | v59;
    v64 = (-((v60 + v59 ^ -v63) + (v60 + v59 & -v63) * 2) ^ v60 + v59 + v62 + 1) + (-((v60 + v59 ^ -v63) + (v60 + v59 & -v63) * 2) & v60 + v59 + v62 + 1) * 2;
    v65 = ~((v61 | v60) + v59) - ((v61 | v60) + v59) + v63 * 2 + (v64 | (v61 | v60) + v59 - v63) + v64 + (0xffffffffffffffff ^ v64 * 2) + (v64 + (0xffffffffffffffff ^ v64 * 2) | (v61 | v60) + v59 - v63) + 1;
    v66 = v65 + (v65 | 1) + (~v65 | 1);
    v67 = v66 + 1;
    v68 = v67 & 40299;
    v69 = v67 + ~v67 * 2;
    v70 = (v69 ^ ~((v68 ^ 40299) + (v67 ^ 0xffffffffffff6294))) + ((v68 ^ 40299) + (v67 ^ 0xffffffffffff6294) & ~v69) * 2;
    v71 = (v66 + 25237 ^ -(v67 | 25236)) + (v66 + 25237 & -(v67 | 25236)) * 2;
    v0 = v67 + v68 - (0xfffffffffffec529 | v67 * 2) + 0xffffffffffff6294 + (v70 & 40299 - (v67 + v68 - (0xfffffffffffec529 | v67 * 2))) + (v70 & v67 + v68 - (0xfffffffffffec529 | v67 * 2) + 0xffffffffffff6294);
    v1 = v71 + (v69 + 1 + v67 - (v69 + 1 & 0xffffffffffff9d6b) | ~v71) + (v71 | v69 + 1 + v67 - (v69 + 1 & 0xffffffffffff9d6b)) + 1;
    v72 = ((unsigned int)v1 ^ 1) + ~(unsigned int)v1 * 2 + (__ROL__((unsigned int)v1, 1) & 2 & 3);
    v73 = (v72 + (unsigned int)v0 | 0xfffffffe) + (v72 + (unsigned int)v0 + ((unsigned int)v0 + (-v72 | ~(unsigned int)v0) + (-v72 & ~(unsigned int)v0)) * 2 + 2 | 1);
    v74 = v58 * 2;
    v75 = v74 + ~v58 * 4 + (v58 ^ 1) + (v74 & 2);
    v76 = v75 + v73 + (v73 + ~v73 * 2 + 1 | (unsigned int)(0xfffffffd - v75)) + 3;
    g_f12094 = (unsigned short)v76 + (unsigned short)v58 + (unsigned short)~v74 + (((unsigned short)v76 & (unsigned short)v58 + 1) + (unsigned short)~(v76 | v58 + ~v74 - 1)) * 2;
    v77 = v1;
    v78 = v0;
    v79 = (v77 ^ 1) + ~v77 * 2 + ((v77 * 2 | v77 >> 63) & 2 & 3);
    v80 = v78 - v77 + (v77 & ~v78) * 2;
    v81 = (v77 - v78 + ((v79 + v78 - (v79 | v78)) * 2 | ~(v77 - v78)) + ((v79 + v78 - (v79 | v78)) * 2 | v77 - v78) + 1 | (0xffffffffffffffff ^ (v80 - (v80 + (v78 & v77) | -(v78 & v77))) * 2) - (v80 + (v78 & v77) ^ -(v78 & v77))) + (v77 - v78 + ((v79 + v78 - (v79 | v78)) * 2 | ~(v77 - v78)) + ((v79 + v78 - (v79 | v78)) * 2 | v77 - v78) + 1 & (0xffffffffffffffff ^ (v80 - (v80 + (v78 & v77) | -(v78 & v77))) * 2) - (v80 + (v78 & v77) ^ -(v78 & v77)));
    v82 = v81 + (v81 & 0xfffffffffffffffe) + (~v81 | 1);
    v83 = v82 + 2;
    v84 = (v83 | 1) + (v83 & 1);
    v0 = (v83 & 24 ^ 24) + (v83 ^ 0xffffffffffffffe7) + v83 + (v82 + (v83 & 24 ^ 24) + (v83 ^ 0xffffffffffffffe7) + 3 | v84 + ~(v83 & 24) + 24) + (0xfffffffffffffffe - ((v83 & 24 ^ 24) + (v83 ^ 0xffffffffffffffe7) + v83) | v84 + ~(v83 & 24) + 24) + 2;
    v1 = v84 + 23;
    g_f12096 = v3 >> ((char)v1 + v0 & 63);
    g_f04580 = (unsigned short)((~g_f04580 & ~g_f12090) - (g_f12090 & g_f04580)) + (g_f12090 | g_f04580) * 2 + 1;
    v85 = g_f12092 | g_f04582;
    v86 = g_f12092 + g_f04582;
    g_f04582 = (unsigned short)(v85 - (v86 & -v85) * 2) + ((unsigned short)(v85 - 1) ^ v86) + 1;
    v87 = -g_f12094;
    g_f04584 = (v87 ^ g_f04584) + (g_f12094 + ~g_f04584 + (g_f04584 & ~g_f12094)) * 2 + (unsigned short)(g_f04584 - g_f12094 - (v87 | g_f04584)) * 2 + 2;
    v88 = g_f12096 | g_f04586;
    v89 = g_f12096 + g_f04586;
    g_f04586 = (unsigned short)(v88 - (v89 & -v88) * 2) + ((unsigned short)(v88 - 1) ^ v89) + 1;
    v90 = v3 + ~g_f04588;
    v91 = (g_f04588 & ~v3) + 1;
    v92 = v3 + (g_f04588 | v4);
    v93 = (((v91 & v90) * 4 + (v91 ^ v90) * 2 | 1) ^ (g_f04588 ^ v4) + (g_f04588 - v92) * 2) + (((v91 & v90) * 4 + (v91 ^ v90) * 2 | 1) & (g_f04588 ^ v4) + (g_f04588 - v92) * 2) * 2;
    g_f04588 = ~v93 + v93 * 2;
    v94 = v1;
    v95 = *(unsigned int *)&v0;
    v96 = (v94 ^ 1) + ~v94 * 2 + (__ROL__(v94, 1) & 2 & 3);
    v97 = ((v95 | ~v96) & v96 + 1) * 4 + ((v95 | ~v96) ^ v96 + 1) * 2 | 1;
    v98 = (v97 ^ v94 - v95) + (v97 & v94 - v95) * 2;
    v99 = ~v98 + v98 * 2;
    v100 = v94 - v99 + (v99 & ~v94);
    v101 = v100 * 2;
    v102 = v99 - v94 + v100 * 4 + 1;
    v103 = v102 + ~v101;
    v104 = v99 * 2 - v98 * 4 + (v99 ^ 1) + (v99 * 2 & 2) + 2;
    v105 = (v104 + v95 & -(v104 | v95)) * 4 + (v104 + v95 ^ -(v104 | v95)) * 2;
    v106 = v99 - v95 + (v105 | ~(v99 - v95)) + (v105 | v99 - v95) + 1;
    v107 = v103 - v106 + (v106 - v103 + (v103 & ~v106)) * 2;
    v108 = (v106 & v101 - v102) + (v103 | ~v106) + (v106 ^ v103) + 1;
    v109 = (v108 ^ 1) + ~v108 * 2 + (__ROL__(v108, 1) & 2 & 3) + 1;
    v110 = (v109 ^ v107) + (v109 & v107) * 2 - 1;
    return ~((v110 * 2 & 4) + (v110 ^ 2)) + ((v110 * 2 & 4) + (v110 ^ 2)) * 2;
}

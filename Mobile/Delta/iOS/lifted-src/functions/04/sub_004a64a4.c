/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a64a4..0x4a6e08 (2404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a64a4_0 {
    char field_0;
} st_4a64a4_0;

extern unsigned short g_f04610;
extern unsigned short g_f04612;
extern unsigned short g_f04614;
extern unsigned short g_f04616;
extern unsigned long long g_f04618;
extern unsigned short g_f120d8;
extern unsigned short g_f120da;
extern unsigned short g_f120dc;
extern unsigned short g_f120de;

int sub_4a64a4(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x11
    unsigned long long v13;  // x10
    unsigned long long v14;  // x13
    unsigned long long v15;  // x10
    unsigned int v16;  // w12
    unsigned long long v17;  // x10
    unsigned long long v18;  // x11
    unsigned int v19;  // w13
    unsigned long v20;  // x15
    unsigned long long v21;  // x16
    st_4a64a4_0 *v4;  // x10
    unsigned long long v22;  // x0
    unsigned long long v23;  // x17
    unsigned long long v24;  // x17
    unsigned long long v25;  // x0
    unsigned long long v26;  // x15
    unsigned long long v27;  // x15
    unsigned long long v28;  // x15
    unsigned long v29;  // x16
    unsigned long long v30;  // x0
    unsigned long long v31;  // x17
    st_4a64a4_0 **v5;  // x11
    unsigned long long v32;  // x15
    unsigned int v33;  // w15
    unsigned long v34;  // x16
    unsigned long long v35;  // x17
    unsigned long long v36;  // x0
    unsigned long long v37;  // x1
    unsigned long long v38;  // x16
    unsigned long long v39;  // x16
    unsigned long long v40;  // x16
    unsigned long long v41;  // x17
    unsigned long long v6;  // x12
    unsigned long long v42;  // x16
    unsigned int v43;  // w16
    unsigned long long v44;  // x16
    unsigned long long v45;  // x17
    unsigned long long v46;  // x0
    unsigned long long v47;  // x1
    unsigned long long v48;  // x5
    unsigned long long v49;  // x16
    unsigned long long v50;  // x16
    unsigned long long v51;  // x16
    unsigned long long v7;  // x13
    unsigned long long v52;  // x16
    unsigned long long v53;  // x2
    unsigned long long v54;  // x0
    unsigned int v55;  // w16
    unsigned long long v56;  // x17
    unsigned long long v57;  // x0
    unsigned long long v58;  // x2
    unsigned long long v59;  // x1
    unsigned long long v60;  // x1
    unsigned long long v61;  // x4
    unsigned long long v8;  // x12
    unsigned long long v62;  // x17
    unsigned long long v63;  // x17
    unsigned short v64;  // x0
    unsigned short v65;  // x17
    unsigned short v66;  // x14
    unsigned long long v67;  // x16
    unsigned long long v68;  // x17
    unsigned long long v69;  // x0
    unsigned long long v70;  // x16
    unsigned long long v71;  // x16
    unsigned long long v9;  // x13
    unsigned long long v72;  // x17
    unsigned long long v73;  // x16
    unsigned long long v74;  // x16
    unsigned long v75;  // x17
    char v76;  // x0
    unsigned long long v77;  // x1
    char v78;  // x16
    unsigned short v79;  // x12
    unsigned short v80;  // x12
    unsigned short v81;  // x13
    unsigned long long v10;  // x10
    unsigned short v82;  // x16
    unsigned int v83;  // w0
    unsigned int v84;  // w14
    unsigned short v85;  // x15
    unsigned int v86;  // w15
    unsigned int v87;  // w14
    unsigned short v88;  // x16
    unsigned short v89;  // x12
    unsigned short v90;  // x13
    unsigned long long v11;  // x11
    st_4a64a4_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4a64a4_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04610 + ~(~&g_f04610 + &g_f04610));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 * 3 + ~v4 * 4 + 3;
    v7 = v4 - v5;
    v8 = v7 + (v6 + (char *)v5 ^ -(v6 | v5)) * 2 + (v6 + (char *)v5 & -(v6 | v5)) * 4;
    v9 = -(v7 + (v5 | ~v4));
    v10 = (v5 - v4 | (v4 + ~v5 & v9) * 4 + (v4 + ~v5 ^ v9) * 2) + ((v4 + ~v5 & v9) * 4 + (v4 + ~v5 ^ v9) * 2 & v5 - v4);
    v11 = (v10 + 1 + ~v10 * 2 | 1) + (v10 + 1 & 1);
    v12 = (v8 ^ -v11) + (v8 & -v11 | v11 & ~v8) * 2;
    v13 = v12 + (v8 - v10 & -(v8 | -v10)) * 4 + (v8 - v10 ^ -(v8 | -v10)) * 2 + (v12 & ~((v8 - v10 & -(v8 | -v10)) * 4 + (v8 - v10 ^ -(v8 | -v10)) * 2)) + ((v8 - v10 & -(v8 | -v10)) * 4 + (v8 - v10 ^ -(v8 | -v10)) * 2 | ~v12) + 1;
    v14 = v13 & 47470;
    v15 = v14 - ((v13 | 1) + (v13 & 1) + 47470) + ((v13 | 1) + (v13 & 1) + 47470 - v14) * 2;
    v0 = v13 + (v13 + (18066 | ~v13)) * 2 + ((0xffffffff ^ (unsigned int)v13 * 2) & 36132) + 0xffffffffffffb96f;
    v1 = (v15 ^ v14) + (v15 & v14) * 2 - 1;
    v16 = (unsigned int)v1 + (unsigned int)v0;
    v17 = v3 + 1;
    v18 = v17 + ~v3 * 2;
    v19 = v16 + ~v16 * 2 + 1;
    g_f120d8 = (unsigned short)v16 + (unsigned short)v19 + (unsigned short)v17 + ((unsigned short)v18 | (unsigned short)~v19) + 1;
    v20 = v1;
    v21 = v0;
    v22 = v21 + v20 + (-v21 & ~v20) * 2 + (v20 + (-v21 | ~v20)) * 2 + 2;
    v23 = 1 | ((v20 ^ 1) + ~v20 * 2 + ((v20 * 2 | v20 >> 63) & 2 & 3) & v21) * 2;
    v24 = (v23 ^ v22) + (v23 & v22) * 2 - 1;
    v25 = (v21 ^ 1) + ~v21 * 2 + ((v21 * 2 | v21 >> 63) & 2 & 3) & v20;
    v26 = v21 - v20 + v25 * 4 + 1 - v25 * 2 + (v25 * 2 - (v21 - v20 + v25 * 4 + 1)) * 2 + 1;
    v27 = (v26 ^ v24 | 0xfffffffffffffffe) + (-((v26 ^ v24) + (v26 & v24) * 2) | 1) + ((v26 ^ v24) + (v26 & v24) * 2) * 2 + 1;
    v0 = (v27 ^ 11) + (22 & v27 * 2) - 1;
    v1 = (v27 | 6) + (v27 | 0xfffffffffffffff9) * 2 + ~((v27 | 0xfffffffffffffff9) + 7) + 15;
    v28 = v0;
    v29 = v1;
    v30 = v28 + 1;
    v31 = v30 + ~v28 * 2 | v29;
    v32 = ((v31 ^ v30) + (v31 & v30) * 2 ^ v29 + 1 + v30 + (v29 + 1 + ~v29 * 2 | ~v28)) + ((v31 ^ v30) + (v31 & v30) * 2 & v29 + 1 + v30 + (v29 + 1 + ~v29 * 2 | ~v28)) * 2;
    v33 = v3 >> ((char)~v32 + (char)v32 * 2 & 63);
    v34 = v1;
    v35 = v0;
    v36 = v35 | v34;
    v37 = (v36 - 1 ^ v35 + v34) - (v35 + v34 & -v36) * 2 + v36;
    v38 = -((v34 - v35 + (v35 | ~v34) ^ v35 + 1) + (v34 - v35 + (v35 | ~v34) & v35 + 1) * 2);
    v39 = (v38 ^ v36) + (v36 + (v38 | ~v36)) * 2 + 2 + ~((v38 ^ v36) + (v36 + (v38 | ~v36)) * 2 + 2) * 2;
    v40 = ((v39 + 1 + v37 + 1 - (v39 + 2 | v37 + 1)) * 2 + 3 ^ v37 - (v39 + 1) + (v39 + 2 & 0x7ffffffffffffffe - v37) * 2) + ((v39 + 1 + v37 + 1 - (v39 + 2 | v37 + 1)) * 2 + 3 & v37 - (v39 + 1) + (v39 + 2 & 0x7ffffffffffffffe - v37) * 2) * 2;
    v41 = ~v40 + v40 * 2;
    v42 = (v41 | 1) + (1 & ~v40) + 4002;
    v0 = ((-v40 | 61533) ^ v40) + ((-v40 | 61533) & v40) * 2 + (v41 | 61533);
    v1 = ~v42 + v42 * 2;
    v43 = (unsigned int)v0 + ((unsigned int)v1 ^ 0xfffffffe) + (unsigned int)v1 * 4 - ((unsigned int)v1 * 2 + ((unsigned int)v1 * 2 & 2));
    g_f120da = ~((v33 | v43 + 65538) - (v33 ^ v43 + 3) - (v33 & v43 + 3) * 2);
    v44 = v1;
    v45 = v0;
    v46 = (v45 + ~v45 * 2 + 1 & v44) + v45;
    v47 = v45 * 2;
    v48 = v45 + v44;
    v49 = v47 - (v48 + (v45 | ~v44));
    v50 = v48 + ~v44 * 2 + ~((v49 & v48 + ~v47) * 4 + (v49 ^ v48 + ~v47) * 2) + ((v49 & v48 + ~v47) * 4 + (v49 ^ v48 + ~v47) * 2) * 2 + 3;
    v51 = v46 - ((v44 & ~v45) - v44) + (v46 & (v44 & ~v45) - v44 | (v44 & ~v45) - v44 & ~v46) * 2 + v50;
    v52 = v51 - v50 * 2 + (v50 * 2 - v51 | 1) + (v51 + ~(v50 * 2) | 1);
    v53 = v52 + 1;
    v54 = ((v53 + ~v52 * 2 | 16) ^ -(v53 + ~v52 * 2)) + ((v53 + ~v52 * 2 | 16) & -(v53 + ~v52 * 2)) * 2;
    v0 = v52 + (v53 + (0x11 | ~v52)) * 2 + ((0xffffffff ^ (unsigned int)v52 * 2) & 0x22) - 18;
    v1 = (v54 ^ (v52 & 0xffffffffffffffef) + 0x11) + (v54 & (v52 & 0xffffffffffffffef) + 0x11) * 2 - 1;
    v55 = v3 >> ((char)(((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2 - 1) & 63);
    v56 = v1;
    v57 = v0;
    v58 = v56 + 1;
    v59 = v58 + ~v56 * 2 + ~(v58 + ~v56 * 2) * 2;
    v60 = (v56 ^ -v57) + ((v59 + 1 | v57) & ~v59) * 4 + ((-v57 | ~v56) + v58 + (v59 ^ ~(v59 + 1 | v57))) * 2;
    v61 = (~v57 & ~v56) + (v56 | v57) * 2 + 1;
    v62 = (v61 ^ -(v57 & v56)) + (v61 - (v57 & v56) - (v61 | -(v57 & v56))) * 2;
    v63 = v62 - (v60 + 1) + ((-v62 | ~v60) & v60 + 1) * 4 + ((~(v60 + 1) + (v60 + 1) * 2 | -v62) + ((-v62 | ~v60) ^ v60 + 1)) * 2;
    v0 = v63 + 57686;
    v1 = v63 + 7851;
    v64 = (unsigned short)((unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 3;
    v65 = (v64 ^ (unsigned short)v0) + ((unsigned short)v0 + (v64 | (unsigned short)~(unsigned int)v0)) * 2;
    v66 = v65 + ((unsigned short)v55 + (0xffff ^ (unsigned short)v55 * 2) & (unsigned short)(0xfffffffe - v65));
    g_f120dc = v66 + 2 + ~v55 + ((v55 + 1 | (unsigned int)(0xfffffffe - v66)) + v66 + 2 + (v55 + 1 & (unsigned int)(0xfffffffe - v66))) * 2 - 1;
    v67 = v1;
    v68 = v0;
    v69 = v67 - v68 + (v68 + ~v67 + (v67 & ~v68)) * 2;
    v70 = (v68 | v67) + (v67 | ~v68) + v68 + ((v68 | v67) & ~((v67 | ~v68) + v68)) * 2 + (~((v67 | ~v68) + v68) & ~(v68 | v67)) * 2;
    v71 = v70 + v69 + 2 + 2 + ((v70 | v69 + 2) - (v70 + v69 + 2 + 2) + 1 & v69 + 3) * 4 + (v69 + 3 + ~(v69 + 2) * 2 + (~v70 | ~(v69 + 3 + ~(v69 + 2) * 2)) + ((v70 | v69 + 2) - (v70 + v69 + 2 + 2) + 1 ^ v69 + 3)) * 2;
    v72 = v71 + 2;
    v73 = 0xfffffffffffffffe - v71;
    v0 = (v72 + (v73 & 0xffffffffffffffd6) + 41 & 0xffffffffffffffd6 - ((v73 | 0xffffffffffffffd6) + v72)) + (v73 | 0xffffffffffffffd6) + v72 + 41 + (v72 + (v73 & 0xffffffffffffffd6) + 41 & (v73 | 0xffffffffffffffd6) + v72 + 41);
    v1 = (v71 + 1 ^ 8) + ((v73 | 8) + v72) * 2 - 1;
    v74 = v0;
    v75 = v1;
    v76 = ((char)v75 + (char)v74 ^ (char)-(v75 | v74)) + ((char)v75 + (char)v74 & (char)-(v75 | v74)) * 2;
    v77 = v75 + ~v75 * 2 + 1;
    v78 = (char)v75 + (char)v77 + ((char)v74 | (char)~v77) + 2;
    g_f120de = v3 >> ((char)((v78 ^ v76) + (v78 & v76) * 2 - 1) & 63);
    v79 = -g_f120d8;
    v80 = (v79 ^ g_f04610) + (g_f04610 + (v79 | ~g_f04610)) * 2 + 2;
    v81 = 1 | (g_f120d8 - g_f04610 + (g_f04610 & ~g_f120d8)) * 2;
    g_f04610 = (v80 ^ v81) + (v80 & v81) * 2 - 1;
    v82 = g_f04612 + 1;
    v83 = -g_f120da;
    g_f04612 = v82 + g_f120da + (((unsigned short)v83 | ~g_f04612) + v82 + ((unsigned short)v83 & ~g_f04612) + (v82 + ~g_f04612 * 2 & g_f120da)) * 2 - 1;
    v84 = g_f04614 + ~g_f04614 * 2;
    v85 = (unsigned short)~(v84 + 1 | g_f120dc) + g_f120dc;
    g_f04614 = g_f04614 - g_f120dc + (v85 ^ (unsigned short)v84 + 2) * 2 + (v85 & (unsigned short)v84 + 2) * 4;
    v86 = g_f04616 + 1;
    v87 = v86 + ~g_f04616 * 2;
    v88 = -g_f120de;
    v89 = g_f120de + g_f04616 + (v88 & ~g_f04616) * 2 + ((v88 | ~g_f04616) + (unsigned short)v86) * 2;
    v90 = ((g_f120de | (unsigned short)~v87) + (unsigned short)v87) * 2;
    g_f04616 = ((unsigned short)(0xfffd - v90) & v89) + v90 + 2 + (v90 + 2 & v89);
    g_f04618 = g_f04618 + v17 - (g_f04618 & v3) + (g_f04618 + ~g_f04618 * 2 + 1 | v18);
    return v83;
}

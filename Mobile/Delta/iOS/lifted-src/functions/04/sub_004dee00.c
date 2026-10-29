/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dee00..0x4df73c (2364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4dee00_0 {
    char field_0;
} st_4dee00_0;

extern unsigned short g_f04450;
extern unsigned short g_f04452;
extern unsigned short g_f04454;
extern unsigned short g_f04456;
extern unsigned long long g_f04458;
extern unsigned short g_f11ff8;
extern unsigned short g_f11ffa;
extern unsigned short g_f11ffc;
extern unsigned short g_f11ffe;

int sub_4dee00(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x12
    unsigned int v13;  // w10
    unsigned int v14;  // w13
    unsigned int v15;  // w14
    unsigned int v16;  // w10
    unsigned long v17;  // x12
    unsigned long v18;  // x13
    unsigned long long v19;  // x14
    unsigned long long v20;  // x12
    unsigned long long v21;  // x13
    st_4dee00_0 *v4;  // x10
    unsigned long long v22;  // x15
    unsigned long long v23;  // x12
    unsigned short v24;  // x12
    unsigned long long v25;  // x13
    unsigned long long v26;  // x14
    unsigned long long v27;  // x15
    unsigned long long v28;  // x16
    unsigned long long v29;  // x17
    unsigned long long v30;  // x13
    unsigned long long v31;  // x13
    st_4dee00_0 **v5;  // x12
    unsigned long long v32;  // x13
    unsigned long long v33;  // x14
    unsigned long long v34;  // x15
    unsigned long long v35;  // x13
    unsigned int v36;  // w14
    unsigned int v37;  // w13
    unsigned short v38;  // x13
    unsigned long long v39;  // x13
    unsigned long long v40;  // x15
    unsigned long long v41;  // x16
    unsigned long long v6;  // x11
    unsigned long long v42;  // x13
    unsigned long long v43;  // x14
    unsigned long long v44;  // x11
    unsigned long long v45;  // x11
    unsigned int v46;  // w11
    unsigned long long v47;  // x13
    unsigned long long v48;  // x14
    unsigned long long v49;  // x16
    unsigned long long v50;  // x17
    unsigned long long v51;  // x15
    unsigned long long v7;  // x13
    unsigned long long v52;  // x17
    unsigned long long v53;  // x15
    unsigned long long v54;  // x13
    unsigned long long v55;  // x16
    unsigned long long v56;  // x14
    unsigned long long v57;  // x13
    unsigned long long v58;  // x14
    unsigned long long v59;  // x13
    unsigned long long v60;  // x13
    unsigned long v61;  // x14
    unsigned long long v8;  // x15
    unsigned long long v62;  // x15
    unsigned long long v63;  // x16
    unsigned long v64;  // x0
    unsigned long v65;  // x16
    unsigned long long v66;  // x17
    unsigned long long v67;  // x13
    unsigned long long v68;  // x14
    unsigned long v69;  // x17
    unsigned long long v70;  // x13
    unsigned long long v71;  // x13
    unsigned long long v9;  // x10
    unsigned long long v72;  // x13
    unsigned long long v73;  // x14
    unsigned long long v74;  // x14
    unsigned long long v75;  // x15
    unsigned int v76;  // w16
    unsigned int v77;  // w17
    unsigned short v78;  // x10
    unsigned short v79;  // x13
    unsigned short v80;  // x10
    unsigned short v81;  // x12
    unsigned long long v10;  // x10
    unsigned int v82;  // w12
    unsigned short v83;  // x15
    unsigned int v84;  // w10
    unsigned short v85;  // x11
    unsigned long v86;  // x8
    unsigned long long v87;  // x10
    unsigned long long v11;  // x10
    st_4dee00_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4dee00_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04450 + ~(~&g_f04450 + &g_f04450));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 * 3 + ~v4 * 4 + 3;
    v7 = ((1 | (v6 & v5) * 2) ^ v4 - v5) + ((1 | (v6 & v5) * 2) & v4 - v5) * 2;
    v8 = v5 | v4;
    v9 = (v5 + v4 ^ -v8) + (v5 + v4 & -v8) * 2;
    v10 = v9 + v8 + (-v9 & ~v8) * 2 + (v8 + (-v9 | ~v8)) * 2 + 2;
    v11 = v7 - 1 - v10 + (v10 | -v7) + (v7 - 1 & ~v10);
    v12 = v11 + 1;
    v0 = v11 + (45070 & v12 * 2) + (45070 & v12 * 2 ^ 45070) + 0xffffffffffffa7f9;
    v1 = v11 + (~(unsigned int)v12 | 0xffffffffffff5806) + (v11 + 0xa7fa ^ -(v12 | 0xa7f9)) + (v11 + 0xa7fa & -(v12 | 0xa7f9)) * 2 + 0xa7fb;
    v13 = v0 + (unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2);
    v14 = (unsigned int)v3 + ~(unsigned int)v3 * 2;
    v15 = v14 + 1;
    v16 = v13 + 3 + v15 + (v13 + 3 + ~(v13 + 2) * 2 | ~v15);
    g_f11ff8 = v15 + v16 + 1 + (v16 + 1 + (~v16 | ~v14) + (~v16 & ~v14)) * 2 - 1;
    v17 = v1;
    v18 = v0;
    v19 = v17 - v18 + (v17 + ~v17 * 2 + 1 & v18) * 2;
    v20 = v17 & ~v18 | v18 & ~v17;
    v21 = v20 - 1;
    v22 = v19 - v20 + (v21 | ~v19) + 1;
    v23 = (v22 ^ (v19 & v21) - v19) + ((v21 & ~v19) - v20 & v19 + 1) * 4 + ((v22 & (v19 & v21) - v19) + ((v21 & ~v19) - v20 ^ v19 + 1)) * 2;
    v0 = (v23 + 3 ^ -(v23 | 3)) + (v23 | 3) + (v23 + 3 & -(v23 | 3)) * 2;
    v1 = v23 + (v23 | 13) + (0xfffffffffffffff2 & ~v23) + 14;
    v24 = v3 >> ((char)(v0 + (char)v1 * 2 + (v1 ^ 0xfffffffffffffffe) - ((char)v1 * 2 & 2)) + 2 & 63);
    v25 = v1;
    v26 = v0;
    v27 = v25 + 1;
    v28 = v27 + v26;
    v29 = v26 + ~v26 * 2 + 1;
    v30 = (v26 & v25) + v28 + ~(v26 & v25) * 2 + (v29 | ~v25);
    v31 = v28 + ~((v25 | ~v26) + v26) + (v29 | v27 + ~v25 * 2) - v30 * 2 + (v30 + 2 ^ 1) + (((v30 + 2) * 2 | v30 + 2 >> 63) & 2 & 3) - 6;
    v32 = (v31 * 2 & 4) + (v31 ^ 2);
    v33 = v32 - 1;
    v34 = (v32 + 17352 ^ -(v33 | 17353)) + (v32 + 17352 & -(v33 | 17353)) * 2;
    v35 = (((-v32 | 48182) ^ v32) + ((-v32 | 48182) & v32) * 2 ^ v32 + (v33 & 48182) - (0xfffffffffffe8793 | v33 * 2) + 0xffffffffffff43c9) + (((-v32 | 48182) ^ v32) + ((-v32 | 48182) & v32) * 2 & v32 + (v33 & 48182) - (0xfffffffffffe8793 | v33 * 2) + 0xffffffffffff43c9) * 2;
    v0 = v32 + 17353 - (v33 & 17353) + v34 + ((v33 & 17353) - (v32 + 17353) | ~v34) + (v34 & v32 + 17353 + ~(v33 & 17353));
    v1 = ~v35 + v35 * 2;
    v36 = ((unsigned int)v1 ^ 1) + ~(unsigned int)v1 * 2 + (__ROL__((unsigned int)v1, 1) & 2 & 3);
    v37 = v36 + (unsigned int)v0 + (-v36 & ~(unsigned int)v0) * 2 + ((unsigned int)v0 + (-v36 | ~(unsigned int)v0)) * 2 + 2;
    v38 = (unsigned short)v37 * 3 + (unsigned short)~v37 * 2;
    g_f11ffa = (unsigned short)((v38 + 2 ^ v24) - ((v24 & (unsigned int)(0xfffffffe - v38)) + v38 + 2)) + (v38 + 2 & v24) * 2;
    v39 = v1;
    v40 = v0;
    v41 = v39 - v40 + ((v40 | ~(v39 + ~v39 * 2 + 1)) ^ v39 + ~v39 * 2 + 2) * 2 + ((v40 | ~(v39 + ~v39 * 2 + 1)) & v39 + ~v39 * 2 + 2) * 4;
    v42 = (v40 ^ -v39) + (v40 - v39 - (v40 | -v39)) * 2;
    v43 = (((v40 ^ 1) + v40 * 2 + ~v40 * 4 + (v40 * 2 & 2) + 2 | ~v39) + v39) * 2 + 3;
    v44 = 1 - ((v43 ^ v42) + (v43 & v42) * 2);
    v45 = (v44 ^ v41 | 0xfffffffffffffffe) + (v44 ^ v41) + (v44 & v41) * 2 + (v44 ^ v41) + (v44 & v41) * 2 - (~((v44 ^ v41) + (v44 & v41) * 2) + ((v44 ^ v41) + (v44 & v41) * 2) * 2 | 1);
    v0 = v45 + 32;
    v1 = v45 + 2;
    v46 = v3 >> ((char)v0 + (char)~v1 + (char)v1 * 2 + 1 & 63);
    v47 = v1;
    v48 = v0;
    v49 = ~v47 * 2;
    v50 = v47 + v49 + 1 + ~(v47 + v49 + 1) * 2;
    v51 = (v47 ^ -v48) + (v47 - v48 - (v47 | -v48)) * 2;
    v52 = ((v50 + 1 | v48) & ~v50) * 4 + (v50 ^ ~(v50 + 1 | v48)) * 2;
    v53 = v51 + (v52 | ~v51) + (v52 | v51) + 1;
    v54 = (v47 + 1 + v48 + (v47 + 1 + v49 | ~v48) ^ (v48 | v47) - (v48 + v47)) + (v47 + 1 + v48 + (v47 + 1 + v49 | ~v48) & (v48 | v47) - (v48 + v47)) * 2;
    v55 = v54 - 1;
    v56 = ((v53 & v55) - v54 ^ v54 - v53 + (v53 | -v54)) + ((v53 & v55) - v54 & v54 - v53 + (v53 | -v54)) * 2;
    v57 = (~(v53 - v54) - (v55 | ~v53) & v53 - v54) * 4 + (~(v53 - v54) - (v55 | ~v53) ^ v53 - v54) * 2 | 1;
    v58 = (v57 ^ v56) - 1;
    v59 = v58 + (v57 & v56) * 2;
    v0 = (v59 ^ 51780) + (103560 & v59 * 2) - 1;
    v1 = (v59 | 1) + (v58 & 1) + 13755;
    g_f11ffc = (unsigned short)v46 + ((unsigned short)((v0 & 0xffffffff) - v1) + (((unsigned short)v1 + 1 & (unsigned short)~v0) + ((unsigned short)v1 + 1 & v0)) * 2 + 0xfffe | (unsigned short)~v46) + 1;
    v60 = v1;
    v61 = v0;
    v62 = v61 | v60;
    v63 = -((v61 + ~v62 ^ v60 + 1) + (v61 + ~v62 & v60 + 1) * 2);
    v64 = (v62 + (v63 | ~v62)) * 2 + 2;
    v65 = v64 + (v63 ^ v62);
    v66 = v61 * 2 + ~v61 * 4 + (v61 ^ 1) + (v61 * 2 & 2);
    v67 = v61 - v60;
    v68 = ((0xfffffffffffffffd - v66 | v60) & v66 + 3) * 4 + ((0xfffffffffffffffd - v66 | v60) ^ v66 + 3) * 2 | 1;
    v69 = v68 ^ v67;
    v70 = v69 + (v68 & v67) * 2;
    v71 = (-v70 | 1) + (v69 & 1);
    v72 = v65 - v71;
    v73 = v72 + (v71 & (v63 ^ ~v62) - v64) * 2 + (~v70 + v70 * 2 - (~v70 + v70 * 2 - 1 & v65) & v65 - (~v70 + v70 * 2)) * 4 + (~v70 + v70 * 2 - (~v70 + v70 * 2 - 1 & v65) ^ v65 - (~v70 + v70 * 2)) * 2;
    v74 = v73 + (0xffffffffffffffd3 | ~v73);
    v75 = (0xffffffffffffffd3 - v74 ^ v73 + 44) + (0xffffffffffffffd3 - v74 & v73 + 44) * 2;
    v0 = (v72 & 1) + v73 + (v73 | 1) + (~v73 | 0xfffffffffffffffb) + (0xfffffffffffffffb & ~v73) + 9;
    v1 = v75 + (v74 + 45 | ~v75) + (v75 | v74 + 45) + 1;
    g_f11ffe = v3 >> ((char)v1 + v0 & 63);
    v76 = (0xffffffff ^ g_f04450 * 2) + g_f04450 + g_f11ff8;
    v77 = ~v76 - (g_f04450 | ~g_f11ff8);
    v78 = -g_f11ff8;
    g_f04450 = (v78 ^ g_f04450) + ((unsigned short)v77 & (unsigned short)v76) * 4 + (g_f04450 + (v78 | ~g_f04450) + ((unsigned short)v77 ^ (unsigned short)v76)) * 2 + 2;
    v79 = g_f11ffa & ~g_f04452;
    v80 = g_f04452 + g_f11ffa + ~g_f11ffa * 2 + 2;
    v81 = (0xffff ^ v79 * 2) + v79 * 4 + 2;
    g_f04452 = (v81 ^ v80) + (v81 & v80) * 2 - 1;
    g_f04454 = (g_f11ffc | g_f04454) + (unsigned short)~((g_f04454 | ~g_f11ffc) + g_f11ffc);
    v82 = -g_f11ffe;
    v83 = g_f04456 * 2;
    v84 = g_f04456 + g_f11ffe + (v82 & ~g_f04456) * 2 + (unsigned int)(g_f04456 - g_f11ffe - (v82 | g_f04456)) * 2;
    v85 = ((g_f04456 ^ 1) + v83 + ~g_f04456 * 4 + (v83 & 2) + 2 & g_f11ffe) * 2;
    g_f04456 = (unsigned short)v84 + (v85 | (unsigned short)~v84) + (v85 | (unsigned short)v84) + 1;
    v86 = g_f04458 - v3;
    v87 = (g_f04458 + ~g_f04458 * 2 + 1 & v3) * 2;
    g_f04458 = v86 + (v87 | ~v86) + (v87 | v86) + 1;
    return v77 ^ v76;
}

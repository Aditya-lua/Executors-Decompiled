/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4d9388..0x4d9c38 (2224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4d9388_0 {
    char field_0;
} st_4d9388_0;

extern unsigned short g_f045b0;
extern unsigned short g_f045b2;
extern unsigned short g_f045b4;
extern unsigned short g_f045b6;
extern unsigned long long g_f045b8;
extern unsigned short g_f120a8;
extern unsigned short g_f120aa;
extern unsigned short g_f120ac;
extern unsigned short g_f120ae;

unsigned long long sub_4d9388(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x11
    unsigned long long v13;  // x13
    unsigned int v14;  // w11
    unsigned long long v15;  // x12
    unsigned long v16;  // x13
    unsigned long long v17;  // x17
    unsigned long long v18;  // x15
    unsigned long long v19;  // x16
    unsigned long long v20;  // x14
    unsigned long long v21;  // x14
    st_4d9388_0 *v4;  // x10
    unsigned long long v22;  // x12
    unsigned long long v23;  // x12
    unsigned long long v24;  // x13
    unsigned int v25;  // w12
    unsigned long long v26;  // x13
    unsigned long long v27;  // x14
    unsigned long long v28;  // x16
    unsigned long long v29;  // x15
    unsigned long long v30;  // x13
    unsigned long long v31;  // x13
    st_4d9388_0 **v5;  // x11
    unsigned long long v32;  // x14
    unsigned long long v33;  // x17
    unsigned long long v34;  // x13
    unsigned long long v35;  // x13
    unsigned int v36;  // w13
    unsigned long v37;  // x13
    unsigned long v38;  // x15
    unsigned long long v39;  // x16
    unsigned long long v40;  // x0
    unsigned long long v41;  // x13
    unsigned long long v6;  // x13
    unsigned long long v42;  // x13
    unsigned long long v43;  // x13
    unsigned long long v44;  // x13
    unsigned long long v45;  // x13
    unsigned long long v46;  // x14
    unsigned int v47;  // w13
    unsigned long long v48;  // x14
    unsigned long long v49;  // x17
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v7;  // x10
    unsigned long long v52;  // x15
    unsigned long long v53;  // x14
    unsigned long long v54;  // x15
    unsigned long long v55;  // x17
    unsigned long long v56;  // x14
    unsigned long long v57;  // x14
    char v58;  // x15
    unsigned short v59;  // x15
    unsigned int v60;  // w16
    unsigned int v61;  // w11
    unsigned long long v8;  // x11
    unsigned short v62;  // x11
    unsigned int v63;  // w14
    unsigned int v64;  // w12
    unsigned int v65;  // w11
    unsigned int v66;  // w12
    unsigned short v67;  // x14
    unsigned int v68;  // w11
    unsigned int v69;  // w12
    unsigned int v70;  // w13
    unsigned int v71;  // w11
    unsigned long long v9;  // x11
    unsigned int v72;  // w10
    unsigned short v73;  // x12
    unsigned long long v10;  // x12
    unsigned long long v11;  // x12
    st_4d9388_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4d9388_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f045b0 + ~(~&g_f045b0 + &g_f045b0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (char *)v5 - (v5 & v4) + 1 + (char *)v5 + 0x2 * ~v5 + 1 + (v4 | ~(st_4d9388_0 **)((char *)v5 + 0x2 * ~v5 + 1));
    v7 = v5 | v4;
    v8 = (v5 + v4 ^ -v7) + (v5 + v4 & -v7) * 2;
    v9 = v7 + v8 + 1;
    v10 = v9 + ~v8 * 2;
    v11 = v6 - (v10 + (v6 & ~v10) * 2);
    v12 = ~(v11 - (((0xfffffffffffffffe - v10 | 1) + (v9 & 1) + v6 & -((0xfffffffffffffffe - v10 | 1) + (v9 & 1) | v6)) * 4 + ((0xfffffffffffffffe - v10 | 1) + (v9 & 1) + v6 ^ -((0xfffffffffffffffe - v10 | 1) + (v9 & 1) | v6)) * 2) + (((0xfffffffffffffffe - v10 | 1) + (v9 & 1) + v6 & -((0xfffffffffffffffe - v10 | 1) + (v9 & 1) | v6)) * 4 + ((0xfffffffffffffffe - v10 | 1) + (v9 & 1) + v6 ^ -((0xfffffffffffffffe - v10 | 1) + (v9 & 1) | v6)) * 2) * 2) + (v11 - (((0xfffffffffffffffe - v10 | 1) + (v9 & 1) + v6 & -((0xfffffffffffffffe - v10 | 1) + (v9 & 1) | v6)) * 4 + ((0xfffffffffffffffe - v10 | 1) + (v9 & 1) + v6 ^ -((0xfffffffffffffffe - v10 | 1) + (v9 & 1) | v6)) * 2) + (((0xfffffffffffffffe - v10 | 1) + (v9 & 1) + v6 & -((0xfffffffffffffffe - v10 | 1) + (v9 & 1) | v6)) * 4 + ((0xfffffffffffffffe - v10 | 1) + (v9 & 1) + v6 ^ -((0xfffffffffffffffe - v10 | 1) + (v9 & 1) | v6)) * 2) * 2) * 2;
    v13 = v12 * 2;
    v0 = (~(unsigned int)v13 & 100552) - v12 + ((v12 & 50276) + v12) * 2 + 0xffffffffffff3b9c;
    v1 = (v12 ^ 15259) + (v13 & 30518);
    v14 = ((unsigned int)v1 + v0 ^ -((unsigned int)v1 | v0)) + ((unsigned int)v1 | v0) + ((unsigned int)v1 + v0 & -((unsigned int)v1 | v0)) * 2;
    g_f120a8 = (unsigned short)v14 + (unsigned short)v3 + ((unsigned short)v14 | (unsigned short)v3) + ((unsigned short)v14 + (unsigned short)v3 + ((unsigned short)-(v14 | (unsigned int)v3) | (unsigned short)~(v14 + (unsigned int)v3)) + ((unsigned short)-(v14 | (unsigned int)v3) & (unsigned short)~(v14 + (unsigned int)v3))) * 2 + 2;
    v15 = v1;
    v16 = v0;
    v17 = v16 & v15;
    v18 = v15 - v16 + v17 + (v16 & ~v15) * 2;
    v19 = v15 + 1;
    v20 = v19 + ~v15 * 2 | v16;
    v21 = -((v20 ^ v19) + (v20 & v19) * 2);
    v22 = v19 - (v16 + v17 + (v15 + ~(v16 | v15) ^ v16 + ~v16 * 2)) + ((v15 + ~(v16 | v15) & v16 + 1) - (v15 & ~v16)) * 2 + (v21 ^ v18) + (v21 & v18) * 2;
    v23 = v22 + (2 - v22 | 1) + (v22 - 3 | 1);
    v24 = (unsigned int)v23 * 2 - 4 & 26;
    v0 = (v23 - 15 | 0xfffffffffffffffe) + (v24 + v23 - 15 + (v24 ^ 26) | 1);
    v1 = v23 + 2;
    v25 = v3 >> ((char)v1 + (char)v0 & 63);
    v26 = v1;
    v27 = v0;
    v28 = v27 + 1;
    v29 = v28 + ~v27 * 2;
    v30 = (v27 | v26) + ((v29 | v26) ^ v28) + ((v29 | v26) & v28) * 2 + ~(((v29 | v26) ^ v28) + ((v29 | v26) & v28) * 2) * 2;
    v31 = (v30 + 2 ^ (v29 & v26 | v27 & ~v26)) + ((v29 & v26 | v27 & ~v26) + (v30 + 1 & (v29 & v26 | v27 & ~v26) + ~(v29 & v26 | v27 & ~v26) * 2 + 1) - (v30 + 1 + (v30 + 1 | v29 & v26 | v27 & ~v26)) + (v30 + 2 & (v29 & v26 | v27 & ~v26))) * 2;
    v32 = v31 - 2;
    v33 = 1 - v31;
    v34 = v31 - 1;
    v35 = (v34 + v33 * 2 + 52952 + (~((unsigned int)v34 + (unsigned int)v33 * 2) | 0xffffffffffff3128) ^ -(v34 + v33 * 2)) + (v34 + v33 * 2 + 52952 + (~((unsigned int)v34 + (unsigned int)v33 * 2) | 0xffffffffffff3128) & -(v34 + v33 * 2)) * 2;
    v0 = (v32 ^ 12585) + ((v33 | 12585) + v34) * 2 - 1;
    v1 = (v35 ^ (v32 & 0xffffffffffff3128) + 52952) + (v35 & (v32 & 0xffffffffffff3128) + 52952) * 2 - 1;
    v36 = ((unsigned int)v1 + 1 ^ v0) + (v0 + ((unsigned int)v1 + 1 | ~v0)) * 2;
    g_f120aa = ((unsigned short)v36 + 2 ^ (unsigned short)v25) + ((unsigned short)v36 + 2 & (unsigned short)v25) * 2 + (unsigned short)~(v36 + 1 | v25);
    v37 = v1;
    v38 = v0;
    v39 = v37 + 1 + v38 + (v38 + ~v37 & -(v38 | ~v37)) * 4 + ((-v38 | ~v37) + v37 + 1) * 2 + ((v38 + ~v37 ^ -(v38 | ~v37)) + (-v38 & ~v37)) * 2;
    v40 = (v38 ^ 1) + ~v38 * 2 + ((v38 * 2 | v38 >> 63) & 2 & 3);
    v41 = (v38 ^ -v37) + (v38 - (v37 + (v38 | -v37))) * 2;
    v42 = v41 + ((v40 + v37 & -(v40 | v37)) * 4 + (v40 + v37 ^ -(v40 | v37)) * 2 | ~v41) + ((v40 + v37 & -(v40 | v37)) * 4 + (v40 + v37 ^ -(v40 | v37)) * 2 | v41) + 1;
    v43 = v42 * 3 + ~v42 * 4 + 3;
    v44 = v39 + (v43 | -v39) + (v43 | ~v39 + v39 * 2);
    v0 = v44 + 19;
    v1 = v44 + 15;
    v45 = v0 | v1;
    v46 = (v1 + v0 ^ -v45) + (v1 + v0 & -v45) * 2;
    v47 = v3 >> ((char)v46 + ((char)v45 | (char)~v46) + ((char)v46 | (char)v45) + 1 & 63);
    v48 = v1;
    v49 = (v48 ^ 1) + ~v48 * 2 + ((v48 * 2 | v48 >> 63) & 2 & 3);
    v50 = v48 - v0 - (v0 ^ -v48) + (v0 - (v0 | v48) + ~v0 - (-v48 | ~v0)) * 2 + (v49 + v0 & -(v49 | v0)) * 4 + (v49 + v0 ^ -(v49 | v0)) * 2 + ((v49 + v0 & -(v49 | v0)) * 4 + (v49 + v0 ^ -(v49 | v0)) * 2 | ~(v48 - v0)) + (v48 - v0 & ~((v49 + v0 & -(v49 | v0)) * 4 + (v49 + v0 ^ -(v49 | v0)) * 2)) + 1;
    v51 = (v50 + ~v50 * 2 ^ ~(v50 + ~v50 * 2 + 23221 + (~((unsigned int)v50 + (unsigned int)~v50 * 2 + 1) | 0xffffffffffffa54c))) + (v50 + ~v50 * 2 + 23221 + (~((unsigned int)v50 + (unsigned int)~v50 * 2 + 1) | 0xffffffffffffa54c) & ~(v50 + ~v50 * 2)) * 2;
    v52 = (v51 ^ (v50 | 23219) + 1) + (v51 & (v50 | 23219) + 1) * 2;
    v0 = ~v52 + v52 * 2;
    v1 = ((84634 & v50 * 2) + (v50 ^ 42317) | 1) + (v50 ^ 42317 | 0xfffffffffffffffe);
    g_f120ac = (unsigned short)v47 + (unsigned short)~v47 * 2 + (unsigned short)~(v47 + ~v47 * 2 + 1) * 2 + ((unsigned short)~v47 * 2 + ((unsigned short)v47 ^ 1) + ((unsigned short)(__ROL__(v47, 1)) & 2 & 3) | (((unsigned short)v1 + 1 ^ (unsigned short)v0) + ((unsigned short)v1 + 1 & (unsigned short)v0) * 2 | 1) + ((unsigned short)v1 + 1 ^ (unsigned short)v0 | 0xfffe)) + 3;
    v53 = v1;
    v54 = v0;
    v55 = -(((v54 | ~v53) ^ v53 + 1) + ((v54 | ~v53) & v53 + 1) * 2);
    v56 = v54 - (v53 + (v54 + (0xffffffffffffffff ^ v54 * 2) + v53 & -(v54 + (0xffffffffffffffff ^ v54 * 2) | v53)) * 4 + (v54 + (0xffffffffffffffff ^ v54 * 2) + v53 ^ -(v54 + (0xffffffffffffffff ^ v54 * 2) | v53)) * 2) + ((v54 + (0xffffffffffffffff ^ v54 * 2) + v53 & -(v54 + (0xffffffffffffffff ^ v54 * 2) | v53)) * 4 + (v54 + (0xffffffffffffffff ^ v54 * 2) + v53 ^ -(v54 + (0xffffffffffffffff ^ v54 * 2) | v53)) * 2) * 2;
    v57 = (v55 ^ (v54 | v53)) + ((v54 | v53) + (v55 | ~(v54 | v53))) * 2 + (v56 ^ 1) - v56 * 4 + v56 * 2 + (v56 * 2 & 2);
    v0 = v57 + 4;
    v1 = (v57 + 1 ^ 46) + (92 & (v57 + 1) * 2) - 1;
    v58 = ((char)v1 ^ 1) + (char)v1 * 2 + (char)~v1 * 4 + ((char)v1 * 2 & 2);
    g_f120ae = v3 >> (v58 + (char)v0 + ((char)v0 + ((char)(0xfffffffffffffffe - v58) | (char)~v0) + ((char)(0xfffffffffffffffe - v58) & (char)~v0)) * 2 + 3 & 63);
    v59 = (g_f120a8 + ~g_f120a8 * 2 + 1 & g_f045b0) + g_f120a8;
    v60 = g_f120a8 + g_f045b0;
    v61 = -(g_f045b0 | g_f120a8);
    v62 = -((v60 ^ v61) + (v60 & v61) * 2);
    g_f045b0 = (v62 ^ v59) + (v62 & v59) * 2;
    v63 = (g_f045b2 ^ 1) + ~g_f045b2 * 2 + (__ROL__(g_f045b2, 1) & 2 & 3) & g_f120aa;
    v64 = -g_f120aa;
    v65 = (v64 ^ g_f045b2) + (g_f045b2 + (v64 | ~g_f045b2)) * 2 + 2;
    v66 = (0xffffffff ^ v63 * 2) + v63 * 4 + 2;
    g_f045b2 = (unsigned short)~((v66 ^ v65) + (v66 & v65) * 2) + (((unsigned short)v66 ^ (unsigned short)v65) + ((unsigned short)v66 & (unsigned short)v65) * 2) * 2;
    v67 = g_f120ac + 1;
    v68 = g_f045b4 + 1;
    v69 = v68 + ~g_f045b4 * 2 | g_f120ac;
    g_f045b4 = v67 + (unsigned short)v68 + (v67 + ~g_f120ac * 2 | ~g_f045b4) + ((unsigned short)v69 ^ (unsigned short)v68) + ((unsigned short)v69 & (unsigned short)v68) * 2 + (unsigned short)~((v69 ^ v68) + (v69 & v68) * 2) * 2 + 1;
    v70 = -g_f120ae;
    v71 = g_f045b6 + 1;
    v72 = v71 + g_f120ae + (v70 & ~g_f045b6) * 2 + ((v70 | ~g_f045b6) + v71) * 2;
    v73 = (g_f120ae & ~g_f045b6) * 2;
    g_f045b6 = (v73 | (unsigned short)-v72) + (unsigned short)v72 + ((unsigned short)(v72 - 1) | v73);
    g_f045b8 = g_f045b8 - v3 + ((g_f045b8 ^ 1) + ~g_f045b8 * 2 + ((g_f045b8 * 2 | g_f045b8 >> 63) & 2 & 3) & v3) * 2;
    return v1 * 2 & 2;
}

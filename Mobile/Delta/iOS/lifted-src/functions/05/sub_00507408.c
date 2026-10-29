/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x507408..0x507c74 (2156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_507408_0 {
    char field_0;
} st_507408_0;

extern unsigned short g_f04650;
extern unsigned short g_f04652;
extern unsigned short g_f04654;
extern unsigned short g_f04656;
extern unsigned long long g_f04658;
extern unsigned short g_f120f8;
extern unsigned short g_f120fa;
extern unsigned short g_f120fc;
extern unsigned short g_f120fe;

unsigned long long sub_507408(void)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x8
    unsigned long long v14;  // x15
    unsigned int v15;  // w12
    unsigned long long v16;  // x12
    unsigned long v17;  // x13
    unsigned long long v18;  // x14
    unsigned long long v19;  // x16
    unsigned long long v20;  // x15
    unsigned long long v21;  // x12
    unsigned long long v22;  // x12
    unsigned long long v23;  // x12
    st_507408_0 *v6;  // x11
    unsigned int v24;  // w12
    unsigned long long v25;  // x14
    unsigned long long v26;  // x15
    unsigned long long v27;  // x2
    unsigned long long v28;  // x16
    unsigned long long v29;  // x14
    unsigned long long v30;  // x14
    unsigned long long v31;  // x14
    unsigned long long v32;  // x15
    unsigned long long v33;  // x17
    st_507408_0 **v7;  // x12
    unsigned long v34;  // x14
    unsigned int v35;  // w14
    unsigned int v36;  // w15
    unsigned int v37;  // w14
    unsigned int v38;  // w14
    unsigned short v39;  // x14
    unsigned short v40;  // x15
    unsigned short v41;  // x12
    unsigned long long v42;  // x14
    unsigned long long v43;  // x0
    unsigned long long v8;  // x14
    unsigned long long v44;  // x14
    unsigned long long v45;  // x14
    unsigned long long v46;  // x13
    unsigned int v47;  // w13
    unsigned long v48;  // x14
    unsigned long long v49;  // x15
    unsigned long long v50;  // x17
    unsigned long long v51;  // x16
    unsigned long long v52;  // x14
    unsigned long v53;  // x2
    unsigned long long v9;  // x13
    unsigned long long v54;  // x14
    unsigned int v55;  // w15
    unsigned long long v56;  // x14
    unsigned long long v57;  // x14
    unsigned int v58;  // w14
    unsigned short v59;  // x11
    unsigned int v60;  // w14
    unsigned int v61;  // w13
    unsigned int v62;  // w13
    unsigned int v63;  // w11
    unsigned long v10;  // x11
    unsigned int v64;  // w13
    unsigned int v65;  // w11
    unsigned long long v66;  // x12
    unsigned long v67;  // x8
    unsigned long long v68;  // x9
    unsigned long long v11;  // x11
    unsigned long long v12;  // x11
    unsigned long long v13;  // x12
    st_507408_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    char v1;  // [bp-0x10]
    st_507408_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long
    unsigned long v3;  // [bp-0x8]

    v2 = &v0;
    v0 = &v2;
    v4 = 0xff51afd7ed558ccd * ((char *)&g_f04650 + ~(~&g_f04650 + &g_f04650));
    v5 = ((v4 | v4 >> 29) ^ ~v4 - (v4 >> 29 | ~v4)) + ((v4 | v4 >> 29) & ~v4 - (v4 >> 29 | ~v4)) * 2;
    v6 = v2;
    v7 = v0;
    v8 = v7 + v6 + (-v7 & ~v6) * 2 + (v6 - v7 - (v6 | -v7)) * 2;
    v9 = (0xffffffffffffffff ^ (v7 & ~v6) * 2) + (v7 & ~v6) * 4 + 2;
    v10 = v6 - v7 + ((char *)v7 + 0x2 * ~v7 + 1 & v6) * 2 + (0xffffffffffffffff ^ ((char *)v7 + 0x2 * ~v7 + 1 & v6) * 4);
    v11 = ~(v10 + (v8 ^ v9) + (v8 & v9) * 2) + (v10 + (v8 ^ v9) + (v8 & v9) * 2) * 2;
    v12 = ~((v11 * 2 & 4) + (v11 ^ 2)) + ((v11 * 2 & 4) + (v11 ^ 2)) * 2;
    v13 = v12 * 2;
    v14 = (v12 + 25874 ^ -(v12 | 25874)) + (v12 + 25874 & -(v12 | 25874)) * 2;
    v0 = v12 + (v13 & 79324) + (v13 & 79324 ^ 79324) + 0xffffffffffff6511;
    v2 = (v14 & 25874 - (v12 + (v12 & 25874) - (v13 | 0xffffffffffff35db))) + v12 + (v12 & 25874) - (v13 | 0xffffffffffff35db) + 0xffffffffffff9aed + (v12 + (v12 & 25874) - (v13 | 0xffffffffffff35db) + 0xffffffffffff9aed & v14);
    v15 = (unsigned int)v5 + ~(unsigned int)v5 * 2;
    g_f120f8 = (unsigned short)v15 + (unsigned short)v15 + 1 + (unsigned short)~(v15 + 1) * 2 + (unsigned short)v2 + v0 + ((unsigned short)v2 + v0 + (unsigned short)~((unsigned int)v2 + v0) * 2 + 1 | (unsigned short)~(v15 + 1)) + 4;
    v16 = v2;
    v17 = v0;
    v18 = v16 - v17 + (v17 & v16) + (v17 & ~v16) * 2;
    v19 = v17 | v16;
    v20 = -((v17 + v16 ^ -v19) + (v17 + v16 & -v19) * 2);
    v21 = (v17 + ~v17 * 2 + 1 | v16) + v17;
    v22 = (v21 ^ v19) + (v20 ^ v18) + (v18 + (v20 | ~v18) - (v19 & ~v21)) * 2;
    v23 = v22 + (v22 + 2 | 1) + (~(v22 + 2) | 1) + 3;
    v0 = (v23 ^ 11 | 0xfffffffffffffffe) + ((v23 ^ 11) + (v23 + (11 | ~v23)) * 2 + 2 & 0xfffffffffffffffe) + 1;
    v2 = ~((v23 | 1) + (v23 & 1) + 6) + ((v23 | 1) + (v23 & 1) + 6) * 2;
    v24 = v5 >> ((char)(v0 + (v2 ^ 0xfffffffffffffffe) - ~v2 * 2 - ((v2 * 2 | v2 >> 63) & 2 & 3)) & 63);
    v25 = v2;
    v26 = v0;
    v27 = v26 | v25;
    v28 = v25 - v26 + (v26 & v25) + (v26 & ~v25) * 2 + (v27 - 1 ^ v26 + v25) - (v26 + v25 & -v27) * 2;
    v29 = ((v26 + 1 + ~v26 * 2 | v25) ^ v26 + 1) + ((v26 + 1 + ~v26 * 2 | v25) & v26 + 1) * 2;
    v30 = v29 + v27 + (-v29 & ~v27) * 2 + (v27 - v29 - (v27 | -v29)) * 2;
    v31 = (0xfffffffffffffffe - v28 - (0xfffffffffffffffe - v28 | -v30) ^ (v28 + 1 | -v30)) + (~(v28 + 1 - v30) - (v30 - 1 | 0xfffffffffffffffe - v28) & v28 + 1 - v30) * 4 + ((~(v28 + 1 - v30) - (v30 - 1 | 0xfffffffffffffffe - v28) ^ v28 + 1 - v30) + (0xfffffffffffffffe - v28 - (0xfffffffffffffffe - v28 | -v30) & (v28 + 1 | -v30))) * 2;
    v32 = v31 + 45962 + (~(unsigned int)v31 | 0xffffffffffff4c76);
    v33 = (v31 + 19574 ^ -(v31 | 19574)) + (v31 + 19574 & -(v31 | 19574)) * 2;
    v34 = v31 + (v31 & 19574) + 0xffffffffffffb38a + ((0xffffffff ^ (unsigned int)v31 * 2) & 39148);
    v0 = (v31 | 0xffffffffffff4c76) + (0xffffffffffff4c75 - (v31 | 0xffffffffffff4c76) | v32) + ((v31 | 0xffffffffffff4c76) + 45962 | v32) + 45963;
    v2 = v33 + (v34 | ~v33) + (v34 | v33) + 1;
    v35 = v0;
    v36 = v2;
    v37 = v36 + 1 + v35 + 1 + v36 + 1 + ~v36 * 2 + (v35 + 1 + ~v35 * 2 & ~(v36 + 1 + ~v36 * 2));
    v38 = (v37 ^ v36 & v35) + (v37 & v36 & v35) * 2;
    v39 = (unsigned short)~v38 + (unsigned short)v38 * 2;
    v40 = (unsigned short)v24 + (v39 | (unsigned short)~v24) + (v39 | (unsigned short)v24) + 1;
    v41 = v39 - (v24 + (v39 & v24) + (v39 & ~v24) * 2);
    g_f120fa = (v41 ^ v40) + (v41 & v40) * 2;
    v42 = v2;
    v43 = v42 + 1;
    v44 = (v43 + ~v42 * 2 | v0) + v42;
    v45 = (v0 | ~v42) + v43 + v44 + ~v44 * 2 + 1;
    v46 = ((v45 | 0xfffffffffffffff4) + 12 ^ (v45 | 11) + 1) + ((v45 | 0xfffffffffffffff4) + 12 & (v45 | 11) + 1) * 2;
    v0 = ~v46 + v46 * 2;
    v2 = ((v45 & 21) + v45) * 2 - (v45 + (0xffffffffffffffd5 | v45 * 2)) - 22;
    v47 = v5 >> ((char)v2 + 1 + (char)v0 + ((char)v2 + (char)v0 ^ (char)-(v2 | v0)) + ((char)v2 + (char)v0 & (char)-(v2 | v0)) * 2 + ((char)v2 + 1 + (char)~v2 * 2 | (char)~v0) & 63);
    v48 = v2;
    v49 = v0;
    v50 = v48 + 1 + v49 + (-v49 & ~v48) * 2 + ((-v49 | ~v48) + v48 + 1) * 2;
    v51 = ((v48 + (0xffffffffffffffff ^ v48 * 2) + v49 & -(v48 + (0xffffffffffffffff ^ v48 * 2) | v49)) * 4 + (v48 + (0xffffffffffffffff ^ v48 * 2) + v49 ^ -(v48 + (0xffffffffffffffff ^ v48 * 2) | v49)) * 2 | -v50) + v50 + ((v48 + (0xffffffffffffffff ^ v48 * 2) + v49 & -(v48 + (0xffffffffffffffff ^ v48 * 2) | v49)) * 4 + (v48 + (0xffffffffffffffff ^ v48 * 2) + v49 ^ -(v48 + (0xffffffffffffffff ^ v48 * 2) | v49)) * 2 | v50 - 1);
    v52 = v49 - v48 + (v49 - v48 - (v49 | ~v48) ^ v48 + ~v49) * 2 + (v49 - v48 - (v49 | ~v48) & v48 + ~v49) * 4;
    v53 = v51 ^ v52;
    v54 = v53 + ((-v52 | ~v51) & v51 + 1) * 4 + ((v51 & v52) + ((-v52 | ~v51) ^ v51 + 1) + v51 + 1 + ~v51 * 2 + (-v52 | ~(v51 + 1 + ~v51 * 2))) * 2 + 2;
    v0 = (v53 & 1) + 23815 + (v54 | 1);
    v2 = (v54 & 0xfffffffffffffffe | v53 & 1) + 41719;
    v55 = v47 * 2 + ~v47 * 4 + (v47 ^ 1) + (v47 * 2 & 2);
    g_f120fc = (unsigned short)v55 + (unsigned short)v2 + (unsigned short)v0 + (unsigned short)v47 + (unsigned short)~(v55 + 65538 & (unsigned int)v2 + (unsigned int)v0) + 4;
    v56 = (((v2 | ~v0) ^ v0 + 1) - (v2 | v0) + ((v2 | ~v0) & v0 + 1) * 2 ^ v2 - v0 + ((v2 | v0) + ~v2) * 2 + 2) + (((v2 | ~v0) ^ v0 + 1) - (v2 | v0) + ((v2 | ~v0) & v0 + 1) * 2 & v2 - v0 + ((v2 | v0) + ~v2) * 2 + 2) * 2;
    v57 = (-v56 | 1) + v56 + (v56 - 1 | 1);
    v1 = (v57 | 1) + (v57 & 1) + 25;
    v3 = (v57 ^ 23) + (46 & v57 * 2) - 1;
    g_f120fe = v5 >> ((char)v3 + v1 & 63);
    g_f04650 = (g_f04650 | g_f120f8) + (unsigned short)~((g_f04650 + ~g_f04650 * 2 + 1 | g_f120f8) + g_f04650);
    v58 = (g_f120fa + ~g_f120fa * 2 + 1 & g_f04652) + g_f120fa;
    v59 = -(g_f120fa & g_f04652);
    g_f04652 = ((unsigned short)v58 ^ v59) + ((unsigned short)v58 + (v59 | (unsigned short)~v58)) * 2 + 2;
    v60 = g_f04654 + 1;
    v61 = v60 + ~g_f04654 * 2;
    v62 = v61 + v60 + (g_f120fc | ~v61);
    v63 = g_f120fc & g_f04654;
    g_f04654 = (unsigned short)v63 + (unsigned short)v62 + ((unsigned short)(v62 - v63 - (v62 | -v63 & 0xffff)) + ((unsigned short)-v63 & (unsigned short)~v62)) * 2;
    v64 = (g_f120fe + ~g_f120fe * 2 + 1 & g_f04656) + g_f120fe;
    v65 = (g_f04656 | ~g_f120fe) + g_f120fe;
    g_f04656 = ((unsigned short)v65 ^ (unsigned short)~v64) + ((unsigned short)v64 & (unsigned short)~v65) * 2;
    v66 = v5 & ~g_f04658;
    v67 = g_f04658 - v5;
    v68 = (0xffffffffffffffff ^ v66 * 2) + v66 * 4 + 2;
    g_f04658 = (v68 ^ v67) + (v68 & v67) * 2 - 1;
    return (v2 | ~v0) & v0 + 1;
}

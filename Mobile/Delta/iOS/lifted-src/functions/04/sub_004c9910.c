/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c9910..0x4ca394 (2692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c9910_0 {
    char field_0;
} st_4c9910_0;

extern unsigned short g_f045c0;
extern unsigned short g_f045c2;
extern unsigned short g_f045c4;
extern unsigned short g_f045c6;
extern unsigned long long g_f045c8;
extern unsigned short g_f120b0;
extern unsigned short g_f120b2;
extern unsigned short g_f120b4;
extern unsigned short g_f120b6;
extern unsigned long g_fffffffffffffff0;

unsigned int sub_4c9910(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned short v13;  // x11
    unsigned long long v103;  // x8
    unsigned short v14;  // x11
    unsigned long long v15;  // x10
    unsigned long long v16;  // x12
    unsigned long long v17;  // x13
    unsigned long long v18;  // x15
    unsigned long long v19;  // x1
    unsigned long v20;  // x0
    unsigned long long v21;  // x2
    unsigned long long v22;  // x12
    st_4c9910_0 *v5;  // x10
    unsigned long long v23;  // x12
    unsigned long long v24;  // x13
    unsigned long long v25;  // x12
    unsigned long long v26;  // x12
    unsigned long long v27;  // x15
    unsigned long long v28;  // x16
    unsigned long long v29;  // x17
    unsigned long long v30;  // x0
    unsigned long long v31;  // x15
    unsigned int v32;  // w12
    st_4c9910_0 **v6;  // x11
    unsigned long v33;  // x13
    unsigned long v34;  // x15
    unsigned long long v35;  // x16
    unsigned long long v36;  // x15
    unsigned long long v37;  // x13
    unsigned long long v38;  // x13
    unsigned long long v39;  // x13
    unsigned long long v40;  // x13
    unsigned long v41;  // x13
    unsigned int v42;  // w13
    unsigned long long v7;  // x12
    unsigned int v43;  // w17
    unsigned long v45;  // x15
    unsigned long long v46;  // x16
    unsigned long long v47;  // x17
    unsigned long long v48;  // x0
    unsigned long long v49;  // x17
    unsigned long long v50;  // x0
    unsigned long long v51;  // x2
    unsigned long long v52;  // x0
    unsigned long long v8;  // x13
    unsigned long long v53;  // x15
    unsigned long long v54;  // x1
    unsigned long long v55;  // x16
    unsigned long long v56;  // x15
    unsigned long long v57;  // x15
    unsigned long long v58;  // x16
    unsigned long long v59;  // x15
    unsigned long long v60;  // x0
    unsigned long long v61;  // x17
    char v62;  // x16
    unsigned long long v9;  // x13
    unsigned int v63;  // w15
    unsigned long long v64;  // x16
    unsigned long long v65;  // x17
    unsigned long long v66;  // x0
    unsigned long long v67;  // x1
    unsigned long long v68;  // x14
    unsigned long long v69;  // x16
    unsigned long long v70;  // x14
    unsigned int v71;  // w14
    unsigned int v72;  // w16
    unsigned long long v10;  // x10
    unsigned int v73;  // w14
    unsigned long long v74;  // x15
    unsigned long long v75;  // x16
    unsigned long long v76;  // x17
    unsigned long long v77;  // x0
    unsigned long long v78;  // x15
    unsigned long long v79;  // x15
    unsigned long long v80;  // x16
    unsigned long long v81;  // x17
    unsigned long long v82;  // x1
    unsigned long long v11;  // x10
    unsigned long long v83;  // x3
    unsigned long long v84;  // x15
    unsigned long long v85;  // x15
    unsigned short v86;  // x17
    unsigned int v87;  // w2
    unsigned int v88;  // w0
    unsigned int v89;  // w0
    unsigned int v90;  // w1
    unsigned short v91;  // x11
    unsigned short v92;  // x16
    unsigned long long v12;  // x10
    unsigned int v93;  // w16
    unsigned int v94;  // w11
    unsigned int v95;  // w14
    unsigned int v96;  // w16
    unsigned int v97;  // w14
    unsigned int v98;  // w11
    unsigned int v99;  // w13
    unsigned int v100;  // w14
    unsigned int v101;  // w11
    unsigned long long v102;  // x13
    st_4c9910_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4c9910_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f045c0 + ~(~&g_f045c0 + &g_f045c0));
    v4 = ((v3 | v3 >> 29) ^ ~v3 - (v3 >> 29 | ~v3)) + ((v3 | v3 >> 29) & ~v3 - (v3 >> 29 | ~v3)) * 2;
    v5 = v1;
    v6 = v0;
    v7 = v6 | v5;
    v8 = -((v6 + v5 ^ -v7) + (v6 + v5 & -v7) * 2);
    v9 = v6 * 3 + ~v6 * 4 + 3 & v5;
    v10 = v6 - v5;
    v11 = (v10 * 2 | v10 >> 63) & 2 & 3;
    v12 = ((v8 ^ v7) + (v7 + (v8 | ~v7)) * 2 + 2 | (v10 + v9 * 4 + 1 + ~(v9 * 2) ^ 1) + v11 + (v9 * 2 - (v10 + v9 * 4 + 1)) * 2) + ((v10 + v9 * 4 + 1 + ~(v9 * 2) ^ 1) + v11 + (v9 * 2 - (v10 + v9 * 4 + 1)) * 2 & (v8 ^ v7) + (v7 + (v8 | ~v7)) * 2 + 2);
    v0 = v12 + 52712;
    v1 = v12 + 1 + (v12 + 12825 ^ -(v12 + 1 | 12824)) + (v12 + 12825 & -(v12 + 1 | 12824)) * 2 + ((unsigned int)v12 + 1 + ~((unsigned int)v12 + 1) * 2 + 1 | 0xffffffffffffcde7) + 12825;
    v13 = (unsigned short)(((unsigned int)v1 ^ 0xfffffffe) + (unsigned int)v1 * 2 - ((unsigned int)v1 * 2 & 2)) + 3;
    v14 = ((unsigned short)((v0 & 0xffffffff) - v13) + ((unsigned short)v0 + (v13 | (unsigned short)~(unsigned int)v0) + (v13 & (unsigned short)~(unsigned int)v0)) * 2 + 2 | 1) + ((unsigned short)((v0 & 0xffffffff) - v13) | 0xfffe);
    v15 = ~v4 * 2;
    g_f120b0 = (unsigned short)((unsigned int)v4 + (unsigned int)v15 + 1 + v4 - v14) + (v14 & (unsigned short)v4 + (unsigned short)v15 + 1) + (v14 & (unsigned short)~((unsigned int)v4 + (unsigned int)v15 + 1)) * 2 + 1;
    v16 = v1;
    v17 = v0;
    v18 = ((v17 + ~v16 + (v16 & ~v17)) * 2 + 3 ^ v16 - v17) + ((v17 + ~v16 + (v16 & ~v17)) * 2 + 3 & v16 - v17) * 2;
    v19 = v17 + v16;
    v20 = v19 + (0xffffffffffffffff ^ v17 * 2);
    v21 = ~(v20 + (v17 | ~v16));
    v22 = v17 + (-v16 | ~v17) + (-v16 & ~v17);
    v23 = (v19 + v22 * 2 + 2 | (v20 + v21) * 2) + ((v20 + v21) * 2 & v19 + v22 * 2 + 2);
    v24 = (v18 - 1 | -v23) - v18 + (v23 - 1 & v18 - 1) + 1;
    v25 = (v23 + 1 + ~v23 * 2 | 1) + (v23 + 1 & 1) | -v18;
    v26 = v24 + (v25 ^ v18) * 2 + (v25 & v18) * 4;
    v27 = ~v26;
    v28 = v26 + 1;
    v29 = v28 + v27 * 2;
    v30 = (v24 | 0xfffffffffffffffe) + v26 + v29 + 3;
    v31 = ((v27 | 15) ^ v28) + ((v27 | 15) & v28) * 2;
    v0 = (v30 ^ (v24 & 1) - (v26 ^ 0xfffffffffffffffe)) + (v30 & (v24 & 1) - (v26 ^ 0xfffffffffffffffe)) * 2 - 1;
    v1 = v31 + (((v29 | &g_fffffffffffffff0) & v26 + 16) + (v29 | &g_fffffffffffffff0 | v26) | ~v31) + (((v29 | &g_fffffffffffffff0) & v26 + 16) + (v29 | &g_fffffffffffffff0 | v26) | v31) + 1;
    v32 = v4 >> (((char)v1 + v0 ^ (char)-(v1 | v0)) + ((char)v1 | v0) + ((char)v1 + v0 & (char)-(v1 | v0)) * 2 & 63);
    v33 = v1;
    v34 = v0;
    v35 = (v34 | v33) - (v34 + v33 & -(v34 | v33)) * 2 + ((v34 | v33) - 1 ^ v34 + v33) + 1;
    v36 = (v33 + ~v34 + (v34 & ~v33)) * 2 + 3;
    v37 = (v36 ^ v34 - v33) + (v36 & v34 - v33) * 2 - 1;
    v38 = (v37 ^ 1) + v37 * 2 + (0xffffffffffffffff ^ v37 * 4) + (v37 * 2 & 2);
    v39 = (v38 ^ v35) + (v38 & v35) * 2 - 1;
    v40 = (v39 * 2 & 4) + (v39 ^ 2);
    v41 = v40 + (v40 - 1 & 21882) + 0xffffffffffffaa85 + ((0xffffffff ^ (unsigned int)(v40 - 1) * 2) & 43764);
    v0 = v40 + 43652;
    v1 = v41 + (v40 + (-v40 & 0xffffffffffffaa85)) * 2 + (v41 | 0xffffffffffffaa85 - (v40 + (-v40 & 0xffffffffffffaa85))) + (0xffffffffffffaa85 - (v40 + (-v40 & 0xffffffffffffaa85)) | ~v41) + 43766;
    v42 = v0;
    v43 = v42 + ~v42 * 2 + 1;
    g_f120b2 = (unsigned short)v32 * 2 + ((unsigned short)v32 ^ 0xfffe) + (unsigned short)~(((v42 & ~(unsigned int)v1) - ((unsigned int)v1 | ~v43) - (v43 + v42 * 2) + 0xfffe & v32) + (v32 * 2 & 2)) + 3;
    v45 = v1;
    v46 = v0;
    v47 = (v45 ^ -v46) + (v45 + (-v46 | ~v45)) * 2 + 2;
    v48 = (((v45 ^ 1) + v45 * 2 + ~v45 * 4 + (v45 * 2 & 2) + 2 | ~v46) + v46) * 2;
    v49 = v48 + 2 + v47 * 2 + (v48 + 2 | ~v47) + (0xfffffffffffffffd - v48 | ~v47) + 2;
    v50 = v46 * 2;
    v51 = v46 + v45;
    v52 = v50 - (v51 + (v46 | ~v45));
    v53 = v51 + (v46 + (-v45 | ~v46)) * 2 + (v52 & v51 + ~v50) * 4 + ((v52 ^ v51 + ~v50) + (-v45 & ~v46)) * 2;
    v54 = v49 + ~v49 * 2 + 1;
    v55 = (v49 ^ v53 + 2) + (v49 & v53 + 2) * 2 + (v54 + (0xfffffffffffffffe - v53 | ~v54)) * 2;
    v56 = (v49 - v53 + (v54 & v53 + 9223372036854775809)) * 2 - 2;
    v57 = v55 + (v56 | ~(v55 + 2)) + (v55 + 2 | v56);
    v58 = v57 + 3;
    v59 = (v57 + 4 + ~v58 * 2 | 21) + v57 + 4;
    v60 = v58 * 2;
    v61 = v58 + (v58 & 21) + (~(unsigned int)v60 & 42) - 21;
    v0 = (v59 | v61) + (v61 & v59);
    v1 = v58 + (v60 & 24) + (v60 & 24 ^ 24) - 13;
    v62 = (char)v1 * 3 + (char)~v1 * 4;
    v63 = v4 >> (((char)(v0 - (0xfffffffffffffffd - v62)) + ((char)(0x7ffffffffffffffd - v62) & (char)v0 | (char)(0xfffffffffffffffd - v62) & (char)~v0) * 2 | 1) + ((char)(v0 - (0xfffffffffffffffd - v62)) | 254) & 63);
    v64 = v1;
    v65 = v0;
    v66 = -v65;
    v67 = (v64 ^ 1) + ~v64 * 2 + ((v64 * 2 | v64 >> 63) & 2 & 3) & v65;
    v68 = ((0xffffffffffffffff ^ v67 * 2) + v67 * 4 + 2 ^ v65 + v64 + (v66 & ~v64) * 2 + (v64 - v65 - (v64 | v66)) * 2) + ((0xffffffffffffffff ^ v67 * 2) + v67 * 4 + 2 & v65 + v64 + (v66 & ~v64) * 2 + (v64 - v65 - (v64 | v66)) * 2) * 2;
    v69 = v65 - v64 + ((v65 | v64) ^ v66) * 2 + ((v65 | v64) & v66) * 4;
    v70 = (~v68 + v68 * 2 ^ v69) + (~v68 + v68 * 2 - v69 & -(~v68 + v68 * 2 | -v69)) * 4 + ((v68 - 1 | -v69) - v68 + (~v68 + v68 * 2 & v69) + (~v68 + v68 * 2 - v69 ^ -(~v68 + v68 * 2 | -v69))) * 2;
    v0 = ((0xfffffffffffffffd - v70 | 44193) ^ v70 + 3) + (v70 + 2 | 44193) + ((0xfffffffffffffffd - v70 | 44193) & v70 + 3) * 2;
    v1 = v70 + 21344;
    v71 = ((unsigned int)v0 + ~(unsigned int)v1 | 0xfffffffe) + ((unsigned int)v0 + ~(unsigned int)v1 + (unsigned int)v1 * 2 + 2 | 1);
    v72 = ~v63 * 2;
    v73 = (__ROL__(v63, 1) & 2 & 3) + (v63 ^ 1) + v72 + v71 + (v71 + ~v71 * 2 + 1 | ~((__ROL__(v63, 1) & 2 & 3) + (v63 ^ 1) + v72));
    g_f120b4 = (unsigned short)v63 + (unsigned short)v72 + (unsigned short)v73 + 2 + ((unsigned short)v73 + 2 + ((unsigned short)~(v73 + 1) | (unsigned short)~(v63 + v72)) + ((unsigned short)~(v73 + 1) & (unsigned short)~(v63 + v72))) * 2;
    v74 = v1;
    v75 = v0;
    v76 = v75 & v74;
    v77 = v74 | v75;
    v78 = v76 - v74 + (v74 | ~v75) + (v77 + ~v76) * 2;
    v79 = v77 - v76 + (v78 + 3 | ~(v77 - v76)) + v78 - (v78 + 3) * 2 + 2 + (v78 - (v78 + 3) * 2 + 2 & v77 - v76);
    v80 = v79 + 2;
    v81 = (~(unsigned int)v80 & 44) + (v80 ^ 0xffffffffffffffd3);
    v82 = v79 + 3;
    v83 = 0xfffffffffffffffd - v79;
    v84 = ((v81 ^ v82) + (v81 & v82) * 2 ^ ~v79 + (v80 | 1) + (v80 & 1) - (v83 & 0xffffffffffffffd3) - 2) + ((v81 ^ v82) + (v81 & v82) * 2 & ~v79 + (v80 | 1) + (v80 & 1) - (v83 & 0xffffffffffffffd3) - 2) * 2;
    v0 = ~v84 + v84 * 2;
    v1 = ((v83 | 4) ^ v82) + (~v83 | 4) + ((v83 | 4) & v82) * 2;
    v85 = ((~v1 & ~v0) + (v1 | v0) * 2 + 2 ^ (v1 + v0 ^ -(v1 | v0)) + (v1 + v0 & -(v1 | v0)) * 2) + ((~v1 & ~v0) + (v1 | v0) * 2 + 2 & (v1 + v0 ^ -(v1 | v0)) + (v1 + v0 & -(v1 | v0)) * 2) * 2;
    g_f120b6 = v4 >> ((char)~v85 + (char)v85 * 2 & 63);
    v86 = -g_f120b0;
    v87 = g_f045c0 * 2;
    v88 = (g_f045c0 ^ 1) + v87 + ~g_f045c0 * 4 + (v87 & 2);
    v89 = v88 + 3;
    v90 = v89 + ~(v88 + 2) * 2 | g_f120b0;
    v91 = (v86 ^ g_f045c0) + (unsigned short)(g_f045c0 - g_f120b0 - (v86 | g_f045c0)) * 2;
    v92 = ((unsigned short)v90 & (unsigned short)v89) * 4 + ((unsigned short)v90 ^ (unsigned short)v89) * 2 | 1;
    g_f045c0 = (v92 ^ v91) + (v92 & v91) * 2 - 1;
    v93 = g_f120b2 | g_f045c2;
    v94 = (g_f045c2 + ~g_f045c2 * 2 + 1 | g_f120b2) + g_f045c2;
    g_f045c2 = (unsigned short)v93 + (unsigned short)v94 + ((unsigned short)v93 & (unsigned short)~v94 | (unsigned short)~v94 & (unsigned short)~v93) * 2 + 1;
    v95 = g_f045c4 + ~g_f045c4 * 2 + 1;
    v96 = v95 + g_f120b4;
    v97 = -(v95 | g_f120b4);
    v98 = g_f045c4 + g_f120b4 + ~g_f120b4 * 2 + 2;
    v99 = (v96 & v97) * 4 + (v96 ^ v97) * 2 | 1;
    g_f045c4 = (unsigned short)~((v99 ^ v98) + (v99 & v98) * 2) + (((unsigned short)v99 ^ (unsigned short)v98) + ((unsigned short)v99 & (unsigned short)v98) * 2) * 2;
    v100 = g_f045c6 | g_f120b6;
    v101 = (g_f120b6 | ~g_f045c6) + g_f045c6;
    g_f045c6 = ((unsigned short)v101 ^ (unsigned short)~v100) + ((unsigned short)v100 & (unsigned short)~v101) * 2;
    v102 = g_f045c8 * 3 + ~g_f045c8 * 4 + 3;
    v103 = v4 + g_f045c8 + v15;
    g_f045c8 = v103 + ((v102 & v4) - (v102 + v4) & v102 + v4) * 4 + ((v102 & v4) - (v102 + v4) ^ v102 + v4) * 2 + (0xfffffffffffffffd - v103 | ~(((v102 & v4) - (v102 + v4) & v102 + v4) * 4 + ((v102 & v4) - (v102 + v4) ^ v102 + v4) * 2)) + (((v102 & v4) - (v102 + v4) & v102 + v4) * 4 + ((v102 & v4) - (v102 + v4) ^ v102 + v4) * 2 & v103 + 2) + 3;
    return v90 & v89;
}

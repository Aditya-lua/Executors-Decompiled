/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x920644..0x920f64 (2336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_920644_0 {
    char field_0;
} st_920644_0;

extern unsigned short g_f04b10;
extern unsigned short g_f04b12;
extern unsigned short g_f04b14;
extern unsigned short g_f04b16;
extern unsigned long long g_f04b18;
extern unsigned short g_f126ec;
extern unsigned short g_f126ee;
extern unsigned short g_f126f0;
extern unsigned short g_f126f2;

unsigned int sub_920644(void)
{
    unsigned long long v2;  // x8
    st_920644_0 *v3;  // x10
    unsigned long v12;  // x14
    unsigned long long v13;  // x2
    unsigned long long v14;  // x15
    unsigned long long v15;  // x12
    unsigned long long v16;  // x14
    unsigned long long v17;  // x12
    unsigned long long v18;  // x15
    unsigned long long v19;  // x17
    unsigned long long v20;  // x0
    unsigned long long v21;  // x1
    st_920644_0 **v4;  // x12
    unsigned long long v22;  // x14
    unsigned short v23;  // x14
    unsigned long long v24;  // x16
    unsigned long long v25;  // x17
    unsigned long long v26;  // x2
    unsigned long long v27;  // x1
    unsigned long long v28;  // x0
    unsigned long long v29;  // x16
    unsigned long long v30;  // x17
    unsigned long long v31;  // x0
    unsigned long long v5;  // x13
    unsigned long long v32;  // x16
    unsigned long v33;  // x1
    unsigned long long v34;  // x16
    unsigned long long v35;  // x0
    unsigned long long v36;  // x2
    unsigned long long v37;  // x16
    unsigned short v38;  // x16
    unsigned long long v39;  // x16
    unsigned long v40;  // x1
    unsigned long long v41;  // x3
    unsigned long long v6;  // x11
    unsigned long long v42;  // x2
    unsigned long long v43;  // x16
    unsigned long long v44;  // x0
    unsigned long long v45;  // x16
    unsigned long long v46;  // x0
    unsigned long long v47;  // x2
    unsigned int v48;  // w0
    unsigned long v49;  // x1
    unsigned long long v50;  // x2
    unsigned long long v51;  // x4
    unsigned long long v7;  // x10
    unsigned long long v52;  // x3
    unsigned long long v53;  // x1
    unsigned long long v54;  // x3
    unsigned long long v55;  // x15
    unsigned long long v56;  // x15
    unsigned long long v57;  // x13
    unsigned int v58;  // w15
    unsigned short v59;  // x13
    unsigned short v60;  // x13
    unsigned int v61;  // w17
    unsigned long long v8;  // x10
    unsigned short v62;  // x13
    unsigned long v63;  // x15
    unsigned long long v64;  // x0
    unsigned long long v65;  // x1
    unsigned long long v66;  // x3
    unsigned long long v67;  // x2
    unsigned long long v68;  // x2
    unsigned long long v69;  // x15
    unsigned long long v70;  // x15
    unsigned long long v71;  // x12
    unsigned short v9;  // x11
    unsigned int v72;  // w16
    unsigned int v73;  // w11
    unsigned short v74;  // x12
    unsigned int v75;  // w14
    unsigned int v76;  // w11
    unsigned int v77;  // w12
    unsigned int v78;  // w11
    unsigned short v79;  // x13
    unsigned int v80;  // w14
    unsigned long long v81;  // x12
    unsigned long long v10;  // x10
    unsigned long long v82;  // x13
    unsigned long long v83;  // x8
    unsigned long long v84;  // x10
    unsigned long long v11;  // x12
    st_920644_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_920644_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0x41f23fc0ea5925f8 + ((13694813401099328464 + ~13694813401099328464 * 2 + 1 & 25508577751) + 0xbe0dc03a0580da00) * 2;
    v3 = v1;
    v4 = v0;
    v5 = v4 | v3;
    v6 = v3 - v4 + ((v5 & -v3) * 4 + (v5 ^ -v3) * 2 | ~(v3 - v4)) + ((v5 & -v3) * 4 + (v5 ^ -v3) * 2 | v3 - v4) + 1;
    v7 = (~v4 & ~v3) - (char *)v4 + (v4 & ~v3) + 2 * v5 + 1;
    v8 = (v6 & v7) + ~v7 + (v6 & ~v7) + ((v6 & v7) + ~v7 + (v6 & ~v7) & 1) + (~(((unsigned int)v6 & (unsigned int)v7) + (unsigned int)~v7 + ((unsigned int)v6 & (unsigned int)~v7)) | 0xfffffffffffffffe) + 2;
    v0 = (v8 ^ 47337) + (v8 + (47337 | ~v8)) * 2 + 1;
    v1 = (v8 & 0xfffffffffffffffe) + (v8 | 0xfffffffffffffffe) + 18201;
    v9 = ((unsigned short)v1 + 1 ^ v0) + (v0 + ((unsigned short)v1 + 1 | (unsigned short)~v0)) * 2 + 1;
    v10 = ~v2;
    g_f126ec = (v9 & (unsigned short)v10) + (unsigned short)v2 + (v9 ^ (unsigned short)v2 + (0xffff ^ (unsigned short)v2 * 2)) + 1;
    v11 = v1;
    v12 = v0;
    v13 = v11 + 1;
    v14 = ((((v12 | v11) & -v11) * 4 + ((v12 | v11) ^ -v11) * 2 | 1) ^ v12 + v11 + (-v12 & ~v11) * 2 + ((-v12 | ~v11) + v13) * 2) + ((((v12 | v11) & -v11) * 4 + ((v12 | v11) ^ -v11) * 2 | 1) & v12 + v11 + (-v12 & ~v11) * 2 + ((-v12 | ~v11) + v13) * 2) * 2;
    v15 = (-(((v12 + 1 + ~v12 * 2 | v11) ^ -(v12 + 1 + ~v12 * 2)) + ((v12 + 1 + ~v12 * 2 | v11) & -(v12 + 1 + ~v12 * 2)) * 2) ^ v12 + 1 + v11 + (v13 + ~v11 * 2 | ~v12)) + (-(((v12 + 1 + ~v12 * 2 | v11) ^ -(v12 + 1 + ~v12 * 2)) + ((v12 + 1 + ~v12 * 2 | v11) & -(v12 + 1 + ~v12 * 2)) * 2) & v12 + 1 + v11 + (v13 + ~v11 * 2 | ~v12)) * 2;
    v16 = v15 - v14 + v14 * 2 + ~v15 * 2;
    v17 = v16 + 1;
    v18 = v17 * 2;
    v19 = 0xfffffffffffffffe - v16;
    v20 = v16 + 2;
    v21 = ((v20 + v19 * 2 | 12) ^ v20) + ((v20 + v19 * 2 | 12) & v20) * 2;
    v22 = v16 + v20 + (v19 | 12) + (~(unsigned int)v18 & 24) - 11;
    v0 = (((v18 & 10 | v17) ^ 5) + (v18 & 10 & v17) | 1) + ((v18 & 10 | v17) ^ 5 | 0xfffffffffffffffe);
    v1 = (v21 | v22) + (v21 & v22);
    v23 = v2 >> ((char)v1 + (char)v0 & 63);
    v24 = v1;
    v25 = v0;
    v26 = (v25 + ~v24 + (v24 & ~v25)) * 2;
    v27 = (0xfffffffffffffffd - v26 & v24 - v25) + v26 + 2 + (v26 + 2 & v24 - v25);
    v28 = (v25 ^ 1) + ~v25 * 2 + ((v25 * 2 | v25 >> 63) & 2 & 3);
    v29 = v25 - v24 + ((v28 + v24 & -(v28 | v24)) * 4 + (v28 + v24 ^ -(v28 | v24)) * 2 | ~(v25 - v24)) + ((v28 + v24 & -(v28 | v24)) * 4 + (v28 + v24 ^ -(v28 | v24)) * 2 | v25 - v24);
    v30 = v29 + 1;
    v31 = v30 - v27 + (v27 | ~v29) * 2;
    v32 = (v27 - v30 + (v29 & ~v27)) * 2 + 3;
    v33 = v32 ^ v31;
    v34 = v32 & v31;
    v35 = v33 + v34 * 2;
    v36 = ~v35 + v35 * 2;
    v37 = ((v33 + (v34 - v35) * 2 | 5982) + v35 ^ (v36 | 5982) + 1) + ((v33 + (v34 - v35) * 2 | 5982) + v35 & (v36 | 5982) + 1) * 2;
    v0 = (-(unsigned int)v35 | 0xffffffffffff175e) + v36 * 2 + (0xffffffffffff175e & ~v36) + 115438 + 3670;
    v1 = ~v37 + v37 * 2;
    v38 = (((unsigned short)v1 + 1 ^ v0) + (v0 + ((unsigned short)v1 + 1 | (unsigned short)~v0)) * 2 + 2 | 1) + ((unsigned short)v1 + 1 ^ v0 | 0xfffe);
    g_f126ee = (unsigned short)(v23 + (0xffff ^ v23 * 2) + v23 - v38) + (v38 & v23 + (0xffff ^ v23 * 2)) + (v38 & v23) * 2 + 1;
    v39 = v1;
    v40 = v0;
    v41 = v40 + v39;
    v42 = v41 - (v40 | v39) + (v40 | v39) + 1 + (-(v41 - (v40 | v39)) & ~(v40 | v39)) * 2 + ((-(v41 - (v40 | v39)) | ~(v40 | v39)) + (v40 | v39) + 1) * 2;
    v43 = v41 + (v40 - (v39 + (v40 | -v39)) + (-v39 & ~v40)) * 2;
    v44 = (v39 + ~v40 + (v40 & ~v39)) * 2 + 3;
    v45 = (v43 ^ v44) + (v43 & v44) * 2 - ((v43 ^ v44) + (v43 & v44) * 2) * 2 + 1;
    v46 = ((v45 | v42 - 1) + ~((v45 | -v42) + v42 - 1) ^ (1 | (v45 & v42 - 1) * 2)) + ((v45 | v42 - 1) + ~((v45 | -v42) + v42 - 1) & (1 | (v45 & v42 - 1) * 2)) * 2;
    v47 = ~v46 + v46 * 2;
    v0 = (-v46 | 19) + (v47 & 19) + v47 * 2 + (~((unsigned int)v47 * 2) & 38) - 18;
    v1 = (v47 | 1) + (1 & ~v46) + 12;
    v48 = v2 >> (((char)v0 | (char)v1) + ((char)v0 + (char)~v0 * 2 ^ (char)~(v0 + ~v0 * 2 + 1 | v1)) + (((char)v0 + (char)~v0 * 2 + 1 | (char)v1) & (char)~(v0 + ~v0 * 2)) * 2 & 63);
    v49 = v1;
    v50 = v0;
    v51 = v50 + v49;
    v52 = (v50 | v49) + (v51 ^ -(v50 | v49)) + (v51 & -(v50 | v49)) * 2 + ~((v51 ^ -(v50 | v49)) + (v51 & -(v50 | v49)) * 2) * 2;
    v53 = v51 - (v50 & v49) + (v50 + ~v50 * 2 + 1 | v49 + ~v49 * 2 + 1);
    v54 = v52 + 2;
    v55 = (~v53 + (v54 & v53) ^ 0xfffffffffffffffd - (v52 + (0xfffffffffffffffd - v52 | ~v53))) + (~v53 + (v54 & v53) & 0xfffffffffffffffd - (v52 + (0xfffffffffffffffd - v52 | ~v53))) * 2;
    v56 = v55 + ((v54 & ~v53) * 2 | ~v55) + (v55 | (v54 & ~v53) * 2) + 1;
    v57 = v56 + ((0xffffffff ^ (unsigned int)v56 * 2) & 115438) + (v56 + (57719 | ~v56)) * 2 + 0xffffffffffff1e8b;
    v0 = ~v57 + v57 * 2;
    v1 = (v56 | 1) + (v56 & 1) + 7816;
    v58 = v1;
    v59 = (unsigned short)v58 + 1 + (unsigned short)~v58 * 2 + (unsigned short)v58 + 1 + ((unsigned short)v0 | (unsigned short)~(v58 + 1 + ~v58 * 2));
    v60 = ((unsigned short)v58 & (unsigned short)v0) + (v59 | (unsigned short)~(v58 & (unsigned int)v0)) + (v59 | (unsigned short)v58 & (unsigned short)v0) + 1;
    v61 = v48 + 1;
    v62 = (unsigned short)v61 + (unsigned short)~v48 * 2 + (v60 | (unsigned short)~(v61 + ~v48 * 2)) + (v60 ^ (unsigned short)v61 + (unsigned short)~v48 * 2);
    g_f126f0 = (v62 + 1 ^ (unsigned short)v61) + (v62 + ((unsigned short)v61 | (unsigned short)(0xfffffffe - v62))) * 2 + 4;
    v63 = v1;
    v64 = v0;
    v65 = -v64;
    v66 = (v63 ^ v65) + (v63 - (v64 + (v63 | v65))) * 2;
    v67 = (v63 + ~v63 * 2 + 1 & v64) * 2;
    v68 = (v67 | ~v66) + v67 + v66 * 2 - (v66 & v67);
    v69 = (v64 ^ -v63) + (v64 - (v63 + (v64 | -v63))) * 2;
    v70 = v69 + ((v64 | v63) & v65) * 4 + ((v64 | v63) ^ v65) * 2 + (((v64 | v63) & v65) * 4 + ((v64 | v63) ^ v65) * 2 | ~v69) + (v69 & ~(((v64 | v63) & v65) * 4 + ((v64 | v63) ^ v65) * 2));
    v71 = v68 + 1 + v70 + 1 + ((v70 & 0xfffffffffffffffe - v68) - (v70 + 1) & v68 + 2) * 4 + ((v70 & v68 + 1) - (v68 + 1 + v70 + 1) + ((v70 & 0xfffffffffffffffe - v68) - (v70 + 1) ^ v68 + 2)) * 2;
    v0 = ((0xffffffffffffffec & ~v71) + v71 + 20 ^ v71 + 20 - (v71 & 19)) + ((0xffffffffffffffec & ~v71) + v71 + 20 & v71 + 20 - (v71 & 19)) * 2 - 1;
    v1 = v71 + (v71 * 2 & 60) + (v71 * 2 & 60 ^ 60) - 31;
    g_f126f2 = v2 >> (v0 + (char)~v1 + (v0 + ((char)v1 + 1 | ~v0) + ((char)v1 + 1 & ~v0)) * 2 + 1 & 63);
    v72 = g_f126ec + g_f04b10;
    v73 = g_f04b10 | g_f126ec;
    v74 = (g_f04b10 + ~g_f04b10 * 2 + 1 & g_f126ec) + g_f04b10;
    g_f04b10 = (unsigned short)(v74 - (v72 & -v73) * 2) + ((unsigned short)(v73 - 1) ^ (unsigned short)v72) + 1;
    g_f04b12 = g_f04b12 - g_f126ee + (g_f126ee & ~g_f04b12) * 2;
    v75 = (unsigned int)(g_f04b14 - g_f126f0) + (g_f126f0 & g_f04b14) + (g_f126f0 & ~g_f04b14) * 2;
    v76 = g_f04b14 + ~g_f04b14 * 2;
    v77 = v76 + 1 | g_f126f0;
    v78 = (v76 ^ ~v77) + (v77 & ~v76) * 2;
    g_f04b14 = (unsigned short)v78 + (unsigned short)v75 + ((unsigned short)(v75 - v78 - (v75 | -v78)) + ((unsigned short)-v78 & (unsigned short)~v75)) * 2;
    v79 = g_f126f2 + g_f04b16;
    v80 = g_f04b16 | g_f126f2;
    g_f04b16 = (unsigned short)(v79 - ((g_f126f2 & g_f04b16) + (v79 & -v80) * 2)) + ((unsigned short)(v80 - 1) ^ v79) + 1;
    v81 = g_f04b18 | v2;
    v82 = -g_f04b18;
    v83 = v2 + v10 * 2 + g_f04b18 + 2;
    v84 = (v81 & v82) * 4 + (v81 ^ v82) * 2 | 1;
    g_f04b18 = (v84 ^ v83) + (v84 & v83) * 2 - 1;
    return v72 & -v73;
}

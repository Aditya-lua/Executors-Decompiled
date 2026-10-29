/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e0b18..0x4e1478 (2400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4e0b18_0 {
    char field_0;
} st_4e0b18_0;

extern unsigned short g_f04550;
extern unsigned short g_f04552;
extern unsigned short g_f04554;
extern unsigned short g_f04556;
extern unsigned long long g_f04558;
extern unsigned short g_f12078;
extern unsigned short g_f1207a;
extern unsigned short g_f1207c;
extern unsigned short g_f1207e;
extern unsigned int g_fffffffffffffffc;

unsigned long long sub_4e0b18(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x11
    unsigned long long v13;  // x13
    unsigned int v14;  // w13
    unsigned short v15;  // x11
    unsigned long v16;  // x13
    unsigned long long v17;  // x14
    unsigned long long v18;  // x16
    unsigned long long v19;  // x15
    unsigned long long v20;  // x14
    unsigned long long v21;  // x14
    st_4e0b18_0 *v4;  // x10
    unsigned long long v22;  // x15
    unsigned long long v23;  // x14
    unsigned long long v24;  // x15
    unsigned long long v25;  // x14
    unsigned int v26;  // w14
    unsigned long v27;  // x15
    unsigned long long v28;  // x16
    unsigned long long v29;  // x15
    unsigned long long v30;  // x15
    unsigned int v31;  // w15
    st_4e0b18_0 **v5;  // x11
    unsigned int v32;  // w16
    unsigned int v33;  // w0
    unsigned int v34;  // w17
    unsigned int v35;  // w15
    unsigned int v36;  // w15
    unsigned short v37;  // x15
    unsigned short v38;  // x17
    unsigned short v39;  // x14
    unsigned long v40;  // x15
    unsigned long long v41;  // x16
    st_4e0b18_0 *v6;  // x15
    unsigned long long v42;  // x17
    unsigned long long v43;  // x0
    unsigned long long v44;  // x0
    unsigned long long v45;  // x15
    unsigned long long v46;  // x15
    unsigned long long v47;  // x15
    unsigned long long v48;  // x16
    unsigned long long v49;  // x17
    unsigned long long v50;  // x16
    unsigned int v51;  // w15
    unsigned long long v7;  // x14
    unsigned long long v52;  // x0
    unsigned long long v53;  // x16
    unsigned long long v54;  // x17
    unsigned long long v55;  // x16
    unsigned long long v56;  // x17
    unsigned long long v57;  // x0
    unsigned long long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x16
    unsigned short v61;  // x0
    unsigned long long v8;  // x10
    unsigned short v62;  // x16
    unsigned short v63;  // x16
    unsigned long long v64;  // x16
    unsigned long long v65;  // x17
    unsigned long long v66;  // x0
    unsigned long long v67;  // x1
    unsigned long long v68;  // x3
    unsigned long long v69;  // x1
    unsigned long long v70;  // x16
    unsigned long long v71;  // x12
    unsigned long long v9;  // x16
    unsigned long long v72;  // x17
    unsigned long v73;  // x12
    unsigned long long v74;  // x12
    unsigned long long v75;  // x16
    unsigned long v76;  // x12
    unsigned long v77;  // x16
    unsigned long long v78;  // x17
    unsigned long long v79;  // x12
    unsigned short v80;  // x16
    unsigned short v81;  // x11
    unsigned long long v10;  // x14
    unsigned short v82;  // x10
    unsigned int v83;  // w12
    unsigned int v84;  // w10
    unsigned int v85;  // w11
    unsigned int v86;  // w10
    unsigned int v87;  // w12
    unsigned short v88;  // x10
    unsigned long long v89;  // x11
    unsigned long v90;  // x8
    unsigned long long v11;  // x11
    st_4e0b18_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4e0b18_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long, unsigned long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04550 + ~(~&g_f04550 + &g_f04550));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 + 1;
    v7 = &v4[(v5 | ~v4) + (v5 ^ v4) + 2 * ((char *)v5 + ~(v5 | v4) & v6) + ((char *)v5 + ~(v5 | v4) ^ v6) + 2 * ~(((char *)v5 + ~(v5 | v4) ^ v6) + ((char *)v5 + ~(v5 | v4) & v6) * 2)];
    v8 = &v4[(char *)v6 + 0x2 * ~v4 & v5] + ~(st_4e0b18_0 **)(((char *)v5 + 0x2 * ~v5 + 1 | v4) + (char *)v5);
    v9 = (char *)&g_fffffffffffffffc - v7;
    v10 = v7 + 4;
    v11 = -(v10 + (v9 | -v8));
    v12 = ((((v10 + v9 * 2 & v8 - 1) - v8 & -(v10 + v9 * 2)) * 4 + ((v10 + v9 * 2 & v8 - 1) - v8 ^ -(v10 + v9 * 2)) * 2 | 1) ^ ((v7 + 3 & v8 - 1) - v8 ^ v11) + ((v7 + 3 & v8 - 1) - v8 & v11) * 2) + ((((v10 + v9 * 2 & v8 - 1) - v8 & -(v10 + v9 * 2)) * 4 + ((v10 + v9 * 2 & v8 - 1) - v8 ^ -(v10 + v9 * 2)) * 2 | 1) & ((v7 + 3 & v8 - 1) - v8 ^ v11) + ((v7 + 3 & v8 - 1) - v8 & v11) * 2) * 2;
    v13 = v12 - 1;
    v0 = v12 + (v13 & 2096) + ((-v12 | 2096) ^ v12) + ((-v12 | 2096) & v12) * 2 + ((0xffffffff ^ (unsigned int)v13 * 2) & 4192) - 2097;
    v1 = (v13 & (char *)&g_fffffffffffffffc + 2) + (v13 | (char *)&g_fffffffffffffffc + 2) + 63441;
    v14 = (unsigned int)v1 + ~(unsigned int)v1 * 2 + 1;
    v15 = (unsigned short)v0 + (unsigned short)v14 + (unsigned short)~v14 * 2 + 1;
    g_f12078 = v15 + v3 - (v15 | (unsigned int)v3);
    v16 = v1;
    v17 = v0;
    v18 = ((v16 | v17) ^ -(v17 & v16)) + ((v16 | v17) + (-(v17 & v16) | ~(v16 | v17))) * 2 + 2;
    v19 = v17 + ~v17 * 2 + 1;
    v20 = v17 - v16 + ((v19 + ~v19 * 2 + 1 | v16) + v19) * 2;
    v21 = v20 + 3;
    v22 = (v21 + ~(v20 + 2) * 2 | 1) + (v21 & 1);
    v23 = v21 + v18 + ((char *)&g_fffffffffffffffc - v20 + 2 & ~v18) * 2 + (v22 + v18 + ~(v22 | v18)) * 2;
    v24 = v23 + 1;
    v25 = v23 + (~(unsigned int)v24 | 0xfffffffffffffff9) + 8;
    v0 = v23 + 11;
    v1 = ((char *)&g_fffffffffffffffc - v23 + 2 | 6) + v24 + ((char *)&g_fffffffffffffffc - ((char *)&g_fffffffffffffffc - v23 + 2 | 6) - v24 + 2 | v25) + (((char *)&g_fffffffffffffffc - v23 + 2 | 6) + v24 + 1 | v25) + 2;
    v26 = v3 >> ((char)(v0 + (char)v1 * 2 + (v1 ^ (char *)&g_fffffffffffffffc + 2) - ((char)v1 * 2 & 2)) + 2 & 63);
    v27 = v1;
    v28 = v0;
    v29 = v28 - v27 + ((v27 & ~v28) * 2 | ~(v28 - v27)) + ((v27 & ~v28) * 2 | v28 - v27);
    v30 = v29 + 1 + (v28 | v27) + ~((v28 | ~v27) + v27) + ((v28 | v27) + ~((v28 | ~v27) + v27) - (v29 + 1) & -((v28 | v27) + ~((v28 | ~v27) + v27) | ~v29)) * 4 + ((v28 | v27) - ((v28 | ~v27) + v27) + ((v28 | ~v27) + v27 - (v28 | v27)) * 2 - (v29 + 1 + ((v28 | v27) - ((v28 | ~v27) + v27) + ((v28 | ~v27) + v27 - (v28 | v27)) * 2 | ~v29)) + ((v28 | v27) + ~((v28 | ~v27) + v27) - (v29 + 1) ^ -((v28 | v27) + ~((v28 | ~v27) + v27) | ~v29))) * 2;
    v0 = (v30 + 0xffffffffffff1ff1 | (char *)&g_fffffffffffffffc + 2) + ((114718 & v30 * 2) + v30 + 0xffffffffffff1ff1 + (114718 & v30 * 2 ^ 114718) | 1);
    v1 = (v30 ^ 0x1ff2) + (v30 + (0x1ff2 | ~v30)) * 2 + 1;
    v31 = v0;
    v32 = v1;
    v33 = v31 + 1;
    v34 = v33 + ~v31 * 2 | v32;
    v35 = v33 + v32 + (v32 + ~v32 * 2 + 1 | ~v31);
    v36 = (v34 ^ v33) + (v34 & v33) * 2 + (v35 | ~((v34 ^ v33) + (v34 & v33) * 2)) + ((v34 ^ v33) + (v34 & v33) * 2 | v35);
    v37 = (unsigned short)v36 + 2;
    v38 = (v37 ^ v26) + (v37 & v26) * 2 - 1;
    v39 = ~v26 - (v36 + 1) - (v37 + ~(v36 + 1) * 2 | v26 + ~v26 * 2 + 1);
    g_f1207a = (v38 ^ v39) + (v38 & v39) * 2;
    v40 = v1;
    v41 = v0;
    v42 = v41 | v40;
    v43 = (v42 & -v40) * 4 + (v42 ^ -v40) * 2 + ~((v42 & -v40) * 4 + (v42 ^ -v40) * 2) * 2 | 1;
    v44 = v43 - (v40 + 1 + v41 + (-v41 & ~v40) * 2 + ((-v41 | ~v40) + v40 + 1) * 2) + (v40 + 1 + v41 + (-v41 & ~v40) * 2 + ((-v41 | ~v40) + v40 + 1) * 2 + ~v43) * 2;
    v45 = (-((v40 + ~v42 ^ v41 + 1) + (v40 + ~v42 & v41 + 1) * 2) ^ v42) + (-((v40 + ~v42 ^ v41 + 1) + (v40 + ~v42 & v41 + 1) * 2) & v42) * 2;
    v46 = ((v44 + ~v44 * 2 + 1 & v45 - 1) - v45 & ~(v44 + ~v44 * 2)) * 4 + (v44 + ~v44 * 2 ^ ~((v44 + ~v44 * 2 + 1 & v45 - 1) - v45)) * 2;
    v47 = ((v45 - v44 + (v44 | -v45) ^ (v44 | -v45)) + (v45 - v44 + (v44 | -v45) & (v44 | -v45)) * 2 | v46) + (v46 & (v45 - v44 + (v44 | -v45) ^ (v44 | -v45)) + (v45 - v44 + (v44 | -v45) & (v44 | -v45)) * 2);
    v48 = (v47 + 30 ^ -(v47 | 30)) + (v47 + 30 & -(v47 | 30)) * 2;
    v49 = v47 + (v47 & 30) + ((0xffffffff ^ (unsigned int)v47 * 2) & 60) - 30;
    v0 = v48 + (v49 | ~v48) + (v48 | v49) + 1;
    v1 = (v47 + 1 ^ (~v47 | 2)) + (v47 | 2) + (v47 + 1 & (~v47 | 2)) * 2;
    v50 = v1 + ~v1 * 2 + 1;
    v51 = v3 >> (v0 + (char)v50 + (char)~v50 * 2 + 1 & 63);
    v52 = v0 | v1;
    v53 = (v0 + v1 ^ -v52) + (v0 + v1 & -v52) * 2;
    v54 = (-v53 ^ v52) + (-v53 & v52) * 2;
    v55 = v52 + v53 + ~v53 * 2 + 1;
    v56 = v54 + 1;
    v57 = v56 + ~v54 * 2;
    v58 = v56 + v55 + (v57 & ~v55) * 2;
    v59 = ((v57 | ~v55) & v56) * 4 + ((v57 | ~v55) ^ v56) * 2 | 1;
    v60 = ~((v59 ^ v58) + (v59 & v58) * 2) + ((v59 ^ v58) + (v59 & v58) * 2) * 2;
    v0 = v60 + 22024;
    v1 = v60 + 43511;
    v61 = (unsigned short)v1 & (unsigned short)v0;
    v62 = (unsigned short)(v0 + v1 - v61) + 1;
    v63 = (unsigned short)((v62 ^ v61) + (v62 & v61) * 2 - 1) & (unsigned short)v51;
    g_f1207c = (v63 + (unsigned short)~v51 ^ (unsigned short)v51 + 1) + ((unsigned short)(v63 - v51) + ((unsigned short)(v51 - v63) | (unsigned short)v51 + 1)) * 2;
    v64 = v1;
    v65 = v0;
    v66 = v65 + v64;
    v67 = v65 | v64;
    v68 = (v66 ^ -v67) + (v66 & -v67) * 2;
    v69 = v68 + v67 + 1 + (-v68 & ~v67) * 2 + ((-v68 | ~v67) + v67 + 1) * 2;
    v70 = v65 + (-v64 | ~v65) + (-v64 & ~v65);
    v71 = (((((char *)&g_fffffffffffffffc + -3 * v65 + -4 * ~v65 | v64) & v65 * 3 + ~v65 * 4 + 4) * 4 + (((char *)&g_fffffffffffffffc + -3 * v65 + -4 * ~v65 | v64) ^ v65 * 3 + ~v65 * 4 + 4) * 2 | 1) ^ v66 + v70 * 2 + 2) + (((((char *)&g_fffffffffffffffc + -3 * v65 + -4 * ~v65 | v64) & v65 * 3 + ~v65 * 4 + 4) * 4 + (((char *)&g_fffffffffffffffc + -3 * v65 + -4 * ~v65 | v64) ^ v65 * 3 + ~v65 * 4 + 4) * 2 | 1) & v66 + v70 * 2 + 2) * 2;
    v72 = v69 + v71 + (1 - v71 & -v69) * 2;
    v73 = (v69 + v69 - v69 * 2 - v71 + (v71 + 0x7ffffffffffffffe | ~(v69 - v69 * 2))) * 2 + 4;
    v74 = v72 + (v73 | 1 - v72) + (v73 | v72 - 2);
    v75 = v74 - 1;
    v0 = (v75 | 1) + (v75 & 1) + 14;
    v1 = v75 + (v75 - v74 * 2 + 1 | 0xffffffffffffffde) + (v75 - v74 * 2 ^ ~(v75 - v74 * 2 + 1 | 33)) + ((v75 - v74 * 2 + 1 | 33) & ~(v75 - v74 * 2)) * 2 + 0x22;
    v76 = v0;
    v77 = v1;
    v78 = (v76 + ~v76 * 2 + 1 | v77) + v76;
    v79 = (~v77 & ~v76) + (v77 | v76) * 2;
    g_f1207e = v3 >> ((char)v78 + ((char)v78 + 1 & (char)((char *)&g_fffffffffffffffc - v79 + 2)) + (((char)~v77 & (char)~v76) + ((char)v77 | (char)v76) * 2) * 2 + (char)~(v79 + 1 | v78 + 1) + 4 & 63);
    v80 = g_f12078 & ~g_f04550;
    v81 = g_f04550 - g_f12078;
    v82 = (0xffff ^ v80 * 2) + v80 * 4 + 2;
    g_f04550 = (v82 ^ v81) + (v82 & v81) * 2 - 1;
    g_f04552 = g_f1207a + ~g_f1207a * 2 + 1 & g_f04552 | g_f1207a & ~g_f04552;
    v83 = g_f04554 | g_f1207c;
    v84 = g_f04554 + ~g_f04554 * 2;
    v85 = v84 + 1 | g_f1207c;
    v86 = (v84 ^ ~v85) + (v85 & ~v84) * 2;
    g_f04554 = (unsigned short)v86 + (unsigned short)v83 + ((unsigned short)v83 + ((unsigned short)-v86 | (unsigned short)~v83) + ((unsigned short)-v86 & (unsigned short)~v83)) * 2 + 2;
    v87 = (g_f1207e + ~g_f1207e * 2 + 1 & g_f04556) + g_f1207e;
    v88 = -(g_f1207e & g_f04556);
    g_f04556 = ((unsigned short)v87 ^ v88) + ((unsigned short)v87 + (v88 | (unsigned short)~v87)) * 2 + 2;
    v89 = (g_f04558 ^ 1) + ~g_f04558 * 2 + ((g_f04558 * 2 | g_f04558 >> 63) & 2 & 3);
    v90 = g_f04558 + v3;
    g_f04558 = v90 + (v90 + (-v3 | ~g_f04558) + (-v3 & ~g_f04558) + v89 - (v89 | v3)) * 2 + 2;
    return v78 + 1;
}

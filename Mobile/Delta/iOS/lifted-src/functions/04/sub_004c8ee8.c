/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c8ee8..0x4c98a8 (2496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c8ee8_0 {
    char field_0;
} st_4c8ee8_0;

extern unsigned short g_f04670;
extern unsigned short g_f04672;
extern unsigned short g_f04674;
extern unsigned short g_f04676;
extern unsigned long long g_f04678;
extern unsigned short g_f12108;
extern unsigned short g_f1210a;
extern unsigned short g_f1210c;
extern unsigned short g_f1210e;

int sub_4c8ee8(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long v12;  // x12
    unsigned long long v13;  // x13
    unsigned long long v14;  // x14
    unsigned long long v15;  // x13
    unsigned long long v16;  // x12
    unsigned long long v17;  // x12
    unsigned long long v18;  // x12
    unsigned long v19;  // x13
    unsigned long long v20;  // x12
    unsigned long long v21;  // x13
    st_4c8ee8_0 *v4;  // x11
    unsigned long long v22;  // x12
    unsigned short v23;  // x13
    unsigned long v24;  // x12
    unsigned long v25;  // x14
    unsigned long long v26;  // x15
    unsigned long long v27;  // x15
    unsigned long long v28;  // x14
    unsigned long long v29;  // x12
    unsigned long long v30;  // x12
    unsigned long long v31;  // x14
    st_4c8ee8_0 **v5;  // x12
    unsigned long long v32;  // x12
    unsigned long long v33;  // x16
    unsigned long long v34;  // x12
    unsigned long long v35;  // x14
    unsigned long long v36;  // x12
    unsigned int v37;  // w14
    unsigned short v38;  // x14
    unsigned long v39;  // x14
    unsigned long v40;  // x16
    unsigned long long v41;  // x5
    unsigned long long v6;  // x11
    unsigned long long v42;  // x17
    unsigned long long v43;  // x14
    unsigned long long v44;  // x14
    unsigned long long v45;  // x14
    unsigned long long v46;  // x16
    unsigned long long v47;  // x17
    unsigned long long v48;  // x3
    unsigned long long v49;  // x4
    char v50;  // x17
    unsigned short v51;  // x16
    unsigned long long v7;  // x12
    unsigned long v52;  // x17
    unsigned long long v53;  // x1
    unsigned long long v54;  // x3
    unsigned long long v55;  // x2
    unsigned long long v56;  // x17
    unsigned long long v57;  // x17
    unsigned long long v58;  // x17
    unsigned long long v59;  // x17
    unsigned long long v60;  // x1
    unsigned int v61;  // w15
    unsigned long long v8;  // x11
    unsigned short v62;  // x17
    unsigned short v63;  // x15
    unsigned long v64;  // x16
    unsigned long long v65;  // x17
    unsigned long long v66;  // x0
    unsigned long long v67;  // x2
    unsigned long long v68;  // x1
    unsigned long long v69;  // x16
    unsigned long long v70;  // x10
    unsigned long long v71;  // x10
    unsigned long long v9;  // x13
    unsigned long long v72;  // x16
    unsigned long long v73;  // x10
    char v74;  // x14
    char v75;  // x17
    unsigned int v77;  // w14
    unsigned int v78;  // w16
    unsigned int v79;  // w16
    unsigned int v80;  // w17
    unsigned short v81;  // x11
    unsigned long long v10;  // x11
    unsigned short v82;  // x16
    unsigned int v83;  // w11
    unsigned int v84;  // w13
    unsigned int v85;  // w13
    unsigned int v86;  // w13
    unsigned int v87;  // w12
    unsigned int v88;  // w10
    unsigned int v89;  // w11
    unsigned long long v90;  // x11
    unsigned long v91;  // x13
    unsigned int v11;  // w11
    unsigned long long v92;  // x11
    unsigned long v93;  // x8
    unsigned long long v94;  // x10
    st_4c8ee8_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4c8ee8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long, unsigned long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04670 + ~(~&g_f04670 + &g_f04670));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (char *)v4 + 0x2 * ~v4 + v5 + 2;
    v7 = ((v5 & ~v4) + 1 & v4 + ~v5) * 4 + ((v5 & ~v4) + 1 ^ v4 + ~v5) * 2 | 1;
    v8 = v4 - v5 + (&v4[0xffffffffffffffff ^ v4 * 2] + v5 & -(&v4[0xffffffffffffffff ^ v4 * 2] | v5)) * 4 + (&v4[0xffffffffffffffff ^ v4 * 2] + v5 ^ -(&v4[0xffffffffffffffff ^ v4 * 2] | v5)) * 2 + (v4 - v5 & ~((&v4[0xffffffffffffffff ^ v4 * 2] + v5 & -(&v4[0xffffffffffffffff ^ v4 * 2] | v5)) * 4 + (&v4[0xffffffffffffffff ^ v4 * 2] + v5 ^ -(&v4[0xffffffffffffffff ^ v4 * 2] | v5)) * 2)) + ((&v4[0xffffffffffffffff ^ v4 * 2] + v5 & -(&v4[0xffffffffffffffff ^ v4 * 2] | v5)) * 4 + (&v4[0xffffffffffffffff ^ v4 * 2] + v5 ^ -(&v4[0xffffffffffffffff ^ v4 * 2] | v5)) * 2 | ~(v4 - v5)) - ((v7 ^ v6) + (v7 & v6) * 2);
    v9 = v8 + 2;
    v10 = ((~(unsigned int)v9 & 7760) + (v9 ^ 0xffffffffffffe1af) ^ v8 + 3) + ((~(unsigned int)v9 & 7760) + (v9 ^ 0xffffffffffffe1af) & v8 + 3) * 2;
    v0 = (v9 & 57775) - (v8 + 1) + (v8 + 57777 ^ -(v9 | 57775)) + (v8 + 1 - (v9 & 57775) + (v8 + 57777 & -(v9 | 57775))) * 2 + 57776;
    v1 = v10 + (v9 | 7760 | ~v10) + (v10 | v9 | 7760) + 1;
    v11 = (unsigned int)v0 + 1 + (unsigned int)v1 + ~((unsigned int)v1 | (unsigned int)v0) + ((unsigned int)v1 ^ (unsigned int)v0) + ((unsigned int)v1 - (unsigned int)v0 + ((unsigned int)v0 | ~(unsigned int)v1) ^ (unsigned int)v0 + 1) + ((unsigned int)v1 - (unsigned int)v0 + ((unsigned int)v0 | ~(unsigned int)v1) & (unsigned int)v0 + 1) * 2;
    g_f12108 = ((unsigned short)v11 + 1 ^ (unsigned short)v3) + (unsigned short)~((unsigned int)(v3 - v11) + (v11 & (unsigned int)v3) + (v11 & (unsigned int)~v3) * 2) + ((unsigned short)v11 + 1 & (unsigned short)v3) * 2;
    v12 = v1;
    v13 = v0;
    v14 = (v12 ^ -v13) + (v12 + (-v13 | ~v12) + ((v12 ^ 1) + ~v12 * 2 + ((v12 * 2 | v12 >> 63) & 2 & 3) & v13)) * 2 + 2;
    v15 = v13 + 1;
    v16 = v15 + ~v13 * 2 | v12;
    v17 = -((v16 ^ v15) + (v16 & v15) * 2);
    v18 = v17 - ((v13 | v12) + (v17 & ~(v13 | v12)) * 2) + (~(v13 | v12) - (v17 | ~(v13 | v12))) * 2;
    v19 = v18 ^ v14;
    v20 = v19 + (v18 & v14) * 2;
    v21 = (v19 | 0xfffffffffffffffe) + (-v20 | 1) + 1;
    v22 = v21 + v20 * 2;
    v0 = (v21 & 1) + (v22 | 1) + 13;
    v1 = (v22 ^ 3) + (v22 + (~v22 | 3)) * 2 + 1;
    v23 = v3 >> (((char)v1 + 1 ^ v0) + (v0 + ((char)v1 + 1 | ~v0)) * 2 + 1 & 63);
    v24 = v1;
    v25 = v0;
    v26 = (v24 ^ -v25) + (v24 - v25 - (v24 | -v25)) * 2;
    v27 = v26 + (((0xfffffffffffffffc - (v24 * 3 + ~v24 * 4) | v25) & v24 * 3 + ~v24 * 4 + 4) * 4 + ((0xfffffffffffffffc - (v24 * 3 + ~v24 * 4) | v25) ^ v24 * 3 + ~v24 * 4 + 4) * 2 | ~v26) + (((0xfffffffffffffffc - (v24 * 3 + ~v24 * 4) | v25) & v24 * 3 + ~v24 * 4 + 4) * 4 + ((0xfffffffffffffffc - (v24 * 3 + ~v24 * 4) | v25) ^ v24 * 3 + ~v24 * 4 + 4) * 2 | v26) + 1;
    v28 = (v25 ^ -v24) + (v25 + (-v24 | ~v25)) * 2 + 2;
    v29 = (v24 + ~v25 + (v25 & ~v24)) * 2 + 3;
    v30 = ~((v29 ^ v28) + (v29 & v28) * 2) + ((v29 ^ v28) + (v29 & v28) * 2) * 2;
    v31 = v27 - v30;
    v32 = v30 - 1;
    v33 = v31 + (v32 | ~v27);
    v34 = (v33 + 1 ^ (v32 & v27) - v27) + (v33 + 1 & (v32 & v27) - v27) * 2;
    v35 = (v31 & ~v33) * 4 + (v33 ^ ~v31) * 2;
    v36 = v34 + (v35 | ~v34) + (v34 | v35) + 1;
    v0 = (v36 | 1) + (v36 & 1) + 19360;
    v1 = v36 + ((0xffffffff ^ (unsigned int)v36 * 2) & 92350) + (v36 + (46175 | ~v36)) * 2 + 0xffffffffffff4ba2;
    v37 = (unsigned int)v1 + ~(unsigned int)v1 * 2;
    v38 = ((unsigned short)v37 + v0 + 1 + (v0 + ((unsigned short)~v37 | (unsigned short)~v0) + ((unsigned short)~v37 & (unsigned short)~v0)) * 2 + 2 & 0xfffe) + ((unsigned short)v37 + v0 + 1 | 0xfffe);
    g_f1210a = (unsigned int)((v38 + 2 ^ v23) - (((unsigned int)(0xfffe - v38) & v23) + v38)) + (v38 + 2 & v23) * 2 - 2;
    v39 = v1;
    v40 = v0;
    v41 = v40 + v39;
    v42 = v41 + (v39 - v40 - (v39 | -v40) + (-v40 & ~v39)) * 2;
    v43 = (v40 + ~v40 * 2 + 1 | ~v39) + v39;
    v44 = (v43 * 2 + 3 ^ v41 + ~v39 * 2 + 2) + (v43 * 2 + 3 & v41 + ~v39 * 2 + 2) * 2;
    v45 = (v44 - 1 ^ 1) - v44 * 2 + (((v44 - 1) * 2 | v44 - 1 >> 63) & 2 & 3);
    v46 = (v42 - (((v39 | v40) & -v39) * 4 + ((v39 | v40) ^ -v39) * 2) + (((v39 | v40) & -v39) * 4 + ((v39 | v40) ^ -v39) * 2) * 2 | v45) + (v45 & v42 - (((v39 | v40) & -v39) * 4 + ((v39 | v40) ^ -v39) * 2) + (((v39 | v40) & -v39) * 4 + ((v39 | v40) ^ -v39) * 2) * 2);
    v47 = v46 + 1;
    v48 = 0xfffffffffffffffe - v46;
    v49 = v46 + 2;
    v0 = (v47 | 1) + (v47 & 26) + (v47 & 1) + v49 + v48 * 2 + (26 | ~(v49 + v48 * 2));
    v1 = v46 + v49 + (v48 | 0xfffffffffffffff9) + (0xfffffffffffffff9 & ~v47) + 14;
    v50 = (char)v1 * 3 + (char)~v1 * 4;
    v51 = v3 >> ((((char)(0xfffffffffffffffd - v50) ^ (char)v0) + ((char)v0 + ((char)(0x7ffffffffffffffd - v50) | (char)~v0)) * 2 + 2 | 1) + ((char)(0xfffffffffffffffd - v50) ^ (char)v0 | 254) & 63);
    v52 = v1;
    v53 = v0;
    v54 = v53 & ~v52;
    v55 = v53 + ~v53 * 2 + 1 & v52 | v54;
    v56 = (v53 ^ -v52) + (v53 - v52 - (v53 | -v52)) * 2;
    v57 = v56 + ((v52 - v53 + v54) * 2 | ~v56) + (v56 | (v52 - v53 + v54) * 2);
    v58 = (~v57 + v55 + (v57 & ~v55)) * 2 + 3;
    v59 = ~((v58 ^ v55 ^ ~v57) + (v58 & (v55 ^ ~v57)) * 2) + ((v58 ^ v55 ^ ~v57) + (v58 & (v55 ^ ~v57)) * 2) * 2;
    v60 = v59 * 2;
    v0 = ~((v60 & 91726) + (v59 ^ 45863)) + ((v60 & 91726) + (v59 ^ 45863)) * 2;
    v1 = v59 + (v60 & 39348) + (v60 & 39348 ^ 39348) + 0xffffffffffffb325;
    v61 = (unsigned int)v1 + ((unsigned int)v0 + 1) * 2 + ((unsigned int)v1 | ~(unsigned int)v0) + ((unsigned int)v1 ^ (unsigned int)v0) + ((unsigned int)v0 + 1 + ~(unsigned int)v0 * 2 & ~(unsigned int)v1);
    v62 = (unsigned short)v61 + 1;
    v63 = (v62 + (unsigned short)~v61 * 2 & v51) + (unsigned short)v61;
    g_f1210c = (unsigned int)(v63 - ((v62 ^ v51) + (v62 & v51) * 2)) - ((v62 ^ v51) + (v62 & v51) * 2 + v63) * 2 + ((v62 ^ v51) + (v62 & v51) * 2) * 4 - 1;
    v64 = v1;
    v65 = v0;
    v66 = -v65;
    v67 = v65 | v64;
    v68 = (v64 ^ v66) + (v64 - v65 - (v64 | v66)) * 2 - ((v67 & -v64) * 4 + (v67 ^ -v64) * 2) + ((v67 & -v64) * 4 + (v67 ^ -v64) * 2) * 2;
    v69 = v64 + v65 + (v67 & v66) * 4 + ((v67 ^ v66) + ~v64) * 2 + 2;
    v70 = (v68 & v69) + v69 + (0xffffffffffffffff ^ v69 * 2) + (v69 + (0xffffffffffffffff ^ v69 * 2) & v68);
    v71 = v70 + 1;
    v72 = ((~(unsigned int)v71 & 26) + (v71 ^ 0xffffffffffffffe5) ^ v70 + 2) + ((~(unsigned int)v71 & 26) + (v71 ^ 0xffffffffffffffe5) & v70 + 2) * 2;
    v0 = ~((v71 | 1) + (v71 & 1) + 22) + ((v71 | 1) + (v71 & 1) + 22) * 2;
    v1 = (v72 | v71 | 26) + (v72 & (v71 | 26));
    v73 = v0;
    v74 = (char)v1 + 1;
    v75 = v73 - v74;
    g_f1210e = v3 >> ((v75 | 254) + (v75 + ((char)v73 + (v74 | (char)~v73) + (v74 & (char)~v73)) * 2 + 2 | 1) & 63);
    v77 = g_f04670 + 1;
    v78 = v77 + ~g_f04670 * 2;
    v79 = v78 + ~v78 * 2;
    v80 = v79 + 1 | g_f12108;
    v81 = (unsigned short)v77 + g_f12108 + ~g_f12108 * 2;
    v82 = ((unsigned short)v80 & (unsigned short)~v79) * 4 + ((unsigned short)v79 ^ (unsigned short)~v80) * 2;
    g_f04670 = v81 + (v82 | (unsigned short)(0xfffe - v81)) + (v82 | v81 + 1) + 2;
    v83 = g_f04672 + 1;
    v84 = v83 + ~g_f04672 * 2;
    g_f04672 = (unsigned short)v83 + g_f1210a + ((unsigned short)v84 + ~g_f1210a + ((unsigned short)v84 + (unsigned short)~v84 * 2 + 1 | g_f1210a)) * 2 + 3;
    v85 = g_f04674 + ~g_f04674 * 2 + 1;
    g_f04674 = g_f04674 - g_f1210c + (((unsigned short)v85 + (unsigned short)~v85 * 2 + 1 | g_f1210c) + (unsigned short)v85) * 2 + 2;
    v86 = g_f1210e + 1;
    v87 = v86 + g_f04676 + (v86 + ~g_f1210e * 2 | ~g_f04676);
    v88 = ~(g_f1210e | g_f04676) + g_f1210e;
    v89 = g_f04676 + 1;
    g_f04676 = (unsigned short)v87 + ((unsigned short)v88 ^ (unsigned short)v89) + ((unsigned short)v88 & (unsigned short)v89) * 2 + ((unsigned short)(v87 - ((v88 ^ v89) + (v88 & v89) * 2) - (v87 | -((v88 ^ v89) + (v88 & v89) * 2))) + ((unsigned short)-((v88 ^ v89) + (v88 & v89) * 2) & (unsigned short)~v87)) * 2;
    v90 = g_f04678 * 2;
    v91 = g_f04678 + v3;
    v92 = v90 - (v91 + (g_f04678 | ~v3));
    v93 = g_f04678 - v3;
    v94 = (v92 & v91 + ~v90) * 4 + (v92 ^ v91 + ~v90) * 2 | 1;
    g_f04678 = (v94 ^ v93) + (v94 & v93) * 2 - 1;
    return v79 ^ ~v80;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x928be0..0x929460 (2176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_928be0_0 {
    char field_0;
} st_928be0_0;

extern unsigned short g_f04ba0;
extern unsigned short g_f04ba2;
extern unsigned short g_f04ba4;
extern unsigned short g_f04ba6;
extern unsigned long long g_f04ba8;
extern unsigned short g_f12734;
extern unsigned short g_f12736;
extern unsigned short g_f12738;
extern unsigned short g_f1273a;

unsigned int sub_928be0(void)
{
    unsigned long long v2;  // x8
    st_928be0_0 *v3;  // x11
    unsigned long v12;  // x11
    unsigned int v13;  // w10
    unsigned long long v14;  // x11
    unsigned long v15;  // x12
    unsigned long long v16;  // x13
    unsigned long long v17;  // x15
    unsigned long long v18;  // x13
    unsigned long long v19;  // x14
    unsigned long long v20;  // x13
    unsigned long long v21;  // x14
    st_928be0_0 **v4;  // x12
    unsigned long long v22;  // x11
    unsigned long long v23;  // x11
    unsigned int v24;  // w11
    unsigned long v25;  // x12
    unsigned long long v26;  // x13
    unsigned long long v27;  // x14
    unsigned long long v28;  // x12
    unsigned long long v29;  // x15
    unsigned long long v30;  // x12
    unsigned long long v31;  // x14
    unsigned long long v5;  // x14
    unsigned int v32;  // w12
    unsigned int v33;  // w15
    unsigned int v34;  // w14
    unsigned int v35;  // w12
    unsigned int v36;  // w11
    unsigned long long v37;  // x12
    unsigned long long v38;  // x14
    unsigned long long v39;  // x15
    unsigned long long v40;  // x15
    unsigned long long v41;  // x12
    unsigned long long v6;  // x13
    unsigned long long v42;  // x14
    unsigned long long v43;  // x12
    unsigned long long v44;  // x16
    unsigned long long v45;  // x12
    unsigned int v46;  // w12
    unsigned long long v47;  // x14
    unsigned long v48;  // x15
    unsigned long v49;  // x13
    unsigned long long v50;  // x16
    unsigned long long v51;  // x13
    unsigned long long v7;  // x13
    unsigned long long v52;  // x15
    unsigned long long v53;  // x14
    unsigned long long v54;  // x16
    unsigned long long v55;  // x13
    unsigned int v56;  // w13
    unsigned int v57;  // w13
    unsigned long long v58;  // x13
    unsigned long long v59;  // x14
    unsigned long long v60;  // x16
    unsigned long long v61;  // x15
    unsigned long long v8;  // x11
    unsigned long long v62;  // x17
    unsigned long long v63;  // x17
    unsigned long long v64;  // x1
    unsigned long long v65;  // x17
    unsigned long long v66;  // x13
    unsigned long long v67;  // x14
    unsigned long long v68;  // x13
    unsigned long v69;  // x13
    unsigned long long v70;  // x14
    unsigned int v71;  // w15
    unsigned long long v9;  // x11
    unsigned short v72;  // x16
    unsigned short v73;  // x17
    unsigned int v74;  // w10
    unsigned int v75;  // w10
    unsigned int v76;  // w15
    unsigned int v77;  // w14
    unsigned int v78;  // w17
    unsigned short v79;  // x12
    unsigned int v80;  // w14
    unsigned long long v10;  // x12
    unsigned long long v11;  // x14
    st_928be0_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_928be0_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xa3ff564d7a12bd5c + ((6629485226578415392 + ~6629485226578415392 * 2 + 1 & 12348378499) + 6629485224967799328) * 2;
    v3 = v1;
    v4 = v0;
    v5 = (v3 ^ 1) + ~v3 * 2 + ((v3 * 2 | v3 >> 63) & 2 & 3);
    v6 = v4 + v3 + (-v4 & ~v3) * 2 + (v3 - v4 - (v3 | -v4)) * 2;
    v7 = v6 + ((v5 + (char *)v4 & -(v5 | v4)) * 4 + (v5 + (char *)v4 ^ -(v5 | v4)) * 2 | ~v6) + ((v5 + (char *)v4 & -(v5 | v4)) * 4 + (v5 + (char *)v4 ^ -(v5 | v4)) * 2 | v6) + 1;
    v8 = ((char *)v4 + 0x2 * ~v4 + 1 | v3) + (char *)v4;
    v9 = (v7 & (v4 | v3) + ~v8) + v8 - (v4 | v3) + (v7 & v8 - (v4 | v3));
    v10 = v9 + 1;
    v11 = (v9 + 5938 ^ -(v10 | 5937)) + (v9 + 5938 & -(v10 | 5937)) * 2;
    v12 = v9 + (v10 & 5937) + 0xffffffffffffe8d0 + ((0xffffffff ^ (unsigned int)v10 * 2) & 11874);
    v0 = (v10 ^ 59599) + (v9 + (0x7ffffffffffffffe - v9 | 59599)) * 2 + 3;
    v1 = (v11 | v12) + (v12 & v11);
    v13 = ((unsigned int)v2 ^ 1) + (__ROL__(2048048476, 1) & 2 & 3) + ~(unsigned int)v2 * 2;
    g_f12734 = (unsigned short)(v13 + v2 - (v1 + v0)) + ((unsigned short)v1 + v0 & (unsigned short)v13) + ((unsigned short)v1 + v0 & (unsigned short)~v13) * 2 + 1;
    v14 = v1;
    v15 = v0;
    v16 = v14 * 2;
    v17 = v15 + v14;
    v18 = v16 - ((v14 | ~v15) + v17);
    v19 = v17 + ~v15 * 2 + 2;
    v20 = (v18 & v17 + ~v16) * 4 + (v18 ^ v17 + ~v16) * 2 | 1;
    v21 = (v14 + ~v14 * 2 + 1 & v15) + v14;
    v22 = -((v17 ^ -(v15 | v14)) + (v17 & -(v15 | v14)) * 2);
    v23 = ((v20 ^ v19) + (v20 & v19) * 2 - 1 ^ (~v21 - (v22 | ~v21)) * 2 - (v22 ^ v21)) + ((v20 ^ v19) + (v20 & v19) * 2 - 1 & (~v21 - (v22 | ~v21)) * 2 - (v22 ^ v21)) * 2;
    v0 = (v23 + 1 ^ (~v23 | 8)) + (v23 | 8) + (v23 + 1 & (~v23 | 8)) * 2;
    v1 = (v23 ^ 9) + (18 & v23 * 2) - 1;
    v24 = v2 >> ((char)v1 + (char)v0 & 63);
    v25 = v1;
    v26 = v0;
    v27 = v25 + v26 + ~v26 * 2 + (v25 * 3 + ~v25 * 4 + 3 & v26) * 2 + 2;
    v28 = v26 - v25 + (v25 & ~v26) * 4 - (v25 & ~v26) * 2;
    v29 = v27 + ~v27 * 2 + 1;
    v30 = (v27 + v28 + (v29 - v28 - (v29 | -v28)) * 2 | (v27 & -v28) * 2) + (v27 + v28 + (v29 - v28 - (v29 | -v28)) * 2 & (v27 & -v28) * 2);
    v31 = v30 * 2;
    v0 = (v30 ^ 27321 | 0xfffffffffffffffe) + ((v31 & 54642) + (v30 ^ 27321) | 1);
    v1 = ~(((v31 & 76432 | v30) ^ 38216) + (v31 & 76432 & v30)) + (((v31 & 76432 | v30) ^ 38216) + (v31 & 76432 & v30)) * 2;
    v32 = v0;
    v33 = v32 + 1;
    v34 = v33 + ~v32 * 2 | (unsigned int)v1;
    v35 = (v34 ^ v33) + ((unsigned int)v1 | v32) + (v34 & v33) * 2;
    v36 = (v24 ^ 1) + ~v24 * 2 + (__ROL__(v24, 1) & 2 & 3);
    g_f12736 = (unsigned short)v36 + (unsigned short)~v36 * 2 + ((unsigned short)v24 ^ (unsigned short)~v35) + ((unsigned short)v35 & (unsigned short)~v24) + 2;
    v37 = v1;
    v38 = v0;
    v39 = (v38 - (v37 + ~v37 * 2 + 1) + (v37 + ~v37 * 2 + 1 | ~v38) & v37 + ~v37 * 2 + 2) * 4 + (v38 - (v37 + ~v37 * 2 + 1) + (v37 + ~v37 * 2 + 1 | ~v38) ^ v37 + ~v37 * 2 + 2) * 2 | 1;
    v40 = ~((v39 ^ v37 - v38) + (v39 & v37 - v38) * 2) + ((v39 ^ v37 - v38) + (v39 & v37 - v38) * 2) * 2;
    v41 = v38 + v37 + (-v37 & ~v38) * 2 + (v38 - v37 - (v38 | -v37)) * 2;
    v42 = (0xffffffffffffffff ^ (v37 & ~v38) * 2) + (v37 & ~v38) * 4 + 2;
    v43 = ~((v41 ^ v42) + (v41 & v42) * 2) + ((v41 ^ v42) + (v41 & v42) * 2) * 2;
    v44 = (v40 ^ v43) + ((v40 & v43 - 1) - (v40 + v43) + (v40 & v43)) * 2;
    v45 = v44 + ((v40 - v43 & -(v40 | -v43)) * 4 + (v40 - v43 ^ -(v40 | -v43)) * 2 | ~v44) + (v44 | (v40 - v43 & -(v40 | -v43)) * 4 + (v40 - v43 ^ -(v40 | -v43)) * 2);
    v0 = (v45 + 1 ^ 14) + ((v45 + 1) * 2 & 28) - 1;
    v1 = v45 + 20;
    v46 = v2 >> ((char)v1 + v0 & 63);
    v47 = v1;
    v48 = v0;
    v49 = v47 + v48 + (0xffffffffffffffff ^ v47 * 2);
    v50 = ~(v49 + (v47 | ~v48));
    v51 = (v47 - v48 | (v49 + v50) * 2) + ((v49 + v50) * 2 & v47 - v48);
    v52 = ((v48 | v47) & -v48) * 4 + ((v48 | v47) ^ -v48) * 2 | 1;
    v53 = ~((v52 ^ v48 - v47) + (v52 & v48 - v47) * 2) + ((v52 ^ v48 - v47) + (v52 & v48 - v47) * 2) * 2;
    v54 = v51 + ~v51 * 2 + 1;
    v55 = (v53 ^ v51) + (v54 + (-v53 | ~v54)) * 2 + (v53 - (v53 - 1 & v51) & v51 - v53) * 4 + ((v53 - (v53 - 1 & v51) ^ v51 - v53) + (v53 & v51)) * 2;
    v0 = v55 + 53115;
    v1 = (v55 + 2 ^ 12423) + (v55 + (12423 | ~(v55 + 2))) * 2 + 5;
    v56 = (unsigned int)v1 + (unsigned int)v0;
    v57 = v56 + ~v56 * 2 + 1;
    g_f12738 = (unsigned short)v56 + (unsigned short)v46 + (unsigned short)v46 + (unsigned short)~(v57 + v56 + v46 + (v46 | ~v57));
    v58 = v1;
    v59 = v0;
    v60 = v59 + 1;
    v61 = (v60 + ~v59 * 2 & v58) + v59;
    v62 = -((v59 - v58 + (v58 | ~v59) ^ v58 + 1) + (v59 - v58 + (v58 | ~v59) & v58 + 1) * 2);
    v63 = v59 * 2;
    v64 = v59 + v58;
    v65 = v63 - (v64 + (v59 | ~v58));
    v66 = (((v65 & v64 + ~v63) * 4 + (v65 ^ v64 + ~v63) * 2 | 1) ^ (v59 ^ -v58) + (v60 + (-v58 | ~v59)) * 2) + (((v65 & v64 + ~v63) * 4 + (v65 ^ v64 + ~v63) * 2 | 1) & (v59 ^ -v58) + (v60 + (-v58 | ~v59)) * 2) * 2;
    v67 = v66 - 1;
    v68 = (v62 ^ v61) + (v61 + (v62 | ~v61)) * 2 - v66 * 4 + v67 + 5;
    v69 = (v68 & 1) + 1;
    v70 = v69 + (v68 + v67 * 2 & 0xfffffffffffffffe);
    v0 = ((v70 | 20) + 1 ^ v70 & 20) + ((v70 | 20) + 1 & v70 & 20) * 2 - 1;
    v1 = (v70 | 1) + (v69 & 1) + 27;
    g_f1273a = v2 >> ((((char)v1 | ~v0) ^ v0 + 1) + ((char)v1 | v0) + (((char)v1 | ~v0) & v0 + 1) * 2 & 63);
    v71 = -g_f12734;
    v72 = g_f12734 + ~g_f04ba0;
    v73 = (g_f04ba0 & ~g_f12734) + 1;
    v74 = g_f12734 + g_f04ba0 + (v71 & ~g_f04ba0) * 2 + (g_f04ba0 + (v71 | ~g_f04ba0)) * 2 + 2;
    g_f04ba0 = (unsigned short)v74 + ((v73 & v72) * 4 + (v73 ^ v72) * 2 | (unsigned short)~v74) + ((v73 & v72) * 4 + (v73 ^ v72) * 2 | (unsigned short)v74) + 1;
    v75 = g_f04ba2;
    v76 = g_f04ba2 + 1;
    v77 = v76 + ~v75 * 2;
    v78 = -g_f12736;
    g_f04ba2 = (unsigned short)v75 + g_f12736 + ((unsigned short)v76 + (unsigned short)~v75 * 2 + (unsigned short)v76 + ((unsigned short)v78 | (unsigned short)~v75) + ((unsigned short)v78 & (unsigned short)~v75) + ((unsigned short)v76 + (unsigned short)~v75 * 2 + (unsigned short)~v77 * 2 + 1 | g_f12736)) * 2 + 2;
    v79 = g_f12738 + g_f04ba4;
    v80 = g_f12738 | g_f04ba4;
    g_f04ba4 = (unsigned short)((~g_f12738 & ~g_f04ba4) - (v79 & -v80) * 2) + ((unsigned short)(v80 - 1) ^ v79) + (unsigned short)v80 * 2 + 2;
    g_f04ba6 = g_f1273a + ~g_f1273a * 2 + 1 & g_f04ba6 | g_f1273a & ~g_f04ba6;
    g_f04ba8 = g_f04ba8 - v2 + (v2 & ~g_f04ba8) * 2;
    return v78 & ~v75;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x509a88..0x50a370 (2280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_509a88_0 {
    char field_0;
} st_509a88_0;

extern unsigned short g_f044b0;
extern unsigned short g_f044b2;
extern unsigned short g_f044b4;
extern unsigned short g_f044b6;
extern unsigned long long g_f044b8;
extern unsigned short g_f12028;
extern unsigned short g_f1202a;
extern unsigned short g_f1202c;
extern unsigned short g_f1202e;
extern unsigned long g_fffffffffffffff0;
extern unsigned int g_fffffffffffffff8;
extern char g_fffffffffffffffc;

int sub_509a88(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned int v12;  // w10
    unsigned int v13;  // w13
    unsigned int v14;  // w12
    unsigned short v15;  // x10
    unsigned long long v16;  // x11
    unsigned long v17;  // x12
    unsigned long long v18;  // x15
    unsigned long long v19;  // x16
    unsigned long long v20;  // x11
    unsigned long long v21;  // x12
    st_509a88_0 *v4;  // x10
    unsigned long long v22;  // x11
    unsigned long long v23;  // x11
    unsigned long long v24;  // x11
    unsigned long long v25;  // x12
    unsigned int v26;  // w11
    unsigned long v27;  // x12
    unsigned long v28;  // x13
    unsigned long long v29;  // x15
    unsigned long long v30;  // x14
    unsigned long long v31;  // x15
    st_509a88_0 **v5;  // x11
    unsigned long long v32;  // x14
    unsigned long long v33;  // x15
    unsigned long long v34;  // x12
    unsigned long long v35;  // x12
    unsigned long long v36;  // x12
    unsigned long long v37;  // x13
    unsigned long long v38;  // x12
    unsigned int v39;  // w12
    unsigned short v40;  // x14
    unsigned short v41;  // x12
    unsigned long long v6;  // x12
    unsigned int v42;  // w13
    unsigned long long v43;  // x12
    unsigned long long v44;  // x13
    unsigned long long v45;  // x14
    unsigned long long v46;  // x13
    unsigned long long v47;  // x12
    unsigned long long v48;  // x12
    unsigned long long v49;  // x13
    unsigned long long v50;  // x15
    unsigned long long v51;  // x14
    unsigned long long v7;  // x10
    unsigned int v52;  // w12
    unsigned long v53;  // x13
    unsigned long long v54;  // x14
    unsigned long long v55;  // x16
    unsigned long long v56;  // x17
    unsigned long long v57;  // x15
    unsigned long long v58;  // x1
    unsigned long long v59;  // x13
    unsigned long long v60;  // x13
    unsigned long long v61;  // x13
    unsigned long long v8;  // x11
    unsigned long v62;  // x13
    unsigned long long v63;  // x14
    unsigned int v64;  // w13
    unsigned int v65;  // w14
    unsigned long long v66;  // x13
    unsigned long v67;  // x14
    unsigned long long v68;  // x15
    unsigned long long v69;  // x0
    unsigned long long v70;  // x13
    unsigned long long v71;  // x13
    unsigned long long v9;  // x12
    unsigned long long v72;  // x14
    unsigned long long v73;  // x15
    unsigned int v74;  // w13
    unsigned short v75;  // x15
    unsigned int v76;  // w16
    unsigned short v77;  // x10
    unsigned short v78;  // x13
    unsigned int v79;  // w10
    unsigned short v80;  // x11
    unsigned int v81;  // w10
    unsigned long long v10;  // x14
    unsigned int v82;  // w13
    unsigned int v83;  // w12
    unsigned int v84;  // w13
    unsigned int v85;  // w10
    unsigned long long v87;  // x11
    unsigned long long v88;  // x8
    unsigned long long v11;  // x10
    st_509a88_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_509a88_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f044b0 + ~(~&g_f044b0 + &g_f044b0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 * 3 + ~v4 * 4 + 3;
    v7 = v4 + v5 - (v5 ^ v4) + 2;
    v8 = v7 + ((v6 & v5) - v6 - (char *)v5 & v6 + (char *)v5) * 4 + (((v6 & v5) - v6 - (char *)v5 ^ v6 + (char *)v5) + (char *)~v5) * 2;
    v9 = v8 + ~v8 * 2;
    v10 = (v8 + 61918 ^ -(v8 | 61918)) + (v8 + 61918 & -(v8 | 61918)) * 2;
    v11 = (v8 | 1) + (v7 & 1) + 61918 + ((unsigned int)v9 + 1 | 0xffffffffffff0e21);
    v0 = v8 + (v8 & 3617) + ((0xffffffff ^ (unsigned int)v8 * 2) & 7234) + (v9 ^ ~(3617 | ~v8)) + ((3617 | ~v8) & ~v9) * 2 - 3617;
    v1 = v10 + v11 + (v11 | ~v10) + (v10 & ~v11) + 1;
    v12 = v0;
    v13 = v12 + 1;
    v14 = v13 + ~v12 * 2 | (unsigned int)v1;
    v15 = ((unsigned short)v1 | (unsigned short)v12) + ((unsigned short)v14 ^ (unsigned short)v13) + ((unsigned short)v14 & (unsigned short)v13) * 2 + ((unsigned short)v1 | (unsigned short)v12 | (unsigned short)~((v14 ^ v13) + (v14 & v13) * 2)) + (((unsigned short)v14 ^ (unsigned short)v13) + ((unsigned short)v14 & (unsigned short)v13) * 2 & (unsigned short)~((unsigned int)v1 | v12)) + 1;
    g_f12028 = (unsigned short)((unsigned int)v3 * 2 + ((unsigned int)v3 ^ 0xfffe) - (((unsigned int)v3 * 2 & 2) + (v15 ^ (unsigned int)v3))) + (v15 & (unsigned short)~(unsigned int)v3) + 2;
    v16 = v1;
    v17 = v0;
    v18 = (v17 - v16 + (v16 | ~v17) ^ v16 + 1) + (v17 - v16 + (v16 | ~v17) & v16 + 1) * 2;
    v19 = (v17 ^ 1) + ~v17 * 2 + ((v17 * 2 | v17 >> 63) & 2 & 3);
    v20 = v17 + v16 + (-v16 & ~v17) * 2 + (v17 + (-v16 | ~v17)) * 2 + 2;
    v21 = ((v19 + ~v19 * 2 + 1 | v16) + v19) * 2 + 3;
    v22 = ~((v21 ^ v20) + (v21 & v20) * 2) + ((v21 ^ v20) + (v21 & v20) * 2) * 2;
    v23 = (v17 | v16) + v18 + ~v18 * 2 + v22 - v22 * 2 + 2;
    v0 = ((v23 | (char *)&g_fffffffffffffff0 + 1) + 15 ^ -((char *)&g_fffffffffffffff0 + 1 & ~v23)) + ((v23 | (char *)&g_fffffffffffffff0 + 1) + 15 & -((char *)&g_fffffffffffffff0 + 1 & ~v23)) * 2 - 1;
    v1 = (v23 ^ 3 | 0xfffffffffffffffe) + (((v23 * 2 | v23 >> 63) & 6 & 7) + (v23 ^ 3) & 0xfffffffffffffffe) + 1;
    v24 = v1 | v0;
    v25 = (v1 + v0 ^ -v24) + (v1 + v0 & -v24) * 2;
    v26 = v3 >> ((char)v25 + ((char)v24 | (char)~v25) + ((char)v25 | (char)v24) + 1 & 63);
    v27 = v1;
    v28 = v0;
    v29 = v28 | v27;
    v30 = (~v28 & ~v27) + v29 * 2 + 1;
    v31 = (v28 + v27 ^ -v29) + (v28 + v27 & -v29) * 2;
    v32 = v31 + v30 + (-v31 & ~v30) * 2 + (v30 - v31 - (v30 | -v31)) * 2;
    v33 = v28 + (v27 | ~v28) + (v28 ^ v27) + 1;
    v34 = v33 + (v28 & v27) + (-(v28 & v27) & ~v33) * 2 + (v33 - (v28 & v27) - (v33 | -(v28 & v27))) * 2;
    v35 = v34 * 3 + ~v34 * 4 + 3;
    v36 = v32 + (v35 | ~v32) + (v35 | v32);
    v37 = v36 + 2;
    v38 = ((v36 + 7066 ^ -(v37 | 7064)) + (v36 + 7066 & -(v37 | 7064)) * 2 ^ (v37 | 7064) + 1) + ((v36 + 7066 ^ -(v37 | 7064)) + (v36 + 7066 & -(v37 | 7064)) * 2 & (v37 | 7064) + 1) * 2;
    v0 = ((0xfffffffffffffffd - v36 | 58471) ^ v36 + 3) + (v37 | 58471) + ((0xfffffffffffffffd - v36 | 58471) & v36 + 3) * 2;
    v1 = ~v38 + v38 * 2;
    v39 = v0;
    v40 = ((unsigned short)v39 + (unsigned short)~v39 * 2 ^ (unsigned short)~(v39 + ~v39 * 2 + 1 | (unsigned int)v1)) + (((unsigned short)v39 + (unsigned short)~v39 * 2 + 1 | (unsigned short)v1) & (unsigned short)~(v39 + ~v39 * 2)) * 2;
    v41 = (v40 ^ ((unsigned int)v1 | v39) + 1) + (v40 & ((unsigned int)v1 | v39) + 1) * 2 - 1;
    v42 = (v26 ^ 1) + ~v26 * 2 + (__ROL__(v26, 1) & 2 & 3);
    g_f1202a = (unsigned short)v42 + (unsigned short)v26 + (v41 | (unsigned short)~v42) + (v41 ^ (unsigned short)v42) + 2;
    v43 = v1;
    v44 = -v43;
    v45 = v0;
    v46 = (v45 ^ v44) + 1;
    v47 = v46 + ((v45 | v43) & -v45) * 4 + (v45 - v43 - (v45 | v44) + ((v45 | v43) ^ -v45)) * 2;
    v48 = (v45 ^ v43) - ((-v47 | 1) + (v46 & 1)) + ((-v47 | 1) + (v46 & 1) & ~(v45 ^ v43)) * 2 + (v47 - v47 * 2 + 1 & (v45 ^ v43)) * 2;
    v49 = (v48 & &g_fffffffffffffffc ^ 0xfffffffffffffffd ^ v48 + 3) + ((v48 & &g_fffffffffffffffc ^ 0xfffffffffffffffd) & v48 + 3) * 2;
    v50 = v48 * 2;
    v51 = v48 + (v48 & 3) - (v50 | (char *)&g_fffffffffffffff8 + 1) - 3;
    v0 = (v49 ^ v51) + (v49 & v51) * 2 - 1;
    v1 = (v48 ^ 30) + (v50 & 60) - 1;
    v52 = v3 >> ((char)((((char)v1 | (char)v0) + 1 ^ (char)v1 & (char)v0) + (((char)v1 | (char)v0) + 1 & (char)v1 & (char)v0) * 2 - 1) & 63);
    v53 = v1;
    v54 = v0;
    v55 = -v54;
    v56 = v54 + v53 + (v55 & ~v53) * 2;
    v57 = (v56 + (v53 + (v55 | ~v53)) * 2 + 2 | (v54 & ~v53) * 2) + (v56 + (v53 + (v55 | ~v53)) * 2 + 2 & (v54 & ~v53) * 2);
    v58 = v54 + 1;
    v59 = v58 + ~v54 * 2 | v53;
    v60 = (v59 & v58) * 2 - (v54 + (v54 ^ v53) + (v53 | ~v54) + (v59 ^ 0xfffffffffffffffe - v54)) - 3;
    v61 = v57 + (v60 | ~v57) + (v60 | v57) + 1;
    v62 = (v61 * 2 & 4) + (v61 ^ 2);
    v63 = ~v62 + v62 * 2;
    v0 = (v63 ^ 57112) + ((-v62 | 57112) + v62) * 2 - 1;
    v1 = v63 + 8424;
    v64 = (unsigned int)v1 + v0;
    v65 = v52 + (v64 | ~v52) + 1;
    g_f1202c = (unsigned short)v65 + ((unsigned short)v64 | (unsigned short)v52) + ((unsigned short)v64 | (unsigned short)v52) + ((unsigned short)(v65 - (v65 + (v64 | v52) | -(v64 | v52))) + ((unsigned short)-(v64 | v52) & (unsigned short)~(v65 + (v64 | v52)))) * 2;
    v66 = v1;
    v67 = v0;
    v68 = (v67 & v66) + (v67 & ~v66) * 2 - v67 - (v66 + ~v66 * 2 + 1 | v67);
    v69 = v67 + 1 + ~v67 * 2 + v67 + 1 + (v66 | ~(v67 + 1 + ~v67 * 2));
    v70 = -((v67 + v66 ^ -(v67 | v66)) + (v67 + v66 & -(v67 | v66)) * 2);
    v71 = v70 - v69 + (v68 | 1) + (v68 & 1) - (v70 & ~v69) * 2 + (~v69 - (v70 | ~v69)) * 2;
    v72 = v71 - 2;
    v73 = v72 * 2;
    v0 = (v71 - 5 | 0xfffffffffffffffe) + ((~(unsigned int)v73 & 6) + v71 - 5 + (v72 + (~v72 | 3)) * 2 + 2 & 0xfffffffffffffffe) + 1;
    v1 = (v72 ^ 47) + (v73 & 94) - 1;
    g_f1202e = v3 >> ((char)v1 + v0 & 63);
    v74 = g_f044b0;
    v75 = -g_f12028;
    v76 = (v74 ^ 1) + ~v74 * 2 + (__ROL__(v74, 1) & 2 & 3);
    v77 = g_f12028 + (unsigned short)v74 + (v75 & (unsigned short)~v74) * 2 + (unsigned short)(v74 - g_f12028 - (v75 | v74)) * 2;
    v78 = ((unsigned short)v76 + g_f12028 + ((unsigned short)~v76 & ~g_f12028)) * 2 + 3;
    g_f044b0 = (v78 ^ v77) + (v78 & v77) * 2 - 1;
    v79 = g_f044b2 - g_f1202a;
    v80 = (g_f1202a & ~g_f044b2) * 2;
    g_f044b2 = (unsigned short)v79 + (v80 | (unsigned short)~v79) + (v80 | (unsigned short)v79) + 1;
    v81 = (g_f044b4 | ~g_f1202c) + g_f1202c;
    g_f044b4 = (~g_f1202c & ~g_f044b4) + (g_f1202c | g_f044b4) * 2 + (unsigned short)v81 + (unsigned short)~v81 * 2 + 2;
    v82 = g_f1202e + 1;
    v83 = v82 + g_f044b6 + (v82 + ~g_f1202e * 2 | ~g_f044b6);
    v84 = g_f1202e + g_f044b6;
    v85 = -(g_f044b6 | g_f1202e);
    g_f044b6 = v83 + 1 + (v84 ^ v85) + (v84 & v85) * 2 + (v83 + 1 + (-((v84 ^ v85) + (v84 & v85) * 2) & 0xffff | ~v83) + (-((v84 ^ v85) + (v84 & v85) * 2) & 0xffff & ~v83)) * 2 - 1;
    v87 = g_f044b8 + (v3 | ~g_f044b8) + (g_f044b8 ^ v3) + 1;
    v88 = g_f044b8 & v3;
    g_f044b8 = (v87 ^ -v88) + (v87 - v88 - (v87 | -v88)) * 2;
    return v74 - g_f12028;
}

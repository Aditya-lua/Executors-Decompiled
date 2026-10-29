/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x943a34..0x9442c8 (2196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_943a34_0 {
    char field_0;
} st_943a34_0;

extern unsigned short g_f04b80;
extern unsigned short g_f04b82;
extern unsigned short g_f04b84;
extern unsigned short g_f04b86;
extern unsigned long long g_f04b88;
extern unsigned short g_f12724;
extern unsigned short g_f12726;
extern unsigned short g_f12728;
extern unsigned short g_f1272a;

int sub_943a34(void)
{
    unsigned long long v2;  // x8
    st_943a34_0 *v3;  // x10
    unsigned long long v12;  // x14
    unsigned int v13;  // w10
    unsigned int v14;  // w11
    unsigned int v15;  // w12
    unsigned int v16;  // w13
    unsigned int v17;  // w10
    unsigned long long v18;  // x11
    unsigned long long v19;  // x12
    unsigned long long v20;  // x15
    unsigned long long v21;  // x13
    st_943a34_0 **v4;  // x12
    unsigned long long v22;  // x14
    unsigned long long v23;  // x14
    unsigned long long v24;  // x17
    unsigned long long v25;  // x11
    unsigned long long v26;  // x11
    unsigned long long v27;  // x11
    unsigned long long v28;  // x12
    unsigned long long v29;  // x11
    unsigned long long v30;  // x11
    unsigned long long v31;  // x12
    unsigned long long v5;  // x13
    unsigned long long v32;  // x14
    unsigned long long v33;  // x11
    unsigned int v34;  // w12
    unsigned long long v35;  // x11
    unsigned long long v36;  // x14
    unsigned long long v37;  // x16
    unsigned long long v38;  // x11
    unsigned int v39;  // w11
    unsigned int v40;  // w14
    unsigned int v41;  // w15
    unsigned long long v6;  // x14
    unsigned int v42;  // w11
    unsigned int v43;  // w14
    unsigned long v44;  // x14
    unsigned long long v45;  // x15
    unsigned long long v46;  // x16
    unsigned long long v47;  // x0
    unsigned long long v48;  // x14
    unsigned long long v49;  // x15
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v7;  // x10
    unsigned long long v53;  // x15
    unsigned long long v54;  // x16
    unsigned long long v55;  // x1
    unsigned long long v56;  // x13
    unsigned long long v57;  // x0
    unsigned long long v58;  // x17
    unsigned long long v59;  // x15
    unsigned long long v60;  // x16
    unsigned long long v61;  // x17
    unsigned long long v8;  // x10
    unsigned long long v62;  // x13
    unsigned long v63;  // x14
    unsigned long long v64;  // x15
    unsigned long long v65;  // x17
    unsigned long long v66;  // x17
    unsigned long long v67;  // x16
    unsigned long long v68;  // x14
    unsigned long v69;  // x15
    unsigned long long v70;  // x14
    unsigned long long v71;  // x15
    unsigned long long v9;  // x10
    unsigned long long v72;  // x14
    unsigned int v73;  // w14
    unsigned int v74;  // w17
    unsigned int v75;  // w16
    unsigned short v76;  // x10
    unsigned int v77;  // w10
    unsigned int v78;  // w12
    unsigned short v79;  // x14
    unsigned short v80;  // x16
    unsigned short v81;  // x12
    unsigned long long v10;  // x11
    unsigned int v82;  // w11
    unsigned int v83;  // w13
    unsigned int v84;  // w11
    unsigned long long v85;  // x11
    unsigned long v86;  // x8
    unsigned long long v11;  // x12
    st_943a34_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_943a34_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0x8e35514eca9cffea + ((8199558154249729408 + ~8199558154249729408 * 2 + 1 & 15272867221) + 0x71caaeb031220000) * 2;
    v3 = v1;
    v4 = v0;
    v5 = v3 & ~v4;
    v6 = ((1 | (v4 - v3 + v5) * 2) ^ v3 - v4) + ((1 | (v4 - v3 + v5) * 2) & v3 - v4) * 2;
    v7 = (char *)v4 + 1 + v3 + (-v3 & ~v4) * 2 + ((char *)v4 + (-v3 | ~v4) + 1) * 2;
    v8 = (v5 * 2 | -v7) + v5 * 2 + v7 * 2 - (v7 - 1 & v5 * 2);
    v9 = ((((1 - v8 & v6 - 1) - (~v6 + v6 * 2 - (v8 - 1)) & ~v6 + v6 * 2 - (v8 - 1)) * 4 + ((1 - v8 & v6 - 1) - (~v6 + v6 * 2 - (v8 - 1)) ^ ~v6 + v6 * 2 - (v8 - 1)) * 2 | 1) ^ (v8 - 1 - (~v6 + v6 * 2) + (~v6 + v6 * 2 | 1 - v8) ^ (~v6 + v6 * 2 | 1 - v8)) + (v8 - 1 - (~v6 + v6 * 2) + (~v6 + v6 * 2 | 1 - v8) & (~v6 + v6 * 2 | 1 - v8)) * 2) + ((((1 - v8 & v6 - 1) - (~v6 + v6 * 2 - (v8 - 1)) & ~v6 + v6 * 2 - (v8 - 1)) * 4 + ((1 - v8 & v6 - 1) - (~v6 + v6 * 2 - (v8 - 1)) ^ ~v6 + v6 * 2 - (v8 - 1)) * 2 | 1) & (v8 - 1 - (~v6 + v6 * 2) + (~v6 + v6 * 2 | 1 - v8) ^ (~v6 + v6 * 2 | 1 - v8)) + (v8 - 1 - (~v6 + v6 * 2) + (~v6 + v6 * 2 | 1 - v8) & (~v6 + v6 * 2 | 1 - v8)) * 2) * 2;
    v10 = ~v9 + v9 * 2;
    v11 = -v9;
    v12 = (v11 | 0xfffffffffffffd73) + (1 & ~v9) + (v10 | 1) + 652;
    v0 = ((v11 | 652) + v10 + 1 | v12) + (v12 & (v11 | 652) + v10 + 1);
    v1 = (v10 | 0xffffffffffff028c) + (0xffffffffffff028b - (v10 | 0xffffffffffff028c) | v9 + 64883 + (v11 | 0xffffffffffff028c)) + ((v10 | 0xffffffffffff028c) + 64884 | v9 + 64883 + (v11 | 0xffffffffffff028c)) + 64885;
    v13 = v0;
    v14 = v1;
    v15 = v14 + v13;
    v16 = (v15 ^ -(v14 | v13)) + (v15 & -(v14 | v13)) * 2;
    v17 = v15 - (v14 & v13) + 1;
    g_f12724 = (unsigned short)(((v16 ^ v15 - (v14 & v13) + 1) + (v16 & v15 - (v14 & v13) + 1) * 2 ^ (unsigned int)v2) - (((unsigned int)v2 & -((v16 ^ v17) + (v16 & v17) * 2)) + (v16 ^ v15 - (v14 & v13) + 1) + (v16 & v15 - (v14 & v13) + 1) * 2)) + (((unsigned short)v16 ^ (unsigned short)(v15 - (v14 & v13)) + 1) + ((unsigned short)v16 & (unsigned short)(v15 - (v14 & v13)) + 1) * 2 & (unsigned short)v2) * 2;
    v18 = v1;
    v19 = v0;
    v20 = v18 + 1;
    v21 = v19 + v20 + (v19 + ~v19 * 2 + 1 | ~v18);
    v22 = (v20 + ~v18 * 2 | v19) + v18;
    v23 = v22 + v21 + (v21 & ~v22) * 2 + (~v21 & ~v22) * 2;
    v24 = v19 ^ v18;
    v25 = v24 + (v19 ^ ~v18) * 2;
    v26 = v25 + (0xfffffffffffffffd - v25 & 0xfffffffffffffffe - v23) + 2;
    v27 = (v23 + 1 ^ v24) + (v26 & v23 + 2) * 4 + ((v23 + 1 | -v24) - (v23 + 2) + (v23 + 1 & v24) + (v26 ^ v23 + 2)) * 2;
    v28 = v27 + 3;
    v29 = ((v27 + 0x11 ^ -(v27 + 2 | 15)) + (v27 + 0x11 & -(v27 + 2 | 15)) * 2 ^ v28 + (v27 + 2 & 15) - ((v27 + 2) * 2 | 0xffffffffffffffe1) - 16) + ((v27 + 0x11 ^ -(v27 + 2 | 15)) + (v27 + 0x11 & -(v27 + 2 | 15)) * 2 & v28 + (v27 + 2 & 15) - ((v27 + 2) * 2 | 0xffffffffffffffe1) - 16) * 2;
    v0 = v28;
    v1 = ~v29 + v29 * 2;
    v30 = v0;
    v31 = v1;
    v32 = (v31 + v30 ^ -(v30 | v31)) + (v31 + v30 & -(v30 | v31)) * 2;
    v33 = v31 + 1 + v30 + (v31 + 1 + ~v31 * 2 | ~v30);
    v34 = v2 >> ((char)v33 + (char)v32 + ((char)v32 & (char)~v33) + ((char)v33 | (char)~v32) + 1 & 63);
    v35 = v1;
    v36 = v0;
    v37 = v36 - v35 + (v35 & ~v36) * 2;
    v38 = (((v37 + (v36 & v35) | -(v36 & v35)) - v37) * 2 - (v37 + (v36 & v35) + (v36 & v35) + (-(v36 & v35) & ~(v37 + (v36 & v35))) * 2) ^ (v36 | v35) + ~((v35 | ~v36) + v36)) + (((v37 + (v36 & v35) | -(v36 & v35)) - v37) * 2 - (v37 + (v36 & v35) + (v36 & v35) + (-(v36 & v35) & ~(v37 + (v36 & v35))) * 2) & (v36 | v35) + ~((v35 | ~v36) + v36)) * 2;
    v0 = v38 + 49869;
    v1 = v38 + (31334 & v38 * 2) + (31334 & v38 * 2 ^ 31334) + 0xffffffffffffc2cc;
    v39 = v0;
    v40 = v1;
    v41 = v39 + 1;
    v42 = v40 + v41 - (v40 & v39);
    v43 = ~(((v40 | ~v39) + v41 ^ v42) + ((v40 | ~v39) + v41 & v42) * 2) + (((v40 | ~v39) + v41 ^ v42) + ((v40 | ~v39) + v41 & v42) * 2) * 2 | v34 + (0xffffffff ^ v34 * 2);
    g_f12726 = (unsigned short)(v43 - v34) + ((unsigned short)v43 + ((unsigned short)v34 + 1 | (unsigned short)~v43) + ((unsigned short)v34 + 1 & (unsigned short)~v43)) * 2 + 1;
    v44 = v1;
    v45 = v0;
    v46 = v45 + ~v45 * 2 + 1;
    v47 = (v44 + ~v44 * 2 + 1 & v45) + v44;
    v48 = (v46 & v44 | v45 & ~v44) + ((v46 | v44) + v45 ^ v47) - (v47 & ~((v46 | v44) + v45)) * 2;
    v49 = (((v48 + 1 & 21 ^ 21) + (v48 + 1 ^ 0xffffffffffffffea) ^ v48 + 2) + ((v48 + 1 & 21 ^ 21) + (v48 + 1 ^ 0xffffffffffffffea) & v48 + 2) * 2 ^ v48 + (v48 + 1 & 21) - (0xffffffffffffffd5 | (v48 + 1) * 2) - 20) + (((v48 + 1 & 21 ^ 21) + (v48 + 1 ^ 0xffffffffffffffea) ^ v48 + 2) + ((v48 + 1 & 21 ^ 21) + (v48 + 1 ^ 0xffffffffffffffea) & v48 + 2) * 2 & v48 + (v48 + 1 & 21) - (0xffffffffffffffd5 | (v48 + 1) * 2) - 20) * 2;
    v0 = ~v49 + v49 * 2;
    v1 = v48 + 12;
    v50 = v0;
    v51 = (v1 ^ 1) + ~v1 * 2 + ((v1 * 2 | v1 >> 63) & 2 & 3);
    v53 = v1;
    v54 = v0;
    v55 = ~v54;
    v56 = (v54 & v53) + (v55 & ~v53) + (v54 | v53) * 2 + 2 + ((0xfffffffffffffffe - ((v55 & ~v53) + (v54 | v53) * 2) | -(v54 & v53)) + (v55 & ~v53) + (v54 | v53) * 2 + 2 + (0xfffffffffffffffe - ((v55 & ~v53) + (v54 | v53) * 2) & -(v54 & v53))) * 2 - 1;
    v57 = v53 + 1;
    v58 = v57 + ~v53 * 2 | ~v54;
    v59 = (v58 + v57 - (v54 + v55 * 2 + 1 | v53) | 1) + (v58 + v57 - (v54 + v55 * 2 + 1 | v53) & 1);
    v60 = v59 - 2;
    v61 = v56 + v60 + ((v56 & v59 - 3) - (v56 + v60)) * 2;
    v62 = v61 + (((v56 & 2 - v59) - (v56 - v60) & v56 - v60) * 4 + ((v56 & 2 - v59) - (v56 - v60) ^ v56 - v60) * 2 | ~v61) + (((v56 & 2 - v59) - (v56 - v60) & v56 - v60) * 4 + ((v56 & 2 - v59) - (v56 - v60) ^ v56 - v60) * 2 | v61);
    v0 = v62 + 53124;
    v1 = (v62 + 1 ^ 12413) + (v62 + 1 + (12413 | ~(v62 + 1))) * 2 + 1;
    g_f12728 = (unsigned short)v1 + (unsigned short)v0 & (unsigned short)(v2 >> (((char)v51 + (char)v50 | 254) + ((char)v51 + (char)v50 + ((char)v50 + ((char)-v51 | (char)~v50) + ((char)-v51 & (char)~v50)) * 2 + 2 & 254) + 1 & 63));
    v63 = v1;
    v64 = v0;
    v65 = (v63 | v64) - (v63 + (v64 | ~v63));
    v66 = (v65 | 1) + (v65 & 1) - 2;
    v67 = (v64 ^ 1) + ~v64 * 2 + ((v64 * 2 | v64 >> 63) & 2 & 3);
    v68 = (v63 - (v67 + v63 ^ -(v67 | v63))) * 2 - (v63 + v64 + (v67 + v63 & -(v67 | v63)) * 4);
    v69 = v68 ^ v66;
    v70 = v69 + (v68 & v66) * 2;
    v71 = (v69 | 0xfffffffffffffffe) + (-v70 | 1) + 1;
    v72 = v71 + v70 * 2;
    v0 = (20 | ~v72) + v72 * 2 + ((unsigned int)v72 + (unsigned int)~v72 * 2 + 1 | 0xffffffffffffffeb) + 22;
    v1 = ((v72 | 1) + (v71 & 1) + 28 | 1) + ((v72 | 1) + (v71 & 1) + 28 & 1) - 2;
    g_f1272a = v2 >> ((char)(v0 + (v1 ^ 0xfffffffffffffffe) - ~v1 * 2 - ((v1 * 2 | v1 >> 63) & 2 & 3)) & 63);
    v73 = g_f04b80;
    v74 = g_f12724 + g_f04b80;
    v75 = v74 + (0xffffffff ^ g_f04b80 * 2);
    v76 = -g_f12724;
    g_f04b80 = (unsigned short)v74 + (unsigned short)(g_f04b80 + (v76 | ~v73) + (v76 & ~g_f04b80) + v75 - (v75 + (g_f04b80 | ~g_f12724))) * 2;
    v77 = g_f04b82 + 1;
    v78 = v77 + ~g_f04b82 * 2 | g_f12726;
    g_f04b82 = (g_f12726 | g_f04b82) + ((unsigned short)v78 ^ (unsigned short)v77) + ((unsigned short)v78 & (unsigned short)v77) * 2 + (unsigned short)~((v78 ^ v77) + (v78 & v77) * 2) * 2 + 2;
    v79 = g_f04b84 + 1;
    v80 = ~g_f04b84 * 2;
    v81 = v79 + v80 | g_f12728;
    g_f04b84 = (unsigned short)((v81 ^ v80 + g_f04b84) + (g_f12728 | g_f04b84) - (v81 & v79) * 2) + 1;
    v82 = (0xffffffff ^ g_f04b86 * 2) + g_f04b86;
    v83 = v82 + g_f1272a;
    v84 = -(v82 | g_f1272a);
    g_f04b86 = g_f04b86 - g_f1272a + (unsigned short)~((v83 & v84) * 4 + (v83 ^ v84) * 2) + (((unsigned short)v83 & (unsigned short)v84) * 4 + ((unsigned short)v83 ^ (unsigned short)v84) * 2) * 2 + 1;
    v85 = g_f04b88 | v2;
    v86 = g_f04b88 + v2;
    g_f04b88 = v85 - (v86 & -v85) * 2 + (v85 - 1 ^ v86) + 1;
    return v75 + (v73 | ~g_f12724);
}

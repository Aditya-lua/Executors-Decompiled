/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93de18..0x93e7d0 (2488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_93de18_0 {
    char field_0;
} st_93de18_0;

extern unsigned short g_f04a90;
extern unsigned short g_f04a92;
extern unsigned short g_f04a94;
extern unsigned short g_f04a96;
extern unsigned long long g_f04a98;
extern unsigned short g_f126ac;
extern unsigned short g_f126ae;
extern unsigned short g_f126b0;
extern unsigned short g_f126b2;

unsigned int sub_93de18(void)
{
    unsigned long long v2;  // x8
    st_93de18_0 *v3;  // x10
    unsigned long long v12;  // x10
    unsigned short v13;  // x11
    unsigned long long v14;  // x13
    unsigned long v15;  // x14
    unsigned long long v16;  // x13
    unsigned long long v17;  // x13
    unsigned long long v18;  // x13
    unsigned long long v19;  // x13
    unsigned long long v20;  // x14
    unsigned long long v21;  // x13
    st_93de18_0 **v4;  // x11
    unsigned long long v22;  // x13
    char v23;  // x14
    unsigned int v24;  // w13
    unsigned long v25;  // x14
    unsigned long long v26;  // x15
    unsigned long long v27;  // x17
    unsigned long long v28;  // x16
    unsigned long long v29;  // x14
    unsigned long long v30;  // x14
    unsigned long long v31;  // x15
    unsigned long long v5;  // x13
    unsigned long long v32;  // x17
    unsigned long long v33;  // x15
    unsigned int v34;  // w17
    unsigned int v35;  // w1
    unsigned int v36;  // w16
    unsigned long v37;  // x16
    unsigned long v38;  // x17
    unsigned long long v39;  // x0
    unsigned long long v40;  // x1
    unsigned long long v41;  // x2
    unsigned long long v6;  // x14
    unsigned long long v42;  // x16
    unsigned long long v43;  // x17
    unsigned long long v44;  // x16
    unsigned long long v45;  // x17
    unsigned long long v46;  // x16
    unsigned long long v47;  // x0
    unsigned int v48;  // w16
    unsigned long v49;  // x17
    unsigned long long v50;  // x0
    unsigned long long v51;  // x2
    unsigned long long v7;  // x12
    unsigned long long v52;  // x3
    unsigned long long v53;  // x1
    unsigned long long v54;  // x5
    unsigned long long v55;  // x17
    unsigned long long v56;  // x15
    unsigned long long v57;  // x17
    unsigned long long v58;  // x0
    unsigned short v59;  // x17
    unsigned long long v60;  // x16
    unsigned long v61;  // x17
    unsigned long long v8;  // x10
    unsigned long v62;  // x1
    unsigned long long v63;  // x14
    unsigned long long v64;  // x17
    unsigned long v65;  // x12
    unsigned long long v66;  // x12
    unsigned long long v67;  // x12
    unsigned long long v68;  // x14
    unsigned long long v69;  // x17
    unsigned long long v70;  // x12
    unsigned long v71;  // x14
    unsigned long long v9;  // x10
    unsigned long long v72;  // x17
    unsigned long long v73;  // x16
    unsigned long long v74;  // x12
    unsigned long long v75;  // x12
    unsigned int v76;  // w14
    unsigned int v77;  // w16
    unsigned int v78;  // w17
    unsigned int v79;  // w0
    unsigned int v80;  // w11
    unsigned int v81;  // w14
    unsigned int v10;  // w11
    unsigned short v82;  // x14
    unsigned short v83;  // x16
    unsigned short v84;  // x14
    unsigned short v85;  // x15
    unsigned short v86;  // x14
    unsigned int v87;  // w13
    unsigned int v88;  // w15
    unsigned int v89;  // w14
    unsigned short v90;  // x14
    unsigned int v91;  // w11
    unsigned int v11;  // w12
    unsigned short v92;  // x11
    unsigned long v93;  // x12
    unsigned long long v94;  // x11
    st_93de18_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_93de18_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long, unsigned long

    v1 = &v0;
    v0 = &v1;
    v2 = 16918383034163734670 + ((1528361038075032912 + ~1528361038075032912 * 2 + 1 & 2846794273) + 1528361037387027792) * 2;
    v3 = v1;
    v4 = v0;
    v5 = v3 * 3 + ~v3 * 4;
    v6 = (char *)v4 - v5 + (v5 + 3 | ~v4) - 3;
    v7 = (v3 ^ -v4) + (v6 & v5 + 4) * 4 + (v3 - v4 - (v3 | -v4) + (v6 ^ v5 + 4)) * 2;
    v8 = (v4 | v3) + (v4 + v3 ^ -(v4 | v3)) + (v4 + v3 & -(v4 | v3)) * 2 + ~((v4 + v3 ^ -(v4 | v3)) + (v4 + v3 & -(v4 | v3)) * 2) * 2;
    v9 = ((~(v7 + 1) + (v7 + 1) * 2 ^ v8 + 2) + ((~(v7 + 1) + (v7 + 1) * 2 & v8 + 2) - ((~v7 | ~(v8 + 1)) + v8 + 1 + ~(v7 + 1) + (v7 + 1) * 2)) * 2 - 4 ^ (~(v7 + 1) + (v7 + 1) * 2 + (~v7 | ~(v8 + 1))) * 2 + 3) + ((~(v7 + 1) + (v7 + 1) * 2 ^ v8 + 2) + ((~(v7 + 1) + (v7 + 1) * 2 & v8 + 2) - ((~v7 | ~(v8 + 1)) + v8 + 1 + ~(v7 + 1) + (v7 + 1) * 2)) * 2 - 4 & (~(v7 + 1) + (v7 + 1) * 2 + (~v7 | ~(v8 + 1))) * 2 + 3) * 2;
    v0 = (v9 - 1 & 0xfffffffffffffffe) + (v9 - 1 | 0xfffffffffffffffe) + 43381;
    v1 = v9 + 22155;
    v10 = (unsigned int)((v0 & 0xffffffff) - v1) + ((unsigned int)v1 + 1 & ~v0) * 2 + (v0 + ((unsigned int)v1 + 1 | ~v0)) * 2;
    v11 = (v10 + 1 ^ (unsigned int)v2) + (v10 + 1 & (unsigned int)v2) * 2;
    v12 = ~v2;
    v13 = (unsigned short)~((v10 | (unsigned int)v12) + ((v10 & (unsigned int)v12) + (unsigned int)v2) * 2) + (unsigned short)v10;
    g_f126ac = (unsigned short)(~v11 - v13) + (unsigned short)v11 * 4 + (unsigned short)(v13 - v11) * 2;
    v14 = v1;
    v15 = v0;
    v16 = (v15 + ~v15 * 2 + 1 | v14) + v15;
    v17 = (v15 | v14) + v16 + ((v15 | v14) & ~v16) * 2 + (~v16 & ~(v15 | v14)) * 2;
    v18 = v15 + v14 + (v14 + (-v15 | ~v14) + (-v15 & ~v14) + (v14 + (0xffffffffffffffff ^ v14 * 2) & v15)) * 2 - v17 * 2 + (v17 + 1 ^ 1) + (((v17 + 1) * 2 | v17 + 1 >> 63) & 2 & 3) - 2;
    v19 = v18 + (v18 & 0xfffffffffffffffe) + (~v18 | 1);
    v20 = (-((unsigned int)v19 + 3) | 0xfffffffffffffffa) + v19 + 3;
    v21 = (0xfffffffffffffffb - v20 ^ v19 + 7) + (0xfffffffffffffffb - v20 & v19 + 7) * 2;
    v0 = (v21 & 0xfffffffffffffffa - v20) + v20 + 5 + (v21 & v20 + 5);
    v1 = (v19 + 2 | 1) + (v19 + 2 & 1) + 10;
    v22 = v1 | v0;
    v23 = ((char)v1 + (char)v0 ^ (char)-v22) + ((char)v1 + (char)v0 & (char)-v22) * 2;
    v24 = v2 >> ((v23 | (char)v22) + (v23 & (char)v22) & 63);
    v25 = v1;
    v26 = v0;
    v27 = v26 + v25;
    v28 = (-((v27 ^ -(v26 | v25)) + (v27 & -(v26 | v25)) * 2) ^ (v26 | v25)) + (-((v27 ^ -(v26 | v25)) + (v27 & -(v26 | v25)) * 2) & (v26 | v25)) * 2;
    v29 = v27 + (v26 + (-v25 | ~v26) + (-v25 & ~v26)) * 2 + 2;
    v30 = v29 + ((v25 & ~v26) * 2 | ~v29) + (v29 | (v25 & ~v26) * 2);
    v31 = v30 + 1;
    v32 = (v28 ^ v31) + ((v28 & v31) + ~v28 + (v28 | ~v30)) * 2;
    v33 = v32 + ((v31 - (v30 & v28) & v28 - v31) * 4 + (v31 - (v30 & v28) ^ v28 - v31) * 2 | 0xfffffffffffffffd - v32) + (v32 + 2 | (v31 - (v30 & v28) & v28 - v31) * 4 + (v31 - (v30 & v28) ^ v28 - v31) * 2) + 3;
    v0 = (v33 | 1) + (v33 & 1) + 53113;
    v1 = (v33 ^ 12422) + (v33 + (12422 | ~v33)) * 2 + 1;
    v34 = (unsigned int)v1 * 3 + ~(unsigned int)v1 * 4;
    v35 = v24 * 2;
    v36 = v0 + v34 + (v0 + ((unsigned int)(0x7ffffffffffffffd - v34) | ~v0) + ((unsigned int)(0x7ffffffffffffffd - v34) & ~v0)) * 2 + 4 | (v24 ^ 1) + ~v24 * 2 + (v35 & 2);
    g_f126ae = (unsigned short)v36 + (unsigned short)v24 + (unsigned short)~v35 + (unsigned short)(v24 + 1 + v36 + (-(v24 + ~v35) & ~v36) - (v36 | v24 + 1)) * 2;
    v37 = v1;
    v38 = v0;
    v39 = v38 & ~v37;
    v40 = v37 - v38;
    v41 = v40 + v39 * 2 + (v38 & v37) + (v38 & v37) + (-(v38 & v37) & ~(v40 + v39 * 2 + (v38 & v37))) * 2 + (v40 + v39 * 2 - (v40 + v39 * 2 + (v38 & v37) | -(v38 & v37))) * 2;
    v42 = v38 - v37 + (v40 + v39) * 2;
    v43 = v41 + v42 + ((v41 & v42 - 1) - (v41 + v42)) * 2;
    v44 = v43 + ((v41 & -v42) * 2 | ~v43) + (v43 | (v41 & -v42) * 2);
    v45 = v44 + 1;
    v46 = v44 + 2;
    v47 = v46 + ~v45 * 2;
    v0 = ((v47 | 10) + v46 | v45 | 10) + ((v47 | 10) + v46 & (v45 | 10));
    v1 = v45 + (0xffffffffffffffe9 | ~v45) + ((22 | ~v45) ^ -v47) + ((22 | ~v45) & -v47) * 2 + 23;
    v48 = v2 >> ((char)((((char)v1 | (char)v0) + 1 ^ (char)v1 & (char)v0) + (((char)v1 | (char)v0) + 1 & (char)v1 & (char)v0) * 2 - 1) & 63);
    v49 = v1;
    v50 = v0;
    v51 = v49 + ~v49 * 2 + 1;
    v52 = v51 & v50;
    v53 = (v49 ^ -v50) + (v49 - v50 - (v49 | -v50)) * 2 + v52 * 4 + 2;
    v54 = v50 + ~v50 * 2 + 1;
    v55 = v51 + v50 + ((v49 | ~v54) + v54) * 2;
    v56 = ((v53 + ~(v52 * 2)) * 2 + v52 * 2 - v53 ^ v55 + 3) + (~((v53 + ~(v52 * 2)) * 2 + v52 * 2 - v53 - (v55 + 3)) - (v55 + 2 | -(v53 + ~(v52 * 2))) & (v53 + ~(v52 * 2)) * 2 + v52 * 2 - v53 - (v55 + 3)) * 4 + (v53 + ~(v52 * 2) - (v53 + ~(v52 * 2)) * 2 + (0x7ffffffffffffffd - v55 | ~(v53 + ~(v52 * 2) - (v53 + ~(v52 * 2)) * 2)) + ((v53 + ~(v52 * 2)) * 2 + v52 * 2 - v53 & v55 + 3) + (~((v53 + ~(v52 * 2)) * 2 + v52 * 2 - v53 - (v55 + 3)) - (v55 + 2 | -(v53 + ~(v52 * 2))) ^ (v53 + ~(v52 * 2)) * 2 + v52 * 2 - v53 - (v55 + 3))) * 2;
    v57 = v56 + 2;
    v58 = (v56 + 3 + ~v57 * 2 | 13380) + v56 + 3;
    v0 = (v58 ^ (v57 | 13380) + 1) + (v58 & (v57 | 13380) + 1) * 2 - 1;
    v1 = v56 + 52157;
    v59 = (unsigned short)((unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 3;
    g_f126b0 = (unsigned short)((v48 ^ 0xfffe) + v48 * 4 - (v48 * 2 + (v48 * 2 & 2))) + ((unsigned short)((v59 ^ v0) + (v59 & v0) * 2 - 1) | (unsigned short)v48 + (unsigned short)~(v48 * 2)) + 3;
    v60 = v1;
    v61 = v0;
    v62 = ~v61;
    v63 = v60 + v61 + v62 * 2 + (v61 & ~v60) * 2 + (0xfffffffffffffffd - (v60 + v61 + v62 * 2) | (v61 & ~v60) * 2) + (v60 + v61 + v62 * 2 + 2 & ~((v61 & ~v60) * 2)) + 3;
    v64 = (v60 + v62 & -(v60 | ~v61)) * 4 + (v60 + v62 ^ -(v60 | ~v61)) * 2 | 1;
    v65 = (v64 ^ v61 - v60) + (v64 & v61 - v60) * 2 - 1 + (0xffffffffffffffff ^ ((v64 ^ v61 - v60) + (v64 & v61 - v60) * 2 - 1) * 2);
    v66 = v63 + (v65 | ~v63) + (v65 | v63) + 1;
    v67 = (v66 * 2 & 4) + (v66 ^ 2);
    v68 = v67 - 1;
    v69 = -v67;
    v0 = (v67 + (v69 & 0xffffffffffffffe7) + 24 ^ (v68 & 24) - (v68 ^ 0xffffffffffffffe7)) + (v67 + (v69 & 0xffffffffffffffe7) + 24 & (v68 & 24) - (v68 ^ 0xffffffffffffffe7)) * 2 - 1;
    v1 = (v69 | 24) + (v67 + 23 ^ -(v68 | 24)) + ((0xffffffff ^ (unsigned int)v68 * 2) & 48) + ((v67 + 23 & -(v68 | 24)) + v67) * 2 - 25;
    v70 = v0;
    v71 = v1;
    v72 = v70 + 1;
    v73 = v72 + ~v70 * 2 | v71;
    v74 = v72 - v71 + (v71 & v70) + (v71 & ~v70) * 2;
    v75 = ((v73 ^ v72) + (v73 & v72) * 2 ^ v74) + ((v73 ^ v72) + (v73 & v72) * 2 & v74) * 2;
    g_f126b2 = v2 >> ((char)~v75 + (char)v75 * 2 & 63);
    v76 = g_f04a90;
    v77 = -g_f126ac;
    v78 = g_f126ac + ~v76;
    v79 = (v76 & ~g_f126ac) + 1;
    v80 = g_f126ac + v76 + (v77 & ~v76) * 2 + (v76 + (v77 | ~v76)) * 2 + 2;
    v81 = (v79 & v78) * 4 + (v79 ^ v78) * 2 | 1;
    g_f04a90 = (unsigned short)~((v81 ^ v80) + (v81 & v80) * 2) + (((unsigned short)v81 ^ (unsigned short)v80) + ((unsigned short)v81 & (unsigned short)v80) * 2) * 2;
    v82 = g_f04a92 * 3 + ~g_f04a92 * 4;
    g_f04a92 = g_f04a92 - g_f126ae + (v82 + ((unsigned short)(0x7ffc - v82) | g_f126ae)) * 2 + 8;
    v83 = g_f04a94 * 2;
    v84 = v83 + ~g_f04a94 * 4 + (g_f04a94 ^ 1) + (v83 & 2);
    v85 = v84 + g_f126b0;
    v86 = 0xfffffffd - v85 - ((unsigned int)(0xfffffffd - v84) | ~g_f126b0);
    g_f04a94 = g_f04a94 - g_f126b0 + (v85 + 2 ^ v86) * 2 + (v85 + 2 & v86) * 4;
    v87 = g_f126b2 + g_f04a96;
    v88 = g_f126b2 + 1;
    v89 = v88 + ~g_f126b2 * 2;
    v90 = (unsigned short)v89 + (unsigned short)v88 + (g_f04a96 | (unsigned short)~v89);
    v91 = -(g_f126b2 | g_f04a96);
    v92 = -((v87 ^ v91) + (v87 & v91) * 2);
    g_f04a96 = (v90 ^ v92) + (v90 & v92) * 2;
    v93 = g_f04a98 + v2;
    v94 = g_f04a98 | v2;
    g_f04a98 = v2 + v2 + v12 * 2 + 1 + (g_f04a98 | ~(v2 + v12 * 2 + 1)) - (v93 & -v94) * 2 + (v94 - 1 ^ v93) + 2;
    return v77 & ~v76;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dd24c..0x4ddb80 (2356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4dd24c_0 {
    char field_0;
} st_4dd24c_0;

extern unsigned short g_f045d0;
extern unsigned short g_f045d2;
extern unsigned short g_f045d4;
extern unsigned short g_f045d6;
extern unsigned long long g_f045d8;
extern unsigned short g_f120b8;
extern unsigned short g_f120ba;
extern unsigned short g_f120bc;
extern unsigned short g_f120be;

unsigned int sub_4dd24c(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v13;  // x12
    unsigned long long v14;  // x13
    unsigned long long v15;  // x15
    unsigned long long v16;  // x11
    unsigned long long v17;  // x11
    unsigned long long v18;  // x14
    unsigned long long v19;  // x13
    unsigned long v20;  // x15
    unsigned int v21;  // w11
    unsigned int v22;  // w11
    st_4dd24c_0 *v5;  // x11
    unsigned long long v23;  // x13
    unsigned long long v24;  // x14
    unsigned long long v25;  // x15
    unsigned long long v26;  // x16
    unsigned long long v27;  // x15
    unsigned long long v28;  // x15
    unsigned long long v29;  // x13
    unsigned long v30;  // x14
    unsigned long long v31;  // x15
    unsigned long long v32;  // x12
    st_4dd24c_0 **v6;  // x13
    unsigned int v33;  // w12
    unsigned long long v34;  // x14
    unsigned long long v35;  // x14
    unsigned long long v36;  // x15
    unsigned long long v37;  // x15
    unsigned int v38;  // w14
    unsigned long v39;  // x14
    unsigned long long v40;  // x16
    unsigned long long v41;  // x14
    unsigned long long v42;  // x13
    unsigned long long v7;  // x17
    unsigned int v43;  // w13
    unsigned long v44;  // x14
    unsigned long long v45;  // x15
    unsigned long long v46;  // x16
    unsigned long long v47;  // x0
    unsigned long long v48;  // x16
    unsigned long long v49;  // x17
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v52;  // x14
    unsigned long long v8;  // x15
    unsigned long long v53;  // x15
    unsigned long long v54;  // x0
    unsigned int v55;  // w14
    unsigned int v56;  // w15
    unsigned int v57;  // w14
    unsigned int v58;  // w13
    unsigned long long v59;  // x14
    unsigned long long v60;  // x15
    unsigned long long v61;  // x0
    unsigned long long v62;  // x16
    unsigned long long v9;  // x14
    unsigned long long v63;  // x2
    unsigned long long v64;  // x16
    unsigned long long v65;  // x14
    unsigned long long v66;  // x15
    unsigned long long v67;  // x14
    unsigned long v68;  // x16
    unsigned long long v69;  // x14
    unsigned long long v70;  // x15
    unsigned long long v71;  // x17
    unsigned long long v72;  // x0
    unsigned long long v10;  // x11
    unsigned long long v73;  // x2
    unsigned long long v74;  // x1
    unsigned long long v75;  // x14
    unsigned long long v76;  // x15
    unsigned long long v77;  // x14
    unsigned int v78;  // w17
    unsigned int v79;  // w16
    unsigned short v80;  // x16
    unsigned int v81;  // w11
    unsigned int v82;  // w13
    unsigned long long v11;  // x12
    unsigned int v83;  // w11
    unsigned int v84;  // w13
    unsigned int v85;  // w16
    unsigned int v86;  // w14
    unsigned int v87;  // w15
    unsigned int v88;  // w14
    unsigned int v89;  // w11
    unsigned long long v90;  // x12
    unsigned long long v91;  // x13
    unsigned long long v12;  // x11
    st_4dd24c_0 **v1;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4dd24c_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long long, unsigned long

    v2 = &v1;
    v1 = &v2;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f045d0 + ~(~&g_f045d0 + &g_f045d0));
    v4 = ((v3 | v3 >> 29) ^ ~v3 - (v3 >> 29 | ~v3)) + ((v3 | v3 >> 29) & ~v3 - (v3 >> 29 | ~v3)) * 2;
    v5 = v2;
    v6 = v1;
    v7 = v6 + v5;
    v8 = v7 + (-v6 & ~v5) * 2 + &v5[-v6 | ~v5] * 2;
    v9 = v8 + (v6 & ~v5) * 2 + ((v6 & ~v5) * 2 | ~(v8 + 2)) + (v8 + 2 & ~((v6 & ~v5) * 2)) + 3;
    v10 = v7 + (v6 - v5 - (v6 | -v5) + (-v5 & ~v6)) * 2;
    v11 = ((v6 ^ 1) + ~v6 * 2 + ((v6 * 2 | v6 >> 63) & 2 & 3) & v5) * 2;
    v12 = v10 + (v11 | ~v10) + (v11 | v10);
    v13 = v12 + 2;
    v14 = v13 - v9 + (v9 | ~v12) * 2;
    v15 = v9 + ~v9 * 2 + 1;
    v16 = (v9 + v15 - v13 + (v12 + 0x8000000000000000 | ~v15)) * 2;
    v17 = v14 + v16 + 6 + (0xfffffffffffffff9 - v16 | -v14) + (v16 + 6 & v14 - 1);
    v18 = v17 + 1;
    v19 = (v18 ^ (43797 | ~v17)) + (v18 & (43797 | ~v17)) * 2;
    v20 = v17 + (v17 & 43797) + 0xffffffffffff54eb + ((0xffffffff ^ (unsigned int)v17 * 2) & 87594);
    v1 = (v19 | v20) + (v19 & v20);
    v2 = (v17 ^ 21739 | 0xfffffffffffffffe) + ((v17 ^ 21739) + (v18 + (21739 | ~v17)) * 2 | 1);
    v21 = ((unsigned int)v2 + 1 ^ (unsigned int)v1) + ((unsigned int)v2 + 1 & (unsigned int)v1) * 2;
    v22 = v21 + ~v21 * 2 + v21 * 2 + 1;
    g_f120b8 = ((unsigned short)v22 + (unsigned short)~v22 * 2 + 1 | (unsigned short)v4) + (unsigned short)v22 + 1;
    v23 = v2;
    v24 = v1;
    v25 = v23 * 2 + ~v23 * 4 + (v23 ^ 1) + (v23 * 2 & 2);
    v26 = (v23 ^ -v24) + (v23 + (-v24 | ~v23)) * 2 + 2;
    v27 = ((0xfffffffffffffffd - v25 | v24) & v25 + 3) * 4 + ((0xfffffffffffffffd - v25 | v24) ^ v25 + 3) * 2 | 1;
    v28 = ~((v27 ^ v26) + (v27 & v26) * 2) + ((v27 ^ v26) + (v27 & v26) * 2) * 2;
    v29 = v24 + 1 - (v24 | v23) + (v24 + 1 + ~v24 * 2 | v23);
    v30 = v28 ^ v29;
    v31 = v30 + (v28 & v29) * 2;
    v32 = v31 + ((0xffffffff ^ (unsigned int)v31 * 2) & 20) + (v31 + (10 | ~v31)) * 2 - 8;
    v1 = ~v32 + v32 * 2;
    v2 = (v31 | 1) + (v30 & 1) + 6;
    v33 = v4 >> ((char)v2 + (char)v1 & 63);
    v34 = ((v1 + 1 + ~v1 * 2 & v2) + v1 + (v1 & v2) + (-(v1 & v2) & ~((v1 + 1 + ~v1 * 2 & v2) + v1)) * 2 + ((v1 + 1 + ~v1 * 2 & v2) + v1 - (v1 & v2) - ((v1 + 1 + ~v1 * 2 & v2) + v1 | -(v1 & v2))) * 2 ^ ((v1 + 1 + ~v1 * 2 | v2) ^ v1 + 1) - (v1 | v2) + ((v1 + 1 + ~v1 * 2 | v2) & v1 + 1) * 2) + ((v1 + 1 + ~v1 * 2 & v2) + v1 + (v1 & v2) + (-(v1 & v2) & ~((v1 + 1 + ~v1 * 2 & v2) + v1)) * 2 + ((v1 + 1 + ~v1 * 2 & v2) + v1 - (v1 & v2) - ((v1 + 1 + ~v1 * 2 & v2) + v1 | -(v1 & v2))) * 2 & ((v1 + 1 + ~v1 * 2 | v2) ^ v1 + 1) - (v1 | v2) + ((v1 + 1 + ~v1 * 2 | v2) & v1 + 1) * 2) * 2;
    v35 = (-v34 | 1) + v34 + (v34 - 1 | 1);
    v36 = (v35 + ~v35 * 2 ^ ~(v35 + ~v35 * 2 + 22951 + (~((unsigned int)v35 + (unsigned int)~v35 * 2 + 1) | 0xffffffffffffa65a))) + (v35 + ~v35 * 2 + 22951 + (~((unsigned int)v35 + (unsigned int)~v35 * 2 + 1) | 0xffffffffffffa65a) & ~(v35 + ~v35 * 2)) * 2;
    v37 = (v36 ^ (v35 | 22949) + 1) + (v36 & (v35 | 22949) + 1) * 2;
    v1 = ~v37 + v37 * 2;
    v2 = (v35 | 1) + (v35 & 1) + 42585;
    v38 = ((unsigned int)v2 + 1 ^ (unsigned int)v1) + ((unsigned int)v2 + 1 & (unsigned int)v1) * 2;
    g_f120ba = ((unsigned short)-v38 & (unsigned short)v33) + (unsigned short)(v38 - 1) + (unsigned short)(v38 - 1) + (unsigned short)v33 + ((unsigned short)(v38 - 1) + (unsigned short)v33 + ((unsigned short)-((-v38 & v33) + v38 - 1) | (unsigned short)~(v38 - 1 + v33)) + ((unsigned short)-((-v38 & v33) + v38 - 1) & (unsigned short)~(v38 - 1 + v33))) * 2 + 2;
    v39 = v2;
    v40 = (v39 ^ 1) + v39 * 2 + ~v39 * 4 + (v39 * 2 & 2) + 2;
    v41 = v39 - v1 - (v1 | v39) + (v39 + ~(v1 | v39) ^ v1 + 1) + (v39 + ~(v1 | v39) & v1 + 1) * 2 + ((v40 + v1 & -(v40 | v1)) * 4 + (v40 + v1 ^ -(v40 | v1)) * 2 | ~(v39 - v1)) + ((v40 + v1 & -(v40 | v1)) * 4 + (v40 + v1 ^ -(v40 | v1)) * 2 | v39 - v1) + 1;
    v42 = (v41 ^ 20) + (v41 + (20 | ~v41)) * 2 + 2;
    v1 = ~v42 + v42 * 2;
    v2 = (v41 ^ 14) + (v41 * 2 & 28) - 1;
    v43 = v4 >> ((char)(v1 + (char)v2 * 2 + (v2 ^ 0xfffffffffffffffe) - ((char)v2 * 2 & 2)) + 2 & 63);
    v44 = v2;
    v45 = v1;
    v46 = (v44 ^ 1) + ~v44 * 2 + ((v44 * 2 | v44 >> 63) & 2 & 3);
    v47 = v45 + v44;
    v48 = ((v46 + (v45 | ~v46)) * 2 + 3 ^ v47 + ~v45 * 2 + 2) + ((v46 + (v45 | ~v46)) * 2 + 3 & v47 + ~v45 * 2 + 2) * 2;
    v49 = ~v48 + v48 * 2;
    v50 = ((v45 | v44) - 1 ^ v47) - (v47 & -(v45 | v44)) * 2 + (v45 | v44);
    v51 = v50 + v49 + (-v48 & ~v50) * 2 + 1;
    v52 = v51 + (v49 & ~v50) * 2 + (v51 & ~((v49 & ~v50) * 2)) + ((v49 & ~v50) * 2 | ~v51);
    v53 = v52 + 1;
    v54 = ((38507 | ~v53) ^ v52 + 2) + ((38507 | ~v53) & v52 + 2) * 2;
    v1 = v52 + 27029;
    v2 = (v54 & (v53 & 38507) - (v52 + 38509)) + v52 + 38509 + ~(v53 & 38507) + (v54 & v52 + 38509 + ~(v53 & 38507));
    v55 = (unsigned int)v1 | (unsigned int)v2;
    v56 = ((unsigned int)v2 + (unsigned int)v1 ^ -v55) + ((unsigned int)v2 + (unsigned int)v1 & -v55) * 2;
    v57 = v56 + (v55 | ~v56) + (v56 | v55) + 1;
    v58 = (v57 + ~v57 * 2 + 1 & v43) + v57;
    g_f120bc = (unsigned short)v58 + ((unsigned short)v43 | (unsigned short)v57) + ((unsigned short)v57 & (unsigned short)v43) + (((unsigned short)v43 | (unsigned short)v57) + ((unsigned short)v57 & (unsigned short)v43) + ((unsigned short)-v58 | (unsigned short)~((v43 | v57) + (v57 & v43))) + ((unsigned short)-v58 & (unsigned short)~((v43 | v57) + (v57 & v43)))) * 2 + 2;
    v59 = v2;
    v60 = v1;
    v61 = v59 * 2;
    v62 = (v59 ^ 1) + ~v59 * 2 + (v61 & 2);
    v63 = v60 + 1;
    v64 = v59 - v60 + (((v62 | ~v60) + v63 - (v62 + 1) & v62 + 1) * 4 + ((v62 | ~v60) + v63 - (v62 + 1) ^ v62 + 1) * 2 | ~(v59 - v60)) + (((v62 | ~v60) + v63 - (v62 + 1) & v62 + 1) * 4 + ((v62 | ~v60) + v63 - (v62 + 1) ^ v62 + 1) * 2 | v59 - v60) + 1;
    v65 = v61 - (v60 + v59 + (v63 + ~v60 * 2 & v59) * 2);
    v66 = v64 ^ v65;
    v67 = ((v64 + ~v64 * 2 + 1 | v65) + v64) * 2 + 3;
    v68 = v67 ^ v66;
    v69 = v67 & v66;
    v70 = v68 + v69 * 2;
    v71 = v70 - 1;
    v72 = (v70 + 29 ^ -(v71 | 30)) + (v70 + 29 & -(v71 | 30)) * 2;
    v73 = -v70;
    v74 = v70 + (v73 | 30) + (v71 ^ 30) + 1;
    v75 = (v68 + (v69 - v70) * 2 | 18) + v70;
    v76 = v70 + (v71 ^ 18) + (v73 & 0xffffffffffffffed) + 19;
    v1 = (v72 ^ v74) + (v72 & v74) * 2 - 1;
    v2 = (v76 ^ v75) + (v76 & v75) * 2 - 1;
    v77 = v1 + v2 * 2 + (v2 ^ 0xfffffffffffffffe) - (v2 * 2 & 2) + 3;
    g_f120be = v4 >> ((char)~v77 + (char)v77 * 2 & 63);
    v78 = g_f045d0 + 1;
    v79 = v78 + ~g_f045d0 * 2;
    v80 = (unsigned short)v79 + (unsigned short)v78 + (g_f120b8 | (unsigned short)~v79);
    v81 = g_f120b8 & g_f045d0;
    g_f045d0 = (v80 ^ (unsigned short)-v81) + (unsigned short)(v80 - v81 - (v80 | -v81)) * 2;
    g_f045d2 = g_f120ba ^ g_f045d2;
    v82 = g_f120bc | g_f045d4;
    v83 = (g_f120bc | ~g_f045d4) + g_f045d4;
    g_f045d4 = ((unsigned short)v83 ^ (unsigned short)~v82) + ((unsigned short)v82 & (unsigned short)~v83) * 2;
    v84 = -g_f120be;
    v85 = g_f045d6 * 2;
    v86 = v85 + ~g_f045d6 * 4 + (g_f045d6 ^ 1) + (v85 & 2) + 2;
    v87 = v86 + g_f120be;
    v88 = -(v86 | g_f120be);
    v89 = (v84 ^ g_f045d6) + (unsigned int)(g_f045d6 - g_f120be - (v84 | g_f045d6)) * 2;
    g_f045d6 = (unsigned short)v89 + ((unsigned short)v87 & (unsigned short)v88) * 4 + ((unsigned short)v87 ^ (unsigned short)v88) * 2 + (((unsigned short)v87 & (unsigned short)v88) * 4 + ((unsigned short)v87 ^ (unsigned short)v88) * 2 | (unsigned short)~v89) + ((unsigned short)v89 & (unsigned short)~((v87 & v88) * 4 + (v87 ^ v88) * 2)) + 1;
    v90 = v4 + ~g_f045d8;
    v91 = -(v4 | ~g_f045d8);
    g_f045d8 = (g_f045d8 ^ -v4) + (v90 & v91) * 4 + (g_f045d8 - v4 - (g_f045d8 | -v4) + (v90 ^ v91)) * 2;
    return g_f120b8 | ~v79;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49a614..0x49af9c (2440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_49a614_0 {
    char field_0;
} st_49a614_0;

extern unsigned short g_f046d0;
extern unsigned short g_f046d2;
extern unsigned short g_f046d4;
extern unsigned short g_f046d6;
extern unsigned long long g_f046d8;
extern unsigned short g_f12138;
extern unsigned short g_f1213a;
extern unsigned short g_f1213c;
extern unsigned short g_f1213e;

int sub_49a614(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v12;  // x11
    unsigned long long v13;  // x13
    unsigned long long v14;  // x15
    unsigned long long v15;  // x11
    unsigned int v16;  // w11
    unsigned short v17;  // x12
    unsigned short v18;  // x12
    unsigned int v19;  // w13
    unsigned short v20;  // x10
    unsigned long v21;  // x12
    unsigned long long v4;  // x11
    unsigned long long v22;  // x13
    unsigned long v23;  // x14
    unsigned long long v24;  // x16
    unsigned long long v25;  // x14
    unsigned long long v26;  // x16
    unsigned long long v27;  // x12
    unsigned long long v28;  // x12
    unsigned long long v29;  // x13
    unsigned long long v30;  // x14
    char v31;  // x13
    unsigned long long v5;  // x8
    unsigned int v32;  // w12
    unsigned long long v33;  // x13
    unsigned long v34;  // x13
    unsigned long long v35;  // x14
    unsigned long v36;  // x11
    unsigned int v37;  // w11
    unsigned int v38;  // w11
    unsigned long v39;  // x12
    unsigned long long v40;  // x13
    unsigned long long v41;  // x16
    unsigned long long v6;  // x10
    unsigned long long v42;  // x14
    unsigned long long v43;  // x12
    unsigned long v44;  // x13
    unsigned long long v45;  // x13
    unsigned long long v46;  // x14
    unsigned long long v47;  // x15
    unsigned long long v48;  // x16
    char v49;  // x13
    char v50;  // x14
    char v51;  // x13
    unsigned long long v7;  // x8
    unsigned int v52;  // w13
    unsigned long long v53;  // x14
    unsigned long v54;  // x15
    unsigned long long v55;  // x16
    unsigned long long v56;  // x14
    unsigned long long v57;  // x15
    unsigned long long v58;  // x14
    unsigned long long v59;  // x15
    unsigned long long v60;  // x0
    unsigned long long v61;  // x17
    st_49a614_0 *v8;  // x11
    unsigned long long v62;  // x2
    unsigned long long v63;  // x16
    unsigned long long v64;  // x0
    unsigned long long v65;  // x14
    unsigned long long v66;  // x12
    unsigned long v67;  // x14
    unsigned long long v68;  // x17
    unsigned int v69;  // w15
    unsigned int v70;  // w10
    unsigned short v71;  // x12
    st_49a614_0 **v9;  // x12
    unsigned short v72;  // x15
    unsigned long long v73;  // x11
    unsigned long v74;  // x8
    unsigned long long v75;  // x10
    unsigned int v76;  // w8
    unsigned int v77;  // w9
    unsigned int v78;  // w10
    unsigned int v79;  // w11
    unsigned int v80;  // w10
    unsigned int v81;  // w8
    unsigned long long v10;  // x13
    unsigned int v82;  // w8
    unsigned int v83;  // w9
    unsigned int v84;  // w10
    unsigned int v85;  // w11
    unsigned int v86;  // w9
    unsigned int v87;  // w10
    unsigned int v88;  // w12
    unsigned int v89;  // w13
    unsigned int v90;  // w14
    unsigned int v91;  // w13
    unsigned long long v11;  // x14
    unsigned int v92;  // w14
    unsigned int v93;  // w9
    unsigned int v94;  // w8
    st_49a614_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_49a614_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f046d0 + ~(~&g_f046d0 + &g_f046d0));
    v3 = v2 >> 29;
    v4 = v2 | v3;
    v5 = ~v2 - (v3 | ~v2);
    v6 = v4 ^ v5;
    v7 = v6 + (v4 & v5) * 2;
    v8 = v1;
    v9 = v0;
    v10 = v9 | v8;
    v11 = v8 - v9 + ~((v10 & -v8) * 4 + (v10 ^ -v8) * 2) + ((v10 & -v8) * 4 + (v10 ^ -v8) * 2) * 2;
    v12 = (((v11 + 1 - (v10 - (v9 & v8)) & -(v11 + 1 | -(v10 - (v9 & v8)))) * 4 + (v11 + 1 - (v10 - (v9 & v8)) ^ -(v11 + 1 | -(v10 - (v9 & v8)))) * 2 | 1) ^ v10 - (v9 & v8) - v11 + (v11 + 1 | -(v10 - (v9 & v8))) * 2 - 1) + (((v11 + 1 - (v10 - (v9 & v8)) & -(v11 + 1 | -(v10 - (v9 & v8)))) * 4 + (v11 + 1 - (v10 - (v9 & v8)) ^ -(v11 + 1 | -(v10 - (v9 & v8)))) * 2 | 1) & v10 - (v9 & v8) - v11 + (v11 + 1 | -(v10 - (v9 & v8))) * 2 - 1) * 2;
    v13 = v12 - 1;
    v14 = v13 * 2;
    v15 = v12 + (v13 & 788) + (~(unsigned int)v14 & 1576) - 789;
    v0 = (v14 & 129496) + (v13 ^ 64748) - 1;
    v1 = v12 + (-v12 & 0xfffffffffffffceb) + v15 + (0xfffffffffffffceb - (v12 + (-v12 & 0xfffffffffffffceb)) | ~v15) + (v15 & v12 + (-v12 & 0xfffffffffffffceb) + 788) + 789;
    v16 = (unsigned int)v1 | (unsigned int)v0;
    v17 = ((unsigned short)v1 + (unsigned short)v0 ^ (unsigned short)-v16) + ((unsigned short)v1 + (unsigned short)v0 & (unsigned short)-v16) * 2;
    v18 = (v17 ^ v16 + 1) + (v17 & v16 + 1) * 2 - 1;
    v19 = 1 | ~(unsigned int)v7 * 2;
    v20 = ((unsigned short)v7 ^ 1) + ((unsigned short)(__ROL__((unsigned int)v6, 1)) & 2 & 3) + (unsigned short)v19;
    g_f12138 = (unsigned int)(v19 + v7 - (v18 & v20 - 1)) + v18 + v20 + ((unsigned int)((v18 & v20 - 1) - (v18 + v20)) & -(v19 + (unsigned int)v7)) * 2 + ((unsigned int)(v18 + v20 - (v18 & v20 - 1)) + ((unsigned int)((v18 & v20 - 1) - (v18 + v20)) | -(v19 + (unsigned int)v7))) * 2 - 1;
    v21 = v1;
    v22 = v0;
    v23 = v21 + (v22 | ~v21) + (v22 ^ v21);
    v24 = (v22 + v21 ^ -(v21 | v22)) + (v22 + v21 & -(v21 | v22)) * 2;
    v25 = v23 + 2 + v24 + (-v24 & ~(v23 + 1)) * 2 + (v23 + 2 + (-v24 | ~(v23 + 1))) * 2;
    v26 = (v22 ^ 1) + ~v22 * 2 + ((v22 * 2 | v22 >> 63) & 2 & 3);
    v27 = v22 - v21 + (v26 + (v21 | ~v26)) * 2;
    v28 = ((v25 - 1 ^ v27 + 2) + (v25 - 1 & v27 + 2) * 2 - (v25 + v27 + 2 + (-v25 | 0xfffffffffffffffe - v27)) * 2 ^ (1 | (v25 - 1 & 0xfffffffffffffffe - v27) * 2)) + ((v25 - 1 ^ v27 + 2) + (v25 - 1 & v27 + 2) * 2 - (v25 + v27 + 2 + (-v25 | 0xfffffffffffffffe - v27)) * 2 & (1 | (v25 - 1 & 0xfffffffffffffffe - v27) * 2)) * 2;
    v29 = v28 - 1;
    v30 = ((unsigned int)v28 - 1 | 0xfffffffffffffffb) - v28 + 5;
    v0 = (v30 ^ v28) + (v29 | 4) + (v30 & v28) * 2;
    v1 = (v28 + 11 ^ -(v29 | 12)) + (v29 | 12) + (v28 + 11 & -(v29 | 12)) * 2;
    v31 = (char)v1 + 1;
    v32 = v7 >> ((char)((v0 - ((char)v1 + 1) + (v0 + (v31 | ~v0) + (v31 & ~v0)) * 2 + 2 | 1) + (v0 - ((char)v1 + 1) & 1) - 2) & 63);
    v33 = ~((v0 + v1 ^ -(v0 | v1)) + ((v0 | v1) - 1 ^ v0 + v1) + 1) + ((v0 + v1 ^ -(v0 | v1)) + ((v0 | v1) - 1 ^ v0 + v1) + 1) * 2;
    v34 = (v33 * 2 & 4) + (v33 ^ 2);
    v35 = ~v34 + v34 * 2;
    v36 = (v35 | 1) + (1 & ~v34) + 19710;
    v0 = v35 + 45825;
    v1 = v36 * 3 + ~v36 * 2 + 1;
    v37 = (unsigned int)v1 + (unsigned int)v0;
    v38 = v32 + (v32 + ~v32 * 2 + 1 & v37);
    g_f1213a = (((unsigned short)v32 | (unsigned short)v37) + ((unsigned short)v32 & (unsigned short)v37) ^ (unsigned short)-v38) + (unsigned short)(((unsigned short)v32 | (unsigned short)v37) + ((unsigned short)v32 & (unsigned short)v37) - v38 - (((unsigned short)v32 | (unsigned short)v37) + ((unsigned short)v32 & (unsigned short)v37) | -v38)) * 2;
    v39 = v1;
    v40 = v0;
    v41 = v40 | v39;
    v42 = (~v39 & ~v40) + v41 * 2 + (v41 - 1 ^ v40 + v39) - (v40 + v39 & -v41) * 2 + 2;
    v43 = -((v39 + ~v41 ^ v40 + 1) + (v39 + ~v41 & v40 + 1) * 2);
    v44 = (v43 ^ v41) + (v41 + (v43 | ~v41)) * 2 + 2 + (0xffffffffffffffff ^ ((v43 ^ v41) + (v41 + (v43 | ~v41)) * 2 + 2) * 2);
    v45 = v42 + (v44 | ~v42) + (v44 | v42);
    v46 = 0xfffffffffffffffd - v45;
    v47 = v45 + 3;
    v48 = v45 + v47 + v46 * 2 + (~((unsigned int)v47 + (unsigned int)v46 * 2) | 0xfffffffffffffff5);
    v0 = v48 + (v46 | 0xfffffffffffffff5) + v47 + (0xfffffffffffffff1 - v48 | (v46 | 0xfffffffffffffff5) + v47 + 10) + (v48 + 14 & 0xfffffffffffffff5 - ((v46 | 0xfffffffffffffff5) + v47)) + 25;
    v1 = v45 + 24;
    v49 = v0;
    v50 = v1;
    v51 = (char)((v50 ^ v49) + v50 - (v50 | v49)) + v49 + 1;
    v52 = v7 >> ((char)((v51 ^ v50 & v49) + (v51 & v50 & v49) * 2 - 1) & 63);
    v53 = v1;
    v54 = v0;
    v55 = (((v53 + ~v53 * 2 + 2 & v54 - (v53 + ~v53 * 2 + 1) + (v53 + ~v53 * 2 + 1 | ~v54)) * 4 + (v53 + ~v53 * 2 + 2 ^ v54 - (v53 + ~v53 * 2 + 1) + (v53 + ~v53 * 2 + 1 | ~v54)) * 2 | 1) ^ (v53 ^ -v54) + (v53 - (v54 + (v53 | -v54))) * 2) + (((v53 + ~v53 * 2 + 2 & v54 - (v53 + ~v53 * 2 + 1) + (v53 + ~v53 * 2 + 1 | ~v54)) * 4 + (v53 + ~v53 * 2 + 2 ^ v54 - (v53 + ~v53 * 2 + 1) + (v53 + ~v53 * 2 + 1 | ~v54)) * 2 | 1) & (v53 ^ -v54) + (v53 - (v54 + (v53 | -v54))) * 2) * 2;
    v56 = ((v54 | v53) ^ -(v54 & v53)) + ((v54 | v53) + (-(v54 & v53) | ~(v54 | v53))) * 2 + 2;
    v57 = v55 + ~v56;
    v0 = ~((v57 | 1) + (v57 & 1) + 15926) + ((v57 | 1) + (v57 & 1) + 15926) * 2;
    v1 = (v57 ^ 49610) + (v55 - v56 + (v56 - v55 | 49610)) * 2 - 1;
    g_f1213c = (unsigned short)v1 + (unsigned short)v0 + ((unsigned short)v52 & (unsigned short)~((unsigned int)v1 + (unsigned int)v0)) + (unsigned short)~(v52 + (unsigned int)v1 + (unsigned int)v0) + ((unsigned short)v52 & (unsigned short)v1 + (unsigned short)v0) * 2 + 1;
    v58 = v1;
    v59 = v0;
    v60 = v58 + 1;
    v61 = v60 + ~v58 * 2;
    v62 = v61 + 1;
    v63 = v60 + v59 + (-v59 & ~v58) * 2 + (v58 - (v59 + (v58 | -v59))) * 2 + (v61 + v59 + (v62 + ~v61 * 2 & ~v59)) * 2;
    v64 = (v59 ^ 1) + v59 * 2 + ~v59 * 4 + (v59 * 2 & 2) + 2;
    v65 = v62 + v59 + (v64 + v58 ^ -(v64 | v58)) * 2 + (v64 + v58 & -(v64 | v58)) * 4;
    v66 = v65 - v63 + (v63 + 1 & -v65) * 4 + (0xffffffffffffffff ^ (v63 + 1 & -v65) * 2) + (v63 + 1 | -v65) * 2;
    v67 = 0xffffffff ^ (unsigned int)v66 * 2;
    v68 = v66 + 1;
    v0 = (v67 & 64) + v66 + (v68 + (~v66 | 32)) * 2 - 33;
    v1 = v66 + (v68 + (18 | ~v66)) * 2 + (v67 & 36) - 19;
    g_f1213e = v7 >> ((char)v1 + v0 & 63);
    v69 = g_f12138 | g_f046d0;
    v70 = (g_f12138 | ~g_f046d0) + g_f046d0;
    g_f046d0 = (unsigned short)v70 + (unsigned short)v69 + ((unsigned short)v69 & (unsigned short)~v70 | (unsigned short)~v70 & (unsigned short)~v69) * 2 + 1;
    v71 = (g_f046d2 ^ 1) + ~g_f046d2 * 2 + ((unsigned short)(__ROL__(g_f046d2, 1)) & 2 & 3);
    v72 = -g_f1213a;
    g_f046d2 = (v72 ^ g_f046d2) + (unsigned short)(v71 + g_f046d2 + g_f1213a + (v72 | ~g_f046d2) - (v71 | g_f1213a)) * 2 + 2;
    g_f046d4 = g_f1213c ^ g_f046d4;
    g_f046d6 = g_f046d6 + (g_f1213e | ~g_f046d6) + (g_f1213e ^ g_f046d6) + (unsigned short)~(g_f1213e & g_f046d6) + 2;
    v73 = g_f046d8 * 3 + ~g_f046d8 * 4 + 3;
    v74 = g_f046d8 - v7;
    v75 = (v73 + v7 & -(v73 | v7)) * 4 + (v73 + v7 ^ -(v73 | v7)) * 2;
    g_f046d8 = v74 + v75 + (v75 | ~v74) + (v74 & ~v75) + 1;
    v76 = v1;
    v77 = *(unsigned int *)&v0;
    v78 = (v77 + ~v77 * 2 + 1 & v76) + v77;
    v79 = -((v77 + v76 ^ -(v77 | v76)) + (v77 + v76 & -(v77 | v76)) * 2);
    v80 = (v78 ^ v79) + (v78 & v79) * 2;
    v81 = v76 + ~v76 * 2 + v80;
    v82 = v81 + ((unsigned int)(0xfffffffd - v81) | (v76 & ~v80) * 2) + (v81 + 2 | (v76 & ~v80) * 2) + 3;
    v83 = v80 - v77;
    v84 = ((v80 & ~v77) + 1 & v77 + ~v80) * 4 + ((v80 & ~v77) + 1 ^ v77 + ~v80) * 2 | 1;
    v85 = v84 ^ v83;
    v86 = v84 & v83;
    v87 = v85 + v86 * 2;
    v88 = ~v87 + v87 * 2;
    v89 = v82 * 2 + ~v82 * 4 + (v82 ^ 1) + (v82 * 2 & 2) + 2;
    v90 = v88 + v89;
    v91 = -(v89 & -v87) - v88;
    v92 = v88 + v82;
    v93 = v85 + (v86 - v87) * 2;
    v94 = v88 | v82;
    return (unsigned int)(v82 * 2 + (v90 & v91) * 4 - (v93 + v88 + (v82 | ~v93) + v92 + (v94 - 1 ^ v92))) + ((v92 & -v94) + (v90 ^ v91)) * 2 - 2;
}

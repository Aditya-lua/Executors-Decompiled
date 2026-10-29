/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a6e08..0x4a77a0 (2456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a6e08_0 {
    char field_0;
} st_4a6e08_0;

extern unsigned short g_f04540;
extern unsigned short g_f04542;
extern unsigned short g_f04544;
extern unsigned short g_f04546;
extern unsigned long long g_f04548;
extern unsigned short g_f12070;
extern unsigned short g_f12072;
extern unsigned short g_f12074;
extern unsigned short g_f12076;

int sub_4a6e08(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned int v12;  // w10
    unsigned int v13;  // w11
    unsigned int v14;  // w12
    unsigned int v15;  // w10
    unsigned int v16;  // w10
    unsigned int v17;  // w10
    unsigned long long v18;  // x11
    unsigned long long v19;  // x12
    unsigned long long v20;  // x13
    unsigned long long v21;  // x11
    st_4a6e08_0 *v4;  // x10
    unsigned long long v22;  // x11
    unsigned long long v23;  // x12
    unsigned long long v24;  // x11
    char v25;  // x14
    unsigned int v26;  // w12
    unsigned long v27;  // x11
    unsigned long long v28;  // x15
    unsigned long long v29;  // x1
    unsigned long long v30;  // x16
    unsigned long long v31;  // x17
    st_4a6e08_0 **v5;  // x11
    unsigned long long v32;  // x0
    unsigned long long v33;  // x14
    unsigned long long v34;  // x14
    unsigned long long v35;  // x14
    unsigned long long v36;  // x15
    unsigned int v37;  // w14
    unsigned int v38;  // w12
    unsigned long long v39;  // x14
    unsigned long long v40;  // x16
    unsigned long long v41;  // x17
    unsigned long long v6;  // x13
    unsigned long long v42;  // x0
    unsigned long long v43;  // x14
    unsigned long long v44;  // x14
    unsigned long long v45;  // x15
    unsigned long long v46;  // x14
    unsigned long v47;  // x16
    unsigned long long v48;  // x14
    unsigned long long v49;  // x15
    unsigned long long v50;  // x17
    unsigned long long v51;  // x15
    unsigned long long v7;  // x12
    unsigned long v52;  // x15
    char v53;  // x17
    char v54;  // x13
    unsigned int v55;  // w13
    unsigned long v56;  // x15
    unsigned long long v57;  // x16
    unsigned long long v58;  // x1
    unsigned long long v59;  // x4
    unsigned long long v60;  // x17
    unsigned long long v61;  // x15
    unsigned long long v8;  // x10
    unsigned long long v62;  // x16
    unsigned long long v63;  // x15
    unsigned long long v64;  // x14
    unsigned long long v65;  // x15
    unsigned int v66;  // w14
    unsigned long v67;  // x14
    unsigned long long v68;  // x15
    unsigned long long v69;  // x0
    unsigned long long v70;  // x17
    unsigned long long v71;  // x14
    unsigned long long v9;  // x13
    unsigned long long v72;  // x14
    unsigned long long v73;  // x14
    unsigned long long v74;  // x15
    unsigned short v75;  // x16
    unsigned int v76;  // w0
    unsigned short v77;  // x10
    unsigned short v78;  // x15
    unsigned short v79;  // x12
    unsigned short v80;  // x10
    unsigned short v81;  // x12
    unsigned long long v10;  // x10
    unsigned int v82;  // w13
    unsigned short v83;  // x15
    unsigned short v84;  // x16
    unsigned int v85;  // w10
    unsigned short v86;  // x13
    unsigned short v87;  // x10
    unsigned short v88;  // x11
    unsigned long long v11;  // x11
    st_4a6e08_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4a6e08_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04540 + ~(~&g_f04540 + &g_f04540));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 * 2 + ~v4 * 4 + (v4 ^ 1) + (v4 * 2 & 2);
    v7 = (v5 + v4 + (-v5 & ~v4) * 2 + (v4 - ((char *)v5 + (v4 | -v5))) * 2 | (v6 + (v5 | 0xfffffffffffffffd - v6)) * 2 + 6) + ((v6 + (v5 | 0xfffffffffffffffd - v6)) * 2 + 6 & v5 + v4 + (-v5 & ~v4) * 2 + (v4 - ((char *)v5 + (v4 | -v5))) * 2);
    v8 = v5 - v4 + (v4 - ((char *)v5 + 0x2 * ~v5 + 1) + ((char *)v5 + 0x2 * ~v5 + 1 | ~v4) ^ (char *)v5 + 0x2 * ~v5 + 2) * 2 + (v4 - ((char *)v5 + 0x2 * ~v5 + 1) + ((char *)v5 + 0x2 * ~v5 + 1 | ~v4) & (char *)v5 + 0x2 * ~v5 + 2) * 4;
    v9 = v7 - v8 + (v8 - 1 | ~v7) + 1;
    v10 = (v9 ^ v8 - v7 + (v7 | -v8)) + (v7 & -v8) * 2 + (v9 & v8 - v7 + (v7 | -v8)) * 2;
    v11 = ((v10 & 56177) - (v10 + 56178) + (v10 + 56178 - (v10 & 56177)) * 2 ^ v10 + (56177 | ~v10) + 1) + ((v10 & 56177) - (v10 + 56178) + (v10 + 56178 - (v10 & 56177)) * 2 & v10 + (56177 | ~v10) + 1) * 2;
    v0 = ~v11 + v11 * 2;
    v1 = v10 + 9358;
    v12 = v0;
    v13 = v1;
    v14 = v13 & v12;
    v15 = v12 - v13 + v14 + (v13 & ~v12) * 2;
    v16 = (v14 | v15) + (v15 & v14);
    v17 = (v16 + ~v16 * 2 + 1 & (unsigned int)v3) + v16;
    g_f12070 = (((unsigned short)v3 | (unsigned short)v16) + ((unsigned short)v16 & (unsigned short)v3) ^ (unsigned short)-v17) + (unsigned short)(((unsigned short)v3 | (unsigned short)v16) + ((unsigned short)v16 & (unsigned short)v3) - v17 - (((unsigned short)v3 | (unsigned short)v16) + ((unsigned short)v16 & (unsigned short)v3) | -v17)) * 2;
    v18 = v1;
    v19 = v0;
    v20 = v18 - v19 + ((v19 | v18) & -v18) * 4 + ((v19 | v18) ^ -v18) * 2 + (v18 - v19 & ~(((v19 | v18) & -v18) * 4 + ((v19 | v18) ^ -v18) * 2)) + (((v19 | v18) & -v18) * 4 + ((v19 | v18) ^ -v18) * 2 | ~(v18 - v19)) + 1;
    v21 = v19 - v18 + (v19 + (0xffffffffffffffff ^ v19 * 2) & v18) * 2;
    v22 = ~v20 - v21 + 3;
    v23 = v22 + (v20 - v21 + (v21 + 0x7fffffffffffffff & ~v20) + (v20 & v21 + 0x7fffffffffffffff)) * 2;
    v0 = (v23 ^ 11 | 0xfffffffffffffffe) + ((22 & v23 * 2) + (v23 ^ 11) | 1);
    v1 = (v22 & 1) + (v23 | 1) + 5;
    v24 = v0;
    v25 = ((char)v24 + (char)~v24 * 2 ^ (char)~(v24 + ~v24 * 2 + 1 | v1)) + (((char)v24 + (char)~v24 * 2 + 1 | (char)v1) & (char)~(v24 + ~v24 * 2)) * 2;
    v26 = v3 >> ((char)((v25 ^ ((char)v24 | (char)v1) + 1) + (v25 & ((char)v24 | (char)v1) + 1) * 2 - 1) & 63);
    v27 = v1;
    v28 = v0;
    v29 = v27 - (v28 + (v27 | ~v28));
    v30 = (v27 ^ -v28) + (v29 & v28 + ~v27) * 4 + (v27 + (-v28 | ~v27) + (v29 ^ v28 + ~v27)) * 2;
    v31 = v30 + 2;
    v32 = (v28 ^ 1) + ~v28 * 2 + ((v28 * 2 | v28 >> 63) & 2 & 3);
    v33 = ((((v27 | ~v32) & v32 + 1) * 4 + ((v27 | ~v32) ^ v32 + 1) * 2 | 1) ^ v28 + v27 + (-v27 & ~v28) * 2 + (v28 - (v27 + (v28 | -v27))) * 2) + ((((v27 | ~v32) & v32 + 1) * 4 + ((v27 | ~v32) ^ v32 + 1) * 2 | 1) & v28 + v27 + (-v27 & ~v28) * 2 + (v28 - (v27 + (v28 | -v27))) * 2) * 2;
    v34 = v33 + ~(v33 - 2 & v31);
    v35 = (1 - v33 | v31) - ((1 - v33 | ~v31) + v31) + ((v34 & v30 - v33 + 3) * 4 + (v34 ^ v30 - v33 + 3) * 2 | (1 - v33 | ~v31) + v31 - (1 - v33 | v31)) + ((v34 & v30 - v33 + 3) * 4 + (v34 ^ v30 - v33 + 3) * 2 | (1 - v33 | v31) + ~((1 - v33 | ~v31) + v31));
    v36 = v35 + (~(unsigned int)v35 | 0xffffffffffffb89e);
    v0 = ((v35 | 0xffffffffffffb89e) + 18274 & 0xffffffffffffb89d - v36) + v36 + 18274 + ((v35 | 0xffffffffffffb89e) + 18274 & v36 + 18274);
    v1 = v35 + 47262;
    v37 = (unsigned int)v1 + (unsigned int)v0;
    v38 = v26 + ~v26 * 2 + 1;
    g_f12072 = v38 - v37 + v26 + v37 + 1 + (v37 | ~v38) + v26 + v37 + 1 + ((-(v38 - v37 + v26 + v37 + 1 + (v37 | ~v38)) | ~(v26 + v37)) + v26 + v37 + 1 + (-(v38 - v37 + v26 + v37 + 1 + (v37 | ~v38)) & ~(v26 + v37))) * 2 - 1;
    v39 = v1;
    v40 = v0;
    v41 = ((v40 | v39) ^ -(v40 & v39)) + ((v40 ^ v39) - (v40 | v39 | -(v40 & v39))) * 2;
    v42 = (v40 ^ 1) + v40 * 2 + ~v40 * 4 + (v40 * 2 & 2) + 2;
    v43 = v39 + v40 + (-v39 & ~v40) * 2 + (v40 - (v39 + (v40 | -v39))) * 2;
    v44 = v43 + ((v42 + v39 & -(v42 | v39)) * 4 + (v42 + v39 ^ -(v42 | v39)) * 2 | ~v43) + ((v42 + v39 & -(v42 | v39)) * 4 + (v42 + v39 ^ -(v42 | v39)) * 2 | v43);
    v45 = v44 & v41 | ~v44 & ~v41;
    v46 = ((v41 + ~v41 * 2 + 1 | ~v44) + v41) * 2 + 3;
    v47 = v46 ^ v45;
    v48 = v46 & v45;
    v49 = v47 + v48 * 2;
    v50 = v49 - 1;
    v51 = v47 + (v48 - v49) * 2 + v50 - (v47 + (v48 - v49) * 2 & 0xfffffffffffffff4);
    v0 = v49 + 20;
    v1 = v50 + (-v49 | 11) + (v51 | 0xfffffffffffffffe - (v50 + (-v49 | 11))) + (v51 | (-v49 | 11) + v49) + 2;
    v52 = v1;
    v53 = ((char)v0 | (char)~v52) + (char)v52;
    v54 = ((char)v52 + (char)~v52 * 2 + 1 & (char)v0) + (char)v52;
    v55 = v3 >> ((char)(v54 + v53 * 2 + (v54 | 0xfffffffffffffffe - v53) - (v54 & v53 + 1)) + 3 & 63);
    v56 = v1;
    v57 = v0;
    v58 = v57 | v56;
    v59 = v57 + v56;
    v60 = v59 + (v56 - (v57 + (v56 | -v57)) + (-v57 & ~v56)) * 2 + ~((v58 & -v56) * 4 + (v58 ^ -v56) * 2) + ((v58 & -v56) * 4 + (v58 ^ -v56) * 2) * 2;
    v61 = v57 + (v56 | ~v57) + (v57 ^ v56);
    v62 = -((v59 ^ -v58) + (v59 & -v58) * 2);
    v63 = (v61 + 1 ^ v62) + (v61 + (v62 | 0xfffffffffffffffe - v61)) * 2 + 4 - ((v61 + 1 ^ v62) + (v61 + (v62 | 0xfffffffffffffffe - v61)) * 2 + 4) * 4 + ((v61 + 1 ^ v62) + (v61 + (v62 | 0xfffffffffffffffe - v61)) * 2 + 4) * 2;
    v64 = v63 - 1 + v60 + 2 + (-v63 | 0xfffffffffffffffe - v60) + (v63 - 1 & ~(v60 + 2) + (v60 + 2) * 2);
    v65 = v64 + 1;
    v0 = ~((v65 | 1) + (v65 & 1) + 42036) + ((v65 | 1) + (v65 & 1) + 42036) * 2;
    v1 = v64 + (47000 & v65 * 2) + (47000 & v65 * 2 ^ 47000) + 0xffffffffffffa434;
    v66 = (unsigned int)v0 - (unsigned int)v1 + ((unsigned int)v1 & (unsigned int)v0) + ((unsigned int)v0 + ~(unsigned int)v0 * 2 ^ ~((unsigned int)v0 + ~(unsigned int)v0 * 2 + 1 | (unsigned int)v1)) + ((((unsigned int)v0 + ~(unsigned int)v0 * 2 + 1 | (unsigned int)v1) & ~((unsigned int)v0 + ~(unsigned int)v0 * 2)) + ((unsigned int)v1 & ~(unsigned int)v0)) * 2;
    g_f12074 = (v55 & ~v66) + v66 * 2 - (v55 + (v66 & ~v55) * 2);
    v67 = v1;
    v68 = v0;
    v69 = v68 | v67;
    v70 = (~v68 & ~v67) + v69 * 2 + 1;
    v71 = -((v68 + v67 ^ -v69) + (v68 + v67 & -v69) * 2);
    v72 = (v71 ^ v70) + (v70 + (v71 | ~v70)) * 2;
    v73 = v72 + 2 + (v68 ^ v67) + ((v72 + 9223372036854775809 & (v68 ^ v67)) - (v72 + 2 + (v68 ^ v67))) * 2 + ((v68 ^ v67) - (v72 + 2) + (v72 + 9223372036854775809 & ~(v68 ^ v67))) * 2;
    v0 = v73 + 1 + (2 - (v73 + 1) | 0xfffffffffffffffd) + ((unsigned int)v73 + 2 & 2) + 4;
    v1 = v73 + 48;
    v74 = v1 * 2 + (v1 ^ 0xfffffffffffffffe) - (v1 * 2 & 2) + 3;
    g_f12076 = v3 >> (v0 + (char)~v74 + (v0 + ((char)v74 | ~v0) + ((char)v74 & ~v0)) * 2 + 2 & 63);
    v75 = g_f12070 + ~g_f04540;
    v76 = g_f04540 - g_f12070 - (g_f04540 | ~g_f12070);
    v77 = g_f04540 + g_f12070 + ~g_f12070 * 2 + 2;
    v78 = ((unsigned short)v76 & v75) * 4 + ((unsigned short)v76 ^ v75) * 2 | 1;
    g_f04540 = (v78 ^ v77) + (v78 & v77) * 2 - 1;
    v79 = -g_f12072;
    v80 = (v79 ^ g_f04542) + (g_f04542 + (v79 | ~g_f04542)) * 2 + 2;
    v81 = (g_f12072 - g_f04542 + (g_f04542 & ~g_f12072)) * 2;
    g_f04542 = (v80 | v81) + (v80 & v81);
    v82 = -g_f12074;
    v83 = g_f12074 | g_f04544;
    v84 = -g_f04544;
    v85 = (v82 ^ g_f04544) + (unsigned int)(g_f04544 - g_f12074 - (v82 | g_f04544)) * 2;
    g_f04544 = (unsigned short)v85 + ((v83 & v84) * 4 + (v83 ^ v84) * 2 | (unsigned short)~v85) + ((unsigned short)v85 | (v83 & v84) * 4 + (v83 ^ v84) * 2) + 1;
    v86 = -g_f12076;
    v87 = g_f12076 + g_f04546 + (v86 & ~g_f04546) * 2 + (unsigned short)(g_f04546 - g_f12076 - (v86 | g_f04546)) * 2;
    v88 = 1 | (g_f04546 + ~g_f04546 * 2 + 1 & g_f12076) * 2;
    g_f04546 = (v87 ^ v88) + (v87 & v88) * 2 - 1;
    g_f04548 = (g_f04548 | v3) - (g_f04548 & v3);
    return v76;
}

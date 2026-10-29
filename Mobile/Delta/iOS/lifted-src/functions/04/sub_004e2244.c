/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e2244..0x4e2b24 (2272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4e2244_0 {
    char field_0;
} st_4e2244_0;

extern unsigned short g_f046b0;
extern unsigned short g_f046b2;
extern unsigned short g_f046b4;
extern unsigned short g_f046b6;
extern unsigned long long g_f046b8;
extern unsigned short g_f12128;
extern unsigned short g_f1212a;
extern unsigned short g_f1212c;
extern unsigned short g_f1212e;
extern unsigned int g_ffffffffffffffec;

unsigned int sub_4e2244(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned int v12;  // w11
    unsigned short v13;  // x11
    unsigned short v14;  // x12
    unsigned long long v15;  // x14
    unsigned long long v16;  // x15
    unsigned long long v17;  // x16
    unsigned long long v18;  // x17
    unsigned long long v19;  // x14
    unsigned long long v20;  // x14
    unsigned long long v21;  // x14
    st_4e2244_0 *v4;  // x11
    unsigned long long v22;  // x14
    unsigned long v23;  // x13
    unsigned long long v24;  // x14
    char v25;  // x15
    char v26;  // x13
    unsigned int v27;  // w13
    unsigned long long v28;  // x15
    unsigned long v29;  // x16
    unsigned long long v30;  // x17
    unsigned long long v31;  // x15
    st_4e2244_0 **v5;  // x12
    unsigned long long v32;  // x15
    unsigned long long v33;  // x16
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    unsigned int v36;  // w15
    unsigned int v37;  // w15
    unsigned int v38;  // w16
    unsigned long v39;  // x15
    unsigned long v40;  // x16
    unsigned long long v41;  // x17
    unsigned long long v6;  // x13
    unsigned long long v42;  // x0
    unsigned long long v43;  // x0
    unsigned long long v44;  // x17
    unsigned long long v45;  // x15
    unsigned long long v46;  // x15
    unsigned long v47;  // x15
    unsigned long long v48;  // x16
    unsigned long long v49;  // x17
    unsigned int v50;  // w15
    unsigned long long v51;  // x14
    unsigned long long v7;  // x14
    unsigned long long v52;  // x16
    unsigned long long v53;  // x0
    unsigned long long v54;  // x15
    unsigned long v55;  // x16
    unsigned long long v56;  // x2
    unsigned long long v57;  // x17
    unsigned long long v58;  // x12
    unsigned long long v59;  // x12
    unsigned long long v60;  // x12
    unsigned long long v61;  // x12
    unsigned long long v8;  // x11
    unsigned long long v62;  // x15
    unsigned long long v63;  // x12
    unsigned int v64;  // w16
    unsigned int v65;  // w11
    unsigned int v66;  // w17
    unsigned int v67;  // w15
    unsigned int v68;  // w15
    unsigned int v69;  // w16
    unsigned int v70;  // w16
    unsigned int v71;  // w11
    unsigned long long v9;  // x11
    unsigned int v72;  // w13
    unsigned short v73;  // x14
    unsigned int v74;  // w15
    unsigned long v10;  // x14
    unsigned int v11;  // w12
    st_4e2244_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4e2244_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f046b0 + ~(~&g_f046b0 + &g_f046b0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (char *)v5 + 0x2 * ~v5 + 1;
    v7 = ((v4 | v5) & -v4) * 4 + ((v4 | v5) ^ -v4) * 2 | 1;
    v8 = v5 - v4 + (v6 & v4) * 2 + ~(v5 - v4 + (v6 & v4) * 2) * 2 - ((v7 ^ &v4[v6 + 1]) + (v7 & &v4[v6 + 1]) * 2) + ((v7 ^ &v4[v6 + 1]) + (v7 & &v4[v6 + 1]) * 2) * 2;
    v9 = ~((v8 * 2 & 4) + (v8 ^ 2)) + ((v8 * 2 & 4) + (v8 ^ 2)) * 2;
    v10 = v9 + (v9 & 38003) + 0xffffffffffff6b8d + ((0xffffffff ^ (unsigned int)v9 * 2) & 76006);
    v0 = ((v9 | 0xffffffffffff6b8c) + 38004 | v10) + (v10 & (v9 | 0xffffffffffff6b8c) + 38004);
    v1 = v9 + (v9 | 27532) + (0xffffffffffff9473 & ~v9) + 27533;
    v11 = (unsigned int)v1 * 3 + ~(unsigned int)v1 * 4;
    v12 = (unsigned int)v0 + v11 + ((unsigned int)(0xfffffffd - v11) & ~(unsigned int)v0) * 2 + ((unsigned int)(0xfffffffd - v11) & (unsigned int)v0) * 2 + 3;
    v13 = (unsigned short)v12 * 3 + (unsigned short)~v12 * 2 + 1;
    v14 = (unsigned short)v3 + (0xffff ^ (unsigned short)v3 * 2);
    g_f12128 = (unsigned short)(v14 + v3 - v13) + (v13 & v14) + (v13 & (unsigned short)v3) * 2 + 1;
    v15 = v1;
    v16 = v0;
    v17 = v16 | v15;
    v18 = (v16 - v15 + (v15 | ~v16) ^ 0xfffffffffffffffe - v15) - (v16 - v15 + (v15 | ~v16) & v15 + 1) * 2 + v17;
    v19 = (v16 + v15 ^ -v17) + (v16 + v15 & -v17) * 2;
    v20 = v17 + v19 + ~v19 * 2 + 1 - (v17 + v19 + ~v19 * 2 + 1) * 2 - 2;
    v21 = v18 + (v20 | 0xfffffffffffffffe - v18) + (v20 | v18 + 1) + 2;
    v22 = v21 + (v21 & 1) + (~(unsigned int)v21 | 0xfffffffffffffffe) + 2;
    v0 = (v22 & 0xfffffffffffffffe) + (v22 | 0xfffffffffffffffe) + 13;
    v1 = v22 + (v22 + (~v22 | 6)) * 2 + ((0xffffffff ^ (unsigned int)v22 * 2) & 12) - 5;
    v23 = v0;
    v24 = v1;
    v25 = ((char)v24 + (char)v23 ^ (char)-(v24 | v23)) + ((char)v24 + (char)v23 & (char)-(v24 | v23)) * 2;
    v26 = (char)v24 + 1 + (char)v23 + ((char)v24 + 1 + (char)~v24 * 2 | (char)~v23);
    v27 = v3 >> ((v25 | v26) + (v26 & v25) & 63);
    v28 = v1;
    v29 = v0;
    v30 = ((v29 | v28) - (v29 + v28) & (v29 | v28)) * 2 - (v29 + v28 + ~(v29 | v28) ^ (v29 | v28));
    v31 = (((v29 + (0xffffffffffffffff ^ v29 * 2) + v28 & -(v29 + (0xffffffffffffffff ^ v29 * 2) | v28)) * 4 + (v29 + (0xffffffffffffffff ^ v29 * 2) + v28 ^ -(v29 + (0xffffffffffffffff ^ v29 * 2) | v28)) * 2 | 1) ^ v29 - v28) + (((v29 + (0xffffffffffffffff ^ v29 * 2) + v28 & -(v29 + (0xffffffffffffffff ^ v29 * 2) | v28)) * 4 + (v29 + (0xffffffffffffffff ^ v29 * 2) + v28 ^ -(v29 + (0xffffffffffffffff ^ v29 * 2) | v28)) * 2 | 1) & v29 - v28) * 2;
    v32 = v30 - v31 + (v30 - 1 & v31 - 1) + (-v31 | -v30);
    v33 = v32 + 2;
    v34 = v32 + 1;
    v35 = (-(unsigned int)v33 & 15110 & 0xfffffffffffffffe | v34 & 1) + (v34 | 1);
    v0 = v33 + (100852 & v34 * 2) + (100852 & v34 * 2 ^ 100852) + 0xffffffffffff3b04;
    v1 = (v35 ^ v33 + 15110 + (0xfffffffffffffffe - v32 & 0xffffffffffffc4f9)) + (v35 & v33 + 15110 + (0xfffffffffffffffe - v32 & 0xffffffffffffc4f9)) * 2 - 1;
    v36 = v0 + ~(unsigned int)v1 + ((unsigned int)v1 + 1 & ~v0) * 2 + (v0 + ((unsigned int)v1 + 1 | ~v0)) * 2 + 2;
    v37 = v36 * 3 + ~v36 * 2;
    v38 = (v37 + 2 ^ v27) + (v37 + 2 & v27) * 2;
    g_f1212a = ((unsigned short)~v38 + (unsigned short)v38 * 2 ^ (unsigned short)-(v37 + 1 | v27)) + (unsigned short)((unsigned short)~v38 + (unsigned short)v38 * 2 - (v37 + 1 | v27) - ((unsigned short)~v38 + (unsigned short)v38 * 2 | -(v37 + 1 | v27))) * 2;
    v39 = v1;
    v40 = v0;
    v41 = ~v39 * 2;
    v42 = ((v41 + (v39 ^ 1) + ((v39 * 2 | v39 >> 63) & 2 & 3) | ~v40) + v40) * 2;
    v43 = v39 - v40 + v42 + 2 + (v42 + 2 | ~(v39 - v40)) + (0xfffffffffffffffd - v42 & v39 - v40) + 1;
    v44 = (v39 + v41 + 1 & v40) + v39;
    v45 = (~v44 - (-(v40 & v39) | ~v44)) * 2 - (v44 + (v40 & v39) + (-(v40 & v39) & ~v44) * 2);
    v46 = (v43 ^ v45) + (v43 & v45) * 2 - 1;
    v47 = (v46 * 2 & 4) + (v46 ^ 2);
    v48 = ~v47 + v47 * 2;
    v49 = (v48 * 2 | v48 >> 63) & 30 & 31;
    v0 = ((-v47 & (char *)&g_ffffffffffffffec + 1) + v48 + 19 ^ -(-v47 & (char *)&g_ffffffffffffffec + 1)) + ((-v47 & (char *)&g_ffffffffffffffec + 1) + v48 + 19 & -(-v47 & (char *)&g_ffffffffffffffec + 1)) * 2 - 1;
    v1 = v48 + v49 + (v49 ^ 30) - 16;
    v50 = v3 >> ((char)(v0 - v1) + (char)v1 * 2 & 63);
    v51 = ((1 | (v0 & ~v1) * 2) ^ v1 - v0) + ((1 | (v0 & ~v1) * 2) & v1 - v0) * 2 + (0xffffffffffffffff ^ ((v0 & ~v1) - v0 & (v0 | v1)) * 2) - ((v0 & ~v1) - v0 ^ (v0 | v1));
    v52 = v51 + 1;
    v53 = ((49876 | ~v51) ^ v52) + ((49876 | ~v51) & v52) * 2;
    v0 = v53 + (v51 | 1) + (v51 & 1) + 49876 + ~(v51 & 49876) + ((v51 & 49876) - ((v51 | 1) + (v51 & 1) + 49876) & v53) + ((v51 | 1) + (v51 & 1) + 49876 + ~(v51 & 49876) | ~v53) + 1;
    v1 = (v51 | 15659) + ((15659 | ~v51) ^ v52) + ((15659 | ~v51) & v52) * 2;
    g_f1212c = (unsigned short)(v50 * 2 + (v50 ^ 0xfffe) + ((unsigned int)v1 + v0 & ~v50) - (((unsigned int)v1 + v0 ^ v50) + (v50 * 2 & 2))) + 2;
    v54 = v1;
    v55 = v0;
    v56 = v55 | v54;
    v57 = (-((v55 + v54 ^ -v56) + (v55 + v54 & -v56) * 2) ^ v54 + (v55 | ~v54) + (v55 ^ v54) + 1) + (-((v55 + v54 ^ -v56) + (v55 + v54 & -v56) * 2) & v54 + (v55 | ~v54) + (v55 ^ v54) + 1) * 2;
    v58 = (0xfffffffffffffffe - (v55 + ~v55 * 2) & ~v54) - v55;
    v59 = v56 - v58 + (v58 & ~v56) * 2 + (v58 & v56) * 2;
    v60 = v59 * 3 + ~v59 * 4 + 4;
    v61 = (v60 ^ v57 | 0xfffffffffffffffe) + (-((v60 ^ v57) + (v60 & v57) * 2) | 1) + ((v60 ^ v57) + (v60 & v57) * 2) * 2;
    v62 = v61 + 1;
    v0 = (v62 ^ 4) + (v62 * 2 & 8) - 1;
    v1 = (v61 + 46 ^ -(v62 | 45)) + v61 + 2 + v61 + 2 + ~v62 * 2 + (v61 + 46 & -(v62 | 45)) * 2 + (45 | ~(v61 + 2 + ~v62 * 2));
    v63 = (v0 + v1 - (v1 | v0) ^ (v1 | v0) + 1) + (v0 + v1 - (v1 | v0) & (v1 | v0) + 1) * 2;
    g_f1212e = v3 >> ((char)~v63 + (char)v63 * 2 & 63);
    v64 = -g_f12128;
    g_f046b0 = g_f046b0 + g_f12128 + ((g_f046b0 & ~g_f12128) + ((unsigned short)v64 & ~g_f046b0) + (unsigned short)~(v64 | g_f046b0)) * 2 + 2;
    v65 = g_f046b2;
    v66 = g_f046b2 * 2;
    v67 = (v65 ^ 1) + v66 + ~g_f046b2 * 4 + (v66 & 2);
    v68 = v67 + 3;
    v69 = v68 + ~(v67 + 2) * 2 | g_f1212a;
    v70 = -g_f1212a;
    v71 = g_f1212a + v65 + (v70 & ~v65) * 2 + (g_f046b2 + (v70 | ~v65)) * 2 + 2;
    v72 = (v69 & v68) * 4 + (v69 ^ v68) * 2 | 1;
    g_f046b2 = (unsigned short)~((v72 ^ v71) + (v72 & v71) * 2) + (((unsigned short)v72 ^ (unsigned short)v71) + ((unsigned short)v72 & (unsigned short)v71) * 2) * 2;
    v73 = g_f1212c - g_f046b4 + (g_f046b4 | ~g_f1212c);
    g_f046b4 = (unsigned short)((g_f046b4 | g_f1212c) + (v73 ^ (unsigned int)(0xfffe - g_f046b4)) - (v73 & g_f046b4 + 1) * 2) + 1;
    v74 = g_f1212e & g_f046b6;
    g_f046b6 = (unsigned short)(v74 - g_f1212e) + (g_f1212e | ~g_f046b6) + ((unsigned short)~v74 + g_f046b6 + (g_f1212e & ~g_f046b6)) * 2 + 3;
    g_f046b8 = v3 + g_f046b8 + ((g_f046b8 & ~v3) + (-v3 & ~g_f046b8) + ~(g_f046b8 | -v3)) * 2 + 2;
    return v70 & ~v65;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a5928..0x4a61c4 (2204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a5928_0 {
    char field_0;
} st_4a5928_0;

extern unsigned short g_f04490;
extern unsigned short g_f04492;
extern unsigned short g_f04494;
extern unsigned short g_f04496;
extern unsigned long long g_f04498;
extern unsigned short g_f12018;
extern unsigned short g_f1201a;
extern unsigned short g_f1201c;
extern unsigned short g_f1201e;

int sub_4a5928(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long v12;  // x13
    unsigned long v13;  // x14
    unsigned long long v14;  // x14
    unsigned long long v15;  // x15
    unsigned long long v16;  // x16
    unsigned long v17;  // x17
    unsigned long long v18;  // x15
    unsigned long long v19;  // x15
    unsigned int v20;  // w15
    unsigned long long v21;  // x16
    st_4a5928_0 *v4;  // x11
    unsigned long v22;  // x17
    unsigned long long v23;  // x1
    unsigned long long v24;  // x0
    unsigned long long v25;  // x3
    unsigned long long v26;  // x0
    unsigned long long v27;  // x16
    unsigned long long v28;  // x16
    unsigned long long v29;  // x0
    unsigned long long v30;  // x17
    unsigned int v31;  // w17
    st_4a5928_0 **v5;  // x12
    unsigned int v32;  // w16
    unsigned int v33;  // w17
    unsigned long v34;  // x16
    unsigned long long v35;  // x17
    unsigned long long v36;  // x1
    unsigned long long v37;  // x16
    unsigned long long v38;  // x17
    unsigned long long v39;  // x16
    unsigned long long v40;  // x16
    unsigned long long v41;  // x17
    unsigned long long v6;  // x14
    unsigned int v42;  // w16
    unsigned long long v43;  // x17
    unsigned long long v44;  // x0
    unsigned long long v45;  // x2
    unsigned long long v46;  // x4
    unsigned long long v47;  // x17
    unsigned long long v48;  // x17
    unsigned int v49;  // w17
    unsigned int v50;  // w0
    unsigned long v7;  // x14
    unsigned int v52;  // w16
    unsigned short v53;  // x17
    unsigned long long v54;  // x17
    unsigned long v55;  // x0
    unsigned long long v56;  // x3
    unsigned long long v57;  // x2
    unsigned long long v58;  // x1
    unsigned long long v59;  // x17
    unsigned long long v60;  // x17
    unsigned long long v61;  // x1
    unsigned long long v8;  // x11
    unsigned int v62;  // w0
    unsigned int v63;  // w1
    unsigned int v64;  // w12
    unsigned int v65;  // w14
    unsigned int v66;  // w13
    unsigned int v67;  // w15
    unsigned int v68;  // w13
    unsigned short v69;  // x14
    unsigned short v70;  // x15
    unsigned short v71;  // x12
    unsigned long long v9;  // x12
    unsigned int v72;  // w14
    unsigned int v73;  // w12
    unsigned long long v74;  // x11
    unsigned long long v75;  // x8
    unsigned long long v76;  // x9
    unsigned long long v10;  // x13
    unsigned long long v11;  // x14
    st_4a5928_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4a5928_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04490 + ~(~&g_f04490 + &g_f04490));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v5 - v4 + (v4 | ~v5);
    v7 = v6 ^ (char *)v4 + 0x2 * ~v4;
    v8 = (v5 | v4) + v7 - ((v5 ^ -v4) + ((0xfffffffffffffffc - (v5 * 3 + ~v5 * 4) | v4) & v5 * 3 + ~v5 * 4 + 4) * 4) + ((char *)~v5 - (-v4 | ~v5) - (v6 & v4 + 1) - ((0xfffffffffffffffc - (v5 * 3 + ~v5 * 4) | v4) ^ v5 * 3 + ~v5 * 4 + 4)) * 2 & 0xfffffffffffffffe | (v5 | v4) + v7 - ((v5 ^ -v4) + ((0xfffffffffffffffc - (v5 * 3 + ~v5 * 4) | v4) & v5 * 3 + ~v5 * 4 + 4) * 4) & 1;
    v9 = v8 + 2;
    v10 = v8 + 1;
    v11 = ((v9 - v9 * 2 | 0xb7f8) ^ -(v9 - v9 * 2)) + ((v9 - v9 * 2 | 0xb7f8) & -(v9 - v9 * 2)) * 2;
    v0 = (v11 ^ v9 - (v10 & 0xb7f8) + 0xb7f8) + (v11 & v9 - (v10 & 0xb7f8) + 0xb7f8) * 2 - 1;
    v1 = (v10 | 0xfffffffffffffffe) + ((v10 ^ 18440) + ((0xfffffffffffffffe - v8 | 18440) + v9) * 2 & 0xfffffffffffffffe) + 1;
    g_f12018 = ((unsigned short)v1 + v0 | (unsigned short)v3 * 3 + (unsigned short)~v3 * 4 + 3) + (unsigned short)v3 + 1;
    v12 = v1;
    v13 = v0;
    v14 = (v12 + ~v13 & -(v12 | ~v13)) * 4 + (v12 + ~v13 ^ -(v12 | ~v13)) * 2 | 1;
    v15 = (v12 ^ -v13) + (v12 + (0xffffffffffffffff ^ v12 * 2) + v13 & -(v12 + (0xffffffffffffffff ^ v12 * 2) | v13)) * 4 - (v14 ^ v13 - v12) + (v12 + (-v13 | ~v12) + (v12 + (0xffffffffffffffff ^ v12 * 2) + v13 ^ -(v12 + (0xffffffffffffffff ^ v12 * 2) | v13)) - (v14 & v13 - v12)) * 2;
    v16 = v15 + 3;
    v17 = 0xffffffff ^ (unsigned int)v16 * 2;
    v18 = v15 + 4;
    v19 = v16 + (v17 & 14) + (v18 + (~v16 | 7)) * 2 - 7;
    v0 = v16 + (v18 + (11 | ~v16)) * 2 + (v17 & 22) - 12;
    v1 = ~v19 + v19 * 2;
    v20 = v3 >> ((char)(((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2 - 1) & 63);
    v21 = v1;
    v22 = v0;
    v23 = v22 + v21;
    v24 = v23 + (0xffffffffffffffff ^ v21 * 2) + ~(v23 + (0xffffffffffffffff ^ v21 * 2) + (v21 | ~v22));
    v25 = ~v22 * 2;
    v26 = ((0xffffffffffffffff ^ v24 * 2) + v24 * 4 + 2 ^ v23 + v25 + 2) + ((0xffffffffffffffff ^ v24 * 2) + v24 * 4 + 2 & v23 + v25 + 2) * 2;
    v27 = v21 + 1 + ~v21 * 2 + v21 + 1 + (v22 | ~(v21 + 1 + ~v21 * 2)) + (v21 + ~(v22 | v21) ^ v25 + v22) - (v21 + ~(v22 | v21) & v22 + 1) * 2;
    v28 = ((~v26 + v26 * 2 & v27) + ~v27 ^ -v26 - (-v26 | ~v27)) + (~v26 + v26 * 2 & ~v27) * 2 + ((~v26 + v26 * 2 & v27) + ~v27 & -v26 - (-v26 | ~v27)) * 2;
    v29 = v28 + 1;
    v30 = v29 + ~v28 * 2;
    v0 = v29 + (v28 | 29112) + (v30 | 29112);
    v1 = v28 + (0xffffffffffff71b8 | ~v28) + ((v30 | 36423) ^ v29) + ((v30 | 36423) & v29) * 2 + 36424;
    v31 = ((unsigned int)v1 ^ 1) + ~(unsigned int)v1 * 2 + (__ROL__((unsigned int)v1, 1) & 2 & 3);
    v32 = v31 + (unsigned int)v0 + (-v31 & ~(unsigned int)v0) * 2 + (unsigned int)((v0 & 0xffffffff) - v31 - ((unsigned int)v0 | -v31)) * 2;
    v33 = v20 + ~v20 * 2 + 1;
    g_f1201a = (unsigned short)(v33 + v20 - ((unsigned short)~v32 + (unsigned short)v32 * 2)) + ((unsigned short)~v32 + (unsigned short)v32 * 2 & (unsigned short)v33) + ((unsigned short)~v32 + (unsigned short)v32 * 2 & (unsigned short)~v33) * 2 + 1;
    v34 = v1;
    v35 = v0;
    v36 = v35 + ~v35 * 2 + 1;
    v37 = v34 + ~v34 * 2 + v35 + 2;
    v38 = (v36 + v34 & -(v36 | v34)) * 4 + (v36 + v34 ^ -(v36 | v34)) * 2 | 1;
    v39 = ~((v38 ^ v37) + (v38 & v37) * 2) + ((v38 ^ v37) + (v38 & v37) * 2) * 2;
    v40 = (((v39 - (v39 - 1 & (v35 ^ v34)) & (v35 ^ v34) - v39) * 4 + (v39 - (v39 - 1 & (v35 ^ v34)) ^ (v35 ^ v34) - v39) * 2 | 1) ^ (v39 ^ v35 ^ v34) + ((v39 & (v35 ^ v34)) - (v39 + (v35 ^ v34)) + (v39 - 1 & (v35 ^ v34))) * 2) + (((v39 - (v39 - 1 & (v35 ^ v34)) & (v35 ^ v34) - v39) * 4 + (v39 - (v39 - 1 & (v35 ^ v34)) ^ (v35 ^ v34) - v39) * 2 | 1) & (v39 ^ v35 ^ v34) + ((v39 & (v35 ^ v34)) - (v39 + (v35 ^ v34)) + (v39 - 1 & (v35 ^ v34))) * 2) * 2;
    v41 = ~v40 + v40 * 2;
    v0 = v41 + ((-v40 | 9) + v40) * 2 + ((0xffffffff ^ (unsigned int)v41 * 2) & 18) - 10;
    v1 = (1 & ~v40) + (v41 | 1) + 23;
    v42 = v3 >> ((char)~((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) + (((char)v1 + 1 ^ (char)v0) + ((char)v1 + 1 & (char)v0) * 2) * 2 & 63);
    v43 = v1;
    v44 = v0;
    v45 = v44 - v43;
    v46 = -((v45 + (v43 | ~v44) ^ v43 + 1) + (v45 + (v43 | ~v44) & v43 + 1) * 2);
    v47 = v45 + ((v44 ^ 1) + ~v44 * 2 + ((v44 * 2 | v44 >> 63) & 2 & 3) & v43) * 2;
    v48 = ((v47 ^ 1) + v47 * 2 + ~v47 * 4 + (v47 * 2 & 2) + 3 ^ (v46 ^ (v44 | v43)) + (v46 & (v44 | v43)) * 2) + ((v47 ^ 1) + v47 * 2 + ~v47 * 4 + (v47 * 2 & 2) + 3 & (v46 ^ (v44 | v43)) + (v46 & (v44 | v43)) * 2) * 2;
    v0 = v48 + (79282 & v48 * 2) + (79282 & v48 * 2 ^ 79282) + 0xffffffffffff6526;
    v1 = v48 + 25895;
    v49 = ((unsigned int)v1 + v0 ^ -((unsigned int)v1 | v0)) + ((unsigned int)v1 | v0) + ((unsigned int)v1 + v0 & -((unsigned int)v1 | v0)) * 2;
    v50 = (v49 + 1 ^ v42) + (v49 + 1 & v42) * 2;
    v52 = v49 | v42;
    v53 = -v52;
    g_f1201c = v50 + v52 + (unsigned int)(v50 - 1 + (-v50 & v53) - (v52 + (v50 - 1 & 0xffff | v53))) * 2 - 1;
    v54 = v1;
    v55 = v0;
    v56 = v54 + 1;
    v57 = v56 + ~v54 * 2 | v55;
    v58 = (-((v57 ^ v56) + (v57 & v56) * 2) ^ v55 + 1 + ~v55 * 2 + v55 + 1 + (v54 | ~(v55 + 1 + ~v55 * 2))) + (-((v57 ^ v56) + (v57 & v56) * 2) & v55 + 1 + ~v55 * 2 + v55 + 1 + (v54 | ~(v55 + 1 + ~v55 * 2))) * 2;
    v59 = (v55 & v54) + (v55 | v54) + ~(v55 & v54) * 2 + 1 - ((v55 & v54) + (v55 | v54) + ~(v55 & v54) * 2 + 1) * 2 - 2;
    v60 = v58 + (v59 | ~v58) + (v58 | v59) + 2;
    v61 = v60 * 2;
    v0 = (v60 | 0xfffffffffffffffe) + ((v61 & 56) + (v60 ^ 28) & 0xfffffffffffffffe) + 1;
    v1 = (v60 ^ 22) + (v61 & 44) - 1;
    g_f1201e = v3 >> ((char)((v0 & 0xff) + (v1 & 0xff) - (v1 & 0xff | v0 & 0xff)) + ((char)v1 ^ v0) + ((char)v1 & v0) & 63);
    v62 = g_f04490 * 3 + ~g_f04490 * 4;
    v63 = (unsigned int)(0xfffffffc - v62) | g_f12018;
    v64 = g_f04490 + g_f12018 + ~g_f12018 * 2 + 2;
    v65 = (v63 & v62 + 4) * 4 + (v63 ^ v62 + 4) * 2 | 1;
    g_f04490 = (unsigned short)~((v65 ^ v64) + (v65 & v64) * 2) + (((unsigned short)v65 ^ (unsigned short)v64) + ((unsigned short)v65 & (unsigned short)v64) * 2) * 2;
    v66 = (0xffffffff ^ g_f04492 * 2) + g_f04492;
    v67 = v66 + g_f1201a;
    v68 = -(v66 | g_f1201a);
    g_f04492 = g_f04492 - g_f1201a + ((unsigned short)v67 ^ (unsigned short)v68) * 2 + ((unsigned short)v67 & (unsigned short)v68) * 4;
    v69 = g_f1201c | g_f04494;
    v70 = -g_f04494;
    v71 = g_f04494 - g_f1201c;
    g_f04494 = (v71 | (v69 & v70) * 4 + (v69 ^ v70) * 2) + ((v69 & v70) * 4 + (v69 ^ v70) * 2 & v71);
    v72 = g_f1201e | g_f04496;
    v73 = (g_f04496 + ~g_f04496 * 2 + 1 | g_f1201e) + g_f04496;
    g_f04496 = (unsigned short)v72 + (unsigned short)v73 + ((unsigned short)v72 & (unsigned short)~v73 | (unsigned short)~v73 & (unsigned short)~v72) * 2 + 1;
    v74 = g_f04498 + (0xffffffffffffffff ^ g_f04498 * 2) + v3;
    v75 = (g_f04498 ^ -v3) + (g_f04498 - v3 - (g_f04498 | -v3)) * 2;
    v76 = (v74 + ~(v74 + (g_f04498 | ~v3))) * 2;
    g_f04498 = v75 + (v76 | ~v75) + (v76 | v75) + 1;
    return v67 ^ v68;
}

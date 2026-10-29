/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x930634..0x93104c (2584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_930634_0 {
    char field_0;
} st_930634_0;

extern unsigned short g_f04b30;
extern unsigned short g_f04b32;
extern unsigned short g_f04b34;
extern unsigned short g_f04b36;
extern unsigned long long g_f04b38;
extern unsigned short g_f126fc;
extern unsigned short g_f126fe;
extern unsigned short g_f12700;
extern unsigned short g_f12702;
extern unsigned int g_ffffffffffffffec;
extern unsigned long g_fffffffffffffff0;
extern char g_fffffffffffffffc;

double sub_930634(void)
{
    unsigned long long v2;  // x8
    st_930634_0 *v3;  // x10
    unsigned int v12;  // w13
    unsigned long long v13;  // x12
    unsigned long long v14;  // x13
    unsigned long long v15;  // x1
    unsigned long long v16;  // x14
    unsigned long long v17;  // x12
    unsigned long long v18;  // x12
    unsigned long long v19;  // x13
    unsigned long long v20;  // x12
    unsigned long v21;  // x13
    st_930634_0 **v4;  // x12
    char v22;  // x12
    unsigned int v23;  // w12
    unsigned long long v24;  // x13
    unsigned long long v25;  // x13
    unsigned long long v26;  // x15
    unsigned int v27;  // w13
    unsigned int v28;  // w12
    unsigned long v29;  // x13
    unsigned long long v30;  // x14
    unsigned long long v31;  // x17
    unsigned long long v5;  // x13
    unsigned long long v32;  // x15
    unsigned long long v33;  // x14
    unsigned long long v34;  // x13
    unsigned long long v35;  // x13
    unsigned long long v36;  // x14
    unsigned int v37;  // w14
    unsigned long v38;  // x15
    unsigned long long v39;  // x16
    unsigned long v40;  // x17
    unsigned long long v41;  // x2
    unsigned long long v6;  // x14
    unsigned long long v42;  // x1
    unsigned long long v43;  // x3
    unsigned long long v44;  // x0
    unsigned long long v45;  // x15
    unsigned long long v46;  // x16
    unsigned long long v47;  // x17
    unsigned long long v48;  // x15
    unsigned long long v49;  // x17
    unsigned long long v50;  // x15
    unsigned long long v51;  // x0
    unsigned long long v7;  // x13
    unsigned int v52;  // w15
    unsigned int v53;  // w16
    unsigned int v54;  // w17
    unsigned int v55;  // w17
    unsigned int v56;  // w16
    unsigned int v57;  // w15
    unsigned short v58;  // x14
    unsigned long long v59;  // x15
    unsigned long v60;  // x16
    unsigned long long v61;  // x17
    unsigned long long v8;  // x12
    unsigned long long v62;  // x0
    unsigned long long v63;  // x15
    unsigned long long v64;  // x1
    unsigned long long v65;  // x15
    unsigned long long v66;  // x16
    unsigned long v67;  // x16
    unsigned long long v68;  // x15
    unsigned long long v69;  // x16
    __m128i v70;  // q0
    unsigned long v71;  // x16
    unsigned long long v9;  // x12
    char v72;  // x0
    unsigned long long v73;  // x15
    unsigned short v74;  // x16
    unsigned int v75;  // w10
    unsigned int v76;  // w10
    unsigned short v77;  // x11
    unsigned int v78;  // w12
    unsigned int v79;  // w14
    unsigned int v80;  // w10
    unsigned short v81;  // x10
    unsigned long long v10;  // x13
    unsigned short v82;  // x11
    unsigned long long v83;  // x11
    unsigned long long v84;  // x10
    unsigned long long v85;  // x8
    unsigned int v11;  // w12
    st_930634_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_930634_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long, unsigned long

    v1 = &v0;
    v0 = &v1;
    v2 = 6322003577700635467 + ((12124740473428014448 + ~12124740473428014448 * 2 + 1 & 22584089028) + 12124740473426420784) * 2;
    v3 = v1;
    v4 = v0;
    v5 = ~v4 * 2;
    v6 = ((char *)v4 + v5 + 1 & v3) + (char *)v4 + ((v3 | v4) - 1 ^ v4 + v3) + -2 * (v4 + v3 & -(v3 | v4));
    v7 = ((v4 * 2 | v4 >> 63) & 2 & 3) + (v4 ^ 1) + v5;
    v8 = v4 - v3 + &v3[v7 + (~v7 & ~v3) + 1] * 4 - &v3[v7 + (~v7 & ~v3) + 1] * 2;
    v9 = (v8 ^ v6 + 1) + (v6 + (0xfffffffffffffffe - v6) * 2 + 2 + (v8 & v6 + 1) + (-v8 | ~(v6 + (0xfffffffffffffffe - v6) * 2 + 2))) * 2 + ~((~(v6 + 1 - v8) - (v8 - 1 | 0xfffffffffffffffe - v6) & v6 + 1 - v8) * 4 + (~(v6 + 1 - v8) - (v8 - 1 | 0xfffffffffffffffe - v6) ^ v6 + 1 - v8) * 2) + ((~(v6 + 1 - v8) - (v8 - 1 | 0xfffffffffffffffe - v6) & v6 + 1 - v8) * 4 + (~(v6 + 1 - v8) - (v8 - 1 | 0xfffffffffffffffe - v6) ^ v6 + 1 - v8) * 2) * 2;
    v10 = v9 + 3;
    v0 = (v9 + 11173 ^ -(v10 | 11170)) + (v10 | 11170) + (v9 + 11173 & -(v10 | 11170)) * 2;
    v1 = (v9 - (v10 & 54365) + 54369 ^ v10 & 54365) + (v9 - (v10 & 54365) + 54369 & v10 & 54365) * 2 - 1;
    v11 = (unsigned int)v1 + (unsigned int)v0;
    v12 = v11 + ~v11 * 2 + 1;
    g_f126fc = (unsigned short)(v2 - 0x5b30ffff) + ((unsigned short)v2 ^ 0xfffe) + (unsigned short)v11 + (unsigned short)v12 + ((unsigned short)v2 & (unsigned short)~v12);
    v13 = v1;
    v14 = v0;
    v15 = v13 + 1;
    v16 = v13 + v14 + ((-v14 | ~v13) + v15 + (-v14 & ~v13)) * 2 + ~(((v13 | v14) & -v13) * 4 + ((v13 | v14) ^ -v13) * 2) + (((v13 | v14) & -v13) * 4 + ((v13 | v14) ^ -v13) * 2) * 2;
    v17 = (v14 & v13) + v15 + (v15 + ~v13 * 2 & v14) + ~(v14 & v13) * 2;
    v18 = ((~(v16 + 2) + (v16 + 2) * 2 & v17) - (v17 + 1) ^ v17 + 1 - (~(v16 + 2) + (v16 + 2) * 2) + (~(v16 + 2) + (v16 + 2) * 2 | ~v17)) + (~(v16 + 2) + (v16 + 2) * 2 + (0xfffffffffffffffe - v16 | ~v17) + ((~(v16 + 2) + (v16 + 2) * 2 & v17) - (v17 + 1) & v17 + 1 - (~(v16 + 2) + (v16 + 2) * 2) + (~(v16 + 2) + (v16 + 2) * 2 | ~v17))) * 2;
    v19 = v18 + 2;
    v20 = v18 + 3;
    v0 = (v19 ^ 9) + (v20 + (9 | ~v19)) * 2 - 1;
    v1 = v20 + (~v19 | (char *)&g_fffffffffffffff0 + 7) + (~v19 | 8) + v19 + 1 + (0xfffffffffffffffe - ((~v19 | 8) + v19) | (char *)&g_fffffffffffffff0 - v20 - (~v19 | (char *)&g_fffffffffffffff0 + 7) + 7) + ((~v19 | 8) + v19 + 1 & v20 + (~v19 | (char *)&g_fffffffffffffff0 + 7) + 8) + 9;
    v21 = v1;
    v22 = ((char)v21 + (char)~v21 * 2 + 1 & v0) + (char)v21;
    v23 = v2 >> (((char)v21 & v0) + (v22 | (char)~(v21 & v0)) + (v22 | (char)v21 & v0) + 1 & 63);
    v24 = v1 + (v1 + ~v1 * 2 + 1 | v0) + ((v0 + 1 + ~v0 * 2 | v1) ^ ~v0 * 2 + v0) - ((v0 + 1 + ~v0 * 2 | v1) & v0 + 1) * 2;
    v25 = (0xfffffffffffffffe - v24 | 0xfffffffffffffffe) + ~v24 + 0xfffffffffffffffe - v24 - (v24 + (0xfffffffffffffffe - v24) * 2 + 1 | 1);
    v26 = v25 * 2;
    v0 = (v25 ^ 16870) + (v26 & 33740) - 1;
    v1 = (v25 ^ 48667 | 0xfffffffffffffffe) + ((v26 & 97334) + (v25 ^ 48667) & 0xfffffffffffffffe) + 1;
    v27 = (unsigned int)v0 + ((unsigned int)v1 ^ 0xfffffffe) - ~(unsigned int)v1 * 2 - (__ROL__((unsigned int)v1, 1) & 2 & 3);
    v28 = v23 - v27 + (v27 & v23) + (v27 & ~v23) * 2;
    g_f126fe = v28 + v27 + v23 + 1 + ((-v28 | ~(v27 + v23)) + v27 + v23 + 1 + (-v28 & ~(v27 + v23))) * 2 - 1;
    v29 = v1;
    v30 = v0;
    v31 = v30 + v29 + (-v30 & ~v29) * 2 + (v29 + (-v30 | ~v29)) * 2 + 2;
    v32 = (v30 + ~v29 & -(v30 | ~v29)) * 4 + (v30 + ~v29 ^ -(v30 | ~v29)) * 2;
    v33 = v30 + 1;
    v34 = ((v33 + ~v30 * 2 | v29) ^ v33) + ((v33 + ~v30 * 2 | v29) & v33) * 2;
    v35 = v31 - (v30 - v29 + (v29 | ~v30) + v33 + (v29 & ~v30) * 2) + (v32 | ~v31) + (v32 | v31) - v34 + 1;
    v36 = v35 - -v34 * 2;
    v0 = (v35 & 1) + (v36 | 1) + 15;
    v1 = (v36 | (char *)&g_ffffffffffffffec + 3) + (v36 - 16 & v36 & 16) + (((0xffffffff ^ (unsigned int)v36 * 2) & 32) + v36 - 16 | v36 & 16) + 0x11;
    v37 = v2 >> ((char)v1 + (char)v0 & 63);
    v38 = v1;
    v39 = v0;
    v40 = ~v38;
    v41 = v39 + 1;
    v42 = ~v39 * 2;
    v43 = v41 + v42;
    v44 = v43 + v38 + ((v38 * 3 + v40 * 4 + 3 & v39) - (v38 * 3 + v40 * 4 + 3 + v39) & v38 * 3 + v40 * 4 + 3 + v39) * 4 + ((v38 * 3 + v40 * 4 + 3 & v39) - (v38 * 3 + v40 * 4 + 3 + v39) ^ v38 * 3 + v40 * 4 + 3 + v39) * 2 + (0xfffffffffffffffe - (v43 + v38) | ~(((v38 * 3 + v40 * 4 + 3 & v39) - (v38 * 3 + v40 * 4 + 3 + v39) & v38 * 3 + v40 * 4 + 3 + v39) * 4 + ((v38 * 3 + v40 * 4 + 3 & v39) - (v38 * 3 + v40 * 4 + 3 + v39) ^ v38 * 3 + v40 * 4 + 3 + v39) * 2)) + (((v38 * 3 + v40 * 4 + 3 & v39) - (v38 * 3 + v40 * 4 + 3 + v39) & v38 * 3 + v40 * 4 + 3 + v39) * 4 + ((v38 * 3 + v40 * 4 + 3 & v39) - (v38 * 3 + v40 * 4 + 3 + v39) ^ v38 * 3 + v40 * 4 + 3 + v39) * 2 & v43 + v38 + 1) + 2;
    v45 = v41 + v38 + (v38 + v40 * 2 + 1 | ~v39) + ((v43 | v38) ^ v42 + v39) - ((v43 | v38) & v41) * 2;
    v46 = ((0xfffffffffffffffe - v45 | 1) + (v45 & 1) | v44) + ~(((0xfffffffffffffffe - v45 | 1) + (v45 & 1) | ~v44) + v44);
    v47 = v44 + ~v44 * 2 + 1;
    v48 = v46 + (v44 - v45 + v47 + (v45 | ~v47)) * 2;
    v49 = v48 + 2;
    v50 = ((v48 + 3 + ~v49 * 2 | 427) ^ v48 + 3) + ((v48 + 3 + ~v49 * 2 | 427) & v48 + 3) * 2;
    v51 = v49 + (v49 & 427) + ((0xffffffff ^ (unsigned int)v49 * 2) & 854) - 427;
    v0 = v51 + v50 + (v50 & ~v51) + (v51 | ~v50) + 1;
    v1 = ~((v49 | 1) + (v46 & 1) + 65108) + ((v49 | 1) + (v46 & 1) + 65108) * 2;
    v52 = v0;
    v53 = v1;
    v54 = (v52 + ~v52 * 2 + 1 | v53) + v52;
    v55 = v37 * 2;
    v56 = v55 + ~v37 * 4;
    v57 = (unsigned int)((~v53 & ~v52) + (v53 | v52) * 2 + v54 * 2 - ((v54 + 1 & (unsigned int)(0xfffffffe - ((~v53 & ~v52) + (v53 | v52) * 2))) + ((~v53 & ~v52) + (v53 | v52) * 2 + 1 & v54 + 1))) + 3 | v37 + v56 + 3;
    v58 = ((unsigned short)v37 ^ 1) + ((unsigned short)v55 & 2) + (unsigned short)v56;
    g_f12700 = v58 + (unsigned short)v57 + ((unsigned short)v57 + ((unsigned short)(0xfffffffe - v58) | (unsigned short)~v57) + ((unsigned short)(0xfffffffe - v58) & (unsigned short)~v57)) * 2 + 4;
    v59 = v1;
    v60 = v0;
    v61 = ~v59;
    v62 = v59 - v60 + (v59 - v60 - (v59 | ~v60) ^ v60 + v61) * 2 + (v59 - v60 - (v59 | ~v60) & v60 + v61) * 4;
    v63 = v59 + v61 * 2 + v60 + ~(((&(&g_fffffffffffffffc)[-3 * v60 + -4 * ~v60] | v59) & v60 * 3 + ~v60 * 4 + 4) * 4 + ((&(&g_fffffffffffffffc)[-3 * v60 + -4 * ~v60] | v59) ^ v60 * 3 + ~v60 * 4 + 4) * 2) + (((&(&g_fffffffffffffffc)[-3 * v60 + -4 * ~v60] | v59) & v60 * 3 + ~v60 * 4 + 4) * 4 + ((&(&g_fffffffffffffffc)[-3 * v60 + -4 * ~v60] | v59) ^ v60 * 3 + ~v60 * 4 + 4) * 2) * 2;
    v64 = ~v62;
    v65 = (v64 - (0xfffffffffffffffd - v63 | ~v62) ^ (v62 | 0xfffffffffffffffd - v63)) + (v64 - (0xfffffffffffffffd - v63 | ~v62) & (v62 | 0xfffffffffffffffd - v63)) * 2;
    v66 = v63 + 3 + ~(v63 + 3) * 2;
    v67 = (v66 + v62 + 1 + (0x7ffffffffffffffd - v66 & v62 + 1 + v64 * 2)) * 2 + 4;
    v68 = v65 + (v67 | ~v65) + (v67 | v65) + 1;
    v69 = v68 + (v68 ^ 0xffffffffffffffd5) + (~(unsigned int)v68 & 42) + 1;
    v70 = _mm_add_epi64(_mm_add_epi64(CONCAT(v68, v68), _mm_set_epi64x(7, 6)), _mm_xor_si128(_mm_set_epi64x(-1, -7), _mm_and_si128(CONCAT(v68, v68), _mm_set_epi64x(6, -7))));
    v0 = (v69 | v68 | 42) + (v69 & (v68 | 42));
    v1 = _mm_cvtsi128_si64(v70) + (0xfffffffffffffffe - _mm_cvtsi128_si64(v70) | _mm_extract_epi64(v70, 1)) + (_mm_cvtsi128_si64(v70) + 1 | _mm_extract_epi64(v70, 1)) + 2;
    v71 = v1;
    v72 = ((char)v0 | (char)~v71) + (char)v71;
    v73 = (v71 + ~v71 * 2 + 1 & v0) + v71;
    g_f12702 = v2 >> (v72 + (char)v73 + ((char)(0xfffffffffffffffe - v72) | (char)~v73) + ((char)v73 & v72 + 1) + 2 & 63);
    v74 = (~g_f126fc & ~g_f04b30) + (g_f126fc | g_f04b30) * 2 + 1;
    v75 = g_f126fc & g_f04b30;
    g_f04b30 = (v74 ^ (unsigned short)-v75) + (unsigned short)(v74 - v75 - (v74 | -v75 & 0xffff)) * 2;
    v76 = g_f04b32 - g_f126fe;
    v77 = (g_f126fe & ~g_f04b32) * 2;
    g_f04b32 = (unsigned short)v76 + (v77 | (unsigned short)~v76) + (v77 | (unsigned short)v76) + 1;
    v78 = (g_f04b34 ^ 1) + ~g_f04b34 * 2 + (__ROL__(g_f04b34, 1) & 2 & 3);
    v79 = g_f12700 | ~v78;
    v80 = (unsigned int)(g_f04b34 - g_f12700) + ~((v79 & v78 + 1) * 4 + (v79 ^ v78 + 1) * 2) + ((v79 & v78 + 1) * 4 + (v79 ^ v78 + 1) * 2) * 2 + 2;
    g_f04b34 = (unsigned short)~v80 + (unsigned short)v80 * 2;
    v81 = g_f04b36 - g_f12702;
    v82 = ((0xffff ^ g_f04b36 * 2) + g_f04b36 & g_f12702) * 2;
    g_f04b36 = (v81 | v82) + (v82 & v81);
    v83 = g_f04b38 | v2;
    v84 = g_f04b38 + ~g_f04b38 * 2;
    v85 = (v84 ^ ~(v84 + 1 | v2)) + ((v84 + 1 | v2) & ~v84) * 2;
    g_f04b38 = v85 + v83 + (v83 - v85 - (v83 | -v85) + (-v85 & ~v83)) * 2;
    return _mm_cvtsi128_si64(v70);
}

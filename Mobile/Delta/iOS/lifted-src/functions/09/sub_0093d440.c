/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93d440..0x93ddc4 (2436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_93d440_0 {
    char field_0;
} st_93d440_0;

extern unsigned short g_f04a18;
extern unsigned short g_f04a1a;
extern unsigned short g_f04a1c;
extern unsigned short g_f04a1e;
extern unsigned long long g_f04a20;
extern unsigned short g_f1267c;
extern unsigned short g_f1267e;
extern unsigned short g_f12680;
extern unsigned short g_f12682;

unsigned int sub_93d440(void)
{
    unsigned long long v2;  // x8
    st_93d440_0 *v3;  // x10
    unsigned long long v12;  // x11
    unsigned long long v13;  // x12
    unsigned int v14;  // w10
    unsigned int v15;  // w11
    unsigned long long v16;  // x10
    unsigned short v17;  // x12
    unsigned long long v18;  // x12
    unsigned long long v19;  // x13
    unsigned long long v20;  // x15
    unsigned long long v21;  // x15
    st_93d440_0 **v4;  // x11
    unsigned long long v22;  // x13
    unsigned long long v23;  // x13
    unsigned long long v24;  // x13
    unsigned int v25;  // w13
    unsigned long v26;  // x15
    unsigned long v27;  // x16
    unsigned long long v28;  // x0
    unsigned long long v29;  // x0
    unsigned long long v30;  // x1
    unsigned long long v31;  // x17
    unsigned long long v5;  // x12
    unsigned long long v32;  // x0
    unsigned long long v33;  // x3
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    unsigned long long v36;  // x16
    unsigned long long v37;  // x15
    unsigned long v38;  // x15
    unsigned long long v39;  // x16
    unsigned long long v40;  // x17
    unsigned long long v41;  // x0
    unsigned long long v6;  // x13
    unsigned long long v42;  // x0
    unsigned long long v43;  // x15
    unsigned long long v44;  // x16
    unsigned int v45;  // w15
    unsigned long long v46;  // x16
    unsigned long long v47;  // x17
    unsigned long long v48;  // x0
    unsigned long long v49;  // x5
    unsigned long long v50;  // x0
    unsigned long long v51;  // x1
    unsigned long long v7;  // x13
    unsigned long long v52;  // x2
    unsigned long long v53;  // x16
    unsigned long long v54;  // x16
    unsigned long long v55;  // x16
    __m128i v56;  // q0
    unsigned int v57;  // w16
    unsigned int v58;  // w17
    unsigned int v59;  // w0
    unsigned int v60;  // w16
    unsigned int v61;  // w16
    unsigned long long v8;  // x10
    unsigned int v62;  // w0
    unsigned long long v63;  // x16
    unsigned long long v64;  // x17
    unsigned long long v65;  // x1
    unsigned long long v66;  // x4
    unsigned long long v67;  // x3
    unsigned long long v68;  // x1
    unsigned long long v69;  // x16
    unsigned long long v70;  // x16
    unsigned long long v71;  // x17
    unsigned long long v9;  // x11
    unsigned long long v72;  // x12
    unsigned long long v73;  // x2
    unsigned long long v74;  // x0
    unsigned long long v75;  // x12
    unsigned int v76;  // w17
    unsigned int v77;  // w0
    unsigned short v78;  // x17
    unsigned int v79;  // w13
    unsigned short v80;  // x14
    unsigned short v81;  // x13
    unsigned long long v10;  // x12
    unsigned short v82;  // x11
    unsigned int v83;  // w14
    unsigned int v84;  // w13
    unsigned int v85;  // w14
    unsigned int v86;  // w11
    unsigned long long v87;  // x12
    unsigned long long v88;  // x13
    unsigned long long v89;  // x8
    unsigned long long v90;  // x10
    unsigned long long v11;  // x10
    st_93d440_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_93d440_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 11030609544740647584 + ((7416134516842460472 + ~7416134516842460472 * 2 + 1 & 13813626983) + 7416134515998868760) * 2;
    v3 = v1;
    v4 = v0;
    v5 = v4 | v3;
    v6 = (v5 & -v3) * 4 + (v5 ^ -v3) * 2;
    v7 = ~(v3 - v4 + ~v6 + v6 * 2 + 2) + (v3 - v4 + ~v6 + v6 * 2 + 2) * 2;
    v8 = ((char *)v4 + 0x2 * ~v4 ^ (v3 | ~v4)) - ((v3 | ~v4) & (char *)v4 + 1) * 2 + v5;
    v9 = v8 + 1;
    v10 = (v9 - v7 + (v7 | ~v8) ^ (v7 | ~v8)) + (v9 - v7 + (v7 | ~v8) & (v7 | ~v8)) * 2;
    v11 = v10 + ((v9 - (v7 & v8) & v7 - v9) * 4 + (v9 - (v7 & v8) ^ v7 - v9) * 2 | ~v10) + (v10 | (v9 - (v7 & v8) & v7 - v9) * 4 + (v9 - (v7 & v8) ^ v7 - v9) * 2);
    v12 = v11 + 1;
    v13 = ((v12 | 0xffffffffffffb101) + 0x4eff ^ -(0xffffffffffffb101 & ~v12)) + ((v12 | 0xffffffffffffb101) + 0x4eff & -(0xffffffffffffb101 & ~v12)) * 2;
    v0 = ~v13 + v13 * 2;
    v1 = (v12 & 0xffffffffffff4efe ^ 0xffffffffffff4eff ^ v11 + 45314) + (v12 | 45313) + ((v12 & 0xffffffffffff4efe ^ 0xffffffffffff4eff) & v11 + 45314) * 2;
    v14 = (~(unsigned int)v1 & ~(unsigned int)v0) + ((unsigned int)v1 & (unsigned int)v0) + ((unsigned int)v1 | (unsigned int)v0) * 2 + 1;
    v15 = v14 + (v14 & (unsigned int)v2) + ~(v14 + (unsigned int)v2);
    v16 = ~v2;
    v17 = (unsigned short)(((unsigned int)v2 ^ 0xfffffffe) - ((unsigned int)v2 * 2 + (unsigned int)v16 * 4)) + ((unsigned short)~((unsigned int)v2 * 2) | 0xfffd);
    g_f1267c = ((unsigned short)v15 ^ v17) + ((unsigned short)v15 + (v17 | (unsigned short)~v15)) * 2 + 2;
    v18 = v1;
    v19 = v0;
    v20 = (v18 ^ -v19) + (v18 - v19 - (v18 | -v19)) * 2;
    v21 = (v18 + (0xffffffffffffffff ^ v18 * 2) + v19 & -(v18 + (0xffffffffffffffff ^ v18 * 2) | v19)) * 4 + (v18 + (0xffffffffffffffff ^ v18 * 2) + v19 ^ -(v18 + (0xffffffffffffffff ^ v18 * 2) | v19)) * 2 + v20 * 2 - ((v18 + (0xffffffffffffffff ^ v18 * 2) + v19 & -(v18 + (0xffffffffffffffff ^ v18 * 2) | v19)) * 4 + (v18 + (0xffffffffffffffff ^ v18 * 2) + v19 ^ -(v18 + (0xffffffffffffffff ^ v18 * 2) | v19)) * 2 & v20) + ((v18 + (0xffffffffffffffff ^ v18 * 2) + v19 & -(v18 + (0xffffffffffffffff ^ v18 * 2) | v19)) * 4 + (v18 + (0xffffffffffffffff ^ v18 * 2) + v19 ^ -(v18 + (0xffffffffffffffff ^ v18 * 2) | v19)) * 2 | ~v20);
    v22 = (v19 | v18) + (v18 - v19 + (v19 | ~v18) ^ 0xfffffffffffffffe - v19) - (v18 - v19 + (v19 | ~v18) & v19 + 1) * 2;
    v23 = v21 + 1 + ~v22 + (v22 + 1 | 0xfffffffffffffffe - v21) + (v21 + 1 & 0xfffffffffffffffe - v22);
    v24 = v23 + (v23 | 1) + (~v23 | 1) + 1;
    v0 = (v24 | 0xfffffffffffffff9) + (v24 | 6) + 7;
    v1 = v24 + (10 | ~v24) + (v24 & 10) + (v24 ^ 10) + 1;
    v25 = v2 >> ((char)(((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2 - 1) & 63);
    v26 = v1;
    v27 = v0;
    v28 = (v26 ^ 1) + ~v26 * 2 + ((v26 * 2 | v26 >> 63) & 2 & 3);
    v29 = v28 + 1;
    v30 = v29 + ~v28 * 2 | v27;
    v31 = (v26 ^ -v27) + (v26 - v27 - (v26 | -v27)) * 2;
    v32 = (v30 & v29) * 4 + (v30 ^ v29) * 2 | 1;
    v33 = v27 + ~v27 * 2 + 1;
    v34 = v27 - v26 + (v33 + v26 ^ -(v33 | v26)) * 2 + (v33 + v26 & -(v33 | v26)) * 4;
    v35 = (((v32 ^ v31) + (v32 & v31) * 2 - 1 & 0xfffffffffffffffd - (v34 + ~v34 * 2)) + v34 + ~v34 * 2 + 2 ^ -((v32 ^ v31) + (v32 & v31) * 2) - (v34 + ~v34 * 2 + 2 | -((v32 ^ v31) + (v32 & v31) * 2))) + ((v32 ^ v31) + (v32 & v31) * 2 - 1 - v34 + ((v32 ^ v31) + ((v32 & v31) - ((v32 ^ v31) + (v32 & v31) * 2)) * 2 & v34 - 1) + (((v32 ^ v31) + (v32 & v31) * 2 - 1 & 0xfffffffffffffffd - (v34 + ~v34 * 2)) + v34 + ~v34 * 2 + 2 & -((v32 ^ v31) + (v32 & v31) * 2) - (v34 + ~v34 * 2 + 2 | -((v32 ^ v31) + (v32 & v31) * 2)))) * 2;
    v36 = v35 + 2;
    v37 = v35 + 3;
    v0 = ((25996 | ~v36) ^ v37) + (v36 | 25996) + ((25996 | ~v36) & v37) * 2;
    v1 = (v36 ^ 39540) + (v37 + (39540 | ~v36)) * 2 - 1;
    g_f1267e = (((unsigned short)v1 + (unsigned short)v0 | (unsigned short)~v25) ^ (unsigned short)v25 + 1) + (((unsigned short)v1 + (unsigned short)v0 | (unsigned short)~v25) & (unsigned short)v25 + 1) * 2;
    v38 = v1;
    v39 = v0;
    v40 = ~v38 * 2;
    v41 = ((v38 * 2 | v38 >> 63) & 2 & 3) + (v38 ^ 1) + v40;
    v42 = v41 + v39 + (~v41 & ~v39) + 1;
    v43 = v38 + 1 - v39 + v42 * 4 + (0xffffffffffffffff ^ v42 * 2) + (v38 + 1 + v40 & v39) + v38 + 1 + (v39 & v38) + (-(v39 & v38) & ~((v38 + 1 + v40 & v39) + v38)) * 2 + ((v38 + 1 + v40 & v39) + v38 + 1 + (-(v39 & v38) | ~((v38 + 1 + v40 & v39) + v38))) * 2 - ((v38 + 1 + v40 & v39) + v38 + 1 + (v39 & v38) + (-(v39 & v38) & ~((v38 + 1 + v40 & v39) + v38)) * 2 + ((v38 + 1 + v40 & v39) + v38 + 1 + (-(v39 & v38) | ~((v38 + 1 + v40 & v39) + v38))) * 2) * 2;
    v44 = v43 + 1;
    v0 = v43 + (v43 + (0x7ffffffffffffffe - v43 | 25)) * 2 + ((0xffffffff ^ (unsigned int)v44 * 2) & 50) - 21;
    v1 = (v44 | 1) + (v44 & 1) + 7;
    v45 = v2 >> ((char)v1 + (char)v0 & 63);
    v46 = v1;
    v47 = v0;
    v48 = (v46 ^ 1) + v46 * 2 + ~v46 * 4 + (v46 * 2 & 2) + 2;
    v49 = v46 + 1;
    v50 = (v46 ^ -v47) + (v48 + v47 & -(v48 | v47)) * 4 + ((-v47 | ~v46) + v49 + (v48 + v47 ^ -(v48 | v47))) * 2;
    v51 = (v47 ^ 1) + ~v47 * 2 + ((v47 * 2 | v47 >> 63) & 2 & 3);
    v52 = -v46;
    v53 = v47 + v46 + (v52 & ~v47) * 2;
    v54 = ((((v51 | ~v46) + v49 - (v51 + 1) & v51 + 1) * 4 + ((v51 | ~v46) + v49 - (v51 + 1) ^ v51 + 1) * 2 | 1) ^ v53 + (v47 + (v52 | ~v47)) * 2 + 2) + ((((v51 | ~v46) + v49 - (v51 + 1) & v51 + 1) * 4 + ((v51 | ~v46) + v49 - (v51 + 1) ^ v51 + 1) * 2 | 1) & v53 + (v47 + (v52 | ~v47)) * 2 + 2) * 2;
    v55 = v50 - v54 + (v50 - v54 | 1) + (v54 + ~v50 | 1) + 1;
    v56 = _mm_add_epi64(_mm_add_epi64(CONCAT(v55, v55), _mm_set_epi64x(10288, 10287)), _mm_xor_si128(_mm_set_epi64x(-1, -0x2830), _mm_and_si128(CONCAT(v55, v55), _mm_set_epi64x(10287, -0x2830))));
    v0 = ~((v55 | 1) + (v55 & 1) + 55248) + ((v55 | 1) + (v55 & 1) + 55248) * 2;
    v1 = _mm_cvtsi128_si64(v56) + (0xfffffffffffffffe - _mm_cvtsi128_si64(v56) | _mm_extract_epi64(v56, 1)) + (_mm_cvtsi128_si64(v56) + 1 | _mm_extract_epi64(v56, 1)) + 2;
    v57 = v0;
    v58 = v1;
    v59 = (v58 - v57 + (v57 | ~v58) ^ v57 + 1) + (v58 - v57 + (v57 | ~v58) & v57 + 1) * 2;
    v60 = (v58 + ~v58 * 2 + 1 & v57) + v58;
    v61 = v59 + (v60 | ~v59) + (v59 | v60) + 1;
    v62 = v61 + ~v61 * 2 + 1 & v45;
    g_f12680 = (unsigned short)v62 + (unsigned short)v61 + (unsigned short)v61 + (unsigned short)v45 + ((unsigned short)(v45 - v62 - (v61 + v45 | -(v62 + v61))) + ((unsigned short)-(v62 + v61) & (unsigned short)~(v61 + v45))) * 2;
    v63 = v1;
    v64 = v0;
    v65 = v64 + ~v64 * 2 + 1 + v64 + (v63 | ~(v64 + ~v64 * 2 + 1));
    v66 = v63 + 1;
    v67 = (v66 + ~v63 * 2 | v64) + v63;
    v68 = (v67 ^ ~(v65 + 1)) + (v65 - v67 - (v65 + 1 | ~v67)) * 2;
    v69 = (v64 & ~v63) + v66 + (v64 + v63 ^ -(v64 | v63)) + (v64 + v63 & -(v64 | v63)) * 2 + ~((v64 + v63 ^ -(v64 | v63)) + (v64 + v63 & -(v64 | v63)) * 2) * 2;
    v70 = (v68 & v69 + 1) + 0xfffffffffffffffe - v69 + (v68 & 0xfffffffffffffffe - v69);
    v71 = v70 + 1;
    v72 = 0xfffffffffffffffe - v70;
    v73 = v70 + 2;
    v74 = (v71 ^ 8) + ((v72 | 8) + v73) * 2;
    v0 = ~v74 + v74 * 2;
    v1 = v70 + v73 + (v72 | 0xffffffffffffffd6) + (0xffffffffffffffd6 & ~v71) + 84;
    v75 = (v1 + v1 + 1 + ~v1 * 2 + (v0 | ~(v1 + 1 + ~v1 * 2)) + 2 ^ v1 + 1 + v0 + ~(v1 | v0)) + (v1 + v1 + 1 + ~v1 * 2 + (v0 | ~(v1 + 1 + ~v1 * 2)) + 2 & v1 + 1 + v0 + ~(v1 | v0)) * 2;
    g_f12682 = v2 >> ((char)~v75 + (char)v75 * 2 & 63);
    v76 = (g_f04a18 ^ 1) + ~g_f04a18 * 2 + (__ROL__(g_f04a18, 1) & 2 & 3);
    v77 = v76 + g_f1267c;
    v78 = -(v76 | g_f1267c);
    g_f04a18 = g_f04a18 - g_f1267c + ((unsigned short)v77 ^ v78) * 2 + ((unsigned short)v77 & v78) * 4;
    g_f04a1a = g_f1267e ^ g_f04a1a;
    v79 = (0xffffffff ^ g_f04a1c * 2) + g_f04a1c;
    v80 = (unsigned short)v79 + g_f12680;
    v81 = -(v79 | g_f12680);
    v82 = g_f04a1c - g_f12680;
    g_f04a1c = (v82 | (v80 & v81) * 4 + (v80 ^ v81) * 2) + ((v80 & v81) * 4 + (v80 ^ v81) * 2 & v82);
    v83 = g_f12682 + 1;
    v84 = v83 + g_f04a1e + (v83 + ~g_f12682 * 2 | ~g_f04a1e);
    v85 = g_f12682 + g_f04a1e;
    v86 = -(g_f04a1e | g_f12682);
    g_f04a1e = v84 + 1 + (v85 ^ v86) + (v85 & v86) * 2 + (v84 + 1 + (-((v85 ^ v86) + (v85 & v86) * 2) | ~v84) + (-((v85 ^ v86) + (v85 & v86) * 2) & ~v84)) * 2 - 1;
    v87 = g_f04a20 | v2;
    v88 = -g_f04a20;
    v89 = v2 + v16 * 2 + g_f04a20 + 2;
    v90 = (v87 & v88) * 4 + (v87 ^ v88) * 2 | 1;
    g_f04a20 = (v90 ^ v89) + (v90 & v89) * 2 - 1;
    return v77;
}

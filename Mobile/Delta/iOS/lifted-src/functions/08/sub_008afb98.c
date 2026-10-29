/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8afb98..0x8b00fc (1380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8afb98_2 {
    char field_0;
} st_8afb98_2;

typedef struct st_8afb98_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_8afb98_0;

typedef struct st_8afb98_1 {
    char padding_0[96];
    struct st_8afb98_0 *field_60;
} st_8afb98_1;

extern char g_d250c8;
extern unsigned short g_f04c40;
extern unsigned short g_f04c42;
extern unsigned short g_f04c44;
extern unsigned short g_f04c46;
extern unsigned long long g_f04c48;
extern st_8afb98_1 *g_f0d198;
extern unsigned short g_f12784;
extern unsigned short g_f12786;
extern unsigned short g_f12788;
extern unsigned short g_f1278a;
extern unsigned int g_fffffffffffffffc;

void sub_8afb98(void)
{
    unsigned long long v5;  // x30
    unsigned short v6;  // x12
    unsigned short v15;  // x11
    unsigned short v16;  // x10
    unsigned int v17;  // w15
    unsigned int v18;  // w11
    unsigned int v19;  // w11
    unsigned short v20;  // x11
    unsigned long v21;  // x13
    unsigned long long v22;  // x14
    unsigned long long v23;  // x15
    unsigned long long v24;  // x16
    unsigned short v7;  // x13
    unsigned long v25;  // x15
    unsigned long long v26;  // x16
    unsigned long long v27;  // x17
    unsigned long v28;  // x1
    unsigned long long v29;  // x0
    unsigned long long v30;  // x17
    unsigned int v31;  // w17
    unsigned long v32;  // x0
    unsigned long long v33;  // x1
    unsigned long long v34;  // x9
    unsigned short v8;  // x12
    unsigned int v35;  // w0
    unsigned long long v36;  // x1
    unsigned long long v37;  // x9
    unsigned long long v38;  // x13
    unsigned long long v39;  // x1
    unsigned long long v40;  // x14
    unsigned long long v41;  // x15
    unsigned int v42;  // w10
    unsigned long long v43;  // x16
    unsigned long v44;  // x10
    unsigned short v9;  // x14
    unsigned long v45;  // x12
    unsigned long long v46;  // x17
    unsigned long long v47;  // x0
    unsigned long long v48;  // x9
    unsigned long long v49;  // x12
    unsigned long long v50;  // x9
    unsigned long long v51;  // x10
    unsigned long long v52;  // x9
    unsigned long long v53;  // x10
    unsigned long long v54;  // x11
    unsigned int v10;  // w14
    unsigned long long v55;  // x11
    unsigned long long v56;  // x9
    unsigned long long v57;  // x9
    unsigned long long v58;  // x11
    unsigned long v59;  // x12
    unsigned long long v60;  // x13
    unsigned long long v61;  // x8
    unsigned long long v62;  // x9
    unsigned long long v63;  // x12
    unsigned long long v64;  // x8
    unsigned int v11;  // w10
    unsigned long long v65;  // x9
    unsigned long long v66;  // x8
    unsigned short v12;  // x14
    unsigned short v13;  // x15
    unsigned short v14;  // x10
    st_8afb98_2 **v0;  // [bp-0x20], Other Possible Types: char
    st_8afb98_2 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    g_f0d198->field_60->field_100 = g_f0d198->field_60->field_100 & 0xfdffffffffffffff;
    v1 = &v0;
    v0 = &v1;
    v6 = g_f12784 | g_f04c40;
    v7 = -(g_f12784 & g_f04c40);
    v8 = g_f12786 + ~g_f04c42;
    v9 = -(g_f12786 | ~g_f04c42);
    v10 = -g_f12786;
    v11 = g_f12786 + g_f04c42 + (v10 & ~g_f04c42) * 2 + (g_f04c42 + (v10 | ~g_f04c42)) * 2 + 2;
    v12 = g_f12788 | g_f04c44;
    v13 = -g_f04c44;
    v14 = g_f04c44 - g_f12788;
    v15 = (v12 & v13) * 4 + (v12 ^ v13) * 2 | 1;
    v16 = (v15 ^ v14) + (v15 & v14) * 2 - 1;
    v17 = g_f1278a | g_f04c46;
    v18 = g_f1278a + g_f04c46;
    v19 = (v18 ^ -v17) + (v18 & -v17) * 2;
    v20 = (unsigned short)v17 + (unsigned short)v19 + (unsigned short)~v19 * 2 + 2;
    v21 = (v6 ^ v7) + ((g_f12784 ^ g_f04c40) - (v6 | v7)) * 2 & 0xffff;
    v22 = 59708 - v21 + ((v21 & ~0xffffffffff83e93c) * 2 | ~(59708 - v21)) + ((v21 & ~0xffffffffff83e93c) * 2 | 59708 - v21) + 1;
    v23 = 0x1ffffffffff82 + (~0xffffffffff83 | 0xffff) + 1;
    v24 = v23 + 0xffffffffffff + (0xffff000000000000 & ~v23) * 2 + (v23 + (0xffff000000000000 | ~v23)) * 2 + 2;
    v25 = v11 + ((v8 & v9) * 4 + (v8 ^ v9) * 2 | ~v11) + (v11 | (v8 & v9) * 4 + (v8 ^ v9) * 2) + 1 & 0xffff;
    v26 = v24 + v25 + ~v25 * 2 + (v25 & ~v24) * 4 + ((char *)&g_fffffffffffffffc + 3 ^ (v25 & ~v24) * 2) + 3;
    v27 = 0xffffffff + 0x2fffffffd + ~0xffffffff * 4 - 2 - (0xfffffffd + (unsigned int)~0xffffffff * 4 + 3 | 0xffffffffffff0000);
    v28 = v16;
    v29 = (v28 + ~v28 * 2 + 1 & v27 + 5) + v28;
    v30 = ((0xfffffffffffffffa - v27 | v28) ^ v27 + 6) + ((0xfffffffffffffffa - v27 | v28) & v27 + 6) * 2;
    v31 = (unsigned int)v29 + (unsigned int)v30 + ((unsigned int)(v29 - v30 - (v29 | -v30)) + ((unsigned int)-v30 & (unsigned int)~v29)) * 2;
    v32 = v20;
    v33 = 0xffff | v32;
    v34 = (0xffff + v32 ^ -v33) + (0xffff + v32 & -v33) * 2;
    v35 = (unsigned int)v34 + (unsigned int)v33 + ((unsigned int)-v34 & (unsigned int)~v33) * 2 + ((unsigned int)v33 + ((unsigned int)-v34 | (unsigned int)~v33)) * 2 + 2;
    v36 = ((unsigned int)v22 ^ 1) + ~(unsigned int)v22 * 2 + (__ROL__((unsigned int)v22, 1) & 2 & 3) & v21;
    v37 = v22 - v21;
    v38 = v36 * 2;
    v39 = v37 + v36 * 4 + 1;
    v40 = v39 + ~v38;
    v41 = v26 - v25 + (v26 - v25 - (v26 | ~v25) ^ ~v26 + v25) * 2 + (v26 - v25 - (v26 | ~v25) & ~v26 + v25) * 4;
    v42 = v16;
    v43 = v31 | v42;
    v44 = (v31 + v42 ^ -(unsigned int)v43) + (v31 + v42 & -(unsigned int)v43) * 2;
    v45 = (char *)&g_fffffffffffffffc + 3 ^ v41 * 0x10000;
    v46 = v41 * 0x20000;
    v47 = ~((v45 + v46 + 2 ^ v40) + (v45 + v46 + 2 & v40) * 2) + ((v45 + v46 + 2 ^ v40) + (v45 + v46 + 2 & v40) * 2) * 2;
    v48 = (v40 ^ 1) + (v38 - v39 + (v37 & 1)) * 2;
    v49 = (1 | v41 * 0x40000) - v46 + v45;
    v50 = ((v47 ^ 2) + (v47 * 2 & 4) - 1 ^ v48 - (v48 | v49)) + ((v47 ^ 2) + (v47 * 2 & 4) - 1 & v48 - (v48 | v49)) * 2;
    v51 = ((unsigned int)v43 + (-(unsigned int)v44 | ~(unsigned int)v43) + (-(unsigned int)v44 & ~(unsigned int)v43) + 1) * 0x200000000 + (v44 + v43) * 0x100000000;
    v52 = ((-v50 | ~v51) ^ v50) + v51 + ((-v50 | ~v51) & v50) * 2;
    v53 = (v20 + v35 + (-(v35 & v20) & ~(v35 | v20)) * 2 + ((v35 | v20) + (-(v35 & v20) | ~(v35 | v20))) * 2 + 3) * 0x1000000000000;
    v54 = (v52 ^ v53 + 0xffff000000000001) + (v52 & v53 + 0xffff000000000001) * 2 - 1;
    v55 = ~((v54 * 2 & 4) + (v54 ^ 2)) + ((v54 * 2 & 4) + (v54 ^ 2)) * 2;
    v56 = (v52 | -v53 ^ 0xffff000000000000) - (v53 + v52) + 0x1000000000000;
    v57 = ~((v55 ^ v56) + (v55 & v56) * 2) + ((v55 ^ v56) + (v55 & v56) * 2) * 2;
    v58 = -g_f04c48;
    v59 = &(&g_d250c8)[g_f04c48];
    v60 = -(13783240 | g_f04c48);
    v61 = &(&g_d250c8)[(g_f04c48 | ~&g_d250c8) + (13783240 ^ g_f04c48) + (v59 ^ v60) + 2 * (v59 & v60) + 1];
    v62 = (~v57 - (v58 | ~v57) ^ (v57 | v58)) + (v57 - g_f04c48 + (g_f04c48 - 1 & ~v57) + (~v57 - (v58 | ~v57) & (v57 | v58))) * 2 + 2;
    v63 = ~v61;
    v64 = (((v61 | v62) + v63) * 2 + 3 ^ v61 - v62) + (((v61 | v62) + v63) * 2 + 3 & v61 - v62) * 2;
    v65 = ((v61 + 1 + v63 * 2 | v62) + (v61 + 1 | ~(v61 + 1 + v63 * 2 | v62))) * 4 + ((v61 + 1 + v63 * 2 | v62) ^ v61 + 1) * 2 + 4;
    v66 = ((-v64 | v65) ^ v64) + ((-v64 | v65) & v64) * 2;
    (v66 + (v64 - 1 | v65 | ~v66) + (v66 | v64 - 1 | v65) + 1)();
}

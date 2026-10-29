/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e15dc..0x4e1f68 (2444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4e15dc_0 {
    char field_0;
} st_4e15dc_0;

extern unsigned short g_f04500;
extern unsigned short g_f04502;
extern unsigned short g_f04504;
extern unsigned short g_f04506;
extern unsigned long long g_f04508;
extern unsigned short g_f12050;
extern unsigned short g_f12052;
extern unsigned short g_f12054;
extern unsigned short g_f12056;

long long sub_4e15dc(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned short v12;  // x13
    unsigned int v13;  // w11
    unsigned long long v14;  // x13
    unsigned long v15;  // x14
    unsigned long long v16;  // x16
    unsigned long long v17;  // x15
    unsigned long long v18;  // x15
    unsigned long long v19;  // x13
    unsigned int v20;  // w13
    unsigned long long v21;  // x14
    st_4e15dc_0 *v4;  // x11
    unsigned long v22;  // x15
    unsigned long long v23;  // x16
    unsigned long long v24;  // x17
    unsigned long long v25;  // x15
    unsigned long long v26;  // x14
    unsigned long long v27;  // x15
    unsigned long long v28;  // x17
    unsigned long long v29;  // x14
    unsigned long long v30;  // x15
    unsigned long long v31;  // x15
    st_4e15dc_0 **v5;  // x12
    unsigned int v32;  // w14
    unsigned short v33;  // x16
    unsigned short v34;  // x14
    unsigned long long v35;  // x14
    unsigned long v36;  // x15
    unsigned long long v37;  // x17
    unsigned long long v38;  // x16
    unsigned long long v39;  // x14
    unsigned long long v40;  // x15
    unsigned long long v41;  // x0
    unsigned long long v6;  // x14
    unsigned long long v42;  // x17
    unsigned long long v43;  // x14
    unsigned long long v44;  // x14
    unsigned long long v45;  // x15
    unsigned long long v46;  // x14
    unsigned long long v47;  // x14
    unsigned long long v48;  // x17
    unsigned long long v49;  // x16
    unsigned int v50;  // w15
    unsigned long long v51;  // x16
    unsigned long long v7;  // x14
    unsigned long long v52;  // x17
    unsigned long long v53;  // x1
    unsigned long long v54;  // x2
    unsigned long long v55;  // x3
    unsigned long long v56;  // x0
    unsigned long long v57;  // x2
    unsigned long long v58;  // x16
    unsigned long long v59;  // x16
    unsigned long long v60;  // x16
    unsigned long long v61;  // x17
    unsigned long long v8;  // x11
    unsigned long long v62;  // x0
    unsigned long long v63;  // x2
    unsigned int v64;  // w12
    unsigned long v65;  // x15
    unsigned long long v66;  // x16
    unsigned long long v67;  // x17
    unsigned long long v68;  // x17
    unsigned long long v69;  // x14
    unsigned long long v70;  // x14
    unsigned long long v71;  // x15
    unsigned long long v9;  // x13
    unsigned long long v72;  // x14
    unsigned long long v73;  // x10
    char v74;  // x15
    unsigned int v75;  // w15
    unsigned int v76;  // w10
    unsigned short v77;  // x13
    unsigned int v78;  // w13
    unsigned int v79;  // w12
    unsigned int v80;  // w10
    unsigned int v81;  // w13
    unsigned long long v10;  // x11
    unsigned int v82;  // w12
    unsigned int v83;  // w13
    unsigned int v84;  // w10
    unsigned long v85;  // x8
    unsigned long long v86;  // x10
    unsigned int v11;  // w11
    st_4e15dc_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4e15dc_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04500 + ~(~&g_f04500 + &g_f04500));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v5 | v4;
    v7 = -((v5 + v4 ^ -v6) + (v5 + v4 & -v6) * 2);
    v8 = &v4[4 * (v6 & -v4)] - ((char *)v5 + ((~v5 & ~v4) + v6 * 2 + 1 ^ v7)) + ((v6 ^ -v4) - ((~v5 & ~v4) + v6 * 2 + (v7 | 0xfffffffffffffffe - ((~v5 & ~v4) + v6 * 2)))) * 2;
    v9 = v8 - 4;
    v10 = v8 - 3;
    v0 = v9 + (v9 & 0xff69) + (v10 ^ (0xff69 | ~v9)) + ((0xffffffff ^ (unsigned int)v9 * 2) & 0x1fed2) + (v10 & (0xff69 | ~v9)) * 2 + 0xffffffffffff0097;
    v1 = (v9 ^ 151) + (v10 + (151 | ~v9)) * 2 - 1;
    v11 = (unsigned int)v1 + v0;
    v12 = ((unsigned short)v11 + 1 ^ (unsigned short)v3) + ((unsigned short)v11 + 1 & (unsigned short)v3) * 2;
    v13 = ((unsigned int)~v3 & ~v11) + ((v11 & (unsigned int)~v3) + (unsigned int)v3) * 2 + 1;
    g_f12050 = (unsigned short)(v13 - v12) + (v12 + (unsigned short)~v13) * 2 + 1;
    v14 = v1;
    v15 = v0;
    v16 = v14 + 1;
    v17 = v16 + ~v14 * 2;
    v18 = ((v17 | v15) ^ v16) + ((v17 | v15) & v16) * 2;
    v19 = (v18 + v17 + v14 + (v15 | ~v17) + 1 + (0x7ffffffffffffffe - (v17 + v14 + (v15 | ~v17)) & -v18) * 2 + (v17 + v14 + (v15 | ~v17) + 1 - (v18 + (v17 + v14 + (v15 | ~v17) + 1 | -v18))) * 2 ^ (~(v15 | v14) - (-(v15 & v14) | ~(v15 | v14))) * 2 - ((v15 | v14) ^ -(v15 & v14))) + (v18 + v17 + v14 + (v15 | ~v17) + 1 + (0x7ffffffffffffffe - (v17 + v14 + (v15 | ~v17)) & -v18) * 2 + (v17 + v14 + (v15 | ~v17) + 1 - (v18 + (v17 + v14 + (v15 | ~v17) + 1 | -v18))) * 2 & (~(v15 | v14) - (-(v15 & v14) | ~(v15 | v14))) * 2 - ((v15 | v14) ^ -(v15 & v14))) * 2;
    v0 = v19 + (~(unsigned int)v19 | 0xfffffffffffffff6) + (v19 + 9 ^ -(v19 | 9)) + (v19 + 9 & -(v19 | 9)) * 2 + 10;
    v1 = v19 + 7;
    v20 = v3 >> ((char)v1 + v0 & 63);
    v21 = v1;
    v22 = v0;
    v23 = (-((v22 + v21 ^ -(v22 | v21)) + (v22 + v21 & -(v22 | v21)) * 2) ^ v21 + (v22 | ~v21) + (v22 ^ v21) + 1) + (-((v22 + v21 ^ -(v22 | v21)) + (v22 + v21 & -(v22 | v21)) * 2) & v21 + (v22 | ~v21) + (v22 ^ v21) + 1) * 2;
    v24 = v22 + ~v22 * 2 + 1;
    v25 = (v24 + v21 + ~(v24 | v21)) * 2;
    v26 = v22 - v21 + v25 + 2 + (0xfffffffffffffffd - v25 & v22 - v21) + (v25 + 2 | ~(v22 - v21));
    v27 = v26 + 1;
    v28 = v27 + ~v23 + (v23 | ~v26) * 2;
    v29 = ((v23 & ~v26) - (v23 - v27) & v23 - v27) * 4 + ((v23 & ~v26) - (v23 - v27) ^ v23 - v27) * 2 + v28 * 2 + (((v23 & ~v26) - (v23 - v27) & v23 - v27) * 4 + ((v23 & ~v26) - (v23 - v27) ^ v23 - v27) * 2 | 0xfffffffffffffffe - v28) + (0xfffffffffffffffe - v28 | ~(((v23 & ~v26) - (v23 - v27) & v23 - v27) * 4 + ((v23 & ~v26) - (v23 - v27) ^ v23 - v27) * 2));
    v30 = v29 + 4;
    v31 = ((v30 | 0xfffffffffffff6d1) + 2351 ^ -(0xfffffffffffff6d1 & ~v30)) + ((v30 | 0xfffffffffffff6d1) + 2351 & -(0xfffffffffffff6d1 & ~v30)) * 2;
    v0 = (v30 & 0xffffffffffff092e) + v29 + 5 + v29 + 5 + ~v30 * 2 - (v29 + 5 + ~v30 * 2 & 63185) + 126370;
    v1 = ~v31 + v31 * 2;
    v32 = (v0 + ~v0 * 2 ^ ~(v0 + ~v0 * 2 + 1 | (unsigned int)v1)) + ((unsigned int)v1 | v0) + ((v0 + ~v0 * 2 + 1 | (unsigned int)v1) & ~(v0 + ~v0 * 2)) * 2;
    v33 = (unsigned short)v20 + ((unsigned short)v32 + (unsigned short)~v32 * 2 + 1 | (unsigned short)~v20) + 1;
    v34 = -v32 - v33;
    g_f12052 = ((unsigned short)v32 + (unsigned short)v20 ^ v34) + (unsigned short)(v20 - v33 - (v32 + v20 | v34)) * 2;
    v35 = v1;
    v36 = v0;
    v37 = (v36 | ~(v35 + ~v35 * 2 + 1)) + v35 + ~v35 * 2 + 1;
    v38 = (v37 * 2 + 3 ^ v36 + v35 + (-v36 & ~v35) * 2 + (v35 - (v36 + (v35 | -v36))) * 2) + (v37 * 2 + 3 & v36 + v35 + (-v36 & ~v35) * 2 + (v35 - (v36 + (v35 | -v36))) * 2) * 2;
    v39 = ((v36 | v35) ^ -(v36 & v35)) + ((v36 | v35) + (-(v36 & v35) | ~(v36 | v35))) * 2;
    v40 = v39 + 3;
    v41 = v38 - 1;
    v42 = v40 - v38 + (v41 | 0xfffffffffffffffe - v39) * 2;
    v43 = (v41 | v39 + 1) - (v40 + v38) + 2;
    v44 = v42 + (v43 & v38) * 4 + (v43 ^ v38) * 2 + (v42 & ~((v43 & v38) * 4 + (v43 ^ v38) * 2)) + ((v43 & v38) * 4 + (v43 ^ v38) * 2 | ~v42);
    v45 = v44 + 1;
    v46 = (v44 + 2 ^ (19 | ~v45)) + (v44 + 2 & (19 | ~v45)) * 2;
    v0 = (v45 | 0xfffffffffffffffe) + (v45 + (v45 * 2 & 28) + (v45 * 2 & 28 ^ 28) - 14 | 1);
    v1 = (v46 ^ (v45 | 19) + 1) + (v46 & (v45 | 19) + 1) * 2 - 1;
    v47 = v0;
    v48 = v47 + 1;
    v49 = v48 + ~v47 * 2 | v1;
    v50 = v3 >> (((char)v1 | (char)v47) + ((char)v49 ^ (char)v48) + ((char)v49 & (char)v48) * 2 + ((char)v1 | (char)v47 | (char)~((v49 ^ v48) + (v49 & v48) * 2)) + (((char)v49 ^ (char)v48) + ((char)v49 & (char)v48) * 2 & (char)~(v1 | v47)) + 1 & 63);
    v51 = v1;
    v52 = v0;
    v53 = v52 + ~v52 * 2;
    v54 = v53 + 1;
    v55 = v51 + 1;
    v56 = 1 | (v51 + (0xffffffffffffffff ^ v51 * 2) & v52) * 2;
    v57 = v55 + v52 + v55 + ~v51 * 2 + (v54 & ~(v55 + ~v51 * 2));
    v58 = (v53 ^ ~(v51 - v52 + (v52 | ~v51))) + (v51 - v52 + (v52 | ~v51) & ~v53) * 2;
    v59 = v58 + v57 + (-v58 & ~v57) * 2 + (v57 + (-v58 | ~v57)) * 2 + 2;
    v60 = v59 + (v56 ^ v54 + v55) + ~v59 * 4 + (v59 + (v56 & v54 + v55)) * 2;
    v61 = v60 + 3;
    v62 = 0xfffffffffffffffc - v60;
    v63 = v60 + 4;
    v0 = v60 + ((v62 | 26093) + v63) * 2 + ((0xffffffff ^ (unsigned int)v61 * 2) & 52186) + 0xffffffffffff9a15;
    v1 = (v61 ^ 39444) + ((v62 | 39444) + v63) * 2 - 1;
    v64 = ((unsigned int)v1 & (unsigned int)v0) + ((unsigned int)v0 + ~(unsigned int)v0 * 2 + 1 & ~(unsigned int)v1) + ((unsigned int)v1 | (unsigned int)v0) * 2 + 1;
    g_f12054 = ((unsigned short)v64 + (unsigned short)v50 ^ (unsigned short)-(v64 | v50)) + (unsigned short)((v64 & v50) - (v64 + v50 | -(v64 | v50) & 0xffff)) * 2;
    v65 = v1;
    v66 = v0;
    v67 = (v65 ^ 1) + ~v65 * 2 + ((v65 * 2 | v65 >> 63) & 2 & 3);
    v68 = (((v66 + ~(v67 | v66) & v67 + 1) * 4 + (v66 + ~(v67 | v66) ^ v67 + 1) * 2 | 1) ^ (v65 ^ -v66) + (v65 + (-v66 | ~v65)) * 2 + 2) + (((v66 + ~(v67 | v66) & v67 + 1) * 4 + (v66 + ~(v67 | v66) ^ v67 + 1) * 2 | 1) & (v65 ^ -v66) + (v65 + (-v66 | ~v65)) * 2 + 2) * 2;
    v69 = (v66 + (0xffffffffffffffff ^ v66 * 2) + v65 & -(v66 + (0xffffffffffffffff ^ v66 * 2) | v65)) * 4 + (v66 + (0xffffffffffffffff ^ v66 * 2) + v65 ^ -(v66 + (0xffffffffffffffff ^ v66 * 2) | v65)) * 2 + ~((v66 + (0xffffffffffffffff ^ v66 * 2) + v65 & -(v66 + (0xffffffffffffffff ^ v66 * 2) | v65)) * 4 + (v66 + (0xffffffffffffffff ^ v66 * 2) + v65 ^ -(v66 + (0xffffffffffffffff ^ v66 * 2) | v65)) * 2) * 2 | 1;
    v70 = v69 - ((v66 ^ -v65) + (v66 + (-v65 | ~v66)) * 2 + 3) + ((v66 ^ -v65) + (v66 + (-v65 | ~v66)) * 2 + 3 + ~v69) * 2;
    v71 = v70 - v68 + (v68 + ~v70) * 2 & 0xfffffffffffffffe | v70 - v68 & 1;
    v72 = v71 + 2;
    v73 = 0xfffffffffffffffe - v71;
    v0 = v72 + ((v73 | 4) + v72) * 2 + (~((unsigned int)v72 * 2 - 2) & 8) - 6;
    v1 = v72 + (v73 | 0xffffffffffffffd2) + 45 + (v72 + (v73 & 0xffffffffffffffd2)) * 2 + (0xffffffffffffffd2 - (v72 + (v73 & 0xffffffffffffffd2)) | v72 + (v73 | 0xffffffffffffffd2) + 45) - (v72 + (v73 & 0xffffffffffffffd2) + 45 & v72 + (v73 | 0xffffffffffffffd2) + 45) + 91;
    v74 = ((char)v0 + (char)~v0 * 2 ^ (char)~(v0 + ~v0 * 2 + 1 | v1)) + (((char)v0 + (char)~v0 * 2 + 1 | (char)v1) & (char)~(v0 + ~v0 * 2)) * 2;
    g_f12056 = v3 >> ((v74 | (char)v1 | (char)v0) + (v74 & ((char)v1 | (char)v0)) & 63);
    v75 = g_f12050 | g_f04500;
    v76 = (g_f12050 + g_f04500 ^ -v75) + (g_f12050 + g_f04500 & -v75) * 2;
    g_f04500 = (unsigned short)v75 + (unsigned short)v76 + ((unsigned short)(v75 - v76 - (v75 | -v76)) + ((unsigned short)-v76 & (unsigned short)~v75)) * 2;
    v77 = -g_f12052;
    g_f04502 = (v77 ^ g_f04502) + ((unsigned short)(g_f04502 - g_f12052 - (v77 | g_f04502)) + (g_f12052 & ~g_f04502)) * 2;
    v78 = g_f12054 + 1;
    v79 = v78 + g_f04504 + (v78 + ~g_f12054 * 2 | ~g_f04504);
    v80 = g_f12054 & g_f04504;
    g_f04504 = (unsigned short)v79 + (unsigned short)v80 + ((unsigned short)(v79 - v80 - (v79 | -v80)) + ((unsigned short)-v80 & (unsigned short)~v79)) * 2;
    v81 = g_f12056 + 1;
    v82 = v81 + g_f04506 + (v81 + ~g_f12056 * 2 | ~g_f04506);
    v83 = g_f12056 + g_f04506;
    v84 = -(g_f12056 | g_f04506);
    g_f04506 = (unsigned short)v82 + ((unsigned short)v83 ^ (unsigned short)v84) + ((unsigned short)v83 & (unsigned short)v84) * 2 + ((unsigned short)v82 + ((unsigned short)-((v83 ^ v84) + (v83 & v84) * 2) | (unsigned short)~v82) + ((unsigned short)-((v83 ^ v84) + (v83 & v84) * 2) & (unsigned short)~v82)) * 2 + 2;
    v85 = g_f04508 - v3;
    v86 = (v3 - g_f04508 + (g_f04508 & ~v3)) * 2;
    g_f04508 = v85 + (v86 | ~v85) + (v86 | v85) + 1;
    return v66 ^ -v65;
}

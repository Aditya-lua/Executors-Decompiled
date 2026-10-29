/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5091fc..0x509a88 (2188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5091fc_0 {
    char field_0;
} st_5091fc_0;

extern unsigned short g_f045f0;
extern unsigned short g_f045f2;
extern unsigned short g_f045f4;
extern unsigned short g_f045f6;
extern unsigned long long g_f045f8;
extern unsigned short g_f120c8;
extern unsigned short g_f120ca;
extern unsigned short g_f120cc;
extern unsigned short g_f120ce;
extern unsigned int g_fffffffffffffffc;

long long sub_5091fc(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v13;  // x10
    unsigned long long v14;  // x11
    unsigned int v15;  // w12
    unsigned short v16;  // x11
    unsigned long long v17;  // x12
    unsigned long long v18;  // x13
    unsigned long long v19;  // x14
    unsigned long long v20;  // x12
    unsigned long long v21;  // x12
    unsigned long long v22;  // x12
    st_5091fc_0 *v5;  // x10
    unsigned long long v23;  // x13
    unsigned long long v24;  // x14
    unsigned long long v25;  // x16
    unsigned int v26;  // w12
    unsigned long v27;  // x13
    unsigned long long v28;  // x15
    unsigned long long v29;  // x17
    unsigned long long v30;  // x16
    unsigned long long v31;  // x0
    unsigned long long v32;  // x13
    st_5091fc_0 **v6;  // x11
    unsigned long long v33;  // x13
    unsigned long long v34;  // x14
    unsigned int v35;  // w13
    unsigned int v36;  // w14
    unsigned short v37;  // x12
    unsigned long v38;  // x13
    unsigned long v39;  // x14
    unsigned long long v40;  // x16
    unsigned long long v41;  // x17
    unsigned long long v42;  // x15
    st_5091fc_0 **v7;  // x12
    unsigned long long v43;  // x13
    unsigned long long v44;  // x13
    unsigned long long v45;  // x14
    unsigned long long v46;  // x15
    unsigned long long v47;  // x16
    unsigned long long v48;  // x13
    unsigned int v49;  // w13
    unsigned long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v52;  // x16
    unsigned long long v8;  // x13
    unsigned long long v53;  // x17
    unsigned long long v54;  // x14
    unsigned long long v55;  // x14
    unsigned long long v56;  // x15
    unsigned long long v57;  // x14
    unsigned long v58;  // x15
    unsigned long long v59;  // x16
    unsigned long long v60;  // x17
    unsigned long long v61;  // x16
    unsigned long long v62;  // x14
    unsigned long long v9;  // x15
    unsigned long long v63;  // x14
    unsigned long long v64;  // x15
    unsigned long long v65;  // x16
    unsigned short v66;  // x14
    unsigned int v67;  // w11
    unsigned int v68;  // w10
    unsigned short v69;  // x13
    unsigned short v70;  // x10
    unsigned short v71;  // x11
    unsigned short v72;  // x12
    unsigned long long v10;  // x14
    unsigned int v73;  // w13
    unsigned long long v74;  // x13
    unsigned long long v75;  // x11
    unsigned long long v76;  // x12
    unsigned long long v77;  // x11
    unsigned long long v11;  // x10
    unsigned long long v12;  // x10
    st_5091fc_0 **v1;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_5091fc_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v2 = &v1;
    v1 = &v2;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f045f0 + ~(~&g_f045f0 + &g_f045f0));
    v4 = ((v3 | v3 >> 29) ^ ~v3 - (v3 >> 29 | ~v3)) + ((v3 | v3 >> 29) & ~v3 - (v3 >> 29 | ~v3)) * 2;
    v5 = v2;
    v6 = v1;
    v7 = -v6;
    v8 = ~v5 * 2;
    v9 = v5 + v6 + 2;
    v10 = v9 + (v5 - v6 - (v5 | v7) + (v7 & ~v5) + (char *)&v5[v8 + 1] + (v6 | ~&v5[v8 + 1])) * 2;
    v11 = ((v6 | v5) & v7) * 4 + ((v6 | v5) ^ v7) * 2 | 1;
    v12 = (-((v11 ^ v9 + v8) + (v11 & v9 + v8) * 2) | 1) + ((v11 ^ v9 + v8) & 1);
    v13 = (((v12 + v10 & -(v10 | v12)) * 4 + (v12 + v10 ^ -(v10 | v12)) * 2 | 1) ^ ((v10 | v12) ^ ~v10 - (v12 | ~v10)) + ((v10 | v12) & ~v10 - (v12 | ~v10)) * 2) + (((v12 + v10 & -(v10 | v12)) * 4 + (v12 + v10 ^ -(v10 | v12)) * 2 | 1) & ((v10 | v12) ^ ~v10 - (v12 | ~v10)) + ((v10 | v12) & ~v10 - (v12 | ~v10)) * 2) * 2;
    v14 = v13 - 1;
    v1 = (v14 ^ 45243 | (char *)&g_fffffffffffffffc + 2) + ((v14 ^ 45243) + ((-v13 | 45243) + v13) * 2 | 1);
    v2 = (v13 + 20292 ^ -(v14 | 20293)) + (v14 | 20293) + (v13 + 20292 & -(v14 | 20293)) * 2;
    v15 = (unsigned int)v2 + (0xffffffff ^ (unsigned int)v2 * 2);
    v16 = (unsigned short)v15 + (unsigned short)v1 + ((unsigned short)-v15 & (unsigned short)~(unsigned int)v1) * 2 + ((unsigned short)v1 + ((unsigned short)-v15 | (unsigned short)~(unsigned int)v1)) * 2;
    g_f120c8 = ((unsigned short)v4 & (unsigned short)(0xfffffffe - v16)) + (v16 + 1 & (unsigned short)v4) + (v16 + 1 | (unsigned short)~v4) + 1;
    v17 = v2;
    v18 = v1;
    v19 = v18 + 1 + ~v18 * 2 + v18 + 1 + (v17 | ~(v18 + 1 + ~v18 * 2)) + ((v18 | v17) - 1 ^ v18 + v17) - (v18 + v17 & -(v18 | v17)) * 2;
    v20 = v17 + ~v17 * 2 + 1 & v18 | v17 & ~v18;
    v21 = (v20 + 1 + ~v20 * 2 | 1) + (v20 + 1 & 1);
    v22 = (((v21 + v19 + 1 & -(v19 + 1 | v21)) * 4 + (v21 + v19 + 1 ^ -(v19 + 1 | v21)) * 2 | 1) ^ v19 + 1 - v21 + (v21 & 0x7ffffffffffffffe - v19) * 2) + (((v21 + v19 + 1 & -(v19 + 1 | v21)) * 4 + (v21 + v19 + 1 ^ -(v19 + 1 | v21)) * 2 | 1) & v19 + 1 - v21 + (v21 & 0x7ffffffffffffffe - v19) * 2) * 2;
    v23 = v22 - 1;
    v24 = (v22 + 2 ^ -(v23 | 3)) + (v22 + 2 & -(v23 | 3)) * 2;
    v25 = -v22;
    v1 = (v24 | (v25 | 3) + v22 + (v23 ^ 3)) + (v24 & (v25 | 3) + v22 + (v23 ^ 3));
    v2 = (v23 ^ 14) + ((v25 | 14) + v22) * 2 - 1;
    v26 = v4 >> ((char)v2 + (char)v1 & 63);
    v27 = v2;
    v28 = v1;
    v29 = v28 + v27;
    v30 = v29 + ((v28 | v27) - v29 & ~(v28 | v27)) * 2 + ((v28 | v27) + ((v28 | v27) - v29 | ~(v28 | v27))) * 2 + 2;
    v31 = v28 * 3 + ~v28 * 4 + 3;
    v32 = v29 + (v28 - (v27 + (v28 | -v27))) * 2 + ((v31 & v27) - (v31 + v27) & v31 + v27) * 4 + (((v31 & v27) - (v31 + v27) ^ v31 + v27) + (-v27 & ~v28)) * 2;
    v33 = (v32 + 1 + ~v30 + (-v32 | v30) ^ (-v32 | v30)) + (v30 - (v32 + 1) + (v32 - 1 & ~v30) + (v32 + 1 + ~v30 + (-v32 | v30) & (-v32 | v30))) * 2 + 4;
    v34 = v33 * 2;
    v1 = v33 + (v34 & 130036) + (v34 & 130036 ^ 130036) + 0xffffffffffff0205;
    v2 = ((v33 & 518) + v33) * 2 - (v33 + (v34 | 0xfffffffffffffbf3)) - 519;
    v35 = v1 + ((unsigned int)v2 ^ 0xfffffffe) - ~(unsigned int)v2 * 2 - (__ROL__((unsigned int)v2, 1) & 2 & 3);
    v36 = v35 + 1;
    v37 = ~v26 - v35 - (v36 + ~v35 * 2 | v26 + ~v26 * 2 + 1);
    g_f120ca = ((unsigned short)~((v36 ^ v26) + (v36 & v26) * 2) + (((unsigned short)v36 ^ (unsigned short)v26) + ((unsigned short)v36 & (unsigned short)v26) * 2) * 2 ^ v37) + ((unsigned short)~((v36 ^ v26) + (v36 & v26) * 2) + (((unsigned short)v36 ^ (unsigned short)v26) + ((unsigned short)v36 & (unsigned short)v26) * 2) * 2 & v37) * 2;
    v38 = v2;
    v39 = v1;
    v40 = v39 - v38;
    v41 = -(v40 + (v38 | ~v39));
    v42 = v38 - v39 + (v39 + ~v38 ^ v41) * 2 + (v39 + ~v38 & v41) * 4;
    v43 = v40 + (v38 & ~v39) * 2;
    v44 = v42 + 1 + v43 + ((v42 + 1 + ~v42 * 2 | -v43) ^ v42 + 1) * 2 + ((v42 + 1 + ~v42 * 2 | -v43) & v42 + 1) * 4 + (v42 + 1 + ~v42 * 2 + (-v43 | ~(v42 + 1 + ~v42 * 2))) * 2;
    v45 = v44 + 2;
    v46 = ~v45 + v45 * 2;
    v47 = v46 * 2;
    v48 = (char *)&g_fffffffffffffffc - v44 + 2;
    v1 = v46 + ((v48 | 2) + v45) * 2 + (~(unsigned int)v47 & 4) - 3;
    v2 = v47 + ((unsigned int)v45 + (unsigned int)v48 * 2 & 31) + (0xffffffffffffffe0 & ~v46) + 32;
    v49 = v4 >> ((char)(v1 + (char)v2 * 2 + (v2 ^ (char *)&g_fffffffffffffffc + 2) - ((char)v2 * 2 & 2)) + 2 & 63);
    v50 = v2;
    v51 = v1;
    v52 = v50 + ~v50 * 2 + 1;
    v53 = v50 - v51 + ((v52 + v51 & -(v52 | v51)) * 4 + (v52 + v51 ^ -(v52 | v51)) * 2 | ~(v50 - v51)) + ((v52 + v51 & -(v52 | v51)) * 4 + (v52 + v51 ^ -(v52 | v51)) * 2 | v50 - v51);
    v54 = (v52 & v51) + v50 + (v51 + ~v51 * 2 ^ (v50 | ~v51)) - ((v50 | ~v51) & v51 + 1) * 2;
    v55 = (v53 + 1 ^ v54 + 1) + ((~(v53 + 1) | ~v54) & v53 + 2) * 4 + (((~(v53 + 1) | ~v54) ^ v53 + 2) + (v53 + 1 & v54 + 1)) * 2 + (v53 + 2 + ~(v53 + 1) * 2 + (~(v53 + 2 + ~(v53 + 1) * 2) | ~v54)) * 2;
    v56 = v55 + 2;
    v1 = (v56 | 1) + (v56 & 1) + 29501;
    v2 = (v55 + 36035 ^ -(v56 | 36033)) + (v56 | 36033) + (v55 + 36035 & -(v56 | 36033)) * 2;
    g_f120cc = (unsigned short)v49 + ((unsigned short)(((unsigned int)v2 + 1 ^ v1) + ((unsigned int)v2 + 1 & v1) * 2 - 1) | (unsigned short)~v49) + 1;
    v57 = v2;
    v58 = v1;
    v59 = (v58 + ~v58 * 2 + 1 & v57) + v58;
    v60 = -((v57 + ~v57 * 2 ^ ~(v57 + ~v57 * 2 + 1 | v58)) + ((v57 + ~v57 * 2 + 1 | v58) & ~(v57 + ~v57 * 2)) * 2);
    v61 = (v60 ^ v59) + (v59 + (v60 | ~v59)) * 2 + 2;
    v62 = (v58 | v57) - ((v58 | ~v57) + v57) + ((v58 | ~v57) + v57 - (v58 | v57)) * 2;
    v63 = v61 + (v62 | ~v61) + (v61 | v62);
    v64 = v63 + 1;
    v65 = v63 + 2;
    v1 = (v65 ^ 38) + (v64 + (0x7ffffffffffffffd - v63 | 38)) * 2 + 3;
    v2 = v64 + (v65 * 2 & 24) + (v65 * 2 & 24 ^ 24) - 12;
    g_f120ce = v4 >> ((char)v2 + v1 & 63);
    g_f045f0 = g_f045f0 - g_f120c8 + (g_f120c8 & ~g_f045f0) * 2;
    v66 = g_f045f2 | g_f120ca;
    v67 = g_f120ca & g_f045f2;
    g_f045f2 = (v66 ^ (unsigned short)-v67) + (unsigned short)(v66 - v67 - (v66 | -v67 & 0xffff)) * 2;
    v68 = (0xffffffff ^ g_f045f4 * 2) + g_f045f4;
    v69 = (unsigned short)v68 + g_f120cc;
    v70 = -(v68 | g_f120cc);
    v71 = g_f045f4 - g_f120cc;
    g_f045f4 = (v71 | (v69 & v70) * 4 + (v69 ^ v70) * 2) + ((v69 & v70) * 4 + (v69 ^ v70) * 2 & v71);
    v72 = g_f120ce + g_f045f6;
    v73 = g_f045f6 | g_f120ce;
    g_f045f6 = (unsigned short)(v72 - ((g_f120ce & g_f045f6) + (v72 & -v73) * 2)) + ((unsigned short)(v73 - 1) ^ v72) + 1;
    v74 = g_f045f8 * 2;
    v75 = v74 + ~g_f045f8 * 4 + (g_f045f8 ^ 1) + (v74 & 2);
    v76 = v75 + v4;
    v77 = (char *)&g_fffffffffffffffc - v76 - ((char *)&g_fffffffffffffffc - v75 + 1 | ~v4) + 1;
    g_f045f8 = g_f045f8 - (v4 + (v76 + 2 & v77) * 4 + (v76 + 2 ^ v77) * 2) + ((v76 + 2 & v77) * 4 + (v76 + 2 ^ v77) * 2) * 2;
    return v65 ^ 38;
}

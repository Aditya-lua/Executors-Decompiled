/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a4b54..0x4a551c (2504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a4b54_0 {
    char field_0;
} st_4a4b54_0;

extern unsigned short g_f04590;
extern unsigned short g_f04592;
extern unsigned short g_f04594;
extern unsigned short g_f04596;
extern unsigned long long g_f04598;
extern unsigned short g_f12098;
extern unsigned short g_f1209a;
extern unsigned short g_f1209c;
extern unsigned short g_f1209e;
extern unsigned int g_fffffffffffffffc;

int sub_4a4b54(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long v12;  // x12
    unsigned long long v13;  // x13
    unsigned long long v14;  // x14
    unsigned long long v15;  // x15
    unsigned long long v16;  // x0
    unsigned long long v17;  // x17
    unsigned long long v18;  // x16
    unsigned long long v19;  // x14
    unsigned long long v20;  // x14
    unsigned long long v21;  // x16
    st_4a4b54_0 *v4;  // x10
    unsigned long v22;  // x12
    unsigned long long v23;  // x15
    unsigned long long v24;  // x12
    unsigned long long v25;  // x12
    unsigned long long v26;  // x14
    unsigned long long v27;  // x15
    unsigned long long v28;  // x16
    unsigned long long v29;  // x17
    unsigned long long v30;  // x16
    unsigned int v31;  // w14
    st_4a4b54_0 **v5;  // x11
    unsigned long v32;  // x15
    unsigned long v33;  // x16
    unsigned long long v34;  // x17
    unsigned long long v35;  // x0
    unsigned long long v36;  // x16
    unsigned long long v37;  // x15
    unsigned long long v38;  // x15
    unsigned int v39;  // w16
    unsigned int v40;  // w15
    unsigned int v41;  // w15
    unsigned long long v6;  // x12
    unsigned int v42;  // w16
    unsigned long long v43;  // x15
    unsigned long long v44;  // x16
    unsigned long long v45;  // x17
    unsigned long long v46;  // x4
    unsigned long long v47;  // x0
    unsigned long long v48;  // x15
    unsigned long long v49;  // x16
    unsigned long long v50;  // x17
    unsigned long long v51;  // x15
    unsigned long long v7;  // x11
    unsigned long long v52;  // x17
    unsigned long long v53;  // x0
    unsigned long long v54;  // x1
    unsigned long long v55;  // x15
    unsigned long long v56;  // x15
    unsigned long long v57;  // x17
    unsigned int v58;  // w15
    unsigned long long v59;  // x17
    unsigned long v60;  // x0
    unsigned long long v61;  // x7
    unsigned long long v8;  // x11
    unsigned long long v62;  // x4
    unsigned long long v63;  // x2
    unsigned long long v64;  // x3
    unsigned long long v65;  // x0
    unsigned long long v66;  // x17
    unsigned long long v67;  // x0
    unsigned long long v68;  // x16
    unsigned long long v69;  // x17
    unsigned long long v70;  // x13
    unsigned int v71;  // w13
    unsigned long long v9;  // x12
    unsigned short v72;  // x15
    unsigned long long v73;  // x15
    unsigned long v74;  // x16
    unsigned long long v75;  // x0
    unsigned long long v76;  // x17
    unsigned long long v77;  // x10
    unsigned long long v78;  // x10
    unsigned long long v79;  // x10
    unsigned long long v80;  // x10
    unsigned long long v81;  // x15
    unsigned long long v10;  // x11
    unsigned short v82;  // x0
    unsigned int v83;  // w1
    unsigned int v84;  // w16
    unsigned int v85;  // w15
    unsigned int v86;  // w17
    unsigned int v87;  // w15
    unsigned short v88;  // x17
    unsigned short v89;  // x11
    unsigned short v90;  // x14
    unsigned short v91;  // x13
    unsigned int v11;  // w11
    unsigned int v92;  // w12
    unsigned int v93;  // w13
    unsigned int v94;  // w10
    unsigned int v95;  // w11
    st_4a4b54_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4a4b54_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04590 + ~(~&g_f04590 + &g_f04590));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v5 & ~v4;
    v7 = (char *)v5 + (v4 | ~v5) + (v5 ^ v4) + v6 - (char *)v5 + 1;
    v8 = v7 + ((char *)&g_fffffffffffffffc + 3 ^ v7 * 2) + (v4 - v5 + v6 * 2 - (v4 - v5 + v6 * 2 + (v5 & v4) | -(v5 & v4))) * 2 + (v4 - v5 + v6 * 2 + (v5 & v4) ^ -(v5 & v4)) + ((v4 - v5 + v6 * 2 + (v5 & v4) ^ ~-(v5 & v4)) - (v4 - v5 + v6 * 2 - (v4 - v5 + v6 * 2 + (v5 & v4) | -(v5 & v4))) * 2 | v7) + ((v4 - v5 + v6 * 2 - (v4 - v5 + v6 * 2 + (v5 & v4) | -(v5 & v4))) * 2 + (v4 - v5 + v6 * 2 + (v5 & v4) ^ -(v5 & v4)) & v7 + ((char *)&g_fffffffffffffffc + 3 ^ v7 * 2));
    v9 = v8 + 2;
    v10 = ((v8 + 3 + ~v9 * 2 | 62249) + v8 + 3 ^ (v9 | 62249) + 1) + ((v8 + 3 + ~v9 * 2 | 62249) + v8 + 3 & (v9 | 62249) + 1) * 2;
    v0 = ~v10 + v10 * 2;
    v1 = (v9 ^ 3287) + (6574 & v9 * 2) - 1;
    v11 = (unsigned int)((v0 & 0xffffffff) - v1) + ((unsigned int)v1 + 1 & ~(unsigned int)v0) * 2 + ((unsigned int)v0 + ((unsigned int)v1 + 1 | ~(unsigned int)v0)) * 2;
    g_f12098 = (unsigned int)((unsigned int)v3 * 2 - ((unsigned int)v3 | ~v11) - (v11 + (unsigned int)v3 * 2)) + (v11 + 0x8000 & (unsigned int)v3) * 2 - 1;
    v12 = v1;
    v13 = v0;
    v14 = v13 + v12;
    v15 = v14 + 1;
    v16 = v13 + 1;
    v17 = ~v13 * 2;
    v18 = (v16 + v17 | v12 + ~v12 * 2 + 1) + v15;
    v19 = (v14 ^ -(v13 | v12)) + (v14 & -(v13 | v12)) * 2;
    v20 = v18 + 1 + v19 + (-v19 & ~v18) * 2 + (v18 + 1 + (-v19 | ~v18)) * 2;
    v21 = v20 - 1;
    v22 = v15 + (v16 + (-v12 | ~v13) + (-v12 & ~v13)) * 2 + ((v13 + v17 + 1 + v12 & -(v13 + v17 + 1 | v12)) * 4 + (v13 + v17 + 1 + v12 ^ -(v13 + v17 + 1 | v12)) * 2 + ~((v13 + v17 + 1 + v12 & -(v13 + v17 + 1 | v12)) * 4 + (v13 + v17 + 1 + v12 ^ -(v13 + v17 + 1 | v12)) * 2) * 2 ^ (char *)&g_fffffffffffffffc + 2);
    v23 = 1 - v22;
    v24 = ((char *)&g_fffffffffffffffc + 3 ^ (v20 + v22 + (v23 | -v20)) * 2) + v22 + v21;
    v25 = v24 + 2 + (v21 & v23) * 2 + (v24 + 2 & ~((v21 & v23) * 2)) + ((char *)&g_fffffffffffffffc - v24 + 1 | (v21 & v23) * 2);
    v26 = v25 + 1;
    v27 = ~v26;
    v28 = v27 | 2;
    v29 = v25 + 2;
    v30 = v28 + v29 + (v26 ^ 2) + 1;
    v0 = (v30 ^ (v28 ^ v29) + (v28 & v29) * 2) + (v30 & (v28 ^ v29) + (v28 & v29) * 2) * 2 - 1;
    v1 = v26 + ((0xffffffff ^ (unsigned int)v26 * 2) & 30) + (v29 + (v27 | 15)) * 2 - 16;
    v31 = v3 >> ((char)v1 + v0 & 63);
    v32 = v1;
    v33 = v0;
    v34 = ((v32 ^ -v33) + (v32 + (-v33 | ~v32)) * 2 + 2 | ((v33 | v32) & -v32) * 4 + ((v33 | v32) ^ -v32) * 2) + ((v32 ^ -v33) + (v32 + (-v33 | ~v32)) * 2 + 2 & ((v33 | v32) & -v32) * 4 + ((v33 | v32) ^ -v32) * 2);
    v35 = (v33 ^ 1) + ~v33 * 2 + ((v33 * 2 | v33 >> 63) & 2 & 3);
    v36 = (v32 + ~(v35 | v32) & v35 + 1) * 4 + (v32 + ~(v35 | v32) ^ v35 + 1) * 2 | 1;
    v37 = ~((v36 ^ v33 - v32) + (v36 & v33 - v32) * 2) + ((v36 ^ v33 - v32) + (v36 & v33 - v32) * 2) * 2;
    v38 = (v37 + v34 + ((v37 - 1 & v34) - (v37 + v34)) * 2 | (v37 - (v37 - 1 & v34) & v34 - v37) * 4 + (v37 - (v37 - 1 & v34) ^ v34 - v37) * 2) + ((v37 - (v37 - 1 & v34) & v34 - v37) * 4 + (v37 - (v37 - 1 & v34) ^ v34 - v37) * 2 & v37 + v34 + ((v37 - 1 & v34) - (v37 + v34)) * 2);
    v0 = v38 + 22757;
    v1 = (~(unsigned int)v38 | 0xffffffffffff58e5) + (v38 ^ 0xffffffffffff58e5) + v38 * 2 + (~(unsigned int)v38 & 42778) + 42780;
    v39 = (unsigned int)v1 + ~(unsigned int)v1 * 2;
    v40 = v39 + (unsigned int)v0 + (~v39 & ~(unsigned int)v0) * 2 + ((unsigned int)v0 + (~v39 | ~(unsigned int)v0)) * 2 + 3;
    v41 = ~v40 + v40 * 2;
    v42 = v31 + (v41 | ~v31) + 1;
    g_f1209a = (unsigned short)v42 + ((unsigned short)v41 | (unsigned short)v31) + ((unsigned short)v41 | (unsigned short)v31) + ((unsigned short)(v42 - (v42 + (v41 | v31) | -(v41 | v31))) + ((unsigned short)-(v41 | v31) & (unsigned short)~(v42 + (v41 | v31)))) * 2;
    v43 = v1;
    v44 = v0;
    v45 = ~v43 * 2;
    v46 = v43 + 1;
    v47 = (v43 ^ -v44) + ((v44 | ~(v43 + v45 + 1)) & v43 + v45 + 2) * 4 + ((-v44 | ~v43) + v46 + ((v44 | ~(v43 + v45 + 1)) ^ v43 + v45 + 2)) * 2;
    v48 = v46 + v44 + v45 + (v43 & ~v44) * 2;
    v49 = v48 + 1;
    v50 = v48 - v47 + (v47 | ~v48) + (v47 & v48) - v49;
    v51 = v50 + (~(v47 - v49) - (v48 | ~v47) & v47 - v49) * 4 + (~(v47 - v49) - (v48 | ~v47) ^ v47 - v49) * 2 + ((~(v47 - v49) - (v48 | ~v47) & v47 - v49) * 4 + (~(v47 - v49) - (v48 | ~v47) ^ v47 - v49) * 2 | (char *)&g_fffffffffffffffc - v50 + 2) + (v50 + 1 & ~((~(v47 - v49) - (v48 | ~v47) & v47 - v49) * 4 + (~(v47 - v49) - (v48 | ~v47) ^ v47 - v49) * 2));
    v52 = v51 + 2;
    v53 = ~v52;
    v54 = (v51 + 3 + v53 * 2 | 29) + v51 + 3;
    v55 = ((v51 + 5 ^ -(v51 + 6 + (v53 | &g_fffffffffffffffc))) + (v51 + 5 & -(v51 + 6 + (v53 | &g_fffffffffffffffc))) * 2 ^ v51 + 6 & (v53 | &g_fffffffffffffffc)) + ((v51 + 5 ^ -(v51 + 6 + (v53 | &g_fffffffffffffffc))) + (v51 + 5 & -(v51 + 6 + (v53 | &g_fffffffffffffffc))) * 2 & v51 + 6 & (v53 | &g_fffffffffffffffc)) * 2;
    v0 = (v54 ^ (v52 | 29) + 1) + (v54 & (v52 | 29) + 1) * 2 - 1;
    v1 = ~v55 + v55 * 2;
    v56 = v1 | v0;
    v57 = (v1 + v0 ^ -v56) + (v1 + v0 & -v56) * 2;
    v58 = v3 >> ((char)v56 + (char)v57 + ((char)v57 & (char)~v56) + ((char)v56 | (char)~v57) + 1 & 63);
    v59 = v1;
    v60 = v0;
    v61 = v59 + 1;
    v62 = v61 + v60;
    v63 = v62 + ((v59 | v60) & -v59) * 4 + ((-v60 | ~v59) + v61 + (-v60 & ~v59) + ((v59 | v60) ^ -v59)) * 2;
    v64 = v63 - 1;
    v65 = (v60 ^ 1) + v60 * 2 + ~v60 * 4 + (v60 * 2 & 2) + 2;
    v66 = v62 + ~v59 * 2 + ~((v65 + v59 & -(v65 | v59)) * 4 + (v65 + v59 ^ -(v65 | v59)) * 2) + ((v65 + v59 & -(v65 | v59)) * 4 + (v65 + v59 ^ -(v65 | v59)) * 2) * 2;
    v67 = v66 + 2;
    v68 = (v67 ^ v64) + (v63 - v63 * 2 + ((char *)&g_fffffffffffffffc - v66 + 2 | ~(v63 - v63 * 2)) + (v67 & v64)) * 2 + 2;
    v69 = (v64 - v67 + (v66 + 1 & -v63)) * 2;
    v70 = ((char *)&g_fffffffffffffffc - v69 + 1 & v68) + v69 + 2 + (v69 + 2 & v68);
    v0 = (v70 ^ 1932) + (3864 & v70 * 2) - 1;
    v1 = (0xffffffffffff078c - (v70 & 0xffffffffffff078b) ^ v70 + 63604) + (v70 | 63604) + (0xffffffffffff078c - (v70 & 0xffffffffffff078b) & v70 + 63604) * 2;
    v71 = (unsigned int)(v0 + (unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 2;
    v72 = (unsigned short)((v58 ^ 0xfffffffe) + v58 * 2 - (v58 * 2 & 2)) + 3;
    g_f1209c = (unsigned short)(v71 + ~(v71 | v58) - v72) + ((unsigned short)(v71 - (v71 | v58)) + (v72 | (unsigned short)((v71 | v58) - v71)) + (v72 & (unsigned short)((v71 | v58) - v71))) * 2;
    v73 = v1;
    v74 = v0;
    v75 = v74 + ~v74 * 2 + 1;
    v76 = v73 + v75 + (v73 + v74 + ((char *)&g_fffffffffffffffc + 3 ^ v73 * 2) + ~(v73 + v74 + ((char *)&g_fffffffffffffffc + 3 ^ v73 * 2) + (v73 | ~v74))) * 2 + 1;
    v77 = ((char *)&g_fffffffffffffffc + 3 ^ (v75 & v73) * 2) + (v75 & v73) * 4 + 2;
    v78 = -((v77 ^ v74 - v73) + (v77 & v74 - v73) * 2);
    v79 = v76 + (v78 | ~v76) + (v78 | v76) + 1;
    v80 = v79 + (v79 | 1) + (~v79 | 1);
    v0 = v80 + 1 + ((v80 + 1) * 2 & 32) + ((v80 + 1) * 2 & 32 ^ 32) - 0x11;
    v1 = v80 + 0x22;
    v81 = v1 + ~v1 * 2 + 1;
    g_f1209e = v3 >> ((char)v0 + (char)v81 + (char)~v81 * 2 + 1 & 63);
    v82 = g_f12098 + g_f04590;
    v83 = g_f04590 | g_f12098;
    g_f04590 = (unsigned short)(g_f04590 - g_f12098 + (g_f12098 & g_f04590) + (g_f12098 & ~g_f04590) * 2 - (v82 & -v83) * 2) + ((unsigned short)(v83 - 1) ^ v82) + 1;
    v84 = g_f04592 + 1;
    v85 = v84 + ~g_f04592 * 2;
    v86 = v85 + g_f1209a;
    v87 = -(v85 | g_f1209a);
    v88 = -g_f1209a;
    v89 = g_f1209a + g_f04592 + (v88 & ~g_f04592) * 2 + ((v88 | ~g_f04592) + (unsigned short)v84) * 2;
    v90 = ((unsigned short)v86 & (unsigned short)v87) * 4 + ((unsigned short)v86 ^ (unsigned short)v87) * 2 | 1;
    g_f04592 = (v90 ^ v89) + (v90 & v89) * 2 - 1;
    v91 = g_f1209c - g_f04594 + (g_f04594 | ~g_f1209c);
    g_f04594 = (unsigned short)((v91 ^ (unsigned int)(0xfffe - g_f04594)) + (g_f1209c | g_f04594) - (v91 & g_f04594 + 1) * 2) + 1;
    v92 = (0xffffffff ^ g_f04596 * 2) + g_f04596 + g_f1209e;
    v93 = ~v92 - (g_f04596 | ~g_f1209e);
    v94 = g_f04596 - g_f1209e;
    v95 = (v93 & v92) * 4 + (v93 ^ v92) * 2 | 1;
    g_f04596 = (unsigned short)~((v95 ^ v94) + (v95 & v94) * 2) + (((unsigned short)v95 ^ (unsigned short)v94) + ((unsigned short)v95 & (unsigned short)v94) * 2) * 2;
    g_f04598 = g_f04598 - v3 + (v3 & ~g_f04598) * 2;
    return v86 ^ v87;
}

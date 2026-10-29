/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9412b8..0x941c64 (2476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9412b8_0 {
    char field_0;
} st_9412b8_0;

extern unsigned short g_f04af0;
extern unsigned short g_f04af2;
extern unsigned short g_f04af4;
extern unsigned short g_f04af6;
extern unsigned long long g_f04af8;
extern unsigned short g_f126dc;
extern unsigned short g_f126de;
extern unsigned short g_f126e0;
extern unsigned short g_f126e2;

int sub_9412b8(void)
{
    unsigned long long v2;  // x8
    st_9412b8_0 *v3;  // x10
    unsigned long long v12;  // x10
    unsigned int v13;  // w10
    unsigned long long v14;  // x12
    unsigned long v15;  // x14
    unsigned long long v16;  // x16
    unsigned long long v17;  // x15
    unsigned long long v18;  // x12
    unsigned long long v19;  // x12
    unsigned long long v20;  // x12
    unsigned long long v21;  // x13
    st_9412b8_0 **v4;  // x12
    unsigned long long v22;  // x15
    unsigned long long v23;  // x12
    unsigned long long v24;  // x13
    unsigned int v25;  // w12
    unsigned long v26;  // x13
    unsigned long long v27;  // x14
    unsigned long long v28;  // x16
    unsigned long long v29;  // x15
    unsigned long long v30;  // x15
    unsigned long long v31;  // x16
    unsigned long long v5;  // x13
    unsigned long long v32;  // x13
    unsigned long long v33;  // x13
    unsigned long long v34;  // x13
    unsigned long long v35;  // x14
    unsigned long v36;  // x13
    unsigned short v37;  // x13
    unsigned int v38;  // w14
    unsigned short v39;  // x15
    unsigned long long v40;  // x13
    unsigned long long v41;  // x14
    unsigned long long v6;  // x11
    unsigned long long v42;  // x15
    unsigned long long v43;  // x15
    unsigned long long v44;  // x16
    unsigned long long v45;  // x13
    unsigned long long v46;  // x0
    unsigned long long v47;  // x13
    unsigned long long v48;  // x13
    unsigned long long v49;  // x13
    unsigned long long v50;  // x13
    unsigned long long v51;  // x14
    st_9412b8_0 **v7;  // x17
    unsigned long long v52;  // x16
    unsigned long long v53;  // x13
    unsigned long long v54;  // x13
    unsigned long long v55;  // x14
    char v56;  // x15
    unsigned long v59;  // x14
    unsigned long long v60;  // x15
    unsigned long long v61;  // x17
    unsigned long long v8;  // x0
    unsigned long long v62;  // x14
    unsigned long long v63;  // x11
    unsigned long long v64;  // x15
    unsigned long long v65;  // x11
    unsigned long long v66;  // x11
    unsigned int v67;  // w14
    unsigned long long v68;  // x13
    unsigned long long v69;  // x14
    unsigned long long v70;  // x16
    unsigned long long v71;  // x15
    unsigned long long v9;  // x10
    unsigned long long v72;  // x17
    unsigned long long v73;  // x14
    unsigned long long v74;  // x13
    unsigned long long v75;  // x13
    unsigned int v76;  // w0
    unsigned short v77;  // x17
    unsigned int v78;  // w14
    unsigned int v79;  // w10
    unsigned short v80;  // x14
    unsigned short v81;  // x10
    unsigned long long v10;  // x12
    unsigned short v82;  // x11
    unsigned int v83;  // w12
    unsigned short v84;  // x13
    unsigned long long v85;  // x13
    unsigned long long v86;  // x11
    unsigned long long v87;  // x12
    unsigned long long v88;  // x11
    unsigned long v89;  // x8
    unsigned long long v90;  // x10
    unsigned long long v11;  // x10
    st_9412b8_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_9412b8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 3181857751740879910 + ((15264886328770642480 + ~15264886328770642480 * 2 + 1 & 28433066473) + 15264886311153123856) * 2;
    v3 = v1;
    v4 = v0;
    v5 = (v3 ^ 1) + ~v3 * 2 + ((v3 * 2 | v3 >> 63) & 2 & 3);
    v6 = (v3 ^ -v4) + &v3[-v4 | ~v3] * 2 + 2;
    v7 = (char *)v4 + 1;
    v8 = (char *)v7 + 0x2 * ~v4 | v3;
    v9 = &v3[-1 * (v8 ^ -0x1 * v4 + 0xfffffffffffffffe) + -1 * (v3 | ~v4) + 4 * ((char *)v4 + ~(v5 | v4) & v5 + 1) + 2 * ((char *)v4 + ~(v5 | v4) ^ v5 + 1) + 2 * (v8 & v7) + -2 * (v3 | v4) + (((char *)v4 + ~(v5 | v4) & v5 + 1) * 4 + ((char *)v4 + ~(v5 | v4) ^ v5 + 1) * 2 & v6) + (v6 & ~(((char *)v4 + ~(v5 | v4) & v5 + 1) * 4 + ((char *)v4 + ~(v5 | v4) ^ v5 + 1) * 2))];
    v10 = v9 - 2;
    v11 = v9 - 1;
    v12 = v10 + 49262 + ((unsigned int)v11 + (unsigned int)~v10 * 2 | 0xffffffffffff3f92);
    v0 = (v10 ^ 16275) + (v11 + (16275 | ~v10)) * 2 - 1;
    v1 = (v10 | 0xffffffffffff3f92) + v12 + (0xffffffffffff3f91 - (v10 | 0xffffffffffff3f92) | v12) + ((v10 | 0xffffffffffff3f92) + 49262 & ~v12) + 49263;
    v13 = (unsigned int)((v1 & 0xffffffff) + v0 * 3 - (v0 & ~(unsigned int)v1)) + ((unsigned int)v1 | ~v0) + (unsigned int)(((unsigned int)v1 & ~v0) - v1) * 2 + 1;
    g_f126dc = (unsigned short)v2 + ((unsigned short)v2 ^ (unsigned short)~v13) + ((unsigned short)v13 & (unsigned short)~v2) + 1;
    v14 = v1;
    v15 = v0;
    v16 = v14 + 1;
    v17 = v16 + ~v14 * 2 & v15;
    v18 = (v15 ^ -v14) + (v15 - (v14 + (v15 | -v14)) + (v14 & ~v15)) * 2;
    v19 = v16 - v15 + v17 * 4 + ~(v17 * 2) - v18 + (v18 | v17 * 2 - (v16 - v15 + v17 * 4)) + (v16 - v15 + v17 * 4 + ~(v17 * 2) & ~v18);
    v20 = (v19 * 2 & 4) + (v19 ^ 2);
    v21 = v20 - 1;
    v22 = (v20 ^ -(v21 | 1)) + (v20 & -(v21 | 1)) * 2;
    v23 = v21 - v20 * 2 - (v21 - v20 * 2 + 1 & 0xfffffffffffffffe) + v20;
    v0 = v20 + 14;
    v1 = v22 + (v23 | ~v22) + (v23 | v22) + 1;
    v24 = (v1 ^ 1) + ~v1 * 2 + ((v1 * 2 | v1 >> 63) & 2 & 3);
    v25 = v2 >> (((char)v24 + (char)v0 + ((char)v0 + ((char)-v24 | (char)~v0) + ((char)-v24 & (char)~v0)) * 2 + 2 | 1) + ((char)v24 + (char)v0 | 254) & 63);
    v26 = v1;
    v27 = v0;
    v28 = v26 * 2 + ~v26 * 4 + (v26 ^ 1) + (v26 * 2 & 2) + 2;
    v29 = (v26 ^ -v27) + (v26 - (v27 + (v26 | -v27))) * 2;
    v30 = v29 + ((v28 + v27 & -(v28 | v27)) * 4 + (v28 + v27 ^ -(v28 | v27)) * 2 | ~v29) + ((v28 + v27 & -(v28 | v27)) * 4 + (v28 + v27 ^ -(v28 | v27)) * 2 | v29) + 1;
    v31 = (v27 ^ 1) + ~v27 * 2 + ((v27 * 2 | v27 >> 63) & 2 & 3);
    v32 = ~(v27 - v26) - (((v31 + v26 - (v31 | v26)) * 2 | v27 - v26) + ((v31 + v26 - (v31 | v26)) * 2 | ~(v27 - v26)));
    v33 = (v30 + ~v30 * 2 + 1 | v32) + v30;
    v34 = (v33 * 2 + 3 ^ v30 ^ v32) + (v33 * 2 + 3 & (v30 ^ v32)) * 2;
    v35 = ~v34 + v34 * 2;
    v36 = (v35 | 1) + (1 & ~v34) + 26232;
    v0 = (v35 | 0xffffffffffff9987) + v36 + ~(v35 & 26232) + ((v35 | 0xffffffffffff9987) + 26233 & (v35 & 26232) - v36) + (0xffffffffffff9986 - (v35 | 0xffffffffffff9987) | v36 + ~(v35 & 26232)) + 26234;
    v1 = v35 + 39303;
    v37 = v0;
    v38 = v1;
    v39 = (unsigned short)(v38 - v37) + (v37 | (unsigned short)~v38);
    g_f126de = (unsigned short)v25 + ((v39 ^ v37 + 1) + ((unsigned short)v38 | v37) + (v39 & v37 + 1) * 2 | (unsigned short)~v25) + 1;
    v40 = v1;
    v41 = v0;
    v42 = v40 * 2 + ~v40 * 4 + (v40 ^ 1) + (v40 * 2 & 2) + 2;
    v43 = v40 - v41 + (v42 + v41 ^ -(v42 | v41)) * 2 + (v42 + v41 & -(v42 | v41)) * 4;
    v44 = v40 | v41;
    v45 = (v41 + ~v41 * 2 ^ ~(v41 + ~v41 * 2 + 1 | v40)) + ((v41 + ~v41 * 2 + 1 | v40) & ~(v41 + ~v41 * 2)) * 2;
    v46 = v45 + v44;
    v47 = v46 + (v44 - (v45 + (v44 | -v45)) + (-v45 & ~v44)) * 2;
    v48 = (v47 ^ 1) + ((v46 * 2 | v46 >> 63) & 2 & 3) + ~v47 * 2;
    v49 = v43 + v48 + (v48 | ~v43) + (v43 & ~v48) + 1;
    v50 = v49 + (v49 & 1) + (~(unsigned int)v49 | 0xfffffffffffffffe);
    v51 = v50 + 2;
    v52 = ((v51 | 0xfffffffffffffff9) + 7 ^ (v51 | 6) + 1) + ((v51 | 0xfffffffffffffff9) + 7 & (v51 | 6) + 1) * 2;
    v53 = ((~(unsigned int)v51 & 26) + (v51 ^ 0xffffffffffffffe5) ^ v50 + 3) + ((~(unsigned int)v51 & 26) + (v51 ^ 0xffffffffffffffe5) & v50 + 3) * 2;
    v0 = ~v52 + v52 * 2;
    v1 = v53 + (v51 | 26 | ~v53) + (v53 | v51 | 26) + 1;
    v54 = v0;
    v55 = (v1 ^ 1) + ~v1 * 2 + ((v1 * 2 | v1 >> 63) & 2 & 3);
    v56 = -v55;
    v59 = v1;
    v60 = v0;
    v61 = (v59 & ~v60) + ~v60 + (v60 & v59) + (v60 & ~v59) * 2;
    v62 = (v59 + ~v59 * 2 + 1 & v60) + v59 + ((v60 | v59) - 1 ^ v60 + v59) - (v60 + v59 & -(v60 | v59)) * 2;
    v63 = 0xfffffffffffffffe - v61;
    v64 = v61 + v62 + (v63 & ~v62) * 2 + 2;
    v65 = (~(v61 - v62) - (v62 | v63) & v61 - v62) * 4 + (~(v61 - v62) - (v62 | v63) ^ v61 - v62) * 2 | 1;
    v66 = ~((v65 ^ v64) + (v65 & v64) * 2) + ((v65 ^ v64) + (v65 & v64) * 2) * 2;
    v0 = v66 + 46031;
    v1 = (v66 + 19504 ^ -(v66 | 19504)) + (v66 | 19504) + (v66 + 19504 & -(v66 | 19504)) * 2;
    v67 = (unsigned int)((unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 3;
    g_f126e0 = (unsigned short)~v67 + (unsigned short)v0 + (((unsigned short)v67 & (unsigned short)~(unsigned int)v0) + ((unsigned short)v67 & (unsigned short)v0)) * 2 & (unsigned short)(v2 >> (((char)v55 + (char)v54 | 254) + ((char)v55 + (char)v54 + ((char)v54 + (v56 | (char)~v54) + (v56 & (char)~v54)) * 2 + 2 | 1) & 63));
    v68 = v1;
    v69 = v0;
    v70 = -v68;
    v71 = v68 - v69 + (((v69 | v68) & v70) * 4 + ((v69 | v68) ^ v70) * 2 | ~(v68 - v69)) + (((v69 | v68) & v70) * 4 + ((v69 | v68) ^ v70) * 2 | v68 - v69) + 1;
    v72 = (v69 ^ 1) + ~v69 * 2 + ((v69 * 2 | v69 >> 63) & 2 & 3);
    v73 = (v69 ^ v70) + (v69 + (v70 | ~v69)) * 2;
    v74 = (v68 + ~(v72 | v68) & v72 + 1) * 4 + (v68 + ~(v72 | v68) ^ v72 + 1) * 2 + v73 * 2 + ((v68 + ~(v72 | v68) & v72 + 1) * 4 + (v68 + ~(v72 | v68) ^ v72 + 1) * 2 | ~(v73 + 2)) + (~((v68 + ~(v72 | v68) & v72 + 1) * 4 + (v68 + ~(v72 | v68) ^ v72 + 1) * 2) | ~(v73 + 2));
    v75 = (v74 + 6 ^ v71) + (v71 & 0xfffffffffffffffa - v74) * 4 + (0xffffffffffffffff ^ (v71 & 0xfffffffffffffffa - v74) * 2) + (v74 + 6 & v71 | 0xfffffffffffffffa - v74 & ~v71) * 2;
    v0 = v75 + 29;
    v1 = (42 & (v75 + 1) * 2 & v75 + 1) + ((42 & (v75 + 1) * 2 | v75 + 1) ^ 21) - 1;
    g_f126e2 = v2 >> ((char)(v0 + (v1 & 0xff ^ 0xfffffffffffffffe) + (v1 & 0xff) * 4 - ((v1 & 0xff) * 2 + ((v1 & 0xff) * 2 & 2))) + 2 & 63);
    v76 = g_f04af0 + 1;
    v77 = (unsigned short)v76 + ~g_f04af0 * 2 | g_f126dc;
    g_f04af0 = (unsigned short)(v76 + g_f126dc + ~(g_f126dc | g_f04af0) + (g_f126dc ^ g_f04af0) + (v77 ^ (unsigned int)(0xfffe - g_f04af0)) - (v77 & v76) * 2) + 1;
    v78 = g_f126de | g_f04af2;
    v79 = g_f126de + g_f04af2 + (g_f04af2 + ~g_f04af2 * 2 + 1 & ~g_f126de);
    g_f04af2 = ((unsigned short)v79 ^ (unsigned short)~v78) + ((unsigned short)v78 & (unsigned short)~v79) * 2;
    v80 = -g_f126e0;
    v81 = g_f126e0 + g_f04af4 + (v80 & ~g_f04af4) * 2 + (g_f04af4 + (v80 | ~g_f04af4)) * 2 + 2;
    v82 = ((0xffff ^ g_f04af4 * 2) + g_f04af4 & g_f126e0) * 2;
    g_f04af4 = (v81 | v82) + (v81 & v82);
    v83 = g_f04af6 + ~g_f04af6 * 2;
    v84 = (unsigned short)~(v83 + 1 | g_f126e2) + g_f126e2;
    g_f04af6 = g_f04af6 - g_f126e2 + (v84 ^ (unsigned short)v83 + 2) * 2 + (v84 & (unsigned short)v83 + 2) * 4;
    v85 = g_f04af8 * 2;
    v86 = v85 + ~g_f04af8 * 4 + (g_f04af8 ^ 1) + (v85 & 2);
    v87 = v86 + 3;
    v88 = v2 - v87 + (v86 + 2 | ~v2) + 1;
    v89 = g_f04af8 - v2;
    v90 = (v88 & v87) * 4 + (v88 ^ v87) * 2 | 1;
    g_f04af8 = (v90 ^ v89) + (v90 & v89) * 2 - 1;
    return v76;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x437bd8..0x4385f4 (2588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_437bd8_0 {
    char field_0;
} st_437bd8_0;

extern unsigned short g_f04630;
extern unsigned short g_f04632;
extern unsigned short g_f04634;
extern unsigned short g_f04636;
extern unsigned long long g_f04638;
extern unsigned short g_f120e8;
extern unsigned short g_f120ea;
extern unsigned short g_f120ec;
extern unsigned short g_f120ee;

int sub_437bd8(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x14
    unsigned int v13;  // w10
    unsigned int v14;  // w10
    unsigned int v15;  // w13
    unsigned short v16;  // x13
    unsigned long v17;  // x13
    unsigned long v18;  // x15
    unsigned long long v19;  // x17
    unsigned long long v20;  // x16
    unsigned long long v21;  // x13
    st_437bd8_0 *v4;  // x10
    unsigned long long v22;  // x14
    unsigned long long v23;  // x13
    unsigned long long v24;  // x13
    unsigned long long v25;  // x16
    unsigned long long v26;  // x15
    unsigned long long v27;  // x17
    unsigned long long v28;  // x17
    unsigned long long v29;  // x13
    unsigned long long v30;  // x15
    unsigned int v31;  // w13
    st_437bd8_0 **v5;  // x11
    unsigned long v32;  // x15
    unsigned long v33;  // x16
    unsigned long long v34;  // x17
    unsigned long long v35;  // x0
    unsigned long long v36;  // x1
    unsigned long long v37;  // x0
    unsigned long long v38;  // x15
    unsigned long long v39;  // x16
    unsigned short v40;  // x15
    unsigned long v41;  // x15
    st_437bd8_0 *v6;  // x14
    unsigned long v42;  // x16
    unsigned long long v43;  // x17
    unsigned long long v44;  // x0
    unsigned long long v45;  // x2
    unsigned long long v46;  // x15
    unsigned long long v47;  // x15
    unsigned long long v48;  // x14
    unsigned long long v49;  // x14
    char v50;  // x15
    unsigned int v51;  // w14
    unsigned long long v7;  // x13
    unsigned long long v52;  // x12
    unsigned long long v53;  // x16
    unsigned long long v54;  // x15
    unsigned int v55;  // w15
    unsigned int v56;  // w12
    unsigned long long v57;  // x14
    unsigned long long v58;  // x15
    unsigned long long v59;  // x0
    unsigned long long v60;  // x17
    unsigned long long v61;  // x17
    unsigned long long v8;  // x12
    unsigned long long v62;  // x16
    unsigned long long v63;  // x17
    unsigned long long v64;  // x15
    unsigned long long v65;  // x14
    unsigned long long v66;  // x14
    unsigned int v67;  // w16
    unsigned short v68;  // x10
    unsigned short v69;  // x14
    unsigned short v70;  // x13
    unsigned short v71;  // x14
    unsigned long long v9;  // x10
    unsigned int v72;  // w10
    unsigned int v73;  // w14
    unsigned int v74;  // w13
    unsigned int v75;  // w14
    unsigned int v76;  // w10
    unsigned long v77;  // x12
    unsigned long long v78;  // x8
    unsigned int v79;  // w8
    unsigned int v80;  // w9
    unsigned int v81;  // w10
    unsigned long long v10;  // x10
    unsigned int v82;  // w12
    unsigned int v83;  // w8
    unsigned int v84;  // w10
    unsigned int v85;  // w9
    unsigned int v86;  // w12
    unsigned int v87;  // w13
    unsigned int v88;  // w8
    unsigned int v89;  // w9
    unsigned int v90;  // w8
    unsigned long long v11;  // x13
    st_437bd8_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_437bd8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04630 + ~(~&g_f04630 + &g_f04630));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 + 1;
    v7 = (v4 ^ -v5) + (v4 - v5 - (v4 | -v5) + ((char *)v6 + 0x2 * ~v4 + v5 ^ -((char *)v6 + 0x2 * ~v4 | v5))) * 2 + ((char *)v6 + 0x2 * ~v4 + v5 & -((char *)v6 + 0x2 * ~v4 | v5)) * 4;
    v8 = v5 * 2 + ~v5 * 4 + (v5 ^ 1) + (v5 * 2 & 2);
    v9 = v5 - v4 + ((char *)v6 - v8 + (v8 + 2 | ~v4) - 3 ^ v8 + 3) * 2 + ((char *)v6 - v8 + (v8 + 2 | ~v4) - 3 & v8 + 3) * 4;
    v10 = v7 + (v9 | ~v7) + v9 + (0xffffffffffffffff ^ v9 * 2) + (v9 + (0xffffffffffffffff ^ v9 * 2) & v7);
    v11 = v10 + 2;
    v12 = v11 * 2;
    v0 = (v10 + 1 | 0xfffffffffffffffe) + (v10 + 1 + (~(unsigned int)v12 & 40250) + (v10 + 1 + (0x7ffffffffffffffd - v10 | 20125)) * 2 + 0xffffffffffffb168 & 0xfffffffffffffffe) + 1;
    v1 = (v11 ^ 45412) + (v12 & 90824) - 1;
    v13 = ((unsigned int)v1 + 1 ^ v0) + (v0 + ((unsigned int)v1 + 1 | ~v0)) * 2 + 3;
    v14 = ~v13 + v13 * 2;
    v15 = v14 - 1;
    v16 = -(v15 | (unsigned int)v3);
    g_f120e8 = ((unsigned short)v15 + (unsigned short)v3 ^ v16) + ((unsigned short)v14 + (unsigned short)v3 + (v16 | (unsigned short)~(v15 + (unsigned int)v3))) * 2;
    v17 = v1;
    v18 = v0;
    v19 = (v17 + ~v17 * 2 + 1 | v18) + v17;
    v20 = v19 + (v18 | v17) + ((v18 | v17) & ~v19) * 2 + (~v19 & ~(v18 | v17)) * 2 + 1;
    v21 = v18 + v17 + (-v17 & ~v18) * 2 + (v18 - v17 - (v18 | -v17)) * 2;
    v22 = (0xffffffffffffffff ^ (v17 & ~v18) * 2) + (v17 & ~v18) * 4 + 2;
    v23 = 1 - ((v21 ^ v22) + (v21 & v22) * 2);
    v24 = ((v23 ^ v20) & 1) + (v23 ^ v20) + (v23 & v20) * 2 + (v23 ^ v20) + (v23 & v20) * 2 - ((v23 ^ v20) + (v23 & v20) * 2 - 1 | 1);
    v25 = v24 - 1;
    v26 = v24 + (-(unsigned int)v24 | 0xfffffffffffffff8);
    v27 = (0xfffffffffffffff9 - v26 ^ v24 + 6) + (0xfffffffffffffff9 - v26 & v24 + 6) * 2;
    v28 = (v24 + 8 ^ -(v25 | 9)) + (v24 + 8 & -(v25 | 9)) * 2;
    v29 = (v25 & 9) - (v24 + 9) + (v24 + 9 - (v25 & 9)) * 2;
    v0 = v26 + v27 + (v26 + 7 | ~v27) + (v27 & 0xfffffffffffffff8 - v26) + 8;
    v1 = (v28 ^ v29) + (v28 & v29) * 2 - 1;
    v30 = v1 * 2 + (v1 ^ 0xfffffffffffffffe) - (v1 * 2 & 2) + 3;
    v31 = v3 >> (v0 + (char)~v30 + ((char)v30 & ~v0) * 2 + (v0 + ((char)v30 | ~v0)) * 2 + 2 & 63);
    v32 = v1;
    v33 = v0;
    v34 = v33 + v32;
    v35 = v32 + ~v32 * 2;
    v36 = v34 + (v33 + ~v33 * 2 + 1 | v35 + 1) + 1;
    v37 = -((v35 ^ ~(v33 | ~v32)) + ((v33 | ~v32) & ~v35) * 2);
    v38 = (v36 ^ v37) - (((v33 | v32) - 1 ^ v34) + (v33 | v32)) + (v34 & -(v33 | v32)) * 2 + (v36 + (v37 | ~v36)) * 2 + 1;
    v39 = v38 * 2;
    v0 = v38 + (v39 & 88536) + (v39 & 88536 ^ 88536) + 0xffffffffffff5313;
    v1 = (v38 ^ 21269) + (v39 & 42538) - 1;
    v40 = ((unsigned short)v31 | (unsigned short)~((unsigned int)v1 + v0)) + (unsigned short)v1 + v0 + (unsigned short)(v31 - (v31 & (unsigned int)v1 + v0) * 2);
    g_f120ea = (unsigned short)(0xfffffffe - v40) + (unsigned short)~v31 + (((unsigned short)(0xfffffffe - v40) & (unsigned short)v31 + 1) + (v40 + 1 & (unsigned short)v31 + 1)) * 2;
    v41 = v1;
    v42 = v0;
    v43 = (v41 - v42 | (v41 + (0xffffffffffffffff ^ v41 * 2) + v42 & -(v41 + (0xffffffffffffffff ^ v41 * 2) | v42)) * 4 + (v41 + (0xffffffffffffffff ^ v41 * 2) + v42 ^ -(v41 + (0xffffffffffffffff ^ v41 * 2) | v42)) * 2) + ((v41 + (0xffffffffffffffff ^ v41 * 2) + v42 & -(v41 + (0xffffffffffffffff ^ v41 * 2) | v42)) * 4 + (v41 + (0xffffffffffffffff ^ v41 * 2) + v42 ^ -(v41 + (0xffffffffffffffff ^ v41 * 2) | v42)) * 2 & v41 - v42);
    v44 = v42 * 2;
    v45 = v42 + v41;
    v46 = v44 - (v45 + (v42 | ~v41));
    v47 = (((v46 & v45 + ~v44) * 4 + (v46 ^ v45 + ~v44) * 2 | 1) ^ v45 + ~v41 * 2 + 2) + (((v46 & v45 + ~v44) * 4 + (v46 ^ v45 + ~v44) * 2 | 1) & v45 + ~v41 * 2 + 2) * 2;
    v48 = (v47 + ~v43 + (1 - v47 | v43) ^ (1 - v47 | v43)) - (1 - v47 & v43) * 2 + (1 - v47 & v43) * 4 + (v47 + ~v43 + (1 - v47 | v43) & (1 - v47 | v43)) * 2;
    v49 = ((v48 + 28 ^ -(v48 | 28)) + (v48 + 28 & -(v48 | 28)) * 2 ^ (v48 | 28) + 1) + ((v48 + 28 ^ -(v48 | 28)) + (v48 + 28 & -(v48 | 28)) * 2 & (v48 | 28) + 1) * 2;
    v0 = v48 + 4;
    v1 = ~v49 + v49 * 2;
    v50 = (char)v1 + 1;
    v51 = v3 >> (((char)(v0 - v50) | 254) + ((char)(v0 - v50) + ((char)v0 + (v50 | (char)~v0) + (v50 & (char)~v0)) * 2 + 2 & 254) + 1 & 63);
    v52 = (0xffffffffffffffff ^ (v0 - v1 - (v0 | -v1)) * 2) + ((v0 | v1) & ~((v1 | ~v0) + v0)) * 2 - ((v1 | ~v0) + v0 ^ (v0 | v1)) - (v0 + v1 + (((v0 ^ 1) + ~v0 * 2 + ((v0 * 2 | v0 >> 63) & 2 & 3) & v1) + (-v1 & ~v0)) * 2);
    v53 = v52 + 1;
    v54 = v53 + ~v52 * 2 | 34464;
    v0 = (v54 ^ v53) + (v52 | 34464) + (v54 & v53) * 2;
    v1 = v52 + 31071;
    v55 = (unsigned int)((unsigned int)v1 * 2 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 & 2)) + 3;
    v56 = (v55 ^ (unsigned int)v0) + (v55 & (unsigned int)v0) * 2;
    g_f120ec = ((unsigned short)(v56 - 1) + (unsigned short)v51 ^ (unsigned short)-(v56 - 1 | v51)) + ((unsigned short)v56 + (unsigned short)v51 + ((unsigned short)-(v56 - 1 | v51) | (unsigned short)~(v56 - 1 + v51))) * 2;
    v57 = v1;
    v58 = v0;
    v59 = v57 + 1;
    v60 = v59 + ~v57 * 2 | v58;
    v61 = -((v60 ^ v59) + (v60 & v59) * 2);
    v62 = (v61 ^ (v58 | v57)) + (v61 & (v58 | v57)) * 2;
    v63 = v58 * 2 + ~v58 * 4 + (v58 ^ 1) + (v58 * 2 & 2) + 2;
    v64 = (v63 + v57 & -(v63 | v57)) * 4 + (v63 + v57 ^ -(v63 | v57)) * 2 | 1;
    v65 = ~((v64 ^ v58 - v57) + (v64 & v58 - v57) * 2) + ((v64 ^ v58 - v57) + (v64 & v58 - v57) * 2) * 2;
    v66 = ((v65 - 1 & v62) * 2 - (v62 + v65) | (v62 & -v65) * 2) + ((v65 - 1 & v62) * 2 - (v62 + v65) & (v62 & -v65) * 2);
    v0 = (v66 + 31 ^ -(v66 | 31)) + (v66 | 31) + (v66 + 31 & -(v66 | 31)) * 2;
    v1 = v66 + 1 + (v66 | 0x11) + (v66 + 1 + ~v66 * 2 | 0x11);
    g_f120ee = v3 >> ((char)v0 + 1 + ((char)v1 | (char)~v0) + ((char)v1 ^ (char)v0) + ((char)v1 + (char)~(v1 | v0) ^ (char)v0 + 1) + ((char)v1 + (char)~(v1 | v0) & (char)v0 + 1) * 2 & 63);
    v67 = (g_f04630 ^ 1) + ~g_f04630 * 2 + (__ROL__(g_f04630, 1) & 2 & 3);
    v68 = g_f04630 - g_f120e8;
    v69 = ((unsigned short)v67 + g_f120e8 + (unsigned short)~(v67 | g_f120e8)) * 2 + 3;
    g_f04630 = (v69 ^ v68) + (v69 & v68) * 2 - 1;
    g_f04632 = (unsigned short)((g_f04632 & ~g_f120ea) - g_f04632) + (g_f120ea | g_f04632);
    v70 = g_f120ec | g_f04634;
    v71 = -g_f04634;
    v72 = g_f04634 - g_f120ec;
    g_f04634 = (unsigned short)v72 + ((v70 & v71) * 4 + (v70 ^ v71) * 2 | (unsigned short)~v72) + ((v70 & v71) * 4 + (v70 ^ v71) * 2 | (unsigned short)v72) + 1;
    v73 = g_f120ee + 1;
    v74 = v73 + g_f04636 + (v73 + ~g_f120ee * 2 | ~g_f04636);
    v75 = g_f120ee + g_f04636;
    v76 = -(g_f120ee | g_f04636);
    g_f04636 = (unsigned short)v74 + ((unsigned short)v75 ^ (unsigned short)v76) + ((unsigned short)v75 & (unsigned short)v76) * 2 + ((unsigned short)v74 + ((unsigned short)-((v75 ^ v76) + (v75 & v76) * 2) | (unsigned short)~v74) + ((unsigned short)-((v75 ^ v76) + (v75 & v76) * 2) & (unsigned short)~v74)) * 2 + 2;
    v77 = g_f04638 + (v3 | ~g_f04638) + (g_f04638 ^ v3);
    v78 = (g_f04638 + ~g_f04638 * 2 + 1 | v3) + g_f04638;
    g_f04638 = v78 + v77 + 2 + (0xfffffffffffffffe - v77 & ~v78) * 2 + ((0xfffffffffffffffe - v77 | ~v78) + v77 + 2) * 2;
    v79 = v1;
    v80 = v0;
    v81 = ((v79 | v80) & ~((v80 | ~v79) + v79)) * 2 - ((v80 | ~v79) + v79 ^ (v79 | v80));
    v82 = v81 - 1;
    v83 = ((v79 | -v81) ^ v81) + ((v79 | -v81) & v81) * 2 + (v82 | v79) + (-(((v79 | -v81) ^ v81) + ((v79 | -v81) & v81) * 2) & ~(v82 | v79)) * 2 + ((v82 | v79) + (-(((v79 | -v81) ^ v81) + ((v79 | -v81) & v81) * 2) | ~(v82 | v79))) * 2;
    v84 = v83 + 2;
    v85 = ((v82 | v80) - 1 ^ v82 + v80) - (v82 + v80 & -(v82 | v80)) * 2 + (v82 | v80);
    v86 = v85 + 1;
    v87 = v84 | v86;
    v88 = (v85 ^ ~v84) + (v87 & (unsigned int)(0xfffffffe - v83)) * 4 + ((v84 & ~v85) + (v87 ^ (unsigned int)(0xfffffffe - v83))) * 2;
    v89 = ((v86 | ~v84) + v84 ^ ~v87) + (v87 & ~((v86 | ~v84) + v84)) * 2;
    v90 = (v89 | ~v88) + v88 * 2 + v89 + (0xffffffff ^ v89 * 2) + (v89 + (0xffffffff ^ v89 * 2) | ~v88) + 2;
    return (v90 ^ 2) + (v90 * 2 & 4) - 1;
}

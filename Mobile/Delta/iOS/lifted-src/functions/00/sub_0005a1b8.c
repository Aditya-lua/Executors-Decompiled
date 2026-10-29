/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5a1b8..0x5a954 (1948 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5a1b8_0 {
    char field_0;
} st_5a1b8_0;

extern unsigned long long g_e69350;
extern char _NSHomeDirectory;

unsigned int sub_5a1b8(unsigned long a0, void* a1)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w10
    unsigned int v14;  // w16
    unsigned int v104;  // w9
    unsigned int v105;  // w10
    unsigned int v107;  // w8
    unsigned long long v108;  // x9
    unsigned long long v109;  // x8
    unsigned int v15;  // w17
    unsigned int v16;  // w14
    unsigned int v17;  // w16
    unsigned int v18;  // w14
    unsigned int v19;  // w16
    unsigned int v20;  // w11
    unsigned int v21;  // w10
    unsigned int v22;  // w9
    unsigned int v23;  // w9
    unsigned int v6;  // w9
    unsigned int v24;  // w10
    unsigned int v25;  // w11
    unsigned int v26;  // w9
    unsigned int v27;  // w9
    unsigned int v28;  // w10
    unsigned int v29;  // w11
    unsigned int v30;  // w12
    unsigned int v31;  // w13
    unsigned int v32;  // w8
    unsigned int v33;  // w11
    unsigned int v7;  // w10
    unsigned int v34;  // w12
    unsigned int v35;  // w8
    unsigned int v36;  // w11
    unsigned int v37;  // w8
    unsigned int v38;  // w11
    unsigned int v39;  // w12
    unsigned int v40;  // w13
    unsigned int v42;  // w8
    unsigned int v8;  // w11
    unsigned int v44;  // w1
    unsigned int v45;  // w9
    unsigned int v46;  // w10
    unsigned int v47;  // w8
    unsigned int v48;  // w11
    unsigned int v49;  // w8
    unsigned int v50;  // w12
    unsigned int v51;  // w8
    unsigned int v52;  // w14
    unsigned int v53;  // w11
    unsigned int v9;  // w12
    unsigned int v54;  // w12
    unsigned int v55;  // w8
    unsigned int v56;  // w8
    unsigned int v57;  // w11
    unsigned int v58;  // w9
    unsigned int v59;  // w10
    unsigned int v60;  // w9
    unsigned int v61;  // w14
    unsigned int v62;  // w13
    unsigned int v63;  // w9
    unsigned int v10;  // w13
    unsigned int v64;  // w9
    unsigned int v65;  // w10
    unsigned int v66;  // w10
    unsigned int v67;  // w11
    unsigned int v68;  // w10
    unsigned int v69;  // w11
    unsigned int v70;  // w9
    unsigned int v71;  // w13
    unsigned int v72;  // w13
    unsigned int v73;  // w9
    unsigned int v11;  // w15
    unsigned int v74;  // w9
    unsigned int v75;  // w10
    unsigned int v76;  // w9
    unsigned int v77;  // w9
    unsigned int v78;  // w11
    unsigned int v79;  // w12
    unsigned int v80;  // w8
    unsigned int v81;  // w9
    unsigned int v82;  // w9
    unsigned int v83;  // w10
    unsigned int v12;  // w14
    unsigned int v84;  // w8
    unsigned int v85;  // w10
    unsigned int v86;  // w11
    unsigned int v87;  // w12
    unsigned int v88;  // w15
    unsigned int v89;  // w16
    unsigned int v90;  // w13
    unsigned int v91;  // w13
    unsigned int v92;  // w9
    unsigned int v93;  // w14
    unsigned int v13;  // w14
    unsigned int v94;  // w10
    unsigned int v95;  // w11
    unsigned int v96;  // w9
    unsigned int v97;  // w10
    unsigned int v98;  // w12
    unsigned int v99;  // w11
    unsigned int v100;  // w9
    unsigned int v101;  // w9
    unsigned int v102;  // w10
    unsigned int v103;  // w12
    st_5a1b8_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_5a1b8_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *(char *)a1;
    v5 = v4 * 2;
    v6 = ~((((v4 ^ 1) + (v5 & 2) - 1) * 2 & 4) + ((v4 ^ 1) + (v5 & 2) - 1 ^ 2)) + ((((v4 ^ 1) + (v5 & 2) - 1) * 2 & 4) + ((v4 ^ 1) + (v5 & 2) - 1 ^ 2)) * 2;
    v7 = (0xffffffff ^ v4 * 4) + v5;
    v8 = v6 ^ v7;
    v9 = v6 & v7;
    v10 = v8 + v9 * 2;
    v11 = v10 * 2;
    v12 = v11 + ~v10 + (-v10 | 0xfffffffd) + 3;
    v13 = (v10 - 1 | 0xfffffffd) + v12 + ((unsigned int)(0xfffffffc - (v10 - 1 | 0xfffffffd)) | v12) + ((v10 - 1 | 0xfffffffd) + 3 & ~v12);
    v14 = v13 + 4;
    v15 = ~v14 * 2;
    v16 = ((v13 + 5 + v15 ^ 1) + (v13 + 5 & 1) ^ -(v13 + 5 + v15)) + ((v13 + 5 + v15 ^ 1) + (v13 + 5 & 1) & -(v13 + 5 + v15)) * 2;
    v17 = v14 + v15 + v14 + ((unsigned int)(0xfffffffe - (v15 + v14)) | 1) + 2;
    v18 = v17 + v16 + (v16 & ~v17) + (v17 | ~v16);
    v19 = v18 + 1;
    v20 = v8 + ((v10 + 1 - v11 ^ 1) + (__ROL__(v10 + 1, 1) & 2 & 3) + v9) * 2;
    v21 = v20 - 3;
    v22 = v21 + (v6 ^ ~v7) * 2 | 0xfffffffd;
    v23 = v20 - 4 + (0xfffffffa & ~((v20 - 4) * 2)) + (v22 ^ v21) + (v22 & v21) * 2 + 3;
    v24 = v18 + 2;
    v25 = v24 + ~v19 * 2 | v23;
    v26 = v24 + v23 - (v19 & v23);
    v27 = ((v25 ^ v24) + (v25 & v24) * 2 ^ v26) + ((v25 ^ v24) + (v25 & v24) * 2 & v26) * 2;
    v28 = v27 - 1;
    v29 = ~v4;
    v30 = v4 + 1;
    v31 = (0xffffffff ^ (v30 + v29 * 2) * 2) + (v30 + v29 * 2) * 4 + 2;
    v32 = v4 + (v4 & 1) + (v29 | 0xfffffffe);
    v33 = v32 + 2;
    v34 = ((0x3ffffffe & ~((v31 ^ v30) + (v31 & v30) * 2 - 2)) + (v31 ^ v30) + (v31 & v30) * 2) * 4 + (((v31 ^ v30) + (v31 & v30) * 2 - 2 | 1) - ((v31 ^ v30) & 1)) * 2;
    v35 = ((v34 | ~v33) ^ v32 + 3) + ((v34 | ~v33) & v32 + 3) * 2;
    v36 = v33 - v34 + (v34 & ~v33) * 2 + (v34 & v33);
    v37 = v36 + v35 + (v35 & ~v36) + (v36 | ~v35);
    v38 = v37 + 1;
    v39 = (1 & ~v38) + (~v38 | 1);
    v40 = v28 | v39;
    v42 = (unsigned int)((v28 | v37) - (v38 + v27)) + 1;
    if (((unsigned int)(v40 - (v39 + v27)) + 1 ^ v40) + ((unsigned int)(v40 - (v39 + v27)) + 1 & v40) * 2 - ((0xffffffff ^ (v27 - v27 * 2 - 1 ^ v42) * 2) + (-(v27 - v27 * 2) & v42) * 4) + ((0xffffffff ^ (v27 - v27 * 2 - 1 ^ v42) * 2) + (-(v27 - v27 * 2) & v42) * 4 & ((unsigned int)(v40 - (v39 + v27)) + 1 ^ v40) + ((unsigned int)(v40 - (v39 + v27)) + 1 & v40) * 2) * 2 + ((0xffffffff ^ (v27 - v27 * 2 - 1 ^ v42) * 2) + (-(v27 - v27 * 2) & v42) * 4 & ~(((unsigned int)(v40 - (v39 + v27)) + 1 ^ v40) + ((unsigned int)(v40 - (v39 + v27)) + 1 & v40) * 2)) * 2 != 1)
        return v16 & ~v17;
    v44 = *(long long *)a1;
    v45 = (char)v44;
    v46 = (long long)(v44 * &_NSHomeDirectory) >> 31 & 0xfffffe00 | (v44 * 2 | v44 >> 31) & 0x1fe & 0x1ff;
    v47 = ((~((v46 & 6) + (v45 ^ 3)) + ((v46 & 6) + (v45 ^ 3)) * 2) * 2 & 4) + (~((v46 & 6) + (v45 ^ 3)) + ((v46 & 6) + (v45 ^ 3)) * 2 ^ 2);
    v48 = -v47;
    v49 = v47 * 4 + ~v47 * 2 | 1;
    v50 = v49 ^ v48;
    v51 = v50 + (v49 & v48) * 2;
    v52 = v51 * 2;
    v53 = (unsigned int)((v51 - 1 ^ 0xfffffffe) + v52 - (__ROL__(v51 - 1, 1) & 2 & 3)) + v51 + 1 - v52 + (v51 + 1 | 0xfffffffe);
    v54 = -(v52 & 0xfffffffe | v50 & 1) - ((unsigned int)(1 - v52) & 0xfffffffd);
    v55 = (~((v52 & 4) + (v51 ^ 2)) + ((v52 & 4) + (v51 ^ 2)) * 2 ^ v54) + (~((v52 & 4) + (v51 ^ 2)) + ((v52 & 4) + (v51 ^ 2)) * 2 & v54) * 2;
    v56 = (v53 + 1 - v55 + 1 + (v53 + 1 + ((unsigned int)(0x7ffffffd - v53) | v55) + ((unsigned int)(0x7ffffffd - v53) & v55)) * 2 + 4 | 1) + (v53 + 1 - v55 + 1 & 1) - 2;
    v57 = (1 & ~v44) + (v46 + ~v45 ^ 1) - (v46 + ~v45 | 1);
    v58 = v46 + (v45 ^ 0xfffffffe) - (v46 & 2);
    v59 = v58 + 2;
    v60 = v58 + 1;
    v61 = -v57;
    v62 = -v57 - (v61 | (unsigned int)(0xfffffffe - v58));
    v63 = 1 | (v57 - v59 + (v60 & v61)) * 2;
    v64 = (((v57 - 1 & v60) - v59 ^ v62) + ((v57 - 1 & v60) - v59 & v62) * 2 ^ v63) + (((v57 - 1 & v60) - v59 ^ v62) + ((v57 - 1 & v60) - v59 & v62) * 2 & v63) * 2;
    v65 = v64 + 3;
    v66 = v64 + (v65 | 0xfffffffd) - 3;
    v67 = v66 + (2 & ~v65);
    v68 = (v67 ^ 0xfffffffe) + v67 + (1 & ~v66);
    v69 = v67 + (v67 ^ 1) + (0xfffffffe & ~v67) + 2;
    v70 = v64 - v64 * 2 + (v64 & v64 * 2 - 1) + (-(v64 * 2) | ~v64) + 1;
    v71 = v70 + (v70 | 2) + (~v70 | 2) + 1;
    v72 = v71 + (v71 & 1) + (~v71 | 0xfffffffe) + 2;
    v73 = v70 + (0xffffffff ^ v70 * 2) | 0xfffffffd;
    v74 = v72 + (v73 | ~v72) + (v72 | v73) + 1;
    v75 = v68 + ((unsigned int)(0xfffffffe - v68) | v69) + (v68 + 1 | v69) + 2;
    v76 = (v75 | ~v74) + v74 + (v75 | v74);
    v77 = v76 + ~v76 * 2;
    v78 = v56 - v77;
    v79 = v78 + (v77 - 1 | ~v56);
    v80 = (v79 + 1 ^ v77 - v56 + (v56 | -v77)) + (v79 + 1 & v77 - v56 + (v56 | -v77)) * 2;
    v81 = (v78 & ~v79) * 4 + (v79 ^ ~v78) * 2;
    v82 = v80 + (v81 | ~v80) + (v80 | v81) + 1;
    v83 = v82 ^ 1;
    v84 = v83 + (__ROL__(v82, 1) & 2 & 3) + ~v82 * 4 + v82 * 4 + 2;
    *(char *)a1 = v84;
    v85 = v83 & 1;
    v86 = (char)v84;
    v87 = __ROL__(v84, 1) & 2 & 3;
    v88 = v86 + 1;
    v89 = (v88 ^ -(v86 | 1)) + (v88 & -(v86 | 1)) * 2;
    v90 = (v87 ^ 2) + v86 + (v89 | -((v87 ^ 2) + v86)) + (v89 | (v87 ^ 2) + v86 - 1);
    v91 = (v90 ^ 0xfffffffe) + v85 - v90 * 2 + v90 * 4 - (v90 * 2 & 2);
    v92 = (v82 & 1) + v88 + v89 + ~v89 * 2;
    v93 = v92 + 1;
    v94 = (unsigned int)((v86 ^ 1) + v87 - v86) + v85;
    v95 = v93 - v94;
    v96 = v95 + (((unsigned int)(0x7ffffffe - v92) & v94) + (v93 & v94)) * 2;
    v97 = ~v96;
    v98 = v97 + v96 * 2;
    v99 = ((v95 * 2 | v95 >> 31) & 2 & 3) + v98 + ((-v96 | 1) + v96) * 2 - 1;
    v100 = ((v98 ^ 1) + ((v97 * 2 | v97 >> 31) & 2 & 3)) * 2 - v96 * 4 | 1;
    v101 = (v100 ^ v99) + (v100 & v99) * 2;
    v102 = v101 - 1;
    v103 = v91 + 2;
    v104 = (v102 + v103 ^ -v102 - (v103 & -v101)) + (v102 + v103 & -v102 - (v103 & -v101)) * 2;
    v105 = v91 + (v102 | (unsigned int)(0xfffffffd - v91)) + (v102 ^ v103) + 3;
    if (v104 + (v105 | ~v104) + (v104 | v105) + 1 + (~((v104 + (v105 | ~v104) + (v104 | v105) + 1) * 2) & 4) + (v104 + (v105 | ~v104) + (v104 | v105) + 1 + (~(v104 + (v105 | ~v104) + (v104 | v105) + 1) | 2)) * 2 == 1)
        v107 = 0;
    else
        v107 = (long long)(v84 * &_NSHomeDirectory) >> 31 & 0xffffffc0 | __ROL__(v84, 30) & 0xc000003f & 63;
    if (!v107)
        v108 = 80;
    else
        v108 = 8;
    if ((v107 & 0xfffffffc) == 4)
        v108 = 40;
    if (v107 == 10)
        v109 = 24;
    else
        v109 = v108;
    goto *((void *)(*(long long *)((char *)&g_e69350 + v109)));
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0ab18..0xa0b134 (1564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a0ab18(void* a0)
{
    unsigned long v0;  // x9
    unsigned long v1;  // x11
    unsigned long v10;  // x9
    unsigned long long v100;  // x9
    unsigned long long v101;  // x10
    unsigned long long v102;  // x9
    unsigned long long v103;  // x11
    long long v104;  // x9
    unsigned long long v105;  // x10
    unsigned long long v11;  // x6
    unsigned long v12;  // x20
    unsigned long v13;  // x9
    unsigned long v14;  // x23
    unsigned long long v15;  // x9
    unsigned int v16;  // w25
    unsigned long v17;  // x9
    unsigned int v18;  // w26
    unsigned long v19;  // x9
    unsigned long long v2;  // x12
    unsigned int v20;  // w24
    unsigned long long v21;  // x9
    unsigned int v22;  // w22
    unsigned long long v23;  // x17
    unsigned long long v24;  // x28
    unsigned long long v25;  // x7
    unsigned long long v26;  // x27
    unsigned long long v27;  // x17
    long long v28;  // x2
    unsigned int v29;  // w24
    unsigned long v3;  // x16
    long long v30;  // x5
    unsigned long v31;  // x24
    unsigned int v32;  // w24
    long long v33;  // x20
    long long v34;  // x19
    long long v35;  // x25
    long long v36;  // x24
    long long v37;  // x26
    long long v38;  // x4
    long long v39;  // x22
    unsigned long long v4;  // x1
    long long v40;  // x3
    long long v41;  // x19
    long long v42;  // x6
    unsigned long long v43;  // x3
    unsigned long long v44;  // x6
    long long v45;  // x27
    unsigned long long v46;  // x6
    long long v47;  // x26
    unsigned long long v48;  // x20
    unsigned long long v49;  // x22
    unsigned long v5;  // x9
    long long v50;  // x26
    unsigned long long v51;  // x5
    unsigned long long v52;  // x19
    unsigned long v53;  // x25
    long long v54;  // x19
    long long v55;  // x7
    long long v56;  // x22
    long long v57;  // x23
    long long v58;  // x8
    long long v59;  // x25
    unsigned long v6;  // x9
    long long v60;  // x11
    long long v61;  // x12
    long long v62;  // x6
    long long v63;  // x8
    long long v64;  // x20
    long long v65;  // x8
    long long v66;  // x2
    long long v67;  // x5
    long long v68;  // x8
    long long v69;  // x5
    unsigned long v7;  // x9
    long long v70;  // x19
    long long v71;  // x20
    long long v72;  // x22
    long long v73;  // x2
    long long v74;  // x7
    long long v75;  // x21
    long long v76;  // x23
    long long v77;  // x21
    long long v78;  // x16
    long long v79;  // x21
    unsigned long long v8;  // x9
    long long v80;  // x16
    long long v81;  // x6
    long long v82;  // x5
    long long v83;  // x7
    long long v84;  // x23
    long long v85;  // x24
    long long v86;  // x2
    long long v87;  // x1
    long long v88;  // x16
    long long v89;  // x11
    unsigned long v9;  // x9
    long long v90;  // x12
    unsigned long long v91;  // x8
    long long v92;  // x3
    unsigned long long v93;  // x13
    unsigned long long v94;  // x14
    unsigned long long v95;  // x13
    unsigned long long v96;  // x14
    unsigned long long v97;  // x10
    unsigned long long v98;  // x9
    unsigned long long v99;  // x10

    v0 = (char)a0[2];
    v1 = (int)a0[2];
    v2 = (unsigned int)(v1 >> 24) | (char)a0[6] * 0x100 | (char)a0[7] * 0x10000;
    v3 = (int)a0[10];
    v4 = (unsigned int)(v3 >> 24) | (char)a0[14] * 0x100 | (char)a0[15] * 0x10000;
    v5 = (int)a0[15];
    v6 = (char)a0[23];
    v7 = (int)a0[23];
    v8 = (unsigned int)(v7 >> 24) | (char)a0[27] * 0x100 | (char)a0[28] * 0x10000;
    v9 = (int)a0[28];
    v10 = (int)a0[31];
    v11 = (unsigned int)(v10 >> 24) | (char)a0[35] * 0x100 | (char)a0[36] * 0x10000;
    v12 = (int)a0[36];
    v13 = (char)a0[44];
    v14 = (int)a0[44];
    v15 = (unsigned int)(v14 >> 24) | (char)a0[48] * 0x100 | (char)a0[49] * 0x10000;
    v16 = ((unsigned int)v15 * 0 | (unsigned int)(v15 >> 2)) & 0x1fffff;
    v17 = (int)a0[49];
    v18 = ((unsigned int)v17 * 0 | (unsigned int)(v17 >> 7)) & 0x1fffff;
    v19 = (int)a0[52];
    v20 = ((unsigned int)v19 * 0 | (unsigned int)(v19 >> 4)) & 0x1fffff;
    v21 = (unsigned int)(v19 >> 24) | (char)a0[56] * 0x100 | (char)a0[57] * 0x10000;
    v22 = ((unsigned int)v21 * 0 | (unsigned int)(v21 >> 1)) & 0x1fffff;
    v23 = ((v5 * 0x400000000000000 | v5 >> 6) & 0xfc000000001fffff & 0x1fffff) + v16 * 666643;
    v24 = (((short)a0[21] | (v6 * 0x10000 | v6 >> 48) & 0x1f0000) & 0x1fffff) + v18 * 470296 + v20 * 666643 + v16 * 654183;
    v25 = v23 + 0x100000;
    v26 = ((v5 >> 24 | (char)a0[19] * 0x100 | (char)a0[20] * 0x10000) >> 3) + v18 * 666643 + v16 * 470296 + (v25 >> 21);
    v27 = v24 + 0x100000;
    v28 = ((v7 * 0x800000000000000 | v7 >> 5) & 0xf8000000001fffff & 0x1fffff) + v18 * 654183 + v20 * 470296 + v16 * -0xf39ad + v22 * 666643 + (v27 >> 21);
    v29 = (unsigned int)((int)a0[60]) >> 3;
    v30 = (((short)a0[42] | (v13 * 0x10000 | v13 >> 48) & 0x1f0000) & 0x1fffff) + v29 * -0xa6f7d;
    v31 = (int)a0[57];
    v32 = ((unsigned int)v31 * 0 | (unsigned int)(v31 >> 6)) & 0x1fffff;
    v33 = ((v12 * 0x400000000000000 | v12 >> 6) & 0xfc000000001fffff & 0x1fffff) + v29 * -0xf39ad + v32 * 136657 + v22 * -0xa6f7d;
    v34 = ((v10 * 0x1000000000000000 | v10 >> 4) & 0xf0000000001fffff & 0x1fffff) + v18 * -0xa6f7d + v20 * 136657 + v29 * 470296 + v32 * 654183 + v22 * -0xf39ad;
    v35 = ((v8 * 0x4000000000000000 | v8 >> 2) & 0xc0000000001fffff & 0x1fffff) + v18 * -0xf39ad + v20 * 654183 + v16 * 136657 + v32 * 666643 + v22 * 470296;
    v36 = v35 + 0x100000;
    v37 = ((v9 * 0x200000000000000 | v9 >> 7) & 0xfe000000001fffff & 0x1fffff) + v18 * 136657 + v20 * -0xf39ad + v16 * -0xa6f7d + v29 * 666643 + v32 * 470296 + v22 * 654183 + (v36 >> 21);
    v38 = v34 + 0x100000;
    v39 = ((v11 * 0x8000000000000000 | v11 >> 1) & 0x80000000001fffff & 0x1fffff) + v20 * -0xa6f7d + v29 * 654183 + v32 * -0xf39ad + v22 * 136657 + (v38 >> 21);
    v40 = v33 + 0x100000;
    v41 = ((v12 >> 24 | (char)a0[40] * 0x100 | (char)a0[41] * 0x10000) >> 3) + v29 * 136657 + v32 * -0xa6f7d + (v40 >> 21);
    v42 = v30 + 0x100000;
    v43 = ((v14 * 0x800000000000000 | v14 >> 5) & 0xf8000000001fffff & 0x1fffff) + (v42 >> 21);
    v44 = v26 + 0x100000;
    v45 = v37 + 0x100000;
    v46 = v34 - (v38 & 0xffffffffffe00000) + (v45 >> 21);
    v47 = v39 + 0x100000;
    v48 = v33 - (v40 & 0xffffffffffe00000) + (v47 >> 21);
    v49 = v39 - (v47 & 0xffffffffffe00000);
    v50 = v41 + 0x100000;
    v51 = v30 - (v42 & 0xffffffffffe00000) + (v50 >> 21);
    v52 = v41 - (v50 & 0xffffffffffe00000);
    v53 = (int)a0[7];
    v54 = v24 - (v27 & 0xfffffe00000) + (v44 >> 21) + 0xfffffffffff0c653 * v43 + 136657 * v51 + 0xfffffffffff59083 * v52;
    v55 = v23 - (v25 & 0x7ffffe00000) + 470296 * v43 + 654183 * v51 + 0xfffffffffff0c653 * v52 + 136657 * v48 + 0xfffffffffff59083 * v49;
    v56 = v28 + 0x100000;
    v57 = v35 + 0xfffffffffff59083 * v43 - (v36 & 0xffffffffffe00000) + (v56 >> 21);
    v58 = ((*(short *)a0 | (v0 * 0x10000 | v0 >> 48) & 0x1f0000) & 0x1fffff) + 666643 * v46;
    v59 = ((v2 * 0x4000000000000000 | v2 >> 2) & 0xc0000000001fffff & 0x1fffff) + 666643 * v48 + 470296 * v49 + 654183 * v46;
    v60 = ((v3 * 0x1000000000000000 | v3 >> 4) & 0xf0000000001fffff & 0x1fffff) + 666643 * v51 + 470296 * v52 + 654183 * v48 + 0xfffffffffff0c653 * v49 + 136657 * v46;
    v61 = v58 + 0x100000;
    v62 = ((v1 * 0x800000000000000 | v1 >> 5) & 0xf8000000001fffff & 0x1fffff) + 666643 * v49 + 470296 * v46 + (v61 >> 21);
    v63 = v55 + 0x100000;
    v64 = v26 - (v44 & 0x7fffffffffe00000) + 654183 * v43 + 0xfffffffffff0c653 * v51 + 136657 * v52 + 0xfffffffffff59083 * v48 + (v63 >> 21);
    v65 = v54 + 0x100000;
    v66 = v28 + 136657 * v43 - (v56 & 0xffffffffffe00000) + 0xfffffffffff59083 * v51 + (v65 >> 21);
    v67 = v57 + 0x100000;
    v68 = v37 - (v45 & 0xffffffffffe00000) + (v67 >> 21);
    v69 = v62 + 0x100000;
    v70 = v64 + 0x100000;
    v71 = v66 + 0x100000;
    v72 = v68 + 0x100000;
    v73 = v72 >> 21;
    v74 = v59 + 0x100000;
    v75 = ((v53 * 0x200000000000000 | v53 >> 7) & 0xfe000000001fffff & 0x1fffff) + 666643 * v52 + 470296 * v48 + 654183 * v49 + 0xfffffffffff0c653 * v46 + (v74 >> 21);
    v76 = v75 + 0x100000;
    v77 = v60 + 0x100000;
    v78 = ((v4 * 0x8000000000000000 | v4 >> 1) & 0x80000000001fffff & 0x1fffff) + 666643 * v43 + 470296 * v51 + 654183 * v52 + 0xfffffffffff0c653 * v48 + 136657 * v49 + 0xfffffffffff59083 * v46 + (v77 >> 21);
    v79 = v58 - (v61 & 0xffffffffffe00000) + 666643 * v73;
    v80 = v78 + 0x100000;
    v81 = v62 + 470296 * v73 - (v69 & 0xffffffffffe00000) + (v79 >> 21);
    v82 = v59 + 654183 * v73 - (v74 & 0xffffffffffe00000) + (v69 >> 21) + (v81 >> 21);
    v83 = v75 + 0xfffffffffff0c653 * v73 - (v76 & 0xffffffffffe00000) + (v82 >> 21);
    v84 = v60 + 136657 * v73 - (v77 & 0xffffffffffe00000) + (v76 >> 21) + (v83 >> 21);
    v85 = v78 + 0xfffffffffff59083 * v73 - (v80 & 0xffffffffffe00000) + (v84 >> 21);
    v86 = v55 - (v63 & 0xffffffffffe00000) + (v80 >> 21) + (v85 >> 21);
    v87 = v64 - (v70 & 0xffffffffffe00000) + (v86 >> 21);
    v88 = v54 - (v65 & 0xffffffffffe00000) + (v70 >> 21) + (v87 >> 21);
    v89 = v66 - (v71 & 0xffffffffffe00000) + (v88 >> 21);
    v90 = v57 - (v67 & 0xffffffffffe00000) + (v71 >> 21) + (v89 >> 21);
    v91 = v68 - (v72 & 0xffffffffffe00000) + (v90 >> 21);
    v92 = (long long)(v91) >> 21;
    v93 = (v79 & 0x1fffff) + 666643 * v92;
    *(char *)&a0[1] = v93 >> 8;
    v94 = (v81 & 0x1fffff) + 470296 * v92 + ((long long)(v93) >> 21);
    *(char *)a0 = v93;
    *(char *)&a0[2] = ((char)v93 * 0 | (char)(v93 >> 16)) & 31 | (char)(__ROL__((unsigned int)v94, 5)) & 224;
    *(char *)&a0[3] = v94 >> 3;
    *(char *)&a0[4] = v94 >> 11;
    v95 = (v82 & 0x1fffff) + 654183 * v92 + ((long long)(v94) >> 21);
    *(char *)&a0[5] = (char)(__ROL__((unsigned int)v94, 13)) & 3 | (char)v95 * 4;
    *(char *)&a0[6] = v95 >> 6;
    v96 = (v83 & 0x1fffff) + 0xfffffffffff0c653 * v92 + ((long long)(v95) >> 21);
    *(char *)&a0[7] = (char)(__ROL__((unsigned int)v95, 18)) & 127 | (char)v96 * 128;
    *(char *)&a0[8] = v96 >> 1;
    *(char *)&a0[9] = v96 >> 9;
    v97 = (v84 & 0x1fffff) + 136657 * v92 + ((long long)(v96) >> 21);
    *(char *)&a0[10] = (char)(__ROL__((unsigned int)v96, 15)) & 15 | (char)v97 * 16;
    *(char *)&a0[11] = v97 >> 4;
    *(char *)&a0[12] = v97 >> 12;
    v98 = (v85 & 0x1fffff) + 0xfffffffffff59083 * v92 + ((long long)(v97) >> 21);
    *(char *)&a0[13] = (char)(__ROL__((unsigned int)v97, 12)) & 1 | (char)v98 * 2;
    *(char *)&a0[14] = v98 >> 7;
    v99 = (v86 & 0x1fffff) + ((long long)(v98) >> 21);
    *(char *)&a0[15] = (char)(__ROL__((unsigned int)v98, 0x11)) & 63 | (char)v99 * 64;
    *(char *)&a0[16] = v99 >> 2;
    *(char *)&a0[0x11] = v99 >> 10;
    v100 = (v87 & 0x1fffff) + ((long long)(v99) >> 21);
    *(char *)&a0[18] = (char)(__ROL__((unsigned int)v99, 14)) & 7 | (char)v100 * 8;
    *(char *)&a0[19] = v100 >> 5;
    v101 = (v88 & 0x1fffff) + ((long long)(v100) >> 21);
    *(char *)&a0[20] = v100 >> 13;
    *(char *)&a0[22] = v101 >> 8;
    v102 = (v89 & 0x1fffff) + ((long long)(v101) >> 21);
    *(char *)&a0[21] = v101;
    *(char *)&a0[23] = ((char)v101 * 0 | (char)(v101 >> 16)) & 31 | (char)(__ROL__((unsigned int)v102, 5)) & 224;
    *(char *)&a0[24] = v102 >> 3;
    *(char *)&a0[25] = v102 >> 11;
    v103 = (v90 & 0x1fffff) + ((long long)(v102) >> 21);
    *(char *)&a0[26] = (char)(__ROL__((unsigned int)v102, 13)) & 3 | (char)v103 * 4;
    *(char *)&a0[27] = v103 >> 6;
    v104 = (long long)(v103) >> 21;
    v105 = v104 + (v91 & 0x1fffff);
    *(char *)&a0[28] = (char)(__ROL__((unsigned int)v103, 18)) & 127 | (char)v105 * 128;
    *(char *)&a0[29] = (int)v104 + (unsigned int)v91 >> 1;
    *(char *)&a0[30] = v105 >> 9;
    *(char *)&a0[31] = v105 >> 0x11;
    return a0;
}

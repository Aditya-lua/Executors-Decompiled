/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x591e4..0x59924 (1856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_591e4_0 {
    char field_0;
} st_591e4_0;

typedef struct st_591e4_1 {
    char field_0;
    char padding_1[7];
    float field_8;
} st_591e4_1;

extern unsigned long long g_e69898;
extern unsigned long long g_e698e8;

int sub_591e4(st_591e4_1 *a0, st_591e4_1 *a1)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w11
    unsigned int v12;  // w11
    unsigned int v13;  // w2
    unsigned int v14;  // w5
    unsigned int v15;  // w15
    unsigned int v16;  // w15
    unsigned int v17;  // w3
    unsigned int v18;  // w2
    int v20;  // w2
    unsigned int v21;  // w3
    unsigned int v4;  // w14
    unsigned int v22;  // w15
    unsigned int v23;  // w5
    unsigned int v24;  // w6
    unsigned int v25;  // w7
    unsigned int v26;  // w15
    unsigned int v27;  // w6
    unsigned int v28;  // w4
    unsigned int v29;  // w6
    unsigned int v30;  // w5
    unsigned int v31;  // w5
    unsigned int v5;  // w8
    unsigned int v32;  // w20
    unsigned int v33;  // w7
    unsigned int v34;  // w5
    unsigned int v35;  // w20
    unsigned int v36;  // w21
    unsigned int v37;  // w5
    unsigned int v38;  // w5
    unsigned int v39;  // w7
    unsigned int v40;  // w21
    unsigned int v41;  // w4
    unsigned int v6;  // w17
    unsigned int v42;  // w5
    unsigned int v43;  // w6
    unsigned int v44;  // w4
    int v46;  // w3
    unsigned int v47;  // w2
    unsigned int v48;  // w4
    unsigned int v49;  // w16
    unsigned int v50;  // w16
    unsigned int v51;  // w14
    unsigned int v7;  // w15
    unsigned int v52;  // w14
    unsigned int v53;  // w2
    unsigned int v54;  // w17
    unsigned int v55;  // w14
    unsigned int v56;  // w17
    unsigned int v57;  // w14
    unsigned int v58;  // w2
    unsigned int v59;  // w3
    unsigned int v60;  // w17
    unsigned int v61;  // w2
    unsigned int v8;  // w9
    unsigned int v62;  // w4
    unsigned int v63;  // w5
    unsigned int v64;  // w17
    unsigned int v65;  // w2
    unsigned int v66;  // w14
    unsigned int v67;  // w14
    unsigned int v68;  // w3
    unsigned int v70;  // w14
    unsigned int v71;  // w15
    unsigned int v9;  // w16
    unsigned int v72;  // w12
    unsigned int v73;  // w10
    unsigned int v74;  // w11
    unsigned int v75;  // w15
    unsigned int v76;  // w9
    unsigned int v77;  // w9
    unsigned int v78;  // w10
    unsigned int v79;  // w10
    unsigned int v80;  // w8
    unsigned int v81;  // w11
    unsigned int v10;  // w12
    unsigned int v82;  // w8
    unsigned int v83;  // w11
    unsigned int v84;  // w12
    unsigned long long *v86;  // x8
    unsigned int v11;  // w13
    st_591e4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_591e4_0 *v1;  // [bp-0x38]

    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return 1;
    v2 = a0->field_0;
    v3 = ~v2;
    v4 = v3 | 1;
    v5 = v2 + 1;
    v6 = v5 + v4;
    v7 = v2 | 1;
    v8 = v6 + v7;
    v9 = v2 + (v3 | 0xfffffffe) + 2;
    v10 = v2 * 2;
    v11 = v10 & 2;
    v12 = v3 * 2;
    v13 = v2 ^ 1;
    v14 = (v5 ^ -v9) + (v5 & -v9) * 2;
    v15 = (v7 ^ -v6) + (v7 & -v6) * 2;
    v16 = v8 + v6 + v13 + v14 + (v15 & ~v14) + (v15 & v14) + ((unsigned int)(v8 - (v6 + v13) - (v8 | -(v6 + v13))) + (-(v6 + v13) & ~v8)) * 2;
    v17 = (v11 + v13 - 1 & v13 & 1) + v2 + (v11 + v13 - 1 + v12 + v11 | v13 & 1);
    v18 = (0xfffffffe - v17 & v13) + v17 + 1 + (~v17 - (0xfffffffe - v17 & v13) ^ v17 + 1 + v13) + (~v17 - (0xfffffffe - v17 & v13) & v17 + 1 + v13) * 2;
    if (...)
        v20 = 0;
    else
        v20 = (int)(v2) >> 2;
    v21 = a1->field_0;
    v22 = ~v21;
    v23 = v21 ^ 1;
    v24 = v21 * 2;
    v25 = (v24 & 2) + v23 + v22 * 2;
    v26 = ((v22 | 1) ^ -v25) + ((v22 | 1) & -v25) * 2;
    v27 = ((v24 & 4) + (v21 ^ 2) - (v21 & 1)) * 3 + ((v21 & 1) - ((v24 & 4) + (v21 ^ 2))) * 4;
    v28 = v27 + v26 + 1 + (-v27 & ~v26) * 2 + ((-v27 | ~v26) + v26 + 1) * 2;
    v29 = v28 - 1;
    v30 = (v23 | 0xfffffffe) + (v25 | 1) + (v25 + 1 & 1) - (v25 + 1 + ~v25 * 2 ^ 0xfffffffe);
    v31 = v30 - 1;
    v32 = v21 + 1;
    v33 = (unsigned int)(v30 + v21 - (v31 | v32)) * 2;
    v34 = v31 ^ v32;
    v35 = v34 + 1;
    v36 = v35 + v33;
    v37 = (v34 + v33 & 0xfffffffe) - ((v35 & 1) + v36) * 2;
    v38 = (v37 ^ ((-v36 | 1) ^ v36) + ((-v36 | 1) & v36) * 2 ^ 0xfffffffe) + ((v37 ^ 0x7ffffffe) & ((-v36 | 1) ^ v36) + ((-v36 | 1) & v36) * 2) * 2;
    v39 = (-v38 * 2 & 4) + (-v38 ^ 2);
    v40 = v29 * 2;
    v41 = (v40 - v28 + v39 + (-v39 | 1 - v28) ^ -v39 - (v28 - 2 | -v39)) + (v40 - v28 + v39 + (-v39 | 1 - v28) + (-v39 - (v28 - 2 | -v39) | ~(v40 - v28 + v39 + (-v39 | 1 - v28)))) * 2 + 2;
    v42 = v29 - v40 + v29 + (1 - v38 | ~(v29 - v40)) + (1 - v38 ^ v29 - v40 + 0x80000000) + 1;
    v43 = v42 * 2;
    v44 = (unsigned int)(v41 + v43 - (v41 & v42 * 4 - v43)) + 1;
    if ((v44 ^ v41 & v43) + (v44 & v41 & v43) * 2 + 1 == ((v44 ^ v41 & v43) + (v44 & v41 & v43) * 2) * 2)
        v46 = 0;
    else
        v46 = (int)(v21) >> 2;
    if (v20 != v46)
        return 0;
    v47 = v2 & 1;
    v48 = v2 + v12 + 1 + (v2 + v12 + 1 ^ 0xfffffffe) + (~(v2 + v12 + 1) | 0xfffffffe) + 1;
    v49 = (v48 | (unsigned int)(0xfffffffe - (v9 + v47))) + v9 + v47 + (v48 | v9 + v47 + 1);
    v50 = (v47 - (v49 + 3) + (v49 + 3 & ~v47 | v47 & ~v49) * 2 | 1) + (v47 - (v49 + 3) & 1) - 2;
    v51 = v4 + v2;
    v52 = v51 + v2;
    v53 = v52 - 2;
    v54 = v53 + ((unsigned int)(1 - v51) & v2 - 2) * 2 + ((unsigned int)(1 - v51) & (unsigned int)(1 - v2)) * 2;
    v55 = ((unsigned int)(1 - v52) | 0xfffffffe) - v54 + 2;
    v56 = (__ROL__(v53, 1) & 2 & 3) - (v54 - 1 | 1) + v54 * 2 - 2;
    v57 = (v55 ^ v54) + (v55 & v54) * 2 + (v56 | ~((v55 ^ v54) + (v55 & v54) * 2)) + ((v55 ^ v54) + (v55 & v54) * 2 | v56) + 1;
    v58 = v57 * 2;
    v59 = v58 & 2;
    v60 = v59 - ((v57 ^ 0xfffffffe) + v58);
    v61 = v60 - 2;
    v62 = 1 | ~v50 * 2;
    v63 = v60 + v62 + v50 + ~(v62 + v50 | v61) - 1;
    v64 = v61 + v50 + ((unsigned int)(2 - v60) & ~v50) * 2 + ((unsigned int)(2 - v60) & v50) * 2;
    v65 = (0xffffffff ^ v63 * 2) + v63 * 4 + 2;
    v66 = (v57 ^ 1) + ~v57 * 2 + v59;
    v67 = (v66 * 2 & 4) + (v66 ^ 2);
    v68 = (__ROL__(v50, 1) & 2 & 3) + (v50 ^ 1) + v62;
    v70 = v2 & 252;
    if (...)
        return a0->field_8 == a1->field_8;
    v71 = ~v10 + v2;
    v72 = (unsigned int)(v11 - v10 - (v71 | 1)) - 2;
    v73 = v72 - v2 + (-v71 & ~v72) * 2 + (unsigned int)(v72 - v71 - (v72 | -v71)) * 2;
    v74 = v5 + v12;
    v75 = v5 | 0xfffffffe;
    v76 = (v74 & 0xfffffffe) + (v74 + 1 & 1) + v75 + v8 + (v74 + 1 + ~v74 * 2 ^ 1) + 2;
    v77 = v73 - v76 + v73 - 1 + (v76 | -v73) + (v73 - 1 + v76 ^ -(v73 - 1 | v76)) + ((v73 - 1 + v76 & -(v73 - 1 | v76)) + (v76 & -v73)) * 2;
    v78 = v74 * 2 - v75 + (0xfffffffc & ~(v74 * 2));
    v79 = (v78 ^ v5) + 1;
    v80 = v79 + (v78 + (v5 | ~v78)) * 2 + 2;
    v81 = (~v80 - (v79 | 0xfffffffe) ^ v80) + (~v80 - (v79 | 0xfffffffe) & v80) * 2;
    v82 = (unsigned int)(v81 * 2 - (v80 + (v79 & 1) - 1 & v81) - ((-(v80 + (v79 & 1)) & v81) - (v80 + (v79 & 1)))) - 2;
    v83 = (v82 & v77) - v82;
    v84 = v83 - 1;
    v86 = &g_e69898;
    if ((v82 ^ v77) != ((0xfffffffe - (v77 + (~v82 | ~v77) + v84) & 1 - v83) + (0xfffffffe - (v77 + (~v82 | ~v77) + v84) | 1 - v83) + v77 + (~v82 | ~v77) + v84 + 2) * 4 + (v84 + v77 + (~v82 | ~v77) + v84 + 2) * 2 - 3 && v70 == 20)
        v86 = &g_e698e8;
    goto *((void *)(*v86));
}

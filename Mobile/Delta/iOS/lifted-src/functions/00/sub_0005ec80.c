/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5ec80..0x5fe00 (4480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5ec80_1 {
    char padding_0[2096];
    struct st_5ec80_2 *field_830;
} st_5ec80_1;

typedef struct st_5ec80_2 {
    void* field_0;
} st_5ec80_2;

typedef struct st_5ec80_0 {
    char field_0;
} st_5ec80_0;

extern unsigned long long g_e695f8;

void* sub_5ec80(st_5ec80_1 *a0, void* a1, long long a2, unsigned long a3)
{
    unsigned int v7;  // w8
    unsigned int v8;  // w10
    unsigned int v17;  // w1
    unsigned int v18;  // w16
    unsigned int v19;  // w15
    unsigned int v20;  // w0
    unsigned int v21;  // w17
    unsigned int v22;  // w2
    unsigned int v23;  // w4
    unsigned int v24;  // w4
    unsigned int v25;  // w0
    unsigned int v26;  // w0
    unsigned int v9;  // w14
    unsigned int v27;  // w2
    unsigned int v28;  // w0
    unsigned int v29;  // w0
    unsigned int v31;  // w1
    unsigned long v32;  // cc_op
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    unsigned long v35;  // cc_ndep
    unsigned long long v36;  // 4112
    unsigned int v10;  // w13
    unsigned long long v37;  // 4102
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4102
    unsigned int v11;  // w11
    unsigned int v40;  // w13
    unsigned int v41;  // w13
    unsigned int v42;  // w10
    unsigned int v43;  // w11
    unsigned int v44;  // w10
    unsigned int v45;  // w11
    unsigned int v46;  // w10
    unsigned int v47;  // w11
    unsigned long long v48;  // 4718
    unsigned int v12;  // w12
    char *v49;  // x0
    unsigned int v50;  // w8
    unsigned int v51;  // w11
    unsigned int v52;  // w10
    unsigned int v53;  // w9
    unsigned int v54;  // w10
    unsigned int v55;  // w12
    unsigned int v56;  // w14
    unsigned int v57;  // w12
    unsigned int v58;  // w13
    unsigned int v13;  // w16
    unsigned int v59;  // w13
    unsigned int v60;  // w13
    unsigned int v61;  // w10
    unsigned int v62;  // w9
    unsigned int v63;  // w10
    unsigned int v64;  // w9
    unsigned int v65;  // w11
    unsigned int v66;  // w12
    unsigned int v67;  // w14
    unsigned int v68;  // w11
    unsigned int v14;  // w0
    unsigned int v69;  // w11
    unsigned int v70;  // w12
    unsigned int v71;  // w13
    unsigned int v72;  // w15
    unsigned int v73;  // w11
    unsigned int v74;  // w10
    unsigned int v75;  // w10
    unsigned int v76;  // w9
    long long v78;  // w8
    unsigned int v15;  // w15
    unsigned long long v79;  // x9
    unsigned long v80;  // x21
    unsigned long v81;  // x21
    unsigned int v16;  // w15
    st_5ec80_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_5ec80_0 *v1;  // [bp-0x90]
    void* v2;  // [bp-0x88]
    void* *v3;  // [bp-0x80]
    unsigned long v4;  // [bp-0x78]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = *(char *)a1;
    v8 = ~v7;
    v9 = v7 ^ 1;
    v10 = v7 * 2;
    v11 = v8 * 2;
    v12 = v10 + 2;
    v13 = (v10 & 2) + v9 + v11 + 1 + ((v10 & 2) + v9 + v11 + 1 | 0xfffffffe) + 2 + v12 + v8 * 4 + (v10 & 2) + v9 + (-(v12 + v8 * 4 + (v10 & 2) + v9) & ~((v10 & 2) + v9 + v11 + 1 + ((v10 & 2) + v9 + v11 + 1 | 0xfffffffe) + 1)) * 2 + ((v10 & 2) + v9 + v11 + 1 + ((v10 & 2) + v9 + v11 + 1 | 0xfffffffe) + 2 + (-(v12 + v8 * 4 + (v10 & 2) + v9) | ~((v10 & 2) + v9 + v11 + 1 + ((v10 & 2) + v9 + v11 + 1 | 0xfffffffe) + 1))) * 2;
    v14 = v7 ^ 2;
    v15 = (1 | __ROL__(v7 >> 1, 2) & 0xfffffffc) - ((v7 | 1) + v7);
    v16 = (v15 ^ (v10 & 4) + v14) + (v15 & (v10 & 4) + v14) * 2;
    v17 = v13 + ~v16 + v16 * 2 + (-v13 | -v16) + (v16 + v13 - 1 - 1 ^ -(~v16 + v16 * 2) - (v13 - 1 & -v16)) + (v16 + v13 - 1 - 1 & -(~v16 + v16 * 2) - (v13 - 1 & -v16)) * 2;
    v18 = v7 + 1;
    v19 = v14 + (v18 + (v8 | 2)) * 2 + 1;
    v20 = ((v19 & 0xfffffffe) - 2 ^ 0xfffffffe) + v19 + ((v19 & 0xfffffffe) - 1 | ~(((v19 & 0xfffffffe) - 2 ^ 0xfffffffe) + v19)) + (((v19 & 0xfffffffe) - 2 ^ 0xfffffffe) + v19 | (v19 & 0xfffffffe) - 1) + 1;
    v21 = v7 & 1;
    v22 = v21 + (0xffffffff ^ v21 * 2);
    v23 = v20 + ~v20 * 2 + 1;
    v24 = v22 + v20 + v23 + (v21 | ~v23) + 2;
    v25 = v20 + (v22 | ~v20) + (v20 ^ v22) + 2;
    v26 = (v24 ^ v25) + (v24 & v25) * 2;
    v27 = 1 - v26;
    v28 = (v27 & v26 - 1) * 4 + (v27 ^ v26 - 1) * 2;
    v29 = (v27 | v28) + (v28 & v27) + v17 + (v17 | (v27 | v28) + (v28 & v27)) - (v17 | (v27 | v28) + (v28 & v27)) * 2;
    v31 = v7 & 252;
    if ((v27 | v17) + ~((v26 - 2 | v17) + v27) - (1 | (v29 * 2 | v29 >> 31) & 0xfffffffe) + (((v29 * 4 | 1) - v29 * 2 & (v27 | v17) + ~((v26 - 2 | v17) + v27)) + ((1 | (v29 * 2 | v29 >> 31) & 0xfffffffe) & (v26 - 2 | v17) + v27 - (v27 | v17))) * 2 != 1)
    {
        v36 = arm64g_calculate_condition(v32 | 16, v33, v34, v35);
        v37 = arm64g_calculate_condition(3, (v36 & 1 ? v31 : 0), (v36 & 1 ? 16 : 0), 0);
        if (v37 & 1)
            goto LABEL_5f274;
    }
    else
    {
        v38 = arm64g_calculate_condition(v32 | 16, v33, v34, v35);
        v39 = arm64g_calculate_condition(0, (v38 & 1 ? v31 : 0), (v38 & 1 ? 16 : 0), 0);
        if (v39 & 1)
        {
LABEL_5f274:
            v80 = *(long long *)(sub_5a99c(a1, a2) + 8);
            v81 = *(long long *)(sub_5a99c(a1, a2) + 8);
            return *(long long *)(sub_5a99c(a1, a2) + 8);
        }
    }
    v40 = v10 - ((v7 | 0xfffffffe) + v9 + ((v8 | 1) + v7) * 2) - 2;
    v41 = (v40 & (v21 ^ 3) + (v10 | 0xfffffffd)) + v40 + (v40 + ~v40 * 2 + 1 & (v21 ^ 3) + (v10 | 0xfffffffd));
    v42 = (v18 + v11 | 1) + v12 + v8 + v21 + (v18 & 1) + (v18 + v11 ^ 0xfffffffe);
    v43 = v42 - 2;
    v44 = (v42 - 1 ^ -(v43 | 1)) + (v42 - 1 & -(v43 | 1)) * 2;
    v45 = (v43 & 1) + v43 + (2 & ~(v43 * 2));
    v46 = (v44 & -v45) + v45 + (v45 - 1 & v44);
    v47 = (~v46 | 0xfffffffe) - v46 + (v46 & 1);
    v48 = arm64g_calculate_condition(1, (v41 + ((unsigned int)(1 - v46) | v41) + ((unsigned int)(1 - v46) | ~v41) + ((unsigned int)(1 - v46) | v41)) * 2 + ~((unsigned int)(1 - v46) | v41) * 4 + v47 + v41 + 3 + (v41 + ((unsigned int)(0xfffffffe - v47) | ~v41)) * 2 + (v47 + v41 + 3 + (0xffffffff ^ v41 * 2) + ((unsigned int)(0xfffffffe - v47) & ~v41) + ~(v47 + v41 + 3 + (0xffffffff ^ v41 * 2) + (v41 | (unsigned int)(0xfffffffd - v47)))) * 2, 7, 0);
    if (!(v48 & 1) && 3 < v7)
        return a1;
    v2 = a1;
    v3 = a0->field_830;
    a0->field_830 = &v2;
    v49 = sub_5ec80(a0, *(long long *)a1, a2, 0);
    v4 = (long long)a1[8];
    v50 = *v49;
    v51 = v50 & 1;
    v52 = ((2 & ~(v50 * 2)) + v50 - 1 | v51) + (v50 - 1 & v51) + 1;
    v53 = (v52 ^ v50 - (v50 | 1) + 1) + (v52 & v50 - (v50 | 1) + 1) * 2;
    v54 = v53 + ~v53 * 2 + 1;
    v55 = ~v50;
    v56 = v50 + 1;
    v57 = v55 | 1;
    v58 = (v50 ^ 1) + (v56 + v57) * 2 + v55 * 2 + (v55 * 2 | ~((v50 ^ 1) + (v56 + v57) * 2)) + ((v50 ^ 1) + (v56 + v57) * 2 & ~(v55 * 2)) + 1;
    v59 = (v58 + ~v58 * 2 + 1 | 1) + v58;
    v60 = v59 + (v59 | 0xfffffffe) + v59 - (v59 + 1 & 0xfffffffe);
    v61 = v60 + v53 + (v54 | (unsigned int)(0xfffffffe - v60)) + 2;
    v62 = v61 + ((v60 + 1 | v54) + v53) * 2 + ((unsigned int)(0xfffffffe - ((v60 + 1 | v54) + v53)) | v61) + ((unsigned int)(0xfffffffe - ((v60 + 1 | v54) + v53)) | ~v61);
    v63 = v62 + 4;
    v64 = 0xfffffffc - v62;
    v65 = (v56 * 2 & 4) + (v56 ^ 2) - v51 - 2;
    v66 = (v57 ^ v56) + (v57 & v56) * 2;
    v67 = v66 + ~v66 * 2 + 1;
    v68 = v66 + v67 + (v65 | ~v67) + 2;
    v69 = (v68 ^ v65 & v66) + (v68 & v65 & v66) * 2;
    v70 = -v69;
    v71 = v64 | v70;
    v72 = ~v69 + v69 * 2;
    v73 = v69 - v63 + (v63 & v72) * 2 + (v63 & v70) * 2;
    v74 = (v70 - v63 & -v71) * 4 + (v70 - v63 ^ -v71) * 2;
    v75 = v73 + v74 + (-v73 | ~v74) + (v73 - 1 & v74);
    v76 = (v71 + v69 + (v72 | v64) + (-(v72 ^ v64) - (v71 + v69) | ~(v71 + v69 + (v72 | v64)))) * 4 + (v71 + v69 + (v72 | v64) ^ -(v72 ^ v64) - (v71 + v69)) * 2 + 4;
    if (((v76 | v75) + 1 ^ v76 - (v76 | v75) + v75) + ((v76 | v75) + 1 & v76 - (v76 | v75) + v75) * 2 + 1 == (((v76 | v75) + 1 ^ v76 - (v76 | v75) + v75) + ((v76 | v75) + 1 & v76 - (v76 | v75) + v75) * 2) * 2)
        v78 = 0;
    else
        v78 = (int)(v50) >> 2;
    v79 = 280;
    if (v78 == 8)
        v79 = 424;
    if (v78 == 9)
        v79 = 144;
    if (v78 == 6)
        v79 = 56;
    if (v78 == 7)
        v79 = 152;
    goto *((void *)(*(long long *)((char *)&g_e695f8 + v79)));
}

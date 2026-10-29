/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f9008..0x3f97cc (1988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f9008_0 {
    char field_0;
} st_3f9008_0;


long long sub_3f9008(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v14;  // x10
    unsigned long long v15;  // x12
    unsigned long long v16;  // x13
    unsigned long long v17;  // x14
    unsigned long long v18;  // x2
    unsigned long long v19;  // x13
    unsigned long long v20;  // x13
    unsigned long v21;  // x9
    unsigned long long v22;  // x14
    unsigned long long v23;  // x12
    unsigned long long v6;  // x11
    unsigned long v24;  // x11
    unsigned long long v25;  // x16
    unsigned long long v26;  // x11
    unsigned long long v27;  // x11
    unsigned long long v28;  // x16
    unsigned long long v29;  // x11
    unsigned long v30;  // x17
    unsigned long long v31;  // x4
    unsigned long long v32;  // x11
    unsigned long v33;  // x17
    unsigned long long v7;  // x9
    unsigned long v34;  // x14
    unsigned long long v35;  // x17
    unsigned long long v36;  // x3
    unsigned long long v37;  // x17
    unsigned long v38;  // x3
    unsigned long v39;  // x4
    unsigned long long v40;  // x5
    unsigned long long v41;  // x5
    unsigned long long v42;  // x3
    unsigned long long v43;  // x3
    unsigned long v8;  // x10
    unsigned long long v44;  // x13
    unsigned long long v45;  // x13
    unsigned long long v46;  // x16
    unsigned long long v47;  // x2
    unsigned long long v48;  // x13
    unsigned long long v49;  // x13
    unsigned long long v50;  // x8
    unsigned long long v51;  // x9
    unsigned long long v52;  // x12
    unsigned long long v53;  // x13
    unsigned long long v9;  // x13
    unsigned long long v54;  // x13
    unsigned long long v55;  // x9
    unsigned long long v56;  // x9
    unsigned long long v57;  // x12
    unsigned long long v58;  // x13
    unsigned long long v59;  // x9
    unsigned long long v60;  // x8
    unsigned int v61;  // w10
    unsigned int v62;  // w13
    unsigned int v63;  // w10
    unsigned long long v10;  // x9
    unsigned long long v11;  // x8
    unsigned long long v12;  // x9
    unsigned long long v13;  // x10
    st_3f9008_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    unsigned long long v1;  // [bp-0x10], Other Possible Types: char
    st_3f9008_0 *v2;  // [bp-0x8], Other Possible Types: unsigned int, unsigned long, unsigned long long
    unsigned long v3;  // [bp-0x8], Other Possible Types: unsigned long long

    v2 = &v0;
    v0 = &v2;
    v4 = *a0;
    v5 = v2 - v0 + (&(~v2)[-1 * (v0 | ~v2)] ^ (v0 | v2)) + ((&(~v2)[-1 * (v0 | ~v2)] & (v0 | v2)) - ((char *)v0 + 0x2 * ~v0 + 1 & v2)) * 2;
    v0 = v5 + (3262273776 | ~v5) + (v5 | 3262273776) + 1;
    v2 = v5 + 1032693519;
    v6 = ((v0 | v2) + (v2 & v0) + v4 ^ -((v0 | v2) + (v2 & v0) | v4)) + ((v0 | v2) + (v2 & v0) + v4 & -((v0 | v2) + (v2 & v0) | v4)) * 2;
    v7 = v2;
    v8 = v0;
    v9 = v8 + ~v8 * 2 + 1 & v7;
    v10 = (v7 - (v8 + v9 * 2) ^ (v7 ^ -v8) + (v8 & ~v7 | v7 & -v8) * 2) + (v7 - (v8 + v9 * 2) & (v7 ^ -v8) + (v8 & ~v7 | v7 & -v8) * 2) * 2;
    v0 = v10 + 29;
    v2 = v10 + 3;
    v11 = v4 >> ((char)v2 + (char)v0 & 63);
    v12 = *a1;
    v13 = ((v0 | v2) ^ -(v0 & v2)) + ((v0 | v2) & -(v0 & v2)) * 2;
    v14 = (v13 ^ -v13) + (v13 & -v13) * 2;
    v0 = ~((7875100024 & v14 * 2) + (v14 ^ 3937550012)) + ((7875100024 & v14 * 2) + (v14 ^ 3937550012)) * 2;
    v2 = v14 + 357417284;
    v15 = (v2 + v0 + v12 ^ -(v12 | v2 + v0)) + (v2 + v0 + v12 & -(v12 | v2 + v0)) * 2;
    v16 = v2;
    v17 = v0;
    v18 = 0xfffffffffffffffe - (v17 + ~v17 * 2);
    v19 = v16 - v17 + (v18 - (v16 | v18)) * 2;
    v20 = (v19 ^ (v16 | v17) + ~((v17 | ~v16) + v16)) + ((v16 | v17) - ((v17 | ~v16) + v16) + (v19 | (v17 | ~v16) + v16 - (v16 | v17))) * 2;
    v0 = v20 + (v20 | 2) + (~v20 | 2) + 1;
    v2 = (v20 ^ 31) + ((v20 * 2 | v20 >> 63) & 62 & 63) - 1;
    v21 = v12 >> ((char)(((char)v2 + 1 ^ v0) + ((char)v2 + 1 & v0) * 2 - 1) & 63);
    v22 = v6 * v21;
    v23 = v11 * v15;
    v24 = v2;
    v25 = v24 + ~v24 * 2 + 1;
    v26 = (v0 & v24) - (v0 | v24) + (v24 ^ -v0) + (v25 + (v24 & -v0) + (v0 | ~v25)) * 2;
    v0 = v26 + 0x11;
    v2 = v26 + 19;
    v27 = (v2 ^ -v0) - (~v0 - (v2 | ~v0) ^ (v0 | v2)) + ((v0 & ~v2 | v2 & -v0) - (~v0 - (v2 | ~v0) & (v0 | v2))) * 2;
    v1 = v27 + (v27 & 864155303) + (~(unsigned int)v27 | 0xffffffffcc7e0958) + 864155304;
    v3 = v27 + 3430811992;
    v28 = v22 + 1;
    v29 = v3 + v1 | v28 + ~v22 * 2;
    v30 = v1;
    v31 = v30 + ~v30 * 2 + 1;
    v32 = (v30 | ~v3) + v3 - (v30 | v3) + (v30 ^ -v3) + ((v30 & -v3) + v31 + (v3 | ~v31)) * 2;
    v33 = (~((unsigned int)v32 + 2) * 2 & 52) + (v32 + 2 ^ 0xffffffffffffffe5);
    v1 = 4 - v32;
    v3 = ~v33 + v33 * 2;
    v34 = v22 >> ((char)v3 + (char)v1 & 63);
    v35 = v3 - v1 + (v3 ^ -v1) + (v3 + ~v3 * 2 + 1 & v1) * 2 + ((v3 & -v1) - (v3 & ~v1)) * 2;
    v36 = v35 * 2;
    v1 = (v35 ^ 3839585632) + (v36 & 7679171264) - 1;
    v3 = (v35 ^ 455381665) + (v36 & 910763330) - 1;
    v37 = v1 + v3 + (v3 | ~v1) + (v1 & ~v3) + 1 + v23 + (v23 + ~v23 * 2 + 1 & ~(v1 + v3 + (v3 | ~v1) + (v1 & ~v3) + 1));
    v38 = v3;
    v39 = v1;
    v40 = v38 + ~v38 * 2 + 1;
    v41 = v38 - v39 + (v40 + (v39 | ~v40)) * 2 + 2;
    v42 = (~v39 - (v38 | ~v39) ^ (v39 | v38)) + (~v39 - (v38 | ~v39) & (v39 | v38)) * 2;
    v43 = v41 + v42 + (-v42 & ~v41) * 2 + (v41 - v42 - (v41 | -v42)) * 2;
    v1 = v43 + 23;
    v3 = v43 + 9;
    v44 = (v29 ^ v28) + (v6 * v15 >> ((char)~((v2 + 1 ^ v0) + (v2 + 1 & v0) * 2) + (((char)v2 + 1 ^ (char)v0) + ((char)v2 + 1 & (char)v0) * 2) * 2 & 63)) + (v29 & v28) * 2;
    v45 = v3;
    v46 = v1;
    v47 = (v45 ^ -v46) + (v45 & -v46) * 2 + (v45 + ~v45 * 2 + 1 & v46) * 2;
    v48 = v46 - v45 + (v45 & ~v46) * 2;
    v49 = v47 + v48 + (-v48 & ~v47) * 2 + (v47 - v48 - (v47 | -v48)) * 2;
    v0 = ~((3381440174 & v49 * 2) + (v49 ^ 1690720087)) + ((3381440174 & v49 * 2) + (v49 ^ 1690720087)) * 2;
    v2 = v49 + 456763562;
    v50 = (v23 >> ((char)~((v3 + 1 ^ v1) + (v3 + 1 & v1) * 2) + (((char)v3 + 1 ^ (char)v1) + ((char)v3 + 1 & (char)v1) * 2) * 2 & 63)) + v11 * v21;
    v51 = v2;
    v52 = v0;
    v53 = v51 + ~v51 * 2 + 1;
    v54 = v51 - v52 + (v53 + (v52 | ~v53)) * 2;
    v55 = ((v52 | v51) ^ -(v52 & v51)) + ((v52 | v51) & -(v52 & v51)) * 2;
    v56 = v54 + 3 + v55 + (-v55 & ~(v54 + 2)) * 2 + ((-v55 | ~(v54 + 2)) + v54 + 3) * 2;
    v57 = v56 - 1;
    v58 = -v56;
    v1 = (v58 | 19) + v56 * 2 - (v57 & 19) + 18;
    v3 = (v58 | 13) + v56 + (v57 | 13);
    v59 = (v37 + (0xfffffffffffffffe - v37 & v44) + (v37 + 1 & v44) + (v2 + 1 ^ v0) + (v2 + 1 & v0) * 2 >> ((char)(((char)v3 + 1 ^ v1) + ((char)v3 + 1 & v1) * 2 - 1) & 63)) + 1;
    v60 = (v59 ^ v50 + (v34 | ~v50) + (v50 | v34) + 1) + (v59 & v50 + (v34 | ~v50) + (v50 | v34) + 1) * 2;
    v61 = v3;
    v62 = v61 + ~v61 * 2 + 1;
    v63 = (unsigned int)(v61 - *(unsigned int *)&v1 - ((*(unsigned int *)&v1 | v61) ^ -(*(unsigned int *)&v1 & v61))) + (unsigned int)(v62 + (*(unsigned int *)&v1 | ~v62) - ((*(unsigned int *)&v1 | v61) & -(*(unsigned int *)&v1 & v61))) * 2;
    v0 = (v63 + 2 ^ 26) + (52 & (v63 + 2) * 2) - 1;
    v2 = v63 + 41;
    return ~v60 + v60 * 2;
}

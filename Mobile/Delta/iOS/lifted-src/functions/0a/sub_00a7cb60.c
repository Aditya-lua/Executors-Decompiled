/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7cb60..0xa7d544 (2532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7cb60_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_a7cb60_0;


st_a7cb60_0 * sub_a7cb60(st_a7cb60_0 *a0, unsigned int *a1, unsigned int i, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, unsigned long a8, unsigned long a9, unsigned long a10, unsigned long a11, unsigned long a12, unsigned long a13, unsigned long a14, unsigned long a15, unsigned long a16, unsigned long a17)
{
    unsigned int v0;  // w12
    unsigned int v6;  // w20
    unsigned int v7;  // w3
    unsigned int v8;  // w21
    unsigned long long v9;  // x4
    unsigned long long v10;  // x5
    unsigned long long v11;  // x8
    unsigned long long v12;  // x9
    unsigned int v13;  // w14
    unsigned int v14;  // w22
    unsigned int v15;  // w7
    unsigned int v16;  // w23
    unsigned long long v17;  // x17
    unsigned long long v18;  // x19
    unsigned long long v19;  // x8
    unsigned long long v20;  // x4
    unsigned int v21;  // w5
    unsigned int v22;  // w24
    unsigned int v23;  // w16
    unsigned int v24;  // w25
    unsigned long long v25;  // x6
    unsigned int v1;  // w13
    unsigned long long v26;  // x17
    unsigned long long v27;  // x8
    unsigned long long v28;  // x9
    unsigned int v29;  // w11
    unsigned int v30;  // w26
    unsigned int v31;  // w12
    unsigned int v32;  // w27
    unsigned long long v33;  // x4
    unsigned long long v34;  // x17
    unsigned long long v35;  // x8
    unsigned long long v36;  // x9
    unsigned long long v37;  // x4
    unsigned long long v38;  // x17
    unsigned long long v39;  // x8
    unsigned long long v40;  // x9
    unsigned long long v41;  // x4
    unsigned long long v42;  // x17
    unsigned long long v43;  // x8
    unsigned long long v44;  // x9
    unsigned long long v45;  // x4
    unsigned long long v2;  // x11
    unsigned long long v46;  // x17
    unsigned long long v47;  // x8
    unsigned long long v48;  // x9
    unsigned long long v49;  // x4
    unsigned long long v50;  // x17
    unsigned long long v51;  // x8
    unsigned long long v52;  // x9
    unsigned long long v53;  // x4
    unsigned long long v54;  // x17
    unsigned long long v55;  // x8
    unsigned long long v56;  // x9
    unsigned long long v57;  // x4
    unsigned long long v58;  // x17
    unsigned long long v59;  // x8
    unsigned long long v60;  // x9
    unsigned long long v61;  // x4
    unsigned long long v62;  // x17
    unsigned long long v63;  // x8
    unsigned long long v64;  // x9
    unsigned long long v65;  // x4
    unsigned int v3;  // w10
    unsigned long long v66;  // x17
    unsigned long long v67;  // x8
    unsigned long long v68;  // x9
    unsigned long long v69;  // x4
    unsigned long long v70;  // x6
    unsigned long long v71;  // x8
    unsigned long long v72;  // x17
    unsigned long long v73;  // x9
    unsigned long long v74;  // x6
    unsigned long long v75;  // x8
    unsigned int v4;  // w2
    unsigned long long v76;  // x17
    unsigned long long v77;  // x4
    unsigned long long v78;  // x15
    unsigned long long v79;  // x8
    unsigned long long v80;  // x9
    unsigned long long v81;  // x7
    unsigned long long v82;  // x4
    unsigned long long v83;  // x14
    unsigned int v5;  // w15

    do
    {
        v4 = i;
        v5 = *a1;
        v6 = a1[1];
        v7 = a1[2];
        v8 = a1[3];
        v9 = v2 + ((v3 + v5 + 3614090360 + ((v0 ^ v1) & (unsigned int)v2 ^ v1)) * 128 | v3 + v5 + 3614090360 + ((v0 ^ v1) & (unsigned int)v2 ^ v1) >> 25);
        v10 = v9 + ((v1 + v6 + 3905402710 + (((unsigned int)v2 ^ v0) & (unsigned int)v9 ^ v0)) * 0x1000 | v1 + v6 + 3905402710 + (((unsigned int)v2 ^ v0) & (unsigned int)v9 ^ v0) >> 20);
        v11 = v10 + ((v0 + v7 + 606105819 + (((unsigned int)v9 ^ (unsigned int)v2) & (unsigned int)v10 ^ (unsigned int)v2)) * 0x20000 | v0 + v7 + 606105819 + (((unsigned int)v9 ^ (unsigned int)v2) & (unsigned int)v10 ^ (unsigned int)v2) >> 15);
        v12 = v11 + (((unsigned int)v2 + v8 + 3250441966 + (((unsigned int)v10 ^ (unsigned int)v9) & (unsigned int)v11 ^ (unsigned int)v9)) * 0x400000 | (unsigned int)v2 + v8 + 3250441966 + (((unsigned int)v10 ^ (unsigned int)v9) & (unsigned int)v11 ^ (unsigned int)v9) >> 10);
        v13 = a1[4];
        v14 = a1[5];
        v15 = a1[6];
        v16 = a1[7];
        v17 = v12 + (((unsigned int)v9 + v13 + 4118548399 + (((unsigned int)v11 ^ (unsigned int)v10) & (unsigned int)v12 ^ (unsigned int)v10)) * 128 | (unsigned int)v9 + v13 + 4118548399 + (((unsigned int)v11 ^ (unsigned int)v10) & (unsigned int)v12 ^ (unsigned int)v10) >> 25);
        v18 = v17 + (((unsigned int)v10 + v14 + 1200080426 + (((unsigned int)v12 ^ (unsigned int)v11) & (unsigned int)v17 ^ (unsigned int)v11)) * 0x1000 | (unsigned int)v10 + v14 + 1200080426 + (((unsigned int)v12 ^ (unsigned int)v11) & (unsigned int)v17 ^ (unsigned int)v11) >> 20);
        v19 = v18 + (((unsigned int)v11 + v15 + 2821735955 + (((unsigned int)v17 ^ (unsigned int)v12) & (unsigned int)v18 ^ (unsigned int)v12)) * 0x20000 | (unsigned int)v11 + v15 + 2821735955 + (((unsigned int)v17 ^ (unsigned int)v12) & (unsigned int)v18 ^ (unsigned int)v12) >> 15);
        v20 = v19 + (((unsigned int)v12 + v16 + 4249261313 + (((unsigned int)v18 ^ (unsigned int)v17) & (unsigned int)v19 ^ (unsigned int)v17)) * 0x400000 | (unsigned int)v12 + v16 + 4249261313 + (((unsigned int)v18 ^ (unsigned int)v17) & (unsigned int)v19 ^ (unsigned int)v17) >> 10);
        v21 = a1[8];
        v22 = a1[9];
        v23 = a1[10];
        v24 = a1[11];
        v25 = v20 + (((unsigned int)v17 + v21 + 1770035416 + (((unsigned int)v19 ^ (unsigned int)v18) & (unsigned int)v20 ^ (unsigned int)v18)) * 128 | (unsigned int)v17 + v21 + 1770035416 + (((unsigned int)v19 ^ (unsigned int)v18) & (unsigned int)v20 ^ (unsigned int)v18) >> 25);
        v26 = v25 + (((unsigned int)v18 + v22 + 2336552879 + (((unsigned int)v20 ^ (unsigned int)v19) & (unsigned int)v25 ^ (unsigned int)v19)) * 0x1000 | (unsigned int)v18 + v22 + 2336552879 + (((unsigned int)v20 ^ (unsigned int)v19) & (unsigned int)v25 ^ (unsigned int)v19) >> 20);
        v27 = v26 + (((unsigned int)v19 + v23 + 0xffff5bb1 + (((unsigned int)v25 ^ (unsigned int)v20) & (unsigned int)v26 ^ (unsigned int)v20)) * 0x20000 | (unsigned int)v19 + v23 + 0xffff5bb1 + (((unsigned int)v25 ^ (unsigned int)v20) & (unsigned int)v26 ^ (unsigned int)v20) >> 15);
        v28 = v27 + (((unsigned int)v20 + v24 + 2304563134 + (((unsigned int)v26 ^ (unsigned int)v25) & (unsigned int)v27 ^ (unsigned int)v25)) * 0x400000 | (unsigned int)v20 + v24 + 2304563134 + (((unsigned int)v26 ^ (unsigned int)v25) & (unsigned int)v27 ^ (unsigned int)v25) >> 10);
        v29 = a1[12];
        v30 = a1[13];
        v31 = a1[14];
        v32 = a1[15];
        v33 = v28 + (((unsigned int)v25 + v29 + 1804603682 + (((unsigned int)v27 ^ (unsigned int)v26) & (unsigned int)v28 ^ (unsigned int)v26)) * 128 | (unsigned int)v25 + v29 + 1804603682 + (((unsigned int)v27 ^ (unsigned int)v26) & (unsigned int)v28 ^ (unsigned int)v26) >> 25);
        v34 = v33 + (((unsigned int)v26 + v30 + 4254626195 + (((unsigned int)v28 ^ (unsigned int)v27) & (unsigned int)v33 ^ (unsigned int)v27)) * 0x1000 | (unsigned int)v26 + v30 + 4254626195 + (((unsigned int)v28 ^ (unsigned int)v27) & (unsigned int)v33 ^ (unsigned int)v27) >> 20);
        v35 = v34 + (((unsigned int)v27 + v31 + 2792965006 + (((unsigned int)v33 ^ (unsigned int)v28) & (unsigned int)v34 ^ (unsigned int)v28)) * 0x20000 | (unsigned int)v27 + v31 + 2792965006 + (((unsigned int)v33 ^ (unsigned int)v28) & (unsigned int)v34 ^ (unsigned int)v28) >> 15);
        v36 = v35 + (((unsigned int)v28 + v32 + 1236535329 + (((unsigned int)v34 ^ (unsigned int)v33) & (unsigned int)v35 ^ (unsigned int)v33)) * 0x400000 | (unsigned int)v28 + v32 + 1236535329 + (((unsigned int)v34 ^ (unsigned int)v33) & (unsigned int)v35 ^ (unsigned int)v33) >> 10);
        v37 = v36 + (((unsigned int)v33 + v6 + 4129170786 + ((unsigned int)v35 & (unsigned int)~v34) + ((unsigned int)v36 & (unsigned int)v34)) * 32 | (unsigned int)v33 + v6 + 4129170786 + ((unsigned int)v35 & (unsigned int)~v34) + ((unsigned int)v36 & (unsigned int)v34) >> 27);
        v38 = v37 + (((unsigned int)v34 + v15 + 3225465664 + ((unsigned int)v36 & (unsigned int)~v35) + ((unsigned int)v37 & (unsigned int)v35)) * 0x200 | (unsigned int)v34 + v15 + 3225465664 + ((unsigned int)v36 & (unsigned int)~v35) + ((unsigned int)v37 & (unsigned int)v35) >> 23);
        v39 = v38 + (((unsigned int)v35 + v24 + 643717713 + ((unsigned int)v37 & (unsigned int)~v36) + ((unsigned int)v38 & (unsigned int)v36)) * 0x4000 | (unsigned int)v35 + v24 + 643717713 + ((unsigned int)v37 & (unsigned int)~v36) + ((unsigned int)v38 & (unsigned int)v36) >> 18);
        v40 = v39 + (((unsigned int)v36 + v5 + 3921069994 + ((unsigned int)v38 & (unsigned int)~v37) + ((unsigned int)v39 & (unsigned int)v37)) * 0x100000 | (unsigned int)v36 + v5 + 3921069994 + ((unsigned int)v38 & (unsigned int)~v37) + ((unsigned int)v39 & (unsigned int)v37) >> 12);
        v41 = v40 + (((unsigned int)v37 + v14 + 3593408605 + ((unsigned int)v39 & (unsigned int)~v38) + ((unsigned int)v40 & (unsigned int)v38)) * 32 | (unsigned int)v37 + v14 + 3593408605 + ((unsigned int)v39 & (unsigned int)~v38) + ((unsigned int)v40 & (unsigned int)v38) >> 27);
        v42 = v41 + (((unsigned int)v38 + v23 + 38016083 + ((unsigned int)v40 & (unsigned int)~v39) + ((unsigned int)v41 & (unsigned int)v39)) * 0x200 | (unsigned int)v38 + v23 + 38016083 + ((unsigned int)v40 & (unsigned int)~v39) + ((unsigned int)v41 & (unsigned int)v39) >> 23);
        v43 = v42 + (((unsigned int)v39 + v32 + 3634488961 + ((unsigned int)v41 & (unsigned int)~v40) + ((unsigned int)v42 & (unsigned int)v40)) * 0x4000 | (unsigned int)v39 + v32 + 3634488961 + ((unsigned int)v41 & (unsigned int)~v40) + ((unsigned int)v42 & (unsigned int)v40) >> 18);
        v44 = v43 + (((unsigned int)v40 + v13 + 3889429448 + ((unsigned int)v42 & (unsigned int)~v41) + ((unsigned int)v43 & (unsigned int)v41)) * 0x100000 | (unsigned int)v40 + v13 + 3889429448 + ((unsigned int)v42 & (unsigned int)~v41) + ((unsigned int)v43 & (unsigned int)v41) >> 12);
        v45 = v44 + (((unsigned int)v41 + v22 + 568446438 + ((unsigned int)v43 & (unsigned int)~v42) + ((unsigned int)v44 & (unsigned int)v42)) * 32 | (unsigned int)v41 + v22 + 568446438 + ((unsigned int)v43 & (unsigned int)~v42) + ((unsigned int)v44 & (unsigned int)v42) >> 27);
        v46 = v45 + (((unsigned int)v42 + v31 + 3275163606 + ((unsigned int)v44 & (unsigned int)~v43) + ((unsigned int)v45 & (unsigned int)v43)) * 0x200 | (unsigned int)v42 + v31 + 3275163606 + ((unsigned int)v44 & (unsigned int)~v43) + ((unsigned int)v45 & (unsigned int)v43) >> 23);
        v47 = v46 + (((unsigned int)v43 + v8 + 4107603335 + ((unsigned int)v45 & (unsigned int)~v44) + ((unsigned int)v46 & (unsigned int)v44)) * 0x4000 | (unsigned int)v43 + v8 + 4107603335 + ((unsigned int)v45 & (unsigned int)~v44) + ((unsigned int)v46 & (unsigned int)v44) >> 18);
        v48 = v47 + (((unsigned int)v44 + v21 + 1163531501 + ((unsigned int)v46 & (unsigned int)~v45) + ((unsigned int)v47 & (unsigned int)v45)) * 0x100000 | (unsigned int)v44 + v21 + 1163531501 + ((unsigned int)v46 & (unsigned int)~v45) + ((unsigned int)v47 & (unsigned int)v45) >> 12);
        v49 = v48 + (((unsigned int)v45 + v30 + 2850285829 + ((unsigned int)v47 & (unsigned int)~v46) + ((unsigned int)v48 & (unsigned int)v46)) * 32 | (unsigned int)v45 + v30 + 2850285829 + ((unsigned int)v47 & (unsigned int)~v46) + ((unsigned int)v48 & (unsigned int)v46) >> 27);
        v50 = v49 + (((unsigned int)v46 + v7 + 4243563512 + ((unsigned int)v48 & (unsigned int)~v47) + ((unsigned int)v49 & (unsigned int)v47)) * 0x200 | (unsigned int)v46 + v7 + 4243563512 + ((unsigned int)v48 & (unsigned int)~v47) + ((unsigned int)v49 & (unsigned int)v47) >> 23);
        v51 = v50 + (((unsigned int)v47 + v16 + 1735328473 + ((unsigned int)v49 & (unsigned int)~v48) + ((unsigned int)v50 & (unsigned int)v48)) * 0x4000 | (unsigned int)v47 + v16 + 1735328473 + ((unsigned int)v49 & (unsigned int)~v48) + ((unsigned int)v50 & (unsigned int)v48) >> 18);
        v52 = v51 + (((unsigned int)v48 + v29 + 2368359562 + ((unsigned int)v50 & (unsigned int)~v49) + ((unsigned int)v51 & (unsigned int)v49)) * 0x100000 | (unsigned int)v48 + v29 + 2368359562 + ((unsigned int)v50 & (unsigned int)~v49) + ((unsigned int)v51 & (unsigned int)v49) >> 12);
        v53 = v52 + (((unsigned int)v49 + v14 + 0xfffa3942 + ((unsigned int)v51 ^ (unsigned int)v50 ^ (unsigned int)v52)) * 16 | (unsigned int)v49 + v14 + 0xfffa3942 + ((unsigned int)v51 ^ (unsigned int)v50 ^ (unsigned int)v52) >> 28);
        v54 = v53 + (((unsigned int)v50 + v21 + 2272392833 + ((unsigned int)v52 ^ (unsigned int)v51 ^ (unsigned int)v53)) * 0x800 | (unsigned int)v50 + v21 + 2272392833 + ((unsigned int)v52 ^ (unsigned int)v51 ^ (unsigned int)v53) >> 21);
        v55 = v54 + (((unsigned int)v51 + v24 + 1839030562 + ((unsigned int)v53 ^ (unsigned int)v52 ^ (unsigned int)v54)) * 0x10000 | (unsigned int)v51 + v24 + 1839030562 + ((unsigned int)v53 ^ (unsigned int)v52 ^ (unsigned int)v54) >> 16);
        v56 = v55 + (((unsigned int)v52 + v31 + 4259657740 + ((unsigned int)v54 ^ (unsigned int)v53 ^ (unsigned int)v55)) * 0x800000 | (unsigned int)v52 + v31 + 4259657740 + ((unsigned int)v54 ^ (unsigned int)v53 ^ (unsigned int)v55) >> 9);
        v57 = v56 + (((unsigned int)v53 + v6 + 2763975236 + ((unsigned int)v55 ^ (unsigned int)v54 ^ (unsigned int)v56)) * 16 | (unsigned int)v53 + v6 + 2763975236 + ((unsigned int)v55 ^ (unsigned int)v54 ^ (unsigned int)v56) >> 28);
        v58 = v57 + (((unsigned int)v54 + v13 + 1272893353 + ((unsigned int)v56 ^ (unsigned int)v55 ^ (unsigned int)v57)) * 0x800 | (unsigned int)v54 + v13 + 1272893353 + ((unsigned int)v56 ^ (unsigned int)v55 ^ (unsigned int)v57) >> 21);
        v59 = v58 + (((unsigned int)v55 + v16 + 4139469664 + ((unsigned int)v57 ^ (unsigned int)v56 ^ (unsigned int)v58)) * 0x10000 | (unsigned int)v55 + v16 + 4139469664 + ((unsigned int)v57 ^ (unsigned int)v56 ^ (unsigned int)v58) >> 16);
        v60 = v59 + (((unsigned int)v56 + v23 + 3200236656 + ((unsigned int)v58 ^ (unsigned int)v57 ^ (unsigned int)v59)) * 0x800000 | (unsigned int)v56 + v23 + 3200236656 + ((unsigned int)v58 ^ (unsigned int)v57 ^ (unsigned int)v59) >> 9);
        v61 = v60 + (((unsigned int)v57 + v30 + 681279174 + ((unsigned int)v59 ^ (unsigned int)v58 ^ (unsigned int)v60)) * 16 | (unsigned int)v57 + v30 + 681279174 + ((unsigned int)v59 ^ (unsigned int)v58 ^ (unsigned int)v60) >> 28);
        v62 = v61 + (((unsigned int)v58 + v5 + 0xeaa127fa + ((unsigned int)v60 ^ (unsigned int)v59 ^ (unsigned int)v61)) * 0x800 | (unsigned int)v58 + v5 + 0xeaa127fa + ((unsigned int)v60 ^ (unsigned int)v59 ^ (unsigned int)v61) >> 21);
        v63 = v62 + (((unsigned int)v59 + v8 + 3572445317 + ((unsigned int)v61 ^ (unsigned int)v60 ^ (unsigned int)v62)) * 0x10000 | (unsigned int)v59 + v8 + 3572445317 + ((unsigned int)v61 ^ (unsigned int)v60 ^ (unsigned int)v62) >> 16);
        v64 = v63 + (((unsigned int)v60 + v15 + 76029189 + ((unsigned int)v62 ^ (unsigned int)v61 ^ (unsigned int)v63)) * 0x800000 | (unsigned int)v60 + v15 + 76029189 + ((unsigned int)v62 ^ (unsigned int)v61 ^ (unsigned int)v63) >> 9);
        v65 = v64 + (((unsigned int)v61 + v22 + 3654602809 + ((unsigned int)v63 ^ (unsigned int)v62 ^ (unsigned int)v64)) * 16 | (unsigned int)v61 + v22 + 3654602809 + ((unsigned int)v63 ^ (unsigned int)v62 ^ (unsigned int)v64) >> 28);
        v66 = v65 + (((unsigned int)v62 + v29 + 3873151461 + ((unsigned int)v64 ^ (unsigned int)v63 ^ (unsigned int)v65)) * 0x800 | (unsigned int)v62 + v29 + 3873151461 + ((unsigned int)v64 ^ (unsigned int)v63 ^ (unsigned int)v65) >> 21);
        v67 = v66 + (((unsigned int)v63 + v32 + 530742520 + ((unsigned int)v65 ^ (unsigned int)v64 ^ (unsigned int)v66)) * 0x10000 | (unsigned int)v63 + v32 + 530742520 + ((unsigned int)v65 ^ (unsigned int)v64 ^ (unsigned int)v66) >> 16);
        v68 = v67 + (((unsigned int)v64 + v7 + 3299628645 + ((unsigned int)v66 ^ (unsigned int)v65 ^ (unsigned int)v67)) * 0x800000 | (unsigned int)v64 + v7 + 3299628645 + ((unsigned int)v66 ^ (unsigned int)v65 ^ (unsigned int)v67) >> 9);
        v69 = v68 + (((unsigned int)v65 + v5 + 4096336452 + ((unsigned int)v67 ^ ((unsigned int)v68 | (unsigned int)~v66))) * 64 | (unsigned int)v65 + v5 + 4096336452 + ((unsigned int)v67 ^ ((unsigned int)v68 | (unsigned int)~v66)) >> 26);
        v70 = v69 + (((unsigned int)v66 + v16 + 0x432aff97 + ((unsigned int)v68 ^ ((unsigned int)v69 | (unsigned int)~v67))) * 0x400 | (unsigned int)v66 + v16 + 0x432aff97 + ((unsigned int)v68 ^ ((unsigned int)v69 | (unsigned int)~v67)) >> 22);
        v71 = v70 + (((unsigned int)v67 + v31 + 2878612391 + ((unsigned int)v69 ^ ((unsigned int)v70 | (unsigned int)~v68))) * 0x8000 | (unsigned int)v67 + v31 + 2878612391 + ((unsigned int)v69 ^ ((unsigned int)v70 | (unsigned int)~v68)) >> 0x11);
        v72 = v71 + (((unsigned int)v68 + v14 + 4237533241 + ((unsigned int)v70 ^ ((unsigned int)v71 | (unsigned int)~v69))) * 0x200000 | (unsigned int)v68 + v14 + 4237533241 + ((unsigned int)v70 ^ ((unsigned int)v71 | (unsigned int)~v69)) >> 11);
        v73 = v72 + (((unsigned int)v69 + v29 + 1700485571 + ((unsigned int)v71 ^ ((unsigned int)v72 | (unsigned int)~v70))) * 64 | (unsigned int)v69 + v29 + 1700485571 + ((unsigned int)v71 ^ ((unsigned int)v72 | (unsigned int)~v70)) >> 26);
        v74 = v73 + (((unsigned int)v70 + v8 + 2399980690 + ((unsigned int)v72 ^ ((unsigned int)v73 | (unsigned int)~v71))) * 0x400 | (unsigned int)v70 + v8 + 2399980690 + ((unsigned int)v72 ^ ((unsigned int)v73 | (unsigned int)~v71)) >> 22);
        v75 = v74 + (((unsigned int)v71 + v23 + 0xffeff47d + ((unsigned int)v73 ^ ((unsigned int)v74 | (unsigned int)~v72))) * 0x8000 | (unsigned int)v71 + v23 + 0xffeff47d + ((unsigned int)v73 ^ ((unsigned int)v74 | (unsigned int)~v72)) >> 0x11);
        v76 = v75 + (((unsigned int)v72 + v6 + 2240044497 + ((unsigned int)v74 ^ ((unsigned int)v75 | (unsigned int)~v73))) * 0x200000 | (unsigned int)v72 + v6 + 2240044497 + ((unsigned int)v74 ^ ((unsigned int)v75 | (unsigned int)~v73)) >> 11);
        v77 = v76 + (((unsigned int)v73 + v21 + 1873313359 + ((unsigned int)v75 ^ ((unsigned int)v76 | (unsigned int)~v74))) * 64 | (unsigned int)v73 + v21 + 1873313359 + ((unsigned int)v75 ^ ((unsigned int)v76 | (unsigned int)~v74)) >> 26);
        v78 = v77 + (((unsigned int)v74 + v32 + 4264355552 + ((unsigned int)v76 ^ ((unsigned int)v77 | (unsigned int)~v75))) * 0x400 | (unsigned int)v74 + v32 + 4264355552 + ((unsigned int)v76 ^ ((unsigned int)v77 | (unsigned int)~v75)) >> 22);
        v79 = v78 + (((unsigned int)v75 + v15 + 2734768916 + ((unsigned int)v77 ^ ((unsigned int)v78 | (unsigned int)~v76))) * 0x8000 | (unsigned int)v75 + v15 + 2734768916 + ((unsigned int)v77 ^ ((unsigned int)v78 | (unsigned int)~v76)) >> 0x11);
        v80 = v79 + (((unsigned int)v76 + v30 + 1309151649 + ((unsigned int)v78 ^ ((unsigned int)v79 | (unsigned int)~v77))) * 0x200000 | (unsigned int)v76 + v30 + 1309151649 + ((unsigned int)v78 ^ ((unsigned int)v79 | (unsigned int)~v77)) >> 11);
        v81 = v80 + (((unsigned int)v77 + v13 + 4149444226 + ((unsigned int)v79 ^ ((unsigned int)v80 | (unsigned int)~v78))) * 64 | (unsigned int)v77 + v13 + 4149444226 + ((unsigned int)v79 ^ ((unsigned int)v80 | (unsigned int)~v78)) >> 26);
        v82 = v81 + (((unsigned int)v78 + v24 + 3174756917 + ((unsigned int)v80 ^ ((unsigned int)v81 | (unsigned int)~v79))) * 0x400 | (unsigned int)v78 + v24 + 3174756917 + ((unsigned int)v80 ^ ((unsigned int)v81 | (unsigned int)~v79)) >> 22);
        v83 = v82 + (((unsigned int)v79 + v7 + 718787259 + ((unsigned int)v81 ^ ((unsigned int)v82 | (unsigned int)~v80))) * 0x8000 | (unsigned int)v79 + v7 + 718787259 + ((unsigned int)v81 ^ ((unsigned int)v82 | (unsigned int)~v80)) >> 0x11);
        v1 = (unsigned int)v82 + a0->field_c;
        v0 = (unsigned int)v83 + a0->field_8;
        v3 = (unsigned int)v81 + a0->field_0;
        v2 = v83 + (((unsigned int)v80 + v22 + 3951481745 + ((unsigned int)v82 ^ ((unsigned int)v83 | (unsigned int)~v81))) * 0x200000 | (unsigned int)v80 + v22 + 3951481745 + ((unsigned int)v82 ^ ((unsigned int)v83 | (unsigned int)~v81)) >> 11) + a0->field_4;
        a0->field_8 = v0;
        a0->field_c = v1;
        a0->field_0 = v3;
        a0->field_4 = v2;
        a1 += 16;
        i = v4 - 1;
    } while (i);
    return a0;
}

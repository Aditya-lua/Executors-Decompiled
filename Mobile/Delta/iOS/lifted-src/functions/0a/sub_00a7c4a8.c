/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7c4a8..0xa7ca48 (1440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_a7c4a8(unsigned int *a0, unsigned int *iter, unsigned long long i)
{
    unsigned int *v2;  // x8
    unsigned long v3;  // x11
    unsigned int v12;  // w4
    unsigned int v13;  // w16
    unsigned int v14;  // w5
    unsigned int v15;  // w6
    unsigned int v16;  // w21
    unsigned int v17;  // w17
    unsigned int v18;  // w20
    unsigned int v19;  // w3
    unsigned int v20;  // w7
    unsigned int v21;  // w15
    unsigned long v4;  // x10
    unsigned int v22;  // w5
    unsigned int v23;  // w23
    unsigned int v24;  // w24
    unsigned int v25;  // w6
    unsigned int v26;  // w26
    unsigned int v27;  // w27
    unsigned int v28;  // w22
    unsigned int v29;  // w3
    unsigned int v30;  // w28
    unsigned int v31;  // w25
    unsigned long v5;  // x13
    unsigned int v32;  // w20
    unsigned int v33;  // w26
    unsigned int v34;  // w27
    unsigned int v35;  // w23
    unsigned int v36;  // w5
    unsigned int v37;  // w8
    unsigned int v38;  // w28
    unsigned int v39;  // w14
    unsigned int v40;  // w26
    unsigned int v41;  // w27
    unsigned long v6;  // x12
    unsigned int v42;  // w8
    unsigned int v43;  // w14
    unsigned int v44;  // w26
    unsigned int v45;  // w27
    unsigned int v46;  // w8
    unsigned int v47;  // w14
    unsigned int v48;  // w26
    unsigned int v49;  // w27
    unsigned int v50;  // w8
    unsigned int v51;  // w14
    unsigned long long v7;  // x2
    unsigned int v52;  // w26
    unsigned int v53;  // w27
    unsigned int v54;  // w8
    unsigned int v55;  // w14
    unsigned int v56;  // w28
    unsigned int v57;  // w19
    unsigned int v58;  // w24
    unsigned int v59;  // w8
    unsigned int v60;  // w14
    unsigned int v61;  // w4
    unsigned int v8;  // w19
    unsigned int v62;  // w19
    unsigned int v63;  // w8
    unsigned int v64;  // w14
    unsigned int v65;  // w0
    unsigned int v66;  // w4
    unsigned int v67;  // w8
    unsigned int v68;  // w14
    unsigned long long v69;  // x17
    unsigned int *v70;  // x0
    unsigned long long v71;  // x8
    unsigned int v9;  // w0
    unsigned int v72;  // w14
    unsigned int *v73;  // x8
    unsigned int v10;  // w15
    unsigned int v11;  // w3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!i)
        return a0;
    v2 = a0;
    v3 = v2[2];
    v4 = v2[3];
    v5 = *v2;
    v6 = v2[1];
    do
    {
        v7 = i;
        v8 = *iter;
        v9 = iter[1];
        v10 = __ROL__(((unsigned int)v3 & (unsigned int)v6 | (unsigned int)v4 & ~(unsigned int)v6) + (unsigned int)v5 + v8, 3);
        v11 = __ROL__(v9 + (unsigned int)v4 + ((unsigned int)v6 & v10 | (unsigned int)v3 & ~v10), 7);
        v12 = iter[2];
        v13 = iter[3];
        v14 = __ROL__(v12 + (unsigned int)v3 + (v10 & v11 | (unsigned int)v6 & ~v11), 11);
        v15 = __ROL__(v13 + (unsigned int)v6 + (v11 & v14 | v10 & ~v14), 19);
        v16 = iter[4];
        v17 = iter[5];
        v18 = __ROL__(v16 + v10 + (v14 & v15 | v11 & ~v15), 3);
        v19 = __ROL__(v17 + v11 + (v15 & v18 | v14 & ~v18), 7);
        v20 = iter[6];
        v21 = iter[7];
        v22 = __ROL__(v20 + v14 + (v18 & v19 | v15 & ~v19), 11);
        v23 = __ROL__(v21 + v15 + (v19 & v22 | v18 & ~v22), 19);
        v24 = iter[8];
        v25 = iter[9];
        v26 = __ROL__(v24 + v18 + (v22 & v23 | v19 & ~v23), 3);
        v27 = __ROL__(v25 + v19 + (v23 & v26 | v22 & ~v26), 7);
        v28 = iter[10];
        v29 = iter[11];
        v30 = __ROL__(v28 + v22 + (v26 & v27 | v23 & ~v27), 11);
        w30 = __ROL__(v29 + v23 + (v27 & v30 | v26 & ~v30), 19);
        v31 = iter[12];
        v32 = iter[13];
        v33 = __ROL__(v31 + v26 + (v30 & w30 | v27 & ~w30), 3);
        v34 = __ROL__(v32 + v27 + (w30 & v33 | v30 & ~v33), 7);
        v35 = iter[14];
        v36 = iter[15];
        v37 = __ROL__(v35 + v30 + (v33 & v34 | w30 & ~v34), 11);
        v38 = v37 & v34;
        v39 = __ROL__(v36 + w30 + (v38 | v33 & ~v37), 19);
        v40 = __ROL__(v8 + 1518500249 + v33 + (v39 & (v37 | v34) | v38), 3);
        v41 = __ROL__(v16 + 1518500249 + v34 + (v40 & (v39 | v37) | v39 & v37), 5);
        v42 = __ROL__(v24 + 1518500249 + v37 + (v41 & (v40 | v39) | v40 & v39), 9);
        v43 = __ROL__(v31 + 1518500249 + v39 + (v42 & (v41 | v40) | v41 & v40), 13);
        v44 = __ROL__(v9 + 1518500249 + v40 + (v43 & (v42 | v41) | v42 & v41), 3);
        v45 = __ROL__(v17 + 1518500249 + v41 + (v44 & (v43 | v42) | v43 & v42), 5);
        v46 = __ROL__(v25 + 1518500249 + v42 + (v45 & (v44 | v43) | v44 & v43), 9);
        v47 = __ROL__(v32 + 1518500249 + v43 + (v46 & (v45 | v44) | v45 & v44), 13);
        v48 = __ROL__(v12 + 1518500249 + v44 + (v47 & (v46 | v45) | v46 & v45), 3);
        v49 = __ROL__(v20 + 1518500249 + v45 + (v48 & (v47 | v46) | v47 & v46), 5);
        v50 = __ROL__(v28 + 1518500249 + v46 + (v49 & (v48 | v47) | v48 & v47), 9);
        v51 = __ROL__(v35 + 1518500249 + v47 + (v50 & (v49 | v48) | v49 & v48), 13);
        v52 = __ROL__(v13 + 1518500249 + v48 + (v51 & (v50 | v49) | v50 & v49), 3);
        v53 = __ROL__(v21 + 1518500249 + v49 + (v52 & (v51 | v50) | v51 & v50), 5);
        v54 = __ROL__(v29 + 1518500249 + v50 + (v53 & (v52 | v51) | v52 & v51), 9);
        v55 = __ROL__(v36 + 1518500249 + v51 + (v54 & (v53 | v52) | v53 & v52), 13);
        v56 = v55 ^ v54;
        v57 = __ROL__(v8 + 1859775393 + v52 + (v56 ^ v53), 3);
        v58 = __ROL__(v24 + 1859775393 + v53 + (v56 ^ v57), 9);
        v59 = __ROL__(v16 + 1859775393 + v54 + (v57 ^ v55 ^ v58), 11);
        v60 = __ROL__(v31 + 1859775393 + v55 + (v58 ^ v57 ^ v59), 15);
        v61 = __ROL__(v12 + 1859775393 + v57 + (v59 ^ v58 ^ v60), 3);
        v62 = __ROL__(v28 + 1859775393 + v58 + (v60 ^ v59 ^ v61), 9);
        v63 = __ROL__(v20 + 1859775393 + v59 + (v61 ^ v60 ^ v62), 11);
        v64 = __ROL__(v35 + 1859775393 + v60 + (v62 ^ v61 ^ v63), 15);
        v65 = __ROL__(v9 + 1859775393 + v61 + (v63 ^ v62 ^ v64), 3);
        v66 = __ROL__(v25 + 1859775393 + v62 + (v64 ^ v63 ^ v65), 9);
        v67 = __ROL__(v17 + 1859775393 + v63 + (v65 ^ v64 ^ v66), 11);
        v68 = __ROL__(v32 + 1859775393 + v64 + (v66 ^ v65 ^ v67), 15);
        v69 = (v13 + 1859775393 + v65 + (v67 ^ v66 ^ v68)) * 8 | v13 + 1859775393 + v65 + (v67 ^ v66 ^ v68) >> 29;
        v70 = (v29 + 1859775393 + v66 + (v68 ^ v67 ^ (unsigned int)v69)) * 0x200 | v29 + 1859775393 + v66 + (v68 ^ v67 ^ (unsigned int)v69) >> 23;
        v71 = (v21 + 1859775393 + v67 + ((unsigned int)v69 ^ v68 ^ (unsigned int)v70)) * 0x800 | v21 + 1859775393 + v67 + ((unsigned int)v69 ^ v68 ^ (unsigned int)v70) >> 21;
        v72 = v36 + 1859775393 + v68 + ((unsigned int)v70 ^ (unsigned int)v69 ^ (unsigned int)v71);
        v5 += v69;
        v3 += v71;
        v4 += (char *)v70;
        v6 += v72 * 0x8000 | v72 >> 0x11;
        v73 = a0;
        *v73 = v5;
        v73[1] = v6;
        v73[2] = v3;
        v73[3] = v4;
        iter += 16;
        i = v7 - 1;
    } while (i);
    return v70;
}

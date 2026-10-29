/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0fdb8..0xa0ff20 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a0fdb8(long long a0, uint128_t *a1)
{
    unsigned int v48;  // w8
    unsigned int v49;  // w9
    unsigned int v58;  // w0
    unsigned int v59;  // w1
    unsigned long v60;  // x2
    unsigned long v61;  // x3
    unsigned long v62;  // x4
    unsigned long v63;  // x5
    unsigned long v64;  // x6
    unsigned long v65;  // x7
    unsigned int v66;  // w20
    unsigned int v67;  // w21
    unsigned int v50;  // w10
    unsigned long long v68;  // x0
    unsigned int v51;  // w11
    unsigned int v52;  // w12
    unsigned int v53;  // w13
    unsigned int v54;  // w14
    unsigned int v55;  // w15
    unsigned int v56;  // w16
    unsigned int v57;  // w17
    char v0;  // [bp-0x188]
    unsigned int v1;  // [bp-0x160]
    unsigned int v2;  // [bp-0x15c]
    unsigned int v3;  // [bp-0x158]
    unsigned int v4;  // [bp-0x154]
    unsigned int v5;  // [bp-0x150]
    unsigned int v6;  // [bp-0x14c]
    unsigned int v7;  // [bp-0x148]
    unsigned int v8;  // [bp-0x144]
    unsigned int v9;  // [bp-0x140]
    unsigned int v10;  // [bp-0x13c]
    unsigned int v11;  // [bp-0x138]
    unsigned int v12;  // [bp-0x134]
    unsigned int v13;  // [bp-0x130]
    unsigned int v14;  // [bp-0x12c]
    unsigned int v15;  // [bp-0x128]
    unsigned int v16;  // [bp-0x124]
    unsigned int v17;  // [bp-0x120]
    unsigned int v18;  // [bp-0x11c]
    unsigned int v19;  // [bp-0x118]
    unsigned int v20;  // [bp-0x114]
    char v21;  // [bp-0xe8]
    unsigned int v22;  // [bp-0xc0]
    unsigned int v23;  // [bp-0xbc]
    unsigned int v24;  // [bp-0xb8]
    unsigned int v25;  // [bp-0xb4]
    unsigned int v26;  // [bp-0xb0]
    unsigned int v27;  // [bp-0xac]
    unsigned int v28;  // [bp-0xa8]
    unsigned int v29;  // [bp-0xa4]
    unsigned int v30;  // [bp-0xa0]
    unsigned int v31;  // [bp-0x9c]
    unsigned int v32;  // [bp-0x98]
    unsigned int v33;  // [bp-0x94]
    unsigned int v34;  // [bp-0x90]
    unsigned int v35;  // [bp-0x8c]
    unsigned int v36;  // [bp-0x88]
    unsigned int v37;  // [bp-0x84]
    unsigned int v38;  // [bp-0x80]
    unsigned int v39;  // [bp-0x7c]
    unsigned int v40;  // [bp-0x78]
    unsigned int v41;  // [bp-0x74]
    uint128_t v42;  // [bp-0x70], Other Possible Types: char
    uint128_t v43;  // [bp-0x60]
    char v44;  // [bp-0x51]
    unsigned long v45;  // [bp-0x48]
    char *v46;  // [bp-0x10]
    char v47;  // [bp+0x0]

    v46 = &v47;
    v45 = *(long long *)&g_10002b0;
    v42 = *a1;
    v43 = a1[1];
    v42 = *(char *)&v42 & 248;
    v44 = 64 | (64 | *(char *)((void*)&v43 + 15) & 63) & 63;
    sub_a0b134(&v0, &v42);
    v48 = v11;
    v49 = v12;
    v50 = v1;
    v51 = v2;
    v32 = v50 + v48;
    v33 = v51 + v49;
    v52 = v13;
    v53 = v14;
    v54 = v3;
    v55 = v4;
    v34 = v54 + v52;
    v35 = v55 + v53;
    v56 = v15;
    v57 = v16;
    v58 = v5;
    v59 = v6;
    v36 = v58 + v56;
    v37 = v59 + v57;
    v60 = v17;
    v61 = v18;
    v62 = v7;
    v63 = v8;
    v38 = (unsigned int)v62 + (unsigned int)v60;
    v39 = (unsigned int)v63 + (unsigned int)v61;
    v64 = v19;
    v65 = v20;
    v66 = v9;
    v67 = v10;
    v40 = v66 + (unsigned int)v64;
    v41 = v67 + (unsigned int)v65;
    v22 = v48 - v50;
    v23 = v49 - v51;
    v24 = v52 - v54;
    v25 = v53 - v55;
    v26 = v56 - v58;
    v27 = v57 - v59;
    v28 = v60 - v62;
    v29 = v61 - v63;
    v30 = v64 - v66;
    v31 = v65 - v67;
    sub_a0ff20(&v21, &v22, v60, v61, v62, v63, v64, v65);
    sub_a10314(&v32, &v32, &v21);
    sub_a106a8(a0, &v32);
    v68 = sub_a66ec0(&v42, 32);
    if (*(long long *)&g_10002b0 == v45)
        return v68;
    ___stack_chk_fail();
}

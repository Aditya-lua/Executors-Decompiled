/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabc5a0..0xabc7e0 (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_df8040;

long long sub_abc5a0(unsigned long long a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long long v4;  // x9
    unsigned long long v9;  // x13
    unsigned long long v10;  // x14
    unsigned long long v11;  // x15
    unsigned long long v12;  // x16
    unsigned long long v13;  // x17
    unsigned long long v14;  // x25
    unsigned long long v15;  // x19
    unsigned long long v16;  // x20
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v5;  // x8
    unsigned long long v19;  // x23
    unsigned long long v20;  // x24
    unsigned long long v21;  // x26
    unsigned long long v22;  // x28
    unsigned long long v23;  // x27
    unsigned long long v24;  // x4
    unsigned long long v25;  // x9
    unsigned long long v26;  // x9
    unsigned long long v27;  // x28
    unsigned long long v28;  // x4
    unsigned long long v29;  // x0
    unsigned long long v30;  // x1
    unsigned long long v31;  // x2
    unsigned long long v32;  // x3
    unsigned long long v33;  // x4
    unsigned long long v34;  // x6
    unsigned long long v35;  // x12
    unsigned long long v36;  // x25
    unsigned long long v6;  // x10
    unsigned long long v37;  // x24
    unsigned long long v38;  // x9
    unsigned long long v39;  // x13
    unsigned long long v40;  // x17
    unsigned long long v41;  // x21
    unsigned long long v42;  // x22
    unsigned long long v43;  // x19
    unsigned long long v44;  // x11
    unsigned long long v45;  // x8
    unsigned long long v46;  // x14
    unsigned long long v47;  // x23
    unsigned long long v48;  // x7
    unsigned long long v49;  // x16
    unsigned long long v50;  // x5
    unsigned long long v51;  // x10
    unsigned long long v52;  // x15
    unsigned long long v53;  // x20
    unsigned long long v54;  // 4264
    unsigned long long v7;  // x11
    unsigned long long v8;  // x12
    unsigned long long v0;  // [bp+0x0]
    unsigned long long v1;  // [bp+0x8]
    unsigned long long *v2;  // [bp+0x10]
    unsigned long long *v3;  // [bp+0x10]

    v2 = &g_df8040;
    do
    {
        v3 = v2;
        v0 = a4;
        v1 = v4;
        v21 = a0 ^ a5 ^ v6 ^ v11 ^ v16;
        v22 = a2 ^ a7 ^ v8 ^ v13 ^ v17;
        v23 = a1 ^ a6 ^ v7 ^ v12 ^ v18;
        x30 = a3 ^ v5 ^ v9 ^ v14 ^ v19;
        v24 = a4 ^ v4 ^ v10 ^ v15 ^ v20;
        v25 = v21 ^ __ROL__(v22, 1);
        v26 = v23 ^ __ROL__(x30, 1);
        v27 = v22 ^ __ROL__(v24, 1);
        x30 = x30 ^ __ROL__(v21, 1);
        v28 = v24 ^ __ROL__(v23, 1);
        v29 = a0 ^ v28;
        v30 = __ROL__(a6 ^ v25, 44);
        v31 = __ROL__(v8 ^ v26, 43);
        v32 = __ROL__(v14 ^ v27, 21);
        v33 = __ROL__(v20 ^ x30, 14);
        v34 = __ROL__(v1 ^ x30, 20);
        v35 = __ROL__(v9 ^ v27, 25);
        v36 = __ROL__(v13 ^ v26, 15);
        v37 = __ROL__(v18 ^ v25, 2);
        v38 = __ROL__(v17 ^ v26, 61);
        v39 = __ROL__(v15 ^ x30, 8);
        v40 = __ROL__(v7 ^ v25, 10);
        v41 = __ROL__(v5 ^ v27, 55);
        v42 = __ROL__(v10 ^ x30, 39);
        v43 = __ROL__(v19 ^ v27, 56);
        v44 = __ROL__(a7 ^ v26, 6);
        v45 = __ROL__(v12 ^ v25, 45);
        v46 = __ROL__(v16 ^ v28, 18);
        v47 = __ROL__(v11 ^ v28, 41);
        v48 = __ROL__(v6 ^ v28, 3);
        v49 = __ROL__(a5 ^ v28, 36);
        v50 = __ROL__(a3 ^ v27, 28);
        v51 = __ROL__(a1 ^ v25, 1);
        v52 = __ROL__(v0 ^ x30, 27);
        v53 = __ROL__(a2 ^ v26, 62);
        a1 = v30 ^ v32 & ~v31;
        a3 = v32 ^ v29 & ~v33;
        a4 = v33 ^ v30 & ~v29;
        a2 = v31 ^ v33 & ~v32;
        v2 = v3 + 1;
        a0 = v29 ^ v31 & ~v30 ^ *v3;
        a5 = v50 ^ v48 & ~v34;
        a6 = v34 ^ v45 & ~v48;
        v5 = v45 ^ v50 & ~v38;
        v4 = v38 ^ v34 & ~v50;
        a7 = v48 ^ v38 & ~v45;
        v6 = v51 ^ v35 & ~v44;
        v7 = v44 ^ v39 & ~v35;
        v9 = v39 ^ v51 & ~v46;
        v10 = v46 ^ v44 & ~v51;
        v8 = v35 ^ v46 & ~v39;
        v11 = v52 ^ v40 & ~v49;
        v12 = v49 ^ v36 & ~v40;
        v14 = v36 ^ v52 & ~v43;
        v15 = v43 ^ v49 & ~v52;
        v13 = v40 ^ v43 & ~v36;
        v16 = v53 ^ v42 & ~v41;
        v18 = v41 ^ v47 & ~v42;
        v19 = v47 ^ v53 & ~v37;
        v20 = v37 ^ v41 & ~v53;
        v17 = v42 ^ v37 & ~v47;
        v54 = arm64g_calculate_condition(26, v2 & 0xff, 0, 0);
    } while (v54 & 1);
    return v29 ^ v31 & ~v30 ^ *v3;
}

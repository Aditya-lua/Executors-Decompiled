/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fb4f0..0x9fb5f8 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9fb4f0(unsigned int *a0, long long a1, long long a2, unsigned long a3)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w8
    unsigned int v12;  // w9
    unsigned int v13;  // w8
    unsigned int v14;  // w10
    unsigned long long v15;  // x0
    unsigned int v16;  // w10
    unsigned int v17;  // w8
    unsigned int v18;  // w9
    unsigned int v19;  // w10
    unsigned int v20;  // w9
    unsigned int v21;  // w8
    unsigned int v4;  // w9
    unsigned int v22;  // w10
    unsigned int v23;  // w8
    unsigned int v24;  // w9
    unsigned int v25;  // w10
    unsigned int v26;  // w9
    unsigned int v27;  // w8
    unsigned int v28;  // w10
    unsigned int v5;  // w10
    unsigned int v6;  // w9
    unsigned int v7;  // w8
    unsigned int v8;  // w10
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (*a0 ^ a0[1] >> 4) & 0xf0f0f0f;
    v3 = v2 ^ *a0;
    v4 = a0[1] ^ v2 * 16;
    v5 = v4 & 0xffff ^ v3 >> 16;
    v6 = v5 ^ v4;
    v7 = v3 ^ v5 * 0x10000;
    v8 = (v7 ^ v6 >> 2) & 0x33333333;
    v9 = v8 ^ v7;
    v10 = v6 ^ v8 * 4;
    v11 = (v10 ^ v9 >> 8) & 0xff00ff;
    v12 = v11 ^ v10;
    v13 = v9 ^ v11 * 0x100;
    v14 = (v13 ^ v12 >> 1) & 0x55555555;
    *a0 = v14 ^ v13;
    a0[1] = v12 ^ v14 * 2;
    sub_9fa5c0();
    sub_9fa5c0(a0, a2, 1);
    v15 = sub_9fa5c0(a0, a1, 0);
    v16 = (*a0 ^ a0[1] >> 1) & 0x55555555;
    v17 = v16 ^ *a0;
    v18 = a0[1] ^ v16 * 2;
    v19 = (v18 ^ v17 >> 8) & 0xff00ff;
    v20 = v19 ^ v18;
    v21 = v17 ^ v19 * 0x100;
    v22 = (v21 ^ v20 >> 2) & 0x33333333;
    v23 = v22 ^ v21;
    v24 = v20 ^ v22 * 4;
    v25 = v24 & 0xffff ^ v23 >> 16;
    v26 = v25 ^ v24;
    v27 = v23 ^ v25 * 0x10000;
    v28 = (v27 ^ v26 >> 4) & 0xf0f0f0f;
    *a0 = v28 ^ v27;
    a0[1] = v26 ^ v28 * 16;
    return v15;
}

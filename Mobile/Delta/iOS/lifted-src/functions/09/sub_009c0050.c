/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0050..0x9c026c (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9c0050(unsigned long a0, unsigned long a1, void* a2)
{
    void* v2;  // x19
    unsigned int v3;  // w0
    unsigned int v12;  // w16
    unsigned int v13;  // w17
    unsigned int v14;  // w14
    unsigned int v15;  // w16
    unsigned int v16;  // w0
    unsigned int v17;  // w17
    unsigned int v18;  // w14
    unsigned int v19;  // w15
    unsigned int v20;  // w16
    unsigned int v21;  // w17
    unsigned long v4;  // x12
    unsigned int v22;  // w2
    unsigned int v23;  // w3
    unsigned int v24;  // w1
    unsigned int v25;  // w2
    unsigned int v26;  // w0
    unsigned int v27;  // w4
    unsigned int v28;  // w1
    unsigned int v29;  // w2
    unsigned int v30;  // w0
    unsigned int v31;  // w2
    unsigned long long v5;  // x10
    unsigned int v32;  // w3
    void* v33;  // x13
    unsigned int *i;  // x12
    unsigned int v35;  // w10
    unsigned int v36;  // w10
    unsigned int v37;  // w12
    unsigned int v38;  // w13
    unsigned int v39;  // w13
    unsigned int v40;  // w14
    unsigned int v41;  // w14
    void* v6;  // x11
    unsigned int v42;  // w12
    unsigned int v43;  // w13
    unsigned int v44;  // w12
    unsigned int v45;  // w10
    unsigned int v46;  // w9
    unsigned int v47;  // w8
    unsigned int v48;  // w10
    unsigned int v49;  // w13
    uint128_t v7;  // q0
    unsigned long v8;  // x11
    void* v9;  // x12
    unsigned int v10;  // w15
    void* v11;  // x13
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_9bf864();
    if (v3)
        return v3;
    v4 = (int)v2[272];
    v5 = v4 * 16;
    v6 = v2 + v5;
    v7 = *(int128_t *)v2;
    *(int128_t *)v2 = *(int128_t *)v6;
    *(uint128_t *)v6 = v7;
    if ((unsigned int)v4 >= 3)
    {
        v8 = 0;
        do
        {
            v9 = v2 + v8;
            v10 = __ROL__((int)v9[16], 24) ^ __ROL__(__ROL__((int)v9[16], 24) ^ (int)v9[16], 16);
            v11 = v2 + v5;
            v12 = __ROL__((int)v9[24], 24) ^ __ROL__(__ROL__((int)v9[24], 24) ^ (int)v9[24], 16);
            v13 = __ROL__((int)v9[28], 24) ^ __ROL__(__ROL__((int)v9[28], 24) ^ (int)v9[28], 16);
            v14 = __ROL__((int)v9[20], 24) ^ __ROL__(__ROL__((int)v9[20], 24) ^ (int)v9[20], 16) ^ v12;
            v15 = v13 ^ v12;
            v16 = v14 ^ v10;
            v17 = __ROL__(v15 ^ v16, 16);
            v18 = ((((((v13 ^ v14) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v13 ^ v14) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v13 ^ v14) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v13 ^ v14) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v19 = (0xff00ff00 & (v15 ^ v10) * 0x100 | 0xff00ff & (v15 ^ v10) >> 8) ^ v17;
            v20 = v17 ^ v18;
            v21 = v19 ^ v16;
            v22 = __ROL__(*(int *)((char *)v11 - 8), 24) ^ __ROL__(__ROL__(*(int *)((char *)v11 - 8), 24) ^ *(int *)((char *)v11 - 8), 16);
            v23 = __ROL__(*(int *)((char *)v11 - 4), 24) ^ __ROL__(__ROL__(*(int *)((char *)v11 - 4), 24) ^ *(int *)((char *)v11 - 4), 16);
            v24 = __ROL__(*(int *)((char *)v11 - 12), 24) ^ __ROL__(__ROL__(*(int *)((char *)v11 - 12), 24) ^ *(int *)((char *)v11 - 12), 16) ^ v22;
            v25 = v23 ^ v22;
            v26 = __ROL__(*(int *)((char *)v11 - 16), 24) ^ __ROL__(__ROL__(*(int *)((char *)v11 - 16), 24) ^ *(int *)((char *)v11 - 16), 16);
            v27 = v24 ^ v26;
            v28 = ((((((v23 ^ v24) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v23 ^ v24) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v23 ^ v24) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v23 ^ v24) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v29 = __ROL__(v25 ^ v27, 16);
            v30 = (0xff00ff00 & (v25 ^ v26) * 0x100 | 0xff00ff & (v25 ^ v26) >> 8) ^ v29;
            v31 = v29 ^ v28;
            v32 = v30 ^ v27;
            *(unsigned int *)&v9[16] = v32;
            *(unsigned int *)&v9[20] = v31 ^ v27;
            *(unsigned int *)&v9[24] = v32 ^ v31;
            *(unsigned int *)&v9[28] = v30 ^ v28;
            *(unsigned int *)((char *)v11 - 16) = v21;
            *(unsigned int *)((char *)v11 - 12) = v20 ^ v16;
            *(unsigned int *)((char *)v11 - 8) = v21 ^ v20;
            *(unsigned int *)((char *)v11 - 4) = v19 ^ v18;
            v8 += 16;
            v5 -= 16;
            v33 = v2 + v8;
            i = v33 + 16;
        } while (i < v11 - 32);
        v6 = v2 + v5;
        v2 = v33;
    }
    else
    {
        i = v2 + 16;
    }
    v35 = *i;
    v36 = __ROL__(v35, 24) ^ ((__ROL__(v35, 24) ^ v35) * 0x10000 | (__ROL__(v35, 24) ^ v35) >> 16);
    v37 = (int)v2[20];
    v38 = (int)v2[24];
    v39 = __ROL__(v38, 24) ^ ((__ROL__(v38, 24) ^ v38) * 0x10000 | (__ROL__(v38, 24) ^ v38) >> 16);
    v40 = (int)v2[28];
    v41 = __ROL__(v40, 24) ^ ((__ROL__(v40, 24) ^ v40) * 0x10000 | (__ROL__(v40, 24) ^ v40) >> 16);
    v42 = __ROL__(v37, 24) ^ ((__ROL__(v37, 24) ^ v37) * 0x10000 | (__ROL__(v37, 24) ^ v37) >> 16) ^ v39;
    v43 = v41 ^ v39;
    v44 = v42 ^ v36;
    v45 = __ROL__(v43 ^ v44, 16);
    v46 = ((((((v41 ^ v42) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v41 ^ v42) * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v41 ^ v42) * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (v41 ^ v42) * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v47 = (0xff00ff00 & (v43 ^ v36) * 0x100 | 0xff00ff & (v43 ^ v36) >> 8) ^ v45;
    v48 = v45 ^ v46;
    v49 = v47 ^ v44;
    *(unsigned int *)((char *)v6 - 16) = v49;
    *(unsigned int *)((char *)v6 - 12) = v48 ^ v44;
    *(unsigned int *)((char *)v6 - 8) = v49 ^ v48;
    *(unsigned int *)((char *)v6 - 4) = v47 ^ v46;
    return 0;
}

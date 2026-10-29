/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5aa94..0x5ad00 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5aa94_0 {
    char field_0;
} st_5aa94_0;


char * sub_5aa94(unsigned long a0, char *a1, int a2)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v14;  // w12
    unsigned int v15;  // w15
    unsigned int v16;  // w15
    unsigned int v17;  // w13
    unsigned int v18;  // w13
    unsigned int v19;  // w9
    unsigned int v20;  // w9
    unsigned int v21;  // w9
    unsigned int v22;  // w9
    unsigned int v23;  // w9
    unsigned int v6;  // w10
    unsigned int v24;  // w9
    unsigned int v25;  // w9
    unsigned long long v26;  // 4459
    int v27;  // w8
    unsigned int v7;  // w11
    unsigned int v8;  // w12
    unsigned int v9;  // w13
    unsigned int v10;  // w14
    unsigned int v11;  // w13
    unsigned int v12;  // w13
    unsigned int v13;  // w14
    st_5aa94_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_5aa94_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a1;
    v5 = v4 * 2;
    v6 = ~v4;
    v7 = v5 & 2;
    v8 = (v4 - (v4 | 1)) * 2 + v5 + v6 + (v7 ^ 2) + (v5 + v6 + (v7 ^ 2) & (unsigned int)(0xfffffffd - (v4 - (v4 | 1)) * 2)) + ((v4 - (v4 | 1)) * 2 + 2 | ~(v5 + v6 + (v7 ^ 2))) + 3;
    v9 = (v4 + v6 * 2 | 1) + (v4 & 1);
    v10 = v9 + ~v9 * 2 + 1;
    v11 = (v9 + v10 + v10) * 2 - v10 * 4 | 1;
    v12 = ((v11 ^ v8) + (v11 & v8) * 2 & 0xfffffffe) + (v11 ^ v8 | 0xfffffffe);
    v13 = v12 + 1;
    v14 = v13 + ~v12 * 2;
    v15 = v14 - ((v13 & 1) + v14) * 2 + 1;
    v16 = ((v15 | (v13 | 0xfffffffe) + v14) + (v15 & (v13 | 0xfffffffe) + v14)) * 3 + ~((v15 | (v13 | 0xfffffffe) + v14) + (v15 & (v13 | 0xfffffffe) + v14)) * 4;
    v17 = (v13 ^ 1) + v12 + 2 + ((unsigned int)(0xfffffffe - v12) | 1) + (v12 + 2 ^ -(v13 | 1)) + (v12 + 2 & -(v13 | 1)) * 2;
    v18 = (v17 ^ 2) + (v17 + (~v17 | 2)) * 2;
    v19 = v7 + (v5 + v4 + v6 * 4 ^ 1) + 2;
    v20 = (0xffffffff ^ v19 * 2) + v19 * 4 + 2;
    v21 = (v4 - ((v20 ^ v4 + 1) * 2 + (v20 & v4 + 1) * 4) + (-((v20 ^ v4 + 1) * 2 + (v20 & v4 + 1) * 4) * 2 ^ 0xfffffffc) + 3 | 1) + (v4 + 1 & 1);
    v22 = (v21 | 1) + (v21 & 1);
    v23 = ((__ROL__(-v22, 1) & 2 & 3) + (-v22 ^ 1)) * 2;
    v24 = v18 + 2 + v16 + ((unsigned int)(0x7ffffffd - v16) & (unsigned int)(0xfffffffe - v18)) * 2 + (((unsigned int)(0x7ffffffd - v16) | (unsigned int)(0xfffffffe - v18)) + v18 + 2) * 2 + v23 + v22 - 2 + (__ROL__(v22 - 2, 1) & 2 & 3) + (__ROL__(v22 - 2, 1) & 2 & 3 ^ 2) + (v23 | -(v22 - 2 + (__ROL__(v22 - 2, 1) & 2 & 3) + (__ROL__(v22 - 2, 1) & 2 & 3 ^ 2))) + (v22 - 2 + (__ROL__(v22 - 2, 1) & 2 & 3) + (__ROL__(v22 - 2, 1) & 2 & 3 ^ 2) - 1 & ~v23);
    v25 = (unsigned int)(0xfffffffe - v24) | 1;
    v26 = arm64g_calculate_condition(1, (v25 ^ v24 + 2) + (v25 & v24 + 2) * 2, v24 + 1 | 1, 0);
    if (v26 & 1)
        v27 = 0;
    else
        v27 = (int)(v4) >> 2;
    if (v27 != a2)
        sub_5bb24();
    return a1;
}

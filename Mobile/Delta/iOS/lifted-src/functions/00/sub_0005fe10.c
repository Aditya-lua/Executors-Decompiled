/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5fe10..0x5ff98 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5fe10_1 {
    char field_0;
} st_5fe10_1;

typedef struct st_5fe10_0 {
    struct st_5fe10_1 *field_0;
    unsigned int field_8;
} st_5fe10_0;


long long sub_5fe10(unsigned long a0, st_5fe10_0 *a1, char a2)
{
    char *v0;  // x8
    unsigned int v1;  // w8
    unsigned int v10;  // w12
    unsigned int v11;  // w9
    unsigned int v12;  // w10
    unsigned int v13;  // w12
    unsigned int v14;  // w16
    unsigned int v15;  // w13
    unsigned int v16;  // w10
    unsigned int v17;  // w8
    unsigned int v18;  // w10
    unsigned int v19;  // w8
    unsigned int v2;  // w9
    unsigned int v20;  // w9
    unsigned int v21;  // w8
    unsigned int v3;  // w10
    unsigned int v4;  // w11
    unsigned int v5;  // w12
    unsigned int v6;  // w14
    unsigned int v7;  // w10
    unsigned int v8;  // w13
    unsigned int v9;  // w9

    if (!a1->field_8)
        return a0;
    v0 = a1->field_0;
    a1->field_0 = v0 + 1;
    *v0 = a2;
    v1 = a1->field_8;
    v2 = -v1;
    v3 = ~v1;
    v4 = v1 * 2;
    v5 = v4 + v3;
    v6 = v1 + 1;
    v7 = v6 + v3 * 2;
    v8 = (v7 + 1 ^ (v2 | 1) + v1 + (v1 - 1 | 1)) + (v7 + 1 & (v2 | 1) + v1 + (v1 - 1 | 1)) * 2;
    v9 = v5 - v1 + (v5 | -(~v8 + v8 * 2)) + (~v8 + v8 * 2 - 1 | v2) + 2;
    v10 = (v5 & (unsigned int)(1 - v8)) * 2;
    v11 = (v9 | v10) + (v9 & v10);
    v12 = v7 + v4;
    v13 = v6 & 1;
    v14 = 0xfffffffe - (v1 | 0xfffffffe) - v12;
    v15 = ((v12 | 1) + v13 ^ v14) + ((v12 | 1) + v13 & v14) * 2;
    v16 = (v13 & 0xfffffffc | (v13 & 0xfffffffd | __ROL__(v1, 1) & 2) & 3) + v12 - 1;
    v17 = v6 + (v1 + ~v4) * 2 + v15 + (v16 | ~v15) + (v15 | v16);
    v18 = 1 | ((__ROL__((v17 + 1 ^ 1) - v17 * 2 - 5, 1) & 2 & 3) + ((v17 + 1 ^ 1) - v17 * 2 - 5 + (__ROL__(v17 + 1, 1) & 2 & 3) ^ 1)) * 2;
    v19 = (v18 ^ v17 + 2) + (v18 & v17 + 2) * 2;
    v20 = v11 + v19 - 1;
    v21 = v20 + (v11 + 1 + ~v11 * 2 + ((unsigned int)(1 - v19) | ~(v11 + 1 + ~v11 * 2))) * 2 + (unsigned int)(v11 + 1 + v11 + 1 + ~v11 * 2 - v19 - ((unsigned int)(1 - v19) & v11 + 1 + ~v11 * 2)) * 2;
    a1->field_8 = ((unsigned int)(0xfffffffb - v21) | 1) - (v20 | 0xfffffffe) + v21 * 2 + 6;
    return a0;
}

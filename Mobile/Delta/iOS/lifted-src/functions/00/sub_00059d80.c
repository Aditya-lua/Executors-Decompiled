/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x59d80..0x59f20 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_59d80_1 {
    char padding_0[2072];
    unsigned int field_818;
} st_59d80_1;

typedef struct st_59d80_0 {
    char field_0;
} st_59d80_0;

extern long long g_c7c2eb;

unsigned int sub_59d80(st_59d80_1 *a0, unsigned long a1)
{
    unsigned int v4;  // w9
    unsigned int v5;  // w10
    unsigned int v14;  // w10
    unsigned int v15;  // w11
    unsigned int v16;  // w10
    unsigned int v17;  // w13
    unsigned int v18;  // w9
    unsigned int v19;  // w9
    unsigned int v20;  // w10
    unsigned int v21;  // w9
    unsigned int v22;  // w11
    unsigned int v23;  // w13
    unsigned int v6;  // w12
    unsigned int v7;  // w16
    unsigned int v8;  // w17
    unsigned int v9;  // w0
    unsigned int v10;  // w16
    unsigned int v11;  // w10
    unsigned int v12;  // w10
    unsigned int v13;  // w15
    st_59d80_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_59d80_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_818;
    if (a0->field_818 == 0x100)
    {
        sub_5bb24(a0, &g_c7c2eb);
        v4 = a0->field_818;
    }
    v5 = ~v4;
    v6 = v5 * 2;
    v7 = v4 ^ 1;
    v8 = v4 * 2;
    v9 = (v8 & 2) + v7;
    v10 = v7 & 1;
    v11 = (unsigned int)(v10 + (v8 + v5 * 4 + v9 | 1) - (v8 + v5 * 4 + v9 & 0xfffffffe)) - 3;
    v12 = v4 + 2 + (v11 | ~(v4 + 2)) + (v11 | v4 + 2);
    v13 = v12 + 1;
    v14 = v4 + 1 + (v4 | 1) + (v4 + 1 + v6 | 1) - v12 * 2 + (v13 ^ 1) - 4;
    v15 = v14 + (__ROL__(v13, 1) & 2 & 3) & 0xfffffffe | v14 & 1;
    v16 = (4 & ~(v4 * 4)) + v4 + (v8 | 0xfffffffd);
    v17 = (v4 | 0xfffffffe) + v10 + (v9 + v6 | 1) + 1;
    v18 = (v17 ^ ~v6 - v4) + (v17 + (~v6 - v4 | ~v17)) * 2 + 2;
    v19 = v18 | v16;
    v20 = (v18 + v16 ^ -v19) + (v18 + v16 & -v19) * 2;
    v21 = v19 + v20 + (v19 | ~v20) + (v20 & ~v19) + 1;
    v22 = v15 + 1;
    v23 = -v21 - (v21 + ~v21 * 2 + 1 & v22);
    a0->field_818 = (v22 | v21) + (v21 + v22 ^ v23) + (v15 + v21 + (v23 | ~(v21 + v22))) * 2 + 4;
    *(unsigned long *)&a0->padding_0[24 + 8 * v4] = a1;
    return v9;
}

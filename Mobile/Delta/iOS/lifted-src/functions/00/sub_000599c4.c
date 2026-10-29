/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x599c4..0x59ce0 (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_599c4_0 {
    char field_0;
} st_599c4_0;


int sub_599c4(unsigned long a0, unsigned long a1, char *a2, unsigned int a3)
{
    unsigned int v5;  // w8
    unsigned int v6;  // w8
    unsigned int v15;  // w8
    unsigned int v16;  // w8
    unsigned int v17;  // w8
    unsigned int v18;  // w9
    unsigned int v19;  // w9
    unsigned int v20;  // w8
    unsigned int v21;  // w9
    unsigned int v22;  // w9
    unsigned int v23;  // w8
    unsigned int v24;  // w8
    unsigned int v7;  // w9
    unsigned int v25;  // w8
    unsigned int v26;  // w8
    unsigned int v27;  // w8
    unsigned int v28;  // w9
    unsigned int v29;  // w10
    unsigned int v30;  // w11
    unsigned int v31;  // w13
    unsigned int v32;  // w8
    unsigned int v33;  // w9
    unsigned int v34;  // w11
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    unsigned int v10;  // w8
    unsigned int v11;  // w10
    unsigned int v12;  // w11
    unsigned int v13;  // w10
    unsigned int v14;  // w8
    st_599c4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_599c4_0 *v1;  // [bp-0x38]
    unsigned int v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = ~a3;
    v6 = (a3 ^ 1) + ((v5 | 1) + a3) * 2 + 2;
    v7 = (a3 + v5 * 2 + (~(a3 + v5 * 2) | 1)) * 4 + ((1 & ~a3) + (a3 + v5 * 2 | 1)) * 2;
    v8 = v6 - v7 + (v7 + 2 & v6) + (v7 + 2 & ~v6) * 2 + (v7 + 2 & v6);
    v9 = v8 - 1;
    v10 = v8 - 2;
    v11 = ((a3 - 1 | 1) - a3 ^ (a3 - 1 | 1)) + ((a3 - 1 & 0x7ffffffe ^ 0x3ffffffe) + a3 + ((a3 - 1 | 1) - a3 & (a3 - 1 | 1))) * 2 + 2;
    v12 = v11 * 2;
    v13 = v9 + v12 + (((v11 * 4 ^ 0xfffffffe) + v12 | 1) & ~v10);
    v14 = v12 + (v9 - v12 + (v12 & ~v10)) * 2 + (-(v9 - v12 + (v12 & ~v10)) | v12) + (-(v9 - v12 + (v12 & ~v10)) | ~v12);
    v15 = (unsigned int)((v14 ^ 0xfffffffe) + v14 * 2 - (v14 * 2 & 2)) + 3;
    v2 = v13 + 1 - v15 + (v15 & ~v13) * 2 + (v13 + 1 + (v15 | ~v13)) * 2 - 2;
    sub_5db80();
    *a2 = 0;
    v16 = v2;
    v17 = v16 + 1;
    v18 = (v16 ^ 1) + (v17 + (~v16 | 1)) * 2 + ((__ROL__((v16 ^ 1) - 1, 1) & 2 & 3) + ((v16 ^ 1) - 1 + ~v16 * 2 + (__ROL__(v16, 1) & 2 & 3) ^ 1)) * 2 + 1;
    v19 = (__ROL__(~v18, 1) & 2 & 3) - v18 * 2 + (v18 * 2 + ~v18 ^ 1);
    v20 = (v17 + (v19 + (0xffffffff ^ v19 * 2)) * 2 | 1) + (v17 & 1);
    v21 = v20 - 1;
    v22 = v21 + (__ROL__(v20, 1) & 2 & 3) + ((-v20 | 1) + v20) * 2;
    v23 = ((__ROL__(v21, 1) & 2 & 3) + (v21 ^ 1)) * 2 - v20 * 4;
    v24 = v23 + ~v23 * 2 | 1;
    v25 = v24 - v22 + (v22 + ~v24) * 2;
    v26 = a3 - v25 + (v25 - a3 | 1) + (~v25 + a3 | 1);
    v27 = (((~v26 * 2 - v26 + v26 * 4 + 1) * 2 & 4) + (~v26 * 2 - v26 + v26 * 4 + 1 ^ 2)) * 2 - (~v26 * 2 - v26 & 1) - (((~v26 * 2 - v26 + v26 * 4 + 1) * 2 & 4) + (~v26 * 2 - v26 + v26 * 4 + 1 ^ 2) - 1 | 1);
    v28 = ~v27;
    v29 = v28 + v27 * 2;
    v30 = v29 * 2;
    v31 = v29 + (0xfffffffc & ~v30) + 2;
    v32 = (v28 | 0xfffffffe) - v27 + v30 + (v29 + (v27 & 1) ^ v31) + ((v29 + (v27 & 1) & v31) + ~(v28 | 0xfffffffe)) * 2;
    v33 = v32 + 1;
    v34 = (unsigned int)((v32 ^ 0xfffffffe) - v33 - (~v32 | 1)) + 1;
    return (v32 ^ 2) + (~v32 | 0xfffffffe) + (v32 * 2 & 4) + (v34 ^ v33) + (v33 + (v34 | ~v33)) * 2 + 2;
}

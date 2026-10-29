/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50ba8c..0x50be2c (928 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50ba8c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
} st_50ba8c_1;

typedef struct st_50ba8c_2 {
    unsigned long long field_0;
    struct st_50ba8c_1 *field_8;
    struct st_50ba8c_1 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_50ba8c_2;

typedef struct st_50ba8c_0 {
    char field_0;
} st_50ba8c_0;


st_50ba8c_2 * sub_50ba8c(st_50ba8c_2 *a0)
{
    st_50ba8c_0 *v2;  // x8
    st_50ba8c_0 **v3;  // x9
    unsigned long long v12;  // x12
    unsigned long long v13;  // x10
    unsigned long long v14;  // x13
    unsigned long long v15;  // x11
    unsigned long long v16;  // x12
    unsigned long long v17;  // x10
    st_50ba8c_1 *v18;  // x11
    unsigned long long v19;  // x10
    unsigned long long v20;  // x11
    unsigned long long v21;  // x12
    unsigned long long v4;  // x10
    unsigned long long v22;  // x10
    unsigned long long v24;  // x9
    unsigned long long v25;  // x8
    unsigned long long v26;  // x9
    unsigned long long v27;  // x10
    unsigned long long v28;  // x8
    unsigned long long v29;  // x9
    unsigned long long v30;  // x10
    unsigned long long v31;  // x8
    unsigned long long v5;  // x8
    unsigned int v32;  // w8
    unsigned int v33;  // w9
    unsigned int v34;  // w10
    unsigned int v35;  // w11
    unsigned int v36;  // w8
    unsigned int v37;  // w8
    unsigned int v38;  // w9
    unsigned int v39;  // w10
    unsigned int v40;  // w11
    unsigned int v41;  // w12
    unsigned long long v6;  // x8
    unsigned int v42;  // w10
    unsigned int v43;  // w8
    unsigned int v44;  // w11
    unsigned int v45;  // w8
    unsigned int v46;  // w9
    unsigned int v47;  // w11
    unsigned int v48;  // w8
    unsigned long v7;  // x9
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long long v10;  // x10
    unsigned long long v11;  // x11
    st_50ba8c_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int, unsigned long long
    st_50ba8c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = v1;
    v3 = v0;
    v4 = v3 | v2;
    v5 = (v4 ^ -(v3 & v2)) + (v4 & -(v3 & v2)) * 2;
    v6 = (&(~v2)[-1 * (v3 | ~v2)] ^ v4) + v5 + ((&(~v2)[-1 * (v3 | ~v2)] & v4) + ~v5) * 2;
    v7 = (2385725662774146436 & (v6 + 2) * 2) + (v6 + 2 ^ 10416234868241849026);
    v0 = v6 + 3765241909412237716;
    v1 = ~v7 + v7 * 2;
    a0->field_0 = v0 + (v1 | ~v0) + (v1 | v0) + 1;
    v8 = v1;
    v9 = v0;
    v10 = v1;
    v11 = v0;
    v12 = v10 - v11 + (v11 & ~v10) * 2;
    v13 = ((v12 | v10) ^ ~v12 - (v10 | ~v12)) + ((v12 | v10) & ~v12 - (v10 | ~v12)) * 2;
    v14 = v12 | v11;
    v15 = (v11 | ~v12) + v12;
    v16 = v14 + ~v15;
    v17 = -(((v16 | v13) ^ v15 - v14 - (v13 | v15 - v14)) + ((v16 | v13) & v15 - v14 - (v13 | v15 - v14)) * 2);
    a0->field_20 = (v17 ^ v13 ^ v16) + ((v13 ^ v16) + (v17 | ~(v13 ^ v16))) * 2 + 2;
    v18 = &a0->field_20;
    a0->field_8 = v18;
    a0->field_10 = v18;
    v19 = v9 | v8;
    v20 = (v9 | ~v8) + v8;
    v21 = v19 + ~v20;
    v22 = v20 - v19;
    v24 = (v21 ^ -v9) + ((v21 & -v9) + (v22 & v9)) * 2;
    a0->field_18 = ((v21 | v8) - ((v22 | v8) + v21) + ((v22 | v8) + v21 - (v21 | v8)) * 2 - v24 + (v24 | ~((v21 | v8) - ((v22 | v8) + v21) + ((v22 | v8) + v21 - (v21 | v8)) * 2)) - (v24 + ~v24 * 2 + 1 & (v21 | v8) + ~((v22 | v8) + v21)) + (v21 | v8) + ~((v22 | v8) + v21)) * 2 + 2;
    v25 = v1;
    v26 = v0;
    v27 = (v25 ^ -v26) + (v25 & -v26 | v26 & ~v25) * 2;
    v28 = (v27 ^ -v25) + (v25 & ~v27) * 2 + (v27 & -v25) * 2;
    v29 = (v27 | v26) - (v27 & v26);
    v30 = v28 | v29;
    v31 = v29 + (v28 | ~v29) - v30 + 1;
    a0->field_28 = (v31 ^ v30 + ~((v29 | ~v28) + v28)) + (v30 - ((v29 | ~v28) + v28) + (v31 | (v29 | ~v28) + v28 - v30)) * 2;
    v32 = v1;
    v33 = v0;
    v34 = v33 | v32;
    v35 = (~v32 - (v33 | ~v32) ^ v34) + (~v32 - (v33 | ~v32) & v34) * 2;
    v36 = v34 - ((v32 | ~v33) + v33) + v35 + (-(v34 + ~((v32 | ~v33) + v33)) & ~v35) * 2 + (unsigned int)(v35 - (v34 + ~((v32 | ~v33) + v33)) - (v35 | -(v34 + ~((v32 | ~v33) + v33)))) * 2;
    v0 = v36 + 8;
    v1 = v36 + (-v36 | 0xffffffe8) + (v36 - 1 & 23) + 23;
    a0->field_30 = v0 + (v1 | ~v0) + (v1 | v0) + 1;
    v37 = v1;
    v38 = v0;
    v39 = v37 | v38;
    v40 = (v38 | ~v37) + v37;
    v41 = v39 + ~v40;
    v42 = v40 - v39;
    v43 = v41 - v37;
    v44 = (v42 & v37) * 2;
    v45 = v43 + v44;
    v46 = (v41 ^ -v38) + ((v41 & -v38) + (v42 & v38)) * 2;
    v47 = (v46 & ~v43 - v44) + v45;
    v48 = -((v47 ^ -(v45 & v46)) + (v47 & -(v45 & v46)) * 2);
    a0->field_34 = (v48 ^ v45 ^ v46) + ((v45 ^ v46) + (v48 | ~(v45 ^ v46))) * 2 + 2;
    return a0;
}

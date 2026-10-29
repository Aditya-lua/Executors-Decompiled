/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5d8e0..0x5db80 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5d8e0_0 {
    char field_0;
} st_5d8e0_0;

extern void g_f011d0;
extern char _NSHomeDirectory;

long long sub_5d8e0(unsigned long a0, void* *a1)
{
    void* v4;  // x21
    unsigned int v5;  // w8
    unsigned int v14;  // w12
    unsigned int v15;  // w12
    unsigned int v16;  // w12
    unsigned int v17;  // w12
    unsigned int v18;  // w11
    unsigned int v19;  // w16
    unsigned int v20;  // w11
    unsigned int v21;  // w10
    unsigned int v22;  // w10
    unsigned int v23;  // w13
    unsigned int v6;  // w10
    unsigned int v24;  // w10
    unsigned int v25;  // w11
    unsigned int v26;  // w10
    unsigned int v27;  // w13
    unsigned int v28;  // w12
    unsigned int v29;  // w14
    unsigned int v30;  // w10
    unsigned int v31;  // w13
    unsigned int v32;  // w12
    unsigned int v33;  // w9
    unsigned int v7;  // w11
    unsigned int v34;  // w11
    unsigned long v37;  // cc_op
    unsigned long v38;  // cc_dep1
    unsigned long v39;  // cc_dep2
    unsigned long v40;  // cc_ndep
    unsigned long long v41;  // 4112
    unsigned long long v42;  // 4102
    unsigned int v8;  // w9
    unsigned long long v43;  // 4112
    unsigned long long v44;  // 4102
    unsigned int v9;  // w13
    unsigned int v10;  // w11
    unsigned int v11;  // w15
    unsigned int v12;  // w17
    unsigned int v13;  // w13
    st_5d8e0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_5d8e0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a1;
    v5 = *(char *)v4;
    v6 = (char)v5;
    v7 = (long long)(v5 * &_NSHomeDirectory) >> 31 & 0xfffffe00 | (v5 * 2 | v5 >> 31) & 0x1fe & 0x1ff;
    v8 = ((v6 | 1) + ~(v6 | 1) * 2 + (v6 ^ 2) - 1 + (v7 & 4) + 1 | 1) + ((v6 ^ 2) - 1 & 1);
    v9 = ~v6;
    v10 = v7 & 2;
    v11 = v10 ^ 2;
    v12 = v6 & 1;
    v13 = v9 * 2;
    v14 = ((v12 ^ 1) + (v6 ^ 0xfffffffe) & v6 + 1) * 2 - ((v12 ^ 1) + (v6 ^ 0xfffffffe) ^ v13 + v6);
    v15 = (v14 ^ v7 + v9 + v11) + (v14 & v7 + v9 + v11) * 2;
    v16 = (v15 * 2 + ~v15 ^ 0xfffffffe) + v15 * 2 - (__ROL__(~v15, 1) & 2 & 3) + 1;
    v17 = (v16 ^ v8) + (v8 + (v16 | ~v8)) * 2;
    v18 = v10 + (v6 ^ 1) + v13 + (~(v10 + (v6 ^ 1) + v13) | 1) + 1;
    v19 = v6 - 1;
    v20 = (v18 * 2 | -v6) - (v18 * 2 & v19) + (v18 + v6) * 2;
    v21 = v6 + (v11 + v19 | v12) + (v19 & v12) + ~((v11 + v19 | v12) + (v19 & v12)) * 2;
    v22 = 0xfffffffc - v21;
    v23 = (~(v21 + 2) - (v20 - 1 & v22) ^ v21 + 2 + v20) + (~(v21 + 2) - (v20 - 1 & v22) & v21 + 2 + v20) * 2;
    v24 = (v23 ^ -(v22 & -v20)) + (v23 & -(v22 & -v20)) * 2;
    v25 = 1 - v24;
    v26 = v24 - 2;
    v27 = 0xfffffffe - v17;
    v28 = v17 + 2;
    v29 = v25 + v28 + (v26 | v27);
    v30 = -(((v26 & v27) + v25 ^ v28) + ((v26 & v27) + v25 & v28) * 2);
    v31 = (v29 + (v30 | ~v29)) * 2 + 2;
    v32 = (v30 ^ v29) + v31;
    v33 = (((v17 + 3 ^ 1) - (v17 + 3) * 2 + ((v17 + 3) * 2 & 2) | v25) + v17 + 3) * 2;
    v34 = v33 - 2;
    if (((v32 + v34 ^ -(v32 | v34)) + (v32 + v34 & -(v32 | v34)) * 2 ^ v32 - v33 + ((v30 ^ ~v29) - v31 & v34) * 2 + (v32 & v34) + 3) + ((v32 + v34 ^ -(v32 | v34)) + (v32 + v34 & -(v32 | v34)) * 2 & v32 - v33 + ((v30 ^ ~v29) - v31 & v34) * 2 + (v32 & v34) + 3) * 2 + 1 != (((v32 + v34 ^ -(v32 | v34)) + (v32 + v34 & -(v32 | v34)) * 2 ^ v32 - v33 + ((v30 ^ ~v29) - v31 & v34) * 2 + (v32 & v34) + 3) + ((v32 + v34 ^ -(v32 | v34)) + (v32 + v34 & -(v32 | v34)) * 2 & v32 - v33 + ((v30 ^ ~v29) - v31 & v34) * 2 + (v32 & v34) + 3) * 2) * 2)
    {
        v41 = arm64g_calculate_condition(v37 | 16, v38, v39, v40);
        v42 = arm64g_calculate_condition(0x33, (v41 & 1 ? v5 & 0xff : 0), (v41 & 1 ? 4 : 0), 0);
        if (!(v42 & 1))
            goto LABEL_5db30;
    }
    else
    {
        v43 = arm64g_calculate_condition(v37 | 16, v38, v39, v40);
        v44 = arm64g_calculate_condition(48, (v43 & 1 ? v5 & 0xff : 0), (v43 & 1 ? 4 : 0), 0);
        if (!(v44 & 1))
        {
LABEL_5db30:
            if (v4 == &g_f011d0)
                sub_5bb24();
            sub_5bb24();
        }
    }
    *a1 = (long long)v4[8];
    return *(long long *)v4;
}

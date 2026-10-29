/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x197f90..0x198884 (2292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_197f90_0 {
    char field_0;
} st_197f90_0;

typedef struct st_197f90_5 {
    unsigned long long field_0;
} st_197f90_5;

typedef struct st_197f90_2 {
    char padding_0[257];
    char field_101;
} st_197f90_2;

typedef struct st_197f90_4 {
    char padding_0[376];
    struct st_197f90_5 *field_178;
} st_197f90_4;

typedef struct st_197f90_3 {
    char padding_0[96];
    struct st_197f90_2 *field_60;
} st_197f90_3;

extern st_197f90_3 *g_f0d198;
extern st_197f90_4 *g_f0d3d8;

void sub_197f90(long long a0)
{
    unsigned long long v17;  // d9
    unsigned long long v18;  // d8
    unsigned long long v27;  // x30
    char v28;  // x0
    long long v29;  // x0
    unsigned long long v19;  // x26
    unsigned long long v20;  // x25
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    st_197f90_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_197f90_0 *v1;  // [bp-0xb8]
    st_197f90_0 *v2;  // [bp-0xb0]
    st_197f90_0 **v3;  // [bp-0x68], Other Possible Types: char
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = &v16;
    v15 = v27;
    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v28 = sub_e1864(a0, 1);
        if (v28 && *(long long *)(v28 + 24))
            g_f0d3d8->field_178();
    }
    v29 = sub_c60dac(a0);
    sub_60b78(&v2);
    __Unwind_Resume(v29);
}

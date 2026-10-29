/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x197e08..0x197f90 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_197e08_0 {
    char field_0;
} st_197e08_0;

typedef struct st_197e08_4 {
    unsigned long long field_0;
} st_197e08_4;

typedef struct st_197e08_1 {
    char padding_0[257];
    char field_101;
} st_197e08_1;

typedef struct st_197e08_3 {
    char padding_0[72];
    struct st_197e08_4 *field_48;
} st_197e08_3;

typedef struct st_197e08_2 {
    char padding_0[96];
    struct st_197e08_1 *field_60;
} st_197e08_2;

extern st_197e08_2 *g_f0d198;
extern st_197e08_3 *g_f0d3d8;

void sub_197e08(long long a0)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    char v24;  // x0
    st_197e08_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_197e08_0 *v1;  // [bp-0x68]
    st_197e08_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_197e08_0 *v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = &v14;
    v13 = v23;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v24 = sub_e1864(a0, 1);
        if (v24 && *(long long *)(v24 + 24))
            g_f0d3d8->field_48();
    }
    sub_c60dac(a0);
}

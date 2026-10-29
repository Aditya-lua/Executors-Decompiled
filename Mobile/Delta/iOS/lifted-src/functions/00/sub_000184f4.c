/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x184f4..0x186bc (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_184f4_1 {
    char padding_0[88];
    long long field_58;
    char padding_60[32];
    unsigned int field_80;
    uint128_t field_84;
    char padding_94[12];
    long long field_a0;
    char padding_a8[48];
    long long field_d8;
    char padding_e0[72];
    unsigned long long field_128;
} st_184f4_1;

typedef struct st_184f4_2 {
    char padding_0[20];
    unsigned long long field_14;
} st_184f4_2;

typedef struct st_184f4_0 {
    char field_0;
} st_184f4_0;


long long sub_184f4(st_184f4_1 *a0, unsigned long long *a1, long long a2, long long a3)
{
    st_184f4_1 *v15;  // x19
    char v16;  // x2
    char v17;  // x3
    char v18;  // x4
    st_184f4_1 *v19;  // x0
    unsigned long v20;  // x22
    st_184f4_2 *v21;  // x24
    unsigned long v22;  // x23
    long long v23;  // x0
    st_184f4_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_184f4_0 *v1;  // [bp-0xc8]
    unsigned long v2;  // [bp-0xc0]
    unsigned long v3;  // [bp-0xb8]
    unsigned long v4;  // [bp-0xb0]
    uint128_t v5;  // [bp-0xa8]
    unsigned long v6;  // [bp-0x90]
    char v7;  // [bp-0x88]
    char v8;  // [bp-0x80]
    unsigned long v9;  // [bp-0x78]
    char v10;  // [bp-0x70]
    char v11;  // [bp-0x68]
    char v12;  // [bp-0x58]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = a0;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_80 == 299)
        return sub_186bc(v15);
    sub_107a4(v15, "type name");
    if (!(v12 & 1))
    {
        v4 = *(long long *)&v15->padding_e0[56];
        v5 = *(int128_t *)&(&v15->field_80)[1];
        sub_19994(&v10, &v4);
    }
    v8 = 0;
    v9 = 0xffffffffffffffff;
    v6 = 0xffffffffffffffff;
    v7 = 0;
    if ((char)v15->field_58 == 1)
    {
        v16 = (char)&v9;
        v17 = (char)&v7;
        v18 = (char)&v6;
        v19 = v15;
    }
    else
    {
        v16 = 0;
        v17 = 0;
        v18 = 0;
        v19 = v15;
    }
    sub_11190(v19, 1, v16, v17, v18);
    if (sub_1f3d4(v15, 61, "type alias"))
        v20 = *(long long *)&v15->padding_94[0];
    else
        v20 = 0xffffffffffffffff;
    v21 = sub_12740(v15, 0);
    v2 = *a1;
    v3 = *(long long *)&(v21->padding_0)[1];
    v22 = sub_404c(*(long long *)&v15->padding_a8[32], 104);
    sub_6f98(v22, &v2, &v10, &v11, &v4, (char *)&v5 + 8, v21, a2);
    if ((char)v15->field_58 != 1)
        return v22;
    v23 = sub_404c(*(long long *)&v15->padding_a8[32], 56);
    sub_86a4(v23, a3, v9, v7, v8, v6, v20);
    v2 = v22;
    sub_1c9f0(&v15[3].padding_a8[40], &v2);
    *(long long *)(sub_12484(&v15[3].padding_a8[40], &v2) + 8) = v23;
    return v22;
}

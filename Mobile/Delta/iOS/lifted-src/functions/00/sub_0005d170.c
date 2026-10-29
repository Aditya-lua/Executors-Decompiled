/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5d170..0x5d310 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5d170_1 {
    char padding_0[2072];
    unsigned int field_818;
} st_5d170_1;

typedef struct st_5d170_2 {
    struct st_5d170_2 *field_0;
    char field_1;
    char padding_2[5];
    struct st_5d170_2 *field_7;
    struct st_5d170_2 *field_8;
} st_5d170_2;

typedef struct st_5d170_0 {
    char field_0;
} st_5d170_0;

extern st_5d170_2 g_f011d0;

st_5d170_2 * sub_5d170(st_5d170_1 *a0, st_5d170_2 *a1, char a2)
{
    st_5d170_2 *v4;  // x0
    unsigned int v5;  // w8
    unsigned int v14;  // w9
    unsigned int v15;  // w8
    unsigned int v16;  // w10
    unsigned int v17;  // w11
    unsigned int v18;  // w12
    unsigned int v19;  // w10
    unsigned int v20;  // w11
    unsigned int v21;  // w8
    unsigned int v22;  // w9
    unsigned int v23;  // w9
    unsigned int v6;  // w9
    unsigned int v7;  // w10
    unsigned int v8;  // w11
    unsigned int v9;  // w8
    unsigned int v10;  // w12
    unsigned int v11;  // w10
    unsigned int v12;  // w12
    unsigned int v13;  // w8
    st_5d170_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_5d170_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1 || *((char *)&a1->field_0 + 7))
    {
        v4 = sub_60194(a0);
        v4->field_0 = 0;
        *(struct st_5d170_2 ***)&v4->field_1 = &g_f011d0.field_0;
        *(char *)&v4->field_0 = 21;
        if (a1)
        {
            *(st_5d170_2 **)&a1->field_1 = v4;
            v5 = a0->field_818;
            v6 = ~v5 * 2;
            v7 = v5 - (v5 + v6 + 1) * 4 + (v5 + v6 + v5 + v6 + 1) * 2;
            v8 = v7 + 2;
            v9 = v6 + v5 * 2 ^ 0xfffffffe;
            v10 = v9 * 2 - v8 + (v8 | ~(v9 * 2));
            v11 = (v7 + 3 ^ v10) + (v7 + 3 & v10) * 2;
            v12 = 1 | __ROL__(v9 >> 1, 2) & 0xfffffffc;
            v13 = v12 + v8 + (v12 + (v9 * 4 ^ 0xfffffffe) | ~v8) + 1;
            v14 = v11 ^ v13;
            v15 = v14 + (v11 & v13) * 2;
            v16 = ~v15;
            v17 = v15 * 2;
            v18 = v17 + v16;
            v19 = (v18 ^ 1) + (__ROL__(v16, 1) & 2 & 3) - v17 + 1;
            v20 = v18 - 1;
            v21 = v20 + (__ROL__(v14, 1) & 2 & 3) + (v15 - (v18 | 1)) * 2;
            v22 = ((v19 ^ 1) + (__ROL__(v19, 1) & 2 & 3)) * 2 - 3;
            v23 = ((-v18 | 1) + v18) * 2;
            a0->field_818 = (((v23 | v20) ^ 1) + (v23 & v20)) * 2 - ((v22 ^ v21) + (v22 & v21) * 2) + ((v22 ^ v21) + (v22 & v21) * 2) * 2 - 1;
        }
    }
    else
    {
        v4 = a1;
    }
    *((char *)v4 + _strlen((char *)&v4->field_0 + 1) + 1) = a2;
    return v4;
}

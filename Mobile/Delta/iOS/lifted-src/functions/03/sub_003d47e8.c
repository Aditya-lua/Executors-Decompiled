/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d47e8..0x3d4920 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d47e8_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[2068];
    unsigned short field_834;
    char padding_836[1];
    char field_837;
} st_3d47e8_1;

typedef struct st_3d47e8_0 {
    char field_0;
} st_3d47e8_0;


st_3d47e8_1 * sub_3d47e8(st_3d47e8_1 *a0, unsigned int a1)
{
    unsigned long idx;  // x20
    st_3d47e8_1 *v5;  // x21
    int v14;  // w9
    int i;  // w8
    unsigned int v16;  // w9
    unsigned int v17;  // w10
    int v18;  // w9
    int v19;  // w11
    unsigned long v6;  // x1
    st_3d47e8_1 *v7;  // x0
    unsigned long v8;  // x8
    unsigned long long v9;  // x8
    unsigned long v10;  // x9
    char *v11;  // x10
    char *v12;  // x8
    int v13;  // w8
    st_3d47e8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3d47e8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    idx = &a0[15].padding_20[1176];
    v1 = &v0;
    v0 = &v1;
    v5 = &a0->padding_0[4 * a1];
    v6 = v5->field_834;
    v7 = a0;
    if (!(v6 >> 15 & 1))
        v7 = sub_3d47e8(a0, v6);
    v8 = *(int *)(idx + 2144);
    if (*(int *)(idx + 2136) <= (int)v8)
        return v7;
    v9 = *(int *)(idx + 2140) + v8;
    v10 = a0->field_8;
    *(char *)(a0->field_18 + ((int)(((int)v9 < 0 ? (unsigned int)v9 + 3 : (unsigned int)v9)) >> 2)) = 1;
    v11 = *(long long *)(idx + 2104) + v5->field_837 * 4;
    if (v11[3] >= 129)
    {
        v12 = v10 + v9;
        *v12 = v11[2];
        v12[1] = v11[1];
        v12[2] = *v11;
        v12[3] = v11[3];
    }
    v13 = *(int *)(idx + 2140) + 4;
    *(int *)(idx + 2140) = v13;
    if (v13 < *(int *)(idx + 2132))
        return v7;
    *(int *)(idx + 2140) = *(int *)(idx + 2124);
    v14 = *(int *)(idx + 2144) + *(int *)(idx + 2116);
    *(int *)(idx + 2144) = v14;
    i = *(int *)(idx + 2136);
    if (v14 < i)
        return v7;
    v16 = *(int *)(idx + 2112);
    do
    {
        v17 = v16 - 1;
        if ((int)v16 < 1)
            break;
        v18 = *(int *)(idx + 2148) << ((char)v16 & 31);
        *(int *)(idx + 2116) = v18;
        v19 = *(int *)(idx + 2128) + (v18 >> 1);
        *(int *)(idx + 2144) = v19;
        *(unsigned int *)(idx + 2112) = v17;
        v16 = v17;
    } while (i <= v19);
    return v7;
}

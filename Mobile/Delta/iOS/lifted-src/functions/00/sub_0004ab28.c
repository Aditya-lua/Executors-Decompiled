/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ab28..0x4abf4 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ab28_1 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_4ab28_1;

typedef struct st_4ab28_2 {
    char padding_0[88];
    char field_58;
} st_4ab28_2;

typedef struct st_4ab28_0 {
    char field_0;
} st_4ab28_0;


double sub_4ab28(st_4ab28_2 *a0, long long a1, unsigned long a2, void* a3)
{
    st_4ab28_1 *v5;  // x0
    unsigned long long v6;  // x8
    uint128_t v7;  // q0
    unsigned long v8;  // d0
    unsigned long v9;  // d0
    unsigned long v10;  // d0
    char v11;  // x8
    unsigned long v12;  // d0
    unsigned long v13;  // d0
    st_4ab28_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_4ab28_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a2;
    v0 = &v1;
    if (*(int *)a3)
    {
        if (*(int *)a3 != 8)
        {
            sub_4c57c();
            sub_4d8f0(a1, &v2);
            v5 = sub_436f8(a1, &v2);
            v6 = (long long)a3[32];
            v7 = (int128_t)a3[16];
            *(int128_t *)(v5->padding_0)[1] = *(int128_t *)a3;
            *(uint128_t *)((char *)&v5->field_8 + 8) = v7;
            *(unsigned long long *)((char *)&v5->field_18 + 8) = v6;
            return v8;
        }
        return v9;
    }
    else
    {
        if (a0->field_58 & 1)
            return v10;
        v11 = sub_3a7e0(a1, &v2);
        if (v11)
        {
            sub_4c57c(a0, a1, v2, v11 + 8);
            *(unsigned int *)(v11 + 8) = 0;
            return v13;
        }
        return v12;
    }
}

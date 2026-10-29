/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a564..0x4a628 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a564_1 {
    char padding_0[16];
    char field_10;
} st_4a564_1;

typedef struct st_4a564_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_4a564_2;

typedef struct st_4a564_3 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_4a564_3;

typedef struct st_4a564_0 {
    char field_0;
} st_4a564_0;


double sub_4a564(long long *a0, unsigned long a1, st_4a564_2 *a2)
{
    st_4a564_1 *v5;  // x0
    char idx;  // x8
    st_4a564_3 *v7;  // x0
    unsigned long long v8;  // x8
    uint128_t v9;  // q0
    unsigned long v10;  // d0
    unsigned long v11;  // d0
    unsigned long v12;  // d0
    st_4a564_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_4a564_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v5 = sub_34930(a0[2], &v2);
    idx = (char)(struct st_4a564_1 *)&v5->padding_0[8];
    if (!v5)
        idx = 0;
    if (*(char *)(idx + 8) & 1)
    {
        return v12;
    }
    else if ((int)a2->field_0 == 8)
    {
        *(char *)(idx + 9) = 0;
        sub_460d4(a0 + 16, &v2);
        v7 = sub_436f8(a0 + 16, &v2);
        v8 = a2->field_20;
        v9 = a2->field_10;
        *(uint128_t *)(v7->padding_0)[1] = a2->field_0;
        *(uint128_t *)((char *)&v7->field_8 + 8) = v9;
        *(unsigned long long *)((char *)&v7->field_18 + 8) = v8;
        return v10;
    }
    else
    {
        *(char *)(idx + 9) = (int)a2->field_0 != 0;
        sub_4a864(a0, a0[3], v2, a2);
        return v11;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c57c..0x4c624 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c57c_2 {
    char padding_0[168];
    struct st_4c57c_1 *field_a8;
} st_4c57c_2;

typedef struct st_4c57c_1 {
    uint128_t field_0;
    char field_8;
    char padding_9[7];
    uint128_t field_10;
    unsigned long long field_20;
} st_4c57c_1;

typedef struct st_4c57c_0 {
    char field_0;
} st_4c57c_0;


st_4c57c_1 * sub_4c57c(st_4c57c_2 *a0, long long a1, unsigned long a2, st_4c57c_1 *a3)
{
    st_4c57c_1 *v10;  // x8
    st_4c57c_1 *v11;  // x8
    st_4c57c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_4c57c_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    st_4c57c_1 *v3;  // [bp-0x58], Other Possible Types: uint128_t
    st_4c57c_1 *v4;  // [bp-0x48], Other Possible Types: uint128_t
    st_4c57c_1 *v5;  // [bp-0x38], Other Possible Types: unsigned long
    st_4c57c_1 *v6;  // [bp-0x30]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v7 = a2;
    if (!a0->field_a8)
        return a0->field_a8;
    if (!a3)
    {
        v10 = sub_3a7e0(a1, &v7);
        a2 = v7;
        if (v10)
        {
            a3 = (char *)&v10->field_0 + 8;
            goto LABEL_4c5d0;
        }
        else
        {
            v2 = a2;
            v3 = (st_4c57c_1 *)0;
            v4 = (st_4c57c_1 *)0;
            v5 = 0;
            v11 = (st_4c57c_1 *)1;
        }
    }
    else
    {
LABEL_4c5d0:
        v11 = (st_4c57c_1 *)0;
        v2 = a2;
        v3 = a3->field_0;
        v4 = *(int128_t *)&a3->field_8;
        v5 = a3->field_10;
    }
    v6 = v11;
    return sub_15fe8();
}

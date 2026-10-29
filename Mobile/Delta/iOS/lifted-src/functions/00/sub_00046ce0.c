/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x46ce0..0x46d54 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_46ce0_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_46ce0_2;

typedef struct st_46ce0_1 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_46ce0_1;

typedef struct st_46ce0_0 {
    char field_0;
} st_46ce0_0;


double sub_46ce0(long long a0, unsigned long a1)
{
    st_46ce0_1 *v5;  // x0
    uint128_t v6;  // q0
    uint128_t v7;  // q1
    st_46ce0_2 *ptr;  // x8
    st_46ce0_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_46ce0_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v5 = sub_3a7e0(a0 + 264, &v2);
    if (!v5)
    {
        memset(ptr, 0, 40);
        return 0;
    }
    v6 = *(int128_t *)(v5->padding_0)[1];
    v7 = *(int128_t *)((char *)&v5->field_8 + 8);
    ptr->field_0 = v6;
    ptr->field_10 = v7;
    ptr->field_20 = *(long long *)((char *)&v5->field_18 + 8);
    return (unsigned long long)v6;
}

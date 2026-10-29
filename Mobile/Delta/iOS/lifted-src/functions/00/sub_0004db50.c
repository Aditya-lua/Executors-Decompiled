/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4db50..0x4dbfc (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4db50_1 {
    char padding_0[8];
    struct st_4db50_1 *field_8;
    char padding_10[8];
    uint128_t field_18;
    unsigned long long field_28;
} st_4db50_1;

typedef struct st_4db50_0 {
    char field_0;
} st_4db50_0;


st_4db50_1 * sub_4db50(st_4db50_1 *a0, void* *a1)
{
    void* i;  // x21
    void* v5;  // x22
    void* v6;  // x1
    st_4db50_1 *v7;  // x0
    unsigned long v8;  // x8
    uint128_t v9;  // q0
    st_4db50_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4db50_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    i = a1[1];
    if (i == *a1)
        return a0;
    do
    {
        v5 = i;
        i -= 56;
        v6 = i;
        if (*((char *)v5 - 8) != 1)
        {
            sub_4d8f0(a0, v6);
            v7 = sub_436f8(a0, i);
            v8 = *(long long *)((char *)v5 - 16);
            v9 = *(int128_t *)((char *)v5 - 32);
            *(int128_t *)&v7->field_8 = *(int128_t *)((char *)v5 - 48);
            *(uint128_t *)(v7->padding_10)[1] = v9;
            *(unsigned long *)((char *)&v7->field_18 + 8) = v8;
        }
        else
        {
            v7 = sub_3a7e0(a0, v6);
            if (v7)
                *(unsigned int *)&v7->field_8 = 0;
        }
    } while (i != *a1);
    return v7;
}

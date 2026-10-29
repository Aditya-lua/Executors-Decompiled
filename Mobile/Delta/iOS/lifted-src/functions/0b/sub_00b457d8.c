/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb457d8..0xb45918 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b457d8_1 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    uint128_t field_68;
    uint128_t field_78;
    struct st_b457d8_0 *field_88;
    struct st_b457d8_0 *field_8c;
} st_b457d8_1;

typedef struct st_b457d8_0 {
    struct st_b457d8_0 *field_0;
    unsigned int field_8;
    char padding_c[12];
    unsigned long long field_18;
} st_b457d8_0;


st_b457d8_0 * sub_b457d8(st_b457d8_1 *a0, st_b457d8_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_b457d8_0 *v9;  // x0
    st_b457d8_0 *v10;  // x0
    st_b457d8_0 *v11;  // x0
    st_b457d8_0 *v12;  // x0
    st_b457d8_0 *v13;  // x0
    st_b457d8_0 *v14;  // x0
    st_b457d8_0 *v15;  // x0
    long long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a1)
        return 1;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    if (!a1->field_0)
        return 1;
    if (sub_a6fbc4(a1, "size"))
    {
        v9 = sub_a70ef8();
        if (!(unsigned int)v9)
            return v9;
        v10 = sub_ac280c((a0->padding_0)[1], v0);
        if (!(unsigned int)v10)
            return v10;
        v11 = sub_ac280c((char *)&a0->field_38 + 8, v0);
        if (!(unsigned int)v11)
            return v11;
    }
    if (sub_a6fbc4(a1, "c-rounds"))
    {
        v12 = sub_a6ffcc();
        if (!(unsigned int)v12)
            return v12;
    }
    if (sub_a6fbc4(a1, "d-rounds"))
    {
        v13 = sub_a6ffcc();
        if (!(unsigned int)v13)
            return v13;
    }
    v14 = sub_a6fbc4(a1, "key");
    if (v14)
    {
        if (v14->field_8 == 5 && v14->field_18 == 16)
        {
            v15 = sub_ac2860();
            if (!(unsigned int)v15)
                return v15;
            *(int128_t *)((char *)&a0->field_38 + 8) = *(int128_t *)(a0->padding_0)[1];
            *(int128_t *)((char *)&a0->field_48 + 8) = *(int128_t *)((char *)&a0->field_8 + 8);
            *(int128_t *)((char *)&a0->field_58 + 8) = *(int128_t *)((char *)&a0->field_18 + 8);
            *(int128_t *)((char *)&a0->field_68 + 8) = *(int128_t *)((char *)&a0->field_28 + 8);
        }
        else
        {
            return 0;
        }
    }
    return 1;
}

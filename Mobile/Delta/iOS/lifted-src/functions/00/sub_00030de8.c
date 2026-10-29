/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30de8..0x30ef8 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_30de8_0 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned int field_20;
    char padding_24[4];
    char field_28;
    char padding_29[23];
    char field_40;
    char padding_41[23];
    uint128_t field_58;
    unsigned long long field_68;
} st_30de8_0;


long long sub_30de8(unsigned long a0, st_30de8_0 *a1, st_30de8_0 *a2, st_30de8_0 *a3)
{
    st_30de8_0 *v8;  // x22
    st_30de8_0 *iter;  // x23
    unsigned long v10;  // x8
    unsigned long v0;  // [bp-0x70]
    st_30de8_0 **v1;  // [bp-0x68]
    char *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: int
    st_30de8_0 *v4;  // [bp-0x50]
    st_30de8_0 *v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v3 = 0;
    if (a1 != a2)
    {
        v8 = a3;
        iter = a1;
        do
        {
            sub_5c38(v8, iter);
            v10 = iter->field_18;
            v8->field_20 = iter->field_20;
            v8->field_18 = v10;
            sub_5c38(&v8->field_28, &iter->field_28);
            sub_5c38(&v8->field_40, &iter->field_40);
            memset((v8->padding_41)[1], 0, 24);
            *(int128_t *)&(v8->padding_41)[1] = *(int128_t *)&(iter->padding_41)[1];
            *(long long *)((char *)&v8->field_58 + 8) = *(long long *)((char *)&iter->field_58 + 8);
            memset((iter->padding_41)[1], 0, 24);
            sub_5c38(&v8->field_68, &iter->field_68);
            v8 = &v5[1].padding_0[16];
            v5 = v8;
            iter = &iter[1].padding_0[16];
        } while (iter != a2);
    }
    v3 = 1;
    sub_29f54(a0, a1, a2);
    return sub_2dae0(&v0);
}

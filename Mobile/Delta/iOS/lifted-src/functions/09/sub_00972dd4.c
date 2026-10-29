/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972dd4..0x972f40 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_972dd4_1 {
    char field_0[21];
    char field_d;
    char padding_e[10];
    struct st_972dd4_0 *field_18;
    struct st_972dd4_0 *field_20;
    struct st_972dd4_0 *field_28;
    unsigned int field_30;
    char padding_34[4];
    uint128_t field_38;
    unsigned long long field_48;
    struct st_972dd4_0 *field_50;
} st_972dd4_1;

typedef struct st_972dd4_0 {
    char field_0[21];
    char field_d;
    char padding_e[10];
    struct st_972dd4_0 *field_18;
    struct st_972dd4_0 *field_20;
    struct st_972dd4_0 *field_28;
    unsigned int field_30;
    char padding_34[4];
    struct st_972dd4_0 *field_38;
    char padding_40[8];
    unsigned long long field_48;
    struct st_972dd4_0 *field_50;
} st_972dd4_0;

extern st_972dd4_0 g_972f40;

st_972dd4_0 * sub_972dd4(st_972dd4_1 *a0)
{
    st_972dd4_0 *v2;  // x19
    st_972dd4_0 *v3;  // x0
    st_972dd4_0 *v4;  // x0
    st_972dd4_0 *v5;  // x0
    st_972dd4_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(248, "ssl/quic/qlog.c", 57);
    if (!v2)
        return v2;
    *(int128_t *)&v2->field_0[0] = *(int128_t *)&a0->field_0[0];
    *(long long *)&v2->field_0[13] = *(long long *)&a0->field_0[13];
    *(int *)&v2->field_28 = (int)a0->field_28;
    *(int128_t *)&v2->field_30 = *(int128_t *)&a0->field_30;
    *(long long *)v2->padding_40 = *(long long *)((char *)&a0->field_38 + 8);
    if ((!*(long long *)&a0->padding_e[2] || (v3 = sub_a6d9b4(*(long long *)&a0->padding_e[2], "ssl/quic/qlog.c", 69), *(st_972dd4_0 **)&v2->padding_e[2] = v3, v3)) && (!a0->field_18 || (v4 = sub_a6d9b4(a0->field_18, "ssl/quic/qlog.c", 73), v2->field_18 = v4, v4)) && (!a0->field_20 || (v5 = sub_a6d9b4(a0->field_20, "ssl/quic/qlog.c", 77), v2->field_20 = v5, v5)) && (!a0->field_48 || (v6 = sub_a6d9b4(a0->field_48, "ssl/quic/qlog.c", 82), v2->field_48 = v6, v6)) && sub_971c5c(&v2[1].field_30, 0, 5))
    {
        if (*(long long *)&v2->field_30)
            return v2;
        *(char **)&v2->field_30 = &g_972f40.field_0[0];
        return v2;
    }
    sub_a6c2e4(*(long long *)&v2->padding_e[2], "ssl/quic/qlog.c", 97);
    sub_a6c2e4(v2->field_18, "ssl/quic/qlog.c", 98);
    sub_a6c2e4(v2->field_20, "ssl/quic/qlog.c", 99);
    sub_a6c2e4(v2->field_48, "ssl/quic/qlog.c", 100);
    sub_a6c2e4(v2, "ssl/quic/qlog.c", 101);
    return 0;
}

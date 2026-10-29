/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95ccec..0x95cdd0 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95ccec_0 {
    unsigned long long field_0;
    char field_1;
    char padding_2[310];
    char field_138;
    char padding_139[11];
    char field_144;
    char padding_145[3];
    char field_148;
    char padding_149[15];
    unsigned long long field_158;
    char padding_160[32];
    char field_180;
    char padding_181[1295];
    unsigned long long field_690;
} st_95ccec_0;

typedef struct st_95ccec_1 {
    char padding_0[24];
    struct st_95ccec_0 *field_18;
    struct st_95ccec_0 *field_20;
    struct st_95ccec_0 *field_28;
    struct st_95ccec_0 *field_30;
    struct st_95ccec_0 *field_38;
    struct st_95ccec_0 *field_40;
    char field_48;
    char padding_49[7];
    struct st_95ccec_0 *field_50;
    char field_58;
} st_95ccec_1;


st_95ccec_0 * sub_95ccec(st_95ccec_1 *a0, st_95ccec_0 *a1)
{
    st_95ccec_0 *i;  // x22
    st_95ccec_0 *v3;  // x0
    st_95ccec_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_18 = a1;
    a0->field_20 = 0;
    if (a0->field_38)
    {
        i = 0;
        do
        {
            sub_a6c2e4(*(long long *)((char *)a0->field_30 + 0x8 * i), "ssl/ssl_conf.c", 1104);
            i = (char *)&i->field_0 + 1;
        } while (i < a0->field_38);
    }
    v3 = sub_a6c2e4(a0->field_30, "ssl/ssl_conf.c", 1105);
    a0->field_30 = 0;
    a0->field_38 = 0;
    if (!a1)
    {
        a0->field_28 = 0;
        *(uint128_t *)&a0->field_40 = 0;
        *(uint128_t *)&a0->field_50 = 0;
        return v3;
    }
    a0->field_28 = &a1->padding_2[303];
    a0->field_50 = &a1->padding_139[4];
    *(st_95ccec_0 **)&a0->field_58 = &a1->padding_139[8];
    a0->field_40 = *(long long *)&a1->padding_149[8] + 28;
    *(st_95ccec_0 **)&a0->field_48 = &a1->padding_160[24];
    v4 = sub_a6bffc(*(long long *)&a1->padding_181[1287] * 8 + 72, "ssl/ssl_conf.c", 1189);
    a0->field_30 = v4;
    if (!v4)
        return v4;
    a0->field_38 = *(long long *)&a1->padding_181[1287] + 9;
    return v4;
}

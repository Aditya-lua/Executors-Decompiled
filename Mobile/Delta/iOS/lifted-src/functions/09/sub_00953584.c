/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953584..0x95361c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953584_3 {
    char padding_0[8];
    struct st_953584_2 *field_8;
} st_953584_3;

typedef struct st_953584_0 {
    char padding_0[288];
    long long field_120;
} st_953584_0;

typedef struct st_953584_1 {
    char padding_0[1264];
    struct st_953584_0 *field_4f0;
    char padding_4f8[1936];
    unsigned long long field_c88;
} st_953584_1;

typedef struct st_953584_2 {
    unsigned long long field_0;
    char padding_8[32];
    struct st_953584_3 *field_28;
    struct st_953584_3 *field_30;
    unsigned long long field_38;
} st_953584_2;


st_953584_3 * sub_953584(st_953584_1 *a0)
{
    st_953584_3 *v2;  // x0
    st_953584_2 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_954348(a0->field_4f0->field_120);
    if (!v2)
        return v2;
    while (1)
    {
        v3 = v2->field_8;
        if ((int)v3->field_28 && v3->field_30 && a0->field_c88 != v3->field_38)
            v3->field_30->field_8();
        sub_9aca2c(v3);
        sub_954264(v2);
        v2 = sub_954348(a0->field_4f0->field_120);
        if (!v2)
            return v2;
    }
}

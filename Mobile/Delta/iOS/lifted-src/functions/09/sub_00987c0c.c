/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x987c0c..0x987c88 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_987c0c_0 {
    char padding_0[8];
    struct st_987c0c_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    long long field_20;
    struct st_987c0c_0 *field_28;
} st_987c0c_0;

typedef struct st_987c0c_1 {
    struct st_987c0c_0 *field_0;
    char padding_8[36];
    struct st_987c0c_0 *field_2c;
} st_987c0c_1;


st_987c0c_1 * sub_987c0c(st_987c0c_1 *a0)
{
    st_987c0c_0 *v2;  // x22
    st_987c0c_0 *v3;  // x22
    st_987c0c_0 *v4;  // x21
    st_987c0c_0 *v5;  // x22
    st_987c0c_1 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!a0->field_0)
        return a0;
    do
    {
        v3 = v2;
        v4 = v3;
        v5 = v3->field_8;
        if (*(int *)&(a0->padding_8)[1] && v4->field_28)
            sub_a66ec0(v4->field_28, v4->field_18 - v4->field_10);
        sub_9842b4(v4->field_20);
        v6 = sub_a6c2e4(v4, "ssl/quic/quic_sf_list.c", 27);
        v2 = v5;
    } while (v3->field_8);
    return v6;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971cd0..0x971da8 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971cd0_0 {
    char padding_0[23];
    long long field_17;
    struct st_971cd0_0 *field_1f;
    struct st_971cd0_0 *field_27;
    struct st_971cd0_0 *field_2f;
} st_971cd0_0;

typedef struct st_971cd0_1 {
    char padding_0[8];
    struct st_971cd0_0 *field_8;
    char padding_10[1];
    char field_11;
    char padding_12[22];
    long long field_28;
    struct st_971cd0_0 *field_30;
    struct st_971cd0_0 *field_38;
    struct st_971cd0_0 *field_40;
} st_971cd0_1;


st_971cd0_0 * sub_971cd0(st_971cd0_1 *a0)
{
    st_971cd0_0 *v3;  // x8
    st_971cd0_0 *v4;  // x20
    st_971cd0_0 *v5;  // w0
    st_971cd0_0 *v6;  // x20
    st_971cd0_0 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = a0->field_40;
    if (a0->field_40)
    {
        v4 = 0;
        do
        {
            v5 = (st_971cd0_0 *)(unsigned int)sub_9d4248(a0->field_28, a0->field_30 + v4, v3 - v4, &v0);
            v3 = a0->field_40;
            if (!v5)
            {
                _memmove(a0->field_30, a0->field_30 + v4, v3 - v4);
                v6 = 0;
                a0->field_40 = 0;
                goto LABEL_971d58;
            }
        } while ((v4 += v0, v4 < v3));
    }
    a0->field_40 = 0;
    sub_9d46fc(a0->field_28, 11, 0, 0);
    v6 = 1;
LABEL_971d58:
    sub_a6c2e4(a0->field_30, "ssl/quic/json_enc.c", 35);
    a0->field_30 = 0;
    a0->field_38 = 0;
    if (a0->field_8 != &a0->field_11)
        sub_a6c2e4(a0->field_8, "ssl/quic/json_enc.c", 253);
    a0->field_8 = 0;
    return v6;
}

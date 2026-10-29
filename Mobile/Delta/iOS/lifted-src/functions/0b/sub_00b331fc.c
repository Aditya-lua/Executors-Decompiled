/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb331fc..0xb333bc (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b331fc_0 {
    struct st_b331fc_0 *field_0;
} st_b331fc_0;

typedef struct st_b331fc_1 {
    long long field_0;
    struct st_b331fc_0 *field_8;
    char field_10;
    char padding_11[23];
    char field_28;
    char padding_29[7];
    char field_30;
    char padding_31[7];
    char field_38;
    char padding_39[7];
    char field_40;
    char padding_41[7];
    char field_48;
    char padding_49[7];
    char field_50;
    char padding_51[7];
    struct st_b331fc_0 *field_58;
    unsigned int field_60;
} st_b331fc_1;


st_b331fc_0 ** sub_b331fc(st_b331fc_1 *a0, st_b331fc_0 **a1)
{
    long long v3;  // x0
    long long v4;  // x21
    st_b331fc_0 **v5;  // x0
    st_b331fc_0 **v6;  // x0
    st_b331fc_0 **v7;  // x0
    unsigned long long v8;  // 4112
    st_b331fc_0 **v9;  // x0
    st_b331fc_0 **v10;  // x0
    st_b331fc_0 **v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9f2aec(a0->field_0);
    if (!a1 || !*a1)
        return 1;
    v4 = v3;
    v5 = sub_afe4cc(&a0->field_8, a1, 0, 0, 0, v4);
    if (!(unsigned int)v5)
        return v5;
    if (a0->field_8 && (sub_a5842c(sub_954340(a0->field_8), "KMAC128") || sub_a5842c(sub_954340(a0->field_8), "KMAC256")))
        a0->field_60 = 1;
    if (sub_a6fbc4(a1, "digest"))
    {
        v6 = sub_afe114(&a0->field_10, a1, v4);
        if (!(unsigned int)v6)
        {
            return v6;
        }
        else if (sub_a50b14(sub_954340(&a0->field_10)))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/sskdf.c", 581, "sskdf_common_set_ctx_params");
            sub_a36abc(57, 183, 0);
            return 0;
        }
    }
    v7 = sub_a718d4(a1, "secret", &a0->field_28, &a0->field_30);
    v8 = arm64g_calculate_condition(0x11, v7 & 0xffffffff, 1, 0);
    if (!(v8 & 1))
        v7 = sub_a718d4(a1, "key", &a0->field_28, &a0->field_30);
    if (!(unsigned int)v7)
        return v7;
    v9 = sub_a71994(a1, "info", &a0->field_38, &a0->field_40, 0);
    if (!(unsigned int)v9)
        return v9;
    v10 = sub_a718d4(a1, "salt", &a0->field_48, &a0->field_50);
    if (!(unsigned int)v10)
    {
        return v10;
    }
    else if (sub_a6fbc4(a1, "maclen"))
    {
        if (!sub_a70ef8())
        {
            return 0;
        }
        else if (v0)
        {
            a0->field_58 = v0;
        }
        else
        {
            return 0;
        }
    }
    return 1;
}

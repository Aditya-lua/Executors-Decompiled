/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb323f4..0xb32630 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b323f4_0 {
    struct st_b323f4_0 *field_0;
    char padding_8[16];
    struct st_b323f4_0 *field_18;
} st_b323f4_0;

typedef struct st_b323f4_5 {
    struct st_b323f4_0 *field_0;
    char field_8;
    char padding_9[7];
    struct st_b323f4_0 *field_10;
    struct st_b323f4_0 *field_18;
} st_b323f4_5;

typedef struct st_b323f4_4 {
    struct st_b323f4_0 *field_0;
    struct st_b323f4_0 *field_8;
    char field_10;
    char padding_11[7];
    struct st_b323f4_0 *field_18;
    struct st_b323f4_0 *field_20;
} st_b323f4_4;

typedef struct st_b323f4_3 {
    struct st_b323f4_0 *field_0;
    struct st_b323f4_0 *field_8;
    struct st_b323f4_0 *field_10;
    char field_18;
    char padding_19[7];
    struct st_b323f4_0 *field_20;
    struct st_b323f4_0 *field_28;
} st_b323f4_3;

typedef struct st_b323f4_2 {
    struct st_b323f4_0 *field_0;
    struct st_b323f4_0 *field_8;
    struct st_b323f4_0 *field_10;
    struct st_b323f4_0 *field_18;
    char field_20;
    char padding_21[7];
    struct st_b323f4_0 *field_28;
    struct st_b323f4_0 *field_30;
} st_b323f4_2;

typedef struct st_b323f4_1 {
    long long field_0;
    char field_8;
    char padding_9[23];
    struct st_b323f4_0 *field_20;
    struct st_b323f4_0 *field_28;
    struct st_b323f4_0 *field_30;
    struct st_b323f4_0 *field_38;
    char field_40;
    char padding_41[7];
    struct st_b323f4_0 *field_48;
    struct st_b323f4_0 *field_50;
} st_b323f4_1;


st_b323f4_0 * sub_b323f4(st_b323f4_1 *a0, st_b323f4_0 *a1)
{
    long long v3;  // x0
    st_b323f4_0 *v4;  // x0
    st_b323f4_4 *v13;  // x23
    st_b323f4_5 *v14;  // x23
    st_b323f4_0 *v15;  // x0
    st_b323f4_0 *v16;  // x0
    st_b323f4_1 *v17;  // x22
    st_b323f4_0 **v18;  // x23
    st_b323f4_0 **v19;  // x23
    st_b323f4_0 *v20;  // x0
    st_b323f4_0 *v21;  // x0
    unsigned int v22;  // w8
    unsigned long long v23;  // 4124
    st_b323f4_0 *v6;  // x0
    st_b323f4_1 *v7;  // x22
    st_b323f4_2 *v8;  // x23
    st_b323f4_3 *v9;  // x23
    st_b323f4_0 *v10;  // x0
    st_b323f4_0 *v11;  // x0
    st_b323f4_1 *v12;  // x22
    st_b323f4_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9f2aec(a0->field_0);
    if (!a1 || !a1->field_0)
        return 1;
    if (sub_a6fbc4(a1, "digest"))
    {
        v4 = sub_afe114(&a0->field_8, a1, v3);
        if (!(unsigned int)v4)
        {
            return v4;
        }
        else if (sub_a50b14(sub_954340(&a0->field_8)))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/sshkdf.c", 233, "kdf_sshkdf_set_ctx_params");
            sub_a36abc(57, 183, 0);
            return 0;
        }
    }
    v6 = sub_a6fbc4(a1, "key");
    if (v6)
    {
        v7 = a0;
        v8 = &v7->field_20;
        v9 = &v8->field_8;
        sub_a6c4e8(v7->field_20, v8->field_8, "providers/implementations/kdfs/sshkdf.c", 121);
        v9->field_0 = 0;
        v8->field_0 = 0;
        v10 = sub_a71440(v6, v8, 0, v9);
        if (!(unsigned int)v10)
            return v10;
    }
    v11 = sub_a6fbc4(a1, "xcghash");
    if (v11)
    {
        v12 = a0;
        v13 = &v12->field_30;
        v14 = &v13->field_8;
        sub_a6c4e8(v12->field_30, v13->field_8, "providers/implementations/kdfs/sshkdf.c", 121);
        v14->field_0 = 0;
        v13->field_0 = 0;
        v15 = sub_a71440(v11, v13, 0, v14);
        if (!(unsigned int)v15)
            return v15;
    }
    v16 = sub_a6fbc4(a1, "session_id");
    if (v16)
    {
        v17 = a0;
        v18 = &v17->field_48;
        v19 = v18 + 1;
        sub_a6c4e8(v17->field_48, v18[1], "providers/implementations/kdfs/sshkdf.c", 121);
        *v19 = 0;
        *v18 = 0;
        v20 = sub_a71440(v16, v18, 0, v19);
        if (!(unsigned int)v20)
            return v20;
    }
    v21 = sub_a6fbc4(a1, "type");
    if (v21)
    {
        if (!sub_a71bcc())
            return 0;
        if (!v0)
            return 0;
        if (v21->field_18 != 1)
            return 0;
        v22 = (char)v0->field_0;
        v23 = arm64g_calculate_condition(129, v22 - 71, 7, 0);
        if (!(v23 & 1))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/sshkdf.c", 273, "kdf_sshkdf_set_ctx_params");
            sub_a36abc(57, 138, 0);
            return 0;
        }
        a0->field_40 = v22;
    }
    return 1;
}

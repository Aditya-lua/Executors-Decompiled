/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3433c..0xb346e0 (932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3433c_1 {
    long long field_0;
    char field_8;
    char padding_9[23];
    struct st_b3433c_0 *field_20;
    char field_28;
    char padding_29[7];
    struct st_b3433c_0 *field_30;
    char field_38;
    char padding_39[7];
    struct st_b3433c_0 *field_40;
    struct st_b3433c_0 *field_48;
    struct st_b3433c_0 *field_50;
    struct st_b3433c_0 *field_58;
    char field_60;
    char padding_61[7];
    char field_68;
    char padding_69[7];
    char field_70;
    char padding_71[7];
    char field_78;
    char padding_79[7];
    unsigned long long field_80;
    unsigned long long field_88;
    unsigned long long field_90;
    struct st_b3433c_0 *field_98;
} st_b3433c_1;

typedef struct st_b3433c_0 {
    struct st_b3433c_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_b3433c_0 *field_10;
    struct st_b3433c_0 *field_18;
} st_b3433c_0;

extern char g_ee4d78;

unsigned long long sub_b3433c(st_b3433c_1 *a0, st_b3433c_0 *a1)
{
    long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v13;  // x0
    st_b3433c_0 *v14;  // x0
    unsigned long long v15;  // x0
    st_b3433c_0 *v16;  // x0
    unsigned long long v17;  // x0
    st_b3433c_0 *v18;  // x0
    unsigned long long v19;  // x0
    unsigned long long *v20;  // x8
    unsigned long long v21;  // x9
    st_b3433c_0 *v5;  // x0
    unsigned long long v6;  // x0
    st_b3433c_0 *v7;  // x0
    unsigned long long v8;  // x0
    st_b3433c_0 *v9;  // x0
    unsigned long long v10;  // x0
    st_b3433c_0 *v11;  // x0
    unsigned long long v12;  // x0
    unsigned long v0;  // [bp-0x38]
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
            sub_a369bc("providers/implementations/kdfs/x942kdf.c", 548, "x942kdf_set_ctx_params");
            sub_a36abc(57, 183, 0);
            return 0;
        }
    }
    v5 = sub_a6fbc4(a1, "secret");
    if (v5 || (v5 = sub_a6fbc4(a1, "key"), v5))
    {
        if (v5->field_18 && v5->field_10)
        {
            sub_a6c2e4(a0->field_20, "providers/implementations/kdfs/x942kdf.c", 419);
            a0->field_20 = 0;
            v6 = sub_a71440(v5, &a0->field_20, 0, &a0->field_28);
            if (!(unsigned int)v6)
                return v6;
        }
    }
    v7 = sub_a6fbc4(a1, "acvp-info");
    if (v7 && v7->field_18 && v7->field_10)
    {
        sub_a6c2e4(a0->field_30, "providers/implementations/kdfs/x942kdf.c", 419);
        a0->field_30 = 0;
        v8 = sub_a71440(v7, &a0->field_30, 0, &a0->field_38);
        if (!(unsigned int)v8)
            return v8;
    }
    v9 = sub_a6fbc4(a1, "partyu-info");
    if (v9 || (v9 = sub_a6fbc4(a1, "ukm"), v9))
    {
        if (v9->field_18 && v9->field_10)
        {
            sub_a6c2e4(a0->field_40, "providers/implementations/kdfs/x942kdf.c", 419);
            a0->field_40 = 0;
            v10 = sub_a71440(v9, &a0->field_40, 0, &a0->field_60);
            if (!(unsigned int)v10)
                return v10;
        }
    }
    v11 = sub_a6fbc4(a1, "partyv-info");
    if (v11 && v11->field_18 && v11->field_10)
    {
        sub_a6c2e4(a0->field_48, "providers/implementations/kdfs/x942kdf.c", 419);
        a0->field_48 = 0;
        v12 = sub_a71440(v11, &a0->field_48, 0, &a0->field_68);
        if (!(unsigned int)v12)
            return v12;
    }
    if (sub_a6fbc4(a1, "use-keybits"))
    {
        v13 = sub_a6fc2c();
        if (!(unsigned int)v13)
            return v13;
    }
    v14 = sub_a6fbc4(a1, "supp-pubinfo");
    if (v14)
    {
        if (v14->field_18 && v14->field_10)
        {
            sub_a6c2e4(a0->field_50, "providers/implementations/kdfs/x942kdf.c", 419);
            a0->field_50 = 0;
            v15 = sub_a71440(v14, &a0->field_50, 0, &a0->field_70);
            if (!(unsigned int)v15)
                return v15;
        }
        *(unsigned int *)&a0->field_98 = 0;
    }
    v16 = sub_a6fbc4(a1, "supp-privinfo");
    if (v16 && v16->field_18 && v16->field_10)
    {
        sub_a6c2e4(a0->field_58, "providers/implementations/kdfs/x942kdf.c", 419);
        a0->field_58 = 0;
        v17 = sub_a71440(v16, &a0->field_58, 0, &a0->field_78);
        if (!(unsigned int)v17)
            return v17;
    }
    v18 = sub_a6fbc4(a1, "cekalg");
    if (v18)
    {
        if (v18->field_8 == 4)
        {
            v19 = sub_b34cec();
            if (!(unsigned int)v19)
                return v19;
            v20 = &(&g_ee4d78)[32 * v0];
            v21 = v20[1];
            a0->field_90 = v20[2];
            a0->field_80 = v20[3];
            a0->field_88 = v21;
        }
        else
        {
            return 0;
        }
    }
    return 1;
}

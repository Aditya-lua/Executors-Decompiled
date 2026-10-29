/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44bf8..0xb44d4c (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44bf8_0 {
    struct st_b44bf8_0 *field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
} st_b44bf8_0;

typedef struct st_b44bf8_1 {
    char padding_0[40];
    struct st_b44bf8_0 *field_28;
} st_b44bf8_1;


st_b44bf8_0 * sub_b44bf8(st_b44bf8_1 *a0, st_b44bf8_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_b44bf8_0 *v9;  // x0
    st_b44bf8_0 *v10;  // x0
    st_b44bf8_0 *v11;  // x0
    st_b44bf8_0 *v12;  // x0
    st_b44bf8_0 *v13;  // x0
    st_b44bf8_0 *v0;  // [bp-0x28]
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
    {
LABEL_b44d38:
        return 1;
    }
    if (sub_a6fbc4(a1, "xof"))
    {
        v9 = sub_a6fc2c();
        if (!(unsigned int)v9)
            return v9;
    }
    if (sub_a6fbc4(a1, "size"))
    {
        v0 = 0;
        if (!sub_a70ef8())
            return 0;
        if (v0 >= 0x200000)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/macs/kmac_prov.c", 474, "kmac_set_ctx_params");
            sub_a36abc(57, 217, 0);
        }
        else
        {
            a0->field_28 = v0;
            goto LABEL_b44cac;
        }
        return 0;
    }
LABEL_b44cac:
    v10 = sub_a6fbc4(a1, "key");
    if (v10)
    {
        v11 = sub_b44eac(a0, v10->field_10, v10->field_18);
        if (!(unsigned int)v11)
            return v11;
    }
    v12 = sub_a6fbc4(a1, "custom");
    if (v12)
    {
        if (v12->field_18 >= 513)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/macs/kmac_prov.c", 497, "kmac_set_ctx_params");
            sub_a36abc(57, 111, 0);
            return 0;
        }
        v13 = sub_b44ff4(&a0[15].padding_0[20], &a0[1].padding_0[8], v12->field_10);
        if (!(unsigned int)v13)
            return v13;
    }
    goto LABEL_b44d38;
}

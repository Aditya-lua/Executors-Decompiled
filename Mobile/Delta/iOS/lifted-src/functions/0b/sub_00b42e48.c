/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb42e48..0xb42fc4 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b42e48_0 {
    struct st_b42e48_0 *field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
} st_b42e48_0;


st_b42e48_0 * sub_b42e48(long long a0, st_b42e48_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    long long v9;  // x1
    st_b42e48_0 *v10;  // x0
    st_b42e48_0 *v11;  // x0
    st_b42e48_0 *v12;  // x0
    st_b42e48_0 *v13;  // x0
    unsigned long long v0;  // [bp-0x28]
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
        return 1;
    if (!sub_a6fbc4(a1, "size"))
    {
LABEL_b42ea8:
        v10 = sub_a6fbc4(a1, "key");
        if (v10)
        {
            v11 = sub_b42fc4(a0, v10->field_10, v10->field_18);
            if (!(unsigned int)v11)
                return v11;
        }
        v12 = sub_a6fbc4(a1, "custom");
        if (v12)
        {
            if ((unsigned long long)v12->field_18 >= 0x11)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/macs/blake2_mac_impl.c", 220, "blake2_mac_set_ctx_params");
                v9 = 111;
            }
            else
            {
                sub_b0c9c0(a0 + 240, v12->field_10);
                goto LABEL_b42f50;
            }
        }
        else
        {
LABEL_b42f50:
            v13 = sub_a6fbc4(a1, "salt");
            if (!v13)
                return 1;
            if ((unsigned long long)v13->field_18 >= 0x11)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/macs/blake2_mac_impl.c", 232, "blake2_mac_set_ctx_params");
                v9 = 112;
            }
            else
            {
                sub_b0c9f4(a0 + 240, v13->field_10);
                return 1;
            }
        }
    }
    else if (sub_a70ef8() && 63 >= v0 - 1)
    {
        sub_b0c9b0(a0 + 240, (unsigned int)v0 & 0xff);
        goto LABEL_b42ea8;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/macs/blake2_mac_impl.c", 203, "blake2_mac_set_ctx_params");
        v9 = 113;
    }
    sub_a36abc(57, v9, 0);
    return 0;
}

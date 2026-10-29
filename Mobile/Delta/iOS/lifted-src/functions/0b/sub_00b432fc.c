/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb432fc..0xb43478 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b432fc_0 {
    struct st_b432fc_0 *field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
} st_b432fc_0;


st_b432fc_0 * sub_b432fc(long long a0, st_b432fc_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    long long v9;  // x1
    st_b432fc_0 *v10;  // x0
    st_b432fc_0 *v11;  // x0
    st_b432fc_0 *v12;  // x0
    st_b432fc_0 *v13;  // x0
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
LABEL_b4335c:
        v10 = sub_a6fbc4(a1, "key");
        if (v10)
        {
            v11 = sub_b43478(a0, v10->field_10, v10->field_18);
            if (!(unsigned int)v11)
                return v11;
        }
        v12 = sub_a6fbc4(a1, "custom");
        if (v12)
        {
            if ((unsigned long long)v12->field_18 >= 9)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/macs/blake2_mac_impl.c", 220, "blake2_mac_set_ctx_params");
                v9 = 111;
            }
            else
            {
                sub_b0e7a0(a0 + 128, v12->field_10);
                goto LABEL_b43404;
            }
        }
        else
        {
LABEL_b43404:
            v13 = sub_a6fbc4(a1, "salt");
            if (!v13)
                return 1;
            if ((unsigned long long)v13->field_18 >= 9)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/macs/blake2_mac_impl.c", 232, "blake2_mac_set_ctx_params");
                v9 = 112;
            }
            else
            {
                sub_b0e7d4(a0 + 128, v13->field_10);
                return 1;
            }
        }
    }
    else if (sub_a70ef8() && 31 >= v0 - 1)
    {
        sub_b0c9b0(a0 + 128, (unsigned int)v0 & 0xff);
        goto LABEL_b4335c;
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

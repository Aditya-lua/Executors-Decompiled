/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1469c..0xb147e4 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b1469c_1 {
    long long field_0;
    char field_8;
    char padding_9[255];
    struct st_b1469c_0 *field_108;
} st_b1469c_1;

typedef struct st_b1469c_0 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_b1469c_0;


long long * sub_b1469c(long long a0, long long a1, st_b1469c_1 *a2)
{
    long long v7;  // x0
    long long *v8;  // x19
    unsigned long long v9;  // 4118
    unsigned int v10;  // w0
    long long *v11;  // x20
    unsigned long v0;  // [bp-0x50]
    char v1;  // [bp-0x48]
    int v2;  // [bp-0x44]
    long long *v3;  // [bp-0x40]
    long long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = sub_9f2aec(a2->field_0);
    v3 = 0;
    v8 = sub_9ca7fc(0, a0, a1);
    if (v8 && sub_9ca8cc(0, &v4, &v2, &v3, v8))
    {
        sub_9cf830(0, &v1, 0, v3);
        v9 = arm64g_calculate_condition(1, v1, 1, 0);
        if (!(v9 & 1))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/decode_der2key.c", 657, "slh_dsa_d2i_PKCS8");
            v0 = a2->field_108->field_0;
            sub_a36abc(57, 249, "unexpected parameters with a PKCS#8 %s private key");
        }
        else
        {
            v10 = sub_a99eac(*v3);
            if (v10 == a2->field_108->field_18)
            {
                v11 = sub_ac3874(v7, &a2->field_8, a2->field_108->field_0);
                if (!v11)
                {
                    sub_9ca820(v8);
                    sub_ac39b4(v11);
                    return 0;
                }
                else if (sub_ac4064(v11, v4, v2))
                {
                    sub_9ca820(v8);
                    return v11;
                }
                else
                {
                    sub_9ca820(v8);
                    sub_ac39b4(v11);
                    return 0;
                }
            }
        }
    }
    sub_9ca820(v8);
    sub_ac39b4(0);
    return 0;
}

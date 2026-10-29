/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb27a78..0xb27c28 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b27a78_0 {
    unsigned long long field_0;
    char padding_8[56];
    long long field_40;
    long long field_48;
} st_b27a78_0;


unsigned long long sub_b27a78(long long a0, unsigned long long a1, unsigned long long a2)
{
    st_b27a78_0 *v3;  // x19
    unsigned long long v4;  // x21
    long long v13;  // x1
    unsigned long long v5;  // x22
    unsigned long long v6;  // x0
    unsigned long long v7;  // x23
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    long long v11;  // x1
    unsigned long long v12;  // x2
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0 || !a1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/ml_dsa_codecs.c", 415, "ossl_ml_dsa_key_to_text");
        v13 = 786690;
        v12 = 0;
        goto LABEL_b27c08;
    }
    v3 = sub_c4c40(a1);
    v4 = sub_a01e1c(a1);
    v5 = sub_a8002c(a1);
    v6 = sub_a7f878(a1);
    if (v4)
    {
        if (!(a2 & 1))
        {
            if (a2 >> 1 & 1)
            {
                v0 = v3->field_0;
                if (1 <= (int)sub_9d524c(a0, "%s Public-Key:\n"))
                    return sub_a2fd10(a0, "pub:", v4, v3->field_48) != 0;
            }
            else
            {
                return sub_a2fd10(a0, "pub:", v4, v3->field_48) != 0;
            }
        }
        else
        {
            if (v5)
            {
                v7 = v6;
                v0 = v3->field_0;
                if ((int)sub_9d524c(a0, "%s Private-Key:\n") >= 1)
                {
                    if (v7)
                    {
                        v8 = sub_a2fd10(a0, "seed:", v7, 32);
                        if (!(unsigned int)v8)
                            return v8;
                    }
                    v9 = sub_a2fd10(a0, "priv:", v5, v3->field_40);
                    if (!(unsigned int)v9)
                        return v9;
                    return sub_a2fd10(a0, "pub:", v4, v3->field_48) != 0;
                }
            }
            else
            {
                sub_a368c8();
                v11 = 432;
LABEL_b27bec:
                sub_a369bc("providers/implementations/encode_decode/ml_dsa_codecs.c", v11, "ossl_ml_dsa_key_to_text");
                v0 = v3->field_0;
                v12 = "no %s key material available";
                v13 = 128;
LABEL_b27c08:
                sub_a36abc(57, v13, v12);
            }
        }
        return 0;
    }
    sub_a368c8();
    v11 = 425;
    goto LABEL_b27bec;
}

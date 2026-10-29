/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab11c8..0xab1354 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab11c8_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_ab11c8_0 *field_18;
    struct st_ab11c8_0 *field_20;
    char padding_28[16];
    struct st_ab11c8_0 *field_38;
    char padding_40[8];
    unsigned int field_48;
    char padding_4c[68];
    char field_90;
    char padding_91[15];
    unsigned int field_a0;
    unsigned int field_a4;
    char padding_a8[40];
    struct st_ab11c8_0 *field_d0;
} st_ab11c8_0;


st_ab11c8_0 * sub_ab11c8(st_ab11c8_0 *a0, unsigned long a1)
{
    st_ab11c8_0 *v2;  // x21
    st_ab11c8_0 *v3;  // x19
    st_ab11c8_0 *v4;  // x0
    st_ab11c8_0 *v5;  // x0
    long long v6;  // x21
    st_ab11c8_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = sub_a6bffc(224, "crypto/rsa/rsa_lib.c", 77);
    if (!v3)
        return v3;
    v4 = sub_a7c11c();
    v3->field_d0 = v4;
    if (v4)
    {
        /* unsupported instruction */;
        v3->field_a0 = 1;
        v3->field_8 = a1;
        v5 = sub_ab386c();
        v3->field_18 = v5;
        v3->field_a4 = v5->field_48 & 0xfffffbff;
        if (v2)
        {
            if (sub_a32d54(v2))
            {
                v3->field_20 = v2;
LABEL_ab12a0:
                v7 = sub_c4ba8(v2);
                v3->field_18 = v7;
                if (v7)
                    goto LABEL_ab12c4;
                v6 = 111;
            }
            else
            {
                v6 = 101;
            }
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_lib.c", v6, "rsa_new_intern");
            sub_a36abc(4, 0x80026, 0);
        }
        else
        {
            v2 = sub_a356a8();
            v3->field_20 = v2;
            if (v2)
                goto LABEL_ab12a0;
            v7 = v3->field_18;
LABEL_ab12c4:
            v3->field_a4 = v7->field_48 & 0xfffffbff;
            if (sub_a6a660(9, v3, &v3->field_90))
            {
                if (v3->field_18->field_38)
                    v3->field_18->field_38();
                return v3;
            }
        }
        sub_ab1360(v3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_lib.c", 84, "rsa_new_intern");
        sub_a36abc(4, 0x8000f, 0);
        sub_a6c2e4(v3, "crypto/rsa/rsa_lib.c", 0x55);
    }
    return 0;
}

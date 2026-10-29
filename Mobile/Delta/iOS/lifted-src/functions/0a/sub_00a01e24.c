/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01e24..0xa01fbc (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a01e24_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[39];
    struct st_a01e24_0 *field_30;
    char padding_38[8];
    unsigned int field_40;
    char padding_44[52];
    unsigned int field_78;
    char padding_7c[12];
    unsigned int field_88;
    char padding_8c[4];
    char field_90;
    char padding_91[15];
    struct st_a01e24_0 *field_a0;
    struct st_a01e24_0 *field_a8;
    struct st_a01e24_0 *field_b0;
    long long field_b8;
} st_a01e24_0;


st_a01e24_0 * sub_a01e24(st_a01e24_0 *a0, long long a1)
{
    st_a01e24_0 *v2;  // x22
    st_a01e24_0 *v3;  // x19
    st_a01e24_0 *v4;  // x0
    st_a01e24_0 *v5;  // x0
    long long v6;  // x21
    st_a01e24_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = sub_a6bffc(200, "crypto/dsa/dsa_lib.c", 134);
    if (!v3)
        return v3;
    v4 = sub_a7c11c();
    v3->field_b0 = v4;
    if (v4)
    {
        /* unsupported instruction */;
        v3->field_88 = 1;
        v3->field_b8 = a1;
        v5 = sub_a02234();
        v3->field_a0 = v5;
        v3->field_78 = v5->field_40 & 0xfffffbff;
        if (v2)
        {
            if (sub_a32d54(v2))
            {
                v3->field_a8 = v2;
LABEL_a01efc:
                v7 = sub_9ffdd0(v2);
                v3->field_a0 = v7;
                if (v7)
                    goto LABEL_a01f20;
                v6 = 167;
            }
            else
            {
                v6 = 158;
            }
            sub_a368c8();
            sub_a369bc("crypto/dsa/dsa_lib.c", v6, "dsa_new_intern");
            sub_a36abc(10, 0x80026, 0);
        }
        else
        {
            v2 = sub_a352c0();
            v3->field_a8 = v2;
            if (v2)
                goto LABEL_a01efc;
            v7 = v3->field_a0;
LABEL_a01f20:
            v3->field_78 = v7->field_40 & 0xfffffbff;
            if (sub_a6a40c(a1, 7, v3, &v3->field_90))
            {
                sub_a60c10(&v3->field_8);
                if (!v3->field_a0->field_30)
                    return v3;
                v3->field_a0->field_30();
            }
        }
        sub_a01fd4(v3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_lib.c", 141, "dsa_new_intern");
        sub_a36abc(10, 0x8000f, 0);
        sub_a6c2e4(v3, "crypto/dsa/dsa_lib.c", 142);
    }
    return 0;
}

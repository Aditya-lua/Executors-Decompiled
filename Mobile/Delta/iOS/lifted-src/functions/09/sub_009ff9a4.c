/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ff9a4..0x9ffb30 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ff9a4_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    struct st_9ff9a4_0 *field_20;
    char padding_28[8];
    unsigned int field_30;
    char padding_34[76];
    unsigned int field_80;
    char padding_84[12];
    unsigned int field_90;
    char padding_94[4];
    char field_98;
    char padding_99[15];
    struct st_9ff9a4_0 *field_a8;
    unsigned long long field_b0;
    struct st_9ff9a4_0 *field_b8;
    struct st_9ff9a4_0 *field_c0;
} st_9ff9a4_0;


st_9ff9a4_0 * sub_9ff9a4(st_9ff9a4_0 *a0, unsigned long a1)
{
    st_9ff9a4_0 *v2;  // x21
    st_9ff9a4_0 *v3;  // x19
    st_9ff9a4_0 *v4;  // x0
    st_9ff9a4_0 *v5;  // x0
    long long v6;  // x21
    st_9ff9a4_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = sub_a6bffc(208, "crypto/dh/dh_lib.c", 76);
    if (!v3)
        return v3;
    v4 = sub_a7c11c();
    v3->field_c0 = v4;
    if (v4)
    {
        /* unsupported instruction */;
        v3->field_90 = 1;
        v3->field_b0 = a1;
        v5 = sub_9ff2f0();
        v3->field_b8 = v5;
        v3->field_80 = v5->field_30;
        if (v2)
        {
            if (sub_a32d54(v2))
            {
                v3->field_a8 = v2;
LABEL_9ffa78:
                v7 = sub_975ff4(v2);
                v3->field_b8 = v7;
                if (v7)
                    goto LABEL_9ffa9c;
                v6 = 109;
            }
            else
            {
                v6 = 100;
            }
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_lib.c", v6, "dh_new_intern");
            sub_a36abc(5, 0x80026, 0);
        }
        else
        {
            v2 = sub_a35098();
            v3->field_a8 = v2;
            if (v2)
                goto LABEL_9ffa78;
            v7 = v3->field_b8;
LABEL_9ffa9c:
            v3->field_80 = v7->field_30;
            if (sub_a6a660(6, v3, &v3->field_98))
            {
                sub_a60c10(&v3->field_8);
                if (!v3->field_b8->field_20)
                    return v3;
                v3->field_b8->field_20();
            }
        }
        sub_9ffb3c(v3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_lib.c", 83, "dh_new_intern");
        sub_a36abc(5, 0x8000f, 0);
        sub_a6c2e4(v3, "crypto/dh/dh_lib.c", 84);
    }
    return 0;
}

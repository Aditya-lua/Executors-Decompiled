/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5bbc8..0xa5bd20 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5bbc8_0 {
    struct st_a5bbc8_0 *field_0;
    struct st_a5bbc8_0 *field_8;
    char padding_10[16];
    struct st_a5bbc8_0 *field_20;
    char padding_28[24];
    struct st_a5bbc8_0 *field_40;
    char padding_48[8];
    char field_50;
    char padding_51[15];
    struct st_a5bbc8_0 *field_60;
    char padding_68[200];
    struct st_a5bbc8_0 *field_130;
} st_a5bbc8_0;


st_a5bbc8_0 * sub_a5bbc8(st_a5bbc8_0 *a0)
{
    st_a5bbc8_0 *v2;  // x0
    st_a5bbc8_0 *v3;  // x19
    st_a5bbc8_0 *v4;  // x0
    st_a5bbc8_0 *v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = sub_a5ba1c();
        if (!v2)
            return v2;
        v3 = v2;
        if ((int)a0->field_0)
        {
            if (a0->field_8 && a0->field_8->field_130)
                a0->field_8->field_130();
            if (!a0->field_20 && !(v2 = v3, !sub_a5a8d8(v2, 0)))
                goto LABEL_a5bc6c;
            sub_a368c8();
            sub_a369bc("crypto/evp/p_lib.c", 1759, "EVP_PKEY_dup");
            sub_a36abc(6, 224, 0);
            v4 = v3;
        }
        else if (!a0->field_60 || (v2 = v3, v4 = v2, sub_a54e48(v3, a0, 135)))
        {
LABEL_a5bc6c:
            v4 = v3;
            if (sub_a6a674(0x11, &v2->field_50, &a0->field_50))
            {
                if (a0->field_40)
                {
                    v5 = sub_af1738(a0->field_40);
                    v3->field_40 = v5;
                    v4 = v3;
                    if (v5)
                        return v3;
                }
                else
                {
                    return v3;
                }
            }
        }
        sub_a5a4c8(v4);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 1731, "EVP_PKEY_dup");
        sub_a36abc(6, 0xc0102, 0);
    }
    return 0;
}

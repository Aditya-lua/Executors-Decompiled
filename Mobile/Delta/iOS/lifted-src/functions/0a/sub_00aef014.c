/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaef014..0xaef198 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aef014_0 {
    struct st_aef014_0 *field_0;
    struct st_aef014_0 *field_8;
    struct st_aef014_0 *field_10;
} st_aef014_0;


st_aef014_0 * sub_aef014(st_aef014_0 *a0, st_aef014_0 *a1, long long a2, st_aef014_0 **a3)
{
    st_aef014_0 *v2;  // x23
    st_aef014_0 *v3;  // x20
    st_aef014_0 *v4;  // x22
    st_aef014_0 *v5;  // x21
    st_aef014_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a3;
    if (a0)
    {
        v3 = sub_a6d9b4();
        if (!v3)
            goto LABEL_aef06c;
        if (!a1)
            goto LABEL_aef080;
    }
    else
    {
        v3 = 0;
        if (!a1)
        {
LABEL_aef080:
            v5 = 0;
            goto LABEL_aef0a8;
        }
    }
    if (_memchr(a1, 0, a2))
    {
LABEL_aef06c:
        v4 = 0;
        v5 = 0;
        goto LABEL_aef0f8;
    }
    else
    {
        v5 = sub_a6da14(a1, a2, "crypto/x509/v3_utl.c", 53);
        if (v5)
        {
LABEL_aef0a8:
            v4 = sub_a6bf4c(24, "crypto/x509/v3_utl.c", 57);
            if (!v4)
                goto LABEL_aef0f8;
            if (v2)
            {
                v6 = *a3;
                goto LABEL_aef0dc;
            }
            v6 = sub_ad61b4();
            *a3 = v6;
            if (v6)
            {
LABEL_aef0dc:
                v4->field_0 = 0;
                v4->field_8 = v3;
                v4->field_10 = v5;
                if (sub_ad68a0(v6, v4))
                    return 1;
LABEL_aef0f8:
                if (v2)
                    goto LABEL_aef108;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_utl.c", 60, "x509v3_add_len_value");
                sub_a36abc(0x22, 0x8000f, 0);
            }
        }
        else
        {
            v4 = 0;
            if (v2)
                goto LABEL_aef108;
        }
        sub_ad6020(*a3);
        *a3 = 0;
LABEL_aef108:
        sub_a6c2e4(v4, "crypto/x509/v3_utl.c", 74);
        sub_a6c2e4(v3, "crypto/x509/v3_utl.c", 75);
        sub_a6c2e4(v5, "crypto/x509/v3_utl.c", 76);
        return 0;
    }
}

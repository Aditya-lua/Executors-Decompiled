/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa17c40..0xa17dec (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a17c40_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a17c40_0;


st_a17c40_0 * sub_a17c40(long long a0, long long a1, long long a2)
{
    st_a17c40_0 *v6;  // x19
    unsigned long v0;  // [bp-0x50]
    st_a17c40_0 *v1;  // [bp-0x48]
    st_a17c40_0 *v2;  // [bp-0x40]
    st_a17c40_0 *v3;  // [bp-0x34]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = (st_a17c40_0 *)0;
    v2 = 0;
    sub_9cf830(0, &v3, &v2, a0);
    v1 = sub_a18b7c(a1, a2);
    if (v1)
    {
        switch (v3)
        {
        case 6:
            v6 = sub_a18150(a1, a2, sub_a99eac(v2));
            if (v6)
            {
                sub_319f0(v6, 1);
                if (sub_a19718(v1, v6))
                {
                    sub_a1a174(v6);
                    return v1;
                }
            }
            break;
        case 16:
            v0 = v2->field_8;
            if (sub_a16638(&v1, &v0, v2->field_0))
                return v1;
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_backend.c", 779, "ossl_ec_key_param_from_x509_algor");
            sub_a36abc(16, 142, 0);
            v6 = 0;
            break;
        default:
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_backend.c", 797, "ossl_ec_key_param_from_x509_algor");
            sub_a36abc(16, 142, 0);
LABEL_a17d84:
            v6 = 0;
            break;
        }
        sub_a18c08();
        sub_a1a174(v6);
        return 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_backend.c", 769, "ossl_ec_key_param_from_x509_algor");
    sub_a36abc(16, 0x80010, 0);
    goto LABEL_a17d84;
}

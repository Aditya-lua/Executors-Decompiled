/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fdac0..0x9fdc64 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fdac0_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9fdac0_0;


long long sub_9fdac0(long long a0)
{
    long long v8;  // x19
    st_9fdac0_0 *v9;  // x10
    unsigned long v10;  // x20
    long long v12;  // x0
    long long v13;  // x21
    long long *v0;  // [bp-0x58], Other Possible Types: char
    st_9fdac0_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48], Other Possible Types: unsigned int
    int v3;  // [bp-0x44]
    unsigned long v4;  // [bp-0x40]
    char v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (!sub_9ca8cc(0, &v5, &v3, &v0, a0))
        return 0;
    sub_9cf830(0, &v2, &v1, v0);
    if (v2 == 16)
    {
        v8 = sub_9cf104(0, &v5, v3);
        if (!v8)
            goto LABEL_9fdb78;
        v9 = v1;
        v4 = v9->field_8;
        v10 = v9->field_0;
        switch ((unsigned int)sub_a99eac(*v0))
        {
        case 920:
            v12 = sub_9fd474(0, &v4, v10);
            if (!v12)
                goto LABEL_9fdb78;
LABEL_9fdbec:
            v13 = sub_9e4988();
            if (v13 && sub_9c1c08(v8, v13))
            {
                if (!sub_9ffd74(v12, 0, v13) || !sub_9ff2fc(v12))
                    goto LABEL_9fdba8;
                break;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/dh/dh_backend.c", 222, "ossl_dh_key_from_pkcs8");
                sub_a36abc(5, 106, 0);
                sub_9e4838(v13);
LABEL_9fdba8:
                sub_9ffb3c(v12);
                v12 = 0;
                break;
            }
        case 28:
            v12 = sub_9fd45c(0, &v4, v10);
            if (v12)
                goto LABEL_9fdbec;
        default:
            goto LABEL_9fdb78;
        }
    }
    else
    {
        v8 = 0;
LABEL_9fdb78:
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_backend.c", 235, "ossl_dh_key_from_pkcs8");
        sub_a36abc(5, 104, 0);
        v12 = 0;
        goto LABEL_9fdba8;
    }
    sub_9c7a84(v8);
    return v12;
}

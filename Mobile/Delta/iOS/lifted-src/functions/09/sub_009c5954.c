/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5954..0x9c5d94 (1088 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c5954_2 {
    char padding_0[8];
    struct st_9c5954_0 *field_8;
} st_9c5954_2;

typedef struct st_9c5954_3 {
    int field_0;
    unsigned int field_4;
    long long field_8;
    char field_10;
} st_9c5954_3;

typedef struct st_9c5954_0 {
    char padding_0[200];
    struct st_9c5954_1 *field_c8;
} st_9c5954_0;

typedef struct st_9c5954_1 {
    char field_0;
} st_9c5954_1;


unsigned long long sub_9c5954(long long a0, long long *a1, st_9c5954_3 *a2, long long a3, long long a4)
{
    char v6;  // x0
    st_9c5954_2 *v7;  // x23
    long long v8;  // x1
    unsigned long v9;  // x0
    long long v10;  // x1
    unsigned long v11;  // x0
    char v12;  // x23
    long long v13;  // x1
    long long v14;  // x1
    unsigned long v0;  // [bp-0x60]
    char v1;  // [bp-0x50]
    char v2;  // [bp-0x4c]
    char v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = 0;
    v6 = sub_a5ed4c(sub_962b90(a4));
    if (v6)
    {
        v7 = (st_9c5954_2 *)v6;
        if (a2->field_4 == 3 && a2->field_10 & 7)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/a_verify.c", 129, "ASN1_item_verify_ctx");
            v8 = 220;
        }
        else
        {
            if (!sub_a9ae64(sub_a99eac(*a1), &v2, &v1))
            {
                sub_a368c8();
                v10 = 135;
                goto LABEL_9c5ab4;
            }
            if (v2)
            {
                v9 = v1;
LABEL_9c59fc:
                if (sub_a5b3bc(v7, sub_a9976c(v9)))
                {
                    v11 = v2;
                    if ((unsigned int)v11 && !sub_a58d60(sub_a9976c(v11)))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/a_verify.c", 184, "ASN1_item_verify_ctx");
                        v0 = v2;
                        sub_a36abc();
                        sub_a6c4e8(v3);
                        return 0xffffffff;
                    }
                    if (!sub_a56ed8(a4, 0))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/a_verify.c", 196, "ASN1_item_verify_ctx");
                        sub_a36abc(13, 0x80006, 0);
                        sub_a6c4e8(v3);
                        return 0;
                    }
                }
                else
                {
                    sub_a368c8();
                    v13 = 177;
                    goto LABEL_9c5b58;
                }
LABEL_9c5b84:
                if ((int)sub_9ccc7c(a3, &v3, a0) > 0)
                {
                    if (v3)
                    {
                        v12 = sub_a57c20(a4, a2->field_8, a2->field_0);
                        if (v12 > 0)
                        {
                            v12 = 1;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/a_verify.c", 219, "ASN1_item_verify_ctx");
                            sub_a36abc(13, 0x80006, 0);
                        }
                        sub_a6c4e8(v3);
                        return v12;
                    }
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/a_verify.c", 210, "ASN1_item_verify_ctx");
                }
                else
                {
                    sub_a368c8();
                    v14 = 205;
                    goto LABEL_9c5c20;
                }
            }
            else if (!*(int *)&v7->padding_0[0] || v7[6].padding_0)
            {
                v9 = v1;
                if ((unsigned int)v9 != 912)
                    goto LABEL_9c59fc;
                if (sub_a5b3bc(v7, "RSA") || sub_a5b3bc(v7, "RSA-PSS"))
                {
                    if (0 < (int)sub_aac82c(a4, 0, a1, v7))
                        goto LABEL_9c5b84;
                    sub_a368c8();
                    v14 = 171;
LABEL_9c5c20:
                    sub_a369bc("crypto/asn1/a_verify.c", v14, "ASN1_item_verify_ctx");
                }
                else
                {
                    sub_a368c8();
                    v13 = 166;
LABEL_9c5b58:
                    sub_a369bc("crypto/asn1/a_verify.c", v13, "ASN1_item_verify_ctx");
                }
            }
            else
            {
                if (v7->field_8 && v7->field_8->field_c8)
                    v7->field_8->field_c8();
                sub_a368c8();
                v10 = 141;
LABEL_9c5ab4:
                sub_a369bc("crypto/asn1/a_verify.c", v10, "ASN1_item_verify_ctx");
            }
            sub_a36abc();
            sub_a6c4e8(v3);
            return 0xffffffff;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_verify.c", 124, "ASN1_item_verify_ctx");
        v8 = 786690;
    }
    sub_a36abc(13, v8, 0);
    return 0xffffffff;
}

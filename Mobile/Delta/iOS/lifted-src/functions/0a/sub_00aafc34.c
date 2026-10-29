/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaafc34..0xaafebc (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aafc34_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_aafc34_0 *field_18;
    char padding_20[16];
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    char padding_50[88];
    long long field_a8;
} st_aafc34_1;

typedef struct st_aafc34_0 {
    char padding_0[48];
    long long field_30;
} st_aafc34_0;


long long sub_aafc34(st_aafc34_1 *a0, long long a1)
{
    long long v2;  // x21
    long long v3;  // x23
    long long v12;  // x24
    long long v13;  // x1
    long long v4;  // x22
    long long v5;  // x23
    long long v6;  // x25
    long long v7;  // x0
    long long v8;  // x26
    long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    if (v2 || (v2 = sub_9dddcc(a0->field_8), v2))
    {
        sub_9de064(v2);
        if (!sub_9de208(v2))
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_crpt.c", 132, "RSA_setup_blinding");
            v13 = 524291;
            goto LABEL_aafe2c;
        }
        v4 = a0->field_30;
        if (a0->field_30)
        {
LABEL_aafc8c:
            v11 = sub_9e4958();
            if (v11)
            {
                v12 = v11;
                sub_9e5cb4();
                v3 = sub_9dd05c(0, v4, v12, v2, a0->field_18->field_30, a0->field_a8);
                sub_9e48d4(v12);
                if (v3)
                {
                    sub_9dce90(v3);
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_crpt.c", 161, "RSA_setup_blinding");
                    sub_a36abc(4, 0x80003, 0);
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_crpt.c", 150, "RSA_setup_blinding");
                sub_a36abc(4, 0x80003, 0);
LABEL_aafe38:
                v3 = 0;
            }
        }
        else
        {
            if (a0->field_38 && a0->field_40 && a0->field_48)
            {
                sub_9de064(v2);
                v5 = sub_9de208(v2);
                v6 = sub_9de208(v2);
                v7 = sub_9de208(v2);
                if (v7 && !(v8 = v7, v9 = sub_9e4624(), !sub_9db58c(v6, a0->field_40, sub_9e4624()) || (v10 = sub_9e4624(), !sub_9db58c(v8, a0->field_48, sub_9e4624()) || !sub_9e7dc8(v5, v6, v8, v2))))
                {
                    v4 = sub_9e1750(0, a0->field_38, v5, v2);
                    sub_9de17c(v2);
                    if (v4)
                        goto LABEL_aafc8c;
                }
                else
                {
                    sub_9de17c(v2);
                }
            }
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_crpt.c", 139, "RSA_setup_blinding");
            v13 = 140;
LABEL_aafe2c:
            sub_a36abc(4, v13, 0);
            v4 = 0;
            goto LABEL_aafe38;
        }
        sub_9de17c(v2);
        if (v2 != a1)
            sub_9dded4(v2);
        if (v4 != a0->field_30)
            sub_9e48d4(v4);
    }
    else
    {
        v3 = 0;
    }
    return v3;
}

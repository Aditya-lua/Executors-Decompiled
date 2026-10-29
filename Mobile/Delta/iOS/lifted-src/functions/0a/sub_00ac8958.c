/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac8958..0xac8c70 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ac8958(long long a0, long long a1, long long a2)
{
    long long v4;  // x23
    long long v5;  // x22
    long long v14;  // x1
    long long v15;  // x1
    long long v16;  // x1
    long long v17;  // x1
    unsigned long long v6;  // x19
    long long v7;  // x24
    unsigned long long v8;  // x0
    unsigned long long v9;  // x26
    unsigned long long v10;  // x0
    unsigned long long v11;  // x20
    long long v12;  // x1
    unsigned long long v13;  // x21
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_9ffdd0();
    v5 = sub_c4ba8(v4);
    v0 = 0;
    v1 = 0;
    v6 = sub_9dddcc(sub_a19700(a0));
    if (!v6)
    {
        sub_a368c8();
        v17 = 349;
        goto LABEL_ac8abc;
    }
    sub_9de064(v6);
    v7 = sub_9de208(v6);
    v8 = sub_9de208(v6);
    if (v8)
    {
        v9 = v8;
        v10 = sub_a1a56c(v4);
        if (v10)
        {
            v11 = v10;
            if (sub_9e5528(v1, sub_9e4624(sub_9d0460(a1, &v1, &v0), &v1, &v0)) >> 31 & 1 || sub_9e5528(v0, sub_9e4624()) >> 31 & 1 || (int)sub_9e5528(v5, v1) < 1 || (int)sub_9e5528(v5, v0) <= 0)
            {
                sub_a368c8();
                v12 = 382;
                goto LABEL_ac8af8;
            }
            if (!sub_9e5e68(v7, v1, v0, v5, v6))
            {
                sub_a368c8();
                v14 = 387;
                goto LABEL_ac8b94;
            }
            if (sub_9e4828(v7))
            {
                sub_a368c8();
                v12 = 392;
LABEL_ac8af8:
                sub_a369bc("crypto/sm2/sm2_sign.c", v12, "sm2_sig_verify");
                v15 = 101;
                goto LABEL_ac8b04;
            }
            if (!sub_a1b804(v4, v11, v0, sub_975ff4(a0), v7, v6) || !sub_a1b3cc(v4, v11, v9, 0, v6))
            {
                sub_a368c8();
                sub_a369bc("crypto/sm2/sm2_sign.c", 398, "sm2_sig_verify");
                v15 = 524304;
                goto LABEL_ac8b04;
            }
            else if (sub_9e5e68(v7, a2, v9, v5, v6))
            {
                v13 = !sub_9e5528(v1, v7);
            }
            else
            {
                sub_a368c8();
                v14 = 403;
LABEL_ac8b94:
                sub_a369bc("crypto/sm2/sm2_sign.c", v14, "sm2_sig_verify");
                v15 = 524291;
LABEL_ac8b04:
                sub_a36abc(53, v15, 0);
                v13 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/sm2/sm2_sign.c", 362, "sm2_sig_verify");
            v16 = 524304;
LABEL_ac8acc:
            sub_a36abc(53, v16, 0);
            v11 = 0;
            v13 = 0;
        }
    }
    else
    {
        sub_a368c8();
        v17 = 356;
LABEL_ac8abc:
        sub_a369bc("crypto/sm2/sm2_sign.c", v17, "sm2_sig_verify");
        v16 = 524291;
        goto LABEL_ac8acc;
    }
    sub_a1a254(v11);
    sub_9de17c(v6);
    sub_9dded4(v6);
    return v13;
}

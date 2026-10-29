/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9feec8..0x9ff19c (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9feec8_2 {
    char padding_0[8];
    long long field_8;
    char padding_10[104];
    long long field_78;
    char field_80;
    char padding_81[7];
    char field_88;
    char padding_89[39];
    long long field_b0;
    struct st_9feec8_0 *field_b8;
    long long field_c0;
} st_9feec8_2;

typedef struct st_9feec8_0 {
    char padding_0[24];
    struct st_9feec8_1 *field_18;
} st_9feec8_0;

typedef struct st_9feec8_1 {
    unsigned long long field_0;
} st_9feec8_1;


unsigned long long sub_9feec8(unsigned long a0, unsigned long a1, st_9feec8_2 *a2)
{
    long long v2;  // x1
    char v3;  // x19
    char v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)sub_9e46a8(a2->field_8) >= 10001)
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_key.c", 48, "ossl_dh_compute_key");
        v2 = 103;
        goto LABEL_9fef64;
    }
    if (*(long long *)&a2->padding_10[0] && (int)sub_9e46a8(*(long long *)&a2->padding_10[0]) >= 10001)
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_key.c", 54, "ossl_dh_compute_key");
        v2 = 130;
LABEL_9fef64:
        sub_a36abc(5, v2, 0);
        v3 = 0;
    }
    else
    {
        if (0x1ff >= (int)sub_9e46a8(a2->field_8))
        {
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_key.c", 59, "ossl_dh_compute_key");
            sub_a36abc(5, 126, 0);
            return 0;
        }
        v3 = sub_9dddcc(a2->field_b0);
        if (v3)
        {
            sub_9de064(v3);
            sub_9de208(v3);
            if (sub_9de208(v3))
            {
                if (a2->field_78)
                {
                    if (!(a2->field_80 & 1))
                    {
                        goto LABEL_9ff098;
                    }
                    else
                    {
                        v4 = sub_9e6fac(&a2->field_88, a2->field_c0, a2->field_8, v3);
                        sub_9e5d14(a2->field_78, 4);
                        if (v4)
                        {
LABEL_9ff098:
                            a2->field_b8->field_18();
                        }
                    }
LABEL_9fef78:
                    sub_9e4cf0();
                    sub_9de17c(v3);
                    sub_9dded4(v3);
                    return 0xffffffff;
                }
                sub_a368c8();
                sub_a369bc("crypto/dh/dh_key.c", 73, "ossl_dh_compute_key");
                sub_a36abc(5, 100, 0);
            }
        }
    }
    goto LABEL_9fef78;
}

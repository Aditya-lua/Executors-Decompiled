/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab9c50..0xab9edc (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab9c50_0 {
    char padding_0[216];
    unsigned int field_d8;
} st_ab9c50_0;


unsigned long long sub_ab9c50(st_ab9c50_0 *a0, unsigned long a1, unsigned long long a2, long long a3, long long a4, long long a5)
{
    long long v2;  // x1
    unsigned long long v3;  // x21
    unsigned long long v4;  // x22
    unsigned long long v5;  // x23
    unsigned long long v6;  // x27
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (0x7ff >= (int)a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_sp800_56b_gen.c", 89, "ossl_rsa_fips186_4_gen_prob_primes");
        v2 = 120;
    }
    else
    {
        if (sub_ab9940(a3))
        {
            sub_9de064(a4);
            v3 = sub_9de208(a4);
            v4 = sub_9de208(a4);
            v5 = sub_9de208(a4);
            v6 = 0;
            if (v3 && v4 && v5)
            {
                sub_9e5d14(v4, 4);
                sub_9e5d14(v5, 4);
                v7 = *(long long *)&a0->padding_0[64];
                if (v7)
                {
                    if (!*(long long *)&a0->padding_0[72])
                        goto LABEL_ab9d70;
LABEL_ab9d24:
                    if (v7)
                        goto LABEL_ab9d8c;
LABEL_ab9e00:
                    v6 = 0;
                }
                else
                {
                    v7 = sub_9e4988(0);
                    *(unsigned long long *)&a0->padding_0[64] = v7;
                    if (*(long long *)&a0->padding_0[72])
                        goto LABEL_ab9d24;
LABEL_ab9d70:
                    v8 = sub_9e4988();
                    v6 = 0;
                    *(unsigned long long *)&a0->padding_0[72] = v8;
                    if (!*(long long *)&a0->padding_0[64] || !v8)
                        goto LABEL_ab9e04;
LABEL_ab9d8c:
                    sub_9e5d14();
                    sub_9e5d14(*(long long *)&a0->padding_0[72], 4);
                    if (!sub_9e9cf0(*(long long *)&a0->padding_0[64], v4, 0, 0, 0, 0, 0, a2, a3, a4, a5) || !sub_9e9cf0(*(long long *)&a0->padding_0[72], v5, 0, 0, 0, 0, 0, a2, a3, a4, a5))
                        goto LABEL_ab9e00;
                    while (1)
                    {
                        v9 = sub_ab997c(v3, v4, v5, a2);
                        if (v9 >> 31 & 1)
                            goto LABEL_ab9e00;
                        if ((unsigned int)v9)
                            break;
LABEL_ab9e64:
                        if (!sub_9e9cf0(*(long long *)&a0->padding_0[72], v5, 0, 0, 0, 0, 0, a2, a3, a4, a5))
                            goto LABEL_ab9e00;
                    }
                    v10 = sub_ab997c(v3, *(long long *)&a0->padding_0[64], *(long long *)&a0->padding_0[72], a2);
                    if (v10 >> 31 & 1)
                        goto LABEL_ab9e00;
                    if (!(unsigned int)v10)
                        goto LABEL_ab9e64;
                    a0->field_d8 = a0->field_d8 + 1;
                    v6 = 1;
                }
            }
LABEL_ab9e04:
            sub_9e4cf0(v4);
            sub_9e4cf0(v5);
            sub_9e4cf0(v3);
            if (!(v6 & 1))
            {
                sub_9e4838(*(long long *)&a0->padding_0[64]);
                *(unsigned long long *)&a0->padding_0[64] = 0;
                sub_9e4838(*(long long *)&a0->padding_0[72]);
                *(unsigned long long *)&a0->padding_0[72] = 0;
            }
            sub_9de17c(a4);
            return v6;
        }
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_sp800_56b_gen.c", 94, "ossl_rsa_fips186_4_gen_prob_primes");
        v2 = 178;
    }
    sub_a36abc(4, v2, 0);
    return 0;
}

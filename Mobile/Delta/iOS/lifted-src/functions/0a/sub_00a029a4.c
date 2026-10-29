/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa029a4..0xa02ce8 (836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a029a4_2 {
    char padding_0[16];
    long long field_10;
    char padding_18[80];
    long long field_68;
    char padding_70[8];
    char field_78;
    char padding_79[7];
    char field_80;
    char padding_81[31];
    struct st_a029a4_0 *field_a0;
    char padding_a8[8];
    long long field_b0;
} st_a029a4_2;

typedef struct st_a029a4_0 {
    char padding_0[32];
    struct st_a029a4_1 *field_20;
} st_a029a4_0;

typedef struct st_a029a4_1 {
    unsigned long long field_0;
} st_a029a4_1;


unsigned long long sub_a029a4(unsigned long a0, unsigned int a1, long long a2, st_a029a4_2 *a3)
{
    long long v6;  // x1
    unsigned long long v7;  // x19
    unsigned long long v8;  // x20
    unsigned long long v9;  // x21
    unsigned long long v10;  // x22
    unsigned long long v11;  // x7
    unsigned long long v12;  // x23
    unsigned long long v0;  // [bp-0x80]
    long long v1;  // [bp-0x70]
    long long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!*(long long *)&a3->padding_0[8] || !a3->field_10 || !*(long long *)&a3->padding_18[0])
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_ossl.c", 367, "dsa_do_verify");
        v6 = 101;
    }
    else if (sub_9e46a8(a3->field_10) != 160 && sub_9e46a8(a3->field_10) != 224 && sub_9e46a8(a3->field_10) != 0x100)
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_ossl.c", 374, "dsa_do_verify");
        v6 = 0x66;
    }
    else if ((int)sub_9e46a8(*(long long *)&a3->padding_0[8]) >= 10001)
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_ossl.c", 379, "dsa_do_verify");
        v6 = 103;
    }
    else
    {
        v7 = sub_9e4958();
        v8 = sub_9e4958(v7);
        v9 = sub_9e4958(v8);
        v10 = sub_9dddcc(0);
        if (v7 && v8 && v9 && v10)
        {
            sub_9d0460(a2, &v2, &v1);
            if (sub_9e4828(v2) || sub_9e5c94(v2) || !(sub_9e53a8(v2, a3->field_10) >> 31 & 1) || sub_9e4828(v1) || sub_9e5c94(v1) || !(sub_9e53a8(v1, a3->field_10) >> 31 & 1))
            {
                v12 = 0;
                goto LABEL_a02cc0;
            }
            if (sub_9e1750(v8, v1, a3->field_10, v10) && sub_9e4db0() && sub_9e6404(v7, v7, v8, a3->field_10, v10) && sub_9e6404(v8, v2, v8, a3->field_10, v10))
            {
                if (!(a3->field_78 & 1))
                {
                    v11 = 0;
LABEL_a02bf8:
                    if (a3->field_a0->field_20)
                    {
                        v0 = v11;
                        a3->field_a0->field_20();
                    }
                    if (sub_9e07e0(v9, *(long long *)&a3->padding_18[0], v7, a3->field_68, v8, *(long long *)&a3->padding_0[8], v10) && sub_9de520(0, v7, v9, a3->field_10, v10))
                    {
                        v12 = !sub_9e53a8(v7, v2);
                        goto LABEL_a02cc0;
                    }
                }
                else
                {
                    v11 = sub_9e6fac(&a3->field_80, a3->field_b0, *(long long *)&a3->padding_0[8], v10);
                    if (v11)
                        goto LABEL_a02bf8;
                }
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_ossl.c", 453, "dsa_do_verify");
        sub_a36abc(10, 0x80003, 0);
        v12 = 0xffffffff;
LABEL_a02cc0:
        sub_9dded4(v10);
        sub_9e48d4(v7);
        sub_9e48d4(v8);
        sub_9e48d4(v9);
        return v12;
    }
    sub_a36abc(10, v6, 0);
    return 0xffffffff;
}

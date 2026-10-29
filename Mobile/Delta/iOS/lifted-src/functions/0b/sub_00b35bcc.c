/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb35bcc..0xb35e90 (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b35bcc_0 {
    unsigned short field_0;
    char padding_2[22];
    long long field_18;
    long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    unsigned long long field_38;
} st_b35bcc_0;

typedef struct st_b35bcc_1 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    long long field_18;
    char padding_20[24];
    long long field_38;
    struct st_b35bcc_0 *field_40;
} st_b35bcc_1;

extern char g_10002b0;

long long sub_b35bcc(st_b35bcc_1 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    long long v8;  // x27
    long long v9;  // x28
    unsigned long v17;  // x21
    long long v18;  // x22
    unsigned long v19;  // x8
    unsigned int v20;  // w0
    unsigned long v21;  // x20
    unsigned long long v22;  // x8
    st_b35bcc_0 *v10;  // x20
    unsigned long n;  // x22
    unsigned long v12;  // x19
    long long v13;  // x0
    unsigned long v14;  // x0
    unsigned long long v15;  // x26
    unsigned long n1;  // x25
    unsigned short v0;  // [bp-0x34a]
    char v1;  // [bp-0x348]
    char v2;  // [bp-0x1b9]
    char v3;  // [bp-0x135]
    char v4;  // [bp-0xb0]
    unsigned long v5;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a7;
    v9 = a1;
    v5 = *(long long *)&g_10002b0;
    v10 = a0->field_40;
    n = v10->field_30;
    v12 = v10->field_38;
    if (sub_b35e90(a2, a3, &v2, 132, v12))
    {
        v22 = n * 2;
        if (a0->field_8)
        {
            v13 = sub_9ffdd0(a0->field_8);
            v14 = sub_a1d9f8(v13, sub_975ff4(a0->field_8), 4, &v3, 133, 0);
            if (v14)
            {
                if (v14 != n)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kem/ec_kem.c", 592, "derive_secret");
                    sub_a36abc(57, 158, "Invalid sender auth public key");
                }
                else if (!(!sub_b35e90(a4, a5, &(&v2)[v12], 132 - v12, v12) || (v12 *= 2, v15 = n * 3, 399 < v15)))
                {
                    goto LABEL_b35ce4;
                }
            }
        }
        else
        {
            v15 = v22;
            if (399 >= v15)
            {
LABEL_b35ce4:
                n1 = v10->field_30;
                ___memcpy_chk(&v1, a6, n1, 399);
                _memcpy(&(&v1)[n1], v8, n1);
                if (a0->field_8)
                    _memcpy(&(&v1)[v22], &v3, n);
                v17 = sub_a64d0c(a0->field_38, v10->field_18, a0->field_10, a0->field_18);
                if (v17 && !(v18 = v10->field_20, 65 <= (unsigned long long)v18))
                {
                    v19 = v10->field_0;
                    v0 = (unsigned short)((v19 & 0xff00) >> 8) | (unsigned short)v19 * 0x100 & 0xff00;
                    if (sub_a64954(v17, &v4, v18, 0, 0, "KEM", &v0, 2, "eae_prk", &v2, v12))
                    {
                        v20 = sub_a64b24(v17, v9, v18, &v4, v18, "KEM", &v0, 2, "shared_secret", &v1, v15);
                        sub_a66ec0(&v4, v18);
                        if (v20)
                        {
                            v21 = 1;
                            goto LABEL_b35e2c;
                        }
                    }
                    else
                    {
                        sub_a66ec0(&v4, v18);
                        goto LABEL_b35e28;
                    }
                }
                goto LABEL_b35e28;
            }
        }
    }
    else
    {
        v12 = 0;
    }
    v17 = 0;
LABEL_b35e28:
    v21 = 0;
LABEL_b35e2c:
    sub_a66ec0(&v2, v12);
    sub_a53588(v17);
    if (*(long long *)&g_10002b0 == v5)
        return v21;
    ___stack_chk_fail();
}

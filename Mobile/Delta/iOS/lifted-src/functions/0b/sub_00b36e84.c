/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb36e84..0xb3708c (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b36e84_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_b36e84_0;

typedef struct st_b36e84_3 {
    struct st_b36e84_1 *field_0;
    char padding_8[32];
    struct st_b36e84_2 *field_28;
} st_b36e84_3;

typedef struct st_b36e84_1 {
    struct st_b36e84_0 *field_0;
    char padding_8[56];
    struct st_b36e84_2 *field_40;
} st_b36e84_1;

typedef struct st_b36e84_2 {
    unsigned long long field_0;
} st_b36e84_2;


unsigned long long * sub_b36e84(st_b36e84_3 *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3, unsigned long long *a4)
{
    unsigned long long v2;  // x1
    unsigned long long *v3;  // x2
    long long v4;  // x1
    unsigned long long *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0->field_40)
    {
        v2 = a0->field_0->field_0->field_28;
        if (!a1)
        {
            if (!a2 && !a4)
                return 0;
            if (a2)
                *a2 = v2;
            if (!a4)
                return 1;
            *a4 = 32;
            return 1;
        }
        if (a3)
        {
            if (!a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 181, "ml_kem_encapsulate");
                v3 = "null ciphertext input/output length pointer";
                goto LABEL_b3700c;
            }
            if (v2 > *a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 185, "ml_kem_encapsulate");
                v3 = "ciphertext buffer too small";
                goto LABEL_b36fd4;
            }
            else
            {
                *a2 = v2;
                if (a4)
                {
                    if (31 >= *a4)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 197, "ml_kem_encapsulate");
                        v3 = "shared-secret buffer too small";
                    }
                    else
                    {
                        *a4 = 32;
                        if (a0->field_28)
                            v5 = sub_a8425c(a1);
                        else
                            v5 = sub_a84550(a1);
                        if (!a0->field_28)
                            return v5;
                        sub_a66ec0(a0->field_28, 32);
                        a0->field_28 = 0;
                        return v5;
                    }
LABEL_b36fd4:
                    v4 = 106;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 193, "ml_kem_encapsulate");
                    v3 = "null shared secret input/output length pointer";
LABEL_b3700c:
                    v4 = 247;
                }
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 175, "ml_kem_encapsulate");
            v3 = "NULL shared-secret buffer";
            v4 = 248;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 158, "ml_kem_encapsulate");
        v4 = 128;
        v3 = 0;
    }
    sub_a36abc(57, v4, v3);
    if (!a0->field_28)
        return 0;
    sub_a66ec0(a0->field_28, 32);
    a0->field_28 = 0;
    return 0;
}

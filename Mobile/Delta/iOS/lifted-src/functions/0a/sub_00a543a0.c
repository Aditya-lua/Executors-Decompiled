/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa543a0..0xa546b0 (784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a543a0_0 {
    char padding_0[16];
    struct st_a543a0_1 *field_10;
    unsigned long long field_18;
} st_a543a0_0;

typedef struct st_a543a0_2 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a543a0_2 *field_8;
    unsigned long long field_10;
    long long field_18;
    unsigned int field_20;
} st_a543a0_2;

typedef struct st_a543a0_1 {
    unsigned int field_0;
} st_a543a0_1;


st_a543a0_2 * sub_a543a0(unsigned int a0, st_a543a0_0 *a1, long long a2)
{
    unsigned int *v2;  // x24
    st_a543a0_2 *v3;  // x0
    st_a543a0_2 *v4;  // x19
    st_a543a0_2 *v5;  // x0
    unsigned long i;  // x13
    unsigned int v7;  // w8
    unsigned long long v8;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    v3 = sub_a6bffc(144, "crypto/evp/kem.c", 287);
    if (v3)
    {
        v4 = v3;
        /* unsupported instruction */;
        v3->field_20 = 1;
        if (sub_a78c78(a2))
        {
            v4->field_18 = a2;
            v4->field_0 = a0;
            v5 = sub_a6895c(a1);
            v4->field_8 = v5;
            if (v5)
            {
                v4->field_10 = a1->field_18;
                for (i = v2 + 2; 13 < (unsigned int)*(int *)(i - 8); i += 16);
                goto *((void *)(sub_a54460 + *(char *)(*(int *)(i - 8) + 14611193) * 4));
            }
            else
            {
                do
                {
                    /* unsupported instruction */;
                    v7 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v8 = arm64g_calculate_condition(19, v7, 1, 0);
                if (!(v8 & 1))
                {
                    /* unsupported instruction */;
                }
                else if (1 < (int)v7)
                {
                    return 0;
                }
                sub_a6c2e4(v4->field_8, "crypto/evp/kem.c", 443);
                sub_a78ccc(v4->field_18);
                sub_a6c2e4(v4, "crypto/evp/kem.c", 446);
                return 0;
            }
        }
        else
        {
            sub_a6c2e4(v4, "crypto/evp/kem.c", 295);
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/kem.c", 312, "evp_kem_from_algorithm");
    sub_a36abc(6, 0x80006, 0);
    return 0;
}

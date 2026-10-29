/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa82b98..0xa82d30 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a82b98_2 {
    struct st_a82b98_1 *field_0;
    long long field_8;
    struct st_a82b98_2 *field_10;
    struct st_a82b98_2 *field_18;
    struct st_a82b98_2 *field_20;
    struct st_a82b98_2 *field_28;
    char field_30;
    char padding_31[55];
    unsigned int field_68;
    char padding_6c[68];
    struct st_a82b98_2 *field_b0;
} st_a82b98_2;

typedef struct st_a82b98_1 {
    unsigned long long field_0;
} st_a82b98_1;

typedef struct st_a82b98_0 {
    struct st_a82b98_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_a82b98_0;

extern st_a82b98_0 g_ea1eb0;

int sub_a82b98(long long a0, long long a1, unsigned long long a2)
{
    unsigned int v3;  // w8
    unsigned long long *v4;  // x24
    long long v13;  // x1
    st_a82b98_2 *v5;  // x0
    st_a82b98_2 *v6;  // x25
    st_a82b98_2 *v7;  // x0
    st_a82b98_2 *v8;  // x0
    st_a82b98_2 *v9;  // x0
    st_a82b98_2 *v10;  // x8
    long long v12;  // x2
    unsigned long v0;  // [bp-0x60], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (unsigned int)a2 - 1454;
    if (3 > v3)
    {
        v4 = (&g_ea1eb0.field_0)[v3];
        v5 = sub_a6bf4c(184, "crypto/ml_kem/ml_kem.c", 1975);
        if (v5)
        {
            v5->field_0 = v4;
            v5->field_8 = a0;
            v5->field_68 = 13;
            v6 = v5;
            v7 = sub_a40ca8(a0, "SHAKE128", a1);
            v6->field_10 = v7;
            v8 = sub_a40ca8(a0, "SHAKE256", a1);
            v6->field_18 = v8;
            v9 = sub_a40ca8(a0, "SHA3-256", a1);
            v6->field_20 = v9;
            v10 = sub_a40ca8(a0, "SHA3-512", a1);
            v5 = v6;
            v6->field_28 = v10;
            v6->field_b0 = 0;
            memset(&v6->field_30, 0, 56);
            if (!v7 || !v8 || !v9 || !v10)
            {
                sub_a368c8(sub_a82d30(v5));
                sub_a369bc("crypto/ml_kem/ml_kem.c", 1995, "ossl_ml_kem_key_new");
                v0 = *v4;
                v12 = "missing SHA3 digest algorithms while creating %s key";
                v13 = 786691;
LABEL_a82d0c:
                sub_a36abc(15, v13, v12);
                v5 = 0;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ml_kem/ml_kem.c", 1970, "ossl_ml_kem_key_new");
        v0 = a2;
        v12 = "unsupported ML-KEM key type: %d";
        v13 = 524550;
        goto LABEL_a82d0c;
    }
    return (unsigned int)v5;
}

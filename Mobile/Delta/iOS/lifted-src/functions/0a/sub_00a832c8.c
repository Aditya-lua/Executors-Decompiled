/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa832c8..0xa833b0 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a832c8_1 {
    struct st_a832c8_0 *field_0;
    char padding_8[40];
    struct st_a832c8_1 *field_30;
    struct st_a832c8_1 *field_38;
    struct st_a832c8_1 *field_40;
    unsigned long long field_48;
    char padding_50[8];
    struct st_a832c8_1 *field_58;
    struct st_a832c8_1 *field_60;
    char padding_68[4];
    struct st_a832c8_1 *field_6c;
    char padding_74[8];
    struct st_a832c8_1 *field_7c;
    char padding_84[8];
    struct st_a832c8_1 *field_8c;
    char padding_94[8];
    struct st_a832c8_1 *field_9c;
    char padding_a4[12];
    struct st_a832c8_1 *field_b0;
} st_a832c8_1;

typedef struct st_a832c8_0 {
    char padding_0[24];
    unsigned long long field_18;
    long long field_20;
    char padding_28[32];
    int field_48;
} st_a832c8_0;


st_a832c8_1 * sub_a832c8(long long a0, unsigned long a1, st_a832c8_1 *a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_a832c8_1 *v17;  // x10
    st_a832c8_1 *v18;  // x20
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a832c8_1 *v12;  // x0
    st_a832c8_1 *v13;  // x19
    st_a832c8_1 *v14;  // x0
    unsigned long v15;  // x8
    st_a832c8_1 *v16;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a2)
    {
        return 0;
    }
    else if (a2->field_40)
    {
        return 0;
    }
    else if (*(long long *)&a2->padding_a4[8])
    {
        return 0;
    }
    else
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        if (a2->field_0->field_18 != a1)
            return 0;
        v12 = sub_a3f728();
        if (!v12)
            return v12;
        v13 = v12;
        v14 = sub_a6bf4c(a2->field_0->field_20, "crypto/ml_kem/ml_kem.c", 2155);
        if (v14)
        {
            v15 = a2->field_0->field_48;
            *(uint128_t *)&a2->padding_74[4] = 0;
            *(uint128_t *)&a2->padding_94[4] = 0;
            v16 = a2;
            *(uint128_t *)&v16->padding_84[4] = 0;
            v17 = a2;
            *(uint128_t *)(v17->padding_68)[1] = 0;
            a2->field_30 = (v17->padding_68)[1];
            a2->field_38 = &v16->padding_84[4];
            a2->field_58 = 0;
            a2->field_60 = 0;
            a2->field_40 = v14;
            a2->field_48 = (char *)v14 + 0x200 * v15;
            if (!sub_a833b0(a0, v13, a2))
                goto LABEL_a83388;
            v18 = 1;
        }
        else
        {
LABEL_a83388:
            sub_a82b08(a2);
            v18 = 0;
        }
        sub_a3f73c(v13);
        return v18;
    }
}

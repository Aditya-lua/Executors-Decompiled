/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8351c..0xa83618 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a8351c_1 {
    struct st_a8351c_0 *field_0;
    char padding_8[40];
    struct st_a8351c_1 *field_30;
    struct st_a8351c_1 *field_38;
    struct st_a8351c_1 *field_40;
    struct st_a8351c_1 *field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    struct st_a8351c_1 *field_60;
    char padding_68[4];
    struct st_a8351c_1 *field_6c;
    char padding_74[8];
    struct st_a8351c_1 *field_7c;
    char padding_84[8];
    struct st_a8351c_1 *field_8c;
    char padding_94[8];
    struct st_a8351c_1 *field_9c;
    char padding_a4[12];
    struct st_a8351c_1 *field_b0;
} st_a8351c_1;

typedef struct st_a8351c_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    char padding_18[48];
    int field_48;
} st_a8351c_0;


st_a8351c_1 * sub_a8351c(long long a0, unsigned long a1, st_a8351c_1 *a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_a8351c_1 *v17;  // x10
    unsigned long long v18;  // x9
    st_a8351c_1 *v19;  // x10
    unsigned long long v20;  // x8
    st_a8351c_1 *v21;  // x20
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a8351c_1 *v12;  // x0
    st_a8351c_1 *v13;  // x19
    st_a8351c_1 *v14;  // x0
    unsigned long v15;  // x8
    st_a8351c_1 *v16;  // x9
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
        if (a2->field_0->field_8 != a1)
            return 0;
        v12 = sub_a3f728();
        if (!v12)
            return v12;
        v13 = v12;
        v14 = sub_a6bf4c(a2->field_0->field_10, "crypto/ml_kem/ml_kem.c", 2183);
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
            v18 = v15 * 0x200;
            v19 = (char *)v14 + v18;
            a2->field_40 = v14;
            a2->field_48 = v19;
            v20 = (char *)v19 + 0x200 * v15 * v15;
            a2->field_50 = v20;
            a2->field_58 = v20 + v18;
            a2->field_60 = 0;
            if (!sub_a83618(a0, v13, a2))
                goto LABEL_a835f0;
            v21 = 1;
        }
        else
        {
LABEL_a835f0:
            sub_a82b08(a2);
            v21 = 0;
        }
        sub_a3f73c(v13);
        return v21;
    }
}

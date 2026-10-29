/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80034..0xa801cc (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80034_0 {
    char padding_0[8];
    struct st_a80034_1 *field_8;
    char padding_10[8];
    long long field_18;
    char padding_20[32];
    char field_40;
    char padding_41[95];
    long long field_a0;
    char padding_a8[24];
    long long field_c0;
    long long field_c8;
    unsigned long long field_d0;
    long long field_d8;
} st_a80034_0;

typedef struct st_a80034_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[32];
    long long field_48;
} st_a80034_1;


long long sub_a80034(st_a80034_0 *a0)
{
    long long v4;  // x24
    unsigned long long v5;  // x19
    long long v6;  // x21
    long long v7;  // x25
    long long v8;  // x0
    long long v9;  // x23
    long long v10;  // x24
    long long v11;  // x22
    long long v0;  // [bp-0x60]
    long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_8->field_20;
    v5 = v4 * 0x400;
    v0 = sub_a6bf4c(v5, "crypto/ml_dsa/ml_dsa_vector.h", 35);
    if (!v0)
        return 0;
    v1 = v4;
    v6 = sub_a3f728();
    if (!v6 || a0->field_c0 || (v7 = a0->field_8->field_20, v8 = sub_a6bf4c(v7 * 0x400, "crypto/ml_dsa/ml_dsa_vector.h", 35), a0->field_c0 = v8, !v8 || (a0->field_c8 = v7, !sub_a801cc(a0, v6, &a0->field_c0, &v0) || v4 != a0->field_d8)))
    {
LABEL_a8009c:
        v11 = 0;
    }
    else
    {
        if (v4)
        {
            v9 = 0;
            do
            {
                v10 = v4;
                if (sub_a66f20(v0 + v9, a0->field_d0 + v9, 0x400))
                    goto LABEL_a8009c;
            } while ((v9 += 0x400, v4 = v10 - 1, v10 != 1));
        }
        if (!sub_a7dca0(a0) || sub_a3f7f0(v6, a0->field_18, 0) != 1 || sub_a3fe10(v6, a0->field_a0, a0->field_8->field_48) != 1)
            goto LABEL_a8009c;
        v11 = sub_a403bc(v6, &a0->field_40, 64) == 1;
    }
    _bzero(v0, v5);
    sub_a6c2e4(v0, "crypto/ml_dsa/ml_dsa_vector.h", 44);
    sub_a3f73c(v6);
    return v11;
}

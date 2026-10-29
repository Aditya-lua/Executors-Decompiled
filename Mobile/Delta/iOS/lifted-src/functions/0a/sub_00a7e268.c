/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7e268..0xa7e5c4 (860 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7e268_1 {
    char padding_0[8];
    struct st_a7e268_0 *field_8;
    char padding_10[16];
    char field_20;
    char padding_21[31];
    char field_40;
    char padding_41[63];
    char field_80;
    char padding_81[39];
    long long field_a8;
} st_a7e268_1;

typedef struct st_a7e268_0 {
    char padding_0[32];
    long long field_20;
    long long field_28;
    unsigned int field_30;
    char padding_34[12];
    long long field_40;
} st_a7e268_0;

extern unsigned long long g_a7e5c4;
extern unsigned long long g_a7e688;

long long sub_a7e268(st_a7e268_1 *a0)
{
    st_a7e268_0 *v4;  // x24
    long long v5;  // x19
    long long v6;  // x0
    long long v7;  // x21
    unsigned long long *v8;  // x24
    char v0;  // [bp-0xa8]
    long long v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_8;
    v1 = 0;
    v5 = v4->field_40;
    v6 = sub_a6bf4c(v5, "crypto/ml_dsa/ml_dsa_encoders.c", 716);
    if (!v6)
        return v6;
    v7 = v6;
    if (v4->field_30 == 4)
        v8 = &g_a7e5c4;
    else
        v8 = &g_a7e688;
    if (sub_c68800() && sub_a6ebd4(&v0, &a0->field_20, 32) && sub_a6ebd4(&v0, &a0->field_80, 32) && sub_a6ebd4(&v0, &a0->field_40, 64))
    {
        if (v4->field_28)
        {
            v8();
        }
        else if (v4->field_20)
        {
            v8();
        }
        else if (sub_c68eb8(&v0, &v1) && v1 == v5)
        {
            sub_a6c4e8(a0->field_a8, v5, "crypto/ml_dsa/ml_dsa_encoders.c", 744);
            a0->field_a8 = v7;
            sub_a6eaf8(&v0);
            return 1;
        }
    }
    sub_a6eaf8(&v0);
    sub_a6c4e8(v7, v5, "crypto/ml_dsa/ml_dsa_encoders.c", 750);
    return 0;
}

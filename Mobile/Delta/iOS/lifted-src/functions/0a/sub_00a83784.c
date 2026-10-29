/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa83784..0xa8392c (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a83784_1 {
    struct st_a83784_0 *field_0;
    long long field_8;
    uint128_t field_10;
    char padding_20[16];
    struct st_a83784_1 *field_30;
    struct st_a83784_1 *field_38;
    struct st_a83784_1 *field_40;
    struct st_a83784_1 *field_48;
    unsigned long long field_50;
    struct st_a83784_1 *field_58;
    struct st_a83784_1 *field_60;
    char padding_68[4];
    struct st_a83784_1 *field_6c;
    char padding_74[8];
    struct st_a83784_1 *field_7c;
    char padding_84[8];
    struct st_a83784_1 *field_8c;
    char padding_94[8];
    struct st_a83784_1 *field_9c;
    char padding_a4[12];
    struct st_a83784_1 *field_b0;
} st_a83784_1;

typedef struct st_a83784_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    char padding_20[40];
    int field_48;
    char padding_4c[8];
    unsigned int field_54;
} st_a83784_0;

extern char g_10002b0;

int sub_a83784(st_a83784_1 *a0, unsigned long a1, st_a83784_1 *a2)
{
    st_a83784_0 *v7;  // x23
    st_a83784_1 *v8;  // x8
    st_a83784_1 *v17;  // x10
    unsigned long long v18;  // x8
    st_a83784_1 *v19;  // w0
    st_a83784_1 *v9;  // x20
    st_a83784_1 *v10;  // x0
    st_a83784_1 *v11;  // x21
    st_a83784_1 *v12;  // x0
    unsigned long v13;  // x8
    st_a83784_1 *v14;  // x9
    st_a83784_1 *v15;  // x10
    unsigned long long v16;  // x9
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (a2 && !a2->field_40 && !*(long long *)&a2->padding_a4[8] && (v7 = a2->field_0, !a0 || v7->field_18 == a1))
    {
        v8 = a2->field_60;
        if (v8)
        {
            v0 = *(int128_t *)&v8->field_0;
            v1 = v8->field_10;
            v2 = *(int128_t *)&a2->field_58->field_0;
            v3 = a2->field_58->field_10;
            a2->field_58 = 0;
            a2->field_60 = 0;
            v9 = a2;
LABEL_a83854:
            v10 = sub_a3f728();
            if (!v10)
            {
                if (*(long long *)&g_10002b0 == v4)
                    return (unsigned int)v10;
                ___stack_chk_fail();
            }
            else
            {
                v11 = v10;
                v12 = sub_a6bf4c(v7->field_10, "crypto/ml_kem/ml_kem.c", 2231);
                if (v12)
                {
                    v13 = v9->field_0->field_48;
                    *(uint128_t *)&v9->padding_74[4] = 0;
                    *(uint128_t *)&v9->padding_94[4] = 0;
                    v14 = v9;
                    *(uint128_t *)&v14->padding_84[4] = 0;
                    v15 = v9;
                    *(uint128_t *)(v15->padding_68)[1] = 0;
                    v9->field_30 = (v15->padding_68)[1];
                    v9->field_38 = &v14->padding_84[4];
                    v16 = v13 * 0x200;
                    v17 = (char *)v12 + v16;
                    v9->field_40 = v12;
                    v9->field_48 = v17;
                    v18 = (char *)v17 + 0x200 * v13 * v13;
                    v9->field_50 = v18;
                    v9->field_58 = v18 + v16;
                    v9->field_60 = 0;
                    v19 = (st_a83784_1 *)(unsigned int)sub_a8392c(&v0, v11, a0, v9);
                    sub_a66ec0(&v0, 64);
                    sub_a3f73c(v11);
                    if (v19)
                    {
                        if (*(long long *)&g_10002b0 == v4)
                            return 1;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    sub_a66ec0(&v0, 64);
                    sub_a3f73c(v11);
                }
                if (a0)
                    sub_a66ec0(a0, v7->field_18);
                sub_a82b08(v9);
            }
        }
        else
        {
            v9 = a2;
            if ((int)sub_aa845c(a2->field_8, &v0, 64, v7->field_54) >= 1)
                goto LABEL_a83854;
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}

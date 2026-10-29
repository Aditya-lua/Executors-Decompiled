/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa78ccc..0xa78e10 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a78ccc_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
    char padding_10[8];
    long long field_18;
    char padding_20[8];
    long long field_28;
    long long field_30;
    long long field_38;
    char padding_40[8];
    long long field_48;
    char padding_50[16];
    unsigned int field_60;
    char padding_64[4];
    long long field_68;
    struct st_a78ccc_1 *field_70;
    char padding_78[56];
    long long field_b0;
    char padding_b8[8];
    long long field_c0;
    char padding_c8[8];
    char field_d0;
} st_a78ccc_0;

typedef struct st_a78ccc_1 {
    char field_0;
} st_a78ccc_1;

extern long long g_a78698;

void sub_a78ccc(st_a78ccc_0 *a0)
{
    unsigned long long v2;  // 4102
    st_a78ccc_0 *v3;  // x0
    char v4;  // x0
    st_a78ccc_0 *v5;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = arm64g_calculate_condition(19, /* unsupported instruction */, 1, 0);
    if (!(v2 & 1))
    {
        /* unsupported instruction */;
        if (a0->field_0 & 1)
        {
            if (a0->field_70 && !(a0->field_d0 & 1))
                a0->field_70();
            v3 = a0;
            if (v3->field_68)
            {
                sub_a35a64(a0->field_60);
                sub_a6c2e4(a0->field_68, "crypto/provider_core.c", 754);
                v3 = a0;
                a0->field_68 = 0;
            }
            sub_a6c2e4(v3->field_b0, "crypto/provider_core.c", 759);
            v4 = (char)a0;
            a0->field_b0 = 0;
            *(unsigned long long *)a0->padding_b8 = 0;
            a0->field_0 = a0->field_0 & 254;
            a0 = (st_a78ccc_0 *)v4;
        }
        v5 = a0;
        sub_a6be28();
        sub_a04184(v5->field_38);
        sub_a6c2e4(v5->field_28, "crypto/provider_core.c", 774);
        sub_a6c2e4(v5->field_30, "crypto/provider_core.c", 775);
        sub_ad6958(v5->field_48, &g_a78698);
        sub_a7c1d0(v5->field_c0);
        sub_a7c1d0(v5->field_8);
        sub_a7c1d0(v5->field_18);
        sub_a6c2e4();
        return;
    }
    else if (!(a0->field_d0 & 1))
    {
        return;
    }
}

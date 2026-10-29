/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc48fb0..0xc49140 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c48fb0_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    long long field_38;
    char padding_40[24];
    struct st_c48fb0_1 *field_58;
    unsigned long long field_60;
    char padding_68[360];
    char field_1d0;
    char padding_1d1[7];
    char field_1d8;
    char padding_1d9[31];
    long long field_1f8;
    long long field_200;
} st_c48fb0_0;

typedef struct st_c48fb0_1 {
    unsigned long long field_0;
} st_c48fb0_1;


unsigned long long sub_c48fb0(st_c48fb0_0 *a0)
{
    unsigned long long v2;  // 4102
    unsigned long long v3;  // x0
    unsigned long long *v4;  // x19
    unsigned long v5;  // x22
    unsigned long long v6;  // 4115
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (!(v2 & 1))
    {
        /* unsupported instruction */;
        sub_c4c6d8(&a0->field_1d0);
    }
    sub_c53ccc(&a0->field_1d8);
    v3 = sub_c53d7c(a0->field_1f8, a0->field_200);
    if (a0->field_0)
        v3 = _free(a0->field_8);
    if (a0->field_18 != 0x8000000000000000)
    {
        if (a0->field_18)
            v3 = _free(a0->field_20);
        if (a0->field_30)
            v3 = _free(a0->field_38);
    }
    if (!a0->field_60)
        return v3;
    v4 = a0->field_58;
    v5 = a0->field_60 - 1;
    do
    {
        if (*v4 != 9223372036854775809)
            sub_c53f50(v4);
    } while ((v5 -= 1, v4 += 73, v6 = arm64g_calculate_condition(2, v5, 1, 0), !(v6 & 1)));
    return _free();
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab7388..0xab7490 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab7388_1 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    struct st_ab7388_0 *field_98;
} st_ab7388_1;

typedef struct st_ab7388_0 {
    char padding_0[28];
    unsigned int field_1c;
    long long field_20;
    long long field_28;
    char padding_30[8];
    long long field_38;
    long long field_40;
    unsigned int field_48;
} st_ab7388_0;


unsigned long long sub_ab7388(st_ab7388_1 *a0, long long a1, unsigned long long *a2, long long a3, long long a4)
{
    st_ab7388_0 *v2;  // x26
    long long v3;  // x21
    long long v4;  // x24
    long long v5;  // x0
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_98;
    v3 = sub_a59af4(a0->field_88);
    if (v2->field_1c == 4)
    {
        v4 = sub_aafbcc(v3);
        v5 = v2->field_38;
        if (!v5)
        {
            v5 = sub_a6bf4c(sub_aafbcc(sub_a59af4(a0->field_88)), "crypto/rsa/rsa_pmeth.c", 118);
            v2->field_38 = v5;
            if (!v5)
                return 0xffffffff;
        }
        if (!sub_ab3084(v5, v4, a3, a4, v2->field_40, v2->field_48, v2->field_20, v2->field_28))
            return 0xffffffff;
        v6 = sub_aafbf4(v4, v2->field_38, a1, v3, 3);
        if (v6 >> 31 & 1)
            return v6;
    }
    else
    {
        v6 = sub_aafbf4(a4, a3, a1, v3);
        if (v6 >> 31 & 1)
            return v6;
    }
    *a2 = v6 & 0xffffffff;
    return 1;
}

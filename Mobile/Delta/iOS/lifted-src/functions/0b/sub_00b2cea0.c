/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2cea0..0xb2cfa8 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2cea0_1 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[23];
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
    long long field_68;
    long long field_70;
    long long field_78;
    long long field_80;
} st_b2cea0_1;

typedef struct st_b2cea0_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_b2cea0_0;


st_b2cea0_0 * sub_b2cea0(st_b2cea0_1 *a0)
{
    st_b2cea0_0 *v2;  // x19
    st_b2cea0_0 *v3;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(0x88, "providers/implementations/kdfs/hkdf.c", 108);
        if (!v2)
            return v2;
        v3 = v2;
        v3->field_0 = a0->field_0;
        if (sub_afe694(a0->field_28, a0->field_30, (char *)&v3[3].field_0 + 4, v3 + 4) && sub_afe694(a0->field_38, a0->field_40, &v3[4].field_8, (char *)&v3[5].field_0 + 4) && sub_afe694(a0->field_48, a0->field_50, v3 + 6, &v3[6].field_8) && sub_afe694(a0->field_58, a0->field_60, (char *)&v3[7].field_0 + 4, v3 + 8) && sub_afe694(a0->field_68, a0->field_70, &v3[8].field_8, (char *)&v3[9].field_0 + 4) && sub_afe694(a0->field_78, a0->field_80, v3 + 10, &v3[10].field_8) && sub_afe05c((char *)&v3[1].field_0 + 4, &a0->field_10))
        {
            v3->field_8 = a0->field_8;
            return v3;
        }
        sub_b2cfe0(v3);
        sub_a6c2e4(v3, "providers/implementations/kdfs/hkdf.c", 121);
    }
    return 0;
}

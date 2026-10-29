/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb069f8..0xb06aa4 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b069f8_0 {
    char padding_0[48];
    unsigned long long field_30;
    char padding_38[8];
    unsigned int field_40;
    char padding_44[40];
    char field_6c;
    char padding_6d[67];
    unsigned long long field_b0;
} st_b069f8_0;


unsigned long long sub_b069f8(st_b069f8_0 *a0, long long a1, unsigned int a2)
{
    unsigned long v2;  // x20
    unsigned long long v3;  // 4124
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0[1].padding_0[8];
    if (a0->field_6c >> 1 & 1 || !(v3 = arm64g_calculate_condition(129, a0->field_40 - 3, 3, 0), v3 & 1))
    {
        if (sub_9bf864(a1, a2 * 8, v2) >> 31 & 1)
            goto LABEL_b06a68;
    }
    else
    {
        if (sub_9c0050(a1, a2 * 8, v2) >> 31 & 1)
        {
LABEL_b06a68:
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aria_hw.c", 25, "cipher_hw_aria_initkey");
            sub_a36abc(57, 101, 0);
            return 0;
        }
    }
    a0->field_b0 = v2;
    a0->field_30 = " )";
    return 1;
}

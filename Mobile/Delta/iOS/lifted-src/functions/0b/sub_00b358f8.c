/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb358f8..0xb35a4c (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b358f8_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[20];
    unsigned int field_24;
} st_b358f8_0;


unsigned long long sub_b358f8(st_b358f8_0 *a0, unsigned int a1, long long a2, unsigned long long a3, unsigned long a4)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x24
    unsigned long long v6;  // x25
    unsigned long long v7;  // x0
    long long v8;  // x23
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b35a4c(a2, a1 == 0x2000);
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_b35b54(a0, a2);
    if ((int)v4 < 1)
        return v4;
    if (a3)
    {
        v5 = sub_9ffdd0(a2);
        v6 = sub_9ffdd0(a3);
        v7 = sub_9dddcc(sub_a19700(a2));
        if (!v7)
            return v7;
        v8 = v7;
        if (!v5 || !v6 || sub_a1adc4(v5, v6, v8))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/ec_kem.c", 230, "ossl_ec_match_params");
            sub_a36abc(57, 203, 0);
            sub_9dded4(v8);
            return 0;
        }
        sub_9dded4(v8);
        v9 = sub_b35a4c(a3, a1 == 0x1000);
        if (!(unsigned int)v9)
            return v9;
        sub_a18c08(a0->field_8);
        a0->field_8 = 0;
        v10 = sub_a18cf0(a3);
        if (!(unsigned int)v10)
            return v10;
        a0->field_8 = a3;
    }
    a0->field_24 = a1;
}

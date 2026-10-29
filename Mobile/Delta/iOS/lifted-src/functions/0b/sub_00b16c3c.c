/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb16c3c..0xb16db8 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b22da4;
extern unsigned long long g_b22f00;

unsigned int sub_b16c3c(long long *a0, unsigned long a1, unsigned int a2, unsigned long a3, unsigned long long a4, unsigned long a5, unsigned long long a6)
{
    long long v6;  // x1
    unsigned int v7;  // x19
    unsigned long long v8;  // x0
    unsigned int v9;  // w0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned int v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (a3)
    {
LABEL_b16c50:
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1478, "ec_to_type_specific_no_pub_der_encode");
        v6 = 524550;
    }
    else
    {
        if (a4 & 1)
        {
            v1 = &g_b22da4;
            v2 = &g_b22f00;
            v0 = a6;
            return sub_b22848();
        }
        if (!((unsigned int)a4 & 132))
            goto LABEL_b16c50;
        if (a2)
        {
            v7 = sub_afd760(*a0);
            if (v7)
            {
                v3 = 0;
                v8 = sub_a165e8(a2, &v3);
                if ((int)v8 > 0)
                {
                    v9 = sub_9d3fec(v7, v3, v8);
                    sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2any.c", 388);
                    sub_9d3c28(v7);
                    return (int)v9 > 0;
                }
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 383, "key_to_type_specific_der_bio");
                sub_a36abc(57, 0x80039, 0);
            }
            sub_9d3c28(v7);
            return 0;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
        v6 = 786690;
    }
    sub_a36abc(57, v6, 0);
    return 0;
}

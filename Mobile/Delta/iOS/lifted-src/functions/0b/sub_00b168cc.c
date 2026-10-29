/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb168cc..0xb16a64 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b168cc(long long *a0, long long a1, unsigned int a2, unsigned long a3, unsigned int a4)
{
    long long v3;  // x2
    long long v4;  // x1
    unsigned int v5;  // x19
    unsigned int v6;  // w0
    unsigned int v7;  // w0
    long long v9;  // x1
    unsigned int v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a3 || !(a4 & 132))
    {
        sub_a368c8();
        v3 = "dhx_to_type_specific_params_der_encode";
        v4 = 1472;
        goto LABEL_b168fc;
    }
    else
    {
        if (a2)
        {
            if (sub_9ffdf8(a2, 0x1000))
            {
                v5 = sub_afd760(*a0, a1);
                if (v5)
                {
                    v0 = 0;
                    if (sub_9ffdf8(a2, 0x1000))
                        v6 = sub_9fd594(a2);
                    else
                        v6 = sub_9fd468(a2);
                    if ((int)v6 > 0)
                    {
                        v7 = sub_9d3fec(v5, v0);
                        sub_a6c2e4(v0, "providers/implementations/encode_decode/encode_key2any.c", 388);
                        sub_9d3c28(v5);
                        return (int)v7 > 0;
                    }
                    sub_a368c8();
                    sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 383, "key_to_type_specific_der_bio");
                    sub_a36abc(57, 0x80039, 0);
                }
                sub_9d3c28(v5);
                return 0;
            }
            sub_a368c8();
            v3 = "key2any_encode";
            v4 = 1226;
LABEL_b168fc:
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", v4, v3);
            v9 = 524550;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
            v9 = 786690;
        }
        sub_a36abc(57, v9, 0);
        return 0;
    }
}

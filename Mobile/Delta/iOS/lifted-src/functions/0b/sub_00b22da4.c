/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb22da4..0xb22f00 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b22da4_0 {
    unsigned int field_0;
} st_b22da4_0;


int sub_b22da4(long long a0, unsigned long a1, unsigned long a2, st_b22da4_0 **a3, unsigned int *a4)
{
    unsigned long long *v2;  // x0
    unsigned long long *v3;  // x0
    unsigned long long *v4;  // x22
    unsigned long long v5;  // x0
    unsigned long long *v6;  // x22
    unsigned long long v7;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd0();
    v3 = v2;
    if (v3)
    {
        if (sub_a1abcc())
        {
            v3 = sub_a99624();
            if (v3)
            {
                v4 = v3;
                if (!(sub_a1abe0(v2) & 1))
                    goto LABEL_b22df0;
                if (sub_a9a7f0(v4))
                {
                    *a3 = v4;
                    *a4 = 6;
LABEL_b22e70:
                    v3 = 1;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 705, "prepare_ec_params");
                    sub_a36abc(57, 209, 0);
                    sub_9c3580(v4);
LABEL_b22ee8:
                    v3 = 0;
                }
            }
        }
        else
        {
LABEL_b22df0:
            v5 = sub_9c7910();
            if (v5)
            {
                v6 = v5;
                v7 = (unsigned int)sub_a165e8(a0, v5 + 8);
                *(unsigned int *)v6 = v7;
                if (v7 > 0)
                {
                    *a4 = 16;
                    *a3 = v6;
                    goto LABEL_b22e70;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 670, "prepare_ec_explicit_params");
                    sub_a36abc(57, 0x8000d, 0);
                    sub_9c7940(v6);
                    goto LABEL_b22ee8;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 664, "prepare_ec_explicit_params");
                sub_a36abc(57, 0x8000d, 0);
                goto LABEL_b22ee8;
            }
            goto LABEL_b22ee8;
        }
    }
    return (unsigned int)v3;
}

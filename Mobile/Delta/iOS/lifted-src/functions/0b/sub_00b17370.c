/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb17370..0xb174a8 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_b22c34;

unsigned int sub_b17370(long long *a0, long long a1, unsigned int a2, unsigned long a3, unsigned int a4)
{
    long long v2;  // x2
    long long v3;  // x1
    unsigned int v4;  // x19
    unsigned int v5;  // x20
    long long v6;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 || !(a4 & 132))
    {
        sub_a368c8();
        v2 = "dhx_to_type_specific_params_pem_encode";
        v3 = 1491;
        goto LABEL_b173a0;
    }
    else
    {
        if (a2)
        {
            if (sub_9ffdf8(a2, 0x1000))
            {
                v4 = sub_afd760(*a0, a1);
                if (v4)
                    v5 = (int)sub_a9c9b0(&g_b22c34, a0, "X9.42 DH PARAMETERS", v4, a2, a0[2], 0, 0, 0, 0) > 0;
                else
                    v5 = 0;
                sub_9d3c28(v4);
                return v5;
            }
            sub_a368c8();
            v2 = "key2any_encode";
            v3 = 1226;
LABEL_b173a0:
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", v3, v2);
            v6 = 524550;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
            v6 = 786690;
        }
        sub_a36abc(57, v6, 0);
        return 0;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1fd8c..0xb1fec4 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_b22c34;

unsigned int sub_b1fd8c(long long *a0, long long a1, unsigned int a2, unsigned long a3, unsigned int a4)
{
    long long v2;  // x2
    long long v3;  // x1
    long long v4;  // x1
    unsigned int v5;  // x19
    unsigned int v6;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 || !(a4 & 132))
    {
        sub_a368c8();
        v2 = "dh_to_DH_pem_encode";
        v3 = 1697;
        goto LABEL_b1fdbc;
    }
    else
    {
        if (a2)
        {
            if (sub_9ffdf8(a2, 0x1000))
            {
                sub_a368c8();
                v2 = "key2any_encode";
                v3 = 1226;
            }
            else
            {
                v5 = sub_afd760(*a0, a1);
                if (v5)
                    v6 = (int)sub_a9c9b0(&g_b22c34, a0, "DH PARAMETERS", v5, a2, a0[2], 0, 0, 0, 0) > 0;
                else
                    v6 = 0;
                sub_9d3c28(v5);
                return v6;
            }
LABEL_b1fdbc:
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", v3, v2);
            v4 = 524550;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
            v4 = 786690;
        }
        sub_a36abc(57, v4, 0);
        return 0;
    }
}

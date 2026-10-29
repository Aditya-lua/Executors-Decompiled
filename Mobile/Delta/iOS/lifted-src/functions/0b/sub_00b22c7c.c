/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb22c7c..0xb22d98 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b22c7c_0 {
    struct st_b22c7c_0 *field_0;
} st_b22c7c_0;


st_b22c7c_0 ** sub_b22c7c(long long a0, unsigned long a1, st_b22c7c_0 **a2, st_b22c7c_0 **a3, unsigned int *a4)
{
    st_b22c7c_0 **v2;  // x0
    st_b22c7c_0 **v3;  // x0
    st_b22c7c_0 **v4;  // x0
    st_b22c7c_0 **v5;  // x0
    st_b22c7c_0 **v6;  // x22
    st_b22c7c_0 **v7;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c4c40();
    v3 = sub_c4ba8(a0);
    v4 = sub_9ffdd0(a0);
    if (a2 && v2 && v3 && v4)
    {
        v5 = sub_9c7910();
        if (v5)
        {
            v6 = v5;
            v7 = (st_b22c7c_0 **)(unsigned int)sub_a01414(a0, v5 + 1);
            *(unsigned int *)v6 = (unsigned int)v7;
            if (v7 > 0)
            {
                *a4 = 16;
                *a3 = v6;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 571, "encode_dsa_params");
            sub_a36abc(57, 0x8000d, 0);
            sub_9c7940(v6);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 564, "encode_dsa_params");
            sub_a36abc(57, 0x8000d, 0);
        }
        return 0;
    }
    *a3 = 0;
    *a4 = 0xffffffff;
    return 1;
}

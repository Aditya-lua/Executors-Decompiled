/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d6a8..0x99d7e8 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99d6a8_0 {
    char padding_0[8];
    long long field_8;
} st_99d6a8_0;


st_99d6a8_0 * sub_99d6a8(long long a0, long long a1)
{
    st_99d6a8_0 *v2;  // x0
    st_99d6a8_0 *v3;  // x21
    st_99d6a8_0 *v4;  // w0
    st_99d6a8_0 *v5;  // x23
    st_99d6a8_0 *v6;  // x0
    long long v7;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_954120();
    if (!v2)
        return 2;
    v3 = v2;
    if (sub_c68d5c(a1, 14, 2) && sub_c6876c(a1, 2) && sub_c6876c(a1, 2))
    {
        v4 = (st_99d6a8_0 *)(unsigned int)sub_ad69e4(v3);
        if (v4 >= 1)
        {
            v5 = 0;
            do
            {
                v6 = sub_ad69f8(v3, v5);
                if (!v6 || !sub_c68d5c(a1, v6->field_8, 2))
                {
                    v7 = 500;
                    goto LABEL_99d784;
                }
            } while ((v5 = (unsigned int)v5 + 1, v4 != (unsigned int)v5));
        }
        if (sub_a6e970(a1) && sub_c68d5c(a1, 0, 1) && sub_a6e970(a1))
            return 1;
        v7 = 508;
    }
    else
    {
        v7 = 491;
    }
LABEL_99d784:
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", v7, "tls_construct_ctos_use_srtp");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}

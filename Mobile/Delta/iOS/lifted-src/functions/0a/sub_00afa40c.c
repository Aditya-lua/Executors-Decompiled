/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafa40c..0xafa568 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afa40c_0 {
    struct st_afa40c_0 *field_0;
    char field_1;
    char field_2;
    char field_3;
    char field_4;
} st_afa40c_0;


st_afa40c_0 * sub_afa40c(long long a0, long long a1)
{
    st_afa40c_0 *v2;  // x0
    st_afa40c_0 *v3;  // x19
    st_afa40c_0 *v4;  // x23
    st_afa40c_0 *v5;  // x22
    char *v6;  // x24
    st_afa40c_0 *v7;  // w8
    unsigned long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af3694(a1, 0, 0);
    if (!v2)
        return 0;
    v3 = v2;
    if (!(char)v2->field_0)
    {
        sub_a6c2e4(v3, "crypto/x509/x_name.c");
        return 1;
    }
    v4 = v3;
    while (1)
    {
        v5 = 0;
        v6 = (char *)&v4->field_0 + 2;
        while (1)
        {
            v7 = (st_afa40c_0 *)*(v6 - 1);
            if (v7 == 47)
            {
                if (sub_a69984(*v6) && (v8 = v6[1], (unsigned int)v8 == 61 || sub_a69984(v8) && v6[2] == 61))
                    break;
                v7 = (st_afa40c_0 *)*(v6 - 1);
            }
            if (!v7)
                break;
            v6 += 1;
            v5 = (unsigned int)v5 + 1;
        }
        if (sub_9d3fec(a0, (char *)&v4->field_0 + 1, v5) != (unsigned int)v5)
            break;
        v4 = v6 - 1;
        if (!(char)v4->field_0)
        {
            sub_a6c2e4(v3, "crypto/x509/x_name.c");
            return 1;
        }
        if (sub_9d3fec(a0, ", ", 2) != 2)
            break;
        if (!(char)v4->field_0)
        {
            sub_a6c2e4(v3, "crypto/x509/x_name.c");
            return 1;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/x_name.c", 536, "X509_NAME_print");
    sub_a36abc(11, 0x80007, 0);
    sub_a6c2e4(v3, "crypto/x509/x_name.c");
    return 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf9054..0xaf9174 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af9054_0 {
    struct st_af9054_0 *field_0;
} st_af9054_0;


st_af9054_0 ** sub_af9054(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    st_af9054_0 **v3;  // x0
    st_af9054_0 **v4;  // x22
    st_af9054_0 **v5;  // x0
    st_af9054_0 **v6;  // x23
    st_af9054_0 **v7;  // x0
    st_af9054_0 **v8;  // x0
    long long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a997a4(a1, 0);
    if (v3)
    {
        v4 = v3;
        v5 = sub_afa338();
        if (v5)
        {
            v6 = v5;
            sub_9c3580(*v5);
            v7 = sub_a9ad24(v4);
            *v6 = v7;
            if (v7 && sub_af9174(v6, a2, a3, a4))
            {
                sub_9c3580(v4);
                v8 = sub_af8ed8(a0, v6, a5, a6);
                sub_afa344(v6);
                return v8;
            }
            sub_afa344(v6);
        }
        sub_9c3580(v4);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509name.c", 252, "X509_NAME_ENTRY_create_by_txt");
        v0 = a1;
        sub_a36abc(11, 0x77, "name=%s");
    }
    return 0;
}

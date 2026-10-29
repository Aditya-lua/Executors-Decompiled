/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa2188..0xaa2254 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa2188_0 {
    long long field_0;
    struct st_aa2188_0 *field_8;
} st_aa2188_0;


int sub_aa2188(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    st_aa2188_0 *v2;  // x0
    st_aa2188_0 *v3;  // x20
    st_aa2188_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aa0ad4(a3, sub_9ca7f0(), a0, a1, a2, 1, a4, a5);
    if (v2)
    {
        v3 = v2;
        v4 = sub_a6bffc(16, "crypto/pkcs12/p12_p8e.c", 83);
        if (v4)
        {
            v4->field_0 = a3;
            v4->field_8 = v3;
        }
        else
        {
            sub_9cf0f4(v3);
LABEL_aa223c:
            v4 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_p8e.c", 79, "PKCS8_set0_pbe_ex");
        sub_a36abc(35, 103, 0);
        goto LABEL_aa223c;
    }
    return (unsigned int)v4;
}

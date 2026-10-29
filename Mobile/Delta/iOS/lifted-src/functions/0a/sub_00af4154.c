/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4154..0xaf41f8 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af4154_0 {
    char padding_0[233];
    char field_e9;
} st_af4154_0;


unsigned int sub_af4154(st_af4154_0 *a0, char a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_af1e94())
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_vfy.c", 101, "X509_self_signed");
        sub_a36abc(11, 108, 0);
    }
    else if (sub_aea7f4(a0))
    {
        if (!(a0->field_e9 >> 5 & 1))
        {
            return 0;
        }
        else if (!a1)
        {
            return 1;
        }
    }
    return 0xffffffff;
}

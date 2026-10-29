/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeee44..0xaeeed8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeee44_0 {
    struct st_aeee44_0 *field_0;
} st_aeee44_0;


st_aeee44_0 ** sub_aeee44(unsigned long a0, st_aeee44_0 **a1)
{
    unsigned long v2;  // x8
    st_aeee44_0 **v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = *(int *)a1;
        if ((unsigned int)v2)
        {
            v3 = sub_a6bf4c(v2 + 1, "crypto/x509/v3_utf8.c", 37);
            if (!v3)
                return v3;
            _memcpy();
            *((char *)v3 + *(int *)a1) = 0;
            return v3;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/v3_utf8.c", 0x22, "i2s_ASN1_UTF8STRING");
    sub_a36abc(0x22, 0xc0102, 0);
    return 0;
}

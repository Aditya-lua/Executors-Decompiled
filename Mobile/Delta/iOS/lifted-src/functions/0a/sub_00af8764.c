/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8764..0xaf8850 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8764_0 {
    char padding_0[96];
    unsigned long long field_60;
    unsigned long long field_68;
} st_af8764_0;


unsigned long long sub_af8764(st_af8764_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long len;  // x20
    unsigned long long v3;  // x0
    unsigned long long v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (16 >= a2)
    {
        len = a2;
        if (1 << ((char)a2 & 63) & 65553)
        {
            if (a1)
            {
                if (!len)
                    len = _strlen(a1);
                v3 = sub_a6bf4c(len + 1, "crypto/x509/x509_vpm.c", 243);
                if (!v3)
                    return v3;
                v4 = v3;
                _memcpy();
                *(char *)(v4 + len) = 0;
            }
            else
            {
                len = 0;
                v4 = 0;
            }
            sub_a6c2e4(a0->field_60, "crypto/x509/x509_vpm.c", 252);
            a0->field_60 = v4;
            a0->field_68 = len;
            return 1;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/x509_vpm.c", 469, "X509_VERIFY_PARAM_set1_ip");
    sub_a36abc(11, 0x80106, 0);
    return 0;
}

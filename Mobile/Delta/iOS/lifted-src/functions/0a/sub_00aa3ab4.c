/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa3ab4..0xaa3b80 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa3ab4(long long *a0, long long a1, unsigned int a2)
{
    long long i;  // x0
    long long v3;  // x19
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = sub_9d4f8c(a1, 520);
    if (i)
    {
        do
        {
            sub_9d46fc(i, 120, 0, a0);
            if (!*a0)
            {
                v3 = 786691;
                v4 = 723;
                goto LABEL_aa3b3c;
            }
            if (sub_9c7b68(sub_a2d030(*a0)) == a2)
                return i;
            i = sub_9d4f8c(sub_9d500c(i), 520);
        } while (i);
    }
    v3 = 108;
    v4 = 718;
LABEL_aa3b3c:
    sub_a368c8();
    sub_a369bc("crypto/pkcs7/pk7_doit.c", v4, "PKCS7_find_digest");
    sub_a36abc(33, v3, 0);
    return 0;
}

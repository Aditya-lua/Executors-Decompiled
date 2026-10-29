/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6f188..0xa6f274 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a6f188(long long a0, long long a1, long long a2)
{
    long long v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a1)
    {
        if (!a2)
        {
            goto LABEL_a6f230;
        }
        else
        {
            v2 = (unsigned int)sub_9e5c94(a2);
            sub_9e46a8(a2);
            if (!v2)
LABEL_a6f230:
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/param_build.c", 297, "OSSL_PARAM_BLD_push_BN");
    sub_a36abc(15, 0xc0102, 0);
    return 0;
}

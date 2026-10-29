/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fe338..0x9fe414 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9fe338(void)
{
    unsigned long long v3;  // x0
    unsigned long v4;  // x8
    unsigned long long v0;  // [bp-0x14]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9fe414();
    if (!(unsigned int)v3)
        return v3;
    v4 = v0;
    if (!(v4 & 1))
    {
        if (v4 >> 1 & 1)
            goto LABEL_9fe3dc;
LABEL_9fe360:
        if (v4 >> 2 & 1)
            goto LABEL_9fe364;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 252, "DH_check_pub_key_ex");
        sub_a36abc(5, 124, 0);
        v4 = v0;
        if (!(v4 >> 1 & 1))
            goto LABEL_9fe360;
LABEL_9fe3dc:
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 254, "DH_check_pub_key_ex");
        sub_a36abc(5, 123, 0);
        v4 = v0;
        if (v4 >> 2 & 1)
        {
LABEL_9fe364:
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_check.c", 0x100, "DH_check_pub_key_ex");
            sub_a36abc(5, 122, 0);
            v4 = v0;
        }
    }
    return !(unsigned int)v4;
}

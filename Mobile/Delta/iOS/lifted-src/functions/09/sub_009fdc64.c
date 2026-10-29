/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fdc64..0x9fdd70 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9fdc64(void)
{
    unsigned long long v3;  // x0
    unsigned long v4;  // x19
    unsigned long long v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9fdd70();
    if (!(unsigned int)v3)
        return v3;
    v4 = v0;
    if (!(v4 & 1))
    {
        if (v4 >> 3 & 1)
            goto LABEL_9fdd0c;
LABEL_9fdc90:
        if (v4 >> 7 & 1)
            goto LABEL_9fdd3c;
LABEL_9fdc94:
        if (v4 >> 8 & 1)
            goto LABEL_9fdc98;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 37, "DH_check_params_ex");
        sub_a36abc(5, 117, 0);
        if (!(v4 >> 3 & 1))
            goto LABEL_9fdc90;
LABEL_9fdd0c:
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 39, "DH_check_params_ex");
        sub_a36abc(5, 120, 0);
        if (!(v4 >> 7 & 1))
            goto LABEL_9fdc94;
LABEL_9fdd3c:
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 41, "DH_check_params_ex");
        sub_a36abc(5, 126, 0);
        if (v4 >> 8 & 1)
        {
LABEL_9fdc98:
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_check.c", 43, "DH_check_params_ex");
            sub_a36abc(5, 103, 0);
        }
    }
    return !(unsigned int)v4;
}

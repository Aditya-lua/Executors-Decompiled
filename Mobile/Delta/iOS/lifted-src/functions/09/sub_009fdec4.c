/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fdec4..0x9fe0d4 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9fdec4(void)
{
    unsigned long long v3;  // x0
    unsigned long v4;  // x19
    unsigned long long v0;  // [bp-0x24]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9fe0d4();
    if (!(unsigned int)v3)
        return v3;
    v4 = v0;
    if (!(v4 >> 3 & 1))
    {
        if (v4 >> 4 & 1)
            goto LABEL_9fdf80;
LABEL_9fdef0:
        if (v4 >> 5 & 1)
            goto LABEL_9fdfb0;
LABEL_9fdef4:
        if (v4 >> 6 & 1)
            goto LABEL_9fdfe0;
LABEL_9fdef8:
        if (v4 >> 2 & 1)
            goto LABEL_9fe010;
        goto LABEL_9fdefc;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 128, "DH_check_ex");
        sub_a36abc(5, 120, 0);
        if (!(v4 >> 4 & 1))
            goto LABEL_9fdef0;
LABEL_9fdf80:
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 130, "DH_check_ex");
        sub_a36abc(5, 0x77, 0);
        if (!(v4 >> 5 & 1))
            goto LABEL_9fdef4;
LABEL_9fdfb0:
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 132, "DH_check_ex");
        sub_a36abc(5, 116, 0);
        if (!(v4 >> 6 & 1))
            goto LABEL_9fdef8;
LABEL_9fdfe0:
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_check.c", 134, "DH_check_ex");
        sub_a36abc(5, 115, 0);
        if (!(v4 >> 2 & 1))
        {
LABEL_9fdefc:
            if (v4 & 1)
                goto LABEL_9fe040;
            goto LABEL_9fdf00;
        }
        else
        {
LABEL_9fe010:
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_check.c", 0x88, "DH_check_ex");
            sub_a36abc(5, 121, 0);
            if (!(v4 & 1))
            {
LABEL_9fdf00:
                if (v4 >> 1 & 1)
                    goto LABEL_9fe070;
                goto LABEL_9fdf04;
            }
            else
            {
LABEL_9fe040:
                sub_a368c8();
                sub_a369bc("crypto/dh/dh_check.c", 138, "DH_check_ex");
                sub_a36abc(5, 117, 0);
                if (!(v4 >> 1 & 1))
                {
LABEL_9fdf04:
                    if (v4 >> 7 & 1)
                        goto LABEL_9fe0a0;
                    goto LABEL_9fdf08;
                }
                else
                {
LABEL_9fe070:
                    sub_a368c8();
                    sub_a369bc("crypto/dh/dh_check.c", 140, "DH_check_ex");
                    sub_a36abc(5, 118, 0);
                    if (!(v4 >> 7 & 1))
                    {
LABEL_9fdf08:
                        if (v4 >> 8 & 1)
                            goto LABEL_9fdf0c;
                    }
                    else
                    {
LABEL_9fe0a0:
                        sub_a368c8();
                        sub_a369bc("crypto/dh/dh_check.c", 142, "DH_check_ex");
                        sub_a36abc(5, 126, 0);
                        if (v4 >> 8 & 1)
                        {
LABEL_9fdf0c:
                            sub_a368c8();
                            sub_a369bc("crypto/dh/dh_check.c", 144, "DH_check_ex");
                            sub_a36abc(5, 103, 0);
                        }
                    }
                }
            }
        }
    }
    return !(unsigned int)v4;
}

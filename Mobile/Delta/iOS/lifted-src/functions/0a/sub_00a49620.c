/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa49620..0xa49794 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a49620(long long a0, unsigned long a1)
{
    unsigned long v5;  // x0
    unsigned long v6;  // x19
    unsigned int v7;  // w8
    unsigned long long v8;  // x21
    unsigned long v0;  // [bp-0x50]
    char v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = 0;
    if (a1)
    {
        v5 = sub_a4fbf0();
        if (0x11 <= (unsigned int)v5)
            sub_a69928("assertion failed: l <= sizeof(iv)", "crypto/evp/e_rc2.c", 140);
        v6 = v5;
        if (sub_9c96fc(a1, &v0, &v1, v6) == (unsigned int)v6)
        {
            switch (v7)
            {
            case 58:
                v8 = 128;
                if ((unsigned int)v6)
                {
LABEL_a496c4:
                    if (!sub_a4c694(a0, 0, 0, 0, &v1, 0xffffffff))
                        goto LABEL_a49744;
                    break;
                }
                break;
            case 160:
                v8 = 40;
                if ((unsigned int)v6)
                    goto LABEL_a496c4;
                break;
            case 120:
                v8 = 64;
                if ((unsigned int)v6)
                    goto LABEL_a496c4;
                break;
            default:
                sub_a368c8();
                sub_a369bc("crypto/evp/e_rc2.c", 125, "rc2_magic_to_meth");
                sub_a36abc(6, 108, 0);
                goto LABEL_a49744;
            }
            if ((int)sub_a4d5dc(a0, 3, v8, 0) >= 1 && 1 <= (int)sub_a4d408(a0, (unsigned int)v8 >> 3))
                goto LABEL_a49748;
            goto LABEL_a49744;
        }
        else
        {
LABEL_a49744:
            v6 = 0xffffffff;
        }
    }
    else
    {
        v6 = 0;
    }
LABEL_a49748:
    if (*(long long *)&g_10002b0 == v2)
        return v6;
    ___stack_chk_fail();
    sub_a69928("assertion failed: l <= sizeof(iv)", "crypto/evp/e_rc2.c", 140);
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa31c3c..0xa31eec (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a31c3c(unsigned long a0, unsigned int a1, unsigned int a2, unsigned int a3)
{
    unsigned int v3;  // w0
    unsigned long v4;  // x22
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    long long v7;  // x1
    long long v8;  // x1
    unsigned int v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0 || !a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_ctrl.c", 230, "ENGINE_ctrl_cmd_string");
        v8 = 786690;
    }
    else if (*(long long *)(a0 + 112) && !(v3 = sub_a31934(a0, 13, 0, a1, 0), (int)v3 <= 0))
    {
        v4 = v3;
        v5 = sub_a31934(a0, 18, v4, 0, 0);
        if (!(v5 >> 31 & 1))
        {
            if (!((unsigned int)v5 & 7))
                goto LABEL_a31db4;
            v6 = sub_a31934(a0, 18, v4, 0, 0);
            if (v6 >> 31 & 1)
            {
                sub_a368c8();
                v7 = 263;
LABEL_a31df4:
                sub_a369bc("crypto/engine/eng_ctrl.c", v7, "ENGINE_ctrl_cmd_string");
                v8 = 110;
            }
            else if (!(v6 >> 2 & 1))
            {
                if (a2)
                {
                    if (v6 >> 1 & 1)
                        return (int)sub_a31934() > 0;
                    if (!(v6 & 1))
                    {
                        sub_a368c8();
                        v7 = 303;
                        goto LABEL_a31df4;
                    }
                    _strtol(a2, &v0, 10);
                    if (v0 != a2 && !*(char *)v0)
                    {
LABEL_a31edc:
                        return (int)sub_a31934() > 0;
                    }
                    sub_a368c8();
                    sub_a369bc("crypto/engine/eng_ctrl.c", 308, "ENGINE_ctrl_cmd_string");
                    v8 = 133;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/engine/eng_ctrl.c", 286, "ENGINE_ctrl_cmd_string");
                    v8 = 135;
                }
            }
            else
            {
                if (a2)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/engine/eng_ctrl.c", 271, "ENGINE_ctrl_cmd_string");
                    v8 = 0x88;
                }
                else
                {
                    goto LABEL_a31edc;
                }
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_ctrl.c", 177, "ENGINE_cmd_is_executable");
            sub_a36abc(38, 138, 0);
LABEL_a31db4:
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_ctrl.c", 253, "ENGINE_ctrl_cmd_string");
            v8 = 134;
        }
    }
    else
    {
        if (a3)
        {
            sub_a35af4();
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_ctrl.c", 249, "ENGINE_ctrl_cmd_string");
        v8 = 137;
    }
    sub_a36abc(38, v8, 0);
    return 0;
}

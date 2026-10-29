/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb248f8..0xb24b70 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b248f8(unsigned long a0, unsigned long a1, unsigned int a2, unsigned long a3, unsigned long long a4)
{
    unsigned int v4;  // x0
    long long v5;  // x19
    unsigned int v6;  // x20
    unsigned int v7;  // x24
    unsigned int v8;  // x23
    unsigned int v9;  // x22
    long long v10;  // x1
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 703, "dsa2text_encode");
        sub_a36abc(57, 0x80106, 0);
        return 0;
    }
    v4 = sub_afd760();
    if (!v4)
        return v4;
    v5 = v4;
    if (!a2)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 125, "dsa_to_text");
        v10 = 786690;
        goto LABEL_b24b40;
    }
    if (!(a4 & 1))
    {
        v6 = 0;
        if (!(a4 >> 1 & 1))
        {
            if (!((unsigned int)a4 & 4))
                v7 = 0;
            else
                v7 = (unsigned int)"DSA-Parameters";
            if ((unsigned int)a4 & 3)
                goto LABEL_b249dc;
        }
        else
        {
            v7 = (unsigned int)"Public-Key";
            if ((unsigned int)a4 & 3)
                goto LABEL_b249dc;
        }
    }
    else
    {
        v6 = sub_9ffde0(a2);
        if (!v6)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 139, "dsa_to_text");
            sub_a36abc(57, 0xdd, 0);
            sub_9d3c28(v5);
            return v6;
        }
        v7 = (unsigned int)"Private-Key";
        if (a4 & 3)
        {
LABEL_b249dc:
            v8 = sub_a0212c(a2);
            if (v8)
            {
LABEL_b249ec:
                if (!(a4 >> 2 & 1))
                {
                    v9 = 0;
                    goto LABEL_b24a08;
                }
                else
                {
                    v9 = sub_12738(a2);
                    if (v9)
                    {
LABEL_b24a08:
                        if (sub_c4c40(a2))
                        {
                            v0 = v7;
                            v1 = sub_9e46a8();
                            if ((int)sub_9d524c(v5, "%s: (%d bit)\n") >= 1 && (!v6 || sub_a2fa60(v5, "priv:", v6)) && (!v8 || sub_a2fa60(v5, "pub: ", v8)) && (!v9 || sub_a2fe88(v5, v9)))
                            {
                                sub_9d3c28(v5);
                                return 1;
                            }
                            goto LABEL_b24b48;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 160, "dsa_to_text");
                            v10 = 158;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 0x99, "dsa_to_text");
                        v10 = 226;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 146, "dsa_to_text");
                v10 = 220;
            }
LABEL_b24b40:
            sub_a36abc(57, v10, 0);
LABEL_b24b48:
            sub_9d3c28(v5);
            return 0;
        }
    }
    v8 = 0;
    goto LABEL_b249ec;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb25db8..0xb26000 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b25db8(long long a0, unsigned int a1, unsigned long long a2)
{
    unsigned int v4;  // x9
    unsigned int v5;  // x21
    unsigned int v6;  // x0
    unsigned int v7;  // x22
    long long v8;  // x1
    unsigned int v9;  // x23
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a0 || !a1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 52, "dh_to_text");
        v8 = 786690;
    }
    else if (!(a2 & 1))
    {
        v4 = (unsigned int)"DH Parameters";
        if (!((unsigned int)a2 & 4))
            v4 = 0;
        if ((unsigned int)a2 & 2)
            v4 = (unsigned int)"DH Public-Key";
        v5 = 0;
        if (!((unsigned int)a2 & 3))
            goto LABEL_b25e9c;
LABEL_b25e14:
        v7 = sub_9ffde0(a1);
        if (v7)
        {
            if (a2 >> 2 & 1)
                goto LABEL_b25ea4;
LABEL_b25e28:
            v9 = 0;
            goto LABEL_b25eb4;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 73, "dh_to_text");
            v8 = 220;
        }
    }
    else
    {
        v6 = sub_9ffdd8(a1);
        if (v6)
        {
            v5 = v6;
            v4 = (unsigned int)"DH Private-Key";
            if ((unsigned int)a2 & 3)
                goto LABEL_b25e14;
LABEL_b25e9c:
            v7 = 0;
            if (!(a2 >> 2 & 1))
                goto LABEL_b25e28;
LABEL_b25ea4:
            v9 = sub_12738(a1);
            if (v9)
            {
LABEL_b25eb4:
                if (sub_c4c40(a1))
                {
                    v0 = v4;
                    v1 = sub_9e46a8();
                    if ((int)sub_9d524c(a0, "%s: (%d bit)\n") < 1)
                        return 0;
                    if (v5)
                    {
                        v10 = sub_a2fa60(a0, "private-key:", v5);
                        if (!(unsigned int)v10)
                            return v10;
                    }
                    if (v7)
                    {
                        v11 = sub_a2fa60(a0, "public-key:", v7);
                        if (!(unsigned int)v11)
                            return v11;
                    }
                    if (v9)
                    {
                        v12 = sub_a2fe88(a0, v9);
                        if (!(unsigned int)v12)
                            return v12;
                    }
                    v13 = sub_9ffd38(a1);
                    if ((long long)v13 < 1)
                        return 1;
                    v0 = v13;
                    if ((int)sub_9d524c(a0, "recommended-private-length: %ld bits\n") < 1)
                        return 0;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 87, "dh_to_text");
                v8 = 158;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 80, "dh_to_text");
                v8 = 226;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 66, "dh_to_text");
            v8 = 0xdd;
        }
    }
    sub_a36abc(57, v8, 0);
    return 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb24538..0xb24650 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b24538(long long *a0, long long a1, long long a2, unsigned long a3, unsigned long a4, unsigned long long a5, long long a6)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2ms.c", 233, "rsa2pvk_encode");
        sub_a36abc(57, 0x80106, 0);
        return 0;
    }
    else if (!(a4 & 1))
    {
        return 0;
    }
    else
    {
        v2 = sub_a5ba1c();
        if (v2 && sub_a59aa8(v2, a2) && (!a5 || sub_a76e48(a0 + 2, a5, a6)))
        {
            sub_9f2aec(*a0);
            v3 = sub_afd760(*a0, a1);
            if (!v3)
                goto LABEL_b2462c;
            v4 = sub_a9f558();
            sub_9d3c28(v3);
        }
        else
        {
LABEL_b2462c:
            v4 = 0;
        }
        sub_a5a4c8(v2);
        return v4;
    }
}

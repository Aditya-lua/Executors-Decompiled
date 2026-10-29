/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb24678..0xb24760 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b24678(long long *a0, long long a1, long long a2, unsigned long a3, unsigned long long a4)
{
    unsigned int v2;  // x19
    unsigned int v3;  // x0
    unsigned int v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2ms.c", 234, "rsa2msblob_encode");
        sub_a36abc(57, 0x80106, 0);
        return 0;
    }
    else if ((unsigned int)a4 & 3)
    {
        v2 = sub_a5ba1c();
        if (v2 && sub_a59aa8(v2, a2) && !(v3 = sub_afd760(*a0, a1), !v3))
        {
            if (!(a4 & 1))
                v4 = sub_a9ee5c();
            else
                v4 = sub_a9ede8();
            sub_9d3c28(v3);
        }
        else
        {
            v4 = 0;
        }
        sub_a5a4c8(v2);
        return v4;
    }
    else
    {
        return 0;
    }
}

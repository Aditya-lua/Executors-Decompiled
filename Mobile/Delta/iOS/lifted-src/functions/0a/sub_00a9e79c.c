/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9e79c..0xa9e8c4 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a9e79c(unsigned long long *a0, unsigned int a1, long long *a2, long long *a3)
{
    unsigned int v4;  // w1
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w10
    long long v8;  // x19
    long long v9;  // x20
    long long v10;  // x0
    long long v11;  // x0
    unsigned int v0;  // [bp-0x3c]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *a0;
    if ((int)sub_a9e490(&v1) >= 1)
    {
        v4 = v0;
        v5 = v4 + 7 >> 3;
        if (!*(int *)a3)
            v6 = (v4 + 15 >> 4) * 5 + v5 * 2 + 4;
        else
            v6 = v5 + 4;
        if (!*(int *)a3)
            v7 = v5 * 2 + 64;
        else
            v7 = v5 * 3 + 44;
        if (*(int *)a2)
            v6 = v7;
        if (v6 > a1 - 16)
        {
            v8 = 123;
            v9 = 299;
        }
        else
        {
            if (*(int *)a2)
            {
                v10 = sub_a9ebac(&v1);
                if (v10)
                    return v10;
            }
            else
            {
                v11 = sub_a9e8c4(&v1);
                if (v11)
                    return v11;
            }
            v8 = 110;
            v9 = 310;
        }
    }
    else
    {
        v8 = 122;
        v9 = 294;
    }
    sub_a368c8();
    sub_a369bc("crypto/pem/pvkfmt.c", v9, "do_b2i_key");
    sub_a36abc(9, v8, 0);
    return 0;
}

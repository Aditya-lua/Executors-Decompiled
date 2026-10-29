/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa630f8..0xa632bc (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a630f8(long long a0, char a1, long long a2, char a3)
{
    char v3;  // x8
    unsigned int v4;  // w0
    unsigned int v5;  // w0
    unsigned long long v6;  // x0
    char v7;  // x0
    long long v8;  // x19
    char v9;  // x20
    long long v10;  // x20
    long long v11;  // x21
    char v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a1)
        return 0;
    if (!a3)
        a3 = (char)&v0;
    if (*(long long *)(a1 + 32))
    {
        v3 = *(long long *)a1;
        if ((char)(*(char *)(a1 + 64)) >> 2 & 1)
        {
            if (v3 && *(long long *)(a1 + 8))
            {
                v5 = sub_9e46a8(v3);
                return sub_a625ec(a0, a1, 0, a2, v5, sub_9e46a8(*(long long *)(a1 + 8)), a3, 0);
            }
            *(unsigned int *)a3 = 0x800;
            return 0;
        }
        else if (v3 && *(long long *)(a1 + 8))
        {
            v4 = sub_9e46a8(v3);
            return sub_a61584(a0, a1, 0, a2, v4, sub_9e46a8(*(long long *)(a1 + 8)), a3, 0);
        }
    }
    else
    {
        v6 = sub_a62f90();
        if (!(unsigned int)v6)
            return v6;
        v7 = sub_9dddcc(a0);
        if (!v7)
            return v7;
        v8 = v7;
        if (sub_9e892c(*(long long *)(a1 + 8), v8, 0) != 1)
        {
            v10 = 113;
            v11 = 172;
            goto LABEL_a6327c;
        }
        else if (sub_9e892c(*(long long *)a1, v8, 0) == 1)
        {
            v9 = 1;
        }
        else
        {
            v10 = 115;
            v11 = 178;
LABEL_a6327c:
            sub_a368c8();
            sub_a369bc("crypto/ffc/ffc_params_validate.c", v11, "ossl_ffc_params_full_validate");
            sub_a36abc(10, v10, 0);
            v9 = 0;
        }
        sub_9dded4(v8);
        return v9;
    }
    return 0;
}

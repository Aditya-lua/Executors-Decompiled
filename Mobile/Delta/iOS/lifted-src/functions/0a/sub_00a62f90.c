/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa62f90..0xa630f8 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char sub_a62f90(long long a0, char a1, long long a2, char a3)
{
    unsigned int v10;  // w0
    unsigned int v11;  // w0
    char v0;  // [bp-0xa0]
    char v1;  // [bp-0x90]
    char v2;  // [bp-0x80]
    char v3;  // [bp-0x70]
    unsigned int v4;  // [bp-0x68]
    char v5;  // [bp-0x60], Other Possible Types: unsigned int
    char v6;  // [bp-0x50]
    char v7;  // [bp-0x34]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = 0;
    v5 = 0;
    v6 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if (!a1)
        return 0;
    if (!a3)
        a3 = (char)&v7;
    if (sub_a60efc())
    {
        v5 = 2;
        v4 = 0xffffffff;
        if (!((char)(*(char *)(a1 + 64)) >> 2 & 1))
        {
            if (*(unsigned long long *)&v0 && *(unsigned long long *)((void*)&v0 + 8))
            {
                v10 = sub_9e46a8();
                if (sub_a61584(a0, &v0, 0, a2, v10, sub_9e46a8(*(unsigned long long *)((void*)&v0 + 8)), a3, 0))
                {
                    sub_a60c38(&v0);
                    return 1;
                }
            }
        }
        else
        {
            if (*(unsigned long long *)&v0 && *(unsigned long long *)((void*)&v0 + 8))
            {
                v11 = sub_9e46a8();
                if (sub_a625ec(a0, &v0, 0, a2, v11, sub_9e46a8(*(unsigned long long *)((void*)&v0 + 8)), a3, 0))
                {
                    sub_a60c38(&v0);
                    return 1;
                }
            }
            else
            {
                *(unsigned int *)a3 = 0x800;
            }
        }
        if ((char)(*(char *)a3) >> 3 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/ffc/ffc_params_validate.c", 125, "ossl_ffc_params_simple_validate");
            sub_a36abc(5, 120, 0);
        }
        sub_a60c38(&v0);
        return 0;
    }
    return 0;
}

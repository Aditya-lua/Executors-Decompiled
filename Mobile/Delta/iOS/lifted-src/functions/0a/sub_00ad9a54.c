/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9a54..0xad9b6c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ad9be4;

char sub_ad9a54(unsigned long a0)
{
    unsigned long v2;  // x20
    char v3;  // x19
    char v4;  // x0
    unsigned long long *v5;  // x21
    unsigned long v6;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = sub_a6bffc(56, "crypto/ui/ui_lib.c", 25);
    if (!v3)
        return v3;
    v4 = sub_a7c11c();
    *(unsigned long long *)(v3 + 48) = v4;
    if (v4)
    {
        if (!v2)
        {
            v2 = sub_ada7d0();
            if (!v2)
                v2 = sub_ada7c4();
        }
        v5 = (unsigned long long *)v3;
        *v5 = v2;
        v6 = v5 + 3;
        if (sub_a6a660(11, v3, v6))
        {
            return v3;
        }
        else if ((char)(*(char *)(v3 + 40)) >> 1 & 1)
        {
            (*(long long *)(*(long long *)v3 + 56))();
        }
        else
        {
            sub_ad6958(*(long long *)(v3 + 8), &g_ad9be4);
            sub_a6a9e8(11, v3, v6);
            sub_a7c1d0(*(long long *)(v3 + 48));
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ui/ui_lib.c", 32, "UI_new_method");
        sub_a36abc(40, 0x8000f, 0);
    }
    sub_a6c2e4(v3, "crypto/ui/ui_lib.c");
    return 0;
}

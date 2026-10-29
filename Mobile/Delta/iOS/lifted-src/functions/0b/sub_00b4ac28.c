/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ac28..0xb4ad1c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b4ac28(unsigned long a0, unsigned long long *a1, long long a2, long long a3, long long a4, unsigned long a5, long long a6, long long a7)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aa96d4(a2, 1, a3, a4);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/seed_src.c", 191, "seed_get_seed");
        sub_a36abc(57, 0x80024, 0);
        return 0;
    }
    v3 = v2;
    if (sub_b4b494() && sub_aa9ce4(v3, a6, a7))
    {
        v4 = sub_c4c40(v3);
        *a1 = sub_aa9818(v3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/seed_src.c", 203, "seed_get_seed");
        sub_a36abc(57, 186, 0);
        v4 = 0;
    }
    sub_aa97ac(v3);
    return v4;
}

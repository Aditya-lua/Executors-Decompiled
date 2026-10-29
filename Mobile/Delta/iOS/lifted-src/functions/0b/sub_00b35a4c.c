/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb35a4c..0xb35b54 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b35a4c(long long a0, long long a1)
{
    long long v2;  // x20
    long long v3;  // x23
    long long v4;  // x19
    long long v5;  // x21
    long long v6;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_962b90();
    if (!sub_975ff4(a0))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ec_kem.c", 76, "eckey_check");
        sub_a36abc(57, 220, 0);
        return 0;
    }
    else if (v2)
    {
        v3 = sub_c4ba8(sub_9ffdd0(a0));
        v4 = sub_9dddcc(sub_a19700(a0));
        v5 = sub_9e4958(v4);
        v6 = 0;
        if (v3 && v5 && v4)
        {
            if (sub_9de520(0, v5, v2, v3, v4))
                v6 = !sub_9e4828(v5);
            else
                v6 = 0;
        }
        sub_9e48d4(v5);
        sub_9dded4(v4);
        return v6;
    }
    else
    {
        return !a1;
    }
}

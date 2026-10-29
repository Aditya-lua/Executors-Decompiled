/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4228c..0xb423d0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b4228c(unsigned long long a0, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x19
    long long v5;  // x0
    long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!((unsigned int)a1 & 3))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_a6ee78();
        if (!v3)
            return v3;
        v4 = v3;
        if (sub_ab1c60(a0) && (!(a1 & 1) || !sub_ac4024(a0) || (v5 = sub_ac4024(a0), sub_a6f968(v4, 0, "priv", sub_ac4024(a0), sub_ac3e68(a0)) == 1)) && (!(a1 >> 1 & 1) || (v6 = sub_ab1c60(a0), sub_a6f968(v4, 0, "pub", sub_ab1c60(a0), sub_ac4014(a0)))) && sub_a6f570(v4))
            a2();
        sub_a6eed4(v4);
        return 0;
    }
    else
    {
        return 0;
    }
}

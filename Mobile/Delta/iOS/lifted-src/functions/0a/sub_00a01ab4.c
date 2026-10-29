/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01ab4..0xa01b78 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a01ab4(long long *a0)
{
    long long v3;  // w0
    long long v4;  // x19
    long long v5;  // x21
    long long v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = (unsigned int)sub_a01940();
    if (!v3)
        return v3;
    if (!a0[3] || !a0[14] || !a0[13])
        return 0;
    v4 = sub_9dddcc(a0[23]);
    if (v4)
    {
        v5 = sub_9e4958();
        if (v5 && sub_a01d98(v4, a0, a0[14], v5))
            v0 = !sub_9e5528(v5, a0[13]);
    }
    else
    {
        v5 = 0;
    }
    sub_9e48d4(v5);
    sub_9dded4(v4);
    return v0;
    return 0;
}

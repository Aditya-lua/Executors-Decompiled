/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01940..0xa01a04 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a01940(long long *a0, unsigned int *a1)
{
    long long v2;  // x20
    long long v3;  // x21
    unsigned int v4;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0[1] || !a0[2])
    {
        v2 = 114;
        v3 = 25;
    }
    else if ((int)sub_9e46a8() > 10000)
    {
        v2 = 103;
        v3 = 31;
    }
    else
    {
        v4 = sub_9e46a8(a0[2]);
        if ((int)sub_9e46a8(a0[1]) > (int)v4)
            return 1;
        v2 = 0x66;
        v3 = 37;
    }
    sub_a368c8();
    sub_a369bc("crypto/dsa/dsa_check.c", v3, "dsa_precheck_params");
    sub_a36abc(10, v2, 0);
    *a1 = 0x800;
    return 0;
}

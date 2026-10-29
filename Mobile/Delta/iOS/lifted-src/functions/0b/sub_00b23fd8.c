/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23fd8..0xb240c0 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b23fd8(long long a0, long long a1, long long a2, unsigned long a3)
{
    unsigned long v3;  // x19
    unsigned long v4;  // x0
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2blob.c", 175, "ec2blob_encode");
        sub_a36abc(57, 0x80106, 0);
        return 0;
    }
    v0 = 0;
    v3 = 0;
    if ((int)sub_a1683c(a2, &v0) >= 1 && v0)
    {
        v4 = sub_afd760(a0, a1);
        if (v4)
        {
            v3 = sub_9d3fec();
            sub_9d3c28(v4);
        }
        else
        {
            v3 = 0;
        }
    }
    sub_a6c2e4(v0, "providers/implementations/encode_decode/encode_key2blob.c", 97);
    return v3;
}

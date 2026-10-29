/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb34cec..0xb34dc8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b34cec(unsigned long a0, unsigned long a1, unsigned long a2, long long *a3)
{
    long long v2;  // x19
    long long v3;  // x8
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a4e104();
    if (v2)
    {
        if (sub_a4fe08(v2, "AES-128-WRAP"))
        {
            v3 = 0;
        }
        else if (sub_a4fe08(v2, "AES-192-WRAP"))
        {
            v3 = 1;
        }
        else if (sub_a4fe08(v2, "AES-256-WRAP"))
        {
            v3 = 2;
        }
        else
        {
            if (!sub_a4fe08(v2, "DES3-WRAP"))
                goto LABEL_b34d80;
            v3 = 3;
        }
        *a3 = v3;
        v4 = 1;
    }
    else
    {
LABEL_b34d80:
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/x942kdf.c", 97, "find_alg_id");
        sub_a36abc(57, 145, 0);
        v4 = 0;
    }
    sub_a4bbe4(v2);
    return v4;
}

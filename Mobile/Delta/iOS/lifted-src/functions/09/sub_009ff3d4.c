/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ff3d4..0x9ff4b4 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ff3d4(long long a0, long long a1, long long a2)
{
    unsigned long long v4;  // x19
    unsigned long long v5;  // x0
    long long v6;  // x20
    char v0;  // [bp-0x2c]
    unsigned long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_9e4db0(a1, a2, 0);
    if (v4)
    {
        sub_9ffcc8(a0, &v1, 0, 0);
        if (!v1 || 15 > sub_9e46a8(v1) + 14)
        {
            v6 = 107;
        }
        else if (sub_9fe4e4(a0, v4, &v0))
        {
            v5 = sub_9ffd74(a0, v4, 0);
            if ((unsigned int)v5 == 1)
                return v5;
            goto LABEL_9ff460;
        }
        else
        {
            v6 = 0x66;
        }
    }
    else
    {
LABEL_9ff460:
        v6 = 106;
    }
    sub_a368c8();
    sub_a369bc("crypto/dh/dh_key.c", 412, "ossl_dh_buf2key");
    sub_a36abc(5, v6, 0);
    sub_9e48d4(v4);
    return 0;
}

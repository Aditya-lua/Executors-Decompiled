/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3658..0x9c3708 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c3658(char *a0, unsigned long long len)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long i;  // w22
    unsigned long v20;  // x0
    unsigned long long v21;  // x0
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    char *iter;  // x19
    unsigned long long v17;  // w20
    unsigned long long v18;  // w21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return 19;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    iter = a0;
    if (!(len >> 31 & 1))
    {
        if ((int)len < 1)
            goto LABEL_9c36f0;
LABEL_9c3680:
        v17 = 0;
        v18 = 0;
        i = (unsigned int)len + 1;
        do
        {
            v20 = *iter;
            iter += 1;
            if (!sub_a6994c(v20, 0x800))
                v18 = 1;
            if (0 > (char)v20)
                v17 = 1;
            i -= 1;
        } while (1 < i);
        if (!v18)
            v21 = 19;
        else
            v21 = 22;
        if (v17)
            v21 = 20;
    }
    else
    {
        len = _strlen(iter);
        if (1 <= (int)len)
            goto LABEL_9c3680;
LABEL_9c36f0:
        v21 = 19;
    }
    return v21;
}

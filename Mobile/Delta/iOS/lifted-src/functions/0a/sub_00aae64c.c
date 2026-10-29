/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaae64c..0xaae6d8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_aae64c(long long a0, long long a1, long long *a2)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long *v13;  // x21
    unsigned long long *v14;  // x21
    long long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (a0)
    {
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = v11;
        v5 = &v7;
        v6 = v12;
        if (*a2)
        {
            v13 = a2 + 1;
            do
            {
                v14 = v13;
                if (!sub_a6fbc4(a1))
                    continue;
                v0 = 0;
                if (!sub_a70f20())
                {
LABEL_aae6b8:
                    a0 = 0;
                    goto LABEL_aae6c4;
                }
                else if (!sub_ad68a0(a0, v0))
                {
                    sub_9e4838(v0);
                    goto LABEL_aae6b8;
                }
            } while ((v13 = v14 + 1, *v14));
        }
        a0 = 1;
LABEL_aae6c4:
    }
    return a0;
}

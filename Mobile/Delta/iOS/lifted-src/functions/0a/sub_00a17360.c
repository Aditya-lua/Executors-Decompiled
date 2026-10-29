/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa17360..0xa1750c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a17360(long long a0, long long a1, unsigned int a2)
{
    unsigned long v5;  // x0
    unsigned long v6;  // x24
    unsigned long v7;  // x20
    unsigned long v8;  // x0
    unsigned long v9;  // x19
    unsigned long v10;  // x0
    unsigned long v11;  // x21
    long long v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = 0;
    v5 = sub_9ffdd0();
    if (!v5)
        return 0;
    v6 = v5;
    v7 = sub_a6fbc4(a1, "pub");
    if (a2)
        v8 = sub_a6fbc4(a1, "priv");
    else
        v8 = 0;
    v9 = sub_9dddcc(sub_a19700(a0));
    if (!v9)
    {
LABEL_a174bc:
        v7 = 0;
    }
    else if (v7)
    {
        if (!sub_a71440(v7, &v1, 0, &v0))
            goto LABEL_a174bc;
        v7 = sub_a1a56c(v6);
        if (v7 && sub_a1dafc(v6, v7, v1, v0, v9))
            goto LABEL_a17428;
    }
    else
    {
LABEL_a17428:
        if (a2 && v8)
        {
            v10 = sub_c4ba8(v6);
            if (v10 && !sub_9e4828())
            {
                v2 = sub_9e4988(sub_9e4290(v10));
                if (v2 && sub_9e4cdc() && !(sub_9e5d14(v2, 4), !sub_a70f20(v8, &v2) || v2 && !sub_a197c4(a0)))
                    goto LABEL_a174a0;
            }
        }
        else
        {
LABEL_a174a0:
            if (!v7 || sub_a19698(a0, v7))
            {
                v11 = 1;
                goto LABEL_a174c4;
            }
        }
    }
    v11 = 0;
LABEL_a174c4:
    sub_9dded4(v9);
    sub_9e4838(v2);
    sub_a6c2e4(v1, "crypto/ec/ec_backend.c", 492);
    sub_a1a254(v7);
    return v11;
}

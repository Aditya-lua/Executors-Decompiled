/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4ff0..0xaa5114 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_aa4ff0(long long a0, long long *ptr, long long *a2)
{
    long long *v3;  // x0
    long long *v4;  // x20
    long long *v5;  // x0
    long long *v6;  // x0
    long long len;  // x0
    long long *v8;  // x23
    unsigned long v9;  // x0
    unsigned long v10;  // x8
    long long *v11;  // x20
    long long *v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a6820c();
    if (!v3)
    {
        return v3;
    }
    else if (ptr)
    {
        v4 = v3;
        v5 = sub_a67a50(a0);
        if (!(unsigned int)v5)
            return v5;
        v0 = ptr;
        if (a2)
        {
            v6 = sub_a66b6c(v4);
            if (v6)
            {
                sub_aa6fd0(*a2);
                *a2 = v6[1];
                goto LABEL_aa5074;
            }
            len = _strlen(ptr);
            v8 = sub_a6bf4c(len + 24, "crypto/property/defn_cache.c", 120);
            if (v8)
            {
                v9 = v8 + 2;
                v10 = *a2;
                *v8 = v9;
                v8[1] = v10;
                _memcpy(v9, ptr, len + 1);
                if (!sub_a66794(v4, v8) && sub_a66e38(v4))
                    goto LABEL_aa50f8;
LABEL_aa5074:
                v11 = 1;
            }
            else
            {
LABEL_aa50f8:
                sub_a6c2e4(v8, "crypto/property/defn_cache.c", 132);
                v11 = 0;
            }
        }
        else
        {
            sub_a66994(v4);
            goto LABEL_aa5074;
        }
        sub_a67bd0(a0);
        return v11;
    }
    else
    {
        return 1;
    }
}

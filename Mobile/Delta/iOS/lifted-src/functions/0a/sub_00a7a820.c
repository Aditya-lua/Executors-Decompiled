/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a820..0xa7aa24 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a820_1 {
    char field_0;
    char padding_1[7];
    long long field_8;
} st_a7a820_1;

typedef struct st_a7a820_0 {
    char padding_0[80];
    long long field_50;
} st_a7a820_0;


unsigned long long sub_a7a820(st_a7a820_0 *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3, unsigned long a4)
{
    long long v2;  // x25
    long long *v3;  // x0
    long long *v4;  // x19
    unsigned long long idx;  // x0
    unsigned long long v6;  // x22
    unsigned long long v7;  // x25
    unsigned long long v8;  // x24
    st_a7a820_1 *v9;  // x26
    unsigned long long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_50;
    v3 = sub_a6820c(v2, 1);
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
        return 0;
    }
    v4 = v3;
    idx = sub_a6bf4c(40, "crypto/provider_core.c", 2142);
    if (!idx)
        return idx;
    v6 = idx;
    *(st_a7a820_0 **)idx = a0;
    *(unsigned long long **)(idx + 8) = a1;
    *(unsigned long long **)(idx + 16) = a2;
    *(unsigned long long **)(idx + 24) = a3;
    *(unsigned long *)(idx + 32) = a4;
    if (!sub_a7c198(v4[4]))
    {
        sub_a6c2e4(v6, "crypto/provider_core.c", 2152);
        return 0;
    }
    else if (sub_a4eeec(v2, 0))
    {
        a3();
    }
    else
    {
        v7 = sub_ad69e4(v4[1]);
        if ((int)v7 >= 1)
        {
            v8 = 0;
            while (1)
            {
                v9 = sub_ad69f8(v4[1], v8);
                if (!sub_a7c17c(v9->field_8))
                    break;
                sub_a7c1b4(v9->field_8);
                if (v9->field_0 >> 1 & 1)
                    a1();
                v8 = (unsigned int)v8 + 1;
                if ((unsigned int)v7 == (unsigned int)v8)
                {
                    v8 = v7;
                    goto LABEL_a7a99c;
                }
            }
        }
        else
        {
            v8 = 0;
        }
        if ((unsigned int)v8 == (unsigned int)v7)
        {
LABEL_a7a99c:
            v10 = sub_ad68a0(v4[2], v6);
            if ((unsigned int)v8 == (unsigned int)v7 && 0 < (int)v10)
                goto LABEL_a7a9f4;
        }
        if (!(v8 >> 31 & 1))
        {
            sub_ad69f8(v4[1], v8);
            a2();
        }
        sub_a6c2e4(v6, "crypto/provider_core.c", 2193);
        v10 = 0;
LABEL_a7a9f4:
        sub_a7c1b4(v4[4]);
        return v10;
    }
}

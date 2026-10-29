/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954884..0x954a28 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_afa390;

unsigned int * sub_954884(unsigned int *a0)
{
    unsigned long long idx;  // x19
    unsigned long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long index;  // x20
    unsigned long v6;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    idx = a0;
    v3 = *a0;
    if ((unsigned int)v3)
    {
        if (v3 >> 7 & 1)
        {
            idx = sub_980dc8(idx);
            if (!idx)
                return idx;
        }
        else
        {
            return a0;
        }
    }
    sub_9543e4(idx);
    sub_a5a4c8(*(long long *)(idx + 1248));
    *(unsigned long long *)(idx + 1248) = 0;
    v4 = *(long long *)(idx + 824);
    if (v4)
    {
        index = 0;
        v6 = idx + 784;
        do
        {
            if (*(long long *)(v6 + index * 8))
            {
                if (*(long long *)(idx + 776) == *(long long *)(v6 + index * 8))
                    *(unsigned long long *)(idx + 776) = 0;
                sub_a5a4c8();
                *(unsigned long long *)(v6 + index * 8) = 0;
                v4 = *(long long *)(idx + 824);
            }
        } while ((index += 1, v4 > index));
    }
    *(unsigned long long *)(idx + 824) = 0;
    if (*(long long *)(idx + 776))
    {
        sub_a5a4c8(*(long long *)(idx + 776));
        *(unsigned long long *)(idx + 776) = 0;
    }
    sub_961c44(*(long long *)(idx + 880));
    sub_961c0c(*(long long *)(idx + 888));
    sub_a6c2e4(*(long long *)(idx + 840), "ssl/s3_lib.c", 3856);
    sub_ad6958(*(long long *)(idx + 856), &g_afa390);
    sub_a6c2e4(*(long long *)(idx + 928), "ssl/s3_lib.c", 3858);
    sub_a6c4e8(*(long long *)(idx + 944), *(long long *)(idx + 952), "ssl/s3_lib.c", 3859);
    sub_a6c2e4(*(long long *)(idx + 992), "ssl/s3_lib.c", 3860);
    sub_a6c2e4(*(long long *)(idx + 1000), "ssl/s3_lib.c", 3861);
    sub_a6c2e4(*(long long *)(idx + 1032), "ssl/s3_lib.c", 3862);
    sub_9544bc(idx);
    sub_a6c2e4(*(long long *)(idx + 1208), "ssl/s3_lib.c", 3864);
    sub_a6c2e4(*(long long *)(idx + 1224), "ssl/s3_lib.c", 3865);
    sub_98a138(*(long long *)(idx + 344));
    sub_a6c2e4(*(long long *)(idx + 960), "ssl/s3_lib.c", 3869);
    sub_9708f8(idx);
}

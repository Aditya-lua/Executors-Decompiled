/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc69da0..0xc69ecc (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c69da0(unsigned long long a0, unsigned long a1)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x22
    unsigned long long index;  // x0
    unsigned long v5;  // x23
    unsigned long long idx;  // x0
    unsigned long v7;  // x25
    unsigned long v8;  // x25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        return 1;
    }
    else if (a0 == a1)
    {
        return 1;
    }
    else if (!a0)
    {
        return 0;
    }
    else if ((int)sub_ad69e4(a1) >= 1)
    {
        v2 = 0;
        v3 = 0;
        while (1)
        {
            index = sub_ad69f8(a1, v2);
            if (!index)
                return index;
            if (*(int *)index == 1)
            {
                v5 = *(long long *)*(long long *)(index + 8);
            }
            else if (!*(int *)index)
            {
                v5 = *(long long *)(index + 8);
            }
            else
            {
                return 0;
            }
            while (1)
            {
                if ((int)sub_ad69e4(a0) <= (int)v3)
                    return 0;
                idx = sub_ad69f8(a0, v3);
                if (!idx)
                    return idx;
                if (*(int *)idx == 1)
                {
                    v8 = *(long long *)*(long long *)(idx + 8);
                    v7 = *(long long *)(*(long long *)(idx + 8) + 8);
                }
                else if (!*(int *)idx)
                {
                    v7 = *(long long *)(idx + 8);
                    v8 = *(long long *)(idx + 8);
                }
                else
                {
                    return 0;
                }
                if (!(sub_ae3bc0(v7) >> 31 & 1))
                    break;
                v3 = (unsigned int)v3 + 1;
            }
            if (0 < (int)sub_9c0ffc(v8, v5))
                return 0;
            v2 = (unsigned int)v2 + 1;
            if ((int)v2 >= (int)sub_ad69e4(a1))
                return 1;
        }
    }
    else
    {
        return 1;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39650..0xa39918 (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a39650(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long node;  // x22
    long long iter;  // x23
    unsigned long long v14;  // w8
    unsigned long v15;  // x25
    unsigned long long v16;  // x26
    unsigned long long v17;  // x27
    unsigned long long v18;  // x28
    unsigned long v19;  // x8
    unsigned int v20;  // w26
    unsigned long long v21;  // w8
    unsigned long n;  // x26
    unsigned long long idx;  // x19
    unsigned long long v7;  // x0
    unsigned long long v8;  // x24
    unsigned long long v9;  // w8
    unsigned long long v10;  // x21
    unsigned long long v11;  // w9
    unsigned long long v12;  // w8
    unsigned long long v13;  // w0
    unsigned long long v0;  // [bp-0x68]
    int v1;  // [bp-0x64]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1)
        return 0;
    node = a2;
    iter = a1;
    idx = sub_975ffc();
    v7 = sub_9d500c(a0);
    if (!idx)
        return 0;
    v8 = v7;
    if (!v7)
        return 0;
    if (*(int *)idx >= 1)
    {
        v9 = *(int *)idx - *(int *)(idx + 4);
        if (v9 < (int)node)
            v10 = v9;
        else
            v10 = node & 0xffffffff;
        _memcpy();
        iter += (int)v10;
        node -= v10;
        v11 = *(int *)idx;
        v12 = *(int *)(idx + 4) + (unsigned int)v10;
        *(unsigned int *)(idx + 4) = v12;
        if (v11 == v12)
            *(unsigned long long *)idx = 0;
    }
    else
    {
        v10 = 0;
    }
    v13 = (unsigned int)sub_a50638(*(long long *)(idx + 24));
    if (v13)
    {
        if (v13 == 1)
            v14 = 0;
        else
            v14 = v13;
        v0 = v14;
        if ((int)node >= 1)
        {
            v15 = idx + 336;
            do
            {
                if (*(int *)(idx + 8) < 1)
                    break;
                if (*(long long *)(idx + 32) != *(long long *)(idx + 40))
                {
                    v16 = *(long long *)(idx + 40) - *(long long *)(idx + 32);
                    if ((int)v16 <= 0)
                        goto LABEL_a39860;
                    if (0x101 > (unsigned int)node)
                        goto LABEL_a39824;
                    goto LABEL_a397d0;
                }
                else
                {
                    *(unsigned long *)(idx + 32) = v15;
                    *(unsigned long *)(idx + 40) = v15;
                    v16 = sub_9d3d84(v8, v15, 0x1000);
                    if ((int)v16 >= 1)
                    {
                        *(unsigned long long *)(idx + 40) = *(long long *)(idx + 40) + (v16 & 0xffffffff);
                        if ((unsigned int)node < 0x101)
                            goto LABEL_a39824;
LABEL_a397d0:
                        v17 = node - v0;
                        v18 = v16 - v17;
                        if (!sub_a4c6a0())
                        {
                            sub_9d3d58(a0, 15);
                            return 0;
                        }
                        v19 = v1;
                        v10 += v19;
                        iter += v19;
                        node -= v19;
                        if ((int)v18 < 1)
                        {
                            *(long long *)(idx + 32) = *(long long *)(idx + 40);
                            continue;
                        }
                        else
                        {
                            *(long long *)(idx + 32) = *(long long *)(idx + 32) + (int)v17;
                            v16 = v18;
                        }
LABEL_a39824:
                        if ((unsigned int)v16 < 0x100)
                            v20 = v16;
                        else
                            v20 = 0x100;
                        if (!sub_a4c6a0())
                        {
                            sub_9d3d58(a0, 15);
                            *(unsigned int *)(idx + 16) = 0;
                            return 0;
                        }
                        *(unsigned long long *)(idx + 32) = *(long long *)(idx + 32) + v20;
                        *(unsigned int *)(idx + 8) = 1;
                        v21 = *(int *)idx;
                        if (!v21)
                            continue;
                        goto LABEL_a39890;
                    }
                    else
                    {
LABEL_a39860:
                        if (!sub_9d3d68(v8, 8))
                        {
                            *(unsigned int *)(idx + 8) = v16;
                            *(unsigned int *)(idx + 12) = 1;
                            *(unsigned int *)(idx + 16) = sub_a4ca14(*(long long *)(idx + 24), idx + 48, idx);
                            *(unsigned int *)(idx + 4) = 0;
                            v21 = *(int *)idx;
                        }
                        else if (!(unsigned int)v10)
                        {
                            v10 = v16 & 0xffffffff;
                            break;
                        }
                        else
                        {
                            v10 &= 0xffffffff;
                            break;
                        }
LABEL_a39890:
                        if (v21 < (int)node)
                            n = v21;
                        else
                            n = node & 0xffffffff;
                        if ((int)n < 1)
                            break;
                        _memcpy(iter, idx + 48, n);
                        v10 += n;
                        *(unsigned int *)(idx + 4) = n;
                        node -= n;
                        iter += n;
                    }
                }
            } while ((int)node > 0);
        }
        sub_9d3d58(a0, 15);
        sub_9d5054(a0);
        if (!(unsigned int)v10)
            return *(int *)(idx + 8);
        return v10;
    }
    return 0;
}

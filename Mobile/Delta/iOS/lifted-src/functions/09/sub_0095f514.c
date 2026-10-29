/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95f514..0x95f850 (828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_95f514(unsigned long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long idx;  // x19
    unsigned long v3;  // x8
    unsigned long v12;  // x8
    unsigned long long iter;  // x0
    unsigned long v14;  // x8
    unsigned long long v15;  // x22
    unsigned long long v16;  // x0
    unsigned long long node;  // x0
    unsigned long long v18;  // x0
    unsigned long long v19;  // x0
    unsigned long long iter1;  // x0
    unsigned long v5;  // x8
    unsigned long long iter2;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long v10;  // x8
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    idx = a0;
    if (a0)
    {
        v3 = *(int *)idx;
        iter1 = idx;
        if ((unsigned int)v3)
        {
            if (!(v3 >> 7 & 1))
            {
                if (0 == a1)
                    goto LABEL_95f57c;
            }
            else
            {
                iter1 = sub_980dc8(idx);
                if (*(char *)idx >= 0)
                {
                    if (!iter1)
                        goto LABEL_95f574;
                    goto LABEL_95f570;
                }
                if (sub_97cebc(idx) == a1)
                    goto LABEL_95f57c;
            }
        }
        else
        {
LABEL_95f570:
            iter1 = *(long long *)(iter1 + 80);
LABEL_95f574:
            if (iter1 == a1)
            {
LABEL_95f57c:
                v5 = *(int *)idx;
                iter2 = idx;
                if ((unsigned int)v5)
                {
                    if (!(v5 >> 7 & 1))
                    {
LABEL_95f58c:
                        if (!a2)
                            return 0;
                    }
                    else
                    {
                        iter2 = sub_980dc8(idx);
                        if (*(char *)idx >= 0)
                        {
                            if (!iter2)
                                goto LABEL_95f5e4;
                            goto LABEL_95f5c4;
                        }
                        else
                        {
                            v7 = sub_97cef8(idx);
                            if (v7 == a2)
                                return v7;
                        }
                    }
                }
                else
                {
LABEL_95f5c4:
                    if (*(long long *)(iter2 + 96))
                    {
                        v8 = sub_9d500c(*(long long *)(iter2 + 96));
                        if (v8 == a2)
                            return v8;
                    }
                    else
                    {
                        iter2 = *(long long *)(iter2 + 88);
LABEL_95f5e4:
                        if (iter2 == a2)
                            return iter2;
                    }
                }
            }
        }
    }
    else if (!(a1))
    {
        goto LABEL_95f58c;
    }
    if (a1 && a1 == a2)
    {
        v9 = sub_9d3d38(a1);
        if (!(unsigned int)v9)
            return v9;
    }
    if (idx)
    {
        v10 = *(int *)idx;
        v11 = idx;
        if (!(unsigned int)v10)
        {
LABEL_95f63c:
            v11 = *(long long *)(v11 + 80);
LABEL_95f640:
            if (v11 != a1)
            {
LABEL_95f648:
                v12 = *(int *)idx;
                iter = idx;
                if ((unsigned int)v12)
                {
                    if (!(v12 >> 7 & 1))
                    {
                        iter = 0;
                    }
                    else
                    {
                        iter = sub_980dc8(idx);
                        if (*(char *)idx >= 0)
                        {
                            if (iter)
                                goto LABEL_95f674;
                        }
                        else
                        {
                            iter = sub_97cef8(idx);
                        }
                    }
                }
                else
                {
LABEL_95f674:
                    if (*(long long *)(iter + 96))
                        iter = sub_9d500c(*(long long *)(iter + 96));
                    else
                        iter = *(long long *)(iter + 88);
                }
                v14 = *(int *)idx;
                if (iter == a2)
                {
                    if ((unsigned int)v14)
                    {
                        if (!(v14 >> 7 & 1))
                        {
                            v15 = 0;
                        }
                        else
                        {
                            v16 = sub_980dc8(idx);
                            v14 = *(int *)idx;
                            if (!(v14 >> 7 & 1))
                            {
                                if (v16)
                                    goto LABEL_95f764;
                                v15 = 0;
                            }
                            else
                            {
                                v15 = sub_97cebc(idx);
                                v14 = *(int *)idx;
                            }
LABEL_95f784:
                            node = idx;
                            if (!(unsigned int)v14)
                                goto LABEL_95f7ac;
                        }
                        if (!(v14 >> 7 & 1))
                        {
                            node = 0;
                        }
                        else
                        {
                            node = sub_980dc8(idx);
                            v14 = *(int *)idx;
                            if (!(v14 >> 7 & 1))
                            {
                                if (!node)
                                    goto LABEL_95f7d4;
LABEL_95f7ac:
                                if (*(long long *)(node + 96))
                                    node = sub_9d500c(*(long long *)(node + 96));
                                else
                                    node = *(long long *)(node + 88);
                            }
                            else
                            {
                                node = sub_97cef8(idx);
                            }
                        }
                        v14 = *(int *)idx;
                    }
                    else
                    {
                        v16 = idx;
LABEL_95f764:
                        v15 = *(long long *)(v16 + 80);
                        goto LABEL_95f784;
                    }
LABEL_95f7d4:
                    if (v15 != node)
                    {
                        if ((unsigned int)v14)
                        {
                            if (!(v14 >> 7 & 1))
                                return node;
                            v19 = sub_980dc8(idx);
                            if (*(char *)idx < 0)
                                return sub_97cdac();
                            idx = v19;
                            if (!idx)
                                return v19;
                        }
                        sub_9d5018(*(long long *)(idx + 80));
                        *(unsigned long long *)(idx + 80) = a1;
                        goto *((void *)(*(long long *)(*(long long *)(idx + 3184) + 88)));
                    }
                }
                if (!(unsigned int)v14)
                {
                    sub_9d5018(*(long long *)(idx + 80));
                    *(unsigned long long *)(idx + 80) = a1;
                    (*(long long *)(*(long long *)(idx + 3184) + 88))();
                }
                if (v14 >> 7 & 1)
                {
                    v18 = sub_980dc8(idx);
                    if (*(char *)idx >= 0)
                    {
                        idx = v18;
                        if (idx)
                        {
                            sub_9d5018(*(long long *)(idx + 80));
                            *(unsigned long long *)(idx + 80) = a1;
                            (*(long long *)(*(long long *)(idx + 3184) + 88))();
                        }
                    }
                    else
                    {
                        sub_97cdac(idx, a1);
                    }
                }
            }
        }
        else if (v10 >> 7 & 1)
        {
            v11 = sub_980dc8(idx);
            if (*(char *)idx >= 0)
            {
                if (!v11)
                    goto LABEL_95f640;
                goto LABEL_95f63c;
            }
            if (sub_97cebc(idx) != a1)
                goto LABEL_95f648;
        }
        else if (0 != a1)
        {
            goto LABEL_95f648;
        }
    }
}

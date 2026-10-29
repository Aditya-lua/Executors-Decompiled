/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9612bc..0x9613ec (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9612bc(unsigned int *a0)
{
    unsigned long v2;  // x9
    unsigned int *v3;  // x0
    unsigned long long v4;  // x8
    unsigned long v5;  // x8
    unsigned int *v6;  // x0
    unsigned int *v7;  // x19
    unsigned long long v8;  // x20
    unsigned long long v9;  // x21
    unsigned long long v10;  // x22
    long long v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = *a0;
    v3 = a0;
    v4 = a0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
            return 0;
        v3 = a0;
        a0 = sub_980dc8();
        if (a0)
        {
            v5 = *v3;
            if ((unsigned int)v5)
            {
                if (!(v5 >> 7 & 1))
                    return 0;
                v4 = sub_980dc8(v3);
                if (v4)
                    goto LABEL_961324;
            }
            else
            {
                v4 = v3;
                goto LABEL_961324;
            }
        }
    }
    else
    {
LABEL_961324:
        v6 = v3;
        v7 = a0;
        v8 = *(long long *)(v4 + 1376);
        if (*(long long *)(v4 + 1376) || *(long long *)&v6[2] && !(v8 = *(long long *)(*(long long *)&v6[2] + 16), !*(long long *)(*(long long *)&v6[2] + 16)))
        {
            if (sub_96a01c(v7) && (int)sub_ad69e4(v8) >= 1)
            {
                v9 = 0;
                v10 = 0;
                while (1)
                {
                    v11 = sub_ad69f8(v8, v10);
                    if (!sub_96a23c(v7, v11, 0x10001, 0))
                    {
                        if (!v9)
                        {
                            v9 = sub_ad61b4();
                            if (!v9)
                                return v9;
                        }
                        if (!sub_ad68a0(v9, v11))
                        {
                            sub_ad6020(v9);
                            break;
                        }
                    }
                    v10 = (unsigned int)v10 + 1;
                    if ((int)sub_ad69e4(v8) <= (int)v10)
                        return v9;
                }
            }
        }
    }
    return 0;
}

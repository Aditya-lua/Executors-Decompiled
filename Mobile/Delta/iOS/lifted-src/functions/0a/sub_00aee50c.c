/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaee50c..0xaee714 (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aee50c(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9c064c(a1, 0))
    {
        v2 = sub_9d4888(a0, "SUN");
        if (!(unsigned int)v2)
            return v2;
        if (!sub_9c064c(a1, 1))
            goto LABEL_aee590;
        v3 = sub_9d4888(a0, ", ");
        if (!(unsigned int)v3)
            return v3;
LABEL_aee57c:
        v4 = sub_9d4888(a0, "MON");
        if (!(unsigned int)v4)
            return v4;
LABEL_aee590:
        if (!sub_9c064c(a1, 2))
            goto LABEL_aee5dc;
        v5 = sub_9d4888(a0, ", ");
        if (!(unsigned int)v5)
            return v5;
LABEL_aee5c8:
        v6 = sub_9d4888(a0, "TUE");
        if (!(unsigned int)v6)
            return v6;
LABEL_aee5dc:
        if (!sub_9c064c(a1, 3))
            goto LABEL_aee628;
        v7 = sub_9d4888(a0, ", ");
        if (!(unsigned int)v7)
            return v7;
    }
    else
    {
        if (sub_9c064c(a1, 1))
            goto LABEL_aee57c;
        if (sub_9c064c(a1, 2))
            goto LABEL_aee5c8;
        if (!sub_9c064c(a1, 3))
        {
            if (!sub_9c064c(a1, 4))
            {
                if (!sub_9c064c(a1, 5))
                {
                    if (!sub_9c064c(a1, 6))
                        return 1;
LABEL_aee6bc:
                    v14 = sub_9d4888(a0, "SAT");
                    if (!(unsigned int)v14)
                        return v14;
                    return 1;
                }
LABEL_aee684:
                v12 = sub_9d4888(a0, "FRI");
                if (!(unsigned int)v12)
                    return v12;
LABEL_aee698:
                if (!sub_9c064c(a1, 6))
                    return 1;
                v13 = sub_9d4888(a0, ", ");
                if (!(unsigned int)v13)
                    return v13;
                goto LABEL_aee6bc;
            }
LABEL_aee64c:
            v10 = sub_9d4888(a0, "THU");
            if (!(unsigned int)v10)
                return v10;
LABEL_aee660:
            if (!sub_9c064c(a1, 5))
                goto LABEL_aee698;
            v11 = sub_9d4888(a0, ", ");
            if (!(unsigned int)v11)
                return v11;
            goto LABEL_aee684;
        }
    }
    v8 = sub_9d4888(a0, "WED");
    if (!(unsigned int)v8)
        return v8;
LABEL_aee628:
    if (!sub_9c064c(a1, 4))
        goto LABEL_aee660;
    v9 = sub_9d4888(a0, ", ");
    if (!(unsigned int)v9)
        return v9;
    goto LABEL_aee64c;
}

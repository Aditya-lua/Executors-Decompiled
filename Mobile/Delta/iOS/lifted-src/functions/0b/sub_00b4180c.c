/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4180c..0xb419e8 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b4180c(long long a0, long long a1)
{
    long long v2;  // x21
    unsigned int v3;  // w22
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v4;  // x23
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
    v2 = sub_ab1c98();
    v3 = sub_ab1cb0(a0, 0xf000);
    v4 = sub_962b90(a0);
    v5 = sub_a6fbc4(a1, "bits");
    if (!v5)
    {
        v7 = sub_a6fbc4(a1, "security-bits");
        if (!v7)
            goto LABEL_b418cc;
        if (v4)
            goto LABEL_b418b0;
    }
    else if (v4)
    {
        v6 = sub_a6fe3c(v5, sub_aafbc4(a0));
        if (!(unsigned int)v6)
            return v6;
        v7 = sub_a6fbc4(a1, "security-bits");
        if (v7)
        {
LABEL_b418b0:
            v8 = sub_a6fe3c(v7, sub_ab1850(a0));
            if (!(unsigned int)v8)
                return v8;
        }
LABEL_b418cc:
        v9 = sub_a6fbc4(a1, "max-size");
        if (!v9)
        {
LABEL_b41900:
            if (sub_a6fbc4(a1, "default-digest") && (v3 != 0x1000 || sub_ab8c18(v2)))
            {
                v11 = sub_a71468();
                if (!(unsigned int)v11)
                    return v11;
            }
            v12 = sub_a6fbc4(a1, "mandatory-digest");
            if (v12 && v3 == 0x1000)
            {
                if (!sub_ab8c18(v2))
                {
                    v13 = sub_ab8f24(sub_ab8ca8(v2));
                    if (!v13)
                        return v13;
                    v14 = sub_a71468(v12, v13);
                    if (!(unsigned int)v14)
                        return v14;
                }
            }
            else
            {
                if (v3 != 0x1000)
                    return sub_aae6d8(a0, 0, a1, 1) != 0;
            }
            v15 = sub_aae854(v2, 0, a1);
            if (!(unsigned int)v15)
                return v15;
            return sub_aae6d8(a0, 0, a1, 1) != 0;
        }
        else if (v4)
        {
            v10 = sub_a6fe3c(v9, sub_aafbcc(a0));
            if (!(unsigned int)v10)
                return v10;
            goto LABEL_b41900;
        }
    }
    return 0;
}

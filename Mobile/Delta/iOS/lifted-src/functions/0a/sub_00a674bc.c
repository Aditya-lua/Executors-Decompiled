/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa674bc..0xa67630 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a674bc(char *a0, long long a1, long long a2)
{
    char *v4;  // x19
    unsigned long long v5;  // w22
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v6;  // x0
    char *v7;  // x23
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    long long v10;  // x23
    unsigned long long v11;  // x0
    long long v12;  // x2
    char *v13;  // x0
    long long v0;  // [bp-0x80]
    char v1;  // [bp-0x78]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v5 = (unsigned int)sub_3729c();
    v6 = sub_c68d10(v4);
    if (!(unsigned int)v6)
        return v6;
    v7 = v4;
    if (!v5)
    {
        v7 = &v1;
        v8 = sub_a6ea2c(&v1, 0);
        if (!(unsigned int)v8)
            return v8;
    }
    if (sub_a6738c(v7, a1) && sub_a6738c(v7, a2) && sub_c68ecc(v7, &v0))
    {
        if (!v5 && !sub_a6eaf8(v7))
            goto LABEL_a675a0;
        v9 = sub_c68d5c(v4, 48, 1);
        if (!(unsigned int)v9)
            return v9;
        v10 = v0;
        if ((unsigned long long)v10 <= 0xffff)
        {
            if ((unsigned long long)v10 >= 0x100)
            {
                v11 = sub_c68d5c(v4, 130, 1);
                if (!(unsigned int)v11)
                    return v11;
                v12 = 2;
                v13 = v4;
            }
            else
            {
                if ((unsigned long long)v10 >= 128)
                {
                    v14 = sub_c68d5c(v4, 129, 1);
                    if (!(unsigned int)v14)
                        return v14;
                }
                v12 = 1;
                v13 = v4;
            }
            v15 = sub_c68d5c(v13, v10, v12);
            if (!(unsigned int)v15)
                return v15;
            if (v5)
                return sub_a6e970(v4) != 0;
            v16 = sub_a6738c(v4, a1);
            if (!(unsigned int)v16)
                return v16;
            v17 = sub_a6738c(v4, a2);
            if (!(unsigned int)v17)
                return v17;
            return sub_a6e970(v4) != 0;
        }
    }
    else if (!v5)
    {
LABEL_a675a0:
        sub_a6ed4c(v7);
    }
    return 0;
}

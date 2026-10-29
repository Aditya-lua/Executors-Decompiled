/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab2070..0xab2224 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab2070(unsigned long long *a0)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x20
    unsigned long long v12;  // x23
    unsigned long long v13;  // x0
    unsigned long long v4;  // x21
    unsigned long long v5;  // x22
    unsigned long long v6;  // w22
    unsigned long long v7;  // x0
    unsigned long long v8;  // x23
    unsigned long long v9;  // x0
    unsigned long long v10;  // x23
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad61b4();
    v3 = sub_ad61b4(v2);
    v4 = sub_ad61b4(v3);
    v5 = 0;
    if (v2 && v3 && v4)
    {
        sub_ab1f90(a0, v2, v3, v4);
        if (a0[5])
        {
            v6 = (unsigned int)sub_9e46a8(a0[5]);
            v7 = a0[7];
            if (v7)
                goto LABEL_ab20dc;
        }
        else
        {
            v6 = 0;
            v7 = a0[7];
            if (v7)
            {
LABEL_ab20dc:
                v7 = sub_9e46a8(v7);
            }
        }
        if ((int)v7 > v6)
        {
LABEL_ab20e8:
            v5 = 0;
        }
        else
        {
            if ((int)sub_ad69e4(v3) >= 1)
            {
                v8 = 0;
                do
                {
                    v9 = sub_ad69f8(v3, v8);
                    if (v9)
                        v9 = sub_9e46a8(sub_ad69f8(v3, v8), v8);
                    if (v6 < (int)v9)
                        goto LABEL_ab20e8;
                } while ((v8 = (unsigned int)v8 + 1, (int)v8 < (int)sub_ad69e4(v3)));
            }
            if ((int)sub_ad69e4(v2) >= 1)
            {
                v10 = 0;
                do
                {
                    v11 = sub_ad69f8(v2, v10);
                    if (v11)
                        v11 = sub_9e46a8(sub_ad69f8(v2, v10), v10);
                    if (v6 < (int)v11)
                        goto LABEL_ab20e8;
                } while ((v10 = (unsigned int)v10 + 1, (int)v10 < (int)sub_ad69e4(v2)));
            }
            if ((int)sub_ad69e4(v4) >= 1)
            {
                v12 = 0;
                do
                {
                    v13 = sub_ad69f8(v4, v12);
                    if (v13)
                        v13 = sub_9e46a8(sub_ad69f8(v4, v12), v12);
                    if (v6 < (int)v13)
                        goto LABEL_ab20e8;
                } while ((v12 = (unsigned int)v12 + 1, (int)v12 < (int)sub_ad69e4(v4)));
            }
            v5 = 1;
        }
    }
    sub_ad6020(v2);
    sub_ad6020(v3);
    sub_ad6020(v4);
    return v5;
}

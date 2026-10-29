/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa1298..0xaa14f8 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aa1298(long long a0, long long a1, unsigned long long a2, unsigned long long a3, long long a4, long long a5)
{
    unsigned long long v3;  // x25
    long long v4;  // x27
    unsigned long long v13;  // x0
    unsigned long long v14;  // x27
    unsigned long long v15;  // x0
    unsigned long long v16;  // w0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x28
    unsigned long long v7;  // x0
    unsigned long long v8;  // x26
    unsigned int v9;  // w0
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if ((int)sub_ad69e4() < 1)
        return 1;
    v3 = 0;
    do
    {
        v4 = sub_ad69f8(a0, v3);
        v5 = sub_aa2254(v4, 156);
        if (!v5)
        {
            v6 = 0;
        }
        else if (*(int *)v5 == 30)
        {
            v6 = *(long long *)(v5 + 8);
        }
        else
        {
            return 0;
        }
        v7 = sub_aa2254(v4, 157);
        if (!v7)
        {
            v8 = 0;
        }
        else if (*(int *)v7 == 4)
        {
            v8 = *(long long *)(v7 + 8);
        }
        else
        {
            return 0;
        }
        v9 = sub_aa2294(v4);
        if (151 >= (int)v9)
        {
            if (v9 != 150)
            {
                if (v9 == 151 && a2 && !*(long long *)a2)
                {
                    v10 = sub_aa01b0(v4, a1, 0xffffffff, a4, a5);
                    if (!v10)
                        return v10;
                    *(unsigned long long *)a2 = sub_a51618();
                    sub_9ca820(v10);
                    if (!*(long long *)a2)
                        return 0;
                }
            }
            else
            {
                if (a2 && !*(long long *)a2)
                {
                    v11 = sub_a51618(sub_aa225c(v4), a4, a5);
                    *(unsigned long long *)a2 = v11;
                    if (!v11)
                        return v11;
                }
            }
        }
        else
        {
            if (v9 != 152)
            {
                if (v9 == 155)
                {
                    v12 = sub_aa1298(sub_aa229c(v4), a1, a2, a3, a4, a5);
                    if (!(unsigned int)v12)
                        return v12;
                }
            }
            else
            {
                if (a3 && sub_aa22d4(v4) == 158)
                {
                    v13 = sub_aa231c(v4, a4, a5);
                    if (!v13)
                        return v13;
                    v14 = v13;
                    if (v8 && !sub_afc8bc(v14, *(long long *)(v8 + 8), *(int *)v8))
                    {
                        sub_afc404(v14);
                        return 0;
                    }
                    if (v6)
                    {
                        v15 = sub_9c3fc4(&v0, v6);
                        if (!(v15 >> 31 & 1))
                        {
                            v16 = (unsigned int)sub_afc7fc(v14, v0, v15);
                            sub_a6c2e4(v0, "crypto/pkcs12/p12_kiss.c", 251);
                            if (!v16)
                            {
                                sub_afc404(v14);
                                return 0;
                            }
                        }
                    }
                    if (!sub_ad68a0(a3, v14))
                    {
                        sub_afc404(v14);
                        return 0;
                    }
                }
            }
        }
        v3 = (unsigned int)v3 + 1;
    } while ((int)sub_ad69e4(a0) > (int)v3);
    return 1;
}

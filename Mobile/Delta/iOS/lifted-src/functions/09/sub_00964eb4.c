/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x964eb4..0x96521c (872 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_964eb4(unsigned long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v4;  // x24
    unsigned long long v5;  // x21
    unsigned long v6;  // x26
    unsigned long v7;  // x8
    unsigned long long v8;  // x0
    unsigned long v9;  // x8
    unsigned long v10;  // x9
    unsigned long long v11;  // x27
    unsigned long long v12;  // x19
    unsigned long long v13;  // x0
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a2;
    v5 = a0;
    v1 = 0;
    if (a1)
    {
        v6 = *(long long *)(a1 + 8);
        sub_a35af4();
        if (v5)
            goto LABEL_964f34;
        v7 = *(int *)a1;
        if ((unsigned int)v7)
        {
            if (!(v7 >> 7 & 1))
                return 0;
            v8 = sub_980dc8(a1);
            if (!v8)
                return 0;
            v9 = v8 + 5400;
            v10 = v8 + 5408;
            v11 = 1;
            if (!v4)
                goto LABEL_965030;
        }
        else
        {
            v9 = a1 + 5400;
            v10 = a1 + 5408;
            v11 = 1;
            if (!v4)
                goto LABEL_965030;
        }
    }
    else
    {
        if (!v5)
            return 0;
        sub_a35af4();
        v6 = v5;
LABEL_964f34:
        v11 = 0;
        v9 = v5 + 184;
        v10 = v5 + 192;
        if (!v4)
        {
LABEL_965030:
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 492, "use_certificate_chain_file");
            sub_a36abc(20, 0xc0102, 0);
            sub_afc404(v1);
            sub_9d3c28(0);
            return v4;
        }
    }
    v12 = sub_9d3c1c(sub_9d82cc());
    if (!v12)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 498, "use_certificate_chain_file");
    }
    else if ((int)sub_9d46fc(v12, 108, 3, v4) > 0)
    {
        v1 = sub_afc484(*(long long *)v6, *(long long *)(v6 + 1136));
        if (!v1)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 509, "use_certificate_chain_file");
            goto LABEL_9650c0;
        }
        if (sub_a9e46c(v12, &v1, *(long long *)v9, *(long long *)v10))
        {
            if (v11 & 1)
                v13 = sub_9643f8(a1);
            else
                v13 = sub_964a04(v5);
            if (sub_a35fe4(v13))
            {
                sub_afc404(v1);
                sub_9d3c28(v12);
                return 0;
            }
            if (!(unsigned int)v13)
            {
                sub_afc404(v1);
                sub_9d3c28(v12);
                return 0;
            }
            if (v11 & 1)
            {
                if (sub_95f0c4(a1, 88, 0, 0))
                    goto LABEL_96516c;
                goto LABEL_9650c8;
            }
            else
            {
                if (!sub_960f58(v5, 88, 0, 0))
                    goto LABEL_9650c8;
LABEL_96516c:
                v0 = sub_afc484(*(long long *)v6, *(long long *)(v6 + 1136));
                if (!v0)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/ssl_rsa.c", 549, "use_certificate_chain_file");
                    sub_a36abc(20, 0x8000d, 0);
                }
                else if (!sub_a9e448(v12, &v0, *(long long *)v9, *(long long *)v10))
                {
                    if (sub_a36000(sub_afc404(v0)) != 75497580)
                        goto LABEL_9650c8;
                    sub_a35af4();
                }
                else if (v11 & 1 && !(!sub_95f0c4(a1, 89, 0)))
                {
                    continue;
                }
                sub_afc404(v1);
                sub_9d3c28(v12);
                return 1;
                if (!sub_960f58(v5, 89, 0))
                {
                    sub_afc404(v0);
                    goto LABEL_9650c8;
                }
                goto LABEL_96516c;
            }
            goto LABEL_9650c8;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_rsa.c", 515, "use_certificate_chain_file");
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 503, "use_certificate_chain_file");
    }
LABEL_9650c0:
    sub_a36abc(20);
LABEL_9650c8:
    sub_afc404(v1);
    sub_9d3c28(v12);
    return 0;
}

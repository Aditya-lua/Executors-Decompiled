/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9cff8..0xa9d2ac (692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a9cff8(long long a0, long long a1, unsigned long a2, unsigned long long a3, unsigned long a4)
{
    unsigned long v5;  // x25
    long long v6;  // x20
    unsigned long v15;  // x20
    unsigned long v7;  // x19
    unsigned long long len;  // x24
    unsigned long long len1;  // x27
    unsigned long v10;  // x22
    unsigned long v11;  // x24
    unsigned long v12;  // x25
    unsigned long v13;  // x27
    unsigned long v14;  // x0
    unsigned long long v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x64]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a4;
    v6 = 524320;
    v7 = sub_a4aef0();
    if (v7)
    {
        sub_a4af14(v7);
        len = _strlen(a1);
        if (sub_9d3fec(a0, "-----BEGIN ", 11) == 11 && sub_9d3fec(a0, a1, len) == (unsigned int)len && sub_9d3fec(a0, "-----\n", 6) == 6 && (!a2 || !(len1 = _strlen(a2), (int)len1 >= 1 && (sub_9d3fec(a0, a2, len1) != (unsigned int)len1 || sub_9d3fec(a0, "\n", 1) != 1))))
        {
            v10 = sub_a6bf4c(0x2000, "crypto/pem/pem_lib.c", 663);
            if (!v10)
                goto LABEL_a9d168;
            v0 = len;
            if ((long long)v5 >= 1)
            {
                v1 = a3;
                v11 = 0;
                while (1)
                {
                    v12 = v5;
                    if (v12 < 0x1400)
                        v13 = v12;
                    else
                        v13 = 0x1400;
                    if (!sub_a4af28())
                        goto LABEL_a9d138;
                    if (!v2)
                    {
                        v14 = 0;
                    }
                    else
                    {
                        v14 = sub_9d3fec(a0, v10);
                        if ((unsigned int)v14 != v2)
                            break;
                    }
                    v11 += v14;
                    v5 = v12 - v13;
                    if ((long long)v12 <= (long long)v13)
                        goto LABEL_a9d218;
                }
                goto LABEL_a9d13c;
            }
            else
            {
                v11 = 0;
LABEL_a9d218:
                sub_a4b1f4(v7, v10, &v2);
                if ((int)v2 >= 1 && sub_9d3fec(a0, v10) != v2 || sub_9d3fec(a0, "-----END ", 9) != 9 || sub_9d3fec(a0, a1, v0) != (unsigned int)v0 || sub_9d3fec(a0, "-----\n", 6) != 6)
                    goto LABEL_a9d13c;
                v15 = v2 + v11;
            }
        }
        else
        {
            v10 = 0;
            goto LABEL_a9d13c;
        }
    }
    else
    {
        v10 = 0;
LABEL_a9d138:
        v6 = 524294;
LABEL_a9d13c:
        sub_a368c8();
        sub_a369bc("crypto/pem/pem_lib.c", 695, "PEM_write_bio");
        sub_a36abc(9, v6, 0);
LABEL_a9d168:
        v15 = 0;
    }
    sub_a4af04(v7);
    sub_a6c4e8(v10, 0x2000, "crypto/pem/pem_lib.c", 697);
    return v15;
}

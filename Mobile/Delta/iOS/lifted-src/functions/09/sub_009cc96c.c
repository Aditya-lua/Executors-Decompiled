/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cc96c..0x9ccbb8 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9cc96c(unsigned long long a0, unsigned long long *a1, unsigned long a2, unsigned long long a3, unsigned int a4)
{
    unsigned long i;  // x21
    unsigned long long v8;  // x25
    unsigned long v9;  // x26
    unsigned long long v10;  // x25
    unsigned long long v11;  // x0
    unsigned long v12;  // x27
    long long v0;  // [bp-0x90], Other Possible Types: unsigned long
    char v1;  // [bp-0x72]
    char v2;  // [bp-0x71], Other Possible Types: unsigned long long
    unsigned long long n;  // [bp-0x70]
    unsigned long long iter;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    i = a2;
    v8 = *a1;
    iter = v8;
    if (!a0 && !(a3 & 1))
    {
        *a1 = v8 + i;
        return 1;
    }
    v9 = (unsigned int)a3 & 0xff;
    if (1 <= (long long)i)
    {
        do
        {
            v10 = v8;
            if (i != 1 && !*(char *)v10 && !*(char *)(v10 + 1))
            {
                if (v9 & 1)
                {
                    *a1 = v10 + 2;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 1107, "asn1_collect");
                sub_a36abc(13, 159, 0);
                return 0;
            }
            *((char *)&v0 + 4) = 0;
            *(unsigned int *)&v0 = 0;
            if (!sub_9cc2f8(&n, 0, 0, &v1, &v2, &iter, i, 0xffffffff, v0, 0))
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 1116, "asn1_collect");
                sub_a36abc(13, 0x8010a, 0);
                return 0;
            }
            if (v2)
            {
                if (5 > (int)a4)
                {
                    v11 = sub_9cc96c(a0, &iter, n, v1, a4 + 1);
                    if (!(unsigned int)v11)
                        return v11;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/tasn_dec.c", 1123, "asn1_collect");
                    sub_a36abc(13, 197, 0);
                    return 0;
                }
            }
            else
            {
                if (n)
                {
                    if (a0)
                    {
                        v12 = *(int *)a0;
                        if (!sub_9ebee0(a0, v12 + n))
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/tasn_dec.c", 1146, "collect_data");
                            sub_a36abc(13, 0x80007, 0);
                            return 0;
                        }
                        _memcpy(*(long long *)(a0 + 8) + v12, iter, n);
                    }
                    iter += n;
                }
            }
            v8 = iter;
            i = i + v10 - v8;
        } while ((long long)i > 0);
    }
    if (v9 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 1133, "asn1_collect");
        sub_a36abc(13, 137, 0);
        return 0;
    }
    *a1 = v8;
    return 1;
}

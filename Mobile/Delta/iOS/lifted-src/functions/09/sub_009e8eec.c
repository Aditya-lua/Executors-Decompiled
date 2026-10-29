/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e8eec..0x9e9188 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e8eec(unsigned long long a0, long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, long long a5, long long a6)
{
    long long v3;  // x0
    long long v4;  // x25
    unsigned long v13;  // x8
    unsigned int v14;  // w8
    unsigned long long v15;  // w9
    unsigned int v16;  // w9
    unsigned long long v17;  // x10
    unsigned long long v18;  // x9
    unsigned long long v19;  // x20
    unsigned long long v20;  // 4112
    unsigned int v5;  // w28
    unsigned long v6;  // x19
    unsigned long long idx;  // x21
    unsigned int v8;  // w8
    unsigned long long v9;  // x8
    unsigned long iter;  // x26
    unsigned long long i;  // x27
    unsigned long long v12;  // x27
    char v0;  // [bp-0x61]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9de514(a6);
    if (!(unsigned int)a2)
    {
        v20 = arm64g_calculate_condition(0x11, a3 & 0xffffffff, 1, 0);
        if (!(v20 & 1) && !a4)
        {
            sub_9e5b4c(a1);
            return 1;
        }
    }
    else if (!(a2 >> 31 & 1) && ((unsigned int)a2 != 1 || 0 >= (int)a3))
    {
        v4 = v3;
        v5 = (unsigned int)a2 + 7;
        v6 = v5 >> 3;
        idx = sub_a6bf4c(v6, "crypto/bn/bn_rand.c", 45);
        if (!idx)
        {
LABEL_9e9034:
            v19 = 0;
        }
        else if (a0)
        {
            if ((int)sub_aa845c(v4, idx, v6, a5) < 1)
                goto LABEL_9e9034;
            if (a0 != 1)
                goto LABEL_9e9058;
            if ((int)sub_aa8658(v4, &v0, 1, a5) < 1)
                goto LABEL_9e9034;
            v8 = v0;
            if (42 > v8)
            {
                v9 = 0;
            }
            else
            {
                if (83 < v8)
                    goto LABEL_9e9050;
                v9 = 0xff;
            }
            *(char *)idx = v9;
LABEL_9e9050:
            if (9 <= (unsigned int)a2)
            {
                iter = idx + 1;
                i = v6 - 1;
                do
                {
                    v12 = i;
                    if ((int)sub_aa8658() < 1)
                        goto LABEL_9e9034;
                    v13 = v0;
                    if (v13 >> 31 & 1)
                    {
                        *(char *)iter = *(char *)(iter - 1);
                    }
                    else
                    {
                        v14 = (unsigned int)v13 & 0xff;
                        if (41 >= v14)
                        {
                            *(char *)iter = 0;
                        }
                        else if (83 >= v14)
                        {
                            *(char *)iter = 0xff;
                        }
                    }
                    iter += 1;
                    i = v12 - 1;
                } while (i);
            }
LABEL_9e9058:
            v15 = v5 & 7;
            if (a3 >> 31 & 1)
            {
                v18 = *(char *)idx;
            }
            else if (!(unsigned int)a3)
            {
                v17 = 1;
                v16 = v15;
                goto LABEL_9e9088;
            }
            else if (v15)
            {
                v16 = v15 - 1;
                v17 = 3;
LABEL_9e9088:
                v18 = *(char *)idx | (char)((unsigned int)v17 << ((char)v16 & 31));
            }
            else
            {
                *(char *)(idx + 1) = *(char *)(idx + 1) | 128;
                v18 = 1;
            }
            *(char *)idx = v18 & (char)~(0x1fe << ((char)v15 & 31));
            if (a4)
                *(char *)(idx + v6 - 1) = *(char *)(idx + v6 - 1) | 1;
            v19 = sub_9e4db0(idx, v6, a1) != 0;
        }
        else
        {
            if (1 <= (int)sub_aa8658(v4, idx, v6, a5))
                goto LABEL_9e9058;
            goto LABEL_9e9034;
        }
        sub_a6c4e8(idx, v6, "crypto/bn/bn_rand.c", 93);
        return v19;
    }
    sub_a368c8();
    sub_a369bc("crypto/bn/bn_rand.c", 98, "bnrand");
    sub_a36abc(3, 118, 0);
    return 0;
}

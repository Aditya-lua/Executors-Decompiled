/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa7538..0xaa7728 (496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_aa7538(char *a0, long long *a1, unsigned int *a2, unsigned int *a3)
{
    unsigned int *v2;  // x21
    char *v3;  // x23
    unsigned int v12;  // x8
    unsigned int v13;  // x8
    unsigned int n;  // x24
    unsigned int v15;  // x8
    unsigned long long v16;  // x8
    unsigned long long len;  // x22
    unsigned int v5;  // w25
    unsigned long long v6;  // x28
    char *v7;  // x27
    unsigned int v8;  // x28
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = a0;
    len = _strlen();
    *(unsigned long long *)v2 = *(long long *)v2 + len;
    v5 = 0;
    if (len)
    {
        v6 = len;
        v7 = v3;
        do
        {
            v8 = v6;
            if (!sub_a6994c(*v7, 7))
            {
                v9 = *v7;
                if (!(char)v5)
                    v10 = 39;
                else
                    v10 = v5;
                if (v9 == 39)
                    v10 = 0x22;
                if (v9 == 95)
                    v10 = v5;
                if (v9 != 46)
                    v5 = v10;
            }
        } while ((v7 += 1, v6 = v8 - 1, v8 != 1));
    }
    v11 = (v5 & 0xff) != 0;
    v12 = *(long long *)a2;
    if (v12 > v11)
    {
        if ((char)v5)
        {
            if (v12 == 1)
                v13 = 0;
            else
                v13 = (char)v5;
            *(char *)*a1 = v13;
            *a1 = *a1 + 1;
            *(long long *)v2 = *(long long *)v2 + 1;
            v12 = *(long long *)a2 - 1;
            *(unsigned long long *)a2 = v12;
        }
        if (v12 < len + v11 + 1)
            n = v12 - 1;
        else
            n = len;
        if (n)
        {
            _memcpy(*a1, v3, n);
            *a1 = *a1 + n;
            v12 = *(long long *)a2 - n;
            *(unsigned long long *)a2 = v12;
        }
        if ((char)v5)
        {
            if (v12)
            {
                if (v12 == 1)
                    v5 = 0;
                *(char *)*a1 = v5;
                *a1 = *a1 + 1;
                *(long long *)v2 = *(long long *)v2 + 1;
                v15 = 0xffffffffffffffff;
                v2 = a2;
            }
            else
            {
                v15 = 1;
            }
            *(long long *)v2 = *(long long *)v2 + v15;
        }
        if (len <= n)
        {
            return;
        }
        else if (*(long long *)a2 == 1)
        {
            *(char *)*a1 = 0;
            *a1 = *a1 + 1;
            v16 = 0xffffffffffffffff;
            v2 = a2;
        }
        else
        {
            return;
        }
    }
    else
    {
        v16 = (((v5 & 0xff) != 0) * 2 | (char)((v5 & 0xff) != 0) >> 63) & 0x1fffffffe & 0x1ffffffff;
    }
    *(unsigned long long *)v2 = *(long long *)v2 + v16;
    return;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc489cc..0xc48c1c (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_efd030;

double sub_c489cc(unsigned long long *a0, long long a1, unsigned long long n)
{
    unsigned long long v5;  // x9
    unsigned long long iter;  // x11
    long long v15;  // x0
    uint128_t v16;  // q0
    unsigned long long v7;  // x10
    unsigned long long v8;  // x8
    unsigned long long v9;  // x11
    unsigned long long ptr;  // x0
    unsigned long long v11;  // x8
    unsigned long long ptr1;  // x0
    unsigned long long v13;  // x22
    long long v14;  // x0
    uint128_t v0;  // [bp-0x1c0], Other Possible Types: char
    uint128_t v1;  // [bp-0x1b0]
    uint128_t v2;  // [bp-0x1a0]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (383 >= n)
    {
        _memcpy(&v0, a1, n);
        (&v0)[n] = 0;
        v5 = n + 1;
        if (14 >= n)
        {
            iter = 0;
            do
            {
                if (!(&v0)[iter])
                    goto LABEL_c48b00;
            } while ((iter += 1, v5 != iter));
        }
        else
        {
            v7 = 7;
            if (&v0 + 7 == &v0)
            {
                v8 = n - 15;
            }
            else
            {
                iter = 0;
                while (1)
                {
                    if ((&v0)[iter])
                    {
                        iter += 1;
                        if (iter == 7)
                        {
                            v8 = n - 15;
                            if (7 <= v8)
                                break;
                            else
                                goto LABEL_c48ac4;
                        }
                    }
                    else
                    {
LABEL_c48b00:
                        if (iter != n)
                            goto LABEL_c48b1c;
                        ptr = _opendir(&v0);
                        goto LABEL_c48b4c;
                    }
                }
            }
            do
            {
            } while (!(~((0x101010101010100 - *(long long *)&(&v0)[v7] | *(long long *)&(&v0)[v7]) & (0x101010101010100 - *(long long *)&(&v0)[8 + v7] | *(long long *)&(&v0)[8 + v7])) & 0x8080808080808080) && (v7 += 16, v7 <= v8));
LABEL_c48ac4:
            if (v5 != v7)
            {
                v9 = 0;
                do
                {
                    if (!(&v0)[v9 + v7])
                    {
                        iter = v9 + v7;
                        goto LABEL_c48b00;
                    }
                } while ((v9 += 1, v5 - v7 != v9));
            }
            else
            {
LABEL_c48b1c:
            }
        }
        ptr = &g_efd030;
        if (0)
            goto LABEL_c48b4c;
LABEL_c48b2c:
        v11 = 2;
    }
    else
    {
        ptr = n;
        if (sub_c79750(a1, n) & 1)
            goto LABEL_c48b2c;
LABEL_c48b4c:
        if (ptr)
        {
            if (n)
            {
                ptr1 = _malloc(n);
                if (!ptr1)
                {
                    v14 = sub_c6b970(1, n);
                    sub_c54510(&v0);
                    v15 = __Unwind_Resume(v14);
                    sub_c73e0c(v15);
                }
                v13 = ptr1;
                _memcpy();
            }
            else
            {
                v13 = 1;
            }
            v0 = CONCAT(1, 1);
            v1 = CONCAT(v13, n);
            v2 = CONCAT(ptr, n);
            ptr = _malloc(48);
            if (!ptr)
            {
                sub_c6ba70(8, 48);
                __debugbreak();
            }
            v11 = 0;
            *(uint128_t *)ptr = v0;
            *(uint128_t *)(ptr + 16) = v1;
            v16 = v2;
            *(uint128_t *)(ptr + 32) = v16;
        }
        else
        {
            v11 = 2;
            ptr = 2 | *(int *)___error() * 0x100000000;
        }
    }
    *a0 = ptr;
    *(char *)&a0[1] = v11;
    return (unsigned long long)v16;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb98414..0xb98708 (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b98414_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b98414_0;


double sub_b98414(st_b98414_0 *a0, char *a1, unsigned long long a2)
{
    unsigned long long v5;  // x19
    char *v6;  // x21
    unsigned long long iter;  // x12
    char *v16;  // x10
    unsigned long long v17;  // x10
    unsigned long long *v18;  // x12
    unsigned long v19;  // x12
    unsigned long long v20;  // x9
    unsigned long long v21;  // x25
    long long n;  // x25
    unsigned long long v23;  // x1
    long long n1;  // x23
    st_b98414_0 *v7;  // x20
    unsigned long long ptr;  // x0
    unsigned long long v9;  // x8
    unsigned long long v10;  // x22
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x9
    char *v14;  // x8
    long long v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    if ((long long)a2 < 0)
    {
        a1 = v5;
        a0 = sub_c6b970(0, a1);
    }
    v6 = a1;
    v7 = a0;
    if (v5)
    {
        ptr = _malloc(v5);
        v9 = v5;
        if (ptr)
            goto LABEL_b98478;
        sub_c6b970(1, v5);
    }
    v9 = 0;
    ptr = 1;
LABEL_b98478:
    v10 = 0;
    v11 = 0;
    v1 = CONCAT(ptr, v9);
    v2 = 0;
    while (1)
    {
        v12 = v11;
        while (1)
        {
            v13 = v5 - v11;
            v14 = &v6[v11];
            if (16 > v13)
            {
                if (v5 != v11)
                {
                    iter = 0;
                    do
                    {
                        if (v14[iter] == 10)
                            goto LABEL_b98584;
                    } while ((iter += 1, v13 != iter));
                }
                goto LABEL_b9865c;
            }
            v16 = v14 + 7 & 0xfffffffffffffff8;
            v17 = v16 - v14;
            if (v16 != v14)
            {
                iter = 0;
                do
                {
                    if (v14[iter] == 10)
                        goto LABEL_b98584;
                } while ((iter += 1, v17 != iter));
                goto LABEL_b98510;
            }
LABEL_b98518:
            v18 = &v14[v17];
            v19 = v18[1] ^ 0xa0a0a0a0a0a0a0a;
            if (!(~((0x101010101010100 - (*v18 ^ 0xa0a0a0a0a0a0a0a) | *v18) & (0x101010101010100 - v19 | v19)) & 0x8080808080808080))
            {
                v17 += 16;
LABEL_b98510:
                if (v13 - 16 < v17)
                    goto LABEL_b9854c;
                goto LABEL_b98518;
            }
LABEL_b9854c:
            if (v13 != v17)
            {
                v20 = 0;
            }
            else
            {
LABEL_b9865c:
                v11 = v12;
LABEL_b98660:
                n1 = v5 - v11;
                if (*(unsigned long long *)&v1 - v10 < (unsigned long long)n1)
                {
                    sub_c6c0cc(&v1, v10, v5 - v11, 1, 1);
                    v10 = v2;
                    if (v5 == v11)
                    {
                        v7->field_0 = v1;
                        v7->field_10 = v10 + n1;
                        return *(unsigned long long *)&v1;
                    }
                }
                else if (v5 == v11)
                {
                    v7->field_0 = v1;
                    v7->field_10 = v10 + n1;
                    return *(unsigned long long *)&v1;
                }
                _memcpy(*(unsigned long long *)((void*)&v1 + 8) + v10, &v6[v11], n1);
                v7->field_0 = v1;
                v7->field_10 = v10 + n1;
                return *(unsigned long long *)&v1;
            }
            while (v14[v20 + v17] != 10)
            {
                if (v5 - v17 - v11 == v20 + 1)
                    goto LABEL_b9865c;
            }
            iter = v20 + v17;
LABEL_b98584:
            v21 = iter + v11;
            v11 = v21 + 1;
            if (v5 > v21 && v6[v21] == 10)
                break;
            if (v5 < v11)
                goto LABEL_b9865c;
        }
        v0 = v21 - v12;
        if (*(unsigned long long *)&v1 - v10 >= v21 - v12)
        {
            n = v0;
            if (v21 == v12)
                goto LABEL_b985dc;
        }
        else
        {
            sub_c6c0cc(&v1, v10, v21 - v12, 1, 1);
            v10 = v2;
            n = v0;
            if (v21 == v12)
                goto LABEL_b985dc;
        }
        _memcpy(*(unsigned long long *)((void*)&v1 + 8) + v10, &v6[v12], n);
LABEL_b985dc:
        v23 = v10 + n;
        v2 = v23;
        if (*(unsigned long long *)&v1 - v23 <= 1)
        {
            sub_c6c0cc(&v1);
            v23 = v2;
        }
        *(unsigned short *)(*(unsigned long long *)((void*)&v1 + 8) + v23) = 2314;
        v10 = v23 + 2;
        v2 = v10;
        if (v11 > v5)
            goto LABEL_b98660;
    }
}

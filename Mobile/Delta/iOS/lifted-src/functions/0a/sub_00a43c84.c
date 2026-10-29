/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa43c84..0xa43f88 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a43c84_1 {
    char padding_0[16];
    unsigned int field_10;
} st_a43c84_1;

typedef struct st_a43c84_0 {
    char padding_0[504];
    char field_1f8;
    char padding_1f9[183];
    char field_2b0;
    char padding_2b1[15];
    char field_2c0;
    char padding_2c1[15];
    char field_2d0;
    char padding_2d1[15];
    unsigned int field_2e0;
    unsigned int field_2e4;
} st_a43c84_0;


unsigned long long sub_a43c84(long long a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long n;  // x24
    unsigned long long iter;  // x20
    unsigned long long v12;  // x21
    unsigned long long n1;  // x19
    unsigned long long v14;  // x20
    unsigned long long v4;  // x22
    st_a43c84_0 *v5;  // x0
    st_a43c84_0 *v6;  // x19
    st_a43c84_1 *v7;  // x23
    unsigned int *v8;  // x26
    unsigned long long v9;  // x8
    unsigned long long n2;  // x25
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    n = a3;
    iter = a2;
    v4 = a1;
    v5 = sub_9ffdd8();
    if (!*(int *)&v5->padding_0[500] || !(v6 = v5, *(int *)&v5->padding_0[496]))
        return 0xffffffff;
    if (iter)
    {
        if (v4)
        {
            if (sub_a4d068(v4 + v6->field_2e0, iter, n))
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/e_aes.c", 4026, "aes_ocb_cipher");
                sub_a36abc(6, 162, 0);
                return 0;
            }
            v7 = &v6->field_2c0;
            v8 = &v6->field_2e0;
        }
        else
        {
            v7 = &v6->field_2d0;
            v8 = &v6->field_2e4;
        }
        v9 = *v8;
        if ((int)v9 < 1)
        {
            v11 = 0;
            if (16 <= n)
                goto LABEL_a43ed4;
            goto LABEL_a43f0c;
        }
        n2 = 16 - (unsigned int)v9;
        if (n2 > n)
        {
            _memcpy(&v7->padding_0[v9], iter, n);
            *v8 = *v8 + (unsigned int)n;
            return 0;
        }
        _memcpy(&v7->padding_0[v9], iter, n2);
        if (v4)
        {
            if (sub_a50720(a0))
            {
                if (sub_a96f58(&v6->field_1f8, v7, v4, 16))
                    goto LABEL_a43eb0;
            }
            else
            {
                if (sub_a97298(&v6->field_1f8, v7, v4, 16))
                {
LABEL_a43eb0:
                    iter += n2;
                    *v8 = 0;
                    if (!v4)
                        v4 = 0;
                    else
                        v4 += 16;
                    v11 = 16;
                    n -= n2;
                    if (n < 16)
                    {
LABEL_a43f0c:
                        n1 = n & 15;
                        if (!n1)
                            return v11;
                        _memcpy(v7, iter, n1);
                        *v8 = n1;
                        return v11;
                    }
LABEL_a43ed4:
                    if (v4)
                    {
                        v12 = n & 0xfffffffffffffff0;
                        if (sub_a50720(a0))
                        {
                            if (sub_a96f58(&v6->field_1f8, iter, v4, v12))
                                goto LABEL_a43f04;
                        }
                        else
                        {
                            if (sub_a97298(&v6->field_1f8, iter, v4, v12))
                            {
LABEL_a43f04:
                                v11 += v12;
                                iter += v12;
                                goto LABEL_a43f0c;
                            }
                        }
                    }
                    else
                    {
                        v12 = n & 0xfffffffffffffff0;
                        if (sub_a96d40(&v6->field_1f8, iter, v12))
                            goto LABEL_a43f04;
                    }
                }
            }
        }
        else
        {
            if (sub_a96d40(&v6->field_1f8, v7, 16))
                goto LABEL_a43eb0;
        }
    }
    else
    {
        if ((int)v6->field_2e0 < 1)
        {
            v14 = 0;
            goto LABEL_a43e14;
        }
        if (sub_a50720(a0))
        {
            if (sub_a96f58(&v6->field_1f8, &v6->field_2c0, v4))
                goto LABEL_a43e0c;
        }
        else
        {
            if (sub_a97298(&v6->field_1f8, &v6->field_2c0, v4))
            {
LABEL_a43e0c:
                v14 = v6->field_2e0;
                v6->field_2e0 = 0;
LABEL_a43e14:
                if ((int)v6->field_2e4 < 1)
                {
LABEL_a43e34:
                    if (sub_a50720(a0))
                    {
                        if (sub_a97670(&v6->field_1f8, &v6->field_2b0, 16) == 1)
                        {
                            *(unsigned int *)&v6->padding_0[500] = 0;
                            return v14;
                        }
                    }
                    else
                    {
                        if (*(int *)&v6[1].padding_0[4] >= 0 && !sub_a975dc(&v6->field_1f8, &v6->field_2b0))
                        {
                            *(unsigned int *)&v6->padding_0[500] = 0;
                            return v14;
                        }
                    }
                }
                else if (sub_a96d40(&v6->field_1f8, &v6->field_2d0))
                {
                    v6->field_2e4 = 0;
                    goto LABEL_a43e34;
                }
            }
        }
    }
    return 0xffffffff;
}

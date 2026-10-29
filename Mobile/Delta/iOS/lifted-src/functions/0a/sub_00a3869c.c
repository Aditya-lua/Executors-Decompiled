/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3869c..0xa38b2c (1168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a3869c(long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x22
    unsigned long long iter;  // x20
    unsigned long long v12;  // x24
    unsigned long v13;  // x26
    unsigned long v14;  // x25
    unsigned long long n;  // x27
    unsigned long v16;  // x28
    unsigned long long v17;  // w8
    unsigned long long v18;  // w9
    unsigned long long v19;  // w2
    unsigned long v21;  // x0
    unsigned long long idx;  // x21
    unsigned long v22;  // x0
    unsigned long long v23;  // w8
    unsigned long long v24;  // x0
    unsigned long long v26;  // x24
    unsigned long long v5;  // x0
    unsigned long long v6;  // x23
    unsigned long v7;  // x8
    unsigned long v8;  // x9
    unsigned long long v9;  // x25
    unsigned long long v10;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    iter = a1;
    idx = sub_975ffc();
    v5 = sub_9d500c(a0);
    if (!idx)
        return 0;
    v6 = v5;
    if (!v5)
        return 0;
    sub_9d3d58(a0, 15);
    if (*(int *)(idx + 16) != 1)
    {
        *(unsigned int *)(idx + 16) = 1;
        *(unsigned long long *)idx = 0;
        *(unsigned int *)(idx + 8) = 0;
        sub_a4af14(*(long long *)(idx + 32));
    }
    v7 = *(int *)(idx + 4);
    if (1502 <= (int)v7)
    {
LABEL_a38a3c:
        sub_a69928("assertion failed: ctx->buf_off < (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 340);
LABEL_a38a54:
        sub_a69928("assertion failed: ctx->buf_len <= (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 341);
LABEL_a38a6c:
        sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 342);
LABEL_a38a84:
        sub_a69928("assertion failed: ctx->buf_len <= (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 405);
LABEL_a38a9c:
        sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 406);
LABEL_a38ab4:
        sub_a69928("assertion failed: ctx->tmp_len <= 3", "crypto/evp/bio_b64.c", 368);
LABEL_a38acc:
        sub_a69928("assertion failed: ctx->buf_len <= (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 381);
LABEL_a38ae4:
        sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 382);
        sub_a69928("assertion failed: ctx->buf_len <= (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 397);
        sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 398);
    }
    v8 = *(int *)idx;
    if (1502 < (int)v8)
        goto LABEL_a38a54;
    v9 = v8 - v7;
    if ((int)v8 < (int)v7)
        goto LABEL_a38a6c;
    if ((int)v9 >= 1)
    {
        do
        {
            v10 = sub_9d3fec(v6, idx + 40 + (int)v7, v9);
            if ((int)v10 <= 0)
            {
                sub_9d5054(a0);
                return v10;
            }
            if ((unsigned int)v9 >= (unsigned int)v10)
            {
                v7 = *(int *)(idx + 4) + v10;
                *(unsigned int *)(idx + 4) = v7;
                if (1503 <= (int)v7)
                    goto LABEL_a389dc;
                if (*(int *)idx < (int)v7)
                    goto LABEL_a389c4;
            }
            else
            {
                sub_a69928("assertion failed: i <= n", "crypto/evp/bio_b64.c", 350);
LABEL_a389c4:
                sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 353);
LABEL_a389dc:
                sub_a69928("assertion failed: ctx->buf_off <= (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 352);
                goto LABEL_a389f4;
            }
        } while ((v9 -= v10, 1 <= (int)v9));
    }
    *(unsigned long long *)idx = 0;
    if (!iter)
    {
        return 0;
    }
    else if ((int)v2 >= 1)
    {
        v12 = 0;
        v13 = idx + 40;
        v14 = idx + 0x606;
    }
    else
    {
        return 0;
    }
    while (1)
    {
        if ((unsigned int)v2 < 0x400)
            n = v2 & 0xffffffff;
        else
            n = 0x400;
        if (!(sub_9d3d68() >> 8 & 1))
        {
            if (!sub_a4af28(*(long long *)(idx + 32), v13, idx, iter, n))
            {
                if ((unsigned int)v12)
                    v26 = v12 & 0xffffffff;
                else
                    v26 = 0xffffffff;
                return v26;
            }
            v16 = *(int *)idx;
            if (1503 > (int)v16)
            {
                if ((int)v16 < *(int *)(idx + 4))
                    goto LABEL_a38a9c;
                v12 += n;
                goto LABEL_a388d4;
            }
            goto LABEL_a38a84;
        }
        else
        {
            v17 = *(int *)(idx + 8);
            if (v17 >= 1)
            {
                if (4 <= v17)
                    goto LABEL_a38ab4;
                v18 = 3 - v17;
                if (v18 <= (unsigned int)v2)
                    n = v18;
                else
                    n = 1;
                _memcpy();
                v19 = *(int *)(idx + 8) + (unsigned int)n;
                *(unsigned int *)(idx + 8) = v19;
                if (v19 < 3)
                    return n + v12;
                v21 = sub_a4b258(v13, v14);
                *(unsigned int *)idx = v21;
                if (1503 <= (int)v21)
                    goto LABEL_a38acc;
                v16 = v21;
                if ((int)v21 < *(int *)(idx + 4))
                    goto LABEL_a38ae4;
                *(unsigned int *)(idx + 8) = 0;
                v12 += n;
                goto LABEL_a388d4;
            }
            else
            {
                if ((unsigned int)v2 <= 2)
                {
                    _memcpy(v14, iter, n);
                    *(unsigned int *)(idx + 8) = n;
                    return v12 + n;
                }
                n = n - (n - (43691 * ((unsigned int)n & 0xffff) >> 0x11) * 3 & 0xffff) & 0xffffffff;
                v22 = sub_a4b258(v13, iter, n);
                *(unsigned int *)idx = v22;
                if (1503 <= (int)v22)
                {
                    sub_a69928("assertion failed: ctx->buf_len <= (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 397);
                    sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 398);
                }
                v16 = v22;
                if ((int)v22 < *(int *)(idx + 4))
                    sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 398);
                v12 += n;
LABEL_a388d4:
                v23 = 0;
                v2 -= n;
                iter += n & 0xffffffff;
                *(unsigned int *)(idx + 4) = 0;
            }
        }
        while ((int)v16 >= 1)
        {
            v24 = sub_9d3fec(v6, v13 + v23, v16);
            if ((int)v24 <= 0)
            {
                sub_9d5054(a0);
                if ((unsigned int)v12)
                    return v12 & 0xffffffff;
                return v24 & 0xffffffff;
            }
            if ((unsigned int)v16 < (unsigned int)v24)
            {
LABEL_a38a24:
                sub_a69928("assertion failed: i <= n", "crypto/evp/bio_b64.c", 420);
                goto LABEL_a38a3c;
            }
            v23 = *(int *)(idx + 4) + (unsigned int)v24;
            *(unsigned int *)(idx + 4) = v23;
            if (1503 > v23)
            {
                v16 -= v24;
                if (v23 > *(int *)idx)
                {
LABEL_a389f4:
                    sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 424);
                    goto LABEL_a38a0c;
                }
            }
            else
            {
LABEL_a38a0c:
                sub_a69928("assertion failed: ctx->buf_off <= (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 423);
                goto LABEL_a38a24;
            }
        }
        *(unsigned long long *)idx = 0;
        if (0 >= (int)v2)
            return v12;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb71ea8..0xb72048 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b71ea8_0 {
    char field_0;
    unsigned short field_1;
    char field_2;
} st_b71ea8_0;

extern long long g_ef7eb8;
extern long long g_ef7ef0;
extern long long g_ef7f20;

double sub_b71ea8(uint128_t *a0, st_b71ea8_0 *a1, unsigned long long a2)
{
    st_b71ea8_0 *v6;  // x21
    unsigned int v7;  // x22
    unsigned long long v16;  // 4167
    unsigned long long v17;  // 4169
    unsigned int ptr;  // x0
    unsigned long v8;  // x10
    unsigned int v9;  // w9
    unsigned int iter;  // x8
    st_b71ea8_0 *v11;  // x11
    unsigned short *v12;  // x11
    unsigned long long v13;  // x10
    unsigned long v14;  // x10
    unsigned long v15;  // x12
    uint128_t v0;  // [bp-0x50], Other Possible Types: unsigned int
    long long v1;  // [bp-0x48]
    unsigned int v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1;
    if (a2 & 1)
    {
        v7 = a2 >> 1;
        goto LABEL_b71f94;
    }
    else
    {
        v8 = v6->field_0;
        if ((unsigned int)v8)
        {
            v9 = 0;
            iter = 0;
            v11 = v6;
            while (1)
            {
                v12 = &(&v11->field_0)[1];
                if (!(v8 >> 7 & 1))
                {
                    v13 = v8 & 0xff;
                    iter += v13;
                    v11 = (char *)v12 + v13;
                    v8 = v11->field_0;
                    if (!(unsigned int)v8)
                        break;
                }
                else if ((char)v8 == 128)
                {
                    v14 = *v12;
                    iter += v14;
                    v11 = (char *)v12 + v14 + 2;
                    v8 = v11->field_0;
                    if (!(unsigned int)v8)
                        break;
                }
                else
                {
                    v9 |= !iter;
                    v15 = (unsigned int)v8 & 3;
                    v16 = ((((v15 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v15 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16;
                    v17 = ((((v15 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v15 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v15 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0;
                    v11 = (char *)v12 + ((unsigned int)v8 >> 1 & 2) + (((((((v17 >> 4 | v16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (v17 >> 4 | v16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v17 >> 4 | v16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (v17 >> 4 | v16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 61 & 0xffffffff) + ((unsigned int)v8 >> 2 & 2);
                    v8 = v11->field_0;
                    if (!(unsigned int)v8)
                        break;
                }
            }
            if (v9 & 1 & 16 > iter)
            {
                v7 = 0;
            }
            else
            {
                v7 = iter * 2;
                if (v7 < 0)
                {
                    sub_c6ba88();
                    if (v0)
                        _free(v1);
                    __Unwind_Resume();
                }
            }
LABEL_b71f94:
            if (v7)
            {
                ptr = _malloc(v7);
                if (ptr)
                    goto LABEL_b71fb4;
                sub_c6b970(1, v7);
            }
        }
        else
        {
            v7 = 0;
        }
        ptr = 1;
LABEL_b71fb4:
        v0 = CONCAT(ptr, v7);
        v2 = 0;
        if (!sub_be769c(&v0, &g_ef7ef0, v6, a2))
        {
            *a0 = v0;
            *(unsigned long long *)&a0[1] = v2;
            return *(unsigned long long *)&v0;
        }
        sub_c73d64("a formatting trait implementation returned an error when the underlying stream did notinternal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 86, &v3, &g_ef7eb8, &g_ef7f20);
        __debugbreak();
    }
}

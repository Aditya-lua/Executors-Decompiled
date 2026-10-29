/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb71bb0..0xb71dcc (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b71bb0_0 {
    unsigned short field_0;
    char field_2;
} st_b71bb0_0;


double sub_b71bb0(void* a0, unsigned long a1, unsigned long a2)
{
    unsigned long v11;  // x23
    unsigned long v12;  // x22
    unsigned long n;  // x22
    st_b71bb0_0 *v22;  // x8
    unsigned long v23;  // d0
    unsigned long v24;  // d0
    unsigned long n1;  // x21
    unsigned long ptr;  // x0
    long long v15;  // x0
    unsigned long v16;  // x8
    unsigned long v17;  // x1
    st_b71bb0_0 *v18;  // x8
    unsigned long iter;  // x21
    unsigned long v20;  // x23
    unsigned long v0;  // [bp-0xa8]
    uint128_t v1;  // [bp-0x98], Other Possible Types: unsigned long
    long long v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x78]
    char v6;  // [bp-0x70]
    unsigned long v7;  // [bp-0x68]
    unsigned long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a2;
    v0 = a1;
    sub_bed234(&v6, &v0);
    v12 = v6;
    if (v12)
    {
        n1 = v7;
        if (v8)
        {
            if (v11)
            {
                ptr = _malloc(v11);
                if (!ptr)
                {
                    v15 = sub_c6b970(1, v11);
                    if (v1)
                        _free(v2);
                    __Unwind_Resume(v15);
                }
                v1 = CONCAT(ptr, v11);
                v3 = 0;
                if (v11 < n1)
                    goto LABEL_b71d70;
LABEL_b71c1c:
                v3 = 0;
                v16 = 0;
                if (!n1)
                    goto LABEL_b71c3c;
            }
            else
            {
                ptr = 1;
                v1 = CONCAT(1, 0);
                v3 = 0;
                if (n1 <= 0)
                    goto LABEL_b71c1c;
LABEL_b71d70:
                sub_c6b984(&v1, 0, n1);
                ptr = *(unsigned long long *)((void*)&v1 + 8);
                v11 = v1;
            }
            _memcpy(ptr + v3, v12, n1);
            v16 = v3;
LABEL_b71c3c:
            v17 = v16 + n1;
            v3 = v17;
            if (v11 - v17 <= 2)
            {
                sub_c6b984(&v1);
                ptr = *(unsigned long long *)((void*)&v1 + 8);
                v17 = v3;
            }
            v18 = ptr + v17;
            v18->field_2 = 189;
            v18->field_0 = 0xbfef;
            iter = v17 + 3;
            v3 = iter;
            v4 = v0;
            v5 = a2;
            while (1)
            {
                sub_bed234(&v6, &v4);
                v20 = v6;
                if (!v20)
                    break;
                n = v7;
                if ((unsigned long long)v1 - iter < n)
                {
                    sub_c6b984(&v1, iter, n);
                    ptr = *(unsigned long long *)((void*)&v1 + 8);
                    iter = v3;
                }
                else if (!n)
                {
                    goto LABEL_b71cb4;
                }
                _memcpy(ptr + iter, v20, n);
LABEL_b71cb4:
                iter += n;
                v3 = iter;
                if (v8)
                {
                    if ((unsigned long long)v1 - iter <= 2)
                    {
                        sub_c6b984(&v1, iter, 3);
                        ptr = *(unsigned long long *)((void*)&v1 + 8);
                        iter = v3;
                    }
                    v22 = ptr + iter;
                    v22->field_2 = 189;
                    v22->field_0 = 0xbfef;
                    iter += 3;
                    v3 = iter;
                }
            }
            *(uint128_t *)a0 = v1;
            *(unsigned long *)&a0[16] = v3;
            return v23;
        }
    }
    else
    {
        n1 = 0;
        v12 = 1;
    }
    *(unsigned long *)&a0[8] = v12;
    *(unsigned long *)&a0[16] = n1;
    *(unsigned long *)a0 = 0x8000000000000000;
    return v24;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc48e44..0xc48fb0 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c48e44_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c48e44_0;


double sub_c48e44(st_c48e44_0 *a0, unsigned long a1, long long a2, char *a3, long long n)
{
    long long v5;  // x22
    long long ptr;  // x0
    long long v7;  // x23
    long long v8;  // w8
    long long v9;  // x0
    long long v10;  // x24
    uint128_t v0;  // [bp-0x58], Other Possible Types: long long
    long long v1;  // [bp-0x50]
    long long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    if (a2)
    {
        ptr = _malloc(v5);
        if (!ptr)
        {
            v9 = sub_c6b970(1, v5);
            if (v0)
                _free(v1);
            __Unwind_Resume(v9);
        }
        v7 = ptr;
        _memcpy();
        v0 = CONCAT(v7, v5);
        v2 = v5;
        v8 = *(char *)(v7 + v5 - 1) != 47;
        if (n)
            goto LABEL_c48ec4;
    }
    else
    {
        v8 = 0;
        v7 = 1;
        v0 = CONCAT(1, 0);
        v2 = 0;
        if (n)
        {
LABEL_c48ec4:
            if (*a3 == 47)
            {
                v2 = 0;
                if ((unsigned long long)n > (unsigned long long)v5)
                {
                    sub_c6c0cc(&v0, 0, n, 1, 1);
                    v10 = v2;
                    _memcpy(*(unsigned long long *)((void*)&v0 + 8) + v10, a3, n);
                    a0->field_0 = v0;
                    a0->field_10 = v10 + n;
                    return *(unsigned long long *)&v0;
                }
                _memcpy(v7, a3, n);
                a0->field_0 = v0;
                a0->field_10 = 0 + n;
                return *(unsigned long long *)&v0;
            }
        }
    }
    if (v8)
    {
        sub_c6c0cc(&v0, v5, 1, 1, 1);
        v7 = *(unsigned long long *)((void*)&v0 + 8);
        v5 = *(unsigned long long *)&v0;
        *(char *)(v7 + v2) = 47;
        v10 = v2 + 1;
        v2 = v10;
    }
    else
    {
        v10 = v5;
    }
    if ((unsigned long long)(v5 - v10) < (unsigned long long)n)
    {
        sub_c6c0cc(&v0, v10, n, 1, 1);
        v10 = v2;
        _memcpy(*(unsigned long long *)((void*)&v0 + 8) + v10, a3, n);
        a0->field_0 = v0;
        a0->field_10 = v10 + n;
        return *(unsigned long long *)&v0;
    }
    else if (n)
    {
        _memcpy(v7 + v10, a3, n);
        a0->field_0 = v0;
        a0->field_10 = v10 + n;
        return *(unsigned long long *)&v0;
    }
    else
    {
        a0->field_0 = v0;
        a0->field_10 = v10 + n;
        return *(unsigned long long *)&v0;
    }
}

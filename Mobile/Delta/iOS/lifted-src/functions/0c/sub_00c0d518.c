/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0d518..0xc0d694 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0d518_1 {
    unsigned int field_0;
} st_c0d518_1;

typedef struct st_c0d518_0 {
    struct st_c0d518_1 *field_0;
    char *field_8;
    char *field_10;
    unsigned int field_18[4];
    unsigned int field_20;
    char padding_24[4];
    struct st_c0d518_1 *field_28;
} st_c0d518_0;


double sub_c0d518(st_c0d518_0 *a0, unsigned int *i, char *a2, char *a3)
{
    char *v5;  // x22
    char *v6;  // x20
    unsigned int *v7;  // x24
    unsigned long long v8;  // x23
    unsigned int *ptr;  // x0
    unsigned int *v10;  // x23
    unsigned int *v11;  // w8
    char *v12;  // x24
    long long v14;  // x0
    unsigned int *v0;  // [bp-0x78], Other Possible Types: uint128_t
    long long v1;  // [bp-0x70]
    unsigned int *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a3;
    v6 = a2;
    if (i < 0x4000)
        v7 = i;
    else
        v7 = 0x4000;
    if (i)
    {
        v8 = v7 * 4;
        ptr = _malloc(v8);
        if (ptr)
        {
            v10 = 0;
            v11 = (unsigned int *)0;
            v0 = CONCAT(ptr, v7);
            v2 = 0;
            do
            {
                v12 = v5 - 4;
                if (v5 < 4)
                {
                    a0->field_10 = v6;
                    *(char **)&a0->field_18[0] = v5;
                    a0->field_18[2] = 23 | v11 * 0x100;
                    *(uint128_t *)&a0->field_0 = CONCAT(1, 1);
                    if ((unsigned long long)v0)
                    {
                        _free();
                        return 1;
                    }
                    return 1;
                }
                if (v10 == v0)
                {
                    sub_c6c494(&v0);
                    ptr = *(unsigned long long *)((void*)&v0 + 8);
                }
                v11 = (unsigned int *)(v6[3] * 0x10000 | v6[2] * 0x100 | v6[1]);
                *(unsigned int *)((char *)ptr + 0x4 * v10) = *v6 | v11 * 0x100;
                v10 = (char *)v10 + 1;
                v6 += 4;
                v2 = v10;
                v5 = v12;
            } while (i != v10);
        }
        else
        {
            v14 = sub_c6b970(4, v8);
            if (v0)
                _free(v1);
            __Unwind_Resume(v14);
        }
    }
    else
    {
        v0 = CONCAT(4, 0);
        v2 = 0;
        v12 = v5;
    }
    *(uint128_t *)a0->field_18 = v0;
    *(unsigned int **)&a0->field_20 = v2;
    a0->field_8 = v6;
    a0->field_10 = v12;
    a0->field_0 = 0;
    return (unsigned long long)v0;
}

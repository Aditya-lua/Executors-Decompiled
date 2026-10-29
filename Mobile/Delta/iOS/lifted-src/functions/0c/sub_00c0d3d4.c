/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0d3d4..0xc0d518 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0d3d4_0 {
    struct st_c0d3d4_1 *field_0;
    unsigned long long field_8;
    struct st_c0d3d4_1 *field_10;
    struct st_c0d3d4_1 *field_18;
    char field_20;
    char padding_21[7];
    struct st_c0d3d4_1 *field_28;
} st_c0d3d4_0;

typedef struct st_c0d3d4_1 {
    char field_0;
} st_c0d3d4_1;


double sub_c0d3d4(st_c0d3d4_0 *a0, char *i, unsigned long long a2, char *a3)
{
    char *v5;  // x21
    unsigned long long v6;  // x20
    char *v7;  // x23
    char *ptr;  // x0
    char *v9;  // x24
    char *v10;  // x8
    char *v11;  // x8
    long long v13;  // x0
    char *v0;  // [bp-0x58], Other Possible Types: uint128_t
    long long v1;  // [bp-0x50]
    char *v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a3;
    v6 = a2;
    if (i < 0x10000)
        v7 = i;
    else
        v7 = 0x10000;
    if (i)
    {
        ptr = _malloc(v7);
        if (ptr)
        {
            v9 = 0;
            v0 = CONCAT(ptr, v7);
            v2 = 0;
            do
            {
                v10 = &v9[v6];
                if (v5 == v9)
                {
                    a0->field_10 = v10;
                    a0->field_18 = 0;
                    a0->field_20 = 23;
                    *(uint128_t *)&a0->field_0 = CONCAT(1, 1);
                    if (!(unsigned long long)v0)
                        return 1;
                    _free();
                    return 1;
                }
                if (v9 == v0)
                {
                    sub_c6baa8(&v0);
                    ptr = *(unsigned long long *)((void*)&v0 + 8);
                }
                v11 = v9 + 1;
                *(char *)(ptr + v9) = *v10;
                v2 = v11;
                v9 = v11;
            } while (i != v9);
            v5 -= v11;
            v6 = &v11[v6];
        }
        else
        {
            v13 = sub_c6b970(1, v7);
            if (v0)
                _free(v1);
            __Unwind_Resume(v13);
        }
    }
    else
    {
        v0 = CONCAT(1, 0);
        v2 = 0;
    }
    *(uint128_t *)&a0->field_18 = v0;
    a0->field_28 = v2;
    a0->field_8 = v6;
    a0->field_10 = v5;
    a0->field_0 = 0;
    return (unsigned long long)v0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9c8e4..0xb9ca0c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9c8e4_0 {
    struct st_b9c8e4_1 *field_0;
    struct st_b9c8e4_1 *field_8;
    unsigned long long field_10;
} st_b9c8e4_0;

typedef struct st_b9c8e4_2 {
    struct st_b9c8e4_3 *field_0;
    long long field_8;
    struct st_b9c8e4_3 *field_10;
} st_b9c8e4_2;

typedef struct st_b9c8e4_3 {
    unsigned int field_0;
} st_b9c8e4_3;

typedef struct st_b9c8e4_1 {
    unsigned long long field_0;
} st_b9c8e4_1;


double sub_b9c8e4(st_b9c8e4_2 *a0, st_b9c8e4_0 *a1)
{
    unsigned long long *iter;  // x22
    unsigned long long *v6;  // x21
    long long v15;  // x0
    unsigned long v16;  // d0
    unsigned long long v7;  // x23
    unsigned long long v8;  // x23
    unsigned long long v9;  // x9
    unsigned int *ptr;  // x0
    unsigned int *v11;  // x20
    unsigned long long *v12;  // x22
    unsigned long long v13;  // x23
    unsigned long v14;  // d0
    unsigned int *v0;  // [bp-0x68]
    long long v1;  // [bp-0x60]
    unsigned int *v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    iter = a1->field_0;
    v6 = a1->field_8;
    v7 = a1->field_10;
    do
    {
        v8 = v7;
        if (iter == v6)
        {
            a0->field_0 = 0;
            a0->field_8 = 4;
            a0->field_10 = 0;
            return v16;
        }
    } while ((v9 = *iter, iter += 4, a1->field_0 = iter, v7 = v8 + 1, a1->field_10 = v7, *iter == 0x8000000000000000));
    ptr = _malloc(16);
    if (ptr)
    {
        *ptr = v8;
        v0 = CONCAT(ptr, 4);
        v11 = 1;
        while (1)
        {
            v2 = v11;
            do
            {
                v12 = iter;
                v13 = v7;
                if (v12 == v6)
                {
                    *(uint128_t *)&a0->field_0 = (uint128_t)v0;
                    a0->field_10 = v2;
                    return v14;
                }
            } while ((iter = v12 + 4, v7 = v13 + 1, *v12 == 0x8000000000000000));
            if (v11 == v0)
            {
                sub_c736c8(&v0, v11, 1, 4, 4);
                ptr = *(unsigned long long *)((void*)&v0 + 8);
            }
            *(unsigned int *)((char *)ptr + 0x4 * v11) = v13;
            v11 = (char *)v11 + 1;
        }
    }
    else
    {
        v15 = sub_c6b970(4, 16);
        if (v0)
            _free(v1);
        __Unwind_Resume(v15);
    }
}

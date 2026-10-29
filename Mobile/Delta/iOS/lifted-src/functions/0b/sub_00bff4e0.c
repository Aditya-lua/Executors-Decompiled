/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbff4e0..0xbff6b8 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bff4e0_0 {
    char padding_0[8];
    char *field_8;
    struct st_bff4e0_1 *field_10;
    char padding_18[8];
    long long field_20;
    struct st_bff4e0_1 *field_28;
    long long field_30;
} st_bff4e0_0;

typedef struct st_bff4e0_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_bff4e0_1;

typedef struct st_bff4e0_2 {
    char *field_0;
    struct st_bff4e0_1 *field_8;
    struct st_bff4e0_1 *field_10;
    uint128_t field_18;
    struct st_bff4e0_1 *field_28;
    struct st_bff4e0_1 *field_30;
} st_bff4e0_2;


double sub_bff4e0(st_bff4e0_2 *a0, st_bff4e0_0 *a1)
{
    char *ptr;  // x0
    char *v9;  // x22
    char *iter;  // x25
    char *v19;  // x27
    char *v10;  // x19
    char *v11;  // x23
    char *ptr1;  // x0
    char *v13;  // x20
    char *v14;  // x0
    char *i;  // x26
    long long v16;  // x24
    char *ptr2;  // x0
    char *v0;  // [bp-0xc0]
    uint128_t v1;  // [bp-0xb8]
    uint128_t v2;  // [bp-0xa0]
    uint128_t v3;  // [bp-0x90]
    uint128_t v4;  // [bp-0x80]
    uint128_t v5;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    ptr = _malloc(64);
    if (ptr)
    {
        v9 = ptr;
        sub_bfeb50(&v2, a1->field_30);
        *(uint128_t *)v9 = v2;
        *(uint128_t *)&v9[16] = v3;
        *(uint128_t *)&v9[32] = v4;
        *(uint128_t *)&v9[48] = v5;
        v0 = v9;
        v10 = a1->field_10;
        if (v10)
        {
            v11 = a1->field_8;
            ptr1 = _malloc(v10);
            if (!ptr1)
            {
                sub_c6b970(1, v10);
                __debugbreak();
            }
            v13 = ptr1;
            _memcpy();
            v14 = 0;
            i = a1->field_28;
            if (i <= 0x3ffffffffffffff)
                goto LABEL_bff570;
        }
        else
        {
            v13 = 1;
            v14 = 0;
            i = a1->field_28;
            if (i <= 0x3ffffffffffffff)
            {
                v14 = 0;
LABEL_bff570:
                v11 = i * 64;
                if (0x7ffffffffffffff8 >= v11)
                {
                    if (v11)
                    {
                        v16 = a1->field_20;
                        ptr2 = _malloc(v11);
                        if (!ptr2)
                            goto LABEL_bff648;
                        iter = ptr2;
                        v1 = CONCAT(ptr2, i);
                        if (i)
                        {
                            v19 = 0;
                            do
                            {
                                if (!v11)
                                    break;
                                sub_bfeb50(&v2, v16);
                                v19 += 1;
                                v16 += 64;
                                *(uint128_t *)iter = v2;
                                *(uint128_t *)&iter[16] = v3;
                                *(uint128_t *)&iter[32] = v4;
                                *(uint128_t *)&iter[48] = v5;
                                v11 -= 64;
                                iter += 64;
                            } while (i != v19);
                        }
                    }
                    else
                    {
                        v1 = CONCAT(8, 0);
                    }
                    *(uint128_t *)&(&a0->field_10)[1] = v1;
                    *(char **)((char *)&a0->field_18 + 8) = i;
                    a0->field_28 = v0;
                    a0->field_0 = v10;
                    a0->field_8 = v13;
                    a0->field_10 = v10;
                    return (unsigned long long)v1;
                }
            }
        }
    }
    else
    {
        sub_c6ba70(8, 64);
LABEL_bff648:
        v14 = 8;
    }
    sub_c6b970(v14, v11);
    __debugbreak();
}

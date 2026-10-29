/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7fa90..0xb8002c (1436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7fa90_0 {
    char *field_0;
    unsigned long long field_8;
    struct st_b7fa90_1 *field_10;
} st_b7fa90_0;

typedef struct st_b7fa90_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_b7fa90_1;


long long sub_b7fa90(st_b7fa90_0 *a0, uint128_t *a1, unsigned long long a2)
{
    unsigned long long v22;  // x21
    char *v23;  // x8
    unsigned long long ptr;  // x0
    char *v24;  // x8
    char *v25;  // x21
    char *v27;  // w8
    uint128_t *v28;  // x0
    uint128_t *v29;  // x0
    unsigned long long v30;  // x8
    char *v31;  // x8
    uint128_t v0;  // [bp-0x160], Other Possible Types: uint256_t
    uint128_t v1;  // [bp-0x150]
    uint128_t v2;  // [bp-0x140], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x130], Other Possible Types: uint128_t
    unsigned long long v4;  // [bp-0x120]
    uint128_t v5;  // [bp-0x110]
    uint128_t v6;  // [bp-0x100]
    uint128_t v7;  // [bp-0xf0]
    uint128_t v8;  // [bp-0xe0]
    char *v9;  // [bp-0xd0]
    uint128_t *v10;  // [bp-0xc8]
    uint128_t *v11;  // [bp-0xc0], Other Possible Types: uint128_t, char
    uint128_t *v12;  // [bp-0xb8]
    uint128_t v13;  // [bp-0xb0], Other Possible Types: char *, uint128_t, unsigned long long
    uint128_t v14;  // [bp-0xa0]
    uint128_t v15;  // [bp-0x90]
    uint128_t v16;  // [bp-0x80]
    uint128_t v17;  // [bp-0x70]
    uint128_t v18;  // [bp-0x60]
    uint128_t v19;  // [bp-0x50]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v22 = a2;
    v0 = *a1;
    v1 = a1[1];
    v2 = a1[2];
    v3 = a1[3];
    sub_b7dad4(&v11, &v0);
    v0 = CONCAT(v13, v11);
    v2 = v14;
    v3 = v15;
    v4 = v22;
    v23 = *(unsigned long long *)&v0;
    switch (v23)
    {
    case 6:
        if (!v22)
        {
            if (*(unsigned long long *)((void*)&v0 + 8) == 0x8000000000000001)
            {
                a0->field_8 = 9223372036854775809;
                *(char *)&a0->field_10 = 1 & ~*(char *)((void*)&v0 + 16);
                a0->field_0 = 6;
                sub_b7f370(&v0);
                return _free(a1);
            }
            goto LABEL_b7fd34;
        }
        else if (v22 == 1)
        {
            if (*(unsigned long long *)((void*)&v0 + 8) == 0x8000000000000002)
            {
                a0->field_8 = 9223372036854775810;
                a0->field_10 = -*(unsigned long long *)((void*)&v0 + 16);
                a0->field_0 = 6;
                sub_b7f370(&v0);
                return _free(a1);
            }
            v22 = 1;
            goto LABEL_b7fd38;
        }
        else
        {
            a0->field_8 = 9223372036854775809;
            *(char *)&a0->field_10 = 1;
            a0->field_0 = 6;
            sub_b7f370(&v0);
            return _free(a1);
        }
        goto LABEL_b7fd38;
    case 8:
        if (!v22 && !*(char *)((void*)&v0 + 16))
        {
            v24 = *(unsigned long long *)((void*)&v0 + 8);
            v5 = *(int128_t *)v24;
            v6 = *(int128_t *)&v24[16];
            v7 = *(int128_t *)&v24[32];
            v8 = *(int128_t *)&v24[48];
            sub_b7dad4(a0, &v5);
            v23 = *(unsigned long long *)&v0;
            if (v23 == 8)
            {
                _free(*(unsigned long long *)((void*)&v0 + 8));
                return _free(a1);
            }
            goto LABEL_b7fb68;
        }
    default:
        if (v22)
        {
            if (v22 != 1)
            {
                *(char *)&a0->field_10 = 1;
                *(uint128_t *)&a0->field_0 = (uint128_t)0x80000000000000010000000000000006;
                if (v23 == 8)
                    goto LABEL_b7fe7c;
LABEL_b7fb68:
                if (v23 != 9)
                {
                    sub_b7f370(&v0);
                    return _free(a1);
                }
                sub_b7f370(*(unsigned long long *)((void*)&v0 + 8));
                _free(*(unsigned long long *)((void*)&v0 + 8));
                v25 = *(unsigned long long *)((void*)&v0 + 16);
                sub_b7f370(v25);
                _free(v25);
                return _free(a1);
            }
            goto LABEL_b7fd38;
        }
        if (v23 != 9)
            goto LABEL_b7fd34;
        v27 = (char *)*(char *)((void*)&v0 + 24);
        if (9 >= v27)
        {
            if (v27 == 7)
            {
                v11 = *(uint128_t *)((void*)&v0 + 8);
                v13 = (char *)8;
                sub_b963e4(a0, &v11);
            }
            else if (v27 != 8)
            {
                if (v27 != 9)
                    goto LABEL_b7fcf8;
                v11 = *(uint128_t *)((void*)&v0 + 8);
                v13 = (char *)12;
                sub_b963e4(a0, &v11);
            }
            else
            {
                v11 = *(uint128_t *)((void*)&v0 + 8);
                v13 = (char *)7;
                sub_b963e4(a0, &v11);
            }
        }
        else
        {
            if (v27 == 10)
            {
                v11 = *(uint128_t *)((void*)&v0 + 8);
                v13 = (char *)11;
                sub_b963e4(a0, &v11);
            }
            else if (v27 == 11)
            {
                v11 = *(uint128_t *)((void*)&v0 + 8);
                v13 = (char *)10;
                sub_b963e4(a0, &v11);
            }
            else if (v27 == 12)
            {
                v11 = *(uint128_t *)((void*)&v0 + 8);
                v13 = (char *)9;
                sub_b963e4(a0, &v11);
            }
            else
            {
LABEL_b7fcf8:
                if (2 > v27 - 13)
                {
                    *(char *)&v13 = 0;
                    v11 = CONCAT(sub_b8002c(*(unsigned long long *)((void*)&v0 + 8)), 8);
                    if (sub_b800a0(&v11) & 1)
                    {
                        sub_b7f370(&v11);
                        goto LABEL_b7fdec;
                    }
                    sub_b7f370(&v11);
                    *(char *)&v13 = 0;
                    v11 = CONCAT(sub_b8002c(*(unsigned long long *)((void*)&v0 + 16)), 8);
                    if (sub_b800a0(&v11) & 1)
                    {
                        sub_b7f370(&v11);
LABEL_b7fdec:
                        v9 = *(unsigned long long *)((void*)&v0 + 16);
                        v28 = sub_b800f8(sub_b7fa90(&v11, *(unsigned long long *)((void*)&v0 + 8), 0), *(unsigned long long *)((void*)&v0 + 8), 0);
                        *v28 = v11;
                        v28[1] = v13;
                        v28[2] = v14;
                        v28[3] = v15;
                        v10 = v28;
                        v29 = sub_b800f8(sub_b7fa90(&v11, v9, 0), v9, 0);
                        *v29 = v11;
                        v29[1] = v13;
                        v29[2] = v14;
                        v29[3] = v15;
                        if (*(char *)((void*)&v0 + 24) != 13)
                            v30 = 13;
                        else
                            v30 = 14;
                        v11 = v10;
                        v12 = v29;
                        v13 = v30;
                        sub_b963e4();
                    }
                    else
                    {
                        sub_b7f370(&v11);
                        v22 = v4;
LABEL_b7fd38:
                        v16 = *(uint128_t *)&v0;
                        v17 = *(uint128_t *)((void*)&v0 + 16);
                        v18 = v2;
                        v19 = v3;
                        ptr = _malloc(64);
                        if (ptr)
                        {
                            *(uint128_t *)ptr = *(uint128_t *)&v0;
                            *(uint128_t *)(ptr + 16) = *(uint128_t *)((void*)&v0 + 16);
                            *(uint128_t *)(ptr + 32) = v2;
                            *(uint128_t *)(ptr + 48) = v3;
                            *(char *)&a0->field_10 = v22;
                            a0->field_0 = 8;
                            a0->field_8 = ptr;
                            return _free(a1);
                        }
                        sub_c6ba70(8, 64);
                        __debugbreak();
                    }
                }
                else
                {
LABEL_b7fd34:
                    v22 = 0;
                    goto LABEL_b7fd38;
                }
            }
        }
        v31 = *(unsigned long long *)&v0;
        if (v31 != 8)
        {
            if (v31 != 9)
            {
                sub_b7f370(&v0);
                return _free(a1);
            }
            return _free(a1);
        }
LABEL_b7fe7c:
        sub_b7f370(*(unsigned long long *)((void*)&v0 + 8));
        _free(*(unsigned long long *)((void*)&v0 + 8));
        return _free(a1);
    }
}

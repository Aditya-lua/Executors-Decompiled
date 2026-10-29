/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb80c0c..0xb811b4 (1448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b80c0c(void* a0, uint128_t *a1, unsigned int a2)
{
    unsigned int v32;  // x21
    unsigned int v33;  // x8
    unsigned int ptr;  // x0
    unsigned int v34;  // w8
    uint128_t *v35;  // x0
    uint128_t *v36;  // x0
    long long v37;  // x8
    unsigned int idx;  // x8
    unsigned int v39;  // x8
    uint128_t v40;  // q0
    unsigned int v41;  // x8
    uint128_t v0;  // [bp-0x260]
    uint128_t v1;  // [bp-0x250], Other Possible Types: uint256_t
    uint128_t v2;  // [bp-0x240]
    uint128_t v3;  // [bp-0x230], Other Possible Types: uint128_t
    uint128_t v4;  // [bp-0x220], Other Possible Types: uint128_t
    unsigned int v5;  // [bp-0x210]
    uint128_t v6;  // [bp-0x200]
    uint128_t v7;  // [bp-0x1f0]
    uint128_t v8;  // [bp-0x1e0]
    uint128_t v9;  // [bp-0x1d0]
    uint128_t v10;  // [bp-0x1c0]
    uint128_t v11;  // [bp-0x1b0]
    uint128_t v12;  // [bp-0x1a0]
    uint128_t v13;  // [bp-0x190]
    char v14;  // [bp-0x180]
    uint128_t v15;  // [bp-0x140]
    uint128_t v16;  // [bp-0x130]
    uint128_t v17;  // [bp-0x120]
    uint128_t v18;  // [bp-0x110]
    unsigned int v19;  // [bp-0x100]
    char v20;  // [bp-0xf8]
    uint128_t v21;  // [bp-0xc0], Other Possible Types: uint128_t *
    uint128_t v22;  // [bp-0xb0]
    uint128_t v23;  // [bp-0xa0]
    uint128_t v24;  // [bp-0x90]
    uint128_t *v25;  // [bp-0x80], Other Possible Types: uint128_t, char
    uint128_t *v26;  // [bp-0x78]
    uint128_t v27;  // [bp-0x70], Other Possible Types: long long, uint128_t, unsigned int
    uint128_t v28;  // [bp-0x60]
    uint128_t v29;  // [bp-0x50]
    char *v30;  // [bp-0x10]
    char v31;  // [bp+0x0]

    v30 = &v31;
    v32 = a2;
    v1 = *a1;
    v2 = a1[1];
    v3 = a1[2];
    v4 = a1[3];
    sub_b7de54(&v25, &v1);
    v1 = CONCAT(v27, v25);
    v3 = v28;
    v4 = v29;
    v5 = v32;
    switch (v33)
    {
    case 6:
        v39 = *(unsigned long long *)((void*)&v1 + 8);
        if (v32)
        {
            if (v32 == 1)
            {
                if (v39 == 9223372036854775810)
                {
                    *(unsigned long long *)&a0[16] = -*(unsigned long long *)((void*)&v1 + 16);
                    v40 = 0x80000000000000020000000000000006;
                    goto LABEL_b80d80;
                }
                else
                {
                    v32 = 1;
                    goto LABEL_b80f28;
                }
                goto LABEL_b80f28;
            }
            if (v39 >= 0)
            {
                *(double *)&a0[16] = (double)*(unsigned long long *)&*(unsigned long long *)((void*)&v1 + 24);
                *(uint128_t *)a0 = 0x80000000000000020000000000000006;
                if (v39)
                {
                    _free(*(unsigned long long *)((void*)&v1 + 16));
                    break;
                }
            }
            else
            {
                v32 = 2;
                goto LABEL_b80f28;
            }
        }
        else
        {
            if (v39 != 9223372036854775809)
                goto LABEL_b80f24;
            *(char *)&a0[16] = 1 & ~*(char *)((void*)&v1 + 16);
            v40 = 0x80000000000000010000000000000006;
LABEL_b80d80:
            *(uint128_t *)a0 = v40;
            break;
        }
    case 8:
        if ((v32 | *(char *)((void*)&v1 + 16)) & 0xff)
            goto LABEL_b80f28;
        idx = *(unsigned long long *)((void*)&v1 + 8);
        v6 = *(int128_t *)idx;
        v7 = *(int128_t *)(idx + 16);
        v8 = *(int128_t *)(idx + 32);
        v9 = *(int128_t *)(idx + 48);
        sub_b7dad4(&v10, &v6);
        if (sub_b811b4(&v10) & 1)
        {
            *(uint128_t *)a0 = v10;
            *(uint128_t *)&a0[16] = v11;
            *(uint128_t *)&a0[32] = v12;
            *(uint128_t *)&a0[48] = v13;
            break;
        }
        else
        {
            v21 = v10;
            v22 = v11;
            v23 = v12;
            v24 = v13;
            v27 = 1;
            v0 = 0x80000000000000010000000000000006;
            v25 = 0x80000000000000010000000000000006;
            sub_b94fac(&v20, &v21, &v25, 13);
            v19 = 9;
            v27 = 0;
            v25 = v0;
            sub_b94fac(a0 + 8, &v19, &v25, 14);
            *(unsigned long long *)a0 = 9;
            break;
        }
    case 9:
        if (v32)
            goto LABEL_b80f28;
        v34 = *(char *)((void*)&v1 + 24);
        if (9 >= (int)v34)
        {
            if (v34 == 7)
            {
                v25 = *(uint128_t *)((void*)&v1 + 8);
                v27 = 8;
                sub_b96a14(a0, &v25);
                break;
            }
            else if (v34 != 8)
            {
                if (v34 != 9)
                    goto LABEL_b80ee8;
                v25 = *(uint128_t *)((void*)&v1 + 8);
                v27 = 12;
                sub_b96a14(a0, &v25);
                break;
            }
            else
            {
                v25 = *(uint128_t *)((void*)&v1 + 8);
                v27 = 7;
                sub_b96a14(a0, &v25);
                break;
            }
        }
        else
        {
            if (v34 == 10)
            {
                v25 = *(uint128_t *)((void*)&v1 + 8);
                v27 = 11;
                sub_b96a14(a0, &v25);
                break;
            }
            else if (v34 == 11)
            {
                v25 = *(uint128_t *)((void*)&v1 + 8);
                v27 = 10;
                sub_b96a14(a0, &v25);
                break;
            }
            else if (v34 == 12)
            {
                v25 = *(uint128_t *)((void*)&v1 + 8);
                v27 = 9;
                sub_b96a14(a0, &v25);
                break;
            }
            else
            {
LABEL_b80ee8:
                if (2 <= v34 - 13)
                {
LABEL_b80f24:
                    v32 = 0;
                    goto LABEL_b80f28;
                }
                *(char *)&v27 = 0;
                v25 = CONCAT(sub_b8002c(*(unsigned long long *)((void*)&v1 + 8)), 8);
                if (sub_b800a0(&v25) & 1)
                {
                    sub_b7f370(&v25);
                    goto LABEL_b80ff8;
                }
                sub_b7f370(&v25);
                *(char *)&v27 = 0;
                v25 = CONCAT(sub_b8002c(*(unsigned long long *)((void*)&v1 + 16)), 8);
                if (sub_b800a0(&v25) & 1)
                {
                    sub_b7f370(&v25);
LABEL_b80ff8:
                    v19 = *(unsigned long long *)((void*)&v1 + 16);
                    v35 = sub_b800f8(sub_b7fa90(&v25, *(unsigned long long *)((void*)&v1 + 8), 0), *(unsigned long long *)((void*)&v1 + 8), 0);
                    *v35 = v25;
                    v35[1] = v27;
                    v35[2] = v28;
                    v35[3] = v29;
                    v21 = v35;
                    v36 = sub_b800f8(sub_b7fa90(&v25, v19, 0), v19, 0);
                    *v36 = v25;
                    v36[1] = v27;
                    v36[2] = v28;
                    v36[3] = v29;
                    if (*(char *)((void*)&v1 + 24) != 13)
                        v37 = 13;
                    else
                        v37 = 14;
                    v25 = v21;
                    v26 = v36;
                    v27 = v37;
                    sub_b963e4();
                    sub_b81238(a0, &v14);
                    break;
                }
                else
                {
                    sub_b7f370(&v25);
                    v32 = v5;
                    goto LABEL_b80f28;
                }
            }
        }
    default:
LABEL_b80f28:
        v15 = *(uint128_t *)&v1;
        v16 = *(uint128_t *)((void*)&v1 + 16);
        v17 = v3;
        v18 = v4;
        ptr = _malloc(64);
        if (!ptr)
        {
            sub_c6ba70(8, 64);
            __debugbreak();
        }
        *(uint128_t *)ptr = *(uint128_t *)&v1;
        *(uint128_t *)(ptr + 16) = *(uint128_t *)((void*)&v1 + 16);
        *(uint128_t *)(ptr + 32) = v3;
        *(uint128_t *)(ptr + 48) = v4;
        *(char *)&a0[16] = v32;
        *(unsigned long long *)a0 = 8;
        *(unsigned long long *)&a0[8] = ptr;
LABEL_b80f60:
        return _free(a1);
    }
    switch (v41)
    {
    case 8:
        _free(*(unsigned long long *)((void*)&v1 + 8));
        break;
    case 6: case 9:
        return _free(a1);
    default:
        sub_b7f370(&v1);
        break;
    }
    goto LABEL_b80f60;
}

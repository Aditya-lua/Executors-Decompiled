/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb96a14..0xb971e0 (1996 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b96a14_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_b96a14_2;

typedef struct st_b96a14_0 {
    struct st_b96a14_1 *field_0;
    struct st_b96a14_1 *field_8;
    char field_10;
} st_b96a14_0;

typedef struct st_b96a14_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_b96a14_1;

extern char g_e0636c;

long long sub_b96a14(void* a0, st_b96a14_0 *a1)
{
    uint128_t *ptr;  // x20
    uint128_t *v36;  // x19
    st_b96a14_2 *v45;  // x9
    unsigned long long v46;  // x8
    unsigned long long idx;  // x8
    st_b96a14_2 *v48;  // x9
    uint128_t v49;  // q1
    uint128_t v50;  // q1
    unsigned long long v51;  // x8
    unsigned long long v52;  // x9
    st_b96a14_2 *v53;  // x10
    unsigned long v54;  // x12
    unsigned long long v37;  // x9
    unsigned long long v55;  // x8
    st_b96a14_2 *v56;  // x22
    unsigned long long v57;  // x8
    unsigned long long ptr1;  // x0
    unsigned long long ptr2;  // x0
    unsigned long long v38;  // x8
    unsigned long long v39;  // x0
    unsigned long long v40;  // x24
    unsigned long long v41;  // x10
    unsigned long long v42;  // x9
    unsigned long long v43;  // x10
    unsigned long long v44;  // x8
    uint128_t v0;  // [bp-0x240]
    uint128_t v1;  // [bp-0x230]
    uint128_t v2;  // [bp-0x220]
    uint128_t v3;  // [bp-0x210]
    uint128_t v4;  // [bp-0x200]
    uint128_t v5;  // [bp-0x1f0]
    uint128_t v6;  // [bp-0x1e0]
    uint128_t v7;  // [bp-0x1d0]
    char v8;  // [bp-0x1c0]
    uint128_t v9;  // [bp-0x1b0], Other Possible Types: unsigned long long
    uint128_t v10;  // [bp-0x1a0]
    uint128_t v11;  // [bp-0x190]
    uint128_t v12;  // [bp-0x180]
    st_b96a14_2 *v13;  // [bp-0x170]
    st_b96a14_2 *v14;  // [bp-0x168]
    unsigned long long v15;  // [bp-0x160]
    unsigned long long v16;  // [bp-0x158]
    unsigned long v17;  // [bp-0x150]
    unsigned long v18;  // [bp-0x148]
    unsigned long long v19;  // [bp-0x140]
    unsigned long long v20;  // [bp-0x138]
    uint128_t v21;  // [bp-0x130]
    uint128_t v22;  // [bp-0x120]
    uint128_t v23;  // [bp-0x110]
    uint128_t v24;  // [bp-0x100]
    uint128_t v25;  // [bp-0xf0]
    uint128_t v26;  // [bp-0xe0]
    uint128_t v27;  // [bp-0xd0]
    uint128_t v28;  // [bp-0xc0]
    uint128_t v29;  // [bp-0xb0]
    uint128_t v30;  // [bp-0xa0], Other Possible Types: uint128_t
    uint128_t v31;  // [bp-0x90], Other Possible Types: uint128_t
    uint128_t v32;  // [bp-0x80], Other Possible Types: uint128_t
    char *v33;  // [bp-0x10]
    char v34;  // [bp+0x0]

    v33 = &v34;
    ptr = &a1->field_0->field_0;
    v29 = *ptr;
    v30 = ptr[1];
    v31 = ptr[2];
    v32 = ptr[3];
    sub_b7de54(&v9, &v29);
    v36 = &a1->field_8->field_0;
    v29 = *v36;
    v30 = v36[1];
    v31 = v36[2];
    v32 = v36[3];
    sub_b7de54(&v25, &v29);
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v25;
    v5 = v26;
    v6 = v27;
    v7 = v28;
    v8 = a1->field_10;
    v37 = *(unsigned long long *)&v0;
    switch (v37)
    {
    case 6:
        v41 = *(unsigned long long *)((void*)&v0 + 8);
        if (*(unsigned long long *)&v4 == 6 && v41 == 9223372036854775809)
        {
            if (*(unsigned long long *)((void*)&v4 + 8) == 9223372036854775809)
            {
                v41 = 9223372036854775809;
                if (1 >= v8 - 13)
                {
                    v42 = (char)v1;
                    v43 = (char)v5;
                    if (v8 == 13)
                        v44 = v43 & v42;
                    else
                        v44 = v43 | v42;
                    *(char *)&a0[16] = v44;
                    *(uint128_t *)a0 = 0x80000000000000010000000000000006;
                    goto LABEL_b96d94;
                }
            }
            else
            {
                v41 = 9223372036854775809;
            }
        }
        if (v41 != 9223372036854775809 || 2 <= v8 - 13)
            goto LABEL_b96c08;
        v45 = (char)v1;
        v25 = v4;
        v26 = v5;
        v27 = v6;
        v28 = v7;
        if (v8 != 13)
        {
            if (v45 & 0x1)
            {
                v46 = 1;
                goto LABEL_b96de4;
            }
            else
            {
                v29 = v4;
                v30 = v5;
                v31 = v6;
                v32 = v7;
                sub_b7de54(a0, &v29);
            }
        }
        else
        {
            if (v45 & 0x1)
            {
                v29 = v4;
                v30 = v5;
                v31 = v6;
                v32 = v7;
                sub_b7de54(a0, &v29);
            }
            else
            {
                v46 = 0;
LABEL_b96de4:
                *(char *)&a0[16] = v46;
                *(uint128_t *)a0 = 0x80000000000000010000000000000006;
                sub_b950a4(&v25);
            }
        }
        v40 = 0;
        break;
    case 8:
        if (*(unsigned long long *)&v4 != 8 || (char)v1 || (char)v5 || 2 <= v8 - 13)
            goto LABEL_b96c08;
        if (v8 != 13)
            v38 = 13;
        else
            v38 = 14;
        *(unsigned long long *)((char *)&v29 + 8) = *(unsigned long long *)((void*)&v0 + 8);
        *(unsigned long long *)&v30 = *(unsigned long long *)((void*)&v4 + 8);
        *(unsigned long long *)((char *)&v30 + 8) = v38;
        *(unsigned long long *)&v29 = 9;
        v39 = _malloc();
        if (!v39)
        {
            sub_c6ba70(8, 64);
            __debugbreak();
        }
        *(uint128_t *)v39 = v29;
        *(uint128_t *)(v39 + 16) = v30;
        *(uint128_t *)(v39 + 32) = v31;
        *(uint128_t *)(v39 + 48) = v32;
        *(char *)&a0[16] = 0;
        v40 = 1;
        *(unsigned long long *)a0 = 8;
        *(unsigned long long *)&a0[8] = v39;
        break;
    default:
LABEL_b96c08:
        switch (v8)
        {
        case 6:
            if (v37 != 6 || *(unsigned long long *)&v4 != 6 || (v51 = *(unsigned long long *)((void*)&v0 + 8), (long long)v51 < 0 || (v52 = *(unsigned long long *)((void*)&v4 + 8), (long long)v52 < 0)))
                goto LABEL_b96f00;
            v53 = (unsigned long long)v1;
            v54 = v5;
            v13 = v53;
            v14 = v53;
            v15 = v51;
            v16 = &v53->padding_0[*(unsigned long long *)((void*)&v1 + 8)];
            v17 = v54;
            v18 = v54;
            v19 = v52;
            v20 = v54 + *(unsigned long long *)((void*)&v5 + 8);
            sub_b77760(&v29, &v13);
            *(uint128_t *)&a0[8] = v29;
            *(unsigned long long *)&a0[24] = *(unsigned long long *)&v30;
            *(unsigned long long *)a0 = 6;
            break;
        case 13:
            goto *((void *)(sub_b96ccc + (&g_e0636c)[v37] * 4));
        case 14:
            if (v37 != 9 || *(unsigned long long *)&v4 != 6 || (idx = *(unsigned long long *)((void*)&v0 + 8), *(long long *)idx != 8 || (v48 = (unsigned long long)v1, v48->padding_0 != 6 || *(char *)((void*)&v1 + 8) != 13 || *(unsigned long long *)((void*)&v4 + 8) != 9223372036854775809 || *(char *)(idx + 16) || v48->field_8 != 9223372036854775809 || (char)v5 & 1 || v48[1].padding_0[0] != 1)))
            {
                if (sub_b971e0(&v0, &v4))
                {
                    *(uint128_t *)a0 = v0;
                    *(uint128_t *)&a0[16] = v1;
                    *(uint128_t *)&a0[32] = v2;
                    *(uint128_t *)&a0[48] = v3;
                    v29 = v4;
                    v30 = v5;
                    v31 = v6;
                    v32 = v7;
                    sub_b950a4(&v29);
                    _free(ptr);
                    return _free(v36);
                }
                goto LABEL_b96f00;
            }
            else
            {
                v49 = *(int128_t *)(idx + 16);
                *(int128_t *)a0 = *(int128_t *)idx;
                *(uint128_t *)&a0[16] = v49;
                v50 = *(int128_t *)(idx + 48);
                *(int128_t *)&a0[32] = *(int128_t *)(idx + 32);
                *(uint128_t *)&a0[48] = v50;
                break;
            }
        default:
LABEL_b96f00:
            v21 = v0;
            v22 = v1;
            v23 = v2;
            v24 = v3;
            v25 = v4;
            v26 = v5;
            v27 = v6;
            v28 = v7;
            ptr1 = _malloc(64);
            if (!ptr1)
            {
                sub_c6ba70(8, 64);
                __debugbreak();
            }
            *(uint128_t *)ptr1 = v0;
            *(uint128_t *)(ptr1 + 16) = v1;
            *(uint128_t *)(ptr1 + 32) = v2;
            *(uint128_t *)(ptr1 + 48) = v3;
            v9 = ptr1;
            v29 = v4;
            v30 = v5;
            v31 = v6;
            v32 = v7;
            ptr2 = _malloc(64);
            if (!ptr2)
            {
                sub_c6ba70(8, 64);
                __debugbreak();
            }
            *(uint128_t *)ptr2 = v4;
            *(uint128_t *)(ptr2 + 16) = v5;
            *(uint128_t *)(ptr2 + 32) = v6;
            *(uint128_t *)(ptr2 + 48) = v7;
            *(unsigned long long *)&a0[8] = ptr1;
            *(unsigned long long *)&a0[16] = ptr2;
            *(char *)&a0[24] = v8;
            *(unsigned long long *)a0 = 9;
LABEL_b96f84:
            _free(ptr);
            return _free(v36);
        }
LABEL_b96d94:
        v40 = 1;
        break;
    }
    switch (v55)
    {
    case 6: case 8:
        break;
    case 9:
        _free(*(unsigned long long *)((void*)&v0 + 8));
        v56 = (unsigned long long)v1;
        sub_b950a4(v56);
        _free(v56);
        break;
    default:
        sub_b950a4(&v0);
    }
    if (!(v40 & 1))
    {
        _free(ptr);
        return _free(v36);
    }
    v57 = *(unsigned long long *)&v4;
    if (v57 != 6 && v57 != 8)
    {
        sub_b950a4(&v4);
        _free(ptr);
        return _free(v36);
    }
    goto LABEL_b96f84;
}

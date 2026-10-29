/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb963e4..0xb96a14 (1584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b963e4_0 {
    struct st_b963e4_1 *field_0;
    struct st_b963e4_1 *field_8;
    char field_10;
} st_b963e4_0;

typedef struct st_b963e4_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_b963e4_1;


long long sub_b963e4(void* a0, st_b963e4_0 *a1)
{
    unsigned int v40;  // w23
    unsigned long long v41;  // w24
    unsigned long long v50;  // x8
    unsigned long long v51;  // x9
    unsigned long long v52;  // x8
    unsigned long v53;  // x8
    unsigned long long v54;  // x8
    unsigned long long v55;  // x9
    unsigned long long v56;  // x10
    unsigned long long v57;  // 4117
    unsigned long long v58;  // x8
    unsigned long v59;  // x10
    uint128_t *ptr;  // x19
    unsigned long v60;  // x12
    unsigned long long v61;  // x8
    unsigned long v62;  // x8
    unsigned long long v63;  // x8
    unsigned long long v64;  // x8
    unsigned long long ptr1;  // x0
    unsigned long long ptr2;  // x0
    uint128_t *v43;  // x20
    unsigned long long v44;  // x8
    unsigned long long v45;  // x9
    unsigned long long v46;  // x10
    unsigned long long v47;  // x0
    unsigned long long v48;  // x23
    unsigned long long v49;  // x10
    uint128_t v0;  // [bp-0x270]
    uint128_t v1;  // [bp-0x260]
    uint128_t v2;  // [bp-0x250]
    uint128_t v3;  // [bp-0x240]
    uint128_t v4;  // [bp-0x230]
    uint128_t v5;  // [bp-0x220], Other Possible Types: uint128_t
    uint128_t v6;  // [bp-0x210], Other Possible Types: uint128_t
    uint128_t v7;  // [bp-0x200], Other Possible Types: uint128_t
    uint128_t v8;  // [bp-0x1f0]
    uint128_t v9;  // [bp-0x1e0]
    uint128_t v10;  // [bp-0x1d0]
    uint128_t v11;  // [bp-0x1c0]
    char v12;  // [bp-0x1b0]
    unsigned long v13;  // [bp-0x1a0]
    unsigned long v14;  // [bp-0x198]
    unsigned long long v15;  // [bp-0x190]
    unsigned long long v16;  // [bp-0x188]
    unsigned long v17;  // [bp-0x180]
    unsigned long v18;  // [bp-0x178]
    unsigned long long v19;  // [bp-0x170]
    unsigned long long v20;  // [bp-0x168]
    uint128_t v21;  // [bp-0x160]
    uint128_t v22;  // [bp-0x150]
    uint128_t v23;  // [bp-0x140]
    uint128_t v24;  // [bp-0x130]
    uint128_t v25;  // [bp-0x120]
    uint128_t v26;  // [bp-0x110]
    uint128_t v27;  // [bp-0x100]
    uint128_t v28;  // [bp-0xf0]
    unsigned long long v29;  // [bp-0xd8]
    uint128_t v30;  // [bp-0xd0]
    uint128_t v31;  // [bp-0xc0], Other Possible Types: uint128_t
    uint128_t v32;  // [bp-0xb0]
    uint128_t v33;  // [bp-0xa0]
    uint128_t v34;  // [bp-0x90]
    uint128_t v35;  // [bp-0x80]
    uint128_t v36;  // [bp-0x70]
    uint128_t v37;  // [bp-0x60]
    char *v38;  // [bp-0x10]
    char v39;  // [bp+0x0]

    v38 = &v39;
    v40 = a1->field_10;
    v41 = v40 - 13;
    if (2 > v41)
    {
        ptr = &a1->field_0->field_0;
        v4 = *ptr;
        v5 = ptr[1];
        v6 = ptr[2];
        v7 = ptr[3];
        sub_b7dad4(&v30, &v4);
        v43 = &a1->field_8->field_0;
        v4 = *v43;
        v5 = v43[1];
        v6 = v43[2];
        v7 = v43[3];
        sub_b7dad4(&v0, &v4);
    }
    else
    {
        ptr = &a1->field_0->field_0;
        v4 = *ptr;
        v5 = ptr[1];
        v6 = ptr[2];
        v7 = ptr[3];
        sub_b7de54(&v30, &v4);
        v43 = &a1->field_8->field_0;
        v4 = *v43;
        v5 = v43[1];
        v6 = v43[2];
        v7 = v43[3];
        sub_b7de54(&v0, &v4);
    }
    v34 = v30;
    v35 = v31;
    v36 = v32;
    v37 = v33;
    v4 = v34;
    v5 = v35;
    v6 = v36;
    v7 = v37;
    v8 = v0;
    v9 = v1;
    v10 = v2;
    v11 = v3;
    v12 = v40;
    v45 = *(unsigned long long *)&v8;
    switch (v44)
    {
    case 6:
        v49 = *(unsigned long long *)((void*)&v4 + 8);
        if (v45 == 6 && v49 == 9223372036854775809 && (v49 = 9223372036854775809, 1 >= v41 && *(unsigned long long *)((void*)&v8 + 8) == 9223372036854775809))
        {
            v50 = (char)v5;
            v51 = (char)v9;
            if (v40 == 13)
                v52 = v51 & v50;
            else
                v52 = v51 | v50;
            *(char *)&a0[16] = v52;
            *(uint128_t *)a0 = 0x80000000000000010000000000000006;
            v48 = 1;
            break;
        }
        else
        {
            if (1 < v41 || v49 != 9223372036854775809)
                goto LABEL_b9663c;
            v53 = (char)v5;
            v25 = v0;
            v26 = v1;
            v27 = v2;
            v28 = v3;
            if (v40 != 13)
            {
                if (v53 & 1)
                {
                    v54 = 1;
                    goto LABEL_b967c8;
                }
                else
                {
                    v30 = v0;
                    v31 = v1;
                    v32 = v2;
                    v33 = v3;
                    sub_b7de54(a0, &v30);
                }
            }
            else
            {
                if (v53 & 1)
                {
                    v30 = v0;
                    v31 = v1;
                    v32 = v2;
                    v33 = v3;
                    sub_b7de54(a0, &v30);
                }
                else
                {
                    v54 = 0;
LABEL_b967c8:
                    *(char *)&a0[16] = v54;
                    *(uint128_t *)a0 = 0x80000000000000010000000000000006;
                    sub_b950a4(&v25);
                }
            }
            v48 = 0;
            break;
        }
    case 8:
        if (1 < v41 || v45 != 8 || (char)v5 || (char)v9)
            goto LABEL_b9663c;
        if (v40 != 13)
            v46 = 13;
        else
            v46 = 14;
        *(unsigned long long *)((char *)&v30 + 8) = *(unsigned long long *)((void*)&v4 + 8);
        *(unsigned long long *)&v31 = *(unsigned long long *)((void*)&v8 + 8);
        *(unsigned long long *)((char *)&v31 + 8) = v46;
        *(unsigned long long *)&v30 = 9;
        v47 = _malloc();
        if (!v47)
        {
            sub_c6ba70(8, 64);
            __debugbreak();
        }
        *(uint128_t *)v47 = v30;
        *(uint128_t *)(v47 + 16) = v31;
        *(uint128_t *)(v47 + 32) = v32;
        *(uint128_t *)(v47 + 48) = v33;
        *(char *)&a0[16] = 0;
        v48 = 1;
        *(unsigned long long *)a0 = 8;
        *(unsigned long long *)&a0[8] = v47;
        break;
    default:
LABEL_b9663c:
        if (v45 == 6)
        {
            v55 = *(unsigned long long *)((void*)&v8 + 8);
            v57 = arm64g_calculate_condition(0x44, v55, 0, 0);
            switch (v56)
            {
            case 1:
                if (2 > v41)
                {
                    v25 = v34;
                    v26 = v35;
                    v27 = v36;
                    v28 = v37;
                    v62 = (char)v9;
                    if (v40 != 13)
                    {
                        if (v62 & 1)
                        {
                            v63 = 1;
                            goto LABEL_b96898;
                        }
                        else
                        {
                            v30 = v34;
                            v31 = v35;
                            v32 = v36;
                            v33 = v37;
                            sub_b7de54(a0, &v30);
                            goto LABEL_b96808;
                        }
                    }
                    else
                    {
                        if (v62 & 1)
                        {
                            v30 = v34;
                            v31 = v35;
                            v32 = v36;
                            v33 = v37;
                            sub_b7de54(a0, &v30);
                            goto LABEL_b96808;
                        }
                        else
                        {
                            v63 = 0;
LABEL_b96898:
                            *(char *)&a0[16] = v63;
                            *(uint128_t *)a0 = 0x80000000000000010000000000000006;
                            sub_b950a4(&v25);
                            goto LABEL_b96808;
                        }
                    }
                    goto LABEL_b96808;
                }
                goto LABEL_b966fc;
            case 4:
                if (v40 != 6 || *(unsigned long long *)&v4 != 6 || !(v58 = *(unsigned long long *)((void*)&v4 + 8), (long long)v58 >= 0))
                    goto LABEL_b966fc;
                v59 = v5;
                v60 = v9;
                v13 = v59;
                v14 = v59;
                v15 = v58;
                v16 = v59 + *(unsigned long long *)((void*)&v5 + 8);
                v17 = v60;
                v18 = v60;
                v19 = v55;
                v20 = v60 + *(unsigned long long *)((void*)&v9 + 8);
                v48 = 1;
                sub_b77760(&v30, &v13);
                *(uint128_t *)&a0[8] = v30;
                *(unsigned long long *)&a0[24] = v31;
                *(unsigned long long *)a0 = 6;
                break;
            default:
                goto LABEL_b966fc;
            }
            break;
        }
        else
        {
LABEL_b966fc:
            v21 = v34;
            v22 = v35;
            v23 = v36;
            v24 = v37;
            v25 = v0;
            v26 = v1;
            v27 = v2;
            v28 = v3;
            ptr1 = _malloc(64);
            if (!ptr1)
            {
                sub_c6ba70(8, 64);
                __debugbreak();
            }
            *(uint128_t *)ptr1 = v34;
            *(uint128_t *)(ptr1 + 16) = v35;
            *(uint128_t *)(ptr1 + 32) = v36;
            *(uint128_t *)(ptr1 + 48) = v37;
            v29 = ptr1;
            v30 = v0;
            v31 = v1;
            v32 = v2;
            v33 = v3;
            ptr2 = _malloc(64);
            if (ptr2)
            {
                *(uint128_t *)ptr2 = v0;
                *(uint128_t *)(ptr2 + 16) = v1;
                *(uint128_t *)(ptr2 + 32) = v2;
                *(uint128_t *)(ptr2 + 48) = v3;
                *(unsigned long long *)&a0[8] = ptr1;
                *(unsigned long long *)&a0[16] = ptr2;
                *(char *)&a0[24] = v40;
                *(unsigned long long *)a0 = 9;
                _free(ptr);
                return _free(v43);
            }
            sub_c6ba70(8, 64);
            __debugbreak();
        }
    }
    v61 = *(unsigned long long *)&v4;
    if (v61 != 6 && v61 != 8)
        sub_b950a4(&v4);
    if (!(v48 & 1))
    {
        _free(ptr);
        return _free(v43);
    }
LABEL_b96808:
    v64 = *(unsigned long long *)&v8;
    if (v64 != 6 && v64 != 8)
        sub_b950a4(&v8);
    _free(ptr);
    return _free(v43);
}

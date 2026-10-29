/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb89ec..0xbb9138 (1868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e064ec;
extern long long g_ef8fa0;
extern long long g_ef8fb8;
extern long long g_ef8fd0;

long long sub_bb89ec(void* a0, unsigned long a1, unsigned long a2, unsigned int a3, void* a4, void* a5)
{
    unsigned long v19;  // x8
    unsigned long long *v20;  // x8
    unsigned long long v30;  // 4118
    unsigned int v31;  // x25
    uint128_t *v32;  // x8
    unsigned int v33;  // x9
    unsigned long long v35;  // 4118
    uint128_t *ptr;  // x0
    uint128_t v37;  // q1
    uint128_t *v38;  // q2
    void* v21;  // x25
    uint128_t v39;  // q3
    uint128_t v40;  // q1
    uint128_t v41;  // q2
    uint128_t v42;  // q3
    uint128_t v43;  // q1
    uint128_t *v44;  // q2
    uint128_t v45;  // q3
    uint128_t v46;  // q1
    uint128_t v47;  // q2
    uint128_t v48;  // q3
    uint128_t *v22;  // x24
    unsigned int ptr1;  // x0
    long long v50;  // x0
    unsigned int v23;  // w22
    unsigned int ptr2;  // x0
    unsigned int v25;  // x0
    unsigned int v26;  // x22
    uint128_t *v27;  // x8
    unsigned int v28;  // x9
    uint128_t v0;  // [bp-0x140], Other Possible Types: char
    uint128_t v1;  // [bp-0x130], Other Possible Types: uint128_t
    uint128_t v2;  // [bp-0x120], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x110], Other Possible Types: uint128_t
    uint128_t v4;  // [bp-0xf8], Other Possible Types: unsigned long
    uint128_t v5;  // [bp-0xf0]
    uint128_t v6;  // [bp-0xe8]
    unsigned long long v7;  // [bp-0xe0]
    uint128_t v8;  // [bp-0xd8]
    uint128_t v9;  // [bp-0xc8]
    char v10;  // [bp-0xb8]
    unsigned long long v11;  // [bp-0xa8]
    uint128_t *v12;  // [bp-0xa0], Other Possible Types: uint128_t
    unsigned long long v13;  // [bp-0x98]
    uint128_t v14;  // [bp-0x90], Other Possible Types: unsigned int
    uint128_t v15;  // [bp-0x80]
    uint128_t v16;  // [bp-0x70]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = a3;
    if (a2 <= v19 || (v20 = a1 + v19 * 32, *v20 == 0x8000000000000000))
    {
        v50 = &g_ef8fa0;
    }
    else if (v20[2])
    {
        v21 = v20[1] + 264 * v20[2];
        if (*(long long *)((char *)v21 - 240) == 16)
        {
            v22 = v21 - 232;
            if (*(long long *)a4 == 6 && (long long)a4[8] == 9223372036854775809 && *(long long *)a5 == 6 && (long long)a5[8] == 9223372036854775809)
            {
                v23 = (char)a4[16];
                if (v23 != (char)a5[16])
                {
                    v15 = v22[2];
                    v16 = v22[3];
                    v12 = *v22;
                    v14 = v22[1];
                    *v22 = 0x80000000000000000000000000000006;
                    ptr2 = _malloc(64);
                    if (ptr2)
                    {
                        *(uint128_t *)ptr2 = v12;
                        *(uint128_t *)(ptr2 + 16) = v14;
                        *(uint128_t *)(ptr2 + 32) = v15;
                        *(uint128_t *)(ptr2 + 48) = v16;
                        if (v23)
                        {
                            *(char *)&v14 = 0;
                            v12 = CONCAT(ptr2, 8);
                            v25 = _malloc(64);
                            if (!v25)
                            {
                                sub_c6ba70(8, 64);
                                __debugbreak();
                            }
                            *(uint128_t *)v25 = v12;
                            *(uint128_t *)(v25 + 16) = v14;
                            *(uint128_t *)(v25 + 32) = v15;
                            *(uint128_t *)(v25 + 48) = v16;
                        }
                        sub_b80c0c(&v12);
                        *(uint128_t *)a0 = v12;
                        *(uint128_t *)&a0[16] = v14;
                        *(uint128_t *)&a0[32] = v15;
                        *(uint128_t *)&a0[48] = v16;
                        sub_bb3264(a5);
                        return sub_bb3264();
                    }
                    sub_c6ba70(8, 64);
                    __debugbreak();
                }
            }
            sub_bb813c(&v4, a4);
            sub_b7dad4(&v12, &v4);
            v26 = 2;
            v27 = (uint128_t *)v12;
            if (7 < v27)
            {
                switch (v27)
                {
                case 8:
                    if (v14 == 2)
                    {
                        v26 = 1;
                        break;
                    }
                    else
                    {
                        v26 = 2;
                        break;
                    }
                case 10:
LABEL_bb8bdc:
                    v26 = 1;
                    break;
                default:
                    goto LABEL_bb8bf4;
                }
                goto LABEL_bb8bf4;
            }
            if (v27 == 5)
                goto LABEL_bb8bdc;
            if (v27 != 6)
                goto LABEL_bb8bf4;
            v28 = v13 ^ 0x8000000000000000;
            v30 = arm64g_calculate_condition(0x44, v13, 0, 0);
            if (!(v30 & 1))
                v28 = 4;
            if (1 < v28)
            {
                if (v28 == 2)
                    goto LABEL_bb8bdc;
                if (v28 == 4)
                    goto LABEL_bb8bdc;
                else
                    goto LABEL_bb8bf4;
            }
            else if (v28)
            {
                if (v28 != 1)
                    goto LABEL_bb8bf4;
                if (!(v14 & 1))
                    goto LABEL_bb8bc4;
                goto LABEL_bb8bdc;
            }
            else
            {
LABEL_bb8bc4:
                v26 = 0;
            }
LABEL_bb8bf4:
            sub_bb3264(&v12);
            if (v26 == 2)
            {
                goto *((void *)(sub_bb8c20 + (&g_e064ec)[*(long long *)a4] * 4));
            }
            else
            {
                sub_bb813c(&v4, a5);
                sub_b7dad4(&v12, &v4);
                v31 = 2;
                v32 = (uint128_t *)v12;
                if (7 < v32)
                {
                    switch (v32)
                    {
                    case 8:
                        if (v14 == 2)
                        {
                            v31 = 1;
                            break;
                        }
                        else
                        {
                            v31 = 2;
                            break;
                        }
                    case 10:
LABEL_bb8db0:
                        v31 = 1;
                        break;
                    default:
                        goto LABEL_bb8dc8;
                    }
                    goto LABEL_bb8dc8;
                }
                if (v32 == 5)
                    goto LABEL_bb8db0;
                if (v32 != 6)
                    goto LABEL_bb8dc8;
                v33 = v13 ^ 0x8000000000000000;
                v35 = arm64g_calculate_condition(0x44, v13, 0, 0);
                if (!(v35 & 1))
                    v33 = 4;
                if (1 < v33)
                {
                    if (v33 == 2)
                        goto LABEL_bb8db0;
                    if (v33 == 4)
                        goto LABEL_bb8db0;
                    else
                        goto LABEL_bb8dc8;
                }
                else if (v33)
                {
                    if (v33 != 1)
                        goto LABEL_bb8dc8;
                    if (!(v14 & 1))
                        goto LABEL_bb8d98;
                    goto LABEL_bb8db0;
                }
                else
                {
LABEL_bb8d98:
                    v31 = 0;
                }
LABEL_bb8dc8:
                sub_bb3264(&v12);
                if (v31 == 2)
                {
                    if (!(v26 & 1))
                    {
                        *(unsigned long long *)a0 = 12;
                        sub_bb3264(a5);
                        return sub_bb3264(a4);
                    }
LABEL_bb8ddc:
                    v12 = *v22;
                    v14 = v22[1];
                    v15 = v22[2];
                    v16 = v22[3];
                    *v22 = 0x80000000000000000000000000000006;
                    sub_b7dad4(&v0, &v12);
                }
                else
                {
                    if (!(v26 & 1) && !(v31 & 1))
                    {
                        *(unsigned long long *)a0 = 12;
                        sub_bb3264(a5);
                        return sub_bb3264(a4);
                    }
                    if (v26 & 1)
                    {
                        if (!(v31 & 1))
                            goto LABEL_bb8ddc;
                        v12 = *v22;
                        v14 = v22[1];
                        v15 = v22[2];
                        v16 = v22[3];
                        *v22 = 0x80000000000000000000000000000006;
                        sub_b7dad4(&v4, &v12);
                        if (*(unsigned long long *)&v4 == 8 && !(char)v6)
                        {
                            ptr = *(unsigned long long *)((void*)&v4 + 8);
                            v0 = *ptr;
                            v1 = ptr[1];
                            v2 = ptr[2];
                            v3 = ptr[3];
                            v37 = (int128_t)a5[16];
                            v38 = (uint128_t *)*(int128_t *)a4;
                            v39 = (int128_t)a4[16];
                            *(int128_t *)a4 = *(int128_t *)a5;
                            *(uint128_t *)&a4[16] = v37;
                            *(uint128_t *)a5 = (uint128_t)v38;
                            *(uint128_t *)&a5[16] = v39;
                            v40 = (int128_t)a5[48];
                            v41 = (int128_t)a4[32];
                            v42 = (int128_t)a4[48];
                            *(int128_t *)&a4[32] = (int128_t)a5[32];
                            *(uint128_t *)&a4[48] = v40;
                            *(uint128_t *)&a5[32] = v41;
                            *(uint128_t *)&a5[48] = v42;
                            _free(ptr);
                        }
                        else
                        {
                            v0 = v4;
                            v1 = v6;
                            v2 = v8;
                            v3 = v9;
                        }
                    }
                    else
                    {
                        v43 = (int128_t)a5[16];
                        v44 = (uint128_t *)*(int128_t *)a4;
                        v45 = (int128_t)a4[16];
                        *(int128_t *)a4 = *(int128_t *)a5;
                        *(uint128_t *)&a4[16] = v43;
                        *(uint128_t *)a5 = (uint128_t)v44;
                        *(uint128_t *)&a5[16] = v45;
                        v46 = (int128_t)a5[48];
                        v47 = (int128_t)a4[32];
                        v48 = (int128_t)a4[48];
                        *(int128_t *)&a4[32] = (int128_t)a5[32];
                        *(uint128_t *)&a4[48] = v46;
                        *(uint128_t *)&a5[32] = v47;
                        *(uint128_t *)&a5[48] = v48;
                        v15 = v22[2];
                        v16 = v22[3];
                        v12 = *v22;
                        v14 = v22[1];
                        *v22 = 0x80000000000000000000000000000006;
                        ptr1 = _malloc(64);
                        if (!ptr1)
                        {
                            sub_c6ba70(8, 64);
                            __debugbreak();
                        }
                        *(uint128_t *)ptr1 = v12;
                        *(uint128_t *)(ptr1 + 16) = v14;
                        *(uint128_t *)(ptr1 + 32) = v15;
                        *(uint128_t *)(ptr1 + 48) = v16;
                        sub_b7fa90(&v0, ptr1, 0);
                    }
                }
                v12 = (uint128_t *)*(int128_t *)a4;
                v14 = (int128_t)a4[16];
                v15 = (int128_t)a4[32];
                v16 = (int128_t)a4[48];
                sub_b94fac(&v10, &v0, &v12, 13);
                v5 = v10;
                v7 = v11;
                v4 = 9;
                v12 = (uint128_t *)*(int128_t *)a5;
                v14 = (int128_t)a5[16];
                v15 = (int128_t)a5[32];
                v16 = (int128_t)a5[48];
                sub_b94fac(&v10, &v4, &v12, 14);
                return sub_b96a14(a0, &v10);
            }
        }
        else
        {
            v50 = &g_ef8fd0;
        }
    }
    else
    {
        v50 = &g_ef8fb8;
    }
    sub_c73c64(v50);
    __debugbreak();
}

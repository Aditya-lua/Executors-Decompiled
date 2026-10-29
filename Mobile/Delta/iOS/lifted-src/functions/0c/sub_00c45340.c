/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc45340..0xc455e0 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_efd030;

unsigned long long sub_c45340(unsigned long long *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v23;  // x8
    unsigned long long iter;  // x10
    unsigned long long v33;  // x0
    unsigned long long v25;  // x9
    unsigned long long v26;  // x10
    unsigned long long v27;  // x10
    unsigned long v28;  // x20
    unsigned long long v29;  // 4112
    unsigned long v30;  // x21
    unsigned long long ptr;  // x0
    unsigned long long v32;  // 4106
    unsigned long long v0;  // [bp-0x268]
    unsigned long v1;  // [bp-0x260]
    unsigned long long v2;  // [bp-0x254]
    unsigned short v3;  // [bp-0x250]
    unsigned long long v4;  // [bp-0x24e]
    unsigned long long v5;  // [bp-0x24a]
    unsigned long long *v6;  // [bp-0x248]
    uint312_t v7;  // [bp-0x240], Other Possible Types: unsigned long long (64 bits)[6]
    unsigned long v8;  // [bp-0x238]
    uint128_t v9;  // [bp-0x220]
    uint128_t v10;  // [bp-0x210]
    uint128_t v11;  // [bp-0x1e0]
    uint128_t v12;  // [bp-0x1d0]
    uint128_t v13;  // [bp-0x1c0]
    unsigned long v14;  // [bp-0x1b0]
    unsigned int v15;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned int v16;  // [bp-0xbc]
    unsigned long v17;  // [bp-0xb8]
    uint384_t v18;  // [bp-0xb0]
    unsigned long long v19;  // [bp-0x80]
    uint512_t v20;  // [bp-0x70]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v2 = 0;
    v3 = 438;
    v4 = 0;
    v5 = 0;
    v4 = 1;
    v6 = &v2;
    if (383 >= a2)
    {
        _memcpy(v7);
        *((char *)v7 + a2) = 0;
        v23 = a2 + 1;
        if (14 >= a2)
        {
            iter = 0;
            do
            {
                if (!*((char *)v7 + iter))
                    goto LABEL_c45478;
            } while ((iter += 1, v23 != iter));
        }
        else
        {
            v25 = 7;
            if ((char *)&v7[0] + 7 == v7)
            {
                v26 = a2 - 15;
            }
            else
            {
                iter = 0;
                while (1)
                {
                    if (*((char *)v7 + iter))
                    {
                        iter += 1;
                        if (iter == 7)
                        {
                            v26 = a2 - 15;
                            if (7 <= v26)
                                break;
                            else
                                goto LABEL_c45448;
                        }
                    }
                    else
                    {
LABEL_c45478:
                        if (iter != a2)
                            goto LABEL_c4552c;
                        sub_c5cd20(&v15, v7, &v2);
                        if (v15 & 1)
                        {
                            v1 = v17;
                            v0 = 1;
                            v33 = sub_c40ff0(&v1);
                            *a0 = 0;
                            return v33;
                        }
                    }
                }
            }
            do
            {
            } while (!(~((0x101010101010100 - *(long long *)((char *)v7 + v25) | *(long long *)((char *)v7 + v25)) & (0x101010101010100 - *(long long *)((char *)v7 + v25 + 8) | *(long long *)((char *)v7 + v25 + 8))) & 0x8080808080808080) && (v25 += 16, v25 <= v26));
LABEL_c45448:
            if (v23 != v25)
            {
                v27 = 0;
                do
                {
                    if (!*((char *)v7 + v25 + v27))
                    {
                        iter = v27 + v25;
                        goto LABEL_c45478;
                    }
                } while ((v27 += 1, v23 - v25 != v27));
            }
        }
LABEL_c4552c:
        v17 = &g_efd030;
        v15 = 1;
        v1 = v17;
        v0 = 1;
        v33 = sub_c40ff0(&v1);
        *a0 = 0;
        return v33;
    }
    else
    {
        sub_c7992c(&v15);
        if (v15 & 1)
        {
            v1 = v17;
            v0 = 1;
            v33 = sub_c40ff0(&v1);
            *a0 = 0;
            return v33;
        }
    }
    v28 = v16;
    *(uint128_t *)((char *)&v20 + 32) = 0;
    *(uint128_t *)((char *)&v20 + 48) = 0;
    *(uint128_t *)&v20 = 0;
    *(uint128_t *)((char *)&v20 + 16) = 0;
    *(uint128_t *)((char *)&v18 + 32) = 0;
    v19 = 0;
    *(uint128_t *)&v18 = 0;
    *(uint128_t *)((char *)&v18 + 16) = 0;
    v15 = 0;
    v29 = arm64g_calculate_condition(1, _fstat(v28, &v15) & 0xffffffff, 1, 0);
    if (!(v29 & 1))
    {
        v11 = *(uint128_t *)((void*)&v20 + 8);
        v12 = *(uint128_t *)((void*)&v20 + 24);
        v13 = *(uint128_t *)((void*)&v20 + 40);
        v14 = *(unsigned long long *)((void*)&v20 + 56);
        v9 = *(uint128_t *)((void*)&v18 + 8);
        v10 = *(uint128_t *)((void*)&v18 + 24);
        v30 = *(unsigned long long *)((void*)&v11 + 8);
        ptr = _mmap(0, v30, 1, 2, v28, 0);
        v32 = arm64g_calculate_condition(2, ptr, 1, 0);
        if (v32 & 1)
            goto LABEL_c45590;
        a0[1] = ptr;
        a0[2] = v30;
        *a0 = 1;
    }
    else
    {
        *(unsigned long long *)&v7 = 1;
        v8 = 2 | *(int *)___error() * 0x100000000;
        sub_c40ff0(&v8);
LABEL_c45590:
        *a0 = 0;
    }
    return _close(v28);
}

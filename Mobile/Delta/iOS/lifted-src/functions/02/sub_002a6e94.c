/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a6e94..0x2a7194 (768 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a6e94_0 {
    char field_0;
} st_2a6e94_0;


void* sub_2a6e94(void* a0, long long a1)
{
    void* v10;  // x8
    void* i;  // x20
    void* *v20;  // x21
    void* v21;  // x0
    void* v22;  // x8
    void* v12;  // x21
    void* v13;  // x8
    long long v14;  // w8
    unsigned long v15;  // x20
    unsigned long v16;  // x26
    void* *j;  // x21
    void* *v18;  // x26
    unsigned long v19;  // x21
    st_2a6e94_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_2a6e94_0 *v1;  // [bp-0x98]
    uint128_t v2;  // [bp-0x90], Other Possible Types: void* *
    void* v3;  // [bp-0x78]
    void* v4;  // [bp-0x70]
    void* v5;  // [bp-0x68]
    char *v6;  // [bp-0x60]
    st_2a6e94_0 **v7;  // [bp-0x58], Other Possible Types: char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    if (2 >= a1)
    {
        if (a1 != 1)
        {
            if (a1 == 2)
            {
                v10 = *(long long *)a0;
                if (!v10)
                    return a0;
                v4 = 0;
                v5 = 0;
                v3 = 0;
                sub_2adea8(&v3, (long long)v10[8] - *(long long *)v10 >> 4);
                sub_2a5dc4(&v7, *(long long *)*(long long *)a0, *(long long *)(*(long long *)a0 + 8), &v3);
            }
            else
            {
                return a0;
            }
        }
        else
        {
            if (*(long long *)a0)
            {
                v4 = 0;
                v5 = 0;
                v3 = 0;
                sub_2adea8(&v3, *(long long *)(*(long long *)a0 + 16));
                i = *(long long *)*(long long *)a0;
                v12 = *(long long *)a0 + 8;
                if (*(long long *)*(long long *)a0 != v12)
                {
                    do
                    {
                        sub_2ab0f8(&v3, i + 56);
                        i = sub_62b88(i);
                    } while (i != v12);
                }
            }
            else
            {
                return a0;
            }
        }
        v13 = v4;
        if (v3 != v13)
        {
            do
            {
                v2 = *(int128_t *)((char *)v13 - 16);
                *((char *)v13 - 16) = 0;
                *(unsigned long long *)((char *)v13 - 8) = 0;
                sub_2a5850(&v3, v4 - 16);
                v14 = *(char *)&v2;
                if (v14 == 1)
                {
                    v15 = *(unsigned long long *)((void*)&v2 + 8);
                    v16 = *(unsigned long long *)((void*)&v2 + 8);
                    j = *(long long *)v16;
                    v18 = v16 + 8;
                    if (*(long long *)v16 != v18)
                    {
                        do
                        {
                            sub_2ab0f8(&v3, j + 7);
                            j = sub_62b88(j);
                        } while (j != v18);
                        v15 = *(unsigned long long *)((void*)&v2 + 8);
                    }
                    v6 = &v7;
                    v7 = &v6;
                    v19 = v15;
                    v20 = v19 + 8;
                    sub_2a5d5c(v15, *(long long *)(v19 + 8));
                    *(void* **)v15 = v20;
                    *(unsigned long long *)(v15 + 16) = 0;
                    *v20 = 0;
                }
                else if (v14 == 2)
                {
                    sub_2a5dc4(&v7, *(long long *)*(unsigned long long *)((void*)&v2 + 8), *(long long *)(*(unsigned long long *)((void*)&v2 + 8) + 8), &v3);
                    sub_2a5850(*(unsigned long long *)((void*)&v2 + 8), *(long long *)*(unsigned long long *)((void*)&v2 + 8));
                }
            } while ((sub_2a6e94((char *)&v2 + 8, *(char *)&v2), v13 = v4, v3 != v13));
        }
        v2 = &v3;
        v21 = sub_2a916c(&v2);
        if (2 >= a1)
        {
            if (a1 == 1)
            {
                sub_2a5d5c(*(long long *)a0, *(long long *)(*(long long *)a0 + 8));
                return sub_4e14(*(long long *)a0, 1, 8);
            }
            else if (a1 == 2)
            {
                v3 = *(long long *)a0;
                sub_2a916c(&v3);
                return sub_4e14(*(long long *)a0, 1, 8);
            }
            else
            {
                return v21;
            }
        }
        switch (a1)
        {
        case 3:
            return sub_4e14(*(long long *)a0, 1, 8);
        case 8:
            v22 = *(long long *)a0;
            break;
        default:
            return v21;
        }
    }
    else
    {
        switch (a1)
        {
        case 3:
            if (*(long long *)a0)
                return sub_4e14(*(long long *)a0, 1, 8);
            return *(long long *)a0;
        case 8:
            v22 = *(long long *)a0;
            if (!v22)
                return a0;
            break;
        default:
            return a0;
        }
    }
    v3 = v22;
    sub_30030(&v3);
    return sub_4e14(*(long long *)a0, 1, 8);
}

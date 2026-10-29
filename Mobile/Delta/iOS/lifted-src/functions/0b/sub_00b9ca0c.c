/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9ca0c..0xb9cbf0 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9ca0c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    uint128_t field_18;
} st_b9ca0c_0;


double sub_b9ca0c(void* *a0, st_b9ca0c_0 *a1, st_b9ca0c_0 *a2)
{
    st_b9ca0c_0 *iter;  // x22
    unsigned long v8;  // x24
    unsigned long v17;  // d0
    st_b9ca0c_0 *v9;  // x9
    unsigned long long v10;  // x8
    void* v11;  // x0
    unsigned long long v12;  // x25
    unsigned long long idx;  // x21
    void* ptr;  // x0
    uint128_t v15;  // q0
    unsigned long v16;  // d0
    uint128_t v0;  // [bp-0x90]
    void* v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x68]
    uint128_t v3;  // [bp-0x60], Other Possible Types: unsigned long
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (a1 == a2)
    {
        *a0 = 0;
        a0[1] = 8;
        a0[2] = 0;
        return v17;
    }
    iter = (a1->padding_10)[1];
    v8 = a1->field_8;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ >= 0)
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ < 0)
            goto LABEL_b9cbb0;
        v3 = a1->field_0;
        v4 = v8;
        v9 = a2 - iter;
        v10 = 12297829382473034411 * (v9 >> 3);
        if (3 >= v10)
            v10 = 3;
        if (v9 > 0xbfffffffffffffd0)
        {
            v11 = 0;
        }
        else
        {
            v12 = v10 + 1;
            idx = v12 * 16;
            ptr = _malloc(idx);
            if (ptr)
            {
                *(unsigned long long *)ptr = a1->field_0;
                *(unsigned long *)&ptr[8] = v8;
                v1 = CONCAT(ptr, v12);
                v2 = 1;
                if (iter != a2)
                {
                    idx = 1;
                    do
                    {
                        v15 = *(int128_t *)&iter->field_0;
                        iter = (iter->padding_10)[1];
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        if ((long long)/* unsupported instruction */ < 0)
                            goto LABEL_b9cbb0;
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        if ((long long)/* unsupported instruction */ < 0)
                            goto LABEL_b9cbb0;
                        v3 = v15;
                        if (idx == (unsigned long long)v1)
                        {
                            v0 = v15;
                            sub_c736c8(&v1, idx, 1 + 12297829382473034411 * (a2 - iter >> 3), 8, 16);
                            ptr = *(unsigned long long *)((void*)&v1 + 8);
                            v15 = v0;
                        }
                        *(uint128_t *)((char *)ptr + 16 * idx) = v15;
                        idx += 1;
                        v2 = idx;
                    } while (iter != a2);
                }
                *(uint128_t *)a0 = (uint128_t)v1;
                a0[2] = v2;
                return v16;
            }
LABEL_b9cbb4:
            v11 = 8;
        }
        sub_c6b970(v11, idx);
        __debugbreak();
    }
    else
    {
LABEL_b9cbb0:
        sub_c769bc();
        goto LABEL_b9cbb4;
    }
}

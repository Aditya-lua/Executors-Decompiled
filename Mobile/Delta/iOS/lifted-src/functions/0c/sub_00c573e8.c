/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc573e8..0xc576c4 (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c573e8_0 {
    char *field_0;
    unsigned long long field_8;
} st_c573e8_0;

typedef struct st_c573e8_1 {
    unsigned long long field_0;
    unsigned short field_2;
} st_c573e8_1;


double sub_c573e8(void* a0, st_c573e8_0 *a1)
{
    char *v7;  // x22
    unsigned long v8;  // x8
    unsigned long long v17;  // w12
    unsigned long long v18;  // x11
    char *v19;  // x10
    char *iter;  // x9
    unsigned long long v21;  // x13
    unsigned long v22;  // x14
    unsigned long long v23;  // x21
    unsigned long v24;  // x8
    unsigned long v25;  // x27
    unsigned long v26;  // x8
    unsigned long long v9;  // x23
    unsigned int v27;  // w8
    st_c573e8_1 *v28;  // x9
    unsigned long v29;  // d0
    char v30;  // x9
    unsigned long v31;  // d0
    unsigned long long v32;  // x11
    unsigned long long v33;  // w8
    char v34;  // x10
    unsigned long v35;  // d0
    long long v36;  // x0
    char *v10;  // x22
    unsigned long v37;  // d0
    unsigned long v38;  // d0
    unsigned long v39;  // d0
    unsigned long long v11;  // x24
    unsigned long long v12;  // x21
    unsigned long long ptr;  // x0
    unsigned long long v14;  // x26
    unsigned long long v15;  // w25
    unsigned long long v16;  // x28
    unsigned long long v0;  // [bp-0x88]
    unsigned long long v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x78], Other Possible Types: unsigned long long
    long long v3;  // [bp-0x70]
    unsigned long long i;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a1->field_0;
    v8 = a1->field_8;
    if (!v8)
    {
        *(unsigned short *)&a0[8] = 19;
        *(unsigned short *)&a0[14] = 0;
        *(unsigned int *)&a0[10] = 0;
        *(char **)&a0[16] = v7;
        *(unsigned long *)a0 = 0x8000000000000000;
        return v39;
    }
    v9 = *v7;
    v10 = v7 + 1;
    v11 = v8 - 1;
    a1->field_0 = v10;
    a1->field_8 = v11;
    if (v9)
    {
        v12 = v9 * 4;
        ptr = _malloc(v12);
        if (ptr)
        {
            v14 = 0;
            v15 = 0;
            v2 = CONCAT(ptr, v9);
            i = 0;
            do
            {
                if (v11)
                {
                    v16 = 0;
                    v17 = 0;
                    v18 = v11;
                    v19 = v10;
                    iter = v10;
                }
                else
                {
LABEL_c575f0:
                    v30 = 19;
                    v8 = v10;
LABEL_c575f8:
                    *(char *)&a0[8] = v30;
                    memset(a0 + 9, 0, 7);
                    *(unsigned long *)&a0[16] = v8;
                    *(unsigned long *)a0 = 0x8000000000000000;
                    if (!(unsigned long long)v2)
                        return v31;
                    _free(*(unsigned long long *)((void*)&v2 + 8));
                    return v37;
                }
                while (1)
                {
                    v21 = v18 - 1;
                    v22 = *iter;
                    iter += 1;
                    if (v17 == 63 && 1 < (unsigned int)v22)
                    {
                        a1->field_0 = iter;
                        a1->field_8 = v21;
                        v30 = 6;
                        goto LABEL_c575f8;
                    }
                    v16 |= (v22 & 127) << ((char)v17 & 63);
                    if (!(v22 >> 7 & 1))
                        break;
                    v17 += 7;
                    v18 = v21;
                    v19 = iter;
                    if (!v21)
                    {
                        v10 = &v10[v11];
                        a1->field_0 = v10;
                        a1->field_8 = 0;
                        goto LABEL_c575f0;
                    }
                }
                a1->field_0 = iter;
                a1->field_8 = v21;
                if (v16 < 0xffff)
                    v23 = (unsigned short)v16;
                else
                    v23 = 0xffff;
                if (v16 == 1)
                    v15 += 1;
                if (!v21)
                {
                    v32 = 0;
                    v33 = 0;
                    v34 = 19;
                    goto LABEL_c57674;
                }
                v11 = v18 - 2;
                v10 = v19 + 2;
                a1->field_0 = v10;
                a1->field_8 = v11;
                v24 = v19[1];
                if (!(v24 >> 31 & 1))
                {
                    v1 = v14 + 1;
                    v25 = (int)v24;
                    continue;
                }
                if (v11)
                {
                    iter = v14 + 1;
                    v1 = iter;
                    v11 = v18 - 3;
                    v10 = v19 + 3;
                    a1->field_0 = v10;
                    a1->field_8 = v11;
                    v26 = v19[2];
                    v25 = (unsigned int)v24 & 127 & 0xffffc000 | ((unsigned int)v24 & 127 & 0xffffc07f | __ROL__((unsigned int)v26, 7) & 16256) & 0x3fff;
                    if (!(v26 >> 7 & 1))
                        continue;
                    if (!v11)
                        goto LABEL_c57654;
                    v11 = v18 - 4;
                    v10 = v19 + 4;
                    a1->field_0 = v10;
                    a1->field_8 = v11;
                    v27 = v19[3];
                    if (3 >= v27)
                    {
                        v25 = ((unsigned int)v25 | v27 * 0x4000) & 0xffff;
                    }
                    else
                    {
                        v32 = v0;
                        v33 = (unsigned int)(v32 >> 16);
                        v34 = 6;
LABEL_c57674:
                        *(char *)&a0[8] = v34;
                        *(char *)&a0[9] = 0;
                        *(unsigned short *)&a0[10] = v32;
                        *(unsigned int *)&a0[12] = v33;
                        *(char **)&a0[16] = iter;
                        *(unsigned long *)a0 = 0x8000000000000000;
                        if (!(unsigned long long)v2)
                            return v35;
                        _free(*(unsigned long long *)((void*)&v2 + 8));
                        return v37;
                    }
                }
                else
                {
LABEL_c57654:
                    v32 = 0;
                    v33 = 0;
                    v34 = 19;
                    iter = v10;
                    goto LABEL_c57674;
                }
                if (v14 == (unsigned long long)v2)
                {
                    sub_c798c4(&v2);
                    ptr = *(unsigned long long *)((void*)&v2 + 8);
                }
                v28 = ptr + v14 * 4;
                *(unsigned short *)&v28->field_0 = v23;
                v0 = v0 & 0xffffffffffff0000 | v25;
                *(unsigned short *)((char *)&v28->field_0 + 2) = v25;
                i = v1;
                v14 = i;
                v8 = v16;
            } while (i != v9);
            if (v15 == 1)
            {
                *(uint128_t *)a0 = v2;
                *(unsigned long long *)&a0[16] = i;
                return v29;
            }
        }
        else
        {
            v36 = sub_c6b970(2, v12);
            if (v2)
                _free(v3);
            __Unwind_Resume(v36);
        }
    }
    else
    {
        v2 = CONCAT(2, 0);
        i = 0;
    }
    *(char *)&a0[8] = 71;
    *(unsigned long *)a0 = 0x8000000000000000;
    if (!(unsigned long long)v2)
        return v38;
    _free(*(unsigned long long *)((void*)&v2 + 8));
    return v37;
}

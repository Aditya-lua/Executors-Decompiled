/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x961c98..0x962324 (1676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_961c98_0 {
    char padding_0[120];
    long long field_78;
} st_961c98_0;


void* sub_961c98(void* a0)
{
    unsigned long long idx;  // x22
    void* v3;  // x20
    unsigned long long v12;  // x25
    unsigned long long v13;  // x23
    st_961c98_0 *v14;  // x8
    unsigned long long v15;  // w8
    unsigned long long v16;  // x23
    void* ptr;  // x0
    st_961c98_0 *v18;  // x8
    unsigned long long v19;  // w9
    unsigned long long v20;  // x8
    unsigned long long v21;  // x8
    unsigned long long v4;  // w21
    unsigned long long v22;  // x21
    st_961c98_0 *v23;  // x8
    unsigned long v24;  // x8
    unsigned long v25;  // x8
    unsigned long long v26;  // x25
    unsigned long long v27;  // x24
    unsigned long v28;  // x8
    unsigned long v29;  // x8
    unsigned long v30;  // x8
    unsigned long long v31;  // 4164
    unsigned long long v5;  // x26
    unsigned long long v32;  // x22
    unsigned long long v33;  // x8
    st_961c98_0 *v34;  // x8
    unsigned long v35;  // x8
    unsigned long v36;  // x8
    unsigned long long v37;  // x8
    st_961c98_0 *v38;  // x8
    unsigned long v39;  // x8
    unsigned long v40;  // x8
    unsigned int v41;  // w9
    unsigned long v6;  // x24
    unsigned long v7;  // x28
    unsigned int v8;  // w27
    unsigned long long v9;  // w28
    st_961c98_0 *v10;  // x8
    unsigned long long v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    idx = (long long)a0[2176];
    if (!idx)
        return a0;
    v3 = (long long)a0[1032];
    if (*(long long *)(idx + 8) || *(long long *)(idx + 16))
        v4 = 1;
    else
        v4 = *(int *)(idx + 24) != 0;
    v5 = *(int *)v3 & 1;
    v6 = (int)v3[8];
    v7 = (int)v3[12];
    v8 = (int)a0[280];
    if ((int)v8 >= 7)
    {
        v9 = (int)a0[120];
        if (*(long long *)((char *)a0 + (!v9 ? 5528 : 5544)) && _memchr(*(long long *)((char *)a0 + (!v9 ? 5528 : 5544)), 2, *(long long *)((char *)a0 + (!v9 ? 5536 : 5552))))
        {
            v10 = *(long long *)(idx + 32);
LABEL_961d6c:
            v11 = !v10[1].field_78;
            if (!v10[1].field_78)
                goto LABEL_961dc4;
            v12 = 128;
        }
        else
        {
            v10 = *(long long *)(idx + 32);
            if (*(long long *)(*(long long *)(idx + 32) + 240))
                goto LABEL_961d6c;
            v11 = 1;
LABEL_961dc4:
            v12 = 0;
        }
        v13 = (v11 ? 0 : 528);
        goto LABEL_961dd4;
    }
    if (v8 == 6)
    {
        v13 = 0;
        v12 = 0;
        v9 = (int)a0[120];
LABEL_961dd4:
        if (*(long long *)((char *)a0 + (!v9 ? 5528 : 5544)) && _memchr(*(long long *)((char *)a0 + (!v9 ? 5528 : 5544)), 2, *(long long *)((char *)a0 + (!v9 ? 5536 : 5552))))
        {
            v14 = *(long long *)(idx + 32);
LABEL_961e20:
            v15 = !*(long long *)&v14[1].padding_0[80];
            if (*(long long *)&v14[1].padding_0[80])
                v12 = 128;
        }
        else
        {
            v14 = *(long long *)(idx + 32);
            if (*(long long *)(*(long long *)(idx + 32) + 200))
                goto LABEL_961e20;
            v15 = 1;
        }
        v16 = (v15 ? v13 : 528);
        goto LABEL_961e48;
    }
    if ((int)v8 >= 5)
    {
        v16 = 0;
        v12 = 0;
        v9 = (int)a0[120];
LABEL_961e48:
        ptr = *(long long *)((char *)a0 + (!v9 ? 5528 : 5544));
        if (ptr && (ptr = _memchr(ptr, 2, *(long long *)((char *)a0 + (!v9 ? 5536 : 5552))), ptr))
        {
            v18 = *(long long *)(idx + 32);
LABEL_961e94:
            v19 = !*(long long *)&v18[1].padding_0[40];
            v20 = v16 | 16;
            if (*(long long *)&v18[1].padding_0[40])
                v12 |= 32;
        }
        else
        {
            v18 = *(long long *)(idx + 32);
            if (*(long long *)(*(long long *)(idx + 32) + 160))
                goto LABEL_961e94;
LABEL_961ec0:
            v20 = v16 | 16;
            v19 = 1;
        }
    }
    else
    {
        v16 = 0;
        v12 = 0;
        ptr = a0;
        goto LABEL_961ec0;
    }
    v21 = (v19 ? v16 : v20) | v5;
    v22 = (v4 ? v21 | 2 : v21);
    if ((unsigned int)v5)
    {
LABEL_961ee4:
        v12 |= 1;
    }
    else if ((int)v8 >= 2)
    {
        ptr = *(long long *)((char *)a0 + (!(int)a0[120] ? 5528 : 5544));
        if (ptr && (ptr = _memchr(ptr, 2, *(long long *)((char *)a0 + (!(int)a0[120] ? 5536 : 5552))), ptr))
        {
            v23 = *(long long *)(idx + 32);
LABEL_961f44:
            if (*(long long *)&v23->padding_0[48] && (char)v3[5] & 1)
            {
                v24 = *(int *)a0;
                if (!(unsigned int)v24)
                {
                    ptr = a0;
                    if (((int)a0[72] & 0xffffff00) == 0x300)
                    {
LABEL_961fcc:
                        if ((int)ptr[72] == 0x303)
                            goto LABEL_961ee4;
                    }
                }
                else if (v24 >> 7 & 1 && (ptr = sub_980dc8(a0), v25 = *(int *)a0, ((unsigned int)v25 >> 1 & 0x7fffffff) != 64 && ptr && ((unsigned int)((int)ptr[72]) >> 8 & 0xffffff) == 3 && (ptr = a0, !(unsigned int)v25 || v25 >> 7 & 1 && (ptr = sub_980dc8(a0), ((unsigned int)(*(int *)a0) >> 1 & 0x7fffffff) != 64 && ptr))))
                {
                    goto LABEL_961fcc;
                }
            }
        }
        else
        {
            v23 = *(long long *)(idx + 32);
            if (*(long long *)(*(long long *)(idx + 32) + 40))
                goto LABEL_961f44;
        }
    }
    v26 = *(int *)v3 & 0x1000;
    v27 = v12 | (v6 * 2 | v6 >> 63) & 2 & 3 | (unsigned int)((int)v3[12]) >> 9 & 8 | (!(unsigned int)v26 ? 4 : 5);
    v28 = *(int *)a0;
    if (!(unsigned int)v28)
    {
        ptr = a0;
        if (((int)a0[72] & 0xffffff00) == 0x300)
        {
LABEL_962080:
            if ((int)ptr[72] == 0x303)
            {
                v30 = (int)v3[4];
                v27 |= (v30 * 0x10000000000000 | v30 >> 12) & 0xfff0000000000001 & 1;
                if ((char)((char)v3[29]) >> 4 & 1 || (char)((char)v3[33]) >> 4 & 1)
                    v27 |= 8;
            }
        }
    }
    else if (v28 >> 7 & 1 && !(ptr = sub_980dc8(a0), v29 = *(int *)a0, ((unsigned int)v29 >> 1 & 0x7fffffff) == 64 || !ptr || ((unsigned int)((int)ptr[72]) >> 8 & 0xffffff) != 3 || (ptr = a0, (unsigned int)v29 && (!(v29 >> 7 & 1) || (ptr = sub_980dc8(a0), ((unsigned int)(*(int *)a0) >> 1 & 0x7fffffff) == 64 || !ptr)))))
    {
        goto LABEL_962080;
    }
    if (v7 & 1)
    {
        ptr = sub_aeb46c(*(long long *)(*(long long *)(idx + 32) + 120));
        v31 = arm64g_calculate_condition(((unsigned int)ptr & 128 ? 3 : 0), ((unsigned int)ptr & 128 ? (char)v3[12] & 2 : 0x40000000), 0, 0);
        v27 = (v31 & 1 ? v27 : v27 | 8);
    }
    v32 = v22 | v26 >> 12;
    if (!(v27 >> 3 & 1) && (int)a0[280] >= 8)
    {
        ptr = *(long long *)((char *)a0 + (!(int)a0[120] ? 5528 : 5544));
        if (ptr)
        {
            ptr = _memchr(ptr, 2, *(long long *)((char *)a0 + (!(int)a0[120] ? 5536 : 5552)));
            v33 = (long long)a0[2176];
            if (!ptr)
                goto LABEL_962134;
            v34 = *(long long *)((long long)a0[2176] + 32);
        }
        else
        {
            v33 = (long long)a0[2176];
LABEL_962134:
            v34 = *(long long *)(v33 + 32);
            if (!*(long long *)(*(long long *)(v33 + 32) + 280))
                goto LABEL_9621d8;
        }
        if (*(long long *)&v34[2].padding_0[32] && (char)v3[29] & 1)
        {
            v35 = *(int *)a0;
            if (!(unsigned int)v35)
            {
                ptr = a0;
                if (((int)a0[72] & 0xffffff00) == 0x300)
                {
LABEL_9621c8:
                    v27 = ((int)ptr[72] == 0x303 ? v27 | 8 : v27);
                }
            }
            else if (v35 >> 7 & 1 && !(ptr = sub_980dc8(a0), v36 = *(int *)a0, ((unsigned int)v36 >> 1 & 0x7fffffff) == 64 || !ptr || ((unsigned int)((int)ptr[72]) >> 8 & 0xffffff) != 3 || (ptr = a0, (unsigned int)v36 && (!(v36 >> 7 & 1) || (ptr = sub_980dc8(a0), ((unsigned int)(*(int *)a0) >> 1 & 0x7fffffff) == 64 || !ptr)))))
            {
                goto LABEL_9621c8;
            }
        }
    }
LABEL_9621d8:
    if (!(v27 >> 3 & 1) && (int)a0[280] >= 9)
    {
        ptr = *(long long *)((char *)a0 + (!(int)a0[120] ? 5528 : 5544));
        if (ptr)
        {
            ptr = _memchr(ptr, 2, *(long long *)((char *)a0 + (!(int)a0[120] ? 5536 : 5552)));
            v37 = (long long)a0[2176];
            if (!ptr)
                goto LABEL_962234;
            v38 = *(long long *)((long long)a0[2176] + 32);
        }
        else
        {
            v37 = (long long)a0[2176];
LABEL_962234:
            v38 = *(long long *)(v37 + 32);
            if (!*(long long *)(*(long long *)(v37 + 32) + 320))
            {
                v41 = (!(v32 & 1) ? 12 : 76);
                *(unsigned int *)&a0[1040] = v41 & 0xfffffe00 | (v41 & 0xfffffeff | (((unsigned int)v22 >> 1) * 0x100 | (unsigned int)v22 >> 25) & 0x100) & 0x1ff | (unsigned int)v32 | 128;
                *(unsigned int *)&a0[1044] = (unsigned int)v27 | 16;
                return ptr;
            }
        }
        if (*(long long *)&v38[2].padding_0[72] && (char)v3[33] & 1)
        {
            v39 = *(int *)a0;
            if (!(unsigned int)v39)
            {
                ptr = a0;
                if (((int)a0[72] & 0xffffff00) == 0x300)
                {
LABEL_9622c8:
                    v27 = ((int)ptr[72] == 0x303 ? v27 | 8 : v27);
                }
            }
            else if (v39 >> 7 & 1 && !(ptr = sub_980dc8(a0), v40 = *(int *)a0, ((unsigned int)v40 >> 1 & 0x7fffffff) == 64 || !ptr || ((unsigned int)((int)ptr[72]) >> 8 & 0xffffff) != 3 || (ptr = a0, (unsigned int)v40 && (!(v40 >> 7 & 1) || (ptr = sub_980dc8(a0), ((unsigned int)(*(int *)a0) >> 1 & 0x7fffffff) == 64 || !ptr)))))
            {
                goto LABEL_9622c8;
            }
        }
    }
    v41 = (!(v32 & 1) ? 12 : 76);
    *(unsigned int *)&a0[1040] = v41 & 0xfffffe00 | (v41 & 0xfffffeff | (((unsigned int)v22 >> 1) * 0x100 | (unsigned int)v22 >> 25) & 0x100) & 0x1ff | (unsigned int)v32 | 128;
    *(unsigned int *)&a0[1044] = (unsigned int)v27 | 16;
    return ptr;
}

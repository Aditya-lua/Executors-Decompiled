/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadff4c..0xae019c (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adff4c_2 {
    char padding_0[8];
    struct st_adff4c_1 *field_8;
} st_adff4c_2;

typedef struct st_adff4c_1 {
    struct st_adff4c_0 *field_0;
    struct st_adff4c_1 *field_8;
    unsigned long long field_10;
} st_adff4c_1;

typedef struct st_adff4c_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    unsigned long long field_10;
} st_adff4c_0;


unsigned long long sub_adff4c(st_adff4c_2 *a0, unsigned long long ptr, unsigned long long a2, unsigned long long a3)
{
    st_adff4c_1 *v2;  // x21
    unsigned long n;  // x9
    unsigned int v12;  // w8
    unsigned long long v13;  // x1
    unsigned long long v14;  // x8
    unsigned long long v15;  // x20
    st_adff4c_0 *v16;  // w10
    unsigned long long v4;  // x20
    st_adff4c_0 *v5;  // w8
    unsigned long long v6;  // x1
    unsigned long long v7;  // x21
    st_adff4c_1 *v8;  // x19
    unsigned long v9;  // x2
    st_adff4c_0 *v10;  // x21
    unsigned long n1;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (!ptr)
    {
        return 0;
    }
    else if (a2)
    {
        if (*(int *)&a0->padding_0[0] == 1)
        {
            v10 = a0->field_8->field_0;
            n1 = v10->field_0;
            if (n1 >> 31 & 1)
                return 0;
            if ((int)a3 >= (int)n1)
            {
                v4 = a2;
                if ((unsigned int)n1)
                {
                    _memcpy(ptr, v10->field_8, n1);
                    v12 = v10->field_0;
                    if (v10->field_10 & 7)
                    {
                        v13 = ptr;
                        *(char *)(ptr + v12 - 1) = *(char *)(ptr + v12 - 1) & (char)(-0x100 >> ((char)(8 - ((char)v10->field_10 & 7)) & 31));
                        v12 = v10->field_0;
                        ptr = v13;
                    }
                    else
                    {
                        a3 = a3;
                        ptr = ptr;
                    }
                }
                else
                {
                    v12 = 0;
                }
                v7 = a3;
                _bzero(ptr + v12, (int)(a3 - v12));
                v8 = a0->field_8->field_8;
                v9 = (int)v8->field_0;
                if (v9 >> 31 & 1)
                    return 0;
            }
            else
            {
                return 0;
            }
        }
        else if (!*(int *)&a0->padding_0[0])
        {
            v2 = a0->field_8;
            n = (int)v2->field_0;
            if (n >> 31 & 1)
            {
                return 0;
            }
            else if ((int)a3 >= (int)n)
            {
                v4 = a2;
                if ((unsigned int)n)
                {
                    _memcpy(ptr, v2->field_8, n);
                    v5 = (st_adff4c_0 *)(int)v2->field_0;
                    if (v2->field_10 & 7)
                    {
                        v6 = ptr;
                        *(char *)(ptr + (long long)v5 - 1) = *(char *)(ptr + (long long)v5 - 1) & (char)(-0x100 >> ((char)(8 - ((char)v2->field_10 & 7)) & 31));
                        v5 = (st_adff4c_0 *)(int)v2->field_0;
                        ptr = v6;
                    }
                    else
                    {
                        a3 = a3;
                        ptr = ptr;
                    }
                }
                else
                {
                    v5 = (st_adff4c_0 *)0;
                }
                v7 = a3;
                _bzero(ptr + (long long)v5, (int)(a3 - (unsigned long long)v5));
                v8 = a0->field_8;
                v9 = (int)v8->field_0;
                if (v9 >> 31 & 1)
                    return 0;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
        if ((int)v7 < (int)v9)
            return 0;
        v14 = v4;
        if ((unsigned int)v9)
        {
            v15 = v14;
            _memcpy(v14, v8->field_8);
            v16 = (st_adff4c_0 *)(int)v8->field_0;
            if (v8->field_10 & 7)
            {
                v14 = v15;
                *(char *)(v15 + (long long)v16 - 1) = *(char *)(v15 + (long long)v16 - 1) | (char)(0xff >> ((char)(8 - (v8->field_10 & 7)) & 31));
                v16 = (st_adff4c_0 *)(int)v8->field_0;
            }
            else
            {
                v14 = v15;
            }
        }
        else
        {
            v16 = (st_adff4c_0 *)0;
        }
        _memset(v14 + (long long)v16, 0xff, (int)(v7 - (unsigned long long)v16));
        return 1;
    }
    else
    {
        return 0;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc27e78..0xc27fe4 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c27e78_3 {
    struct st_c27e78_4 *field_0;
    long long field_8;
    struct st_c27e78_4 *field_10;
} st_c27e78_3;

typedef struct st_c27e78_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_c27e78_0;

typedef struct st_c27e78_4 {
    unsigned int field_0;
} st_c27e78_4;

typedef struct st_c27e78_2 {
    char padding_0[36];
    unsigned int field_24;
    unsigned int field_28;
} st_c27e78_2;

typedef struct st_c27e78_1 {
    char padding_0[32];
    unsigned int field_20;
    char padding_24[8];
    unsigned int field_2c;
} st_c27e78_1;


double sub_c27e78(st_c27e78_3 *a0, st_c27e78_0 *a1)
{
    unsigned long long v5;  // x22
    unsigned long v6;  // x23
    unsigned long v15;  // x26
    unsigned int v16;  // w21
    st_c27e78_1 *v17;  // x8
    unsigned int v18;  // w27
    st_c27e78_2 *v19;  // x8
    unsigned long v20;  // d0
    long long v21;  // x0
    unsigned long v22;  // d0
    unsigned long v7;  // x24
    st_c27e78_1 *v8;  // x8
    unsigned int v9;  // w20
    unsigned long v10;  // x8
    unsigned int v11;  // w9
    st_c27e78_2 *v12;  // x11
    unsigned int *ptr;  // x0
    unsigned int *v14;  // x20
    unsigned int *v0;  // [bp-0x78]
    long long v1;  // [bp-0x70]
    unsigned int *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1->field_0;
    v6 = a1->field_8;
    v7 = a1->field_10;
    if (v6 > v7)
    {
        v8 = v5 + (unsigned int)v7 * 48;
        v7 = v8->field_20;
        v9 = v8->field_2c;
    }
    else
    {
        v10 = a1->field_14;
        v11 = a1->field_18;
        do
        {
            if (v6 <= v10)
            {
                a0->field_0 = 0;
                a0->field_8 = 4;
                a0->field_10 = 0;
                return v22;
            }
        } while ((v12 = v5 + 48 * v10, v10 = v12->field_24, v9 = v12->field_28, a1->field_14 = v10, v9 == v11));
    }
    ptr = _malloc(16);
    if (ptr)
    {
        *ptr = v9;
        v0 = CONCAT(ptr, 4);
        v14 = 1;
        v2 = 1;
        v15 = a1->field_14;
        v16 = a1->field_18;
        while (1)
        {
            if (v6 > v7)
            {
                v17 = v5 + 48 * v7;
                v7 = v17->field_20;
                v18 = v17->field_2c;
            }
            else
            {
                do
                {
                    if (v6 <= v15)
                    {
                        *(uint128_t *)&a0->field_0 = (uint128_t)v0;
                        a0->field_10 = v2;
                        return v20;
                    }
                } while ((v19 = v5 + 48 * v15, v15 = v19->field_24, v18 = v19->field_28, v18 == v16));
            }
            if (v14 == v0)
            {
                sub_c736c8(&v0, v14, 1, 4, 4);
                ptr = *(unsigned long long *)((void*)&v0 + 8);
            }
            *(unsigned int *)((char *)ptr + 0x4 * v14) = v18;
            v14 = (char *)v14 + 1;
            v2 = v14;
        }
    }
    else
    {
        v21 = sub_c6b970(4, 16);
        if (v0)
            _free(v1);
        __Unwind_Resume(v21);
    }
}

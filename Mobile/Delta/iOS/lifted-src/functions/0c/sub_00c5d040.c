/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5d040..0xc5d284 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5d040_1 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_c5d040_1;

typedef struct st_c5d040_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c5d040_0;

typedef struct st_c5d040_2 {
    unsigned long long field_0;
    struct st_c5d040_3 *field_8;
    struct st_c5d040_3 *field_10;
    struct st_c5d040_4 *field_18;
    struct st_c5d040_3 *field_20;
    struct st_c5d040_0 *field_28;
    struct st_c5d040_3 *field_30;
    struct st_c5d040_1 *field_38;
} st_c5d040_2;

typedef struct st_c5d040_4 {
    unsigned long long field_0;
} st_c5d040_4;

typedef struct st_c5d040_3 {
    char field_0;
} st_c5d040_3;

extern unsigned long long g_be766c;
extern unsigned long long g_bef1c8;

st_c5d040_2 * sub_c5d040(st_c5d040_2 *a0, st_c5d040_0 *a1)
{
    char *v15;  // x10
    st_c5d040_2 *v16;  // x0
    st_c5d040_2 *v25;  // x0
    unsigned int v17;  // x21
    long long v18;  // x22
    char *v19;  // x23
    unsigned long long *v20;  // x21
    unsigned long v21;  // x8
    unsigned int v22;  // x10
    unsigned long v23;  // x21
    unsigned int v24;  // x8
    st_c5d040_0 *v0;  // [bp-0xb8]
    unsigned int v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8], Other Possible Types: unsigned int
    unsigned long long v3;  // [bp-0xa0]
    char *v4;  // [bp-0x98]
    unsigned long long v5;  // [bp-0x90]
    unsigned int v6;  // [bp-0x88]
    long long v7;  // [bp-0x80]
    long long v8;  // [bp-0x68]
    long long v9;  // [bp-0x60]
    char v10;  // [bp-0x58], Other Possible Types: unsigned int, unsigned long
    unsigned long v11;  // [bp-0x50], Other Possible Types: unsigned int
    long long v12;  // [bp-0x48], Other Possible Types: unsigned long
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = a0->field_8;
    *(char *)a0->field_0 = 1;
    v16 = a0;
    if (!(*v15 & 1) && (v16 = sub_c5d284(&v2, a1), v2 != 3))
    {
        if (v2 == 2)
        {
            v16 = sub_be8f00(&v10, v8, v9);
            if (!(v10 & 1))
            {
                v17 = v11;
                v18 = v12;
                goto LABEL_c5d1a8;
            }
        }
        else
        {
            v17 = v6;
            if (v17)
            {
                v18 = v7;
LABEL_c5d1a8:
                v16 = sub_c5d358("__rust_end_short_backtrace", 26, v17, v18);
                v19 = a0->field_10;
                if (v16 & 0x1)
                {
                    *v19 = 1;
                    return v16;
                }
                if (*v19 & 1)
                {
                    v16 = sub_c5d358("__rust_begin_short_backtrace", 28, v17, v18);
                    if ((unsigned int)v16)
                    {
                        *v19 = 0;
                        return v16;
                    }
                    if (!(*v19 & 1))
                        goto LABEL_c5d25c;
                }
                else
                {
LABEL_c5d25c:
                    *(long long *)a0->field_18 = *(long long *)a0->field_18 + 1;
                }
            }
        }
    }
    if (!(*(char *)a0->field_10 & 1))
        return v16;
    v20 = a0->field_18;
    v21 = *v20;
    if (v21)
    {
        if (!(*(char *)a0->field_20 & 1))
        {
            v22 = (unsigned int)"s";
            if (v21 == 1)
                v22 = 1;
            v10 = v22;
            v11 = v21 != 1;
            v2 = (unsigned int)v20;
            v3 = &g_bef1c8;
            v4 = &v10;
            v5 = &g_be766c;
            sub_be769c();
        }
        *(char *)a0->field_20 = 0;
        *v20 = 0;
    }
    v0 = a0->field_28;
    v1 = 0;
    v23 = a0->field_38->field_8;
    if (!(a0->field_38->field_0 & 1))
        v23 = __Unwind_GetIP(a0->field_38->field_8);
    sub_c5d284(&v2, a1);
    if (*(int *)&a1->padding_0[0] == 3 || *(int *)&a1->padding_0[0] == 2)
    {
        v10 = 2;
    }
    else
    {
        if (*(long long *)&a1->padding_0[16])
        {
            v24 = 0;
            v11 = *(long long *)&a1->padding_0[16];
            v12 = a1->field_18;
        }
        else
        {
            v24 = 2;
        }
        v10 = v24;
    }
    v25 = sub_c44d00(&v0, v23, &v2, &v10);
    *(char *)a0->field_30 = (char)v25;
    v0->field_18 = v0->field_18 + 1;
    return v25;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcb70..0xcd98 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cb70_2 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
} st_cb70_2;

typedef struct st_cb70_1 {
    struct st_cb70_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_cb70_1;

typedef struct st_cb70_3 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    char padding_14[4];
    unsigned long long field_18;
} st_cb70_3;

typedef struct st_cb70_4 {
    struct st_cb70_0 *field_0;
} st_cb70_4;

typedef struct st_cb70_0 {
    char field_0;
} st_cb70_0;


st_cb70_1 * sub_cb70(st_cb70_1 *a0)
{
    unsigned long v4;  // x12
    unsigned long v5;  // x9
    unsigned long v14;  // x2
    unsigned int v15;  // w2
    unsigned int v16;  // w16
    unsigned long v17;  // x17
    unsigned int v18;  // w13
    st_cb70_2 *v19;  // x8
    unsigned long v20;  // x12
    st_cb70_2 *v21;  // x8
    st_cb70_3 *v22;  // x8
    unsigned long v6;  // x11
    unsigned long long v7;  // x10
    unsigned long v8;  // x13
    unsigned int v9;  // w14
    unsigned long long v10;  // w14
    unsigned int v11;  // w17
    unsigned long long v12;  // x15
    unsigned int v13;  // w1
    st_cb70_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_cb70_0 *v1;  // [bp-0x18]
    st_cb70_0 **v2;  // [bp-0x10], Other Possible Types: st_cb70_4 **, char
    st_cb70_0 *v3;  // [bp-0x8], Other Possible Types: st_cb70_4 **

    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_10;
    v5 = a0->field_14;
    v6 = a0->field_18;
    v7 = v5 | (v4 - v6) * 0x100000000;
    v3 = &v2;
    v2 = &v3;
    v8 = a0->field_8;
    if (v8 > v4)
    {
        v9 = *(char *)&a0->field_0[v4];
        if (*(char *)&a0->field_0[v4] >= 0)
        {
            v10 = v9 & 127;
        }
        else
        {
            v11 = v9 & 224;
            if (v11 == 192)
            {
                v12 = 0;
                v13 = 31;
            }
            else if ((v9 >> 4 & 15) == 14)
            {
                v12 = 1;
                v13 = 15;
            }
            else if ((v9 >> 3 & 31) == 30)
            {
                v12 = 0;
                v13 = 7;
            }
            else
            {
                v20 = (unsigned int)v4 + 1;
                a0->field_10 = v20;
                v21->field_0 = 288;
                *(unsigned long long *)&(&v21->field_0)[1] = v7;
                *(unsigned long long *)((char *)&v21->field_4 + 4) = v5 | (v20 - v6) * 0x100000000;
                *(unsigned int *)((char *)&v21->field_c + 4) = 0;
                *(unsigned long long *)&v21[1].field_0 = 0;
                return a0;
            }
            v14 = (unsigned int)v4 + 1;
            a0->field_10 = v14;
            v3 = &v2;
            v2 = &v3;
            if (v8 > v14 && (*(char *)&a0->field_0[v14] & 192) == 128)
            {
                v2 = &v3;
                v3 = &v2;
                v15 = *(char *)&a0->field_0[v14];
                v14 = (unsigned int)v4 + 2;
                a0->field_10 = v14;
                v10 = v15 & 63 | (v9 & v13) * 64;
                if (v11 == 192)
                {
                    v22->field_0 = 288;
                    *(unsigned long long *)&(&v22->field_0)[1] = v7;
                    *(unsigned long long *)((char *)&v22->field_4 + 4) = v5 | (v14 - v6) * 0x100000000;
                    *(unsigned long long *)v22->padding_14 = 0;
                    *(unsigned int *)((char *)&v22->field_c + 4) = 0;
                    *(unsigned int *)v22->padding_14 = v10;
                    return a0;
                }
                v2 = &v3;
                v3 = &v2;
                if (v8 > v14 && (*(char *)&a0->field_0[v14] & 192) == 128)
                {
                    v2 = &v3;
                    v3 = &v2;
                    v16 = *(char *)&a0->field_0[v14];
                    v17 = (unsigned int)v4 + 3;
                    a0->field_10 = v17;
                    v10 = v16 & 63 | v10 * 64;
                    if (v12 & 1)
                    {
                        v22->field_0 = 288;
                        *(unsigned long long *)&(&v22->field_0)[1] = v7;
                        *(unsigned long long *)((char *)&v22->field_4 + 4) = v5 | (v17 - v6) * 0x100000000;
                        *(unsigned long long *)v22->padding_14 = 0;
                        *(unsigned int *)((char *)&v22->field_c + 4) = 0;
                        *(unsigned int *)v22->padding_14 = v10;
                        return a0;
                    }
                    v2 = &v3;
                    v3 = &v2;
                    if (v8 > v17)
                    {
                        v14 = v17;
                        if ((*(char *)&a0->field_0[v17] & 192) == 128)
                        {
                            v3 = &v2;
                            v2 = &v3;
                            v18 = *(char *)&a0->field_0[v17];
                            v14 = (unsigned int)v4 + 4;
                            a0->field_10 = v14;
                            v22->field_0 = 288;
                            *(unsigned long long *)&(&v22->field_0)[1] = v7;
                            *(unsigned long long *)((char *)&v22->field_4 + 4) = v5 | (v14 - v6) * 0x100000000;
                            *(unsigned long long *)v22->padding_14 = 0;
                            *(unsigned int *)((char *)&v22->field_c + 4) = 0;
                            *(unsigned int *)v22->padding_14 = v18 & 63 | v10 * 64;
                            return a0;
                        }
                    }
                    else
                    {
                        v14 = v17;
                    }
                }
            }
            v19->field_0 = 288;
            *(unsigned long long *)&(&v19->field_0)[1] = v7;
            *(unsigned long long *)((char *)&v19->field_4 + 4) = v5 | (v14 - v6) * 0x100000000;
            *(unsigned int *)((char *)&v19->field_c + 4) = 0;
            *(unsigned long long *)&v19[1].field_0 = 0;
            return a0;
        }
    }
    else
    {
        v10 = 0;
    }
    v14 = (unsigned int)v4 + 1;
    a0->field_10 = v14;
    v22->field_0 = 288;
    *(unsigned long long *)&(&v22->field_0)[1] = v7;
    *(unsigned long long *)((char *)&v22->field_4 + 4) = v5 | (v14 - v6) * 0x100000000;
    *(unsigned long long *)v22->padding_14 = 0;
    *(unsigned int *)((char *)&v22->field_c + 4) = 0;
    *(unsigned int *)v22->padding_14 = v10;
    return a0;
}

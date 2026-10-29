/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4900..0x1f4bf4 (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f4900_5 {
    char padding_0[20];
    unsigned int field_14;
    unsigned long long field_18;
} st_1f4900_5;

typedef struct st_1f4900_1 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[24];
    unsigned int field_20;
} st_1f4900_1;

typedef struct st_1f4900_2 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[12];
    unsigned int field_14;
    unsigned long long field_18;
    unsigned long long field_20;
} st_1f4900_2;

typedef struct st_1f4900_3 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[12];
    unsigned int field_14;
    unsigned long long field_18;
    unsigned long long field_20;
} st_1f4900_3;

typedef struct st_1f4900_4 {
    char padding_0[4];
    unsigned int field_4;
} st_1f4900_4;

typedef struct st_1f4900_0 {
    char field_0;
} st_1f4900_0;

extern unsigned long long g_e78b38;
extern unsigned long long g_e78b60;

long long sub_1f4900(st_1f4900_1 **a0)
{
    unsigned int v12;  // x25
    unsigned long long *v13;  // x21
    st_1f4900_4 *v22;  // x8
    st_1f4900_3 *v23;  // x9
    unsigned long long v24;  // x11
    st_1f4900_5 *v26;  // x10
    unsigned long long v28;  // x10
    st_1f4900_5 *v29;  // x11
    unsigned int v14;  // x20
    unsigned long long v15;  // x23
    unsigned long long v16;  // x27
    st_1f4900_2 *v17;  // x21
    unsigned int v18;  // x28
    unsigned int v19;  // x22
    unsigned int v20;  // w0
    st_1f4900_1 *v21;  // x10
    unsigned int v0;  // [bp-0xac]
    st_1f4900_5 *v1;  // [bp-0xa8]
    st_1f4900_0 **v2;  // [bp-0xa0], Other Possible Types: char
    st_1f4900_0 *v3;  // [bp-0x98]
    unsigned int v4;  // [bp-0x90]
    unsigned int v5;  // [bp-0x88]
    unsigned int v6;  // [bp-0x80]
    unsigned int v7;  // [bp-0x78]
    unsigned int v8;  // [bp-0x70]
    unsigned int v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v3 = &v2;
    v4 = 0;
    v2 = &v3;
    v7 = 0;
    v8 = 0;
    v9 = 0;
    v5 = 0;
    v6 = 0;
    if (a0[1] >= 2)
    {
        v0 = 0;
        v12 = 1;
        do
        {
            v13 = (char *)*a0 + 40 * v12;
            if (sub_1ef140(v13))
            {
                v14 = sub_1f87a8(a0, &v7, v13[3] + v12);
                if (v14)
                {
                    v1 = (char *)*a0 + 40 * v14;
                    v15 = v13[4] + v12;
                    v16 = v12;
                    v17 = (char *)*a0 + 40 * v15;
                    if (sub_1ef140(v17))
                        v18 = v17->field_20 + v15;
                    else
                        v18 = 0;
                    v19 = sub_1f87a8(a0, &v4);
                    if (v19)
                    {
                        v20 = sub_1f7418(&v7, &v4);
                        if (v20 != 1)
                        {
                            if (!v20)
                            {
                                v21 = *a0;
                                v22 = (char *)v21 + 40 * v16;
                                v23 = (char *)v21 + 40 * v19;
                                v24 = v1->field_18 + v14;
                                v23->field_0 = 3;
                                if (v18)
                                {
                                    v23->field_4 = 50;
                                    v17->field_18 = v24 - v15;
                                    v17->field_20 = v19 - v15;
                                    v26 = v1;
                                    v26->field_18 = v15 - v14;
                                    v26->field_14 = v26->field_14 | 4;
                                    v17->field_14 = v17->field_14 | 8;
                                    v0 = 1;
                                    *(unsigned long long *)&v22[4] = v18 - v16;
                                    goto *((void *)(g_e78b38));
                                }
                                else
                                {
                                    v23->field_4 = 124;
                                    v28 = v23->field_18;
                                    v23->field_18 = v24 - v19;
                                    v23->field_20 = v28;
                                    v29 = v1;
                                    v29->field_18 = v19 - v14;
                                    v29->field_14 = v29->field_14 | 4;
                                    v23->field_14 = v23->field_14 | 8;
                                    v0 = 1;
                                    *(unsigned long long *)&v22[4] = 0;
                                    v22->field_4 = 50;
                                }
                            }
                            else if (v18)
                            {
                                goto *((void *)(g_e78b38));
                            }
                        }
                    }
                    goto *((void *)(g_e78b60));
                }
            }
        } while ((v12 += 1, a0[1] > v12));
        if (v0 & 1)
            sub_1f84e0(a0, a0);
    }
    sub_1eccac(&v4);
    return sub_1eccac(&v7);
}

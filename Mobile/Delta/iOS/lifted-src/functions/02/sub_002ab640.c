/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ab640..0x2ab824 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ab640_1 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2ab640_1;

typedef struct st_2ab640_3 {
    unsigned long long field_0;
} st_2ab640_3;

typedef struct st_2ab640_2 {
    struct st_2ab640_1 *field_0;
    void* field_8;
    void* field_10;
    char padding_18[8];
    struct st_2ab640_3 *field_20;
    unsigned long long field_28;
    char padding_30[8];
    struct st_2ab640_3 *field_38;
    unsigned long long field_40;
    char padding_48[8];
    struct st_2ab640_1 *field_50;
} st_2ab640_2;

typedef struct st_2ab640_0 {
    char field_0;
} st_2ab640_0;


unsigned long long sub_2ab640(st_2ab640_2 *a0, char *a1, unsigned long a2)
{
    unsigned long v11;  // x8
    unsigned long v12;  // x1
    unsigned long v21;  // x1
    unsigned long v22;  // x10
    st_2ab640_1 *v13;  // x8
    unsigned long v14;  // x8
    unsigned long v15;  // x9
    st_2ab640_1 *v16;  // x8
    unsigned long v17;  // x1
    unsigned long v18;  // x10
    unsigned long long v19;  // x19
    st_2ab640_1 *v20;  // x8
    st_2ab640_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_2ab640_0 *v1;  // [bp-0x78]
    uint128_t v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    uint128_t v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58]
    uint128_t v6;  // [bp-0x48]
    char v7;  // [bp-0x35]
    unsigned int v8;  // [bp-0x34]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v11 = a0->field_28 - 1;
    if (!((unsigned long long)(*(long long *)((char *)a0->field_20 + (v11 >> 3 & 0x1ffffffffffffff8))) >> ((char)v11 & 63) & 1))
        return 0;
    v12 = *a1;
    *(char *)&v6 = v12;
    sub_2ae53c((char *)&v6 + 8, v12);
    if (a2 & 1 || !(v8 = a0->field_10 - a0->field_8 >> 3, v7 = 5, !(sub_1b2e04(&a0[1].field_8, &v8, &v7, &v6) & 1)))
    {
        if (a0->field_8 != a0->field_10)
        {
            v13 = *(long long *)((char *)a0->field_10 - 8);
            if (!v13)
                goto LABEL_2ab7d4;
            if (v13->field_0 == 2)
            {
                sub_2ab0f8(v13->field_8, &v6);
            }
            else
            {
                v14 = a0->field_40 - 1;
                v15 = *(long long *)((char *)a0->field_38 + (v14 >> 3 & 0x1ffffffffffffff8));
                a0->field_40 = v14;
                if (!(v15 >> ((char)v14 & 63) & 1))
                    goto LABEL_2ab7d4;
                v2 = v6;
                *(char *)&v6 = 0;
                *(unsigned long long *)((char *)&v6 + 8) = 0;
                v16 = a0->field_50;
                v17 = v16->field_0;
                v16->field_0 = *(char *)&v2;
                *(char *)&v2 = v17;
                v18 = v16->field_8;
                v16->field_8 = *(unsigned long long *)((void*)&v2 + 8);
                v3 = v18;
                sub_2a6e94(&v2 | 8, v17);
            }
        }
        else
        {
            v4 = v6;
            *(char *)&v6 = 0;
            *(unsigned long long *)((char *)&v6 + 8) = 0;
            v20 = a0->field_0;
            v21 = v20->field_0;
            v20->field_0 = *(char *)&v4;
            *(char *)&v4 = v21;
            v22 = v20->field_8;
            v20->field_8 = *(unsigned long long *)((void*)&v4 + 8);
            v5 = v22;
            sub_2a6e94(&v4 | 8, v21);
        }
        v19 = 1;
    }
    else
    {
LABEL_2ab7d4:
        v19 = 0;
    }
    sub_2a6e94((char *)&v6 + 8, *(char *)&v6);
    return v19;
}

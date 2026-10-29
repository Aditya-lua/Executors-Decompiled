/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2adbe0..0x2addc8 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2adbe0_1 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2adbe0_1;

typedef struct st_2adbe0_3 {
    unsigned long long field_0;
} st_2adbe0_3;

typedef struct st_2adbe0_2 {
    struct st_2adbe0_1 *field_0;
    void* field_8;
    void* field_10;
    char padding_18[8];
    struct st_2adbe0_3 *field_20;
    unsigned long long field_28;
    char padding_30[8];
    struct st_2adbe0_3 *field_38;
    unsigned long long field_40;
    char padding_48[8];
    struct st_2adbe0_1 *field_50;
} st_2adbe0_2;

typedef struct st_2adbe0_0 {
    char field_0;
} st_2adbe0_0;


unsigned long long sub_2adbe0(st_2adbe0_2 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v11;  // x8
    st_2adbe0_1 *v12;  // x8
    unsigned long v21;  // x10
    unsigned long v13;  // x8
    unsigned long v14;  // x9
    st_2adbe0_1 *v15;  // x8
    unsigned long v16;  // x1
    unsigned long v17;  // x10
    unsigned long long v18;  // x19
    st_2adbe0_1 *v19;  // x8
    unsigned long v20;  // x1
    st_2adbe0_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_2adbe0_0 *v1;  // [bp-0x68]
    uint128_t v2;  // [bp-0x60], Other Possible Types: uint128_t
    unsigned long v3;  // [bp-0x58]
    uint128_t v4;  // [bp-0x50], Other Possible Types: uint128_t
    unsigned long v5;  // [bp-0x48]
    uint128_t v6;  // [bp-0x38], Other Possible Types: char, uint128_t
    char v7;  // [bp-0x25]
    unsigned int v8;  // [bp-0x24]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v11 = a0->field_28 - 1;
    if (!((unsigned long long)(*(long long *)((char *)a0->field_20 + (v11 >> 3 & 0x1ffffffffffffff8))) >> ((char)v11 & 63) & 1))
        return 0;
    sub_2a9bcc(&v6);
    if (a2 & 1 || !(v8 = a0->field_10 - a0->field_8 >> 3, v7 = 5, !(sub_1b2e04(&a0[1].field_8, &v8, &v7, &v6) & 1)))
    {
        if (a0->field_8 != a0->field_10)
        {
            v12 = *(long long *)((char *)a0->field_10 - 8);
            if (!v12)
                goto LABEL_2add78;
            if (v12->field_0 == 2)
            {
                sub_2ab0f8(v12->field_8, &v6);
            }
            else
            {
                v13 = a0->field_40 - 1;
                v14 = *(long long *)((char *)a0->field_38 + (v13 >> 3 & 0x1ffffffffffffff8));
                a0->field_40 = v13;
                if (!(v14 >> ((char)v13 & 63) & 1))
                    goto LABEL_2add78;
                v2 = v6;
                *(char *)&v6 = 0;
                *(unsigned long long *)((char *)&v6 + 8) = 0;
                v15 = a0->field_50;
                v16 = v15->field_0;
                v15->field_0 = v2;
                *(char *)&v2 = v16;
                v17 = v15->field_8;
                v15->field_8 = *(unsigned long long *)((void*)&v2 + 8);
                v3 = v17;
                sub_2a6e94(&v2 | 8, v16);
            }
        }
        else
        {
            v4 = v6;
            *(char *)&v6 = 0;
            *(unsigned long long *)((char *)&v6 + 8) = 0;
            v19 = a0->field_0;
            v20 = v19->field_0;
            v19->field_0 = v4;
            *(char *)&v4 = v20;
            v21 = v19->field_8;
            v19->field_8 = *(unsigned long long *)((void*)&v4 + 8);
            v5 = v21;
            sub_2a6e94(&v4 | 8, v20);
        }
        v18 = 1;
    }
    else
    {
LABEL_2add78:
        v18 = 0;
    }
    sub_2a6e94((char *)&v6 + 8, (char)v6);
    return v18;
}

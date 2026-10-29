/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1beecc..0x1bef9c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1beecc_3 {
    struct st_1beecc_1 *field_0;
    char padding_8[72];
    char field_50;
    char padding_51[127];
    unsigned long long field_d0;
    char padding_d8[8];
    char field_e0;
} st_1beecc_3;

typedef struct st_1beecc_4 {
    struct st_1beecc_3 *field_0;
    struct st_1beecc_0 *field_8;
    struct st_1beecc_0 *field_10;
} st_1beecc_4;

typedef struct st_1beecc_1 {
    char padding_0[32];
    struct st_1beecc_2 *field_20;
} st_1beecc_1;

typedef struct st_1beecc_2 {
    unsigned long long field_0;
} st_1beecc_2;

typedef struct st_1beecc_0 {
    char field_0;
} st_1beecc_0;


long long sub_1beecc(st_1beecc_4 *a0)
{
    st_1beecc_3 *v4;  // x19
    unsigned long long v5;  // x8
    st_1beecc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1beecc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_0;
    std::__1::mutex::lock(&v4->field_50);
    v5 = v4->field_d0;
    v4->field_d0 = v5 - 1;
    if (v5 == 1)
    {
        *(unsigned long long *)v4->padding_d8 = 0;
        if (!(v4->field_e0 & 1))
        {
LABEL_1bef24:
            if (!(*(char *)a0->field_8 & 1) && *(char *)a0->field_10 & 1)
                return std::__1::mutex::unlock(&v4->field_50);
        }
    }
    else if (!(v4->field_e0 & 1))
    {
        goto LABEL_1bef24;
    }
    v4->field_0->field_20();
}

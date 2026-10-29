/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa86c..0x2aa9a0 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa86c_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_2aa86c_1;

typedef struct st_2aa86c_2 {
    char field_0;
    char padding_1[7];
    struct st_2aa86c_1 *field_8;
} st_2aa86c_2;

typedef struct st_2aa86c_3 {
    char padding_0[8];
    void* field_8;
    void* field_10;
    char padding_18[16];
    unsigned long long field_28;
} st_2aa86c_3;

typedef struct st_2aa86c_0 {
    char field_0;
} st_2aa86c_0;


int sub_2aa86c(st_2aa86c_3 *a0)
{
    st_2aa86c_2 *v8;  // x8
    char v9;  // x1
    st_2aa86c_1 *v10;  // x9
    st_2aa86c_2 *v11;  // x8
    st_2aa86c_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_2aa86c_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    st_2aa86c_1 *v3;  // [bp-0x30]
    char v4;  // [bp-0x25]
    unsigned int v5;  // [bp-0x24]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (*(long long *)((char *)a0->field_10 - 8))
    {
        v5 = (unsigned int)(a0->field_10 - a0->field_8 >> 3) - 1;
        v4 = 3;
        if (!(sub_1b2e04(a0 + 2, &v5, &v4) & 1))
        {
            sub_2aff80(&v2, &a0[2].field_28);
            v8 = *(long long *)((char *)a0->field_10 - 8);
            v9 = v8->field_0;
            v8->field_0 = v2;
            v2 = v9;
            v10 = v8->field_8;
            v8->field_8 = v3;
            v3 = v10;
            sub_2a6e94(&v3, v2);
            sub_c84c(&a0->field_8, a0->field_10 - 8);
            a0->field_28 = a0->field_28 - 1;
            if (a0->field_8 == a0->field_10)
                return 1;
            v11 = *(long long *)((char *)a0->field_10 - 8);
            if (v11->field_0 == 2)
            {
                sub_2a5850(v11->field_8, v11->field_8->field_8 - 16);
                return 1;
            }
            return 1;
        }
    }
    sub_c84c(&a0->field_8);
    a0->field_28 = a0->field_28 - 1;
    return 1;
}

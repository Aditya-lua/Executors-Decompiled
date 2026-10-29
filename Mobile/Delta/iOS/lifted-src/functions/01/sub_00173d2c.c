/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x173d2c..0x173f88 (604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_173d2c_0 {
    char padding_0[24];
    struct st_173d2c_1 *field_18;
} st_173d2c_0;

typedef struct st_173d2c_4 {
    struct st_173d2c_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
    char padding_10[8];
    struct st_173d2c_2 *field_18;
} st_173d2c_4;

typedef struct st_173d2c_3 {
    unsigned int field_0;
} st_173d2c_3;

typedef struct st_173d2c_2 {
    char padding_0[480];
    struct st_173d2c_3 *field_1e0;
    unsigned long long field_1e8;
    unsigned int field_1f0;
    unsigned int field_1f4;
} st_173d2c_2;

typedef struct st_173d2c_1 {
    unsigned long long field_0;
} st_173d2c_1;

typedef struct st_173d2c_7 {
    struct st_173d2c_8 *field_0;
} st_173d2c_7;

typedef struct st_173d2c_8 {
    struct st_173d2c_7 *field_0;
} st_173d2c_8;

typedef struct st_173d2c_6 {
    char field_0;
} st_173d2c_6;

typedef struct st_173d2c_5 {
    struct st_173d2c_4 *field_0;
    unsigned int field_8;
} st_173d2c_5;


int sub_173d2c(unsigned long a0)
{
    st_173d2c_4 *v8;  // x0
    st_173d2c_4 *v9;  // w23
    unsigned int v18;  // w11
    st_173d2c_2 *v10;  // x24
    unsigned long long v11;  // 4121
    st_173d2c_5 *v12;  // x8
    st_173d2c_4 *v13;  // x21
    char *v14;  // x0
    st_173d2c_4 *i;  // w8
    char *v16;  // x9
    unsigned int v17;  // w10
    st_173d2c_6 **v0;  // [bp-0x90], Other Possible Types: char
    st_173d2c_6 *v1;  // [bp-0x88]
    st_173d2c_6 **v2;  // [bp-0x80], Other Possible Types: char
    st_173d2c_6 *v3;  // [bp-0x78]
    st_173d2c_8 **v4;  // [bp-0x70]
    st_173d2c_8 **v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = sub_3c4464();
    if (v8)
    {
        v9 = (st_173d2c_4 *)0;
        v10 = (st_173d2c_2 *)v8->padding_10;
        v3 = &v2;
        v2 = &v3;
        do
        {
            v11 = arm64g_calculate_condition(1, *(int *)((char *)v10->field_1e0 + 0x4 * v9), 1, 0);
            if (v11 & 1 || !(v12 = v10->field_1e8 + (v10->field_1f0 & *(int *)((char *)v10->field_1e0 + 0x4 * v9)) * 16, v12->field_8 == 2))
                continue;
            v13 = v12->field_0;
            v14 = sub_a0c8(*(long long *)&v13->field_1);
            v4 = &v5;
            v5 = &v4;
            i = (st_173d2c_4 *)*v14;
            if (!i)
                continue;
            v16 = v14 + 1;
            v17 = 3760312;
            v18 = 23;
            do
            {
                v17 = (v17 ^ i) * v18;
                i = (st_173d2c_4 *)*v16;
                v16 += 1;
                v18 += 23;
            } while (i);
            if (v17 == 0xff397e84 && v13)
                v13->field_0->field_18();
        } while ((v9 = (char *)&v9->field_0 + 1, !(v9 >> ((char)v10->field_1f4 & 31))));
        v8 = 0;
    }
    return (unsigned int)v8;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dca0c..0x1dcad4 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dca0c_4 {
    char field_0;
    char padding_1[1];
    char field_2;
    char field_3;
    char padding_4[36];
    struct st_1dca0c_2 *field_28;
    char padding_30[16];
    struct st_1dca0c_2 *field_40;
    char padding_48[8];
    struct st_1dca0c_3 *field_50;
    char padding_58[32];
    unsigned long long field_78;
} st_1dca0c_4;

typedef struct st_1dca0c_5 {
    struct st_1dca0c_6 *field_0;
    struct st_1dca0c_6 *field_8;
} st_1dca0c_5;

typedef struct st_1dca0c_2 {
    char padding_0[8];
    struct st_1dca0c_1 *field_8;
} st_1dca0c_2;

typedef struct st_1dca0c_1 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1dca0c_1;

typedef struct st_1dca0c_3 {
    char padding_0[32];
    struct st_1dca0c_4 *field_20;
} st_1dca0c_3;

typedef struct st_1dca0c_6 {
    unsigned long long field_0;
} st_1dca0c_6;

typedef struct st_1dca0c_0 {
    char field_0;
} st_1dca0c_0;


unsigned long long sub_1dca0c(st_1dca0c_5 *a0, st_1dca0c_4 *a1)
{
    st_1dca0c_2 *iter;  // x8
    st_1dca0c_2 *v3;  // x10
    unsigned long long v4;  // x11
    st_1dca0c_1 *v5;  // x12
    unsigned long v6;  // x10
    st_1dca0c_3 *v7;  // x11
    st_1dca0c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1dca0c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1->field_0 != 10)
    {
        return 0;
    }
    else if (a1->field_3 == 1)
    {
        iter = a1->field_40;
        v3 = a1->field_28;
        if (iter == v3)
            return 0;
        v4 = 0;
        do
        {
            v5 = iter->field_8;
            if (v5->field_c == 8 && v5->field_0 == *(long long *)a0->field_0)
            {
                if (!(v4 & 1))
                {
                    v6 = a1->field_2;
                    if (v6 >> 2 & 1)
                    {
                        v7 = a1->field_50;
                        a1->field_2 = (char)v6 & 251;
                        a1->field_78 = v7->field_20;
                        v7->field_20 = a1;
                        v5 = iter->field_8;
                    }
                }
                v5->field_0 = *(long long *)a0->field_8;
                v5->field_c = 8;
                v3 = a1->field_28;
                v4 = 1;
            }
        } while ((iter = (char *)iter - 48, iter != v3));
        return 0;
    }
    else
    {
        return 0;
    }
}

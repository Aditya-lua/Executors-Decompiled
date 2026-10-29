/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5474c..0x547dc (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5474c_5 {
    char padding_0[8];
    unsigned long long field_8;
} st_5474c_5;

typedef struct st_5474c_4 {
    char padding_0[40];
    struct st_5474c_3 *field_28;
} st_5474c_4;

typedef struct st_5474c_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_5474c_2 *field_20;
    struct st_5474c_1 *field_28;
} st_5474c_1;

typedef struct st_5474c_2 {
    unsigned long long field_0;
} st_5474c_2;

typedef struct st_5474c_3 {
    char padding_0[104];
    struct st_5474c_1 *field_68;
} st_5474c_3;

typedef struct st_5474c_0 {
    char field_0;
} st_5474c_0;

extern unsigned int g_f00e40;

int sub_5474c(long long a0, st_5474c_4 *a1)
{
    st_5474c_1 *v4;  // x8
    st_5474c_5 *v5;  // x0
    st_5474c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_5474c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_28->field_68;
    if (!v4)
    {
        return 1;
    }
    else if (v4->field_8 != g_f00e40)
    {
        return 1;
    }
    else if (v4->field_28)
    {
        sub_54a20(a0 + 232, &a1->padding_0[32]);
        v5 = sub_12484(a0 + 232, &a1->padding_0[32]);
        v5->field_8 = *(long long *)v4->field_20;
        return 1;
    }
    else
    {
        return 1;
    }
}

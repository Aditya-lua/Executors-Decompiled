/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51400..0x514bc (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_51400_3 {
    char padding_0[40];
    struct st_51400_3 *field_28;
} st_51400_3;

typedef struct st_51400_0 {
    char padding_0[32];
    long long field_20;
    unsigned long long field_28;
    struct st_51400_1 *field_30;
    unsigned long long field_38;
} st_51400_0;

typedef struct st_51400_1 {
    long long field_0;
} st_51400_1;

typedef struct st_51400_2 {
    char field_0;
} st_51400_2;


int sub_51400(long long a0, st_51400_0 *a1)
{
    st_51400_3 *v4;  // x0
    st_51400_2 **v0;  // [bp-0x40], Other Possible Types: char
    st_51400_2 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_28 != 1)
    {
        return 1;
    }
    else if (a1->field_38 == 1)
    {
        v4 = sub_5184c(*(long long *)a1->field_30);
        if (!v4)
        {
            return 1;
        }
        else if (v4->field_28)
        {
            return 1;
        }
        else
        {
            sub_51260(a0 + 16, a1->field_20);
            *(st_51400_3 **)(sub_12484(a0 + 16, a1->field_20) + 8) = v4;
            return 1;
        }
    }
    else
    {
        return 1;
    }
}

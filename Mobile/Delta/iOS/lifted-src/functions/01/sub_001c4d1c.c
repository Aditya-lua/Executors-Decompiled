/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c4d1c..0x1c4da4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c4d1c_2 {
    struct st_1c4d1c_1 *field_0;
    struct st_1c4d1c_0 *field_8;
    struct st_1c4d1c_3 *field_10;
} st_1c4d1c_2;

typedef struct st_1c4d1c_3 {
    unsigned int field_0;
} st_1c4d1c_3;

typedef struct st_1c4d1c_1 {
    char padding_0[568];
    unsigned long long field_238;
} st_1c4d1c_1;

typedef struct st_1c4d1c_0 {
    char field_0;
} st_1c4d1c_0;


unsigned long long sub_1c4d1c(st_1c4d1c_2 *a0, unsigned long a1, unsigned long a2)
{
    st_1c4d1c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1c4d1c_0 *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x30]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_0->field_238)
    {
        return 1;
    }
    else if (!(*(char *)a0->field_8 & 1))
    {
        v2 = a2;
        v3 = a1;
        if (!(sub_664e4(&a0->field_0->padding_0[544], &v3, &v2) & 1))
        {
            *(unsigned int *)a0->field_10 = 7;
            return 0;
        }
        return 1;
    }
    else
    {
        return 1;
    }
}

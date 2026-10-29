/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dd82c..0x1dd8ec (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dd82c_2 {
    char padding_0[8];
    struct st_1dd82c_1 *field_8;
} st_1dd82c_2;

typedef struct st_1dd82c_1 {
    struct st_1dd82c_1 *field_0;
    char field_3;
    char padding_4[8];
    unsigned int field_c;
    char padding_10[24];
    unsigned long long field_28;
} st_1dd82c_1;

typedef struct st_1dd82c_3 {
    char padding_0[3];
    char field_3;
    char padding_4[36];
    struct st_1dd82c_2 *field_28;
    char padding_30[16];
    struct st_1dd82c_2 *field_40;
} st_1dd82c_3;

typedef struct st_1dd82c_0 {
    char field_0;
} st_1dd82c_0;


st_1dd82c_1 * sub_1dd82c(st_1dd82c_3 **a0)
{
    st_1dd82c_1 *v4;  // x0
    st_1dd82c_3 *v5;  // x8
    st_1dd82c_1 *v6;  // x8
    st_1dd82c_1 *v7;  // x8
    st_1dd82c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1dd82c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1e54a0();
    if (!(unsigned int)v4)
        return v4;
    v5 = *a0;
    if (v5->field_3 != 1)
    {
        return 0;
    }
    else if (v5->field_40 > v5->field_28)
    {
        v6 = v5->field_40->field_8;
        if (!v6)
        {
            return 0;
        }
        else if (*(int *)&v6->padding_4[3] == 8)
        {
            v7 = v6->field_0;
            if (!v7)
            {
                return 0;
            }
            else if (*((char *)&v7->field_0 + 3) == 1)
            {
                return *(long long *)&v7->padding_10[16] == 1972448;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
}

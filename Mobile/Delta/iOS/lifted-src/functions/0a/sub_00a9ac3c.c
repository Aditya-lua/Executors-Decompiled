/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9ac3c..0xa9ace4 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9ac3c_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a9ac3c_0 *field_8;
} st_a9ac3c_1;

typedef struct st_a9ac3c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
    int field_14;
} st_a9ac3c_0;


unsigned long long sub_a9ac3c(st_a9ac3c_1 *a0, st_a9ac3c_1 *a1)
{
    unsigned long v0;  // x10
    unsigned long v1;  // x9
    unsigned long long v2;  // x0
    st_a9ac3c_0 *v3;  // x9
    st_a9ac3c_0 *v4;  // x8
    unsigned long v5;  // x2
    unsigned long v6;  // x10

    v0 = a0->field_0;
    v1 = a1->field_0;
    v2 = v0 - v1;
    if ((unsigned int)v0 != (unsigned int)v1)
        return v2;
    v3 = a0->field_8;
    v4 = a1->field_8;
    if (1 >= (int)v0)
    {
        if (!(unsigned int)v0)
        {
            v5 = v3->field_14;
            v6 = v4->field_14;
            if ((unsigned int)v5 != (unsigned int)v6)
                return v5 - v6;
        }
        else if ((unsigned int)v0 != 1)
        {
            return v2;
        }
        else if (!v3->field_0)
        {
            return 0xffffffff;
        }
        else if (!v4->field_0)
        {
            return 1;
        }
    }
    else
    {
        if ((unsigned int)v0 != 2)
        {
            if ((unsigned int)v0 != 3)
                return v2;
            return v3->field_10 - v4->field_10;
        }
        else
        {
            if (!v3->field_8)
            {
                return 0xffffffff;
            }
            else if (!v4->field_8)
            {
                return 1;
            }
        }
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7ff6c..0xa80000 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7ff6c_2 {
    char padding_0[8];
    struct st_a7ff6c_0 *field_8;
} st_a7ff6c_2;

typedef struct st_a7ff6c_1 {
    char padding_0[8];
    struct st_a7ff6c_0 *field_8;
    char padding_10[144];
    long long field_a0;
} st_a7ff6c_1;

typedef struct st_a7ff6c_0 {
    char padding_0[72];
    long long field_48;
} st_a7ff6c_0;


unsigned int sub_a7ff6c(st_a7ff6c_1 *a0, st_a7ff6c_2 *a1, unsigned long long a2)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0->field_8 != a1->field_8)
    {
        return 0;
    }
    else if ((unsigned int)a2 & 3)
    {
        v0 = &v2;
        v1 = v3;
        if (a2 >> 1 & 1 && a0->field_a0 && a1[10].padding_0)
        {
            if (_memcmp(a0->field_a0, a1[10].padding_0, a0->field_8->field_48))
                return 0;
        }
        else
        {
            if (!(a2 & 1))
            {
                return 0;
            }
            else if (!a0[1].padding_0)
            {
                return a0[1].padding_0;
            }
            else if (!a1[10].field_8)
            {
                return 0;
            }
            else if (sub_a66f20())
            {
                return 0;
            }
        }
        return 1;
    }
    else
    {
        return 1;
    }
}

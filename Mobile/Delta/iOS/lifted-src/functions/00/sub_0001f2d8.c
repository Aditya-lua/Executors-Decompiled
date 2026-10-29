/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f2d8..0x1f3d4 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f2d8_4 {
    char padding_0[41];
    char field_29;
} st_1f2d8_4;

typedef struct st_1f2d8_1 {
    unsigned long long field_0;
    char field_8;
    char padding_9[40];
    char field_31;
} st_1f2d8_1;

typedef struct st_1f2d8_2 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_1f2d8_3 *field_20;
    char padding_28[25];
    char field_41;
} st_1f2d8_2;

typedef struct st_1f2d8_3 {
    struct st_1f2d8_1 *field_0;
} st_1f2d8_3;

typedef struct st_1f2d8_0 {
    char field_0;
} st_1f2d8_0;

extern unsigned int g_f00ca0;

st_1f2d8_2 * sub_1f2d8(long long *a0, st_1f2d8_2 *a1, long long a2)
{
    long long v5;  // x22
    st_1f2d8_1 **iter;  // x26
    unsigned long long v7;  // x27
    unsigned long long v8;  // x27
    st_1f2d8_1 *v9;  // x24
    st_1f2d8_4 *v10;  // x24
    unsigned long v0;  // [bp-0x80]
    st_1f2d8_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_1f2d8_0 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    if (!a1)
    {
        return a1;
    }
    else if (a1->field_8 == g_f00ca0)
    {
        v5 = a0[1];
        a1->field_41 = 1;
        if (*(long long *)&a1->padding_28[0])
        {
            iter = a1->field_20;
            v7 = *(long long *)&a1->padding_28[0] * 8;
            while (1)
            {
                v8 = v7;
                v9 = *iter;
                v10 = &v9->field_8;
                if (!(sub_24a68(*a0, v9->field_0, v10) & 1))
                {
                    v0 = v9->field_0;
                    sub_1db64(v5, v10, "Duplicate exported identifier '%s'");
                    iter += 1;
                    v7 = v8 - 8;
                    if (v8 == 8)
                        break;
                }
                else
                {
                    v9->field_31 = 1;
                    iter += 1;
                    v7 = v8 - 8;
                    if (v8 == 8)
                        break;
                }
            }
        }
        sub_1f158(&a1[1].padding_0[2], a2);
        return a1;
    }
    else
    {
        return a1;
    }
}

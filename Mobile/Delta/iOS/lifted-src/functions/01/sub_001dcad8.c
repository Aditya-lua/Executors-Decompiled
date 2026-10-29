/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dcad8..0x1dcb78 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dcad8_0 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
    unsigned long long field_24;
    char padding_2c[4];
    unsigned long long field_30;
} st_1dcad8_0;

typedef struct st_1dcad8_1 {
    char field_0;
} st_1dcad8_1;

typedef struct st_1dcad8_3 {
    unsigned long long field_0;
} st_1dcad8_3;

typedef struct st_1dcad8_2 {
    char padding_0[288];
    struct st_1dcad8_3 *field_120;
} st_1dcad8_2;

extern st_1dcad8_2 *g_f0d3d8;

unsigned long long sub_1dcad8(st_1dcad8_0 *a0)
{
    unsigned long long v4;  // x0
    st_1dcad8_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_1dcad8_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_0;
    if (!v4)
    {
        return v4;
    }
    else if (*(int *)((char *)&a0->field_20 + 4) >= 1)
    {
        g_f0d3d8->field_120();
    }
    else if ((int)a0->field_20 >= 1)
    {
        g_f0d3d8->field_120();
    }
    else if (a0->padding_2c >= 1)
    {
        g_f0d3d8->field_120();
    }
    else
    {
        a0->field_20 = 0;
        *(unsigned int *)a0->padding_2c = 0;
        return v4;
    }
}

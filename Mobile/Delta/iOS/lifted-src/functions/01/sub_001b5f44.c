/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b5f44..0x1b6010 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b5f44_3 {
    struct st_1b5f44_0 *field_0;
    unsigned long long field_8;
    long long field_10;
} st_1b5f44_3;

typedef struct st_1b5f44_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[24];
    unsigned int field_28;
} st_1b5f44_2;

typedef struct st_1b5f44_1 {
    unsigned int field_0;
    char padding_4[12];
    struct st_1b5f44_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[40];
    unsigned long long field_50;
} st_1b5f44_1;

typedef struct st_1b5f44_0 {
    char field_0;
} st_1b5f44_0;

extern unsigned long long g_e71240;
extern unsigned long long g_e71290;

st_1b5f44_2 * sub_1b5f44(st_1b5f44_2 *a0, st_1b5f44_1 *a1)
{
    st_1b5f44_3 *v2;  // x8
    char *v3;  // x10
    long long v4;  // x8
    char *v5;  // x9
    unsigned long long v6;  // x8
    long long v8;  // x12
    char *v9;  // x13
    long long v10;  // x12
    st_1b5f44_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1b5f44_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a1->field_20 + (a0->field_28 - 1) * 24;
    if ((char)v2->field_10 != 1)
    {
        a1->field_0 = 0xfffffc1f;
        a1->field_50 = 0;
        return a0;
    }
    v3 = v2->field_0;
    v4 = v2->field_8 - (char *)v2->field_0;
    v5 = a1->field_10;
    if (v4 > a1->field_18 - v5)
    {
        v6 = 0;
        a1->field_0 = 0xfffffc1f;
    }
    else
    {
        if (v4 >= 1)
        {
            v8 = v4;
            v9 = v5;
            do
            {
                v10 = v8;
                if (*v3 != *v9)
                    goto *((void *)(g_e71290));
            } while ((v8 = v10 - 1, v3 += 1, v9 += 1, v10 != 1));
        }
        a1->field_0 = 0xfffffc1e;
        a1->field_10 = &v5[v4];
        v6 = a0->field_8;
    }
    a1->field_50 = v6;
    goto *((void *)(g_e71240));
}

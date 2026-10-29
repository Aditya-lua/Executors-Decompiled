/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12545c..0x125530 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12545c_1 {
    char padding_0[5];
    char field_5;
    char padding_6[114];
    struct st_12545c_2 *field_78;
    char padding_80[16];
    unsigned int field_90;
} st_12545c_1;

typedef struct st_12545c_5 {
    char padding_0[8];
    struct st_12545c_4 *field_8;
} st_12545c_5;

typedef struct st_12545c_4 {
    struct st_12545c_3 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_12545c_4;

typedef struct st_12545c_3 {
    char padding_0[3];
    unsigned int field_3;
    char field_5;
    char padding_6[18];
    struct st_12545c_1 *field_18;
} st_12545c_3;

typedef struct st_12545c_6 {
    char padding_0[32];
    struct st_12545c_5 *field_20;
    char padding_28[4];
    unsigned int field_2c;
} st_12545c_6;

typedef struct st_12545c_2 {
    unsigned long long field_0;
} st_12545c_2;

typedef struct st_12545c_0 {
    char field_0;
} st_12545c_0;

extern char g_c7c2eb;

long long sub_12545c(st_12545c_4 *a0, unsigned int a1, st_12545c_4 **a2)
{
    st_12545c_3 *v2;  // x10
    st_12545c_1 *v3;  // x9
    st_12545c_6 *v4;  // x11
    st_12545c_4 *v5;  // x10
    st_12545c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_12545c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0->field_c != 8)
        return 0;
    v2 = a0->field_0;
    if ((v2->padding_0)[1] == 1)
    {
        if ((int)a1 < 1)
        {
            return 0;
        }
        else if (*((char *)&v2->field_3 + 1) >= a1)
        {
            *a2 = &(&v2->field_18)[2 * a1];
            return &g_c7c2eb;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if ((int)a1 >= 1)
        {
            v3 = *(long long *)&v2->padding_6[15];
            if (a1 > v3->field_5)
                return 0;
            v4 = (char *)v2 + 16 * a1 - 16;
            v5 = &v4->field_20;
            if (v4->field_2c == 16)
                v5 = *(long long *)&v5->field_0->field_5;
            *a2 = v5;
            if ((int)a1 <= (int)v3->field_90)
                return *(long long *)((char *)&v3->field_78[a1].field_0 - 8) + 24;
            return &g_c7c2eb;
        }
        else
        {
            return 0;
        }
    }
}

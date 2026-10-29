/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x516d0..0x517f4 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_516d0_4 {
    char padding_0[8];
    long long field_8;
} st_516d0_4;

typedef struct st_516d0_2 {
    char padding_0[8];
    struct st_516d0_1 *field_8;
} st_516d0_2;

typedef struct st_516d0_3 {
    char padding_0[1];
    char field_1;
    char padding_2[6];
    struct st_516d0_3 *field_8;
    char padding_10[16];
    double field_20;
} st_516d0_3;

typedef struct st_516d0_1 {
    char padding_0[1];
    char field_1;
    char padding_2[6];
    struct st_516d0_1 *field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_516d0_1;

typedef struct st_516d0_0 {
    char field_0;
} st_516d0_0;

extern st_516d0_1 *g_f00b10;
extern st_516d0_1 *g_f00b40;

double sub_516d0(st_516d0_4 *a0, st_516d0_3 *a1, st_516d0_3 *a2)
{
    st_516d0_3 *v4;  // x0
    st_516d0_2 *v5;  // x0
    double v14;  // d0
    double v15;  // d0
    double v16;  // d0
    double v6;  // d0
    st_516d0_3 *v7;  // w8
    st_516d0_3 *v8;  // x21
    st_516d0_3 *v9;  // x0
    double v10;  // d0
    double v11;  // d0
    double v12;  // d0
    double v13;  // d0
    st_516d0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_516d0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1)
    {
        return v16;
    }
    else if ((int)a1->field_8 == (int)g_f00b40)
    {
        v4 = sub_158b8(a0 + 1, &a1->field_20);
        if (!v4)
            return v14;
        if (a2 && (int)a2->field_8 == (int)g_f00b10)
        {
            sub_40074(a0->field_8, &v4->field_8);
            v5 = sub_12484(a0->field_8, &v4->field_8);
            v6 = a2->field_20;
            v7 = (st_516d0_3 *)((int)v5->field_8 + 1);
            if (v6 != (double)(unsigned int)v7)
                return v6;
        }
        else if (!a2)
        {
            return v13;
        }
        else if ((int)a2->field_8 == (int)g_f00b40)
        {
            v8 = v4;
            v9 = sub_158b8(&a0[6].field_8, &a2->field_20);
            if (!v9)
                return v11;
            sub_40074(a0->field_8, &v8->field_8);
            v5 = sub_12484(a0->field_8, &v8->field_8);
            if ((int)v5->field_8)
                return v10;
            v7 = (st_516d0_3 *)(int)v9->field_8;
        }
        else
        {
            return v12;
        }
        *(unsigned int *)&v5->field_8 = (unsigned int)v7;
        return v6;
    }
    else
    {
        return v15;
    }
}

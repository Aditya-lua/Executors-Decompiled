/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ce150..0x3ce304 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ce150_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    struct st_3ce150_2 *field_c;
} st_3ce150_1;

typedef struct st_3ce150_3 {
    struct st_3ce150_1 *field_0;
    struct st_3ce150_2 *field_8;
    struct st_3ce150_2 *field_10;
    struct st_3ce150_2 *field_18;
    int field_20;
} st_3ce150_3;

typedef struct st_3ce150_2 {
    unsigned int field_0;
} st_3ce150_2;

typedef struct st_3ce150_0 {
    char field_0;
} st_3ce150_0;

typedef struct st_3ce150_4 {
    unsigned long long field_0;
} st_3ce150_4;

extern st_3ce150_4 *g_f0b120;

unsigned int * sub_3ce150(st_3ce150_3 *a0, unsigned int *a1, unsigned int *a2, unsigned int *a3, unsigned int *a4, int *a5)
{
    int v4;  // w8
    unsigned int *v5;  // x0
    st_3ce150_1 *v6;  // x9
    st_3ce150_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3ce150_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a4 >= 5)
        g_f0b120();
    if (sub_3d04d8())
    {
        v4 = a0->field_20;
        if (9 > v4)
        {
            *a5 = 8;
            v5 = a0->field_18;
            a0->field_18 = 0;
            v6 = a0->field_0;
            if (a4)
                goto LABEL_3ce234;
        }
        else
        {
            if (v4 != 16)
                g_f0b120();
            *a5 = 16;
            v5 = a0->field_18;
            a0->field_18 = 0;
            v6 = a0->field_0;
            if (a4)
            {
LABEL_3ce234:
                if ((&v6->field_8)[1] != a4)
                {
                    if (8 >= v4)
                        v5 = sub_3cf884();
                    else
                        v5 = sub_3cfd40();
                    v6 = a0->field_0;
                    (&v6->field_8)[1] = (unsigned int)a4;
                    if (!v5)
                        return NULL;
                }
            }
        }
        *a1 = v6->field_0;
        *a2 = v6->field_4;
        if (a3)
            *a3 = v6->field_8;
    }
    else
    {
        v5 = 0;
    }
    _free(a0->field_18);
    a0->field_18 = 0;
    _free(a0->field_10);
    a0->field_10 = 0;
    _free(a0->field_8);
    a0->field_8 = 0;
    return v5;
}

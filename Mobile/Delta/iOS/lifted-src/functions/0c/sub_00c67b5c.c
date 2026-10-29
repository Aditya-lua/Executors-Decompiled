/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc67b5c..0xc67c9c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c67b5c_0 {
    char padding_0[192];
    struct st_c67b5c_0 *field_c0;
} st_c67b5c_0;

typedef struct st_c67b5c_1 {
    unsigned int field_0;
    char padding_4[92];
    struct st_c67b5c_0 *field_60;
    long long field_68;
} st_c67b5c_1;

typedef struct st_c67b5c_2 {
    struct st_c67b5c_0 *field_0;
    char padding_8[88];
    struct st_c67b5c_0 *field_60;
    long long field_68;
} st_c67b5c_2;


unsigned long long sub_c67b5c(st_c67b5c_1 *a0, st_c67b5c_2 *a1, long long a2)
{
    unsigned long v4;  // x0
    st_c67b5c_0 *v5;  // x23
    long long v6;  // x21
    long long v7;  // x22
    st_c67b5c_0 *v8;  // x0
    st_c67b5c_0 *v9;  // x0
    st_c67b5c_0 *v0;  // [bp-0x50]
    st_c67b5c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a0->field_60)
    {
        if (!a1->field_60)
            return 0xfffffffe;
        v4 = a0->field_0;
        if ((unsigned int)v4 && !sub_a5c2d4(sub_a9976c(v4)))
            goto LABEL_c67c80;
    }
    if (!(int)a1->field_0 || a1->field_60 || sub_a5c2d4(sub_a9976c()))
    {
        v5 = a0->field_60;
        v6 = a0->field_68;
        v7 = a1->field_68;
        v0 = a1->field_60;
        v1 = v5;
        if (v0 && v0->field_c0 && !(v8 = sub_a5c2c8(a0), !v8))
        {
            v5 = v0;
            v1 = v5;
            v6 = v8;
        }
        else if (!v5)
        {
            return 0xfffffffe;
        }
        else if (v5->field_c0)
        {
            v9 = sub_a5c2c8(a1);
            v5 = v1;
            if (v9)
            {
                v0 = v5;
                v7 = v9;
            }
        }
        if (!v5)
        {
            return 0xfffffffe;
        }
        else if (v5 == v0)
        {
            return sub_a55bdc(v5, v6, v7, a2);
        }
        else
        {
            return 0xfffffffe;
        }
    }
LABEL_c67c80:
    return 0xffffffff;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f2420..0x1f2534 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f2420_1 {
    struct st_1f2420_2 *field_0;
    unsigned long long field_8;
    char padding_10[40];
    unsigned long long field_38;
    char padding_40[8];
    unsigned long long field_48;
    unsigned long long field_4c;
} st_1f2420_1;

typedef struct st_1f2420_0 {
    char field_0;
} st_1f2420_0;

typedef struct st_1f2420_2 {
    char padding_0[4];
    unsigned int field_4;
    unsigned int field_8;
} st_1f2420_2;


unsigned long long sub_1f2420(st_1f2420_1 *a0)
{
    unsigned int v4;  // w9
    unsigned long v5;  // x8
    unsigned int *v6;  // x10
    unsigned long v7;  // x12
    unsigned long v8;  // x11
    unsigned long long v9;  // x0
    st_1f2420_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1f2420_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(double *)&a0->field_48 = 2.12199579e-314;
    v4 = a0->field_8;
    if (v4 >= 3)
    {
        v5 = 0;
        v6 = &a0->field_0->field_8;
        v7 = 2;
        v8 = 0xfffffffe;
        do
        {
            if (*v6 != *(int *)((char *)v6 - 4))
            {
                if (v8 > v7)
                {
                    *(unsigned int *)&a0->field_48 = v7;
                    v8 = v7 & 0xffffffff;
                }
                if (v7 > v5)
                {
                    *(unsigned int *)((char *)&a0->field_48 + 4) = v7;
                    v5 = v7 & 0xffffffff;
                }
            }
        } while ((v6 += 1, v7 += 1, v4 != v7));
        if (a0->field_38)
        {
            if (v8 >= 2)
                *(unsigned int *)&a0->field_48 = 1;
            if (!v5)
                goto LABEL_1f24e8;
        }
    }
    else if (a0->field_38)
    {
        *(unsigned int *)&a0->field_48 = 1;
LABEL_1f24e8:
        *(unsigned int *)((char *)&a0->field_48 + 4) = 1;
    }
    v9 = sub_1eca80(a0);
    if ((unsigned int)v9)
    {
        *(unsigned int *)&a0->field_48 = 0;
        if (*(int *)((char *)&a0->field_48 + 4))
            return v9;
    }
    else if (*(int *)((char *)&a0->field_48 + 4))
    {
        return v9;
    }
    *(unsigned int *)&a0->field_48 = 0;
    return v9;
}

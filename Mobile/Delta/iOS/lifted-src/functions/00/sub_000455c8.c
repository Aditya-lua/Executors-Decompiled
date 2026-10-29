/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x455c8..0x457bc (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_455c8_4 {
    char padding_0[1532];
    unsigned int field_5fc;
} st_455c8_4;

typedef struct st_455c8_3 {
    long long field_0;
    char padding_8[1524];
    unsigned int field_5fc;
} st_455c8_3;

typedef struct st_455c8_1 {
    char padding_0[12];
    char field_c;
    char padding_d[19];
    struct st_455c8_2 *field_20;
    char field_28;
} st_455c8_1;

typedef struct st_455c8_2 {
    long long field_0;
} st_455c8_2;

typedef struct st_455c8_5 {
    struct st_455c8_6 *field_0;
} st_455c8_5;

typedef struct st_455c8_6 {
    struct st_455c8_5 *field_0;
} st_455c8_6;

typedef struct st_455c8_0 {
    char field_0;
} st_455c8_0;


unsigned long long sub_455c8(st_455c8_3 *a0, st_455c8_1 *a1)
{
    unsigned int v6;  // w23
    unsigned long long v7;  // x21
    long long v16;  // x0
    st_455c8_4 *v17;  // x19
    unsigned int v18;  // w23
    long long v19;  // x0
    unsigned int v20;  // w27
    long long v21;  // x0
    long long v22;  // x0
    long long v23;  // x0
    unsigned long long v8;  // x24
    unsigned long long v9;  // x8
    unsigned long long v10;  // x22
    unsigned long long v11;  // x26
    unsigned long long v12;  // x26
    unsigned int v13;  // w27
    char v14;  // x8
    unsigned long long v15;  // x0
    st_455c8_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_455c8_0 *v1;  // [bp-0x78]
    st_455c8_6 **v2;  // [bp-0x70]
    st_455c8_6 **v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (0xff > (unsigned long long)*(long long *)&a1->field_28)
    {
        v6 = a0->field_5fc;
        if (*(long long *)&a1->field_28)
        {
            v7 = sub_42480(a0, *(long long *)a1->field_20);
            if (v7 >> 31 & 1)
            {
                v7 = 0;
                if (*(long long *)&a1->field_28 && !(v7 = sub_3b87c(a0, a1), v9 = *(long long *)&a1->field_28, !v9))
                {
                    v10 = 0;
                    v11 = 0;
                    do
                    {
                        v12 = v11 + 1;
                        if (v12 == v9)
                        {
                            v10 = sub_46138(a0);
                        }
                        else
                        {
                            v2 = &v3;
                            v3 = &v2;
                            v13 = a0->field_5fc;
                            a0->field_5fc = ((unsigned int)v7 + (unsigned int)v11 & 0xff) + 1;
                            sub_47e48(a0);
                            a0->field_5fc = v13;
                        }
                    } while ((v9 = *(long long *)&a1->field_28, v11 = v12, (unsigned long long)*(long long *)&a1->field_28 > v11));
                    goto LABEL_4571c;
                }
            }
            else if ((unsigned long long)*(long long *)&a1->field_28 >= 2)
            {
                v8 = 1;
                while (((unsigned int)v7 & 0xff) + (unsigned int)v8 == sub_42480(a0, *(long long *)&a1->field_20[v8]))
                {
                    v8 += 1;
                    if (v8 >= (unsigned long long)*(long long *)&a1->field_28)
                        goto LABEL_45718;
                }
            }
        }
        else
        {
            v7 = 0;
        }
LABEL_45718:
        v10 = 0;
LABEL_4571c:
        sub_3b76c(a0, 0);
        if (v10 & 1)
        {
            v14 = 0;
            a0[1].padding_8[9] = 1;
        }
        else
        {
            v14 = a1->field_28 + 1;
        }
        v15 = sub_2ad10(a0->field_0, 22, (unsigned int)v7 & 0xff, v14, 0);
        a0->field_5fc = v6;
        return v15;
    }
    v16 = sub_45808(&a1->field_c, "Exceeded return count limit; simplify the code to compile");
    v17->field_5fc = v18;
    v19 = __Unwind_Resume(v16, "Exceeded return count limit; simplify the code to compile");
    v17->field_5fc = v20;
    v17->field_5fc = v18;
    v21 = __Unwind_Resume(v19);
    v17->field_5fc = v18;
    v22 = __Unwind_Resume(v21);
    v17->field_5fc = v18;
    v23 = __Unwind_Resume(v22);
    v17->field_5fc = v18;
    __Unwind_Resume(v23);
}

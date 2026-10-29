/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c2a28..0x1c2b8c (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c2a28_1 {
    long long field_0;
    long long field_1;
} st_1c2a28_1;

typedef struct st_1c2a28_2 {
    char padding_0[8];
    struct st_1c2a28_2 *field_8;
} st_1c2a28_2;

typedef struct st_1c2a28_0 {
    char field_0;
} st_1c2a28_0;


st_1c2a28_1 * sub_1c2a28(void* a0, st_1c2a28_1 *a1, st_1c2a28_1 *a2)
{
    st_1c2a28_1 *v6;  // x8
    unsigned int v7;  // w9
    st_1c2a28_1 *v8;  // x9
    st_1c2a28_2 *v9;  // x21
    st_1c2a28_1 *v10;  // x0
    st_1c2a28_1 *v11;  // x20
    long long v12;  // x0
    st_1c2a28_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1c2a28_0 *v1;  // [bp-0x58]
    st_1c2a28_0 **v2;  // [bp-0x50], Other Possible Types: char
    st_1c2a28_0 *v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
    {
        return a1;
    }
    else if ((char)a1->field_0 == 91)
    {
        v6 = (char *)&a1->field_0 + 1;
        if (v6 != a2)
        {
            v7 = *((char *)&a1->field_0 + 1);
            v8 = (char *)&a1->field_0 + 2;
            if (v7 == 94)
                v6 = v8;
            v3 = &v2;
            v2 = &v3;
            v9 = operatornew(176);
            sub_1aef6c(v9, a0, *(long long *)((long long)a0[56] + 8), v7 == 94, (int)a0[24] & 1, __ROL__((int)a0[24], 29) & 3758096385 & 1);
            *(st_1c2a28_2 **)((long long)a0[56] + 8) = v9;
            *(st_1c2a28_2 **)&a0[56] = v9;
            if (v6 != a2)
            {
                if ((short)a0[24] & 496 && (char)v6->field_0 == 93)
                {
                    sub_1af524(v9, 93);
                    v6 = (char *)&v6->field_0 + 1;
                }
                v10 = sub_1a6c18(a0, v6, a2, v9);
                if (v10 != a2)
                {
                    v11 = v10;
                    if ((char)v10->field_0 == 45)
                    {
                        sub_1af524(v9, 45);
                        v11 = (char *)&v11->field_0 + 1;
                    }
                    if (v11 != a2 && (char)v11->field_0 == 93)
                        return (char *)&v11->field_0 + 1;
                }
            }
        }
        v12 = sub_1a8238();
        operatordelete(v9);
        __Unwind_Resume(v12);
    }
    else
    {
        return a1;
    }
}

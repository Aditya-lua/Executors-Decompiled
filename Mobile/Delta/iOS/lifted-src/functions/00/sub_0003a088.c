/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a088..0x3a26c (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a088_3 {
    long long field_0;
    char padding_8[1524];
    unsigned int field_5fc;
} st_3a088_3;

typedef struct st_3a088_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[16];
    struct st_3a088_2 *field_38;
} st_3a088_1;

typedef struct st_3a088_2 {
    long long field_0;
} st_3a088_2;

typedef struct st_3a088_0 {
    char field_0;
} st_3a088_0;


unsigned long long sub_3a088(st_3a088_3 *a0, st_3a088_1 *a1, char a2, unsigned long long a3, unsigned long long a4, unsigned int a5, unsigned long long a6)
{
    unsigned int v6;  // w24
    long long v7;  // x27
    unsigned long long i;  // x23
    unsigned long long v17;  // x0
    long long v18;  // x0
    unsigned long long v8;  // x0
    char v9;  // x26
    unsigned long v10;  // x28
    unsigned int v11;  // w23
    long long v12;  // x0
    unsigned int v13;  // w8
    long long v14;  // x0
    unsigned long long v15;  // x0
    st_3a088_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_3a088_0 *v1;  // [bp-0x78]
    st_3a088_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_3a088_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a5;
    v1 = &v0;
    v0 = &v1;
    v7 = *(long long *)a1->field_38;
    v8 = sub_42480();
    if (!(v8 >> 31 & 1))
    {
        v9 = v8;
        v10 = (unsigned int)v8 & 0xff;
    }
    else
    {
        v9 = (char)a6 + 1;
        v3 = &v2;
        v2 = &v3;
        v10 = v9;
        v11 = a0->field_5fc;
        a0->field_5fc = (unsigned int)v10 + 1;
        sub_47e48(a0, v7, v10, 1);
        a0->field_5fc = v11;
    }
    v12 = sub_2bc4c(a0->field_0);
    sub_2ad10(a0->field_0, 73, 57, v9, 0);
    sub_47e48(a0, a1->field_20, a6, 1);
    v13 = (unsigned int)a6 + 1;
    if (v13 != (unsigned int)v10)
        sub_2ad10(a0->field_0, 6, v13 & 0xff, v9, 0);
    sub_2ad10(a0->field_0, 63, (unsigned int)a6 + 2 & 0xff, 0, 0);
    v14 = sub_2bc4c(a0->field_0);
    if (sub_290e4(a0->field_0, v12, v14) & 1)
    {
        v15 = sub_2ad10();
        if (a4 & 1)
        {
            return v15;
        }
        else if (a3)
        {
            i = 0;
            do
            {
                v17 = sub_2ad10(a0->field_0, 6, (unsigned int)i + a2 & 0xff, (unsigned int)i + (unsigned int)a6 & 0xff, 0);
                i += 1;
            } while (a3 != i);
            return v17;
        }
        else
        {
            return v15;
        }
    }
    v18 = sub_45808(a1->field_20 + 12, "Exceeded jump distance limit; simplify the code to compile");
    a0->field_5fc = a4;
    __Unwind_Resume(v18, "Exceeded jump distance limit; simplify the code to compile");
}

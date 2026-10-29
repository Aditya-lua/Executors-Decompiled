/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54e6c..0x54f88 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54e6c_1 {
    struct st_54e6c_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_54e6c_1;

typedef struct st_54e6c_2 {
    unsigned long long field_0;
} st_54e6c_2;

typedef struct st_54e6c_0 {
    char field_0;
} st_54e6c_0;

extern char g_10002b0;

unsigned long long sub_54e6c(st_54e6c_1 *a0)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // x20
    unsigned long long v9;  // x21
    unsigned long long *v10;  // x0
    unsigned long long *v11;  // x1
    unsigned long long *v12;  // x9
    unsigned long long v13;  // x0
    long long v14;  // x0
    st_54e6c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_54e6c_0 *v1;  // [bp-0x68]
    unsigned long long *v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_4451c();
    v7 = a0->field_8;
    if (v7)
    {
        v8 = 0;
        v9 = 0;
        do
        {
            if (*(long long *)((char *)a0->field_0 + v8) != a0->field_18)
            {
                v10 = sub_52ef4(&v2, (char *)a0->field_0 + v8);
                v11 = (char *)a0->field_0 + v8;
                *v10 = *v11;
                sub_5ccc(v10 + 1, v11 + 1);
                v7 = a0->field_8;
            }
        } while ((v9 += 1, v8 += 32, v7 > v9));
    }
    v12 = a0->field_0;
    a0->field_0 = v2;
    a0->field_8 = v3;
    v2 = v12;
    v3 = v7;
    v13 = sub_4259c(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v13;
    v14 = __Unwind_Resume(___stack_chk_fail());
    sub_4259c(&v2);
    __Unwind_Resume(v14);
}

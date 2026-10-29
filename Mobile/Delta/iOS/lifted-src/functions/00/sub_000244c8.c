/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x244c8..0x245d0 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_244c8_1 {
    struct st_244c8_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_244c8_1;

typedef struct st_244c8_2 {
    unsigned long long field_0;
} st_244c8_2;

typedef struct st_244c8_0 {
    char field_0;
} st_244c8_0;

extern char g_10002b0;

unsigned long long sub_244c8(st_244c8_1 *a0)
{
    unsigned long long *v7;  // x20
    unsigned long long v8;  // x9
    unsigned long long *v9;  // x8
    unsigned long long idx;  // x21
    unsigned long long *v11;  // x0
    unsigned long long v12;  // x0
    long long v13;  // x0
    st_244c8_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_244c8_0 *v1;  // [bp-0x68]
    unsigned long long *v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = &a0->field_8;
    sub_f6e8();
    v8 = *v7;
    v9 = a0->field_0;
    if (v8)
    {
        idx = 0;
        do
        {
            if (v9[idx] != v7[2])
            {
                v11 = sub_1ac2c(&v2);
                v9 = a0->field_0;
                v8 = a0->field_8;
                *v11 = v9[idx];
            }
        } while ((idx += 1, v8 > idx));
        v9 = a0->field_0;
    }
    a0->field_0 = v2;
    a0->field_8 = v3;
    v2 = v9;
    v3 = v8;
    v12 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v12;
    v13 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    __Unwind_Resume(v13);
}

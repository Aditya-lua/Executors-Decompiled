/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x34728..0x34844 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_34728_1 {
    struct st_34728_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_34728_1;

typedef struct st_34728_2 {
    unsigned long long field_0;
} st_34728_2;

typedef struct st_34728_0 {
    char field_0;
} st_34728_0;

typedef struct st_34728_3 {
    unsigned long long field_0;
    unsigned int field_8;
} st_34728_3;

extern char g_10002b0;

unsigned long long sub_34728(st_34728_1 *a0)
{
    unsigned long long *v7;  // x20
    unsigned long long v8;  // x9
    unsigned long long *v9;  // x8
    unsigned long long v10;  // x21
    unsigned long long v11;  // x22
    st_34728_3 *v12;  // x0
    st_34728_3 *v13;  // x10
    unsigned long long v14;  // x0
    long long v15;  // x0
    st_34728_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_34728_0 *v1;  // [bp-0x68]
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
    sub_37228();
    v8 = *v7;
    v9 = a0->field_0;
    if (v8)
    {
        v10 = 0;
        v11 = 0;
        do
        {
            if (*(long long *)((char *)v9 + v10) != v7[2])
            {
                v12 = sub_12484(&v2, (char *)v9 + v10);
                v9 = a0->field_0;
                v8 = a0->field_8;
                v13 = (char *)v9 + v10;
                v12->field_0 = v13->field_0;
                v12->field_8 = v13->field_8;
            }
        } while ((v11 += 1, v10 += 16, v8 > v11));
        v9 = a0->field_0;
    }
    a0->field_0 = v2;
    a0->field_8 = v3;
    v2 = v9;
    v3 = v8;
    v14 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v14;
    v15 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    __Unwind_Resume(v15);
}

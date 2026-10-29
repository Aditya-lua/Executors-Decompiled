/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bdc0..0x1bee0 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bdc0_3 {
    unsigned long long field_0;
    uint128_t field_8;
} st_1bdc0_3;

typedef struct st_1bdc0_1 {
    struct st_1bdc0_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_1bdc0_1;

typedef struct st_1bdc0_2 {
    unsigned long long field_0;
} st_1bdc0_2;

typedef struct st_1bdc0_0 {
    char field_0;
} st_1bdc0_0;

extern char g_10002b0;

unsigned long long sub_1bdc0(st_1bdc0_1 *a0)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // x20
    unsigned long long v9;  // x21
    st_1bdc0_3 *v10;  // x0
    st_1bdc0_3 *v11;  // x8
    unsigned long long *v12;  // x9
    unsigned long long v13;  // x0
    long long v14;  // x0
    st_1bdc0_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1bdc0_0 *v1;  // [bp-0x68]
    unsigned long long *v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_24940();
    v7 = a0->field_8;
    if (v7)
    {
        v8 = 0;
        v9 = 0;
        do
        {
            if (*(long long *)((char *)a0->field_0 + v8) != a0->field_18)
            {
                v10 = sub_104ac(&v2, (char *)a0->field_0 + v8);
                v11 = (char *)a0->field_0 + v8;
                v10->field_0 = v11->field_0;
                *(int128_t *)&(&v10->field_0)[1] = *(int128_t *)&(&v11->field_0)[1];
                v7 = a0->field_8;
            }
        } while ((v9 += 1, v8 += 24, v7 > v9));
    }
    v12 = a0->field_0;
    a0->field_0 = v2;
    a0->field_8 = v3;
    v2 = v12;
    v3 = v7;
    v13 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v13;
    v14 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    __Unwind_Resume(v14);
}

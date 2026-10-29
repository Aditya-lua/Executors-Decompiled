/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x28e58..0x28f88 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_28e58_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned int field_28;
} st_28e58_1;

typedef struct st_28e58_0 {
    char field_0;
} st_28e58_0;

extern char g_10002b0;

unsigned long long sub_28e58(unsigned long long *a0)
{
    unsigned long long *v7;  // x20
    unsigned long v8;  // x8
    long long v17;  // x0
    unsigned long long v9;  // x21
    unsigned long long v10;  // x22
    st_28e58_1 *v11;  // x0
    st_28e58_1 *v12;  // x8
    uint128_t v13;  // q0
    uint128_t v14;  // q1
    unsigned long v15;  // x9
    unsigned long long v16;  // x0
    st_28e58_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_28e58_0 *v1;  // [bp-0x98]
    unsigned long v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = a0 + 1;
    sub_31490();
    v8 = *v7;
    if (v8)
    {
        v9 = 0;
        v10 = 0;
        do
        {
            if (!(sub_2d73c(*a0 + v9, v7 + 2) & 1))
            {
                v11 = sub_2f82c(&v2, *a0 + v9);
                v12 = *a0 + v9;
                v13 = v12->field_0;
                v14 = v12->field_10;
                v11->field_20 = v12->field_20;
                v11->field_0 = v13;
                v11->field_10 = v14;
                v11->field_28 = v12->field_28;
            }
        } while ((v10 += 1, v8 = a0[1], v9 += 48, a0[1] > v10));
    }
    v15 = *a0;
    *a0 = v2;
    a0[1] = v3;
    v2 = v15;
    v3 = v8;
    v16 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v16;
    v17 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    __Unwind_Resume(v17);
}

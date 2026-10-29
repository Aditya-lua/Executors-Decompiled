/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2f700..0x2f828 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2f700_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_2f700_1;

typedef struct st_2f700_0 {
    char field_0;
} st_2f700_0;

extern char g_10002b0;

unsigned long long sub_2f700(unsigned long long *a0)
{
    unsigned long long *v7;  // x20
    unsigned long v8;  // x21
    unsigned long long v9;  // x22
    unsigned long long v10;  // x23
    st_2f700_1 *v11;  // x0
    st_2f700_1 *v12;  // x8
    unsigned long v13;  // x8
    unsigned long long v14;  // x0
    long long v15;  // x0
    st_2f700_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_2f700_0 *v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = a0 + 1;
    sub_29fc0();
    v8 = *v7;
    if (v8)
    {
        v9 = 0;
        v10 = 0;
        do
        {
            if (!(sub_2a6e0(*a0 + v9, v7 + 2) & 1))
            {
                v11 = sub_2eac0(&v2, *a0 + v9);
                v12 = *a0 + v9;
                v11->field_0 = v12->field_0;
                v11->field_10 = v12->field_10;
                v8 = a0[1];
            }
        } while ((v10 += 1, v9 += 24, v8 > v10));
    }
    v13 = *a0;
    *a0 = v2;
    a0[1] = v3;
    v2 = v13;
    v3 = v8;
    v14 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v14;
    v15 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    __Unwind_Resume(v15);
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb080..0xb19c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b080_2 {
    uint128_t field_0;
} st_b080_2;

typedef struct st_b080_1 {
    struct st_b080_2 *field_0;
    unsigned long long field_8;
} st_b080_1;

typedef struct st_b080_0 {
    char field_0;
} st_b080_0;

extern char g_10002b0;

unsigned long long sub_b080(st_b080_1 *a0)
{
    unsigned long long *v7;  // x20
    unsigned long v8;  // x21
    unsigned long long v9;  // x22
    unsigned long long v10;  // x23
    uint128_t *v11;  // x0
    uint128_t *v12;  // x8
    unsigned long long v13;  // x0
    long long v14;  // x0
    st_b080_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_b080_0 *v1;  // [bp-0x80]
    uint128_t *v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = &a0->field_8;
    sub_bfd0();
    v8 = *v7;
    if (v8)
    {
        v9 = 0;
        v10 = 0;
        do
        {
            if (!(sub_cdcc((char *)a0->field_0 + v9, v7 + 2) & 1))
            {
                v11 = sub_9ea8(&v2, (char *)a0->field_0 + v9);
                *v11 = *(int128_t *)((char *)a0->field_0 + v9);
                v8 = a0->field_8;
            }
        } while ((v10 += 1, v9 += 16, v8 > v10));
    }
    v12 = a0->field_0;
    a0->field_0 = v2;
    a0->field_8 = v3;
    v2 = v12;
    v3 = v8;
    v13 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v13;
    v14 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    __Unwind_Resume(v14);
}

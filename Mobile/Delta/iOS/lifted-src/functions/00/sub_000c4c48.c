/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4c48..0xc4cb4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4c48_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c4c48_1;

typedef struct st_c4c48_0 {
    struct st_c4c48_0 *field_0;
} st_c4c48_0;


st_c4c48_0 ** sub_c4c48(st_c4c48_0 **a0, st_c4c48_1 *a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    uint128_t v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    if (*a0)
    {
        v0 = a1->field_0;
        v1 = a1->field_10;
        sub_80164(*a0, &v0);
    }
    v0 = a1->field_0;
    v1 = a1->field_10;
    return sub_80164();
}

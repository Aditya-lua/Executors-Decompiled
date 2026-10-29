/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f8478..0x1f84e0 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f8478_1 {
    struct st_1f8478_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_1f8478_1;

typedef struct st_1f8478_2 {
    unsigned int field_0;
} st_1f8478_2;

typedef struct st_1f8478_0 {
    char field_0;
} st_1f8478_0;


st_1f8478_1 * sub_1f8478(st_1f8478_1 *a0, unsigned int *a1)
{
    unsigned long idx;  // x21
    unsigned long v5;  // x8
    unsigned long v6;  // x1
    st_1f8478_1 *v7;  // x0
    st_1f8478_1 *v8;  // x0
    st_1f8478_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f8478_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    idx = a0->field_8;
    v5 = a0->field_10;
    v6 = idx + 1;
    a0->field_8 = v6;
    v7 = a0;
    if (v6 > v5)
        v7 = sub_1ec70c(a0);
    v8 = v7;
    *(unsigned int *)&a0->field_0[idx] = *a1;
    return v8;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eec58..0x1eed2c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eec58_4 {
    unsigned int field_0;
    struct st_1eec58_1 *field_4;
    unsigned int field_8;
} st_1eec58_4;

typedef struct st_1eec58_2 {
    char padding_0[24];
    struct st_1eec58_3 *field_18;
    struct st_1eec58_1 *field_20;
} st_1eec58_2;

typedef struct st_1eec58_3 {
    struct st_1eec58_1 *field_0;
} st_1eec58_3;

typedef struct st_1eec58_1 {
    char padding_0[4];
    unsigned int field_4;
} st_1eec58_1;

typedef struct st_1eec58_0 {
    char field_0;
} st_1eec58_0;


unsigned long long sub_1eec58(st_1eec58_2 *a0, unsigned long long *a1, unsigned long long a2)
{
    st_1eec58_1 *v6;  // x0
    st_1eec58_1 *v7;  // x22
    st_1eec58_1 **v8;  // x9
    st_1eec58_1 *v9;  // w10
    st_1eec58_4 *v10;  // x9
    st_1eec58_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1eec58_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    v3 = a1[1];
    v6 = sub_1fab7c();
    if (v6)
        return v6->field_4;
    v7 = a0->field_20;
    sub_1f08c4(a0, a1);
    sub_1fb614();
    v8 = a0->field_18;
    if (v7)
    {
        v9 = (st_1eec58_1 *)(*(int *)v8 + 1);
    }
    else
    {
        v9 = (st_1eec58_1 *)1;
        v7 = 1;
    }
    *(unsigned int *)v8 = (unsigned int)v9;
    v10 = (char *)v8 + 0x4 * v7;
    v10->field_0 = a1[1];
    (&v10->field_0)[1] = 1;
    *(unsigned int *)&v10->field_4 = a2;
    return a2;
}

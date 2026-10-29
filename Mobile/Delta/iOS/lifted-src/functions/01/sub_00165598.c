/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x165598..0x165688 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_165598_2 {
    char padding_0[72];
    unsigned long long field_48;
    unsigned long long field_50;
} st_165598_2;

typedef struct st_165598_1 {
    char padding_0[64];
    struct st_165598_2 *field_40;
    struct st_165598_2 *field_48;
    struct st_165598_2 *field_50;
    struct st_165598_2 *field_54;
    char padding_5c[4];
    struct st_165598_2 *field_60;
} st_165598_1;

typedef struct st_165598_0 {
    char field_0;
} st_165598_0;

extern long long g_f01360;

unsigned long long * sub_165598(st_165598_1 *a0)
{
    unsigned long long *v11;  // x21
    unsigned long long *v12;  // x20
    long long v13;  // x0
    unsigned long long *v14;  // x20
    uint128_t v0;  // [bp-0x80]
    st_165598_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_165598_0 *v2;  // [bp-0x68]
    uint128_t v3;  // [bp-0x60], Other Possible Types: unsigned long long *
    unsigned long long *v4;  // [bp-0x58]
    uint128_t v5;  // [bp-0x50], Other Possible Types: unsigned long long *
    unsigned long long *v6;  // [bp-0x48]
    unsigned long long *v7;  // [bp-0x40]
    unsigned long long *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v5 = 0;
    v6 = 0;
    std::__1::mutex::lock(&g_f01360);
    sub_614bc(&a0->field_40);
    v0 = v3;
    v3 = 0;
    v4 = 0;
    v7 = 0;
    v8 = 0;
    v5 = v0;
    sub_60b78(&v7);
    sub_60b78(&v3);
    v11 = *(unsigned long long *)&*(unsigned long long *)(void*)&v0;
    if (v11)
    {
        v12 = v11;
        v13 = sub_167694(v12[9], v12[10], a0);
        sub_165688(v12 + 9, v13, v12[10]);
    }
    v7 = (unsigned long long *)*(int128_t *)&a0->field_40;
    a0->field_40 = 0;
    a0->field_48 = 0;
    sub_611fc(&v7);
    v14 = 0;
    *(char *)&a0->field_50 = 0;
    if (!*(int *)((char *)&a0->field_50 + 4))
    {
        v14 = (unsigned long long)a0->padding_5c;
        *(unsigned int *)a0->padding_5c = 0;
    }
    std::__1::mutex::unlock(&g_f01360);
    sub_60b78(&v5);
    return v14;
}

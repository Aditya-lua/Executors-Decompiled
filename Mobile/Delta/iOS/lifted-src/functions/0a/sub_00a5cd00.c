/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5cd00..0xa5cd98 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5cd00_1 {
    unsigned long long field_0;
} st_a5cd00_1;

typedef struct st_a5cd00_2 {
    unsigned int field_0;
    unsigned int field_4;
} st_a5cd00_2;

typedef struct st_a5cd00_0 {
    char padding_0[96];
    struct st_a5cd00_1 *field_60;
    struct st_a5cd00_2 *field_68;
} st_a5cd00_0;


unsigned long long * sub_a5cd00(long long a0, st_a5cd00_0 *a1)
{
    unsigned long long *v4;  // x0
    unsigned long long *v5;  // x0
    unsigned long long *v6;  // x0
    unsigned long long *v7;  // x0
    unsigned long long *v8;  // x10
    unsigned int *v9;  // x9
    unsigned int v0;  // [bp-0x28]
    unsigned int v1;  // [bp-0x24]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0xffffffff;
    v1 = 0xffffffff;
    if (!a1->field_60)
        return 1;
    v4 = sub_a6fbc4();
    if (!v4)
        return v4;
    v5 = sub_a6fc2c();
    if (!(unsigned int)v5)
        return v5;
    v6 = sub_a6fbc4(a0, "iteration");
    if (!v6)
        return v6;
    v7 = sub_a6fc2c();
    if (!(unsigned int)v7)
        return v7;
    v8 = a1->field_60;
    v9 = &a1->field_68->field_0;
    *v9 = v1;
    v9[1] = v0;
    v8();
}

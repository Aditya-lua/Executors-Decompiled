/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd6d5c..0xd6dec (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d6d5c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
} st_d6d5c_0;

typedef struct st_d6d5c_1 {
    unsigned long long field_0;
    struct st_d6d5c_0 *field_8;
    struct st_d6d5c_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    unsigned int field_34;
} st_d6d5c_1;

typedef struct st_d6d5c_2 {
    unsigned long long field_0;
    void* field_8;
    void* field_10;
    unsigned long long field_18;
    unsigned long long field_20[2];
    char field_28;
    char padding_29[7];
    unsigned int field_30;
    unsigned int field_34;
} st_d6d5c_2;


double sub_d6d5c(st_d6d5c_1 *a0, st_d6d5c_2 *a1)
{
    st_d6d5c_0 *v0;  // x8
    void* v1;  // x8

    a0->field_20 = 0;
    v0 = &a0->field_20;
    a0->field_0 = 0xc4ceb9fe1a85ec53;
    a0->field_8 = v0;
    a0->field_10 = v0;
    a0->field_18 = 0;
    a0->field_28 = 0;
    *(double *)&a0->field_30 = 1.6e-322;
    v1 = a1->field_20;
    if (!a1->field_20[0])
        return 1.6e-322;
    *(int128_t *)&a0->field_8 = *(int128_t *)&a1->field_8;
    a0->field_0 = a1->field_0;
    a0->field_18 = a1->field_18;
    a0->field_20 = a1->field_20[0];
    a0->field_28 = a1->field_20[1];
    a0->field_30 = *(int *)&a1->field_28;
    a0->field_34 = *(int *)&a1->padding_29[3];
    a1->field_8 = v1;
    a1->field_10 = v1;
    a1->field_18 = 0;
    *(uint128_t *)a1->field_20 = __double_as_longlong(0) * 0x10000000000000000;
    *(double *)&a1->field_28 = 1.6e-322;
    return 1.6e-322;
}

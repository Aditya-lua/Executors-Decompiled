/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be1f4..0x1be2b0 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1be1f4_3 {
    struct st_1be1f4_1 *field_0;
    char padding_8[56];
    char field_40;
    char padding_41[15];
    char field_50;
    char padding_51[127];
    unsigned long long field_d0;
    char padding_d8[8];
    char field_e0;
} st_1be1f4_3;

typedef struct st_1be1f4_1 {
    char padding_0[32];
    struct st_1be1f4_2 *field_20;
} st_1be1f4_1;

typedef struct st_1be1f4_2 {
    unsigned long long field_0;
} st_1be1f4_2;

typedef struct st_1be1f4_0 {
    char field_0;
} st_1be1f4_0;


long long sub_1be1f4(st_1be1f4_3 *a0)
{
    st_1be1f4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1be1f4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(&a0->field_50);
    if (a0->field_d0)
    {
        sub_1ac7ec(a0, &a0->field_40);
        a0->field_e0 = 1;
        return std::__1::mutex::unlock(&a0->field_50);
    }
    a0->field_0->field_20();
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65bc8..0x65c58 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_65bc8_0 {
    char field_0;
} st_65bc8_0;

typedef struct st_65bc8_1 {
    char padding_0[8];
    unsigned int field_8;
} st_65bc8_1;


long long sub_65bc8(st_65bc8_1 *a0)
{
    unsigned long long v5;  // 4106
    st_65bc8_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_65bc8_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(&a0[1].padding_0[4]);
    v2 = 0;
    do
    {
        v5 = arm64g_calculate_condition(18, _read(a0->field_8, &v2, 8), 1, 0);
    } while (!(v5 & 1) && *(int *)___error() == 4);
    std::__1::mutex::unlock(&a0[1].padding_0[4]);
    return v2;
}

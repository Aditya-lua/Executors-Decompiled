/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x732c0..0x73430 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_732c0_3 {
    char padding_0[88];
    unsigned long long field_58;
    unsigned long long field_60;
    char padding_68[8];
    char field_70;
    char padding_71[95];
    struct st_732c0_4 *field_d0;
} st_732c0_3;

typedef struct st_732c0_1 {
    char padding_0[40];
    struct st_732c0_2 *field_28;
} st_732c0_1;

typedef struct st_732c0_2 {
    unsigned long long field_0;
} st_732c0_2;

typedef struct st_732c0_4 {
    struct st_732c0_1 *field_0;
} st_732c0_4;

typedef struct st_732c0_0 {
    char field_0;
} st_732c0_0;


long long sub_732c0(st_732c0_3 *a0)
{
    st_732c0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_732c0_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(&a0->field_70);
    if (a0->field_60 == a0->field_58)
    {
        std::__1::mutex::unlock(&a0->field_70);
        return 1;
    }
    std::__1::mutex::lock(a0 + 1);
    (*(long long *)(*(long long *)a0->field_d0 + 40))();
}

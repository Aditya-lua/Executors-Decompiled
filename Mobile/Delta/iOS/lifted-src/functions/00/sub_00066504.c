/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66504..0x6658c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66504_0 {
    char field_0;
} st_66504_0;

typedef struct st_66504_1 {
    char padding_0[8];
    unsigned int field_8;
} st_66504_1;


long long sub_66504(st_66504_1 *a0)
{
    st_66504_1 *v4;  // x20
    unsigned long long v5;  // 4112
    st_66504_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_66504_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(&a0[1].padding_0[4]);
    v4 = &a0->field_8;
    v5 = arm64g_calculate_condition(1, sub_66808(v4, 5) & 0xffffffff, 1, 0);
    if (!(v5 & 1))
    {
        _close(sub_66808(v4, 5), 5);
        /* unsupported instruction */;
        *(unsigned int *)&v4->padding_0[0] = 0xffffffff;
    }
    return std::__1::mutex::unlock(&a0[1].padding_0[4]);
}

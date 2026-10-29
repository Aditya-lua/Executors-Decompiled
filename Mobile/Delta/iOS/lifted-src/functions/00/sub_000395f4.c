/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x395f4..0x39680 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_395f4_0 {
    char field_0;
} st_395f4_0;

typedef struct st_395f4_1 {
    char padding_0[8];
    unsigned int field_8;
} st_395f4_1;


unsigned long long sub_395f4(long long *a0, unsigned long a1)
{
    st_395f4_1 *v5;  // x0
    unsigned long long v6;  // x0
    st_395f4_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_395f4_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v5 = sub_3a7e0(a0 + 33, &v2);
    if (!v5)
    {
        return 0xffffffff;
    }
    else if (v5->field_8 == 3)
    {
        v6 = sub_2d54c(*a0);
        if (!(v6 >> 31 & 1))
            return v6;
        sub_45808(v2 + 12, "Exceeded constant limit; simplify the code to compile");
    }
    else
    {
        return 0xffffffff;
    }
}

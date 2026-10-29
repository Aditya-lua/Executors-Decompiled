/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ea258..0x1ea4b0 (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ea258_1 {
    char padding_0[384];
    unsigned long long field_180;
} st_1ea258_1;

typedef struct st_1ea258_0 {
    char field_0;
} st_1ea258_0;

typedef struct st_1ea258_4 {
    unsigned long long field_0;
} st_1ea258_4;

typedef struct st_1ea258_3 {
    char padding_0[376];
    struct st_1ea258_4 *field_178;
} st_1ea258_3;

typedef struct st_1ea258_2 {
    char padding_0[96];
    struct st_1ea258_1 *field_60;
} st_1ea258_2;

extern st_1ea258_2 *g_f0d198;
extern st_1ea258_3 *g_f0d3d8;
extern char g_10002b0;

unsigned long long sub_1ea258(unsigned long a0)
{
    st_1ea258_1 *v9;  // x8
    st_1ea258_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_1ea258_0 *v1;  // [bp-0x70]
    st_1ea258_0 **i;  // [bp-0x68], Other Possible Types: unsigned long long
    double v3;  // [bp-0x60]
    unsigned long long *v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v9 = g_f0d198->field_60;
    v3 = 1.25040398908256e+306;
    v5 = 0;
    i = 0;
    if (15 >= i)
    {
        do
        {
            *((char *)&v3 + i) = (char)((unsigned int)i + 3080244879 + *((char *)&v3 + i) - ((unsigned int)i + 3080244879 & *((char *)&v3 + i)) * 2) + 23;
            i += 1;
        } while (i < 16);
    }
    if (!(*(unsigned long long *)&v3 & ~v9->field_180))
    {
        v4 = &i;
        i = &v4;
        g_f0d3d8->field_178();
    }
    if (*(long long *)&g_10002b0 == v6)
        return 0;
    ___stack_chk_fail();
}

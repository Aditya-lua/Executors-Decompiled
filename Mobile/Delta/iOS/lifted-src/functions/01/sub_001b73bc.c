/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b73bc..0x1b7440 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b73bc_1 {
    long long field_0;
    char padding_8[80];
    char field_58;
} st_1b73bc_1;

typedef struct st_1b73bc_0 {
    char field_0;
} st_1b73bc_0;


unsigned long long sub_1b73bc(long long a0, long long a1, st_1b73bc_1 *a2, long long a3, unsigned int a4)
{
    unsigned long long v4;  // x0
    st_1b73bc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b73bc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1ac850(a3, a0, a1, a2, a4 | 4160);
    if (!(unsigned int)v4)
    {
        return v4;
    }
    else if (a2->field_58 == 1)
    {
        sub_c84c(a2, a2->field_0);
        return 0;
    }
    else
    {
        return 1;
    }
}

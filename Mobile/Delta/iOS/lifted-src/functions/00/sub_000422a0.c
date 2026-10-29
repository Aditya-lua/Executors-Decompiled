/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x422a0..0x42300 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_422a0_2 {
    char padding_0[8];
    long long field_8;
} st_422a0_2;

typedef struct st_422a0_1 {
    char padding_0[40];
    char field_28;
} st_422a0_1;

typedef struct st_422a0_0 {
    char field_0;
} st_422a0_0;


int sub_422a0(st_422a0_2 *a0, st_422a0_1 *a1)
{
    st_422a0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_422a0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_28 != 1)
    {
        return 0;
    }
    else if (sub_4663c(a0->field_8))
    {
        sub_103a8(a0 + 1, &a1->padding_0[32]);
        return 0;
    }
    else
    {
        return 0;
    }
}

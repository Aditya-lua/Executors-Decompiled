/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6c98..0x3c6d18 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c6c98_1 {
    char padding_0[8];
    struct st_3c6c98_2 *field_8;
    char padding_10[16];
    long long field_20;
} st_3c6c98_1;

typedef struct st_3c6c98_2 {
    long long field_0;
} st_3c6c98_2;

typedef struct st_3c6c98_0 {
    char field_0;
} st_3c6c98_0;


int sub_3c6c98(st_3c6c98_1 *a0, unsigned int a1)
{
    unsigned long long v4;  // x19
    st_3c6c98_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3c6c98_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (0x200 > (unsigned long long)a0->field_20)
        a1 = 1;
    if (0x400 <= (unsigned long long)a0->field_20)
        v4 = 0;
    else
        v4 = a1;
    if (!(v4 & 1))
    {
        sub_4e14(*(long long *)a0->field_8, 0x200, 8);
        a0->field_8 = a0->field_8 + 1;
        a0->field_20 = a0->field_20 - 0x200;
    }
    return (unsigned int)v4 ^ 1;
}

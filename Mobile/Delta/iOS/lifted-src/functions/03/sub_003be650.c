/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3be650..0x3be6a4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3be650_0 {
    char padding_0[8];
    long long field_8;
} st_3be650_0;


st_3be650_0 * sub_3be650(st_3be650_0 *a0, unsigned long a1)
{
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if ((char)a0->field_8 == 1)
    {
        v0 = a1 + 24;
        a0 = sub_1aedc(&v0);
    }
    if (a1)
        a0 = sub_4e14(a1, 1, 8);
    return a0;
}

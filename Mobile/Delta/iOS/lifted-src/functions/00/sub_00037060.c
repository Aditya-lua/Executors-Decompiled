/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x37060..0x3709c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_37060_1 {
    char field_0;
} st_37060_1;

typedef struct st_37060_0 {
    char padding_0[8];
    unsigned int field_8;
} st_37060_0;


int sub_37060(unsigned long a0, unsigned long long a1)
{
    st_37060_0 *v5;  // x0
    st_37060_1 **v0;  // [bp-0x28], Other Possible Types: char
    st_37060_1 *v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v5 = sub_10160();
    if (v5)
        v5 = v5->field_8;
    return (unsigned int)v5;
}

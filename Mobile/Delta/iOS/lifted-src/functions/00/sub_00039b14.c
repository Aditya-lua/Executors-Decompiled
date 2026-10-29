/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39b14..0x39b70 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39b14_1 {
    char padding_0[8];
    struct st_39b14_1 *field_8;
} st_39b14_1;

typedef struct st_39b14_0 {
    char field_0;
} st_39b14_0;


st_39b14_1 * sub_39b14(unsigned long a0, unsigned long long a1)
{
    st_39b14_1 *v5;  // x0
    st_39b14_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_39b14_0 *v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v5 = sub_3a7e0();
    if (v5)
    {
        if ((int)v5->field_8)
            v5 = sub_3a988(&v5->field_8) ^ 1;
        else
            return 0;
    }
    return (unsigned int)v5;
}

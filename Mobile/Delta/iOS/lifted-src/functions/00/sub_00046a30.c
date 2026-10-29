/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x46a30..0x46a88 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_46a30_1 {
    char padding_0[8];
    struct st_46a30_1 *field_8;
} st_46a30_1;

typedef struct st_46a30_0 {
    char field_0;
} st_46a30_0;


st_46a30_1 * sub_46a30(unsigned long a0, unsigned long long a1)
{
    st_46a30_1 *v5;  // x0
    st_46a30_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_46a30_0 *v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v5 = sub_3a7e0();
    if (!v5)
    {
        return v5;
    }
    else if ((int)v5->field_8)
    {
        return sub_3a988(&v5->field_8);
    }
    else
    {
        return 0;
    }
}

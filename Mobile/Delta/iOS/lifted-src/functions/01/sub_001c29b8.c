/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c29b8..0x1c2a28 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c29b8_1 {
    char padding_0[28];
    unsigned int field_1c;
} st_1c29b8_1;

typedef struct st_1c29b8_0 {
    char field_0;
} st_1c29b8_0;


long long sub_1c29b8(st_1c29b8_1 *a0, char a1)
{
    unsigned int v4;  // w0
    st_1c29b8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1c29b8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1be970(a1, 10);
    if (8 >= v4 - 1)
    {
        if (a0->field_1c >= v4)
            sub_1bdae0(a0);
        else
            sub_1b1564();
    }
    return 9 > v4 - 1;
}

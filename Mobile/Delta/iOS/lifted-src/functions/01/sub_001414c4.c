/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1414c4..0x141594 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1414c4_0 {
    char field_0;
} st_1414c4_0;


long long sub_1414c4(unsigned long a0, unsigned long a1, unsigned long a2)
{
    long long v9;  // x19
    st_1414c4_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1414c4_0 *v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x38], Other Possible Types: unsigned long long
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v9 = (long long)(a1 - a0) >> 3;
    v5 = 0;
    v6 = 0;
    if (v9 >= 129)
    {
        sub_1407d4(v9);
        v2 = 0;
        sub_13d164(&v5, v3);
        v6 = v4;
        sub_13d164(&v2, 0);
    }
    sub_13cf74();
    return sub_13d164(&v5, 0);
}

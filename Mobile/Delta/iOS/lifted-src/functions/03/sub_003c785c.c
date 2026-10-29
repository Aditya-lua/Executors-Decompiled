/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c785c..0x3c78b8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c785c_0 {
    char padding_0[16];
    long long field_10;
} st_3c785c_0;

typedef struct st_3c785c_1 {
    char field_0;
} st_3c785c_1;


long long sub_3c785c(st_3c785c_0 *a0)
{
    long long v4;  // x19
    st_3c785c_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_3c785c_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_10;
    if (!v4)
    {
        return 0;
    }
    else if (sub_2c8f7c(v4))
    {
        return v4;
    }
    else
    {
        return 0;
    }
}

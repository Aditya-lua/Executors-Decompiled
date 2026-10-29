/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62b88..0x62be4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62b88_2 {
    struct st_62b88_1 *field_0;
    long long field_8;
} st_62b88_2;

typedef struct st_62b88_1 {
    char padding_0[16];
    struct st_62b88_2 *field_10;
} st_62b88_1;

typedef struct st_62b88_0 {
    char field_0;
} st_62b88_0;


st_62b88_2 * sub_62b88(st_62b88_2 *a0)
{
    st_62b88_1 *i;  // x0
    unsigned long v5;  // x8
    st_62b88_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_62b88_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8)
        return sub_62ccc(a0->field_8);
    do
    {
        i = a0;
        v5 = i->field_10;
        a0 = v5;
    } while (a0->field_0 != i);
    return v5;
}

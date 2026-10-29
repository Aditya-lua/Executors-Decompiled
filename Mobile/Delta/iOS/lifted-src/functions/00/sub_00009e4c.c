/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4c..0x9e8c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e4c_1 {
    char padding_0[20];
    unsigned int field_14;
    unsigned long long field_18;
} st_9e4c_1;

typedef struct st_9e4c_0 {
    char field_0;
} st_9e4c_0;


long long sub_9e4c(st_9e4c_1 *a0)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    st_9e4c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_9e4c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = 0xffffffff;
    do
    {
        v3 = v2;
        v2 = v3 + 1;
    } while (*(char *)(a0->field_18 + a0->field_14 + v3 + 2) != 93);
    return v3 + 1;
}

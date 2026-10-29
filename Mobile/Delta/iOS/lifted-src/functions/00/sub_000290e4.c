/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x290e4..0x29128 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_290e4_2 {
    unsigned int field_0;
} st_290e4_2;

typedef struct st_290e4_1 {
    char padding_0[48];
    struct st_290e4_2 *field_30;
} st_290e4_1;

typedef struct st_290e4_0 {
    char field_0;
} st_290e4_0;

extern char _NSHomeDirectory;

long long sub_290e4(st_290e4_1 *a0, unsigned long long idx, unsigned int a2)
{
    unsigned int v2;  // w8
    st_290e4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_290e4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a2 + ~(unsigned int)idx;
    if (0xff >= v2)
        *(unsigned int *)&a0->field_30[idx] = *(int *)&a0->field_30[idx] | v2 * &_NSHomeDirectory;
    return 0x100 > v2;
}

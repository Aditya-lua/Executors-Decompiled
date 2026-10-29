/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63e70..0x63f48 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63e70_4 {
    char padding_0[128];
    unsigned long long field_80;
} st_63e70_4;

typedef struct st_63e70_0 {
    char padding_0[48];
    struct st_63e70_1 *field_30;
} st_63e70_0;

typedef struct st_63e70_1 {
    unsigned long long field_0;
} st_63e70_1;

typedef struct st_63e70_3 {
    char field_0;
} st_63e70_3;

typedef struct st_63e70_2 {
    struct st_63e70_0 *field_0;
    char padding_8[112];
    int field_78;
} st_63e70_2;


double sub_63e70(st_63e70_2 *a0, unsigned long a1)
{
    st_63e70_4 *ptr;  // x8
    st_63e70_3 **v0;  // [bp-0x40], Other Possible Types: char
    st_63e70_3 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!*(long long *)&a0->field_78)
    {
        memset(ptr, 0, 128);
        ptr->field_80 = 0xffffffffffffffff;
        return 0;
    }
    a0->field_0->field_30();
}

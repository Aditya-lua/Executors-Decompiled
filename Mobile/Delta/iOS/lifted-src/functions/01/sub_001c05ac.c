/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c05ac..0x1c0650 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c05ac_1 {
    struct st_1c05ac_0 *field_0;
    unsigned long long field_8;
    struct st_1c05ac_2 *field_10;
} st_1c05ac_1;

typedef struct st_1c05ac_2 {
    unsigned int field_0;
} st_1c05ac_2;

typedef struct st_1c05ac_0 {
    char field_0;
} st_1c05ac_0;


unsigned long long sub_1c05ac(st_1c05ac_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_1c05ac_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1c05ac_0 *v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x38]
    unsigned long v4;  // [bp-0x30]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (*(char *)a0->field_0 & 1)
        return 1;
    v5 = a1;
    v3 = a3;
    v4 = a2;
    v2 = a4;
    if (!(sub_74cd0(a0->field_8 + 0x200, &v5, &v4, &v3, &v2) & 1))
    {
        *(unsigned int *)a0->field_10 = 7;
        return 0;
    }
    return 1;
}

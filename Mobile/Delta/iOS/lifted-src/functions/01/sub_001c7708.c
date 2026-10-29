/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c7708..0x1c77b4 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c7708_1 {
    char padding_0[48];
    struct st_1c7708_2 *field_30;
} st_1c7708_1;

typedef struct st_1c7708_2 {
    unsigned long long field_0;
} st_1c7708_2;

typedef struct st_1c7708_0 {
    char field_0;
} st_1c7708_0;


long long sub_1c7708(st_1c7708_1 **a0, unsigned long a1, unsigned long a2)
{
    st_1c7708_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1c7708_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a2 <= 0)
        return 0 >= a2;
    *a0->field_30();
}

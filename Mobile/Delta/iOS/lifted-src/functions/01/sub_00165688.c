/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x165688..0x1656ec (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_165688_1 {
    char padding_0[8];
    long long field_8;
} st_165688_1;

typedef struct st_165688_0 {
    char field_0;
} st_165688_0;


long long sub_165688(st_165688_1 *a0, long long a1, long long a2)
{
    st_165688_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_165688_0 *v1;  // [bp-0x30]
    char v2;  // [bp-0x21]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (a2 == a1)
        return a1;
    sub_1675dc(&v2, a2, a0->field_8, a1);
    sub_e6bcc(a0);
    return a1;
}

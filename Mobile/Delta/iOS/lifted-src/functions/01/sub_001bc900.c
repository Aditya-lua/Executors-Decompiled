/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc900..0x1bc974 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc900_0 {
    char field_0;
} st_1bc900_0;


long long sub_1bc900(unsigned long a0, unsigned long a1, unsigned long a2, long long a3)
{
    st_1bc900_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1bc900_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = sub_1a8f98();
    sub_1c5c70(&v2, a3);
    if (v2 == a1)
        return a2;
    return sub_a0c8(v2 + 40);
}

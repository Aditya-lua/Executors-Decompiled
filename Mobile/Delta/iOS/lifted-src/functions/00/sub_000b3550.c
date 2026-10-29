/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3550..0xb35e8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3550_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[28];
    unsigned int field_2c;
} st_b3550_1;

typedef struct st_b3550_0 {
    char field_0;
} st_b3550_0;


long long sub_b3550(st_b3550_1 *a0, long long a1, long long a2, long long a3)
{
    st_b3550_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_b3550_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8 + a0->field_2c <= (unsigned long long)a1)
    {
        sub_9594c();
        return sub_adb9c(a0, a1, a2, a3, 4, 0);
    }
    return 0;
}

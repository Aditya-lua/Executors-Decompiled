/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c3338..0x1c3394 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c3338_0 {
    char padding_0[8];
    struct st_1c3338_1 *field_8;
} st_1c3338_0;

typedef struct st_1c3338_1 {
    unsigned int field_0;
} st_1c3338_1;

typedef struct st_1c3338_2 {
    char field_0;
} st_1c3338_2;


long long sub_1c3338(st_1c3338_0 *a0)
{
    unsigned long v5;  // x19
    unsigned long v0;  // [bp-0x40], Other Possible Types: unsigned long long
    st_1c3338_2 **v1;  // [bp-0x30], Other Possible Types: char
    st_1c3338_2 *v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *(int *)a0->field_8;
    v2 = &v1;
    v1 = &v2;
    v0 = 0;
    v0 = _fcntl(v5, 3) & 0xfffffffb;
    return _fcntl(v5, 4);
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10714..0x10774 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_10714_1 {
    char padding_0[128];
    unsigned int field_80;
    uint128_t field_84;
} st_10714_1;

typedef struct st_10714_0 {
    char field_0;
} st_10714_0;


unsigned long long sub_10714(st_10714_1 *a0)
{
    st_10714_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_10714_0 *v1;  // [bp-0x28]
    uint128_t v2;  // [bp-0x20]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_80 != 33)
        return 0;
    v2 = *(int128_t *)&(&a0->field_80)[1];
    sub_1db64();
    return 0x100000000;
}

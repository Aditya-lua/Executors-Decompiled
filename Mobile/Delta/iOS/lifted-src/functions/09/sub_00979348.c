/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979348..0x9793a4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979348_0 {
    char padding_0[1568];
    unsigned long long field_620;
} st_979348_0;

typedef struct st_979348_1 {
    char field_0;
    char padding_1[7];
    uint128_t field_8;
    unsigned long long field_18;
    unsigned long long field_20;
} st_979348_1;


double sub_979348(st_979348_0 *a0, st_979348_1 *a1)
{
    unsigned long v6;  // d0
    uint128_t v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    st_979348_0 *v3;  // [bp-0x20], Other Possible Types: char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = 0;
    if (a0 && (a0->field_620 & 7) == 1)
    {
        v3 = 2 | a1->field_0 & 1;
        v6 = *(int128_t *)(a1->padding_1)[1];
        v0 = *(int128_t *)(a1->padding_1)[1];
        v1 = *(long long *)((char *)&a1->field_8 + 8);
        v2 = a1->field_18;
        sub_978d84();
    }
    return v6;
}

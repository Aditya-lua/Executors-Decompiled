/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40814..0x40910 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40814_0 {
    long long field_0;
    char padding_8[1680];
    void* field_698;
} st_40814_0;


long long sub_40814(st_40814_0 *a0, long long a1)
{
    void* v8;  // x8
    uint128_t v0;  // [bp-0x70]
    unsigned short v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    unsigned long v3;  // [bp-0x50]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x38], Other Possible Types: unsigned long
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    sub_395b0();
    v8 = a0->field_698;
    v0 = *(int128_t *)((char *)v8 - 48);
    v1 = *(short *)((char *)v8 - 32);
    v3 = 0;
    v4 = 0;
    v2 = 0;
    sub_3b54c(&v2, *(long long *)((char *)v8 - 24), *(long long *)((char *)v8 - 16), *(long long *)((char *)v8 - 16) - *(long long *)((char *)v8 - 24) >> 3);
    sub_44fd8(a0, a1 + 32, (char)v1, *(char *)((void*)&v1 + 1), 0);
    sub_3b76c(a0, *(unsigned long long *)((void*)&v0 + 8));
    v5 = sub_2bc4c(a0->field_0);
    sub_2fdb0(a0->field_0, 23, 0, 0);
    sub_103a8(a0->field_698 - 24, &v5);
    v5 = &v2;
    return sub_10344(&v5);
}

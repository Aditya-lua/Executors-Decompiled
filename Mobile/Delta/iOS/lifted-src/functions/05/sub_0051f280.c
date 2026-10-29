/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51f280..0x51f328 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_51f280_0 {
    char field_0;
} st_51f280_0;

long long sub_51f280(void)
{
    st_51f280_0 *v2;  // x8
    st_51f280_0 **v3;  // x9
    unsigned long long v4;  // x12
    unsigned long long v5;  // x8
    unsigned long long v6;  // x8
    st_51f280_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_51f280_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = v1;
    v3 = v0;
    v4 = v3 | v2;
    v5 = -((v4 ^ (char *)~v3 - (v2 | ~v3)) + (v4 & (char *)~v3 - (v2 | ~v3)) * 2);
    v6 = (v5 ^ (v4 ^ &(~v2)[-1 * (v3 | ~v2)]) + (v4 & &(~v2)[-1 * (v3 | ~v2)]) * 2) + ((v4 ^ &(~v2)[-1 * (v3 | ~v2)]) + (v4 & &(~v2)[-1 * (v3 | ~v2)]) * 2 + (v5 | ~((v4 ^ &(~v2)[-1 * (v3 | ~v2)]) + (v4 & &(~v2)[-1 * (v3 | ~v2)]) * 2))) * 2;
    v0 = v6 + 1515822387240319057;
    v1 = v6 + 1372899666868390668;
    return v1 + v0;
}

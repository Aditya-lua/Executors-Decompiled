/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf234..0xf2a8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f234_0 {
    char padding_0[132];
    uint128_t field_84;
    char padding_94[128];
    unsigned int field_114;
} st_f234_0;


long long sub_f234(st_f234_0 *a0)
{
    long long v3;  // x0
    uint128_t v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(int128_t *)&(a0->padding_0)[1];
    v3 = sub_15068();
    return 0;
}

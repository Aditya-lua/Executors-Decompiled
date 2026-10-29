/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7e54..0xad7e78 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad7e54_0 {
    char padding_0[96];
    struct st_ad7e54_0 *field_60;
} st_ad7e54_0;


st_ad7e54_0 * sub_ad7e54(st_ad7e54_0 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c699d8();
        return 0;
    }
    return a0->field_60;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97cf34..0x97cfd8 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97cf34_0 {
    unsigned int field_0;
    char padding_4[84];
    long long field_58;
} st_97cf34_0;


st_97cf34_0 * sub_97cf34(st_97cf34_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && (a0->field_0 & 0xfffffffc) == 128)
    {
        sub_ad9384(sub_c4ba8(a0->field_58));
        sub_982d48(sub_97b868(a0->field_58), 0);
        sub_ad93b4(sub_c4ba8(a0->field_58));
        return 1;
    }
    sub_97c738();
    return 0;
}

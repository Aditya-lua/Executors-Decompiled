/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97cebc..0x97cef8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97cebc_0 {
    char padding_0[96];
    long long field_60;
} st_97cebc_0;


long long sub_97cebc(void)
{
    st_97cebc_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_97f48c())
        return 0;
    return sub_97725c(v0->field_60);
}

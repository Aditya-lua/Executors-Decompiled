/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97cef8..0x97cf34 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97cef8_0 {
    char padding_0[96];
    long long field_60;
} st_97cef8_0;


long long sub_97cef8(void)
{
    st_97cef8_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_97f48c())
        return 0;
    return sub_975fec(v0->field_60);
}

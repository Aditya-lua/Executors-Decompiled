/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad92d4..0xad9324 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad92d4_0 {
    long long field_0;
    char padding_8[24];
    struct st_ad92d4_0 *field_20;
} st_ad92d4_0;


st_ad92d4_0 * sub_ad92d4(st_ad92d4_0 *a0)
{
    unsigned long long v4;  // x30
    st_ad92d4_0 *v0;  // [bp-0x18], Other Possible Types: char
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if (a0->field_20)
    {
        v1 = &v3;
        v2 = v4;
        if (!_pthread_join(a0->field_20->field_0, &v0))
            return !v0;
        return 0;
    }
    else
    {
        return 0;
    }
}

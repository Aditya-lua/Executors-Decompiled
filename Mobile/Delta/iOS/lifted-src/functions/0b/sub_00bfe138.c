/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfe138..0xbfe1e8 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfe138_0 {
    unsigned long long field_0;
    struct st_bfe138_0 *field_8;
    unsigned long long field_10;
} st_bfe138_0;


st_bfe138_0 * sub_bfe138(st_bfe138_0 *a0)
{
    st_bfe138_0 *v2;  // x19
    unsigned long v3;  // x23
    unsigned long v4;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 == 0x8000000000000000)
        return a0;
    v2 = a0->field_8;
    v3 = a0->field_10 + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 11;
        sub_bfe1e8();
        v3 = v4;
    }
    if (!a0->field_0)
        return v2;
    return _free();
}

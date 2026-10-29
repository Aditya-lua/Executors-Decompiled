/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31f20..0x31f54 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31f20_0 {
    char padding_0[8];
    long long field_8;
} st_31f20_0;


long long sub_31f20(st_31f20_0 *a0, unsigned long a1)
{
    long long v2;  // x0
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a1)
    {
        v3 = v2 + a1;
        _bzero(v2);
        v2 = v3;
    }
    a0->field_8 = v2;
    return v2;
}

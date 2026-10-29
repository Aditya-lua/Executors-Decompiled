/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa551d4..0xa55220 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a551d4_0 {
    unsigned long long field_0;
    char padding_8[160];
    struct st_a551d4_0 *field_a8;
} st_a551d4_0;


st_a551d4_0 * sub_a551d4(st_a551d4_0 *a0, unsigned long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return 0;
    }
    else if (a0->field_a8)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        a0->field_a8();
    }
}

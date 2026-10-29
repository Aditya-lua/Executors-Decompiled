/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x984338..0x98436c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_984338_0 {
    char padding_0[80];
    unsigned long long field_50;
} st_984338_0;


unsigned long long sub_984338(long long a0)
{
    st_984338_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c624f0(a0 + 168, 3, 1);
    if (!v2)
        return 0xffffffffffffffff;
    return v2->field_50;
}

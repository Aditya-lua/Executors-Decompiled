/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14494..0xa144c0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14494_0 {
    char padding_0[32];
    long long field_20;
} st_a14494_0;


long long sub_a14494(st_a14494_0 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_20)
        return 1;
    v0 = &v2;
    v1 = v3;
    return !sub_9ffdd0(a0->field_20);
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f72c4..0x9f72f8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f72c4_0 {
    char padding_0[8];
    long long field_8;
} st_9f72c4_0;


unsigned long long sub_9f72c4(st_9f72c4_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af3b1c(a1);
    if (!(unsigned int)v2)
        return v2;
    a0->field_8 = a1;
    return 1;
}

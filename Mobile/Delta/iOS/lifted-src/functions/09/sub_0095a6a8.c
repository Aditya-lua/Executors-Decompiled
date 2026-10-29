/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a6a8..0x95a6e4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95a6a8_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_95a6a8_0;


long long sub_95a6a8(st_95a6a8_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9568a0();
    if ((v2 >> 1 & 127) <= 6)
        return *(long long *)(a0->field_8 + (v2 & 0xff) * 8 + 1392);
    return 0;
}

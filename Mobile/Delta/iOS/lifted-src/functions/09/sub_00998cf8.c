/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998cf8..0x998d64 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_998cf8_0 {
    char padding_0[72];
    long long field_48;
    char padding_50[1616];
    unsigned long long field_6a0;
    char padding_6a8[16];
    unsigned long long field_6b8;
    struct st_998cf8_0 *field_6c0;
} st_998cf8_0;


unsigned long long sub_998cf8(st_998cf8_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 1;
    if (a0->field_6c0)
        v2 = sub_9d4248(a0->field_48, a0->field_6a0 + a0->field_6b8);
    else
        v2 = 1;
    sub_998bbc();
    return v2;
}

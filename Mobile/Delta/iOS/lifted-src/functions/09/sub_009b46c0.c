/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b46c0..0x9b46e8 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b46c0_0 {
    char padding_0[920];
    unsigned int field_398;
} st_9b46c0_0;


unsigned int sub_9b46c0(st_9b46c0_0 *a0)
{
    unsigned long long v3;  // x30
    unsigned int v4;  // w0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_398)
    {
        v0 = &v2;
        v1 = v3;
        v4 = sub_9545a8();
        if (!v4)
            return v4;
    }
    return 1;
}

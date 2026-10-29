/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4dd90..0xa4ddd4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4dd90_0 {
    char padding_0[264];
    struct st_a4dd90_0 *field_108;
} st_a4dd90_0;


st_a4dd90_0 * sub_a4dd90(st_a4dd90_0 *a0)
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
    else if (a0->field_108)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a79f54(sub_9ffdd8());
        goto *((void *)(a0->field_108));
    }
    else
    {
        return 0;
    }
}

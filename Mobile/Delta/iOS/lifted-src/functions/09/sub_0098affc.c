/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98affc..0x98b03c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98affc_0 {
    char padding_0[16];
    long long field_10;
} st_98affc_0;


unsigned long long sub_98affc(st_98affc_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        v2 = sub_9d3d38(a1);
        if (!(unsigned int)v2)
            return v2;
    }
    sub_9d3c28(a0->field_10);
    a0->field_10 = a1;
    return 1;
}

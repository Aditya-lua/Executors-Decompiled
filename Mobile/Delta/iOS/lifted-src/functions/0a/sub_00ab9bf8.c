/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab9bf8..0xab9c50 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab9bf8_0 {
    char padding_0[40];
    long long field_28;
} st_ab9bf8_0;


unsigned long long sub_ab9bf8(st_ab9bf8_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)&a0[1].padding_0[8] && a0->field_28)
    {
        v2 = sub_9e4624();
        if (!(sub_9e5528(*(long long *)&a0[1].padding_0[8], v2) >> 31 & 1))
            return sub_9e5528(*(long long *)&a0[1].padding_0[8], a0->field_28) >> 31;
    }
    return 0;
}

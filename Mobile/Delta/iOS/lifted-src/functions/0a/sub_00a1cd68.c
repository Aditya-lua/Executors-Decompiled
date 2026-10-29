/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1cd68..0xa1cde4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1cd68_0 {
    char padding_0[424];
    unsigned long long field_1a8;
} st_a1cd68_0;


unsigned long long sub_a1cd68(st_a1cd68_0 **a0, long long a1, unsigned long a2, unsigned long a3, long long a4)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a0->field_1a8)
    {
        goto *((void *)(*a0->field_1a8));
    }
    else
    {
        v2 = sub_a1b598();
        if (!(unsigned int)v2)
            return v2;
        return sub_a1b690(a0, a1, a1, a4) != 0;
    }
}

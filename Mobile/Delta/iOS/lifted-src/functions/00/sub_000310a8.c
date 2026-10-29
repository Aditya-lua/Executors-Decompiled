/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x310a8..0x310e8 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_310a8_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_310a8_0;


unsigned long long sub_310a8(st_310a8_0 *a0, unsigned long long a1)
{
    unsigned long long i;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a0->field_8;
    if (i != a1)
    {
        do
        {
            i -= 32;
        } while (i != a1);
    }
    a0->field_8 = a1;
    return i;
}

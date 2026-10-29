/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb371e8..0xb37228 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b371e8_0 {
    char padding_0[40];
    long long field_28;
} st_b371e8_0;


void sub_b371e8(st_b371e8_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a0->field_28)
    {
        v0 = &v1;
        sub_a66ec0(a0->field_28, 32);
    }
}

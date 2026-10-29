/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4cef8..0xb4cf1c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4cef8_0 {
    char padding_0[28];
    char field_1c;
} st_b4cef8_0;


char sub_b4cef8(st_b4cef8_0 *a0)
{
    if (!a0)
    {
        return 0;
    }
    else if (!*(long long *)&a0[12].padding_0[12])
    {
        return 0;
    }
    else if (a0->field_1c & 1)
    {
        return 0;
    }
}

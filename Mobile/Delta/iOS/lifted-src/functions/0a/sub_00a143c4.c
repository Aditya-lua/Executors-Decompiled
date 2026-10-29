/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa143c4..0xa1444c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a143c4_0 {
    char padding_0[32];
    long long field_20;
} st_a143c4_0;


int sub_a143c4(st_a143c4_0 *a0)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a1ab64(sub_9ffdd0(a0->field_20));
    if ((int)v2 > 0x1ff)
    {
        return 0x100;
    }
    else if ((int)v2 > 383)
    {
        return 192;
    }
    else if ((int)v2 > 0xff)
    {
        return 128;
    }
    else if ((int)v2 > 223)
    {
        return 112;
    }
    else if ((int)v2 > 159)
    {
        return 80;
    }
    else
    {
        return v2 / 2;
    }
}

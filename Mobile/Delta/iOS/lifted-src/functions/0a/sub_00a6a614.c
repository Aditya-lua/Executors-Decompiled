/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6a614..0xa6a660 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6a614_0 {
    char padding_0[8];
    long long field_8;
} st_a6a614_0;


long long sub_a6a614(st_a6a614_0 *a0, unsigned int a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_8)
    {
        return 0;
    }
    else if ((int)sub_ad69e4(a0->field_8) <= (int)a1)
    {
        return 0;
    }
}

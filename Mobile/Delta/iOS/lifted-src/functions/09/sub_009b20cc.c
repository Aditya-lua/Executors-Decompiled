/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b20cc..0x9b211c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b20cc_0 {
    char padding_0[120];
    unsigned long long field_78;
} st_9b20cc_0;


unsigned long long sub_9b20cc(st_9b20cc_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a0->field_78)
    {
        v2 = sub_958f68(a0);
        if (v2 && sub_ad69e4())
            return v2;
    }
}

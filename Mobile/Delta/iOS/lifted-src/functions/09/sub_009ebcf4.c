/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ebcf4..0x9ebd68 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ebcf4_0 {
    char padding_0[24];
    char field_18;
} st_9ebcf4_0;


void sub_9ebcf4(st_9ebcf4_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (!a0)
    {
        return;
    }
    else if (*(long long *)&a0->padding_0[8])
    {
        v0 = &v1;
        if (!(a0->field_18 & 1))
            sub_a6c4e8();
        else
            sub_a6d4c0();
    }
}

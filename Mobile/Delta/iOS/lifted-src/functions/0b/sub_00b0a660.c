/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0a660..0xb0a6cc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0a660_0 {
    char padding_0[84];
    char field_54;
    char padding_55[611];
    unsigned long long field_2b8;
} st_b0a660_0;


char sub_b0a660(st_b0a660_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_54 & 1))
    {
        if (a0->field_2b8)
        {
            if (sub_a959d4())
                return 0;
            return 1;
        }
        else
        {
            if (sub_a95348())
                return 0;
            return 1;
        }
    }
    else
    {
        if (a0->field_2b8)
        {
            if (sub_a956a0())
                return 0;
            return 1;
        }
        else
        {
            if (sub_a94fe8())
                return 0;
            return 1;
        }
    }
}

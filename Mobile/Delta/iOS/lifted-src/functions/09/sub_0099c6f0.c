/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c6f0..0x99c764 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c6f0_1 {
    char padding_0[648];
    struct st_99c6f0_0 *field_288;
} st_99c6f0_1;

typedef struct st_99c6f0_0 {
    char padding_0[816];
    struct st_99c6f0_1 *field_330;
} st_99c6f0_0;


st_99c6f0_1 * sub_99c6f0(st_99c6f0_1 **a0, unsigned long a1, st_99c6f0_1 *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        return 1;
    }
    else if (!(int)a0[15])
    {
        return 1;
    }
    else if (!a0[363])
    {
        return 1;
    }
    else if (!(int)a0[363]->field_288->field_330)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions.c", 1718, "final_psk");
        sub_9a58a4(a0, 109, 310, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99b910..0x99b9a8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99b910_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[2356];
    unsigned long long field_9b0;
} st_99b910_0;


unsigned long long sub_99b910(st_99b910_0 *a0, unsigned long a1, unsigned long long a2)
{
    long long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_78)
    {
        if (!*(int *)&a0[1].padding_7c[364])
        {
            return 1;
        }
        else if (a2)
        {
            return 1;
        }
        else if (!(a0->field_9b0 >> 18 & 1))
        {
            v2 = 909;
        }
        else
        {
            return 1;
        }
    }
    else
    {
        if (a0->field_9b0 >> 2 & 1)
        {
            return 1;
        }
        else if (a2)
        {
            return 1;
        }
        else if (!(a0->field_9b0 >> 18 & 1))
        {
            v2 = 897;
        }
        else
        {
            return 1;
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions.c", v2, "final_renegotiate");
    sub_9a58a4(a0, 40, 338, 0);
    return 0;
}

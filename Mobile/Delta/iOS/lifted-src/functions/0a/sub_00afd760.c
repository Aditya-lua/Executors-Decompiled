/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd760..0xafd7cc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afd760_0 {
    struct st_afd760_0 *field_0;
} st_afd760_0;

extern st_afd760_0 *g_f14338;

int sub_afd760(unsigned long a0, unsigned long a1)
{
    st_afd760_0 **v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2cf88();
    if (v2)
    {
        v2 = sub_9d3c1c();
        if (v2)
        {
            if (g_f14338)
                g_f14338();
            sub_9d3c28();
            v2 = 0;
        }
    }
    return (unsigned int)v2;
}

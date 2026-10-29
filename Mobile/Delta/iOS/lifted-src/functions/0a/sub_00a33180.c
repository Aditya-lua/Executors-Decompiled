/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33180..0xa33210 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33180_0 {
    unsigned long long field_0;
} st_a33180_0;

extern st_a33180_0 *g_f12800;

int sub_a33180(unsigned long a0)
{
    unsigned long long *v2;  // x0
    unsigned long long *v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12800 || (v2 = sub_ad61b4(), g_f12800 = v2, v2))
    {
        v2 = sub_a6bf4c(8, "crypto/engine/eng_lib.c", 132);
        if (v2)
        {
            v3 = v2;
            *v2 = a0;
            if ((int)sub_ad68a0(g_f12800, v3) > 0)
            {
                v2 = 1;
            }
            else
            {
                sub_a6c2e4(v3, "crypto/engine/eng_lib.c", 163);
                v2 = 0;
            }
        }
    }
    return (unsigned int)v2;
}

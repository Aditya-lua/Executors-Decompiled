/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f480..0xa4f498 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4f480_0 {
    struct st_a4f480_0 *field_0;
} st_a4f480_0;

extern st_a4f480_0 *g_f129e8;

st_a4f480_0 ** sub_a4f480(void)
{
    if ((char)g_f129e8)
        return &g_f129e8;
    return 0;
}

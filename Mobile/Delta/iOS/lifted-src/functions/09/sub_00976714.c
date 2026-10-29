/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976714..0x976730 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976714_0 {
    char padding_0[24];
    struct st_976714_0 *field_18;
    char padding_20[44];
    unsigned int field_4c;
} st_976714_0;


st_976714_0 * sub_976714(st_976714_0 *iter, unsigned int a1)
{
    if (iter)
    {
        do
        {
            iter = iter->field_18;
        } while (iter && iter->field_4c != a1);
    }
    return iter;
}

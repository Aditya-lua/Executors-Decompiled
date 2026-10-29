/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9766f4..0x976714 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9766f4_0 {
    char padding_0[24];
    struct st_9766f4_0 *field_18;
    char padding_20[44];
    unsigned int field_4c;
} st_9766f4_0;


st_9766f4_0 * sub_9766f4(st_9766f4_0 **a0, unsigned int a1)
{
    st_9766f4_0 *iter;  // x0

    iter = *a0;
    if (iter)
    {
        do
        {
        } while (iter->field_4c != a1 && (iter = iter->field_18, iter));
    }
    return iter;
}

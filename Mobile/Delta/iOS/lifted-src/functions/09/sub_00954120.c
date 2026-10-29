/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954120..0x954154 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954120_0 {
    struct st_954120_0 *field_0;
    struct st_954120_0 *field_8;
    char padding_10[976];
    struct st_954120_0 *field_3e0;
    char padding_3e8[1960];
    struct st_954120_0 *field_b90;
} st_954120_0;


st_954120_0 * sub_954120(st_954120_0 *a0)
{
    if (a0 && !(int)a0->field_0)
    {
        if (a0->field_b90)
        {
            return a0->field_b90;
        }
        else if (a0->field_8 && a0->field_8->field_3e0)
        {
            return a0->field_8->field_3e0;
        }
    }
    return 0;
}

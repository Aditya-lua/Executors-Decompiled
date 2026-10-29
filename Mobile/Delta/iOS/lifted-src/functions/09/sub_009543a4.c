/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9543a4..0x9543c0 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9543a4_0 {
    struct st_9543a4_0 *field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_9543a4_0;


st_9543a4_0 * sub_9543a4(st_9543a4_0 *a0)
{
    st_9543a4_0 *v0;  // x0
    st_9543a4_0 *v1;  // x0

    v0 = a0;
    if (v0)
    {
        v1 = a0->field_0;
        v0 = v1;
        if (v0)
        {
            a0->field_0 = v1->field_10;
            v0 = v1;
        }
    }
    return v0;
}

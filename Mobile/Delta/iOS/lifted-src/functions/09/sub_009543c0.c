/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9543c0..0x9543e4 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9543c0_0 {
    char padding_0[16];
    struct st_9543c0_0 *field_10;
} st_9543c0_0;


st_9543c0_0 * sub_9543c0(st_9543c0_0 **a0)
{
    st_9543c0_0 *v0;  // x8
    st_9543c0_0 *v1;  // x0
    st_9543c0_0 *v2;  // x8
    st_9543c0_0 *v3;  // x0
    st_9543c0_0 *v4;  // x0

    v0 = *a0;
    if (!*a0)
        return 0;
    v1 = 0;
    do
    {
        v2 = v0;
        v3 = v1;
        v4 = &v3->padding_0[1];
        v1 = v4;
        v0 = v2->field_10;
    } while (v2->field_10);
    return &v3->padding_0[1];
}

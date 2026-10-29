/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x965e7c..0x965e98 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_965e7c_0 {
    char padding_0[688];
    struct st_965e7c_0 *field_2b0;
} st_965e7c_0;


void sub_965e7c(void)
{
    st_965e7c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_965c08();
    if (!v2)
        return;
    *(unsigned int *)&v2->field_2b0 = 0;
    return;
}

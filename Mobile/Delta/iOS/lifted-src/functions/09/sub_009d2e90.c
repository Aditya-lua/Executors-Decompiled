/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d2e90..0x9d2efc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d2e90_0 {
    struct st_9d2e90_0 *field_0;
} st_9d2e90_0;


st_9d2e90_0 ** sub_9d2e90(long long a0)
{
    st_9d2e90_0 **v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/bio/bf_prefix.c", 54);
    if (!v2)
        return 0;
    *v2 = 0;
    *(double *)&v2[1] = 2.121995791e-314;
    sub_9d3d24(a0, v2);
    sub_9d3d2c(a0, 1);
    return 1;
}

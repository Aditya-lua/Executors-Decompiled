/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0b98..0x9d0bd8 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d0b98_0 {
    char padding_0[8];
    struct st_9d0b98_0 *field_8;
} st_9d0b98_0;

extern long long g_f127a8;

st_9d0b98_0 * sub_9d0b98(void)
{
    st_9d0b98_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a6afb8(0x100, 0))
        return 0;
    v2 = sub_a7bbe0(&g_f127a8);
    if (!v2)
        return v2;
    return v2->field_8;
}

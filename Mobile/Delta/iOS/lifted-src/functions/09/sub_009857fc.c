/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9857fc..0x98582c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9857fc_0 {
    char padding_0[88];
    unsigned long long field_58;
} st_9857fc_0;


unsigned long long sub_9857fc(long long a0)
{
    st_9857fc_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c624f0(a0 + 16);
    if (!v2)
        return 0xffffffffffffffff;
    return v2->field_58;
}

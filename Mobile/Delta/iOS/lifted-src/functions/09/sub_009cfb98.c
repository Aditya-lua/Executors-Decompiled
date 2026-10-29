/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cfb98..0x9cfbd4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cfb98_0 {
    char padding_0[40];
    char field_28;
} st_9cfb98_0;


unsigned long long sub_9cfb98(unsigned long long *a0, st_9cfb98_0 *a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0)
        return *a0;
    if (!(a1->field_28 & 1))
        v2 = sub_9e48d4();
    else
        v2 = sub_9e4838();
    *a0 = 0;
    return v2;
}

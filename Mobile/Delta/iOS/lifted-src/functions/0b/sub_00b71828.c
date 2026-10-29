/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb71828..0xb71868 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b71828_0 {
    struct st_b71828_0 *field_0;
} st_b71828_0;


void sub_b71828(st_b71828_0 **a0)
{
    unsigned long long len;  // x0
    unsigned long long v3;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    len = _strlen();
    *(char *)a0 = 0;
    v3 = arm64g_calculate_condition(2, len, 1, 0);
    if (v3 & 1)
        return;
}

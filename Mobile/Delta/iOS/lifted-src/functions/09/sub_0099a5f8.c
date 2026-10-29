/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a5f8..0x99a644 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99a5f8_0 {
    char padding_0[4];
    unsigned int field_4;
} st_99a5f8_0;

extern long long g_d28740;

long long sub_99a5f8(st_99a5f8_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    while (_write(a0->field_4, &g_d28740, 1) < 0)
    {
        if (*(int *)___error() != 4)
            return 1;
    }
    return 1;
}

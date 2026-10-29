/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c57c..0x99c5b0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c57c_0 {
    char padding_0[856];
    long long field_358;
} st_99c57c_0;

extern long long g_afa390;

int sub_99c57c(st_99c57c_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_ad6958(a0->field_358, &g_afa390);
    a0->field_358 = 0;
    return 1;
}

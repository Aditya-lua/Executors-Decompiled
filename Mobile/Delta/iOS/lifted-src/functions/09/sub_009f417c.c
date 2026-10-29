/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f417c..0x9f41ac (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f417c_0 {
    char padding_0[16];
    long long field_10;
} st_9f417c_0;

extern long long g_9f4b4c;

int sub_9f417c(st_9f417c_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a66d48(a0->field_10, "@", &g_9f4b4c, a1);
    return 1;
}

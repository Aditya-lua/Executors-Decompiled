/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f404..0xa4f478 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4f404_0 {
    char padding_0[48];
    struct st_a4f404_1 *field_30;
} st_a4f404_0;

typedef struct st_a4f404_1 {
    unsigned long long field_0;
} st_a4f404_1;


long long sub_a4f404(long long *a0, long long a1, st_a4f404_0 *a2)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a68f38(sub_a7a42c(a1));
    if (!sub_a6924c(v2, 0, *a0, 58))
        return 0;
    a2->field_30();
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5597c..0xa559d4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5597c_0 {
    char padding_0[32];
    long long field_20;
    char padding_28[56];
    unsigned long long field_60;
} st_a5597c_0;


int sub_a5597c(st_a5597c_0 *a0, unsigned long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a79f54(a0->field_20);
    if (!a0->field_60)
        return 0;
    goto *((void *)(a0->field_60));
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55934..0xa55970 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55934_0 {
    char padding_0[32];
    long long field_20;
    char padding_28[8];
    unsigned long long field_30;
} st_a55934_0;


int sub_a55934(st_a55934_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a79f54(a0->field_20);
    if (!a0->field_30)
        return 0;
    goto *((void *)(a0->field_30));
}

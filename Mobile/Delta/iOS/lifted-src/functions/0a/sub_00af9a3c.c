/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf9a3c..0xaf9abc (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af9a3c_1 {
    char padding_0[208];
    struct st_af9a3c_0 *field_d0;
} st_af9a3c_1;

typedef struct st_af9a3c_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_af9a3c_0;


long long sub_af9a3c(st_af9a3c_1 *a0, unsigned long a1, long long a2)
{
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0->field_d0->field_18)
        return 0;
    v0 = a0->field_d0->field_18;
    sub_12738(a2);
    sub_97725c(a2);
    goto *((void *)(v0));
}

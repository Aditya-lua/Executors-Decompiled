/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e98ec..0x9e9948 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e98ec_0 {
    char padding_0[24];
    char field_18;
    char padding_19[23];
    unsigned int field_30;
    unsigned int field_34;
} st_9e98ec_0;


long long sub_9e98ec(st_9e98ec_0 *a0, long long a1)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9e4828(a1))
        return 0;
    v2 = sub_9e4c34(a0, a1);
    if (!v2)
        return v2;
    sub_9e5b4c(&a0->field_18);
    a0->field_30 = sub_9e46a8(a1);
    a0->field_34 = 0;
    return 1;
}

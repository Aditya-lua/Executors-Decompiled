/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa509f4..0xa50a58 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a509f4_0 {
    unsigned int field_0;
    char padding_4[92];
    struct st_a509f4_0 *field_60;
    char padding_68[8];
    struct st_a509f4_0 *field_70;
} st_a509f4_0;


void sub_a509f4(st_a509f4_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return;
    }
    else if (!a0->field_70 && !a0->field_60)
    {
        sub_a9976c(a0->field_0);
    }
}

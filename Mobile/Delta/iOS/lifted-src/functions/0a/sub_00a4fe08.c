/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4fe08..0xa4fe6c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4fe08_0 {
    unsigned int field_0;
    char padding_4[100];
    struct st_a4fe08_0 *field_68;
    char padding_70[8];
    struct st_a4fe08_0 *field_78;
} st_a4fe08_0;


void sub_a4fe08(st_a4fe08_0 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return;
    }
    else if (!a0->field_78 && !a0->field_68)
    {
        sub_a9976c(a0->field_0);
    }
}

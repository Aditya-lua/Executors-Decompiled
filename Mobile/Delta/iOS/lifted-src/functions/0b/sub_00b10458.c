/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb10458..0xb104c8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b10458_0 {
    struct st_b10458_0 *field_0;
    unsigned int field_8;
} st_b10458_0;


int sub_b10458(st_b10458_0 *a0, st_b10458_0 *a1)
{
    st_b10458_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a1 && a1->field_0)
            v2 = sub_a6fbc4(a1, "ssl3-ms");
        a0 = 1;
    }
    return (unsigned int)a0;
}

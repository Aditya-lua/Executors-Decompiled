/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a944..0xb4a9b8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4a944_0 {
    unsigned long long field_0;
    struct st_b4a944_0 *field_8;
} st_b4a944_0;


int sub_b4a944(unsigned long a0, st_b4a944_0 *a1)
{
    st_b4a944_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/seed_src.c", 0x33, "seed_src_new");
        sub_a36abc(57, 229, 0);
        v2 = 0;
    }
    else
    {
        v2 = sub_a6bffc(16, "providers/implementations/rands/seed_src.c", 55);
        if (v2)
        {
            v2->field_0 = a0;
            *(unsigned int *)&v2->field_8 = 0;
        }
    }
    return (unsigned int)v2;
}

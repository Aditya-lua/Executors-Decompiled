/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97f458..0x97f47c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97f458_0 {
    char padding_0[66];
    char field_42;
} st_97f458_0;


st_97f458_0 * sub_97f458(void)
{
    st_97f458_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_955d6c();
    if (!v2)
    {
        return v2;
    }
    else if (!(v2->field_42 & 4))
    {
        return 0;
    }
    else
    {
        return v2;
    }
}

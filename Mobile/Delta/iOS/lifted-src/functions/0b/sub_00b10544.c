/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb10544..0xb10590 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b10544(char *a0)
{
    char *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bf4c(1, "providers/implementations/digests/null_prov.c", 52);
        if (v2)
            *v2 = *a0;
    }
    else
    {
        v2 = 0;
    }
    return (unsigned int)v2;
}

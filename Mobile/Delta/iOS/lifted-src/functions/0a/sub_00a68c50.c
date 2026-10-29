/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68c50..0xa68c74 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a68c50(void)
{
    char *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a68c74();
    if (!v2)
        return;
    *v2 = *v2 | 1;
    return;
}

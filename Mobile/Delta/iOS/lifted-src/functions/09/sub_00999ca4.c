/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x999ca4..0x999cbc (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_999ca4(unsigned long idx, unsigned long a1)
{
    *(unsigned long *)(idx + 4408) = a1;
    if (a1 >= 2)
        *(unsigned int *)(idx + 4108) = 1;
    return idx;
}

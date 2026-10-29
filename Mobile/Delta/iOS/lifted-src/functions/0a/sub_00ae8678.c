/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae8678..0xae86f8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_ae8678(unsigned long a0, long long *a1, long long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_ae8cf4(*a1, a2, a3, "Permitted");
    if (*a1 && a1[1])
        sub_9d4888(a2, "\n");
    sub_ae8cf4(a1[1], a2, a3, "Excluded");
    return 1;
}

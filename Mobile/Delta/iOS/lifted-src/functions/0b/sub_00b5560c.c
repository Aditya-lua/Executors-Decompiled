/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5560c..0xb55644 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b5560c(unsigned long a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(40, "providers/implementations/storemgmt/file_store_any2obj.c", 56);
    if (v2)
        *v2 = a0;
    return (unsigned int)v2;
}

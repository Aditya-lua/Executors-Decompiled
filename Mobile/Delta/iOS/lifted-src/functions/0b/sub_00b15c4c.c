/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb15c4c..0xb15c9c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b15c4c_0 {
    struct st_b15c4c_0 *field_0;
} st_b15c4c_0;


unsigned int sub_b15c4c(unsigned long a0, unsigned long a1, unsigned long a2, st_b15c4c_0 **a3)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a3)
    {
        return 0xffffffff;
    }
    else if (*a3)
    {
        v0 = &v2;
        v1 = v3;
        (*a3)();
    }
    else
    {
        return 0xffffffff;
    }
}

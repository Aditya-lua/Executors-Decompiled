/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b07c..0x98b0cc (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b07c_0 {
    char padding_0[168];
    char field_a8;
} st_98b07c_0;


st_98b07c_0 ** sub_98b07c(st_98b07c_0 **a0, char a1, char a2)
{
    unsigned long v0;  // x8

    if (!(*a0->field_a8 >> 1 & 1))
    {
        if (a1)
            *(char **)a1 = "RH";
        if (!a2)
            return a0;
        v0 = "read header";
    }
    else
    {
        if (a1)
            *(char **)a1 = "unknown";
        if (!a2)
            return a0;
        v0 = "unknown";
    }
    *(unsigned long *)a2 = v0;
    return a0;
}

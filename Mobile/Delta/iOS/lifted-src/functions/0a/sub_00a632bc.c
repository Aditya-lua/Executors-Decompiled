/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa632bc..0xa632f4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a632bc(char *a0, unsigned long long i)
{
    unsigned long long v0;  // x0
    unsigned long long v1;  // x1
    char *v2;  // x8

    v0 = 14695981039346656037;
    if (!i)
        return 14695981039346656037;
    do
    {
        v1 = i;
        v2 = a0 + 1;
        v0 = 1099511628211 * (v0 ^ *a0);
        a0 = v2;
        i = v1 - 1;
    } while (i);
    return v0;
}

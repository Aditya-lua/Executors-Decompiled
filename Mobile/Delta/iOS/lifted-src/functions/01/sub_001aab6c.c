/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aab6c..0x1aaba4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aab6c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_1aab6c_0;


st_1aab6c_0 * sub_1aab6c(st_1aab6c_0 *a0, int a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long i;  // x10
    unsigned long long v3;  // x10

    v0 = a0->field_8;
    if (a1)
    {
        v1 = v0 + 24 * a1;
        i = a1 * 24;
        do
        {
            v3 = i;
            memset(v0, 0, 0x11);
            v0 += 24;
            i = v3 - 24;
        } while (i);
        v0 = v1;
    }
    a0->field_8 = v0;
    return a0;
}

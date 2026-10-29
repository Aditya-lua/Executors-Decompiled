/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6847c..0xc684c4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c6847c(unsigned long a0, unsigned long a1, unsigned int a2)
{
    char *iter;  // x8
    unsigned int i;  // w2
    unsigned int v0;  // [bp-0x14]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a2)
    {
        iter = &v0 | 3;
        do
        {
            i = a2;
            *iter = i;
            iter -= 1;
            a2 = i >> 8;
        } while (0xff < i);
    }
    sub_c683dc();
    return;
}

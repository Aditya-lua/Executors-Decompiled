/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb510c..0xb5164 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b510c(char *a0, char *a1, char *a2, char *a3)
{
    unsigned long long v0;  // x0
    char *v1;  // x9
    char *v2;  // x8
    char *v3;  // x9
    unsigned long long v4;  // x0

    if (a0 <= a1)
    {
        return 0;
    }
    else if (a2 > a3)
    {
        v0 = 0;
        v1 = a2 - 1;
        v2 = a0 - 1;
        do
        {
            v3 = v1;
            v4 = v0;
        } while (*v2 == *v3 && (v0 = v4 + 1, v2 > a1 && (v1 = v3 - 1, v2 -= 1, a3 < v3)));
        return v4 + 1;
    }
    else
    {
        return 0;
    }
}

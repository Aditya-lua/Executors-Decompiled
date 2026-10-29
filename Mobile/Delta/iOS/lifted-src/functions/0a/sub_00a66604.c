/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66604..0xa66664 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a66604(char *a0)
{
    char *i;  // w12
    char *v1;  // x9
    char *v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v4;  // x10
    char v5;  // x12

    if (!a0)
        return a0;
    i = (char *)*a0;
    if (!i)
        return 0;
    v1 = 0;
    v2 = a0 + 1;
    v3 = 0x100;
    do
    {
        v4 = v3 + 0x100;
        v5 = ((char)i ^ (char)(i >> 2)) & 15;
        v1 = ((unsigned int)(v1 >> ((char)(32 - v5) & 63)) | (unsigned int)v1 << (v5 & 31)) ^ (v3 | (char)i) * (v3 | (char)i);
        i = (char *)*v2;
        v2 += 1;
        v3 = v4;
    } while (i);
    return v1 ^ v1 >> 16;
}

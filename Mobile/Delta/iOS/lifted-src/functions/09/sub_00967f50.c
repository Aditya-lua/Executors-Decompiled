/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967f50..0x967f90 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_d280f4;
extern char _NSHomeDirectory;

unsigned long long sub_967f50(unsigned long long a0, unsigned long long a1)
{
    void* v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x9

    if (!(unsigned int)a0)
        return a0;
    v0 = &g_d280f4;
    v1 = 45;
    do
    {
        v2 = v1;
        if (*(short *)v0 == (unsigned int)a0)
            return *(int *)((char *)v0 - 4);
    } while ((v0 += 8, v1 = v2 - 1, v2 != 1));
    if (a1)
        return (unsigned int)a0 | &_NSHomeDirectory;
    return 0;
}

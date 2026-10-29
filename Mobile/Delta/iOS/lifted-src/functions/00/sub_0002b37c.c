/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b37c..0x2b410 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

void sub_2b37c(void* a0, void* a1, void* a2, void* a3)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x8
    unsigned long v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_30b84();
    if ((unsigned int)*(int *)a2 <= (unsigned int)*(int *)a3)
        return;
    v2 = *(long long *)a2;
    *(long long *)a2 = *(long long *)a3;
    *(unsigned long *)a3 = v2;
    if ((unsigned int)*(int *)a1 <= (unsigned int)*(int *)a2)
        return;
    v3 = *(long long *)a1;
    *(long long *)a1 = *(long long *)a2;
    *(unsigned long *)a2 = v3;
    if ((unsigned int)*(int *)a0 <= (unsigned int)*(int *)a1)
        return;
    v4 = *(long long *)a0;
    *(long long *)a0 = *(long long *)a1;
    *(unsigned long *)a1 = v4;
    return;
}

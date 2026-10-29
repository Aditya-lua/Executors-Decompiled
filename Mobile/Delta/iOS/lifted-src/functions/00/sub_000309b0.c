/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x309b0..0x30a74 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

void sub_309b0(void* a0, void* a1, void* a2, void* a3, void* a4, unsigned long a5)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x8
    unsigned long v4;  // x8
    unsigned long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_2b37c();
    if ((unsigned int)*(int *)a3 <= (unsigned int)*(int *)a4)
        return;
    v2 = *(long long *)a3;
    *(long long *)a3 = *(long long *)a4;
    *(unsigned long *)a4 = v2;
    if ((unsigned int)*(int *)a2 <= (unsigned int)*(int *)a3)
        return;
    v3 = *(long long *)a2;
    *(long long *)a2 = *(long long *)a3;
    *(unsigned long *)a3 = v3;
    if ((unsigned int)*(int *)a1 <= (unsigned int)*(int *)a2)
        return;
    v4 = *(long long *)a1;
    *(long long *)a1 = *(long long *)a2;
    *(unsigned long *)a2 = v4;
    if ((unsigned int)*(int *)a0 <= (unsigned int)*(int *)a1)
        return;
    v5 = *(long long *)a0;
    *(long long *)a0 = *(long long *)a1;
    *(unsigned long *)a1 = v5;
    return;
}

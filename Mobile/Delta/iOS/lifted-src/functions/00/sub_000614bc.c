/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x614bc..0x614fc (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_614bc(unsigned long long *a0)
{
    long long *v2;  // x8
    long long v3;  // x0
    long long count;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *v2 = 0;
    v2[1] = 0;
    v3 = a0[1];
    if (!v3)
        return v3;
    count = std::__1::__shared_weak_count::lock(v3);
    v2[1] = count;
    if (!count)
        return count;
    *v2 = *a0;
    return count;
}

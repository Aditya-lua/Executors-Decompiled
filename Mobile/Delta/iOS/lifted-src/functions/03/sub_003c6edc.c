/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6edc..0x3c6f40 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3c6edc(long long *a0)
{
    long long *count;  // x0
    unsigned long v4;  // x1
    long long *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    count = std::__1::__thread_local_data();
    v4 = *a0;
    *a0 = 0;
    _pthread_setspecific(*count, v4);
    sub_3c6f40(a0[1]);
    sub_3c708c(&v0);
    return 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6a68..0x3c6adc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3c6a68(long long a0, unsigned long a1)
{
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    if (!a1)
        return a0;
    std::__1::mutex::lock();
    sub_3c68a4(a0 + 112, &v0);
    std::__1::mutex::unlock(a0);
    return std::__1::condition_variable::notify_one(a0 + 64);
}

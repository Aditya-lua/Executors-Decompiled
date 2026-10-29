/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x961b9c..0x961bfc (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_961b9c(long long a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9705d4(a1);
    if (v2)
        return v2;
    sub_a36c8c();
    v4 = sub_a40ca8(a0, sub_a9976c(a1), a2);
    sub_a36cd4(v4, sub_a9976c(a1), a2);
    return v4;
}

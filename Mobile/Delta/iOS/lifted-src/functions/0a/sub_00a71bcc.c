/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71bcc..0xa71c3c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a71bcc(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a36c8c();
    v2 = sub_a71698(a0, a1, 0, 6);
    sub_a36cd4(v2, a1, 0, 6);
    if ((unsigned int)v2)
        return 1;
}

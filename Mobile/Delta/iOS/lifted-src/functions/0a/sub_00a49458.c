/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa49458..0xa494b4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a49458(long long a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x0
    unsigned int *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    v3 = sub_a50904(a0);
    v4 = sub_9ffdd8(a0);
    sub_aaa3dc(v2 + 4, v3, a1, *v4);
    return 1;
}

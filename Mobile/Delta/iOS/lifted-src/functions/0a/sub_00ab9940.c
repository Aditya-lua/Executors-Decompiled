/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab9940..0xab997c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab9940(long long a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e5c70();
    if (!(unsigned int)v2)
        return v2;
    return (int)sub_9e5528(a0, sub_9e4624()) > 0;
}

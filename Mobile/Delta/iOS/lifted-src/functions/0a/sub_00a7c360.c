/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7c360..0xa7c3a8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a7c360(void)
{
    unsigned long long uid;  // x0
    unsigned long long gid;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    uid = _getuid();
    if ((unsigned int)uid != _geteuid(uid))
        return 1;
    gid = _getgid();
    return (unsigned int)gid != _getegid(gid);
}

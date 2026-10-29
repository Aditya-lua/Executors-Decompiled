/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34084..0xa340fc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b8;

long long sub_a34084(unsigned long a0, long long a1)
{
    long long v3;  // x0
    long long v4;  // x20
    long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    _fprintf(*(long long *)&g_10002b8, "(TEST_ENG_OPENSSL_PKEY)Loading Private key %s\n");
    v3 = sub_9d8180(a1, "r");
    if (!v3)
        return v3;
    v4 = sub_a9e438();
    sub_9d3c28(v3);
    return v4;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa32950..0xa329e4 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a329e4;

long long sub_a32950(long long a0, long long a1)
{
    long long v0;  // [bp-0x30]
    unsigned int v1;  // [bp-0x24]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!sub_9f5c88(a1, 44, 1, &g_a329e4, &v1))
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_fat.c", 86, "ENGINE_set_default_string");
        v0 = a1;
        sub_a36abc(38, 150, "str=%s");
        return 0;
    }
    return sub_a3289c(a0, v1);
}

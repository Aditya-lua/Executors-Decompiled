/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34284..0xa3431c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b8;

unsigned long long sub_a34284(long long a0, long long a1)
{
    unsigned long long v2;  // x19
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a50904();
    _fwrite("(TEST_ENG_OPENSSL_RC4) test_init_key() called\n", 46, 1, *(long long *)&g_10002b8);
    if ((int)v2 < 1)
        return v2;
    _memcpy(sub_9ffdd8(a0), a1, v2 & 0xffffffff);
    v4 = sub_9ffdd8(a0);
    sub_aaabf4(v4 + 16, v2, sub_9ffdd8(a0));
    return 1;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2fe74..0xb2ff78 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_b2fe74(void* ptr)
{
    long long v8;  // x20
    long long v9;  // x0
    unsigned long long v10;  // x0
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = *(long long *)ptr;
    sub_afe028(ptr + 48);
    sub_a6c2e4((long long)ptr[24], "providers/implementations/kdfs/pbkdf2.c", 99);
    sub_a6c4e8((long long)ptr[8], (long long)ptr[16], "providers/implementations/kdfs/pbkdf2.c", 101);
    memset(ptr, 0, 80);
    *(long long *)ptr = v8;
    v3 = 0;
    v4 = 0;
    v1 = 0;
    v2 = 0;
    v0 = 0;
    v9 = sub_9f2aec(v8);
    sub_a71618("digest", "SHA1", 0);
    v10 = sub_afe114(ptr + 48, &v0, v9);
    if (!(unsigned int)v10)
        v10 = sub_afe028(ptr + 48);
    *(unsigned long long *)&ptr[40] = 0x800;
    *(unsigned int *)&ptr[72] = 0;
    if (*(long long *)&g_10002b0 == v5)
        return v10;
    ___stack_chk_fail();
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50df4..0xa50ec8 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a50df4(char a0, char a1)
{
    unsigned long long v8;  // x0
    char v0;  // [bp-0x80]
    char v1;  // [bp-0x70]
    char v2;  // [bp-0x60]
    char v3;  // [bp-0x50]
    char v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v3 = 0;
    v4 = 0;
    v1 = 0;
    v2 = 0;
    v0 = 0;
    if (!a0 || !(*(char *)a0 & 6))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_lib.c", 1154, "EVP_PKEY_CTX_set_group_name");
        sub_a36abc(6, 147, 0);
        v8 = 0xfffffffe;
    }
    else if (a1)
    {
        sub_a71618("group");
        v8 = sub_a5db1c(a0, &v0);
    }
    else
    {
        v8 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}

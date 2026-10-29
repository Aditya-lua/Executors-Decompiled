/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5e14..0x9f5e84 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f127c0;
extern unsigned int g_f127d4;

int sub_9f5e14(void)
{
    long long v2;  // w19
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 1;
    v3 = sub_a7bf38(1, 0);
    g_f127c0 = v3;
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_mod.c", 104, "do_init_module_list_lock");
        v3 = sub_a36abc(14, 0x8000f, 0);
        v2 = 0;
    }
    g_f127d4 = v2;
    return v3;
}

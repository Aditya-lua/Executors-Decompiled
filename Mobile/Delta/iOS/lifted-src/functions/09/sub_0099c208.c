/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c208..0x99c268 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_99c208(long long a0, unsigned int a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 != 0x800)
    {
        return 1;
    }
    else if (!a2)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions.c", 1304, "final_supported_versions");
        sub_9a58a4(a0, 109, 420, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}

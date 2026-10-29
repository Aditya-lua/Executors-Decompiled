/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd7cc..0xafd898 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_afd7cc(unsigned long a0, long long a1, unsigned long long *a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a6e200(a1, "TLS-GROUP"))
        a2();
    if (sub_a6e200(a1, "TLS-SIGALG"))
        return 0;
    a2();
}

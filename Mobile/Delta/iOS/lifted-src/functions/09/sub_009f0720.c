/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f0720..0x9f0780 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f0d568;

void sub_9f0720(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long *a4)
{
    unsigned long long v5;  // x30
    unsigned long v0;  // [bp-0x20]
    unsigned long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a2)
        goto LABEL_0x9f0670;
    if (a2 < 192)
        goto LABEL_0x9f0398;
    if (!(g_f0d568 & 0x2000))
        goto LABEL_0x9f0390;
    v2 = &v4;
    v3 = v5;
    v0 = *a4;
    v1 = a4[1];
    10414176();
    if (!a2)
        return;
    sub_9f0380();
    return;
}

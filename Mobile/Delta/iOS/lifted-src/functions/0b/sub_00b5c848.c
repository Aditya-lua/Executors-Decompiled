/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c848..0xb5c91c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5c848(unsigned long long a0, int a1, unsigned long a2, unsigned long long *a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a1 > 769)
    {
        if ((unsigned int)(a1 - 770) < 2)
            goto LABEL_b5c8ac;
        if (a1 == 65277)
            goto LABEL_b5c8ac;
        if (a1 == 0xfeff)
            goto LABEL_b5c8ac;
LABEL_b5c8e8:
        return 0;
    }
    switch (a1)
    {
    case 256:
LABEL_b5c8ac:
        *a3 = *a3 - a4;
        break;
    case 769:
        break;
    default:
        goto LABEL_b5c8e8;
    }
    v0 = a0;
    return sub_b5ee0c(a3);
}

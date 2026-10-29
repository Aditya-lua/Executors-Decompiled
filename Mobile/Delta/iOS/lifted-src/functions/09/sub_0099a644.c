/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a644..0x99a6d4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_99a644(unsigned int *a0)
{
    long long count;  // x0
    long long v5;  // w0
    char v0;  // [bp-0x38]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    do
    {
        do
        {
            count = _read(*a0, &v0, 16);
        } while (count == 16);
        if (count >= 0)
            goto LABEL_99a6a4;
    } while (*(int *)___error() == 4);
    v5 = (unsigned int)sub_9d8140(*(int *)___error());
    if (v5)
    {
LABEL_99a6a4:
        v5 = 1;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}

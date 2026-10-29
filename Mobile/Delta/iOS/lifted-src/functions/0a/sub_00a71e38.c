/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71e38..0xa71ea0 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a71e38(char *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long *v8;  // x9
    unsigned long long *v9;  // x9
    unsigned long long *v10;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0 - 16;
    do
    {
        v9 = v8;
        v10 = v9 + 5;
        v8 = v10;
    } while (v9[2]);
    if (*(int *)((char *)v10 - 16) == 127)
        sub_a6d4c0(*(long long *)((char *)v10 - 8), *v10, "crypto/params_dup.c", 233);
}

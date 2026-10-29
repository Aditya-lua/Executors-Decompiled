/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24ec8..0x24f18 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_24ec8(unsigned long a0, unsigned long a1, void* a2, unsigned long a3, void* a4)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a2 == a4)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    (*(long long *)*(long long *)((char *)a2 - 48))();
}

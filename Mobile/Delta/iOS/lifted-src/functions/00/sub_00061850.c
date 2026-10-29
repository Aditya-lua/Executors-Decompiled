/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61850..0x618bc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_61850(unsigned int a0, unsigned int a1, unsigned int a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w21
    unsigned int v13;  // w19
    unsigned int v14;  // w8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a2;
    v13 = a1;
    if (25 >= a0)
    {
        _exp2();
        v14 = (unsigned int)((double)a0 * 100.0);
    }
    else
    {
        v14 = 0;
    }
    if (v12 >= v14)
        v14 = v12;
    if (v14 >= v13)
        v14 = v13;
    if (25 >= a0)
        return v14;
    return v13;
}

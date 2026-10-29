/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ed06c..0x9ed0d0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ed06c_0 {
    char padding_0[272];
    unsigned int field_110;
} st_9ed06c_0;


st_9ed06c_0 * sub_9ed06c(st_9ed06c_0 *a0, unsigned long long a1, st_9ed06c_0 *a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return 0xffffffff;
    }
    else if (a2)
    {
        if ((unsigned int)a1 != 128 && (unsigned int)a1 != 0x100 && (unsigned int)a1 != 192)
            return 0xfffffffe;
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        a2->field_110 = sub_9ec168(a1, a0);
        return 0;
    }
    else
    {
        return 0xffffffff;
    }
}

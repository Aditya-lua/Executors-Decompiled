/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5458..0xaa54b0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa5458(void* a0, void* a1)
{
    unsigned long v2;  // x0
    unsigned long v3;  // x8
    unsigned long v4;  // x9
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned int v7;  // w8
    unsigned long long v8;  // 4107
    unsigned long long v9;  // 4107
    unsigned long v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = _strcmp((long long)a0[8], (long long)a1[8]);
    if ((unsigned int)v2)
        return v2;
    v3 = *(long long *)a0;
    if (!v3)
        return 0;
    v4 = *(long long *)a1;
    v5 = v4;
    v6 = v3;
    if (v3 <= v4)
    {
        v7 = 0;
        v8 = arm64g_calculate_condition(148, v5, v6, 0);
        if (!(v8 & 1))
            goto LABEL_aa5492;
LABEL_aa5491:
    }
    else
    {
        v7 = 0xffffffff;
        v9 = arm64g_calculate_condition(148, v5, v6, 0);
        if (v9 & 1)
            goto LABEL_aa5491;
LABEL_aa5492:
        v7 = 1;
    }
    if (!v4)
        v10 = 0;
    else
        v10 = v7;
    return v10;
}

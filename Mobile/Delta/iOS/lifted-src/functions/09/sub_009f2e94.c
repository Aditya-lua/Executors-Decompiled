/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2e94..0x9f2efc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2e94_0 {
    long long field_0;
    unsigned long long field_8;
} st_9f2e94_0;


unsigned long long sub_9f2e94(st_9f2e94_0 *a0, st_9f2e94_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 != a1->field_0)
    {
        v2 = _strcmp(a0->field_0, a1->field_0);
        if ((unsigned int)v2)
            return v2;
    }
    if (a0->field_8)
    {
        if (a1->field_8)
            return _strcmp();
        v3 = 1;
    }
    else
    {
        v3 = 0xffffffff;
    }
    if (a0->field_8 != a1->field_8)
        return v3;
    return 0;
}

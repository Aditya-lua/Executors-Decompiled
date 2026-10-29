/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95cef0..0x95cfc0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95cef0_0 {
    unsigned int field_0;
    char padding_4[20];
    long long field_18;
} st_95cef0_0;


unsigned long long sub_95cef0(st_95cef0_0 *a0, long long a1)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (v2 >> 1 & 1)
    {
        if (!sub_a6e200(a1, "+automatic"))
        {
            return 1;
        }
        else if (sub_a6e200(a1, "automatic"))
        {
            v2 = a0->field_0;
        }
        else
        {
            return 1;
        }
    }
    if (v2 & 1 && !_strcmp(a1, "auto"))
        return 1;
    if (_strchr(a1, 58))
        return 0;
    if (a0->field_18)
    {
        v3 = (unsigned int)sub_960f58(a0->field_18, 92, 0, a1);
    }
    else if (*(long long *)&a0[1].field_0)
    {
        v3 = (unsigned int)sub_95f0c4(*(long long *)&a0[1].field_0, 92, 0, a1);
    }
    else
    {
        v3 = 1;
    }
    return v3 > 0;
}

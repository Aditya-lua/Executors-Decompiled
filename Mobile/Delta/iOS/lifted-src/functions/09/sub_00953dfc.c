/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953dfc..0x953f20 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953dfc_1 {
    char padding_0[1264];
    struct st_953dfc_0 *field_4f0;
} st_953dfc_1;

typedef struct st_953dfc_0 {
    char padding_0[296];
    unsigned long long field_128;
    long long field_130;
} st_953dfc_0;


unsigned long long sub_953dfc(st_953dfc_1 *a0)
{
    unsigned int v2;  // w0
    st_953dfc_0 *v3;  // x8
    long long v4;  // x20
    unsigned long long v5;  // x0
    unsigned int v6;  // w0
    long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_4f0->field_128)
    {
        v2 = sub_9d46fc(sub_95f8bc(a0), 49, 0, 0);
        v3 = a0->field_4f0;
        v4 = a0->field_4f0->field_128 - v2;
        v3->field_128 = 0;
        v3->field_130 = v4;
    }
    else
    {
        v4 = a0->field_4f0->field_130;
    }
    if (0x100 - (sub_9d46fc(sub_95f8bc(a0), 49, 0, 0) & 0xffffffff) > (unsigned long long)v4)
    {
        if (!(sub_962ef0(a0) >> 12 & 1))
        {
            v5 = sub_9d46fc(sub_95f8bc(a0), 40, 0, 0);
            a0->field_4f0->field_130 = v5;
            if (0x100 - (sub_9d46fc(sub_95f8bc(a0), 49, 0, 0) & 0xffffffff) > v5)
            {
                v6 = sub_9d46fc(sub_95f8bc(a0), 49, 0, 0);
                a0->field_4f0->field_130 = 0x100 - v6;
                v7 = sub_95f8bc(a0);
                sub_9d46fc(v7, 42, a0->field_4f0->field_130, 0);
            }
        }
        else
        {
            return 0;
        }
    }
    return 1;
}

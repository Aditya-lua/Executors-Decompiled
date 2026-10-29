/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998dd4..0x998e84 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_998dd4_0 {
    char padding_0[20];
    int field_14;
} st_998dd4_0;


unsigned long long sub_998dd4(st_998dd4_0 *a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long long *a4)
{
    int v2;  // w8
    unsigned long long v3;  // x8
    unsigned long long v4;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)&a0[183].padding_0[16] && *(long long *)&a0[172].padding_0[0] && sub_a2cf88(sub_a2d030(*(long long *)&a0[172].padding_0[0])) >> 23 & 1)
    {
        v2 = a0->field_14;
        if (65276 >= v2)
        {
            if ((unsigned int)(v2 - 770) < 2 || v2 == 0x100)
                goto LABEL_998e4c;
        }
        else
        {
            if (v2 == 0xfeff || v2 == 65277)
            {
LABEL_998e4c:
                if (a2)
                {
                    v3 = (a2 - 1) / *a4;
                    v4 = *(long long *)&a0[183].padding_0[16];
                    if ((unsigned long long)*(long long *)&a0[183].padding_0[16] > v3 + 1)
                        v4 = v3 + 1;
                    return v4;
                }
            }
        }
    }
    return 1;
}
